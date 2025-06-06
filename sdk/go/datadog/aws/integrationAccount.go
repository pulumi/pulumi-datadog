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

// ## Import
//
// ```sh
// $ pulumi import datadog:aws/integrationAccount:IntegrationAccount example "<datadog-aws-account-config-id>"
// ```
//
//	AWS Account Config ID can be retrieved by using the [List all AWS integrations](https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations) endpoint and querying by AWS Account ID.
type IntegrationAccount struct {
	pulumi.CustomResourceState

	// Tags to apply to all metrics in the account. Defaults to `[]`.
	AccountTags pulumi.StringArrayOutput `pulumi:"accountTags"`
	// Configure how Datadog authenticates to your AWS account. Either `awsAuthConfigKeys` or `awsAuthConfigRole` block is required within.
	AuthConfig IntegrationAccountAuthConfigPtrOutput `pulumi:"authConfig"`
	// Your AWS Account ID without dashes.
	AwsAccountId pulumi.StringOutput `pulumi:"awsAccountId"`
	// AWS Account partition.
	AwsPartition pulumi.StringOutput `pulumi:"awsPartition"`
	// AWS regions to collect data from. Defaults to `includeAll` if block is empty.
	AwsRegions IntegrationAccountAwsRegionsPtrOutput `pulumi:"awsRegions"`
	// Configure log autosubscription for your Datadog Forwarder Lambda functions. The `lambdaFowarder` block is required within, but may be empty to use defaults.
	LogsConfig IntegrationAccountLogsConfigPtrOutput `pulumi:"logsConfig"`
	// Configure metrics collection from AWS CloudWatch. The `namespaceFilters` block is required within, but may be empty to use defaults.
	MetricsConfig IntegrationAccountMetricsConfigPtrOutput `pulumi:"metricsConfig"`
	// AWS resources collection config. May be empty to use defaults.
	ResourcesConfig IntegrationAccountResourcesConfigPtrOutput `pulumi:"resourcesConfig"`
	// AWS traces collection config. The `xrayServices` block is required within, but may be empty to use defaults.
	TracesConfig IntegrationAccountTracesConfigPtrOutput `pulumi:"tracesConfig"`
}

