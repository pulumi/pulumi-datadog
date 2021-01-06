// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package datadog

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to retrieve information about an existing dashboard list, for use in other resources. In particular, it can be used in a dashboard to register it in the list.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-datadog/sdk/v2/go/datadog"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := datadog.LookupDashboardList(ctx, &datadog.LookupDashboardListArgs{
// 			Name: "My super list",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupDashboardList(ctx *pulumi.Context, args *LookupDashboardListArgs, opts ...pulumi.InvokeOption) (*LookupDashboardListResult, error) {
	var rv LookupDashboardListResult
	err := ctx.Invoke("datadog:index/getDashboardList:getDashboardList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDashboardList.
type LookupDashboardListArgs struct {
	Name string `pulumi:"name"`
}

// A collection of values returned by getDashboardList.
type LookupDashboardListResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}