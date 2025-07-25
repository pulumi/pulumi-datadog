// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !>This resource is deprecated - use the `aws.IntegrationAccount` resource instead.
//
// Provides a Datadog - Amazon Web Services integration log collection resource. This can be used to manage which AWS services logs are collected from for an account.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog/aws"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Create a new Datadog - Amazon Web Services integration log collection
//			_, err := aws.NewIntegrationLogCollection(ctx, "main", &aws.IntegrationLogCollectionArgs{
//				AccountId: pulumi.String("1234567890"),
//				Services: pulumi.StringArray{
//					pulumi.String("lambda"),
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
//
// ## Import
//
// The `pulumi import` command can be used, for example:
//
// Amazon Web Services log collection integrations can be imported using the `account ID`.
//
// ```sh
// $ pulumi import datadog:aws/integrationLogCollection:IntegrationLogCollection test 1234567890
// ```
type IntegrationLogCollection struct {
	pulumi.CustomResourceState

	// Your AWS Account ID without dashes.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// A list of services to collect logs from. See the [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which services are supported.
	Services pulumi.StringArrayOutput `pulumi:"services"`
}

// NewIntegrationLogCollection registers a new resource with the given unique name, arguments, and options.
func NewIntegrationLogCollection(ctx *pulumi.Context,
	name string, args *IntegrationLogCollectionArgs, opts ...pulumi.ResourceOption) (*IntegrationLogCollection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Services == nil {
		return nil, errors.New("invalid value for required argument 'Services'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IntegrationLogCollection
	err := ctx.RegisterResource("datadog:aws/integrationLogCollection:IntegrationLogCollection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIntegrationLogCollection gets an existing IntegrationLogCollection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIntegrationLogCollection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IntegrationLogCollectionState, opts ...pulumi.ResourceOption) (*IntegrationLogCollection, error) {
	var resource IntegrationLogCollection
	err := ctx.ReadResource("datadog:aws/integrationLogCollection:IntegrationLogCollection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IntegrationLogCollection resources.
type integrationLogCollectionState struct {
	// Your AWS Account ID without dashes.
	AccountId *string `pulumi:"accountId"`
	// A list of services to collect logs from. See the [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which services are supported.
	Services []string `pulumi:"services"`
}

type IntegrationLogCollectionState struct {
	// Your AWS Account ID without dashes.
	AccountId pulumi.StringPtrInput
	// A list of services to collect logs from. See the [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which services are supported.
	Services pulumi.StringArrayInput
}

func (IntegrationLogCollectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationLogCollectionState)(nil)).Elem()
}

type integrationLogCollectionArgs struct {
	// Your AWS Account ID without dashes.
	AccountId string `pulumi:"accountId"`
	// A list of services to collect logs from. See the [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which services are supported.
	Services []string `pulumi:"services"`
}

// The set of arguments for constructing a IntegrationLogCollection resource.
type IntegrationLogCollectionArgs struct {
	// Your AWS Account ID without dashes.
	AccountId pulumi.StringInput
	// A list of services to collect logs from. See the [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which services are supported.
	Services pulumi.StringArrayInput
}

func (IntegrationLogCollectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationLogCollectionArgs)(nil)).Elem()
}

type IntegrationLogCollectionInput interface {
	pulumi.Input

	ToIntegrationLogCollectionOutput() IntegrationLogCollectionOutput
	ToIntegrationLogCollectionOutputWithContext(ctx context.Context) IntegrationLogCollectionOutput
}

func (*IntegrationLogCollection) ElementType() reflect.Type {
	return reflect.TypeOf((**IntegrationLogCollection)(nil)).Elem()
}

func (i *IntegrationLogCollection) ToIntegrationLogCollectionOutput() IntegrationLogCollectionOutput {
	return i.ToIntegrationLogCollectionOutputWithContext(context.Background())
}

func (i *IntegrationLogCollection) ToIntegrationLogCollectionOutputWithContext(ctx context.Context) IntegrationLogCollectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationLogCollectionOutput)
}

// IntegrationLogCollectionArrayInput is an input type that accepts IntegrationLogCollectionArray and IntegrationLogCollectionArrayOutput values.
// You can construct a concrete instance of `IntegrationLogCollectionArrayInput` via:
//
//	IntegrationLogCollectionArray{ IntegrationLogCollectionArgs{...} }
type IntegrationLogCollectionArrayInput interface {
	pulumi.Input

	ToIntegrationLogCollectionArrayOutput() IntegrationLogCollectionArrayOutput
	ToIntegrationLogCollectionArrayOutputWithContext(context.Context) IntegrationLogCollectionArrayOutput
}

type IntegrationLogCollectionArray []IntegrationLogCollectionInput

