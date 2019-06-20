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
	awsMod = "aws"
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(datadogPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

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
		Config: map[string]*tfbridge.SchemaInfo{
			"api_key": {
				Type: makeType("api_key", "ApiKey"),
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"DATADOG_API_KEY"},
				},
			},
			"app_key": {
				Type: makeType("app_key", "AppKey"),
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"DATADOG_APP_KEY"},
				},
			},
			"api_url": {
				Type: makeType("api_url", "ApiUrl"),
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"DATADOG_HOST"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"datadog_downtime": {
				Tok: makeResource(datadogPkg, "Downtime"),
			},
			"datadog_metric_metadata": {
				Tok: makeResource(datadogPkg, "MetricMetadata"),
			},
			"datadog_monitor": {
				Tok: makeResource(datadogPkg, "Monitor"),
			},
			"datadog_timeboard": {
				Tok: makeResource(datadogPkg, "TimeBoard"),
			},
			"datadog_screenboard": {
				Tok: makeResource(datadogPkg, "ScreenBoard"),
			},
			"datadog_user": {
				Tok: makeResource(datadogPkg, "User"),
			},
			"datadog_synthetics_test": {
				Tok: makeResource(datadogPkg, "SyntheticsTest"),
			},
			"datadog_integration_gcp": {
				Tok: makeResource(gcpMod, "Integration"),
			},
			"datadog_integration_aws": {
				Tok: makeResource(awsMod, "Integration"),
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "latest",
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
