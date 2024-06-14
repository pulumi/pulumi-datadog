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
				elidedRefs = append(elidedRefs, tok)
				continue typ
			}
		}
	}

	for _, elided := range elidedRefs {
		delete(spec.Types, string(elided))
	}

	// We have now deleted all the types we don't want, but that has left dangling
	// type references.

	fixup := func(t *schema.TypeSpec) {
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
		traverseResourceTypes(&r, fixup)
		spec.Resources[k] = r

	}
	for k, d := range spec.Functions {
		traverseFunctionTypes(&d, fixup)
		spec.Functions[k] = d
	}
	for k, t := range spec.Types {
		traverseTypes(&t, fixup)
		spec.Types[k] = t
	}
}

func traverseResourceTypes(r *schema.ResourceSpec, f func(*schema.TypeSpec)) {
	for k, v := range r.InputProperties {
		traversePropertyTypes(&v, f)
		r.InputProperties[k] = v
	}
	if r.StateInputs != nil {
		traverseObjectTypes(r.StateInputs, f)
	}
	traverseObjectTypes(&r.ObjectTypeSpec, f)
}

func traverseObjectTypes(o *schema.ObjectTypeSpec, f func(*schema.TypeSpec)) {
	for k, v := range o.Properties {
		traversePropertyTypes(&v, f)
		o.Properties[k] = v
	}
}

func traversePropertyTypes(o *schema.PropertySpec, f func(*schema.TypeSpec)) {
	f(&o.TypeSpec)
}

func traverseTypes(t *schema.ComplexTypeSpec, f func(*schema.TypeSpec)) {
	traverseObjectTypes(&t.ObjectTypeSpec, f)
}

func traverseFunctionTypes(t *schema.FunctionSpec, f func(*schema.TypeSpec)) {
	if t.Inputs != nil {
		traverseObjectTypes(t.Inputs, f)
	}
	if t.Outputs != nil {
		traverseObjectTypes(t.Outputs, f)
	}
	if t.ReturnType != nil {
		traverseObjectTypes(t.ReturnType.ObjectTypeSpec, f)
		f(t.ReturnType.TypeSpec)
	}
}
