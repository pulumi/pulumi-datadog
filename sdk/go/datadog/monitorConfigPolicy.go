// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datadog

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Datadog monitor config policy resource. This can be used to create and manage Datadog monitor config policies.
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
//			_, err := datadog.NewMonitorConfigPolicy(ctx, "test", &datadog.MonitorConfigPolicyArgs{
//				PolicyType: pulumi.String("tag"),
//				TagPolicy: &datadog.MonitorConfigPolicyTagPolicyArgs{
//					TagKey:         pulumi.String("env"),
//					TagKeyRequired: pulumi.Bool(false),
//					ValidTagValues: pulumi.StringArray{
//						pulumi.String("staging"),
//						pulumi.String("prod"),
//					},
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
type MonitorConfigPolicy struct {
	pulumi.CustomResourceState

	// The monitor config policy type Valid values are `tag`.
	PolicyType pulumi.StringOutput `pulumi:"policyType"`
	// Config for a tag policy. Only set if `policyType` is `tag`.
	TagPolicy MonitorConfigPolicyTagPolicyPtrOutput `pulumi:"tagPolicy"`
}

// NewMonitorConfigPolicy registers a new resource with the given unique name, arguments, and options.
func NewMonitorConfigPolicy(ctx *pulumi.Context,
	name string, args *MonitorConfigPolicyArgs, opts ...pulumi.ResourceOption) (*MonitorConfigPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyType == nil {
		return nil, errors.New("invalid value for required argument 'PolicyType'")
	}
	var resource MonitorConfigPolicy
	err := ctx.RegisterResource("datadog:index/monitorConfigPolicy:MonitorConfigPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitorConfigPolicy gets an existing MonitorConfigPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitorConfigPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitorConfigPolicyState, opts ...pulumi.ResourceOption) (*MonitorConfigPolicy, error) {
	var resource MonitorConfigPolicy
	err := ctx.ReadResource("datadog:index/monitorConfigPolicy:MonitorConfigPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MonitorConfigPolicy resources.
type monitorConfigPolicyState struct {
	// The monitor config policy type Valid values are `tag`.
	PolicyType *string `pulumi:"policyType"`
	// Config for a tag policy. Only set if `policyType` is `tag`.
	TagPolicy *MonitorConfigPolicyTagPolicy `pulumi:"tagPolicy"`
}

type MonitorConfigPolicyState struct {
	// The monitor config policy type Valid values are `tag`.
	PolicyType pulumi.StringPtrInput
	// Config for a tag policy. Only set if `policyType` is `tag`.
	TagPolicy MonitorConfigPolicyTagPolicyPtrInput
}

func (MonitorConfigPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorConfigPolicyState)(nil)).Elem()
}

type monitorConfigPolicyArgs struct {
	// The monitor config policy type Valid values are `tag`.
	PolicyType string `pulumi:"policyType"`
	// Config for a tag policy. Only set if `policyType` is `tag`.
	TagPolicy *MonitorConfigPolicyTagPolicy `pulumi:"tagPolicy"`
}

// The set of arguments for constructing a MonitorConfigPolicy resource.
type MonitorConfigPolicyArgs struct {
	// The monitor config policy type Valid values are `tag`.
	PolicyType pulumi.StringInput
	// Config for a tag policy. Only set if `policyType` is `tag`.
	TagPolicy MonitorConfigPolicyTagPolicyPtrInput
}

func (MonitorConfigPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorConfigPolicyArgs)(nil)).Elem()
}

type MonitorConfigPolicyInput interface {
	pulumi.Input

	ToMonitorConfigPolicyOutput() MonitorConfigPolicyOutput
	ToMonitorConfigPolicyOutputWithContext(ctx context.Context) MonitorConfigPolicyOutput
}

func (*MonitorConfigPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorConfigPolicy)(nil)).Elem()
}

func (i *MonitorConfigPolicy) ToMonitorConfigPolicyOutput() MonitorConfigPolicyOutput {
	return i.ToMonitorConfigPolicyOutputWithContext(context.Background())
}

func (i *MonitorConfigPolicy) ToMonitorConfigPolicyOutputWithContext(ctx context.Context) MonitorConfigPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorConfigPolicyOutput)
}

// MonitorConfigPolicyArrayInput is an input type that accepts MonitorConfigPolicyArray and MonitorConfigPolicyArrayOutput values.
// You can construct a concrete instance of `MonitorConfigPolicyArrayInput` via:
//
//	MonitorConfigPolicyArray{ MonitorConfigPolicyArgs{...} }
type MonitorConfigPolicyArrayInput interface {
	pulumi.Input

	ToMonitorConfigPolicyArrayOutput() MonitorConfigPolicyArrayOutput
	ToMonitorConfigPolicyArrayOutputWithContext(context.Context) MonitorConfigPolicyArrayOutput
}

type MonitorConfigPolicyArray []MonitorConfigPolicyInput

