//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

package datadog

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

const providerName = "datadog"
const defaultBaselineVersion = "4.27.0"

var programs = []string{
	"test-programs/index_logsindex",
	"test-programs/index_dashboardjson",
	"test-programs/index_apikey",
	"test-programs/gcp_integration",
	"test-programs/index_applicationkey",
	"test-programs/index_monitorjson",
	"test-programs/index_logscustompipeline",
	"test-programs/index_rumapplication",
}

func maybeSkip(t *testing.T, program string) {
	switch program {
	case "test-programs/index_logsindex":
		t.Skipf(`Flaky test fails with:

              	* error creating logs index from /api/v1/logs/config/indexes: 429 Too Many Requests: {"error":{"code":"ResourceExhausted","message":"Limit reached. Cannot create new index."}}`)
	}
}

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

func testProviderUpgrade(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.DownloadProviderVersion(providerName, defaultBaselineVersion),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	)
	result := providertest.PreviewProviderUpgrade(t, test, providerName, defaultBaselineVersion,
		optproviderupgrade.DisableAttach())
	assertpreview.HasNoReplacements(t, result)
}

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
	test.Up(t)
}

func TestPrograms(t *testing.T) {
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			maybeSkip(t, p)
			testProgram(t, p)
		})
	}
}

func TestProgramsUpgrade(t *testing.T) {
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			maybeSkip(t, p)
			testProviderUpgrade(t, p)
		})
	}
}
