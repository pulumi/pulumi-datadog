// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides access to individual Service Objects of Datadog - PagerDuty integrations. Note that the Datadog - PagerDuty integration must be activated in the Datadog UI in order for this resource to be usable.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog/pagerduty"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pagerduty.NewServiceObject(ctx, "testing_foo", &pagerduty.ServiceObjectArgs{
//				ServiceName: pulumi.String("testing_foo"),
//				ServiceKey:  pulumi.String("9876543210123456789"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewServiceObject(ctx, "testing_bar", &pagerduty.ServiceObjectArgs{
//				ServiceName: pulumi.String("testing_bar"),
//				ServiceKey:  pulumi.String("54321098765432109876"),
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
// Pagerduty service object can be imported using the service_name, while the service_key should be passed by setting the environment variable SERVICE_KEY
//
// ```sh
// $ pulumi import datadog:pagerduty/serviceObject:ServiceObject SERVICE_KEY=${service_key} datadog_integration_pagerduty_service_object.foo ${service_name}
// ```
type ServiceObject struct {
	pulumi.CustomResourceState

	ServiceKey pulumi.StringOutput `pulumi:"serviceKey"`
	// Your Service name in PagerDuty.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
}

// NewServiceObject registers a new resource with the given unique name, arguments, and options.
func NewServiceObject(ctx *pulumi.Context,
	name string, args *ServiceObjectArgs, opts ...pulumi.ResourceOption) (*ServiceObject, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServiceKey == nil {
		return nil, errors.New("invalid value for required argument 'ServiceKey'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	if args.ServiceKey != nil {
		args.ServiceKey = pulumi.ToSecret(args.ServiceKey).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"serviceKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceObject
	err := ctx.RegisterResource("datadog:pagerduty/serviceObject:ServiceObject", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceObject gets an existing ServiceObject resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceObject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceObjectState, opts ...pulumi.ResourceOption) (*ServiceObject, error) {
	var resource ServiceObject
	err := ctx.ReadResource("datadog:pagerduty/serviceObject:ServiceObject", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceObject resources.
type serviceObjectState struct {
	ServiceKey *string `pulumi:"serviceKey"`
	// Your Service name in PagerDuty.
	ServiceName *string `pulumi:"serviceName"`
}

type ServiceObjectState struct {
	ServiceKey pulumi.StringPtrInput
	// Your Service name in PagerDuty.
	ServiceName pulumi.StringPtrInput
}

func (ServiceObjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceObjectState)(nil)).Elem()
}

type serviceObjectArgs struct {
	ServiceKey string `pulumi:"serviceKey"`
	// Your Service name in PagerDuty.
	ServiceName string `pulumi:"serviceName"`
}

// The set of arguments for constructing a ServiceObject resource.
type ServiceObjectArgs struct {
	ServiceKey pulumi.StringInput
	// Your Service name in PagerDuty.
	ServiceName pulumi.StringInput
}

func (ServiceObjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceObjectArgs)(nil)).Elem()
}

type ServiceObjectInput interface {
	pulumi.Input

	ToServiceObjectOutput() ServiceObjectOutput
	ToServiceObjectOutputWithContext(ctx context.Context) ServiceObjectOutput
}

func (*ServiceObject) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceObject)(nil)).Elem()
}

func (i *ServiceObject) ToServiceObjectOutput() ServiceObjectOutput {
	return i.ToServiceObjectOutputWithContext(context.Background())
}

func (i *ServiceObject) ToServiceObjectOutputWithContext(ctx context.Context) ServiceObjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceObjectOutput)
}

// ServiceObjectArrayInput is an input type that accepts ServiceObjectArray and ServiceObjectArrayOutput values.
// You can construct a concrete instance of `ServiceObjectArrayInput` via:
//
//	ServiceObjectArray{ ServiceObjectArgs{...} }
type ServiceObjectArrayInput interface {
	pulumi.Input

	ToServiceObjectArrayOutput() ServiceObjectArrayOutput
	ToServiceObjectArrayOutputWithContext(context.Context) ServiceObjectArrayOutput
}

