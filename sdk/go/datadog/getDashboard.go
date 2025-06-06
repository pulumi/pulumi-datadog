// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datadog

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about an existing dashboard, for use in other resources. In particular, it can be used in a monitor message to link to a specific dashboard.
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
//			_, err := datadog.LookupDashboard(ctx, &datadog.LookupDashboardArgs{
//				Name: "My super dashboard",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDashboard(ctx *pulumi.Context, args *LookupDashboardArgs, opts ...pulumi.InvokeOption) (*LookupDashboardResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDashboardResult
	err := ctx.Invoke("datadog:index/getDashboard:getDashboard", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDashboard.
type LookupDashboardArgs struct {
	// The dashboard name to search for. Must only match one dashboard.
	Name string `pulumi:"name"`
}

// A collection of values returned by getDashboard.
type LookupDashboardResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The dashboard name to search for. Must only match one dashboard.
	Name string `pulumi:"name"`
	// The name of the dashboard.
	Title string `pulumi:"title"`
	// The URL to a specific dashboard.
	Url string `pulumi:"url"`
}

func LookupDashboardOutput(ctx *pulumi.Context, args LookupDashboardOutputArgs, opts ...pulumi.InvokeOption) LookupDashboardResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDashboardResultOutput, error) {
			args := v.(LookupDashboardArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("datadog:index/getDashboard:getDashboard", args, LookupDashboardResultOutput{}, options).(LookupDashboardResultOutput), nil
		}).(LookupDashboardResultOutput)
}

// A collection of arguments for invoking getDashboard.
type LookupDashboardOutputArgs struct {
	// The dashboard name to search for. Must only match one dashboard.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupDashboardOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDashboardArgs)(nil)).Elem()
}

// A collection of values returned by getDashboard.
type LookupDashboardResultOutput struct{ *pulumi.OutputState }

func (LookupDashboardResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDashboardResult)(nil)).Elem()
}

func (o LookupDashboardResultOutput) ToLookupDashboardResultOutput() LookupDashboardResultOutput {
	return o
}

func (o LookupDashboardResultOutput) ToLookupDashboardResultOutputWithContext(ctx context.Context) LookupDashboardResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDashboardResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDashboardResult) string { return v.Id }).(pulumi.StringOutput)
}

// The dashboard name to search for. Must only match one dashboard.
func (o LookupDashboardResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDashboardResult) string { return v.Name }).(pulumi.StringOutput)
}

// The name of the dashboard.
func (o LookupDashboardResultOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDashboardResult) string { return v.Title }).(pulumi.StringOutput)
}

// The URL to a specific dashboard.
func (o LookupDashboardResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDashboardResult) string { return v.Url }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDashboardResultOutput{})
}
