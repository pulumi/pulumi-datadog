package datadog

import (
	"encoding/json"
	"os"
	"strings"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/codegen/schema"
	"github.com/stretchr/testify/require"
)

func TestRerollRecursiveTypesOverlappingSuffixes(t *testing.T) {
	for _, prefix := range []string{"DashboardV2Widget", "PowerpackV2Widget"} {
		t.Run(prefix, func(t *testing.T) {
			token := func(name string) string { return (recType{prefix: prefix, suffix: name}).canonical() }
			ref := func(name string) schema.PropertySpec {
				return schema.PropertySpec{TypeSpec: schema.TypeSpec{Ref: "#/types/" + token(name)}}
			}
			object := func(props map[string]schema.PropertySpec) schema.ComplexTypeSpec {
				return schema.ComplexTypeSpec{ObjectTypeSpec: schema.ObjectTypeSpec{Type: "object", Properties: props}}
			}
			funnel := object(map[string]schema.PropertySpec{
				"title": {TypeSpec: schema.TypeSpec{Type: "string"}},
			})
			analytics := object(map[string]schema.PropertySpec{
				"query": {TypeSpec: schema.TypeSpec{Type: "string"}},
			})
			spec := schema.PackageSpec{Types: map[string]schema.ComplexTypeSpec{
				token("FunnelDefinition"):                                      funnel,
				token("ProductAnalyticsFunnelDefinition"):                      analytics,
				token("GroupDefinitionWidgetFunnelDefinition"):                 funnel,
				token("GroupDefinitionWidgetProductAnalyticsFunnelDefinition"): analytics,
				token("GroupDefinition"): object(map[string]schema.PropertySpec{
					"funnel":    ref("GroupDefinitionWidgetFunnelDefinition"),
					"analytics": ref("GroupDefinitionWidgetProductAnalyticsFunnelDefinition"),
				}),
			}}
			spec.Resources = map[string]schema.ResourceSpec{
				"datadog:index/test:Test": {
					InputProperties: map[string]schema.PropertySpec{
						"funnel": ref("GroupDefinitionWidgetFunnelDefinition"),
					},
					ObjectTypeSpec: schema.ObjectTypeSpec{Properties: map[string]schema.PropertySpec{
						"analytics": ref("GroupDefinitionWidgetProductAnalyticsFunnelDefinition"),
					}},
				},
			}
			spec.Functions = map[string]schema.FunctionSpec{
				"datadog:index/getTest:getTest": {
					Outputs: &schema.ObjectTypeSpec{Properties: map[string]schema.PropertySpec{
						"analytics": ref("GroupDefinitionWidgetProductAnalyticsFunnelDefinition"),
					}},
				},
			}
			// Deliberately put the shorter suffix first.
			rerollRecursiveTypes(&spec, []recType{
				{prefix, "FunnelDefinition"}, {prefix, "ProductAnalyticsFunnelDefinition"},
			})
			require.Len(t, spec.Types, 3)
			require.Equal(t, funnel, spec.Types[token("FunnelDefinition")])
			require.Equal(t, analytics, spec.Types[token("ProductAnalyticsFunnelDefinition")])
			group := spec.Types[token("GroupDefinition")]
			require.Equal(t, ref("FunnelDefinition"), group.Properties["funnel"])
			require.Equal(t, ref("ProductAnalyticsFunnelDefinition"), group.Properties["analytics"])
			resource := spec.Resources["datadog:index/test:Test"]
			require.Equal(t, ref("FunnelDefinition"), resource.InputProperties["funnel"])
			require.Equal(t, ref("ProductAnalyticsFunnelDefinition"), resource.Properties["analytics"])
			require.Equal(t, ref("ProductAnalyticsFunnelDefinition"),
				spec.Functions["datadog:index/getTest:getTest"].Outputs.Properties["analytics"])
		})
	}
}

func TestRerollRecursiveTypesRejectsIncompatibleShapes(t *testing.T) {
	root := recType{"DashboardV2Widget", "RetentionQuery"}
	nested := recType{"DashboardV2WidgetChangeDefinitionRequestQuery", "RetentionQuery"}
	spec := schema.PackageSpec{Types: map[string]schema.ComplexTypeSpec{
		root.canonical(): {ObjectTypeSpec: schema.ObjectTypeSpec{Type: "object"}},
		nested.canonical(): {ObjectTypeSpec: schema.ObjectTypeSpec{
			Type: "object",
			Properties: map[string]schema.PropertySpec{
				"extra": {TypeSpec: schema.TypeSpec{Type: "string"}},
			},
		}},
	}}
	require.Panics(t, func() { rerollRecursiveTypes(&spec, []recType{root}) })
	require.Len(t, spec.Types, 2, "validation must precede deletion")
}

func TestDashboardSchema(t *testing.T) {
	data, err := os.ReadFile("cmd/pulumi-resource-datadog/schema.json")
	require.NoError(t, err)
	var spec schema.PackageSpec
	require.NoError(t, json.Unmarshal(data, &spec))
	// Binding validates references, including references to children removed by rerolling.
	_, err = schema.ImportSpec(spec, nil, schema.NewNullLoader(), schema.ValidationOptions{})
	require.NoError(t, err)
	for _, prefix := range []string{"DashboardV2Widget", "PowerpackV2Widget"} {
		count := 0
		for token := range spec.Types {
			if strings.HasPrefix(token, "datadog:index/"+prefix) {
				count++
			}
		}
		// Leave room for new widgets, but catch a return to thousands of path-specific types.
		require.Less(t, count, 1000, "%s type count", prefix)
		for _, suffix := range []string{
			"FunnelDefinition", "ProductAnalyticsFunnelDefinition",
			"ApmMetricsQuery", "ProductAnalyticsExtendedQuery", "RetentionQuery", "UserJourneyQuery",
		} {
			require.Contains(t, spec.Types, (recType{prefix, suffix}).canonical())
		}
	}
}
