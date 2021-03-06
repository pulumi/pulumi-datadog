// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package datadog

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Datadog [Logs Pipeline API](https://docs.datadoghq.com/api/v1/logs-pipelines/) resource, which is used to create and manage Datadog logs custom pipelines.
//
// ## Example Usage
//
// Create a Datadog logs pipeline:
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-datadog/sdk/v2/go/datadog"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := datadog.NewLogsCustomPipeline(ctx, "samplePipeline", &datadog.LogsCustomPipelineArgs{
// 			Filters: datadog.LogsCustomPipelineFilterArray{
// 				&datadog.LogsCustomPipelineFilterArgs{
// 					Query: pulumi.String("source:foo"),
// 				},
// 			},
// 			IsEnabled: pulumi.Bool(true),
// 			Name:      pulumi.String("sample pipeline"),
// 			Processors: datadog.LogsCustomPipelineProcessorArray{
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					ArithmeticProcessor: &datadog.LogsCustomPipelineProcessorArithmeticProcessorArgs{
// 						Expression:       pulumi.String("(time1 - time2)*1000"),
// 						IsEnabled:        pulumi.Bool(true),
// 						IsReplaceMissing: pulumi.Bool(true),
// 						Name:             pulumi.String("sample arithmetic processor"),
// 						Target:           pulumi.String("my_arithmetic"),
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					AttributeRemapper: &datadog.LogsCustomPipelineProcessorAttributeRemapperArgs{
// 						IsEnabled:          pulumi.Bool(true),
// 						Name:               pulumi.String("sample attribute processor"),
// 						OverrideOnConflict: pulumi.Bool(false),
// 						PreserveSource:     pulumi.Bool(true),
// 						SourceType:         pulumi.String("tag"),
// 						Sources: pulumi.StringArray{
// 							pulumi.String("db.instance"),
// 						},
// 						Target:       pulumi.String("db"),
// 						TargetFormat: pulumi.String("string"),
// 						TargetType:   pulumi.String("attribute"),
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					CategoryProcessor: &datadog.LogsCustomPipelineProcessorCategoryProcessorArgs{
// 						Category: pulumi.MapArray{
// 							pulumi.Map{
// 								"filter": pulumi.StringMap{
// 									"query": pulumi.String("@severity: \".\""),
// 								},
// 								"name": pulumi.String("debug"),
// 							},
// 							pulumi.Map{
// 								"filter": pulumi.StringMap{
// 									"query": pulumi.String("@severity: \"-\""),
// 								},
// 								"name": pulumi.String("verbose"),
// 							},
// 						},
// 						IsEnabled: pulumi.Bool(true),
// 						Name:      pulumi.String("sample category processor"),
// 						Target:    pulumi.String("foo.severity"),
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					DateRemapper: &datadog.LogsCustomPipelineProcessorDateRemapperArgs{
// 						IsEnabled: pulumi.Bool(true),
// 						Name:      pulumi.String("sample date remapper"),
// 						Sources: pulumi.StringArray{
// 							pulumi.String("_timestamp"),
// 							pulumi.String("published_date"),
// 						},
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					GeoIpParser: &datadog.LogsCustomPipelineProcessorGeoIpParserArgs{
// 						IsEnabled: pulumi.Bool(true),
// 						Name:      pulumi.String("sample geo ip parser"),
// 						Sources: pulumi.StringArray{
// 							pulumi.String("network.client.ip"),
// 						},
// 						Target: pulumi.String("network.client.geoip"),
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					GrokParser: &datadog.LogsCustomPipelineProcessorGrokParserArgs{
// 						Grok: &datadog.LogsCustomPipelineProcessorGrokParserGrokArgs{
// 							MatchRules:   pulumi.String(fmt.Sprintf("%v%v%v%v%v", "Rule ", "%{", "word:my_word2} ", "%{", "number:my_float2}")),
// 							SupportRules: pulumi.String(""),
// 						},
// 						IsEnabled: pulumi.Bool(true),
// 						Name:      pulumi.String("sample grok parser"),
// 						Samples: pulumi.StringArray{
// 							pulumi.String("sample log 1"),
// 						},
// 						Source: pulumi.String("message"),
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					LookupProcessor: &datadog.LogsCustomPipelineProcessorLookupProcessorArgs{
// 						DefaultLookup: pulumi.String("unknown service"),
// 						IsEnabled:     pulumi.Bool(true),
// 						LookupTable: pulumi.StringArray{
// 							pulumi.String("1,my service"),
// 						},
// 						Name:   pulumi.String("sample lookup processor"),
// 						Source: pulumi.String("service_id"),
// 						Target: pulumi.String("service_name"),
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					MessageRemapper: &datadog.LogsCustomPipelineProcessorMessageRemapperArgs{
// 						IsEnabled: pulumi.Bool(true),
// 						Name:      pulumi.String("sample message remapper"),
// 						Sources: pulumi.StringArray{
// 							pulumi.String("msg"),
// 						},
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					Pipeline: &datadog.LogsCustomPipelineProcessorPipelineArgs{
// 						Filter: pulumi.StringMapArray{
// 							pulumi.StringMap{
// 								"query": pulumi.String("source:foo"),
// 							},
// 						},
// 						IsEnabled: pulumi.Bool(true),
// 						Name:      pulumi.String("nested pipeline"),
// 						Processor: pulumi.MapMapArray{
// 							pulumi.MapMap{
// 								"urlParser": pulumi.Map{
// 									"name":                   pulumi.String("sample url parser"),
// 									"normalizeEndingSlashes": pulumi.Bool(true),
// 									"sources": pulumi.StringArray{
// 										pulumi.String("url"),
// 										pulumi.String("extra"),
// 									},
// 									"target": pulumi.String("http_url"),
// 								},
// 							},
// 						},
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					ServiceRemapper: &datadog.LogsCustomPipelineProcessorServiceRemapperArgs{
// 						IsEnabled: pulumi.Bool(true),
// 						Name:      pulumi.String("sample service remapper"),
// 						Sources: pulumi.StringArray{
// 							pulumi.String("service"),
// 						},
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					StatusRemapper: &datadog.LogsCustomPipelineProcessorStatusRemapperArgs{
// 						IsEnabled: pulumi.Bool(true),
// 						Name:      pulumi.String("sample status remapper"),
// 						Sources: pulumi.StringArray{
// 							pulumi.String("info"),
// 							pulumi.String("trace"),
// 						},
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					StringBuilderProcessor: &datadog.LogsCustomPipelineProcessorStringBuilderProcessorArgs{
// 						IsEnabled:        pulumi.Bool(true),
// 						IsReplaceMissing: pulumi.Bool(false),
// 						Name:             pulumi.String("sample string builder processor"),
// 						Target:           pulumi.String("user_activity"),
// 						Template:         pulumi.String(fmt.Sprintf("%v%v%v%v", "%{", "user.name} logged in at ", "%{", "timestamp}")),
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					TraceIdRemapper: &datadog.LogsCustomPipelineProcessorTraceIdRemapperArgs{
// 						IsEnabled: pulumi.Bool(true),
// 						Name:      pulumi.String("sample trace id remapper"),
// 						Sources: pulumi.StringArray{
// 							pulumi.String("dd.trace_id"),
// 						},
// 					},
// 				},
// 				&datadog.LogsCustomPipelineProcessorArgs{
// 					UserAgentParser: &datadog.LogsCustomPipelineProcessorUserAgentParserArgs{
// 						IsEnabled: pulumi.Bool(true),
// 						IsEncoded: pulumi.Bool(false),
// 						Name:      pulumi.String("sample user agent parser"),
// 						Sources: pulumi.StringArray{
// 							pulumi.String("user"),
// 							pulumi.String("agent"),
// 						},
// 						Target: pulumi.String("http_agent"),
// 					},
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Important Notes
//
// Each `LogsCustomPipeline` resource defines a complete pipeline. The order of the pipelines is maintained in a different resource datadog_logs_pipeline_order. When creating a new pipeline, you need to **explicitly** add this pipeline to the `LogsPipelineOrder` resource to track the pipeline. Similarly, when a pipeline needs to be destroyed, remove its references from the `LogsPipelineOrder` resource.
//
// ## Import
//
// ```sh
//  $ pulumi import datadog:index/logsCustomPipeline:LogsCustomPipeline For the previously created custom pipelines, you can include them in Terraform with the `import` operation. Currently, Terraform requires you to explicitly create resources that match the existing pipelines to import them. Use `<resource.name> <pipelineID>` for each existing pipeline.
// ```
type LogsCustomPipeline struct {
	pulumi.CustomResourceState

	Filters    LogsCustomPipelineFilterArrayOutput    `pulumi:"filters"`
	IsEnabled  pulumi.BoolPtrOutput                   `pulumi:"isEnabled"`
	Name       pulumi.StringOutput                    `pulumi:"name"`
	Processors LogsCustomPipelineProcessorArrayOutput `pulumi:"processors"`
}

// NewLogsCustomPipeline registers a new resource with the given unique name, arguments, and options.
func NewLogsCustomPipeline(ctx *pulumi.Context,
	name string, args *LogsCustomPipelineArgs, opts ...pulumi.ResourceOption) (*LogsCustomPipeline, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Filters == nil {
		return nil, errors.New("invalid value for required argument 'Filters'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	var resource LogsCustomPipeline
	err := ctx.RegisterResource("datadog:index/logsCustomPipeline:LogsCustomPipeline", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogsCustomPipeline gets an existing LogsCustomPipeline resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogsCustomPipeline(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogsCustomPipelineState, opts ...pulumi.ResourceOption) (*LogsCustomPipeline, error) {
	var resource LogsCustomPipeline
	err := ctx.ReadResource("datadog:index/logsCustomPipeline:LogsCustomPipeline", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogsCustomPipeline resources.
type logsCustomPipelineState struct {
	Filters    []LogsCustomPipelineFilter    `pulumi:"filters"`
	IsEnabled  *bool                         `pulumi:"isEnabled"`
	Name       *string                       `pulumi:"name"`
	Processors []LogsCustomPipelineProcessor `pulumi:"processors"`
}

type LogsCustomPipelineState struct {
	Filters    LogsCustomPipelineFilterArrayInput
	IsEnabled  pulumi.BoolPtrInput
	Name       pulumi.StringPtrInput
	Processors LogsCustomPipelineProcessorArrayInput
}

func (LogsCustomPipelineState) ElementType() reflect.Type {
	return reflect.TypeOf((*logsCustomPipelineState)(nil)).Elem()
}

type logsCustomPipelineArgs struct {
	Filters    []LogsCustomPipelineFilter    `pulumi:"filters"`
	IsEnabled  *bool                         `pulumi:"isEnabled"`
	Name       string                        `pulumi:"name"`
	Processors []LogsCustomPipelineProcessor `pulumi:"processors"`
}

// The set of arguments for constructing a LogsCustomPipeline resource.
type LogsCustomPipelineArgs struct {
	Filters    LogsCustomPipelineFilterArrayInput
	IsEnabled  pulumi.BoolPtrInput
	Name       pulumi.StringInput
	Processors LogsCustomPipelineProcessorArrayInput
}

func (LogsCustomPipelineArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logsCustomPipelineArgs)(nil)).Elem()
}

type LogsCustomPipelineInput interface {
	pulumi.Input

	ToLogsCustomPipelineOutput() LogsCustomPipelineOutput
	ToLogsCustomPipelineOutputWithContext(ctx context.Context) LogsCustomPipelineOutput
}

func (*LogsCustomPipeline) ElementType() reflect.Type {
	return reflect.TypeOf((*LogsCustomPipeline)(nil))
}

func (i *LogsCustomPipeline) ToLogsCustomPipelineOutput() LogsCustomPipelineOutput {
	return i.ToLogsCustomPipelineOutputWithContext(context.Background())
}

func (i *LogsCustomPipeline) ToLogsCustomPipelineOutputWithContext(ctx context.Context) LogsCustomPipelineOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsCustomPipelineOutput)
}

func (i *LogsCustomPipeline) ToLogsCustomPipelinePtrOutput() LogsCustomPipelinePtrOutput {
	return i.ToLogsCustomPipelinePtrOutputWithContext(context.Background())
}

func (i *LogsCustomPipeline) ToLogsCustomPipelinePtrOutputWithContext(ctx context.Context) LogsCustomPipelinePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsCustomPipelinePtrOutput)
}

type LogsCustomPipelinePtrInput interface {
	pulumi.Input

	ToLogsCustomPipelinePtrOutput() LogsCustomPipelinePtrOutput
	ToLogsCustomPipelinePtrOutputWithContext(ctx context.Context) LogsCustomPipelinePtrOutput
}

type logsCustomPipelinePtrType LogsCustomPipelineArgs

func (*logsCustomPipelinePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**LogsCustomPipeline)(nil))
}

func (i *logsCustomPipelinePtrType) ToLogsCustomPipelinePtrOutput() LogsCustomPipelinePtrOutput {
	return i.ToLogsCustomPipelinePtrOutputWithContext(context.Background())
}

func (i *logsCustomPipelinePtrType) ToLogsCustomPipelinePtrOutputWithContext(ctx context.Context) LogsCustomPipelinePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsCustomPipelinePtrOutput)
}

// LogsCustomPipelineArrayInput is an input type that accepts LogsCustomPipelineArray and LogsCustomPipelineArrayOutput values.
// You can construct a concrete instance of `LogsCustomPipelineArrayInput` via:
//
//          LogsCustomPipelineArray{ LogsCustomPipelineArgs{...} }
type LogsCustomPipelineArrayInput interface {
	pulumi.Input

	ToLogsCustomPipelineArrayOutput() LogsCustomPipelineArrayOutput
	ToLogsCustomPipelineArrayOutputWithContext(context.Context) LogsCustomPipelineArrayOutput
}

type LogsCustomPipelineArray []LogsCustomPipelineInput

func (LogsCustomPipelineArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*LogsCustomPipeline)(nil))
}

func (i LogsCustomPipelineArray) ToLogsCustomPipelineArrayOutput() LogsCustomPipelineArrayOutput {
	return i.ToLogsCustomPipelineArrayOutputWithContext(context.Background())
}

func (i LogsCustomPipelineArray) ToLogsCustomPipelineArrayOutputWithContext(ctx context.Context) LogsCustomPipelineArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsCustomPipelineArrayOutput)
}

// LogsCustomPipelineMapInput is an input type that accepts LogsCustomPipelineMap and LogsCustomPipelineMapOutput values.
// You can construct a concrete instance of `LogsCustomPipelineMapInput` via:
//
//          LogsCustomPipelineMap{ "key": LogsCustomPipelineArgs{...} }
type LogsCustomPipelineMapInput interface {
	pulumi.Input

	ToLogsCustomPipelineMapOutput() LogsCustomPipelineMapOutput
	ToLogsCustomPipelineMapOutputWithContext(context.Context) LogsCustomPipelineMapOutput
}

type LogsCustomPipelineMap map[string]LogsCustomPipelineInput

func (LogsCustomPipelineMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*LogsCustomPipeline)(nil))
}

func (i LogsCustomPipelineMap) ToLogsCustomPipelineMapOutput() LogsCustomPipelineMapOutput {
	return i.ToLogsCustomPipelineMapOutputWithContext(context.Background())
}

func (i LogsCustomPipelineMap) ToLogsCustomPipelineMapOutputWithContext(ctx context.Context) LogsCustomPipelineMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsCustomPipelineMapOutput)
}

type LogsCustomPipelineOutput struct {
	*pulumi.OutputState
}

func (LogsCustomPipelineOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LogsCustomPipeline)(nil))
}

