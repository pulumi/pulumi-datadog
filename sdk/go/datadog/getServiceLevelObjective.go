// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datadog

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about an existing SLO for use in other resources.
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
//			_, err := datadog.LookupServiceLevelObjective(ctx, &datadog.LookupServiceLevelObjectiveArgs{
//				NameQuery: pulumi.StringRef("My test SLO"),
//				TagsQuery: pulumi.StringRef("foo:bar"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = datadog.LookupServiceLevelObjective(ctx, &datadog.LookupServiceLevelObjectiveArgs{
//				Id: pulumi.StringRef(api.Outputs.Slo),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupServiceLevelObjective(ctx *pulumi.Context, args *LookupServiceLevelObjectiveArgs, opts ...pulumi.InvokeOption) (*LookupServiceLevelObjectiveResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceLevelObjectiveResult
	err := ctx.Invoke("datadog:index/getServiceLevelObjective:getServiceLevelObjective", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceLevelObjective.
type LookupServiceLevelObjectiveArgs struct {
	// A SLO ID to limit the search.
	Id *string `pulumi:"id"`
	// Filter results based on SLO numerator and denominator.
	MetricsQuery *string `pulumi:"metricsQuery"`
	// Filter results based on SLO names.
	NameQuery *string `pulumi:"nameQuery"`
	// Filter results based on a single SLO tag.
	TagsQuery *string `pulumi:"tagsQuery"`
}

// A collection of values returned by getServiceLevelObjective.
type LookupServiceLevelObjectiveResult struct {
	// The description of the service level objective.
	Description string `pulumi:"description"`
	// A SLO ID to limit the search.
	Id *string `pulumi:"id"`
	// Filter results based on SLO numerator and denominator.
	MetricsQuery *string `pulumi:"metricsQuery"`
	// Name of the Datadog service level objective
	Name string `pulumi:"name"`
	// Filter results based on SLO names.
	NameQuery *string `pulumi:"nameQuery"`
	// The metric query of good / total events
	Queries []GetServiceLevelObjectiveQuery `pulumi:"queries"`
	// Filter results based on a single SLO tag.
	TagsQuery *string `pulumi:"tagsQuery"`
	// The primary target threshold of the service level objective.
	TargetThreshold float64 `pulumi:"targetThreshold"`
	// The primary timeframe of the service level objective.
	Timeframe string `pulumi:"timeframe"`
	// The type of the service level objective. The mapping from these types to the types found in the Datadog Web UI can be found in the Datadog API [documentation page](https://docs.datadoghq.com/api/v1/service-level-objectives/#create-a-slo-object). Available values are: `metric` and `monitor`.
	Type string `pulumi:"type"`
	// The primary warning threshold of the service level objective.
	WarningThreshold float64 `pulumi:"warningThreshold"`
}

func LookupServiceLevelObjectiveOutput(ctx *pulumi.Context, args LookupServiceLevelObjectiveOutputArgs, opts ...pulumi.InvokeOption) LookupServiceLevelObjectiveResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupServiceLevelObjectiveResultOutput, error) {
			args := v.(LookupServiceLevelObjectiveArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("datadog:index/getServiceLevelObjective:getServiceLevelObjective", args, LookupServiceLevelObjectiveResultOutput{}, options).(LookupServiceLevelObjectiveResultOutput), nil
		}).(LookupServiceLevelObjectiveResultOutput)
}

// A collection of arguments for invoking getServiceLevelObjective.
type LookupServiceLevelObjectiveOutputArgs struct {
	// A SLO ID to limit the search.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Filter results based on SLO numerator and denominator.
	MetricsQuery pulumi.StringPtrInput `pulumi:"metricsQuery"`
	// Filter results based on SLO names.
	NameQuery pulumi.StringPtrInput `pulumi:"nameQuery"`
	// Filter results based on a single SLO tag.
	TagsQuery pulumi.StringPtrInput `pulumi:"tagsQuery"`
}

func (LookupServiceLevelObjectiveOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceLevelObjectiveArgs)(nil)).Elem()
}

// A collection of values returned by getServiceLevelObjective.
type LookupServiceLevelObjectiveResultOutput struct{ *pulumi.OutputState }

func (LookupServiceLevelObjectiveResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceLevelObjectiveResult)(nil)).Elem()
}

func (o LookupServiceLevelObjectiveResultOutput) ToLookupServiceLevelObjectiveResultOutput() LookupServiceLevelObjectiveResultOutput {
	return o
}

func (o LookupServiceLevelObjectiveResultOutput) ToLookupServiceLevelObjectiveResultOutputWithContext(ctx context.Context) LookupServiceLevelObjectiveResultOutput {
	return o
}

// The description of the service level objective.
func (o LookupServiceLevelObjectiveResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLevelObjectiveResult) string { return v.Description }).(pulumi.StringOutput)
}

// A SLO ID to limit the search.
func (o LookupServiceLevelObjectiveResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceLevelObjectiveResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

// Filter results based on SLO numerator and denominator.
func (o LookupServiceLevelObjectiveResultOutput) MetricsQuery() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceLevelObjectiveResult) *string { return v.MetricsQuery }).(pulumi.StringPtrOutput)
}

// Name of the Datadog service level objective
func (o LookupServiceLevelObjectiveResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLevelObjectiveResult) string { return v.Name }).(pulumi.StringOutput)
}

// Filter results based on SLO names.
func (o LookupServiceLevelObjectiveResultOutput) NameQuery() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceLevelObjectiveResult) *string { return v.NameQuery }).(pulumi.StringPtrOutput)
}

// The metric query of good / total events
func (o LookupServiceLevelObjectiveResultOutput) Queries() GetServiceLevelObjectiveQueryArrayOutput {
	return o.ApplyT(func(v LookupServiceLevelObjectiveResult) []GetServiceLevelObjectiveQuery { return v.Queries }).(GetServiceLevelObjectiveQueryArrayOutput)
}

// Filter results based on a single SLO tag.
func (o LookupServiceLevelObjectiveResultOutput) TagsQuery() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceLevelObjectiveResult) *string { return v.TagsQuery }).(pulumi.StringPtrOutput)
}

// The primary target threshold of the service level objective.
func (o LookupServiceLevelObjectiveResultOutput) TargetThreshold() pulumi.Float64Output {
	return o.ApplyT(func(v LookupServiceLevelObjectiveResult) float64 { return v.TargetThreshold }).(pulumi.Float64Output)
}

// The primary timeframe of the service level objective.
func (o LookupServiceLevelObjectiveResultOutput) Timeframe() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLevelObjectiveResult) string { return v.Timeframe }).(pulumi.StringOutput)
}

// The type of the service level objective. The mapping from these types to the types found in the Datadog Web UI can be found in the Datadog API [documentation page](https://docs.datadoghq.com/api/v1/service-level-objectives/#create-a-slo-object). Available values are: `metric` and `monitor`.
func (o LookupServiceLevelObjectiveResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLevelObjectiveResult) string { return v.Type }).(pulumi.StringOutput)
}

// The primary warning threshold of the service level objective.
func (o LookupServiceLevelObjectiveResultOutput) WarningThreshold() pulumi.Float64Output {
	return o.ApplyT(func(v LookupServiceLevelObjectiveResult) float64 { return v.WarningThreshold }).(pulumi.Float64Output)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceLevelObjectiveResultOutput{})
}
