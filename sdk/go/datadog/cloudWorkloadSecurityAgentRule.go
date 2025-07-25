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
//			_, err := datadog.NewCloudWorkloadSecurityAgentRule(ctx, "my_agent_rule", &datadog.CloudWorkloadSecurityAgentRuleArgs{
//				Name:        pulumi.String("my_agent_rule"),
//				Description: pulumi.String("My agent rule"),
//				Enabled:     pulumi.Bool(true),
//				Expression:  pulumi.String("exec.file.name == \"java\""),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// The `pulumi import` command can be used, for example:
//
// Cloud Workload Security Agent rules can be imported using ID, e.g.
//
// ```sh
// $ pulumi import datadog:index/cloudWorkloadSecurityAgentRule:CloudWorkloadSecurityAgentRule my_agent_rule m0o-hto-lkb
// ```
type CloudWorkloadSecurityAgentRule struct {
	pulumi.CustomResourceState

	// The description of the Agent rule. Defaults to `""`.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether the Agent rule is enabled. Defaults to `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The SECL expression of the Agent rule.
	Expression pulumi.StringOutput `pulumi:"expression"`
	// The name of the Agent rule.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewCloudWorkloadSecurityAgentRule registers a new resource with the given unique name, arguments, and options.
func NewCloudWorkloadSecurityAgentRule(ctx *pulumi.Context,
	name string, args *CloudWorkloadSecurityAgentRuleArgs, opts ...pulumi.ResourceOption) (*CloudWorkloadSecurityAgentRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Expression == nil {
		return nil, errors.New("invalid value for required argument 'Expression'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CloudWorkloadSecurityAgentRule
	err := ctx.RegisterResource("datadog:index/cloudWorkloadSecurityAgentRule:CloudWorkloadSecurityAgentRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudWorkloadSecurityAgentRule gets an existing CloudWorkloadSecurityAgentRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudWorkloadSecurityAgentRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudWorkloadSecurityAgentRuleState, opts ...pulumi.ResourceOption) (*CloudWorkloadSecurityAgentRule, error) {
	var resource CloudWorkloadSecurityAgentRule
	err := ctx.ReadResource("datadog:index/cloudWorkloadSecurityAgentRule:CloudWorkloadSecurityAgentRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudWorkloadSecurityAgentRule resources.
type cloudWorkloadSecurityAgentRuleState struct {
	// The description of the Agent rule. Defaults to `""`.
	Description *string `pulumi:"description"`
	// Whether the Agent rule is enabled. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// The SECL expression of the Agent rule.
	Expression *string `pulumi:"expression"`
	// The name of the Agent rule.
	Name *string `pulumi:"name"`
}

type CloudWorkloadSecurityAgentRuleState struct {
	// The description of the Agent rule. Defaults to `""`.
	Description pulumi.StringPtrInput
	// Whether the Agent rule is enabled. Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// The SECL expression of the Agent rule.
	Expression pulumi.StringPtrInput
	// The name of the Agent rule.
	Name pulumi.StringPtrInput
}

func (CloudWorkloadSecurityAgentRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudWorkloadSecurityAgentRuleState)(nil)).Elem()
}

type cloudWorkloadSecurityAgentRuleArgs struct {
	// The description of the Agent rule. Defaults to `""`.
	Description *string `pulumi:"description"`
	// Whether the Agent rule is enabled. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// The SECL expression of the Agent rule.
	Expression string `pulumi:"expression"`
	// The name of the Agent rule.
	Name string `pulumi:"name"`
}

// The set of arguments for constructing a CloudWorkloadSecurityAgentRule resource.
type CloudWorkloadSecurityAgentRuleArgs struct {
	// The description of the Agent rule. Defaults to `""`.
	Description pulumi.StringPtrInput
	// Whether the Agent rule is enabled. Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// The SECL expression of the Agent rule.
	Expression pulumi.StringInput
	// The name of the Agent rule.
	Name pulumi.StringInput
}

func (CloudWorkloadSecurityAgentRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudWorkloadSecurityAgentRuleArgs)(nil)).Elem()
}

type CloudWorkloadSecurityAgentRuleInput interface {
	pulumi.Input

	ToCloudWorkloadSecurityAgentRuleOutput() CloudWorkloadSecurityAgentRuleOutput
	ToCloudWorkloadSecurityAgentRuleOutputWithContext(ctx context.Context) CloudWorkloadSecurityAgentRuleOutput
}

func (*CloudWorkloadSecurityAgentRule) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudWorkloadSecurityAgentRule)(nil)).Elem()
}

