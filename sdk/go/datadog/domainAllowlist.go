// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datadog

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides the Datadog Email Domain Allowlist resource. This can be used to manage the Datadog Email Domain Allowlist.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := datadog.NewDomainAllowlist(ctx, "example", &datadog.DomainAllowlistArgs{
//				Enabled: pulumi.Bool(true),
//				Domains: pulumi.StringArray{
//					pulumi.String("@gmail.com"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type DomainAllowlist struct {
	pulumi.CustomResourceState

	// The domains within the domain allowlist.
	Domains pulumi.StringArrayOutput `pulumi:"domains"`
	// Whether the Email Domain Allowlist is enabled.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
}

// NewDomainAllowlist registers a new resource with the given unique name, arguments, and options.
func NewDomainAllowlist(ctx *pulumi.Context,
	name string, args *DomainAllowlistArgs, opts ...pulumi.ResourceOption) (*DomainAllowlist, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Domains == nil {
		return nil, errors.New("invalid value for required argument 'Domains'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DomainAllowlist
	err := ctx.RegisterResource("datadog:index/domainAllowlist:DomainAllowlist", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomainAllowlist gets an existing DomainAllowlist resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomainAllowlist(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainAllowlistState, opts ...pulumi.ResourceOption) (*DomainAllowlist, error) {
	var resource DomainAllowlist
	err := ctx.ReadResource("datadog:index/domainAllowlist:DomainAllowlist", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DomainAllowlist resources.
type domainAllowlistState struct {
	// The domains within the domain allowlist.
	Domains []string `pulumi:"domains"`
	// Whether the Email Domain Allowlist is enabled.
	Enabled *bool `pulumi:"enabled"`
}

type DomainAllowlistState struct {
	// The domains within the domain allowlist.
	Domains pulumi.StringArrayInput
	// Whether the Email Domain Allowlist is enabled.
	Enabled pulumi.BoolPtrInput
}

func (DomainAllowlistState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainAllowlistState)(nil)).Elem()
}

type domainAllowlistArgs struct {
	// The domains within the domain allowlist.
	Domains []string `pulumi:"domains"`
	// Whether the Email Domain Allowlist is enabled.
	Enabled bool `pulumi:"enabled"`
}

// The set of arguments for constructing a DomainAllowlist resource.
type DomainAllowlistArgs struct {
	// The domains within the domain allowlist.
	Domains pulumi.StringArrayInput
	// Whether the Email Domain Allowlist is enabled.
	Enabled pulumi.BoolInput
}

func (DomainAllowlistArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainAllowlistArgs)(nil)).Elem()
}

type DomainAllowlistInput interface {
	pulumi.Input

	ToDomainAllowlistOutput() DomainAllowlistOutput
	ToDomainAllowlistOutputWithContext(ctx context.Context) DomainAllowlistOutput
}

func (*DomainAllowlist) ElementType() reflect.Type {
	return reflect.TypeOf((**DomainAllowlist)(nil)).Elem()
}

func (i *DomainAllowlist) ToDomainAllowlistOutput() DomainAllowlistOutput {
	return i.ToDomainAllowlistOutputWithContext(context.Background())
}

func (i *DomainAllowlist) ToDomainAllowlistOutputWithContext(ctx context.Context) DomainAllowlistOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainAllowlistOutput)
}

// DomainAllowlistArrayInput is an input type that accepts DomainAllowlistArray and DomainAllowlistArrayOutput values.
// You can construct a concrete instance of `DomainAllowlistArrayInput` via:
//
//	DomainAllowlistArray{ DomainAllowlistArgs{...} }
type DomainAllowlistArrayInput interface {
	pulumi.Input

	ToDomainAllowlistArrayOutput() DomainAllowlistArrayOutput
	ToDomainAllowlistArrayOutputWithContext(context.Context) DomainAllowlistArrayOutput
}

type DomainAllowlistArray []DomainAllowlistInput

func (DomainAllowlistArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DomainAllowlist)(nil)).Elem()
}