type ServiceObjectArray []ServiceObjectInput

func (ServiceObjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceObject)(nil)).Elem()
}

func (i ServiceObjectArray) ToServiceObjectArrayOutput() ServiceObjectArrayOutput {
	return i.ToServiceObjectArrayOutputWithContext(context.Background())
}

func (i ServiceObjectArray) ToServiceObjectArrayOutputWithContext(ctx context.Context) ServiceObjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceObjectArrayOutput)
}

// ServiceObjectMapInput is an input type that accepts ServiceObjectMap and ServiceObjectMapOutput values.
// You can construct a concrete instance of `ServiceObjectMapInput` via:
//
//	ServiceObjectMap{ "key": ServiceObjectArgs{...} }
type ServiceObjectMapInput interface {
	pulumi.Input

	ToServiceObjectMapOutput() ServiceObjectMapOutput
	ToServiceObjectMapOutputWithContext(context.Context) ServiceObjectMapOutput
}

type ServiceObjectMap map[string]ServiceObjectInput

func (ServiceObjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceObject)(nil)).Elem()
}

func (i ServiceObjectMap) ToServiceObjectMapOutput() ServiceObjectMapOutput {
	return i.ToServiceObjectMapOutputWithContext(context.Background())
}

func (i ServiceObjectMap) ToServiceObjectMapOutputWithContext(ctx context.Context) ServiceObjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceObjectMapOutput)
}

type ServiceObjectOutput struct{ *pulumi.OutputState }

func (ServiceObjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceObject)(nil)).Elem()
}

func (o ServiceObjectOutput) ToServiceObjectOutput() ServiceObjectOutput {
	return o
}

func (o ServiceObjectOutput) ToServiceObjectOutputWithContext(ctx context.Context) ServiceObjectOutput {
	return o
}

func (o ServiceObjectOutput) ServiceKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceObject) pulumi.StringOutput { return v.ServiceKey }).(pulumi.StringOutput)
}

// Your Service name in PagerDuty.
func (o ServiceObjectOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceObject) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

type ServiceObjectArrayOutput struct{ *pulumi.OutputState }

func (ServiceObjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceObject)(nil)).Elem()
}

func (o ServiceObjectArrayOutput) ToServiceObjectArrayOutput() ServiceObjectArrayOutput {
	return o
}

func (o ServiceObjectArrayOutput) ToServiceObjectArrayOutputWithContext(ctx context.Context) ServiceObjectArrayOutput {
	return o
}

func (o ServiceObjectArrayOutput) Index(i pulumi.IntInput) ServiceObjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceObject {
		return vs[0].([]*ServiceObject)[vs[1].(int)]
	}).(ServiceObjectOutput)
}

type ServiceObjectMapOutput struct{ *pulumi.OutputState }

func (ServiceObjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceObject)(nil)).Elem()
}

func (o ServiceObjectMapOutput) ToServiceObjectMapOutput() ServiceObjectMapOutput {
	return o
}

func (o ServiceObjectMapOutput) ToServiceObjectMapOutputWithContext(ctx context.Context) ServiceObjectMapOutput {
	return o
}

func (o ServiceObjectMapOutput) MapIndex(k pulumi.StringInput) ServiceObjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceObject {
		return vs[0].(map[string]*ServiceObject)[vs[1].(string)]
	}).(ServiceObjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceObjectInput)(nil)).Elem(), &ServiceObject{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceObjectArrayInput)(nil)).Elem(), ServiceObjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceObjectMapInput)(nil)).Elem(), ServiceObjectMap{})
	pulumi.RegisterOutputType(ServiceObjectOutput{})
	pulumi.RegisterOutputType(ServiceObjectArrayOutput{})
	pulumi.RegisterOutputType(ServiceObjectMapOutput{})
}