func (MonitorConfigPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitorConfigPolicy)(nil)).Elem()
}

func (i MonitorConfigPolicyArray) ToMonitorConfigPolicyArrayOutput() MonitorConfigPolicyArrayOutput {
	return i.ToMonitorConfigPolicyArrayOutputWithContext(context.Background())
}

func (i MonitorConfigPolicyArray) ToMonitorConfigPolicyArrayOutputWithContext(ctx context.Context) MonitorConfigPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorConfigPolicyArrayOutput)
}

// MonitorConfigPolicyMapInput is an input type that accepts MonitorConfigPolicyMap and MonitorConfigPolicyMapOutput values.
// You can construct a concrete instance of `MonitorConfigPolicyMapInput` via:
//
//	MonitorConfigPolicyMap{ "key": MonitorConfigPolicyArgs{...} }
type MonitorConfigPolicyMapInput interface {
	pulumi.Input

	ToMonitorConfigPolicyMapOutput() MonitorConfigPolicyMapOutput
	ToMonitorConfigPolicyMapOutputWithContext(context.Context) MonitorConfigPolicyMapOutput
}

type MonitorConfigPolicyMap map[string]MonitorConfigPolicyInput

func (MonitorConfigPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitorConfigPolicy)(nil)).Elem()
}

func (i MonitorConfigPolicyMap) ToMonitorConfigPolicyMapOutput() MonitorConfigPolicyMapOutput {
	return i.ToMonitorConfigPolicyMapOutputWithContext(context.Background())
}

func (i MonitorConfigPolicyMap) ToMonitorConfigPolicyMapOutputWithContext(ctx context.Context) MonitorConfigPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorConfigPolicyMapOutput)
}

type MonitorConfigPolicyOutput struct{ *pulumi.OutputState }

func (MonitorConfigPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorConfigPolicy)(nil)).Elem()
}

func (o MonitorConfigPolicyOutput) ToMonitorConfigPolicyOutput() MonitorConfigPolicyOutput {
	return o
}

func (o MonitorConfigPolicyOutput) ToMonitorConfigPolicyOutputWithContext(ctx context.Context) MonitorConfigPolicyOutput {
	return o
}

// The monitor config policy type Valid values are `tag`.
func (o MonitorConfigPolicyOutput) PolicyType() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorConfigPolicy) pulumi.StringOutput { return v.PolicyType }).(pulumi.StringOutput)
}

// Config for a tag policy. Only set if `policyType` is `tag`.
func (o MonitorConfigPolicyOutput) TagPolicy() MonitorConfigPolicyTagPolicyPtrOutput {
	return o.ApplyT(func(v *MonitorConfigPolicy) MonitorConfigPolicyTagPolicyPtrOutput { return v.TagPolicy }).(MonitorConfigPolicyTagPolicyPtrOutput)
}

type MonitorConfigPolicyArrayOutput struct{ *pulumi.OutputState }

func (MonitorConfigPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitorConfigPolicy)(nil)).Elem()
}

func (o MonitorConfigPolicyArrayOutput) ToMonitorConfigPolicyArrayOutput() MonitorConfigPolicyArrayOutput {
	return o
}

func (o MonitorConfigPolicyArrayOutput) ToMonitorConfigPolicyArrayOutputWithContext(ctx context.Context) MonitorConfigPolicyArrayOutput {
	return o
}

func (o MonitorConfigPolicyArrayOutput) Index(i pulumi.IntInput) MonitorConfigPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MonitorConfigPolicy {
		return vs[0].([]*MonitorConfigPolicy)[vs[1].(int)]
	}).(MonitorConfigPolicyOutput)
}

type MonitorConfigPolicyMapOutput struct{ *pulumi.OutputState }

func (MonitorConfigPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitorConfigPolicy)(nil)).Elem()
}

func (o MonitorConfigPolicyMapOutput) ToMonitorConfigPolicyMapOutput() MonitorConfigPolicyMapOutput {
	return o
}

func (o MonitorConfigPolicyMapOutput) ToMonitorConfigPolicyMapOutputWithContext(ctx context.Context) MonitorConfigPolicyMapOutput {
	return o
}

func (o MonitorConfigPolicyMapOutput) MapIndex(k pulumi.StringInput) MonitorConfigPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MonitorConfigPolicy {
		return vs[0].(map[string]*MonitorConfigPolicy)[vs[1].(string)]
	}).(MonitorConfigPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorConfigPolicyInput)(nil)).Elem(), &MonitorConfigPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorConfigPolicyArrayInput)(nil)).Elem(), MonitorConfigPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorConfigPolicyMapInput)(nil)).Elem(), MonitorConfigPolicyMap{})
	pulumi.RegisterOutputType(MonitorConfigPolicyOutput{})
	pulumi.RegisterOutputType(MonitorConfigPolicyArrayOutput{})
	pulumi.RegisterOutputType(MonitorConfigPolicyMapOutput{})
}