func (o LogsCustomPipelineOutput) ToLogsCustomPipelineOutput() LogsCustomPipelineOutput {
	return o
}

func (o LogsCustomPipelineOutput) ToLogsCustomPipelineOutputWithContext(ctx context.Context) LogsCustomPipelineOutput {
	return o
}

func (o LogsCustomPipelineOutput) ToLogsCustomPipelinePtrOutput() LogsCustomPipelinePtrOutput {
	return o.ToLogsCustomPipelinePtrOutputWithContext(context.Background())
}

func (o LogsCustomPipelineOutput) ToLogsCustomPipelinePtrOutputWithContext(ctx context.Context) LogsCustomPipelinePtrOutput {
	return o.ApplyT(func(v LogsCustomPipeline) *LogsCustomPipeline {
		return &v
	}).(LogsCustomPipelinePtrOutput)
}

type LogsCustomPipelinePtrOutput struct {
	*pulumi.OutputState
}

func (LogsCustomPipelinePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogsCustomPipeline)(nil))
}

func (o LogsCustomPipelinePtrOutput) ToLogsCustomPipelinePtrOutput() LogsCustomPipelinePtrOutput {
	return o
}

func (o LogsCustomPipelinePtrOutput) ToLogsCustomPipelinePtrOutputWithContext(ctx context.Context) LogsCustomPipelinePtrOutput {
	return o
}