func (IntegrationLogCollectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IntegrationLogCollection)(nil)).Elem()
}

func (i IntegrationLogCollectionArray) ToIntegrationLogCollectionArrayOutput() IntegrationLogCollectionArrayOutput {
	return i.ToIntegrationLogCollectionArrayOutputWithContext(context.Background())
}

func (i IntegrationLogCollectionArray) ToIntegrationLogCollectionArrayOutputWithContext(ctx context.Context) IntegrationLogCollectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationLogCollectionArrayOutput)
}

// IntegrationLogCollectionMapInput is an input type that accepts IntegrationLogCollectionMap and IntegrationLogCollectionMapOutput values.
// You can construct a concrete instance of `IntegrationLogCollectionMapInput` via:
//
//	IntegrationLogCollectionMap{ "key": IntegrationLogCollectionArgs{...} }
type IntegrationLogCollectionMapInput interface {
	pulumi.Input

	ToIntegrationLogCollectionMapOutput() IntegrationLogCollectionMapOutput
	ToIntegrationLogCollectionMapOutputWithContext(context.Context) IntegrationLogCollectionMapOutput
}

type IntegrationLogCollectionMap map[string]IntegrationLogCollectionInput

func (IntegrationLogCollectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IntegrationLogCollection)(nil)).Elem()
}

func (i IntegrationLogCollectionMap) ToIntegrationLogCollectionMapOutput() IntegrationLogCollectionMapOutput {
	return i.ToIntegrationLogCollectionMapOutputWithContext(context.Background())
}

func (i IntegrationLogCollectionMap) ToIntegrationLogCollectionMapOutputWithContext(ctx context.Context) IntegrationLogCollectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationLogCollectionMapOutput)
}

type IntegrationLogCollectionOutput struct{ *pulumi.OutputState }

func (IntegrationLogCollectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IntegrationLogCollection)(nil)).Elem()
}

func (o IntegrationLogCollectionOutput) ToIntegrationLogCollectionOutput() IntegrationLogCollectionOutput {
	return o
}

func (o IntegrationLogCollectionOutput) ToIntegrationLogCollectionOutputWithContext(ctx context.Context) IntegrationLogCollectionOutput {
	return o
}

// Your AWS Account ID without dashes.
func (o IntegrationLogCollectionOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *IntegrationLogCollection) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// A list of services to collect logs from. See the [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which services are supported.
func (o IntegrationLogCollectionOutput) Services() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IntegrationLogCollection) pulumi.StringArrayOutput { return v.Services }).(pulumi.StringArrayOutput)
}

type IntegrationLogCollectionArrayOutput struct{ *pulumi.OutputState }

func (IntegrationLogCollectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IntegrationLogCollection)(nil)).Elem()
}

func (o IntegrationLogCollectionArrayOutput) ToIntegrationLogCollectionArrayOutput() IntegrationLogCollectionArrayOutput {
	return o
}

func (o IntegrationLogCollectionArrayOutput) ToIntegrationLogCollectionArrayOutputWithContext(ctx context.Context) IntegrationLogCollectionArrayOutput {
	return o
}

func (o IntegrationLogCollectionArrayOutput) Index(i pulumi.IntInput) IntegrationLogCollectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IntegrationLogCollection {
		return vs[0].([]*IntegrationLogCollection)[vs[1].(int)]
	}).(IntegrationLogCollectionOutput)
}

type IntegrationLogCollectionMapOutput struct{ *pulumi.OutputState }

func (IntegrationLogCollectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IntegrationLogCollection)(nil)).Elem()
}

func (o IntegrationLogCollectionMapOutput) ToIntegrationLogCollectionMapOutput() IntegrationLogCollectionMapOutput {
	return o
}

func (o IntegrationLogCollectionMapOutput) ToIntegrationLogCollectionMapOutputWithContext(ctx context.Context) IntegrationLogCollectionMapOutput {
	return o
}

func (o IntegrationLogCollectionMapOutput) MapIndex(k pulumi.StringInput) IntegrationLogCollectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IntegrationLogCollection {
		return vs[0].(map[string]*IntegrationLogCollection)[vs[1].(string)]
	}).(IntegrationLogCollectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationLogCollectionInput)(nil)).Elem(), &IntegrationLogCollection{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationLogCollectionArrayInput)(nil)).Elem(), IntegrationLogCollectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationLogCollectionMapInput)(nil)).Elem(), IntegrationLogCollectionMap{})
	pulumi.RegisterOutputType(IntegrationLogCollectionOutput{})
	pulumi.RegisterOutputType(IntegrationLogCollectionArrayOutput{})
	pulumi.RegisterOutputType(IntegrationLogCollectionMapOutput{})
}
