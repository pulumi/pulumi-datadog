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
	"fmt"
	"strings"

	"golang.org/x/text/cases"
	"golang.org/x/text/language"

	"github.com/pulumi/pulumi/pkg/v3/codegen/schema"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"

	"github.com/pulumi/pulumi-datadog/provider/v4/psed"
)

type recType struct{ prefix, suffix string }

func (r recType) has(typ tokens.Type) bool {
	name := typ.Name().String()
	return strings.HasPrefix(name, r.prefix) &&
		strings.HasSuffix(name, r.suffix) &&
		len(name) > len(r.prefix)+len(r.suffix)
}

func (r recType) canonical() string {
	return fmt.Sprintf("%s:%s/%s:%[3]s", datadogPkg, mainMod, r.prefix+r.suffix)
}

func rerollRecursiveDashboardWidget(spec *schema.PackageSpec) {
	widget, ok := spec.Types["datadog:index/DashboardWidget:DashboardWidget"]
	contract.Assertf(ok, "must be able to find top level widget")

	var defs []recType

	for prop := range widget.Properties {
		if !strings.HasSuffix(prop, "Definition") {
			continue
		}
		defs = append(defs, recType{
			prefix: "DashboardWidget",
			suffix: cases.Title(language.English, cases.NoLower).String(prop),
		})
	}

	rerollRecursiveTypes(spec, defs)

	mkRec := func(prefix, postfix, example string) recType {

		psed.CopyType(spec,
			tokens.Type(datadogPkg+":"+mainMod+"/"+example+":"+example),
			tokens.Type(datadogPkg+":"+mainMod+"/"+prefix+postfix+":"+prefix+postfix),
		)
		return recType{prefix, postfix}
	}

	rerollRecursiveTypes(spec, []recType{
		mkRec("DashboardWidget", "RumQuery", "DashboardWidgetToplistDefinitionRequestRumQuery"),
		mkRec("DashboardWidget", "SecurityQuery", "DashboardWidgetToplistDefinitionRequestSecurityQuery"),
		mkRec("DashboardWidget", "ApmQuery", "DashboardWidgetQueryTableDefinitionRequestApmQuery"),
		mkRec("DashboardWidget", "LogQuery", "DashboardWidgetHostmapDefinitionRequestFillLogQuery"),
	})
}

func rerollRecursiveTypes(spec *schema.PackageSpec, defs []recType) {
	for _, def := range defs {
		typ := def.canonical()
		_, ok := spec.Types[typ]
		if !ok {
			contract.Failf("Could not find root type for %T: %q", def, typ)
		}
	}

	// We'll collect all referenced types that we replace with the root
	// type, so that we could remove all of elided types and their children.
	var elidedRefs []tokens.Type

typ:
	for tok := range spec.Types {
		tok, err := tokens.ParseTypeToken(tok)
		contract.AssertNoErrorf(err, "invalid type token")

		for _, def := range defs {
			if def.has(tok) {
				contract.AssertNoErrorf(
					psed.AssertSuperSetOf(spec, tok, tokens.Type(def.canonical())),
					"Attempted to introduce a breaking change",
				)
				elidedRefs = append(elidedRefs, tok)
				continue typ
			}
		}
	}

	for _, elided := range elidedRefs {
		psed.DeleteType(spec, elided)
	}

	// We have now deleted all the types we don't want, but that has left dangling
	// type references.

	fixup := func(t *schema.TypeSpec) {
		if t == nil {
			return
		}

		const prefix = "#/types/"

		tokStr, ok := strings.CutPrefix(t.Ref, prefix)
		if !ok {
			return
		}
		tok, err := tokens.ParseTypeToken(tokStr)
		contract.AssertNoErrorf(err, "invalid type token")

		for _, def := range defs {
			if def.has(tok) {
				t.Ref = prefix + def.canonical()
				return
			}
		}
	}

	for k, r := range spec.Resources {
		r := r
		psed.TraverseResourceTypes(&r, fixup)
		spec.Resources[k] = r

	}
	for k, d := range spec.Functions {
		d := d
		psed.TraverseFunctionTypes(&d, fixup)
		spec.Functions[k] = d
	}
	for k, typ := range spec.Types {
		typ := typ
		psed.TraverseTypes(&typ, fixup)
		spec.Types[k] = typ
	}
}