func (i *CloudWorkloadSecurityAgentRule) ToCloudWorkloadSecurityAgentRuleOutput() CloudWorkloadSecurityAgentRuleOutput {
	return i.ToCloudWorkloadSecurityAgentRuleOutputWithContext(context.Background())
}

func (i *CloudWorkloadSecurityAgentRule) ToCloudWorkloadSecurityAgentRuleOutputWithContext(ctx context.Context) CloudWorkloadSecurityAgentRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudWorkloadSecurityAgentRuleOutput)
}

// CloudWorkloadSecurityAgentRuleArrayInput is an input type that accepts CloudWorkloadSecurityAgentRuleArray and CloudWorkloadSecurityAgentRuleArrayOutput values.
// You can construct a concrete instance of `CloudWorkloadSecurityAgentRuleArrayInput` via:
//
//	CloudWorkloadSecurityAgentRuleArray{ CloudWorkloadSecurityAgentRuleArgs{...} }
type CloudWorkloadSecurityAgentRuleArrayInput interface {
	pulumi.Input

	ToCloudWorkloadSecurityAgentRuleArrayOutput() CloudWorkloadSecurityAgentRuleArrayOutput
	ToCloudWorkloadSecurityAgentRuleArrayOutputWithContext(context.Context) CloudWorkloadSecurityAgentRuleArrayOutput
}

type CloudWorkloadSecurityAgentRuleArray []CloudWorkloadSecurityAgentRuleInput

func (CloudWorkloadSecurityAgentRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudWorkloadSecurityAgentRule)(nil)).Elem()
}

func (i CloudWorkloadSecurityAgentRuleArray) ToCloudWorkloadSecurityAgentRuleArrayOutput() CloudWorkloadSecurityAgentRuleArrayOutput {
	return i.ToCloudWorkloadSecurityAgentRuleArrayOutputWithContext(context.Background())
}

func (i CloudWorkloadSecurityAgentRuleArray) ToCloudWorkloadSecurityAgentRuleArrayOutputWithContext(ctx context.Context) CloudWorkloadSecurityAgentRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudWorkloadSecurityAgentRuleArrayOutput)
}

// CloudWorkloadSecurityAgentRuleMapInput is an input type that accepts CloudWorkloadSecurityAgentRuleMap and CloudWorkloadSecurityAgentRuleMapOutput values.
// You can construct a concrete instance of `CloudWorkloadSecurityAgentRuleMapInput` via:
//
//	CloudWorkloadSecurityAgentRuleMap{ "key": CloudWorkloadSecurityAgentRuleArgs{...} }
type CloudWorkloadSecurityAgentRuleMapInput interface {
	pulumi.Input

	ToCloudWorkloadSecurityAgentRuleMapOutput() CloudWorkloadSecurityAgentRuleMapOutput
	ToCloudWorkloadSecurityAgentRuleMapOutputWithContext(context.Context) CloudWorkloadSecurityAgentRuleMapOutput
}

type CloudWorkloadSecurityAgentRuleMap map[string]CloudWorkloadSecurityAgentRuleInput

func (CloudWorkloadSecurityAgentRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudWorkloadSecurityAgentRule)(nil)).Elem()
}

func (i CloudWorkloadSecurityAgentRuleMap) ToCloudWorkloadSecurityAgentRuleMapOutput() CloudWorkloadSecurityAgentRuleMapOutput {
	return i.ToCloudWorkloadSecurityAgentRuleMapOutputWithContext(context.Background())
}

func (i CloudWorkloadSecurityAgentRuleMap) ToCloudWorkloadSecurityAgentRuleMapOutputWithContext(ctx context.Context) CloudWorkloadSecurityAgentRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudWorkloadSecurityAgentRuleMapOutput)
}

