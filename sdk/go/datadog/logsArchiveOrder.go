// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datadog

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Datadog [Logs Archive API](https://docs.datadoghq.com/api/v2/logs-archives/) resource, which is used to manage Datadog log archives order.
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
//			_, err := datadog.NewLogsArchiveOrder(ctx, "sample_archive_order", &datadog.LogsArchiveOrderArgs{
//				ArchiveIds: pulumi.StringArray{
//					sampleArchive1.Id,
//					sampleArchive2.Id,
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
// There must be at most one datadog_logs_archive_order resource. You can import the datadog_logs_archive_order or create an archive order.
//
// ```sh
// $ pulumi import datadog:index/logsArchiveOrder:LogsArchiveOrder name> archiveOrderID
// ```
type LogsArchiveOrder struct {
	pulumi.CustomResourceState

	// The archive IDs list. The order of archive IDs in this attribute defines the overall archive order for logs. If `archiveIds` is empty or not specified, it will import the actual archive order, and create the resource. Otherwise, it will try to update the order.
	ArchiveIds pulumi.StringArrayOutput `pulumi:"archiveIds"`
}

// NewLogsArchiveOrder registers a new resource with the given unique name, arguments, and options.
func NewLogsArchiveOrder(ctx *pulumi.Context,
	name string, args *LogsArchiveOrderArgs, opts ...pulumi.ResourceOption) (*LogsArchiveOrder, error) {
	if args == nil {
		args = &LogsArchiveOrderArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LogsArchiveOrder
	err := ctx.RegisterResource("datadog:index/logsArchiveOrder:LogsArchiveOrder", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogsArchiveOrder gets an existing LogsArchiveOrder resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogsArchiveOrder(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogsArchiveOrderState, opts ...pulumi.ResourceOption) (*LogsArchiveOrder, error) {
	var resource LogsArchiveOrder
	err := ctx.ReadResource("datadog:index/logsArchiveOrder:LogsArchiveOrder", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogsArchiveOrder resources.
type logsArchiveOrderState struct {
	// The archive IDs list. The order of archive IDs in this attribute defines the overall archive order for logs. If `archiveIds` is empty or not specified, it will import the actual archive order, and create the resource. Otherwise, it will try to update the order.
	ArchiveIds []string `pulumi:"archiveIds"`
}

type LogsArchiveOrderState struct {
	// The archive IDs list. The order of archive IDs in this attribute defines the overall archive order for logs. If `archiveIds` is empty or not specified, it will import the actual archive order, and create the resource. Otherwise, it will try to update the order.
	ArchiveIds pulumi.StringArrayInput
}

func (LogsArchiveOrderState) ElementType() reflect.Type {
	return reflect.TypeOf((*logsArchiveOrderState)(nil)).Elem()
}

type logsArchiveOrderArgs struct {
	// The archive IDs list. The order of archive IDs in this attribute defines the overall archive order for logs. If `archiveIds` is empty or not specified, it will import the actual archive order, and create the resource. Otherwise, it will try to update the order.
	ArchiveIds []string `pulumi:"archiveIds"`
}

// The set of arguments for constructing a LogsArchiveOrder resource.
type LogsArchiveOrderArgs struct {
	// The archive IDs list. The order of archive IDs in this attribute defines the overall archive order for logs. If `archiveIds` is empty or not specified, it will import the actual archive order, and create the resource. Otherwise, it will try to update the order.
	ArchiveIds pulumi.StringArrayInput
}

func (LogsArchiveOrderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logsArchiveOrderArgs)(nil)).Elem()
}

type LogsArchiveOrderInput interface {
	pulumi.Input

	ToLogsArchiveOrderOutput() LogsArchiveOrderOutput
	ToLogsArchiveOrderOutputWithContext(ctx context.Context) LogsArchiveOrderOutput
}

func (*LogsArchiveOrder) ElementType() reflect.Type {
	return reflect.TypeOf((**LogsArchiveOrder)(nil)).Elem()
}

func (i *LogsArchiveOrder) ToLogsArchiveOrderOutput() LogsArchiveOrderOutput {
	return i.ToLogsArchiveOrderOutputWithContext(context.Background())
}

func (i *LogsArchiveOrder) ToLogsArchiveOrderOutputWithContext(ctx context.Context) LogsArchiveOrderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsArchiveOrderOutput)
}

// LogsArchiveOrderArrayInput is an input type that accepts LogsArchiveOrderArray and LogsArchiveOrderArrayOutput values.
// You can construct a concrete instance of `LogsArchiveOrderArrayInput` via:
//
//	LogsArchiveOrderArray{ LogsArchiveOrderArgs{...} }
type LogsArchiveOrderArrayInput interface {
	pulumi.Input

	ToLogsArchiveOrderArrayOutput() LogsArchiveOrderArrayOutput
	ToLogsArchiveOrderArrayOutputWithContext(context.Context) LogsArchiveOrderArrayOutput
}

type LogsArchiveOrderArray []LogsArchiveOrderInput

func (LogsArchiveOrderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogsArchiveOrder)(nil)).Elem()
}