// NewIntegrationAccount registers a new resource with the given unique name, arguments, and options.
func NewIntegrationAccount(ctx *pulumi.Context,
	name string, args *IntegrationAccountArgs, opts ...pulumi.ResourceOption) (*IntegrationAccount, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AwsAccountId == nil {
		return nil, errors.New("invalid value for required argument 'AwsAccountId'")
	}
	if args.AwsPartition == nil {
		return nil, errors.New("invalid value for required argument 'AwsPartition'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IntegrationAccount
	err := ctx.RegisterResource("datadog:aws/integrationAccount:IntegrationAccount", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIntegrationAccount gets an existing IntegrationAccount resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIntegrationAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IntegrationAccountState, opts ...pulumi.ResourceOption) (*IntegrationAccount, error) {
	var resource IntegrationAccount
	err := ctx.ReadResource("datadog:aws/integrationAccount:IntegrationAccount", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IntegrationAccount resources.
type integrationAccountState struct {
	// Tags to apply to all metrics in the account. Defaults to `[]`.
	AccountTags []string `pulumi:"accountTags"`
	// Configure how Datadog authenticates to your AWS account. Either `awsAuthConfigKeys` or `awsAuthConfigRole` block is required within.
	AuthConfig *IntegrationAccountAuthConfig `pulumi:"authConfig"`
	// Your AWS Account ID without dashes.
	AwsAccountId *string `pulumi:"awsAccountId"`
	// AWS Account partition.
	AwsPartition *string `pulumi:"awsPartition"`
	// AWS regions to collect data from. Defaults to `includeAll` if block is empty.
	AwsRegions *IntegrationAccountAwsRegions `pulumi:"awsRegions"`
	// Configure log autosubscription for your Datadog Forwarder Lambda functions. The `lambdaFowarder` block is required within, but may be empty to use defaults.
	LogsConfig *IntegrationAccountLogsConfig `pulumi:"logsConfig"`
	// Configure metrics collection from AWS CloudWatch. The `namespaceFilters` block is required within, but may be empty to use defaults.
	MetricsConfig *IntegrationAccountMetricsConfig `pulumi:"metricsConfig"`
	// AWS resources collection config. May be empty to use defaults.
	ResourcesConfig *IntegrationAccountResourcesConfig `pulumi:"resourcesConfig"`
	// AWS traces collection config. The `xrayServices` block is required within, but may be empty to use defaults.
	TracesConfig *IntegrationAccountTracesConfig `pulumi:"tracesConfig"`
}

type IntegrationAccountState struct {
	// Tags to apply to all metrics in the account. Defaults to `[]`.
	AccountTags pulumi.StringArrayInput
	// Configure how Datadog authenticates to your AWS account. Either `awsAuthConfigKeys` or `awsAuthConfigRole` block is required within.
	AuthConfig IntegrationAccountAuthConfigPtrInput
	// Your AWS Account ID without dashes.
	AwsAccountId pulumi.StringPtrInput
	// AWS Account partition.
	AwsPartition pulumi.StringPtrInput
	// AWS regions to collect data from. Defaults to `includeAll` if block is empty.
	AwsRegions IntegrationAccountAwsRegionsPtrInput
	// Configure log autosubscription for your Datadog Forwarder Lambda functions. The `lambdaFowarder` block is required within, but may be empty to use defaults.
	LogsConfig IntegrationAccountLogsConfigPtrInput
	// Configure metrics collection from AWS CloudWatch. The `namespaceFilters` block is required within, but may be empty to use defaults.
	MetricsConfig IntegrationAccountMetricsConfigPtrInput
	// AWS resources collection config. May be empty to use defaults.
	ResourcesConfig IntegrationAccountResourcesConfigPtrInput
	// AWS traces collection config. The `xrayServices` block is required within, but may be empty to use defaults.
	TracesConfig IntegrationAccountTracesConfigPtrInput
}

func (IntegrationAccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationAccountState)(nil)).Elem()
}

type integrationAccountArgs struct {
	// Tags to apply to all metrics in the account. Defaults to `[]`.
	AccountTags []string `pulumi:"accountTags"`
	// Configure how Datadog authenticates to your AWS account. Either `awsAuthConfigKeys` or `awsAuthConfigRole` block is required within.
	AuthConfig *IntegrationAccountAuthConfig `pulumi:"authConfig"`
	// Your AWS Account ID without dashes.
	AwsAccountId string `pulumi:"awsAccountId"`
	// AWS Account partition.
	AwsPartition string `pulumi:"awsPartition"`
	// AWS regions to collect data from. Defaults to `includeAll` if block is empty.
	AwsRegions *IntegrationAccountAwsRegions `pulumi:"awsRegions"`
	// Configure log autosubscription for your Datadog Forwarder Lambda functions. The `lambdaFowarder` block is required within, but may be empty to use defaults.
	LogsConfig *IntegrationAccountLogsConfig `pulumi:"logsConfig"`
	// Configure metrics collection from AWS CloudWatch. The `namespaceFilters` block is required within, but may be empty to use defaults.
	MetricsConfig *IntegrationAccountMetricsConfig `pulumi:"metricsConfig"`
	// AWS resources collection config. May be empty to use defaults.
	ResourcesConfig *IntegrationAccountResourcesConfig `pulumi:"resourcesConfig"`
	// AWS traces collection config. The `xrayServices` block is required within, but may be empty to use defaults.
	TracesConfig *IntegrationAccountTracesConfig `pulumi:"tracesConfig"`
}

// The set of arguments for constructing a IntegrationAccount resource.
type IntegrationAccountArgs struct {
	// Tags to apply to all metrics in the account. Defaults to `[]`.
	AccountTags pulumi.StringArrayInput
	// Configure how Datadog authenticates to your AWS account. Either `awsAuthConfigKeys` or `awsAuthConfigRole` block is required within.
	AuthConfig IntegrationAccountAuthConfigPtrInput
	// Your AWS Account ID without dashes.
	AwsAccountId pulumi.StringInput
	// AWS Account partition.
	AwsPartition pulumi.StringInput
	// AWS regions to collect data from. Defaults to `includeAll` if block is empty.
	AwsRegions IntegrationAccountAwsRegionsPtrInput
	// Configure log autosubscription for your Datadog Forwarder Lambda functions. The `lambdaFowarder` block is required within, but may be empty to use defaults.
	LogsConfig IntegrationAccountLogsConfigPtrInput
	// Configure metrics collection from AWS CloudWatch. The `namespaceFilters` block is required within, but may be empty to use defaults.
	MetricsConfig IntegrationAccountMetricsConfigPtrInput
	// AWS resources collection config. May be empty to use defaults.
	ResourcesConfig IntegrationAccountResourcesConfigPtrInput
	// AWS traces collection config. The `xrayServices` block is required within, but may be empty to use defaults.
	TracesConfig IntegrationAccountTracesConfigPtrInput
}

func (IntegrationAccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationAccountArgs)(nil)).Elem()
}

type IntegrationAccountInput interface {
	pulumi.Input

	ToIntegrationAccountOutput() IntegrationAccountOutput
	ToIntegrationAccountOutputWithContext(ctx context.Context) IntegrationAccountOutput
}

func (*IntegrationAccount) ElementType() reflect.Type {
	return reflect.TypeOf((**IntegrationAccount)(nil)).Elem()
}

func (i *IntegrationAccount) ToIntegrationAccountOutput() IntegrationAccountOutput {
	return i.ToIntegrationAccountOutputWithContext(context.Background())
}

func (i *IntegrationAccount) ToIntegrationAccountOutputWithContext(ctx context.Context) IntegrationAccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationAccountOutput)
}