type LogsCustomPipelineArrayOutput struct{ *pulumi.OutputState }

func (LogsCustomPipelineArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]LogsCustomPipeline)(nil))
}

func (o LogsCustomPipelineArrayOutput) ToLogsCustomPipelineArrayOutput() LogsCustomPipelineArrayOutput {
	return o
}

func (o LogsCustomPipelineArrayOutput) ToLogsCustomPipelineArrayOutputWithContext(ctx context.Context) LogsCustomPipelineArrayOutput {
	return o
}

func (o LogsCustomPipelineArrayOutput) Index(i pulumi.IntInput) LogsCustomPipelineOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) LogsCustomPipeline {
		return vs[0].([]LogsCustomPipeline)[vs[1].(int)]
	}).(LogsCustomPipelineOutput)
}

type LogsCustomPipelineMapOutput struct{ *pulumi.OutputState }

func (LogsCustomPipelineMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]LogsCustomPipeline)(nil))
}

func (o LogsCustomPipelineMapOutput) ToLogsCustomPipelineMapOutput() LogsCustomPipelineMapOutput {
	return o
}

func (o LogsCustomPipelineMapOutput) ToLogsCustomPipelineMapOutputWithContext(ctx context.Context) LogsCustomPipelineMapOutput {
	return o
}

func (o LogsCustomPipelineMapOutput) MapIndex(k pulumi.StringInput) LogsCustomPipelineOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) LogsCustomPipeline {
		return vs[0].(map[string]LogsCustomPipeline)[vs[1].(string)]
	}).(LogsCustomPipelineOutput)
}

func init() {
	pulumi.RegisterOutputType(LogsCustomPipelineOutput{})
	pulumi.RegisterOutputType(LogsCustomPipelinePtrOutput{})
	pulumi.RegisterOutputType(LogsCustomPipelineArrayOutput{})
	pulumi.RegisterOutputType(LogsCustomPipelineMapOutput{})
}