func (i DomainAllowlistArray) ToDomainAllowlistArrayOutput() DomainAllowlistArrayOutput {
	return i.ToDomainAllowlistArrayOutputWithContext(context.Background())
}

func (i DomainAllowlistArray) ToDomainAllowlistArrayOutputWithContext(ctx context.Context) DomainAllowlistArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainAllowlistArrayOutput)
}

// DomainAllowlistMapInput is an input type that accepts DomainAllowlistMap and DomainAllowlistMapOutput values.
// You can construct a concrete instance of `DomainAllowlistMapInput` via:
//
//	DomainAllowlistMap{ "key": DomainAllowlistArgs{...} }
type DomainAllowlistMapInput interface {
	pulumi.Input

	ToDomainAllowlistMapOutput() DomainAllowlistMapOutput
	ToDomainAllowlistMapOutputWithContext(context.Context) DomainAllowlistMapOutput
}

type DomainAllowlistMap map[string]DomainAllowlistInput

func (DomainAllowlistMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DomainAllowlist)(nil)).Elem()
}

func (i DomainAllowlistMap) ToDomainAllowlistMapOutput() DomainAllowlistMapOutput {
	return i.ToDomainAllowlistMapOutputWithContext(context.Background())
}

func (i DomainAllowlistMap) ToDomainAllowlistMapOutputWithContext(ctx context.Context) DomainAllowlistMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainAllowlistMapOutput)
}

type DomainAllowlistOutput struct{ *pulumi.OutputState }

func (DomainAllowlistOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DomainAllowlist)(nil)).Elem()
}

func (o DomainAllowlistOutput) ToDomainAllowlistOutput() DomainAllowlistOutput {
	return o
}

func (o DomainAllowlistOutput) ToDomainAllowlistOutputWithContext(ctx context.Context) DomainAllowlistOutput {
	return o
}

// The domains within the domain allowlist.
func (o DomainAllowlistOutput) Domains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DomainAllowlist) pulumi.StringArrayOutput { return v.Domains }).(pulumi.StringArrayOutput)
}

// Whether the Email Domain Allowlist is enabled.
func (o DomainAllowlistOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *DomainAllowlist) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

type DomainAllowlistArrayOutput struct{ *pulumi.OutputState }

func (DomainAllowlistArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DomainAllowlist)(nil)).Elem()
}

func (o DomainAllowlistArrayOutput) ToDomainAllowlistArrayOutput() DomainAllowlistArrayOutput {
	return o
}

func (o DomainAllowlistArrayOutput) ToDomainAllowlistArrayOutputWithContext(ctx context.Context) DomainAllowlistArrayOutput {
	return o
}

func (o DomainAllowlistArrayOutput) Index(i pulumi.IntInput) DomainAllowlistOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DomainAllowlist {
		return vs[0].([]*DomainAllowlist)[vs[1].(int)]
	}).(DomainAllowlistOutput)
}

type DomainAllowlistMapOutput struct{ *pulumi.OutputState }

func (DomainAllowlistMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DomainAllowlist)(nil)).Elem()
}

func (o DomainAllowlistMapOutput) ToDomainAllowlistMapOutput() DomainAllowlistMapOutput {
	return o
}

func (o DomainAllowlistMapOutput) ToDomainAllowlistMapOutputWithContext(ctx context.Context) DomainAllowlistMapOutput {
	return o
}

func (o DomainAllowlistMapOutput) MapIndex(k pulumi.StringInput) DomainAllowlistOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DomainAllowlist {
		return vs[0].(map[string]*DomainAllowlist)[vs[1].(string)]
	}).(DomainAllowlistOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DomainAllowlistInput)(nil)).Elem(), &DomainAllowlist{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainAllowlistArrayInput)(nil)).Elem(), DomainAllowlistArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainAllowlistMapInput)(nil)).Elem(), DomainAllowlistMap{})
	pulumi.RegisterOutputType(DomainAllowlistOutput{})
	pulumi.RegisterOutputType(DomainAllowlistArrayOutput{})
	pulumi.RegisterOutputType(DomainAllowlistMapOutput{})
}