// IntegrationAccountArrayInput is an input type that accepts IntegrationAccountArray and IntegrationAccountArrayOutput values.
// You can construct a concrete instance of `IntegrationAccountArrayInput` via:
//
//	IntegrationAccountArray{ IntegrationAccountArgs{...} }
type IntegrationAccountArrayInput interface {
	pulumi.Input

	ToIntegrationAccountArrayOutput() IntegrationAccountArrayOutput
	ToIntegrationAccountArrayOutputWithContext(context.Context) IntegrationAccountArrayOutput
}

type IntegrationAccountArray []IntegrationAccountInput

func (IntegrationAccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IntegrationAccount)(nil)).Elem()
}

func (i IntegrationAccountArray) ToIntegrationAccountArrayOutput() IntegrationAccountArrayOutput {
	return i.ToIntegrationAccountArrayOutputWithContext(context.Background())
}

func (i IntegrationAccountArray) ToIntegrationAccountArrayOutputWithContext(ctx context.Context) IntegrationAccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationAccountArrayOutput)
}

// IntegrationAccountMapInput is an input type that accepts IntegrationAccountMap and IntegrationAccountMapOutput values.
// You can construct a concrete instance of `IntegrationAccountMapInput` via:
//
//	IntegrationAccountMap{ "key": IntegrationAccountArgs{...} }
type IntegrationAccountMapInput interface {
	pulumi.Input

	ToIntegrationAccountMapOutput() IntegrationAccountMapOutput
	ToIntegrationAccountMapOutputWithContext(context.Context) IntegrationAccountMapOutput
}

type IntegrationAccountMap map[string]IntegrationAccountInput

func (IntegrationAccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IntegrationAccount)(nil)).Elem()
}

func (i IntegrationAccountMap) ToIntegrationAccountMapOutput() IntegrationAccountMapOutput {
	return i.ToIntegrationAccountMapOutputWithContext(context.Background())
}

func (i IntegrationAccountMap) ToIntegrationAccountMapOutputWithContext(ctx context.Context) IntegrationAccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationAccountMapOutput)
}

type IntegrationAccountOutput struct{ *pulumi.OutputState }

func (IntegrationAccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IntegrationAccount)(nil)).Elem()
}

func (o IntegrationAccountOutput) ToIntegrationAccountOutput() IntegrationAccountOutput {
	return o
}

func (o IntegrationAccountOutput) ToIntegrationAccountOutputWithContext(ctx context.Context) IntegrationAccountOutput {
	return o
}

// Tags to apply to all metrics in the account. Defaults to `[]`.
func (o IntegrationAccountOutput) AccountTags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IntegrationAccount) pulumi.StringArrayOutput { return v.AccountTags }).(pulumi.StringArrayOutput)
}

// Configure how Datadog authenticates to your AWS account. Either `awsAuthConfigKeys` or `awsAuthConfigRole` block is required within.
func (o IntegrationAccountOutput) AuthConfig() IntegrationAccountAuthConfigPtrOutput {
	return o.ApplyT(func(v *IntegrationAccount) IntegrationAccountAuthConfigPtrOutput { return v.AuthConfig }).(IntegrationAccountAuthConfigPtrOutput)
}

