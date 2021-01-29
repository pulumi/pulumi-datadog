package datadog

import (
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-datadog/provider/v2/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
	"github.com/terraform-providers/terraform-provider-datadog/datadog"
)

const (
	// packages:
	datadogPkg = "datadog"
	// modules:
	datadogMod = "index"
	gcpMod     = "Gcp"
	awsMod     = "Aws"
	azureMod   = "Azure"
	pdMod      = "PagerDuty"
)

var namespaceMap = map[string]string{
	datadogPkg: "Datadog",
}

// makeMember manufactures a type token for the package and the given module and type.  It automatically
// uses the Datadog package and names the file by simply lower casing the resource's first character.
func makeMember(moduleTitle string, mem string) tokens.ModuleMember {
	moduleName := strings.ToLower(moduleTitle)
	namespaceMap[moduleName] = moduleTitle
	fn := string(unicode.ToLower(rune(mem[0]))) + mem[1:]
	token := moduleName + "/" + fn
	return tokens.ModuleMember(datadogPkg + ":" + token + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeResource manufactures a standard resource token given a module and resource name.
func makeResource(mod string, res string) tokens.Type {
	return makeType(mod, res)
}

func makeDataSource(mod string, res string) tokens.ModuleMember {
	return makeMember(mod, res)
}

func Provider() tfbridge.ProviderInfo {
	p := shimv1.NewProvider(datadog.Provider().(*schema.Provider))
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "datadog",
		Description: "A Pulumi package for creating and managing Datadog resources.",
		Keywords:    []string{"pulumi", "datadog"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		//GitHubOrg:   "DataDog",
		Repository: "https://github.com/pulumi/pulumi-datadog",
		Config: map[string]*tfbridge.SchemaInfo{
			"api_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"DATADOG_API_KEY"},
				},
			},
			"app_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"DATADOG_APP_KEY"},
				},
			},
			"api_url": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"DATADOG_HOST"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"datadog_dashboard":       {Tok: makeResource(datadogMod, "Dashboard")},
			"datadog_downtime":        {Tok: makeResource(datadogMod, "Downtime")},
			"datadog_metric_metadata": {Tok: makeResource(datadogMod, "MetricMetadata")},
			"datadog_monitor":         {Tok: makeResource(datadogMod, "Monitor")},
			"datadog_timeboard":       {Tok: makeResource(datadogMod, "TimeBoard")},
			"datadog_screenboard":     {Tok: makeResource(datadogMod, "ScreenBoard")},
			"datadog_user":            {Tok: makeResource(datadogMod, "User")},
			"datadog_synthetics_test": {
				Tok: makeResource(datadogMod, "SyntheticsTest"),
				Docs: &tfbridge.DocInfo{
					Source: "synthetics.html.markdown",
				},
			},
			"datadog_synthetics_global_variable":  {Tok: makeResource(datadogMod, "SyntheticsGlobalVariable")},
			"datadog_dashboard_list":              {Tok: makeResource(datadogMod, "DashboardList")},
			"datadog_service_level_objective":     {Tok: makeResource(datadogMod, "ServiceLevelObjective")},
			"datadog_logs_custom_pipeline":        {Tok: makeResource(datadogMod, "LogsCustomPipeline")},
			"datadog_logs_index":                  {Tok: makeResource(datadogMod, "LogsIndex")},
			"datadog_logs_metric":                 {Tok: makeResource(datadogMod, "LogsMetric")},
			"datadog_logs_archive":                {Tok: makeResource(datadogMod, "LogsArchive")},
			"datadog_logs_index_order":            {Tok: makeResource(datadogMod, "LogsIndexOrder")},
			"datadog_logs_integration_pipeline":   {Tok: makeResource(datadogMod, "LogsIntegrationPipeline")},
			"datadog_logs_pipeline_order":         {Tok: makeResource(datadogMod, "LogsPipelineOrder")},
			"datadog_logs_archive_order":          {Tok: makeResource(datadogMod, "LogsArchiveOrder")},
			"datadog_role":                        {Tok: makeResource(datadogMod, "Role")},
			"datadog_security_monitoring_rule":    {Tok: makeResource(datadogMod, "SecurityMonitoringRule")},
			"datadog_synthetics_private_location": {Tok: makeResource(datadogMod, "SyntheticsPrivateLocation")},

			// GCP Integrations
			"datadog_integration_gcp": {Tok: makeResource(gcpMod, "Integration")},

			// Azure Integrations
			"datadog_integration_azure": {Tok: makeResource(azureMod, "Integration")},

			// AWS Integrations
			"datadog_integration_aws":                {Tok: makeResource(awsMod, "Integration")},
			"datadog_integration_aws_lambda_arn":     {Tok: makeResource(awsMod, "IntegrationLambdaArn")},
			"datadog_integration_aws_log_collection": {Tok: makeResource(awsMod, "IntegrationLogCollection")},

			// PagerDuty Integrations
			"datadog_integration_pagerduty":                {Tok: makeResource(pdMod, "Integration")},
			"datadog_integration_pagerduty_service_object": {Tok: makeResource(pdMod, "ServiceObject")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"datadog_ip_ranges": {
				Tok: makeDataSource(datadogMod, "getIpRanges"),
			},
			"datadog_monitor": {
				Tok: makeDataSource(datadogMod, "getMonitor"),
			},
			"datadog_dashboard_list":            {Tok: makeDataSource(datadogMod, "getDashboardList")},
			"datadog_dashboard":                 {Tok: makeDataSource(datadogMod, "getDashboard")},
			"datadog_synthetics_locations":      {Tok: makeDataSource(datadogMod, "getSyntheticsLocations")},
			"datadog_permissions":               {Tok: makeDataSource(datadogMod, "getPermissions")},
			"datadog_role":                      {Tok: makeDataSource(datadogMod, "getRole")},
			"datadog_security_monitoring_rules": {Tok: makeDataSource(datadogMod, "getSecurityMonitoringRules")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^2.15.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", datadogPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				datadogPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=2.15.0,<3.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "2.*",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: namespaceMap,
		},
	}

	return prov
}
