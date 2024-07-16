// Copyright 2016-2024, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package datadog

import (
	"bytes"
	"context"
	"fmt"
	"path"
	"strings"
	"unicode"

	_ "embed" // Allow embedding files

	"github.com/terraform-providers/terraform-provider-datadog/datadog"
	"github.com/terraform-providers/terraform-provider-datadog/datadog/fwprovider"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"

	"github.com/pulumi/pulumi-datadog/provider/v4/pkg/version"
)

const (
	// packages:
	datadogPkg = "datadog"
	// modules:
	mainMod     = "index"
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
		shimv2.NewProvider(datadog.Provider(), shimv2.WithPlanResourceChange(
			func(string) bool { return true })),
		fwprovider.New(),
	)
	prov := tfbridge.ProviderInfo{
		P:                   p,
		Name:                "datadog",
		Description:         "A Pulumi package for creating and managing Datadog resources.",
		Keywords:            []string{"pulumi", "datadog"},
		License:             "Apache-2.0",
		Homepage:            "https://pulumi.io",
		Repository:          "https://github.com/pulumi/pulumi-datadog",
		Config:              map[string]*tfbridge.SchemaInfo{},
		MetadataInfo:        tfbridge.NewProviderMetadata(metadata),
		Version:             version.Version,
		UpstreamRepoPath:    "./upstream",
		GitHubOrg:           "DataDog",
		DocRules:            &tfbridge.DocRuleInfo{EditRules: docEditRules},
		SchemaPostProcessor: rerollRecursiveDashboardWidget,
		Resources: map[string]*tfbridge.ResourceInfo{
			"datadog_logs_index": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"filter": {
						Name:        "filters",
						MaxItemsOne: tfbridge.False(),
					},
				},
			},

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
			"datadog_integration_aws_logs_services": {Tok: makeDataSource(awsMod, "getIntegrationLogsServices")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0",
			},
			RespectSchemaVersion: true,
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", datadogPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				datadogPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
			PyProject: struct{ Enabled bool }{true},
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}

	strategy := tks.KnownModules("datadog_", mainMod, []string{
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

	prov.MustComputeTokens(strategy)
	prov.MustApplyAutoAliases()

	return prov
}

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(defaults, tfbridge.DocsEdit{
		Path: "*",
		Edit: func(_ string, b []byte) ([]byte, error) {
			b = bytes.ReplaceAll(b,
				[]byte("Created using the Datadog provider in Terraform"),
				[]byte("Created using the Datadog provider in Pulumi"))
			return b, nil
		},
	})
}