// Your AWS Account ID without dashes.
func (o IntegrationAccountOutput) AwsAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *IntegrationAccount) pulumi.StringOutput { return v.AwsAccountId }).(pulumi.StringOutput)
}

// AWS Account partition.
func (o IntegrationAccountOutput) AwsPartition() pulumi.StringOutput {
	return o.ApplyT(func(v *IntegrationAccount) pulumi.StringOutput { return v.AwsPartition }).(pulumi.StringOutput)
}

// AWS regions to collect data from. Defaults to `includeAll` if block is empty.
func (o IntegrationAccountOutput) AwsRegions() IntegrationAccountAwsRegionsPtrOutput {
	return o.ApplyT(func(v *IntegrationAccount) IntegrationAccountAwsRegionsPtrOutput { return v.AwsRegions }).(IntegrationAccountAwsRegionsPtrOutput)
}

// Configure log autosubscription for your Datadog Forwarder Lambda functions. The `lambdaFowarder` block is required within, but may be empty to use defaults.
func (o IntegrationAccountOutput) LogsConfig() IntegrationAccountLogsConfigPtrOutput {
	return o.ApplyT(func(v *IntegrationAccount) IntegrationAccountLogsConfigPtrOutput { return v.LogsConfig }).(IntegrationAccountLogsConfigPtrOutput)
}

// Configure metrics collection from AWS CloudWatch. The `namespaceFilters` block is required within, but may be empty to use defaults.
func (o IntegrationAccountOutput) MetricsConfig() IntegrationAccountMetricsConfigPtrOutput {
	return o.ApplyT(func(v *IntegrationAccount) IntegrationAccountMetricsConfigPtrOutput { return v.MetricsConfig }).(IntegrationAccountMetricsConfigPtrOutput)
}

// AWS resources collection config. May be empty to use defaults.
func (o IntegrationAccountOutput) ResourcesConfig() IntegrationAccountResourcesConfigPtrOutput {
	return o.ApplyT(func(v *IntegrationAccount) IntegrationAccountResourcesConfigPtrOutput { return v.ResourcesConfig }).(IntegrationAccountResourcesConfigPtrOutput)
}

// AWS traces collection config. The `xrayServices` block is required within, but may be empty to use defaults.
func (o IntegrationAccountOutput) TracesConfig() IntegrationAccountTracesConfigPtrOutput {
	return o.ApplyT(func(v *IntegrationAccount) IntegrationAccountTracesConfigPtrOutput { return v.TracesConfig }).(IntegrationAccountTracesConfigPtrOutput)
}

type IntegrationAccountArrayOutput struct{ *pulumi.OutputState }

func (IntegrationAccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IntegrationAccount)(nil)).Elem()
}

func (o IntegrationAccountArrayOutput) ToIntegrationAccountArrayOutput() IntegrationAccountArrayOutput {
	return o
}

func (o IntegrationAccountArrayOutput) ToIntegrationAccountArrayOutputWithContext(ctx context.Context) IntegrationAccountArrayOutput {
	return o
}

func (o IntegrationAccountArrayOutput) Index(i pulumi.IntInput) IntegrationAccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IntegrationAccount {
		return vs[0].([]*IntegrationAccount)[vs[1].(int)]
	}).(IntegrationAccountOutput)
}

type IntegrationAccountMapOutput struct{ *pulumi.OutputState }

func (IntegrationAccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IntegrationAccount)(nil)).Elem()
}

func (o IntegrationAccountMapOutput) ToIntegrationAccountMapOutput() IntegrationAccountMapOutput {
	return o
}

func (o IntegrationAccountMapOutput) ToIntegrationAccountMapOutputWithContext(ctx context.Context) IntegrationAccountMapOutput {
	return o
}

func (o IntegrationAccountMapOutput) MapIndex(k pulumi.StringInput) IntegrationAccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IntegrationAccount {
		return vs[0].(map[string]*IntegrationAccount)[vs[1].(string)]
	}).(IntegrationAccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationAccountInput)(nil)).Elem(), &IntegrationAccount{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationAccountArrayInput)(nil)).Elem(), IntegrationAccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationAccountMapInput)(nil)).Elem(), IntegrationAccountMap{})
	pulumi.RegisterOutputType(IntegrationAccountOutput{})
	pulumi.RegisterOutputType(IntegrationAccountArrayOutput{})
	pulumi.RegisterOutputType(IntegrationAccountMapOutput{})
}
