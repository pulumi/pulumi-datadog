//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

// Copyright 2016-2024, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License")
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//	http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package datadog

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

const providerName = "datadog"

func testProgram(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.SkipInstall(),
	)
	test.Up()
}

func TestPrograms(t *testing.T) {
	programs := []string{
		"test-programs/index_monitor",
		"test-programs/aws_integration",
		"test-programs/index_syntheticstest",
		"test-programs/index_apikey",
		"test-programs/index_dashboard",
		"test-programs/index_logsarchive",
		"test-programs/index_servicelevelobjective",
		"test-programs/index_applicationkey",
		"test-programs/index_dashboardjson",
		"test-programs/slack_channel",
		"test-programs/aws_integrationlambdaarn",
		"test-programs/index_logscustompipeline",
		"test-programs/gcp_integration",
		"test-programs/index_monitorjson",
		"test-programs/aws_integrationlogcollection",
		"test-programs/index_servicedefinitionyaml",
		"test-programs/index_logsindex",
		"test-programs/index_user",
		"test-programs/azure_integration",
		"test-programs/index_rumapplication",
	}
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProgram(t, p)
		})
	}
}
