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

package psed

import (
	"strings"

	// "golang.org/x/text/cases"
	// "golang.org/x/text/language"

	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

type typeToken struct{ tokens.Type }

func (tk typeToken) decompose() (tokens.Package, tokens.ModuleName, tokens.TypeName, bool) {
	if p := strings.SplitN(tk.Module().Name().String(), "/", 2); len(p) == 2 {
		if p[1] == tk.Name().String() {
			// We have found a token of the form
			return tk.Package(), tokens.ModuleName(p[0]), tk.Name(), false
		}
	}
	return tk.Package(), tk.Module().Name(), tk.Name(), true
}

func assemble(p tokens.Package, m tokens.ModuleName, n tokens.TypeName, logical bool) typeToken {
	if !logical {
		// If the decomposition was not logical, we need to re-apply the "/name"
		// to the module.
		m = tokens.ModuleName(m.String() +
			"/" +
			n.String(),
		)
		//			cases.Lower(language.English).String(n.String()[:1]) + n.String()[1:])
	}
	return typeToken{tokens.NewTypeToken(tokens.NewModuleToken(p, m), n)}
}

func (tk typeToken) LogicalModule() tokens.ModuleName {
	_, m, _, _ := tk.decompose()
	return m
}

func (tk typeToken) WithLogicalName(n tokens.TypeName) typeToken {
	p, m, _, logical := tk.decompose()
	return assemble(p, m, n, logical)
}