func (i LogsArchiveOrderArray) ToLogsArchiveOrderArrayOutput() LogsArchiveOrderArrayOutput {
	return i.ToLogsArchiveOrderArrayOutputWithContext(context.Background())
}

func (i LogsArchiveOrderArray) ToLogsArchiveOrderArrayOutputWithContext(ctx context.Context) LogsArchiveOrderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsArchiveOrderArrayOutput)
}

// LogsArchiveOrderMapInput is an input type that accepts LogsArchiveOrderMap and LogsArchiveOrderMapOutput values.
// You can construct a concrete instance of `LogsArchiveOrderMapInput` via:
//
//	LogsArchiveOrderMap{ "key": LogsArchiveOrderArgs{...} }
type LogsArchiveOrderMapInput interface {
	pulumi.Input

	ToLogsArchiveOrderMapOutput() LogsArchiveOrderMapOutput
	ToLogsArchiveOrderMapOutputWithContext(context.Context) LogsArchiveOrderMapOutput
}

type LogsArchiveOrderMap map[string]LogsArchiveOrderInput

func (LogsArchiveOrderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogsArchiveOrder)(nil)).Elem()
}

func (i LogsArchiveOrderMap) ToLogsArchiveOrderMapOutput() LogsArchiveOrderMapOutput {
	return i.ToLogsArchiveOrderMapOutputWithContext(context.Background())
}

func (i LogsArchiveOrderMap) ToLogsArchiveOrderMapOutputWithContext(ctx context.Context) LogsArchiveOrderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsArchiveOrderMapOutput)
}

type LogsArchiveOrderOutput struct{ *pulumi.OutputState }

func (LogsArchiveOrderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogsArchiveOrder)(nil)).Elem()
}

func (o LogsArchiveOrderOutput) ToLogsArchiveOrderOutput() LogsArchiveOrderOutput {
	return o
}

func (o LogsArchiveOrderOutput) ToLogsArchiveOrderOutputWithContext(ctx context.Context) LogsArchiveOrderOutput {
	return o
}

// The archive IDs list. The order of archive IDs in this attribute defines the overall archive order for logs. If `archiveIds` is empty or not specified, it will import the actual archive order, and create the resource. Otherwise, it will try to update the order.
func (o LogsArchiveOrderOutput) ArchiveIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LogsArchiveOrder) pulumi.StringArrayOutput { return v.ArchiveIds }).(pulumi.StringArrayOutput)
}

type LogsArchiveOrderArrayOutput struct{ *pulumi.OutputState }

func (LogsArchiveOrderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogsArchiveOrder)(nil)).Elem()
}

func (o LogsArchiveOrderArrayOutput) ToLogsArchiveOrderArrayOutput() LogsArchiveOrderArrayOutput {
	return o
}

func (o LogsArchiveOrderArrayOutput) ToLogsArchiveOrderArrayOutputWithContext(ctx context.Context) LogsArchiveOrderArrayOutput {
	return o
}

func (o LogsArchiveOrderArrayOutput) Index(i pulumi.IntInput) LogsArchiveOrderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogsArchiveOrder {
		return vs[0].([]*LogsArchiveOrder)[vs[1].(int)]
	}).(LogsArchiveOrderOutput)
}

type LogsArchiveOrderMapOutput struct{ *pulumi.OutputState }

func (LogsArchiveOrderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogsArchiveOrder)(nil)).Elem()
}

func (o LogsArchiveOrderMapOutput) ToLogsArchiveOrderMapOutput() LogsArchiveOrderMapOutput {
	return o
}

func (o LogsArchiveOrderMapOutput) ToLogsArchiveOrderMapOutputWithContext(ctx context.Context) LogsArchiveOrderMapOutput {
	return o
}

func (o LogsArchiveOrderMapOutput) MapIndex(k pulumi.StringInput) LogsArchiveOrderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogsArchiveOrder {
		return vs[0].(map[string]*LogsArchiveOrder)[vs[1].(string)]
	}).(LogsArchiveOrderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogsArchiveOrderInput)(nil)).Elem(), &LogsArchiveOrder{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogsArchiveOrderArrayInput)(nil)).Elem(), LogsArchiveOrderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogsArchiveOrderMapInput)(nil)).Elem(), LogsArchiveOrderMap{})
	pulumi.RegisterOutputType(LogsArchiveOrderOutput{})
	pulumi.RegisterOutputType(LogsArchiveOrderArrayOutput{})
	pulumi.RegisterOutputType(LogsArchiveOrderMapOutput{})
}
