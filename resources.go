package datadog

import (
	"unicode"

	"github.com/hashicorp/terraform/helper/schema"
	"github.com/pulumi/pulumi-terraform/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/tokens"
	"github.com/terraform-providers/terraform-provider-datadog/datadog"
)

const (
	// packages:
	datadogPkg = "datadog"
	// modules:
	gcpMod = "gcp"
)

func Provider() tfbridge.ProviderInfo {
	p := datadog.Provider().(*schema.Provider)
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "datadog",
		Description: "A Pulumi package for creating and managing Datadog resources.",
		Keywords:    []string{"pulumi", "datadog"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-datadog",
		Config:      map[string]*tfbridge.SchemaInfo{},
		Resources: map[string]*tfbridge.ResourceInfo{
			"datadog_downtime": {
				Tok: datadogResource("Downtime"),
			},
			"datadog_metric_metadata": {
				Tok: datadogResource("MetricMetadata"),
			},
			"datadog_monitor": {
				Tok: datadogResource("Monitor"),
			},
			"datadog_timeboard": {
				Tok: datadogResource("TimeBoard"),
			},
			"datadog_screenboard": {
				Tok: datadogResource("ScreenBoard"),
			},
			"datadog_user": {
				Tok: datadogResource("User"),
			},
			"datadog_integration_gcp": {
				Tok: datadogModResource(gcpMod, "Integration"),
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^0.16.4",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=0.16.4,<0.17.0",
			},
		},
	}

	return prov
}

// datadogMember manufactures a type token for the Datadog package and the given module and type.
func datadogMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(datadogPkg + ":" + mod + ":" + mem)
}

// datadogType manufactures a type token for the Datadog package and the given module and type.
func datadogType(mod string, typ string) tokens.Type {
	return tokens.Type(datadogMember(mod, typ))
}

// datadogResource manufactures a standard resource token given a module and resource name. It
// automatically uses the Datadog package and names the file by simply lower casing the resource's
// first character.
func datadogResource(res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return datadogType(fn, res)
}

func datadogModResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return datadogType(mod+"/"+fn, res)
}
