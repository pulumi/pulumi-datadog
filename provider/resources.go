package datadog

import (
	// Allow embedding files
	"context"
	_ "embed"
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	"github.com/pulumi/pulumi-datadog/provider/v4/pkg/version"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/x"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
	"github.com/terraform-providers/terraform-provider-datadog/datadog"
	"github.com/terraform-providers/terraform-provider-datadog/datadog/fwprovider"
)

const (
	// packages:
	datadogPkg = "datadog"
	// modules:
	datadogMod  = "index"
	gcpMod      = "Gcp"
	awsMod      = "Aws"
	azureMod    = "Azure"
	pdMod       = "PagerDuty"
	slackMod    = "Slack"
	opsGenieMod = "OpsGenie"
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

//go:embed cmd/pulumi-resource-datadog/bridge-metadata.json
var metadata []byte

func Provider() tfbridge.ProviderInfo {
	p := pfbridge.MuxShimWithPF(context.Background(),
		shimv2.NewProvider(datadog.Provider()),
		fwprovider.New(),
	)
	prov := tfbridge.ProviderInfo{
		P:            p,
		Name:         "datadog",
		Description:  "A Pulumi package for creating and managing Datadog resources.",
		Keywords:     []string{"pulumi", "datadog"},
		License:      "Apache-2.0",
		Homepage:     "https://pulumi.io",
		Repository:   "https://github.com/pulumi/pulumi-datadog",
		Config:       map[string]*tfbridge.SchemaInfo{},
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		Version:      version.Version,
		Resources: map[string]*tfbridge.ResourceInfo{
			"datadog_dashboard":                  {Tok: makeResource(datadogMod, "Dashboard")},
			"datadog_downtime":                   {Tok: makeResource(datadogMod, "Downtime")},
			"datadog_metric_metadata":            {Tok: makeResource(datadogMod, "MetricMetadata")},
			"datadog_monitor":                    {Tok: makeResource(datadogMod, "Monitor")},
			"datadog_user":                       {Tok: makeResource(datadogMod, "User")},
			"datadog_synthetics_test":            {Tok: makeResource(datadogMod, "SyntheticsTest")},
			"datadog_synthetics_global_variable": {Tok: makeResource(datadogMod, "SyntheticsGlobalVariable")},
			"datadog_dashboard_list":             {Tok: makeResource(datadogMod, "DashboardList")},
			"datadog_service_level_objective":    {Tok: makeResource(datadogMod, "ServiceLevelObjective")},
			"datadog_logs_custom_pipeline":       {Tok: makeResource(datadogMod, "LogsCustomPipeline")},
			"datadog_logs_index": {
				Tok: makeResource(datadogMod, "LogsIndex"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"filter": {
						Name:        "filters",
						MaxItemsOne: tfbridge.False(),
					},
				},
			},
			"datadog_logs_metric":                        {Tok: makeResource(datadogMod, "LogsMetric")},
			"datadog_logs_archive":                       {Tok: makeResource(datadogMod, "LogsArchive")},
			"datadog_logs_index_order":                   {Tok: makeResource(datadogMod, "LogsIndexOrder")},
			"datadog_logs_integration_pipeline":          {Tok: makeResource(datadogMod, "LogsIntegrationPipeline")},
			"datadog_logs_pipeline_order":                {Tok: makeResource(datadogMod, "LogsPipelineOrder")},
			"datadog_logs_archive_order":                 {Tok: makeResource(datadogMod, "LogsArchiveOrder")},
			"datadog_role":                               {Tok: makeResource(datadogMod, "Role")},
			"datadog_security_monitoring_rule":           {Tok: makeResource(datadogMod, "SecurityMonitoringRule")},
			"datadog_security_monitoring_default_rule":   {Tok: makeResource(datadogMod, "SecurityMonitoringDefaultRule")},
			"datadog_synthetics_private_location":        {Tok: makeResource(datadogMod, "SyntheticsPrivateLocation")},
			"datadog_dashboard_json":                     {Tok: makeResource(datadogMod, "DashboardJson")},
			"datadog_metric_tag_configuration":           {Tok: makeResource(datadogMod, "MetricTagConfiguration")},
			"datadog_slo_correction":                     {Tok: makeResource(datadogMod, "SloCorrection")},
			"datadog_api_key":                            {Tok: makeResource(datadogMod, "ApiKey")},
			"datadog_application_key":                    {Tok: makeResource(datadogMod, "ApplicationKey")},
			"datadog_child_organization":                 {Tok: makeResource(datadogMod, "ChildOrganization")},
			"datadog_organization_settings":              {Tok: makeResource(datadogMod, "OrganizationSettings")},
			"datadog_security_monitoring_filter":         {Tok: makeResource(datadogMod, "SecurityMonitoringFilter")},
			"datadog_monitor_json":                       {Tok: makeResource(datadogMod, "MonitorJson")},
			"datadog_webhook":                            {Tok: makeResource(datadogMod, "Webhook")},
			"datadog_webhook_custom_variable":            {Tok: makeResource(datadogMod, "WebhookCustomVariable")},
			"datadog_authn_mapping":                      {Tok: makeResource(datadogMod, "AuthnMapping")},
			"datadog_cloud_workload_security_agent_rule": {Tok: makeResource(datadogMod, "CloudWorkloadSecurityAgentRule")},
			"datadog_rum_application":                    {Tok: makeResource(datadogMod, "RumApplication")},
			"datadog_service_definition_yaml":            {Tok: makeResource(datadogMod, "ServiceDefinitionYaml")},

			// GCP Integrations
			"datadog_integration_gcp": {Tok: makeResource(gcpMod, "Integration")},

			// Azure Integrations
			"datadog_integration_azure": {Tok: makeResource(azureMod, "Integration")},

			// AWS Integrations
			"datadog_integration_aws":                {Tok: makeResource(awsMod, "Integration")},
			"datadog_integration_aws_tag_filter":     {Tok: makeResource(awsMod, "IntegrationTagFilter")},
			"datadog_integration_aws_lambda_arn":     {Tok: makeResource(awsMod, "IntegrationLambdaArn")},
			"datadog_integration_aws_log_collection": {Tok: makeResource(awsMod, "IntegrationLogCollection")},

			// PagerDuty Integrations
			"datadog_integration_pagerduty":                {Tok: makeResource(pdMod, "Integration")},
			"datadog_integration_pagerduty_service_object": {Tok: makeResource(pdMod, "ServiceObject")},

			// Slack Integrations
			"datadog_integration_slack_channel": {Tok: makeResource(slackMod, "Channel")},

			// OpsGenie
			"datadog_integration_opsgenie_service_object": {Tok: makeResource(opsGenieMod, "ServiceObject")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"datadog_ip_ranges": {
				Tok: makeDataSource(datadogMod, "getIpRanges"),
			},
			"datadog_monitor": {
				Tok: makeDataSource(datadogMod, "getMonitor"),
			},
			"datadog_dashboard_list":                      {Tok: makeDataSource(datadogMod, "getDashboardList")},
			"datadog_dashboard":                           {Tok: makeDataSource(datadogMod, "getDashboard")},
			"datadog_synthetics_locations":                {Tok: makeDataSource(datadogMod, "getSyntheticsLocations")},
			"datadog_permissions":                         {Tok: makeDataSource(datadogMod, "getPermissions")},
			"datadog_role":                                {Tok: makeDataSource(datadogMod, "getRole")},
			"datadog_security_monitoring_rules":           {Tok: makeDataSource(datadogMod, "getSecurityMonitoringRules")},
			"datadog_monitors":                            {Tok: makeDataSource(datadogMod, "getMonitors")},
			"datadog_service_level_objective":             {Tok: makeDataSource(datadogMod, "getServiceLevelObjective")},
			"datadog_service_level_objectives":            {Tok: makeDataSource(datadogMod, "getServiceLevelObjectives")},
			"datadog_api_key":                             {Tok: makeDataSource(datadogMod, "getApiKey")},
			"datadog_application_key":                     {Tok: makeDataSource(datadogMod, "getApplicationKey")},
			"datadog_security_monitoring_filters":         {Tok: makeDataSource(datadogMod, "getSecurityMonitoringFilters")},
			"datadog_synthetics_global_variable":          {Tok: makeDataSource(datadogMod, "getSyntheticsGlobalVariable")},
			"datadog_user":                                {Tok: makeDataSource(datadogMod, "getUser")},
			"datadog_roles":                               {Tok: makeDataSource(datadogMod, "getRoles")},
			"datadog_logs_archives_order":                 {Tok: makeDataSource(datadogMod, "getLogsArchivesOrder")},
			"datadog_logs_indexes":                        {Tok: makeDataSource(datadogMod, "getLogsIndexes")},
			"datadog_logs_indexes_order":                  {Tok: makeDataSource(datadogMod, "getLogsIndexesOrder")},
			"datadog_logs_pipelines":                      {Tok: makeDataSource(datadogMod, "getLogsPipelines")},
			"datadog_cloud_workload_security_agent_rules": {Tok: makeDataSource(datadogMod, "getCloudWorkloadSecurityAgentRules")},
			"datadog_rum_application":                     {Tok: makeDataSource(datadogMod, "getRumApplication")},
			"datadog_synthetics_test":                     {Tok: makeDataSource(datadogMod, "getSyntheticsTest")},

			"datadog_integration_aws_logs_services": {Tok: makeDataSource(awsMod, "getIntegrationLogsServices")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0",
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
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}

	strategy := x.TokensKnownModules("datadog_", datadogMod, []string{
		"integration",
	},
		func(module, name string) (string, error) {
			// Datadog puts integration tokens into their own module, where
			// each integration partner gets their own module.
			if strings.EqualFold(module, "integration") {
				var isDataSource bool
				if pre, post, found := strings.Cut(name, "get"); found && pre == "" {
					isDataSource = true
					name = post
				}

				nameR := []rune(name)
				var didSet bool
				for i := 1; i < len(name); i++ {
					if unicode.IsUpper(nameR[i]) {
						name = "Integration" + string(nameR[i:])
						module = string(append([]rune{unicode.ToLower(nameR[0])},
							nameR[1:i]...))
						didSet = true
						break
					}
				}
				contract.Assertf(didSet,
					"We failed to correctly map the integration token module=%q, name=%q",
					module, name)

				if isDataSource {
					name = "get" + name
				}
			}

			lower := string(unicode.ToLower(rune(name[0]))) + name[1:]
			return datadogPkg + ":" + module + "/" + lower + ":" + name, nil
		})
	err := x.ComputeDefaults(&prov, strategy)
	contract.AssertNoErrorf(err, "failed to apply mapping strategy")

	err = x.AutoAliasing(&prov, prov.GetMetadata())
	contract.AssertNoErrorf(err, "failed to apply token aliasing")

	return prov
}
