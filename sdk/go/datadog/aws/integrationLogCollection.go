// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Datadog - Amazon Web Services integration log collection resource. This can be used to manage which
// AWS services logs are collected from for an account.
type IntegrationLogCollection struct {
	pulumi.CustomResourceState

	// Your AWS Account ID without dashes.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// A list of services to collect logs from. See the
	// [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which
	// services are supported.
	Services pulumi.StringArrayOutput `pulumi:"services"`
}

// NewIntegrationLogCollection registers a new resource with the given unique name, arguments, and options.
func NewIntegrationLogCollection(ctx *pulumi.Context,
	name string, args *IntegrationLogCollectionArgs, opts ...pulumi.ResourceOption) (*IntegrationLogCollection, error) {
	if args == nil || args.AccountId == nil {
		return nil, errors.New("missing required argument 'AccountId'")
	}
	if args == nil || args.Services == nil {
		return nil, errors.New("missing required argument 'Services'")
	}
	if args == nil {
		args = &IntegrationLogCollectionArgs{}
	}
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
	// A list of services to collect logs from. See the
	// [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which
	// services are supported.
	Services []string `pulumi:"services"`
}

type IntegrationLogCollectionState struct {
	// Your AWS Account ID without dashes.
	AccountId pulumi.StringPtrInput
	// A list of services to collect logs from. See the
	// [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which
	// services are supported.
	Services pulumi.StringArrayInput
}

func (IntegrationLogCollectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationLogCollectionState)(nil)).Elem()
}

type integrationLogCollectionArgs struct {
	// Your AWS Account ID without dashes.
	AccountId string `pulumi:"accountId"`
	// A list of services to collect logs from. See the
	// [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which
	// services are supported.
	Services []string `pulumi:"services"`
}

// The set of arguments for constructing a IntegrationLogCollection resource.
type IntegrationLogCollectionArgs struct {
	// Your AWS Account ID without dashes.
	AccountId pulumi.StringInput
	// A list of services to collect logs from. See the
	// [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which
	// services are supported.
	Services pulumi.StringArrayInput
}

func (IntegrationLogCollectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationLogCollectionArgs)(nil)).Elem()
}