type CloudWorkloadSecurityAgentRuleOutput struct{ *pulumi.OutputState }

func (CloudWorkloadSecurityAgentRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudWorkloadSecurityAgentRule)(nil)).Elem()
}

func (o CloudWorkloadSecurityAgentRuleOutput) ToCloudWorkloadSecurityAgentRuleOutput() CloudWorkloadSecurityAgentRuleOutput {
	return o
}

func (o CloudWorkloadSecurityAgentRuleOutput) ToCloudWorkloadSecurityAgentRuleOutputWithContext(ctx context.Context) CloudWorkloadSecurityAgentRuleOutput {
	return o
}

// The description of the Agent rule. Defaults to `""`.
func (o CloudWorkloadSecurityAgentRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudWorkloadSecurityAgentRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether the Agent rule is enabled. Defaults to `true`.
func (o CloudWorkloadSecurityAgentRuleOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CloudWorkloadSecurityAgentRule) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The SECL expression of the Agent rule.
func (o CloudWorkloadSecurityAgentRuleOutput) Expression() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudWorkloadSecurityAgentRule) pulumi.StringOutput { return v.Expression }).(pulumi.StringOutput)
}

// The name of the Agent rule.
func (o CloudWorkloadSecurityAgentRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudWorkloadSecurityAgentRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type CloudWorkloadSecurityAgentRuleArrayOutput struct{ *pulumi.OutputState }

func (CloudWorkloadSecurityAgentRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudWorkloadSecurityAgentRule)(nil)).Elem()
}

func (o CloudWorkloadSecurityAgentRuleArrayOutput) ToCloudWorkloadSecurityAgentRuleArrayOutput() CloudWorkloadSecurityAgentRuleArrayOutput {
	return o
}

func (o CloudWorkloadSecurityAgentRuleArrayOutput) ToCloudWorkloadSecurityAgentRuleArrayOutputWithContext(ctx context.Context) CloudWorkloadSecurityAgentRuleArrayOutput {
	return o
}

func (o CloudWorkloadSecurityAgentRuleArrayOutput) Index(i pulumi.IntInput) CloudWorkloadSecurityAgentRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CloudWorkloadSecurityAgentRule {
		return vs[0].([]*CloudWorkloadSecurityAgentRule)[vs[1].(int)]
	}).(CloudWorkloadSecurityAgentRuleOutput)
}

type CloudWorkloadSecurityAgentRuleMapOutput struct{ *pulumi.OutputState }

func (CloudWorkloadSecurityAgentRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudWorkloadSecurityAgentRule)(nil)).Elem()
}

func (o CloudWorkloadSecurityAgentRuleMapOutput) ToCloudWorkloadSecurityAgentRuleMapOutput() CloudWorkloadSecurityAgentRuleMapOutput {
	return o
}

func (o CloudWorkloadSecurityAgentRuleMapOutput) ToCloudWorkloadSecurityAgentRuleMapOutputWithContext(ctx context.Context) CloudWorkloadSecurityAgentRuleMapOutput {
	return o
}

func (o CloudWorkloadSecurityAgentRuleMapOutput) MapIndex(k pulumi.StringInput) CloudWorkloadSecurityAgentRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CloudWorkloadSecurityAgentRule {
		return vs[0].(map[string]*CloudWorkloadSecurityAgentRule)[vs[1].(string)]
	}).(CloudWorkloadSecurityAgentRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CloudWorkloadSecurityAgentRuleInput)(nil)).Elem(), &CloudWorkloadSecurityAgentRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudWorkloadSecurityAgentRuleArrayInput)(nil)).Elem(), CloudWorkloadSecurityAgentRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudWorkloadSecurityAgentRuleMapInput)(nil)).Elem(), CloudWorkloadSecurityAgentRuleMap{})
	pulumi.RegisterOutputType(CloudWorkloadSecurityAgentRuleOutput{})
	pulumi.RegisterOutputType(CloudWorkloadSecurityAgentRuleArrayOutput{})
	pulumi.RegisterOutputType(CloudWorkloadSecurityAgentRuleMapOutput{})
}
