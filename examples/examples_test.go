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

package examples

import (
	"os"
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/testing/integration"
)

func TestAccUser(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "user"),
		})

	integration.ProgramTest(t, &test)
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func checkProviderCredentials(t *testing.T) {
	apiKey := os.Getenv("DATADOG_API_KEY")
	if apiKey == "" {
		t.Skipf("Skipping test due to missing DATADOG_API_KEY environment variable")
	}

	appKey := os.Getenv("DATADOG_APP_KEY")
	if appKey == "" {
		t.Skipf("Skipping test due to missing DATADOG_APP_KEY environment variable")
	}
}

func getBaseOptions() integration.ProgramTestOptions {
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
	}
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	checkProviderCredentials(t)
	base := getBaseOptions()
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/datadog",
		},
	})

	return baseJS
}
