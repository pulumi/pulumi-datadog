// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve all available AWS namespaces. This is the list of allowed values for `metrics_config.namespace_filters` `includeOnly` or `excludeOnly` in `aws.IntegrationAccount` resource.
func GetIntegrationAvailableNamespaces(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetIntegrationAvailableNamespacesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetIntegrationAvailableNamespacesResult
	err := ctx.Invoke("datadog:aws/getIntegrationAvailableNamespaces:getIntegrationAvailableNamespaces", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getIntegrationAvailableNamespaces.
type GetIntegrationAvailableNamespacesResult struct {
	// List of available AWS namespaces.
	AwsNamespaces []string `pulumi:"awsNamespaces"`
	// The ID of this resource.
	Id string `pulumi:"id"`
}

func GetIntegrationAvailableNamespacesOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetIntegrationAvailableNamespacesResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetIntegrationAvailableNamespacesResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("datadog:aws/getIntegrationAvailableNamespaces:getIntegrationAvailableNamespaces", nil, GetIntegrationAvailableNamespacesResultOutput{}, options).(GetIntegrationAvailableNamespacesResultOutput), nil
	}).(GetIntegrationAvailableNamespacesResultOutput)
}

// A collection of values returned by getIntegrationAvailableNamespaces.
type GetIntegrationAvailableNamespacesResultOutput struct{ *pulumi.OutputState }

func (GetIntegrationAvailableNamespacesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIntegrationAvailableNamespacesResult)(nil)).Elem()
}

func (o GetIntegrationAvailableNamespacesResultOutput) ToGetIntegrationAvailableNamespacesResultOutput() GetIntegrationAvailableNamespacesResultOutput {
	return o
}

func (o GetIntegrationAvailableNamespacesResultOutput) ToGetIntegrationAvailableNamespacesResultOutputWithContext(ctx context.Context) GetIntegrationAvailableNamespacesResultOutput {
	return o
}

// List of available AWS namespaces.
func (o GetIntegrationAvailableNamespacesResultOutput) AwsNamespaces() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetIntegrationAvailableNamespacesResult) []string { return v.AwsNamespaces }).(pulumi.StringArrayOutput)
}

// The ID of this resource.
func (o GetIntegrationAvailableNamespacesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIntegrationAvailableNamespacesResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIntegrationAvailableNamespacesResultOutput{})
}