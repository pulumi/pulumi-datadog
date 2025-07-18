// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datadog

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Datadog webhook resource. This can be used to create and manage Datadog webhooks.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"custom": "header",
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			tmpJSON1, err := json.Marshal(map[string]interface{}{
//				"custom": "payload",
//			})
//			if err != nil {
//				return err
//			}
//			json1 := string(tmpJSON1)
//			// Create a new Datadog webhook
//			_, err = datadog.NewWebhook(ctx, "foo", &datadog.WebhookArgs{
//				Name:          pulumi.String("test-webhook"),
//				Url:           pulumi.String("example.com"),
//				EncodeAs:      pulumi.String("json"),
//				CustomHeaders: pulumi.String(json0),
//				Payload:       pulumi.String(json1),
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
// ```sh
// $ pulumi import datadog:index/webhook:Webhook foo example-webhook
// ```
type Webhook struct {
	pulumi.CustomResourceState

	// The headers attached to the webhook.
	CustomHeaders pulumi.StringPtrOutput `pulumi:"customHeaders"`
	// Encoding type. Valid values are `json`, `form`.
	EncodeAs pulumi.StringOutput `pulumi:"encodeAs"`
	// The name of the webhook. It corresponds with `<WEBHOOK_NAME>`.
	Name pulumi.StringOutput `pulumi:"name"`
	// The payload of the webhook.
	Payload pulumi.StringOutput `pulumi:"payload"`
	// The URL of the webhook.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewWebhook registers a new resource with the given unique name, arguments, and options.
func NewWebhook(ctx *pulumi.Context,
	name string, args *WebhookArgs, opts ...pulumi.ResourceOption) (*Webhook, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Webhook
	err := ctx.RegisterResource("datadog:index/webhook:Webhook", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWebhook gets an existing Webhook resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWebhook(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WebhookState, opts ...pulumi.ResourceOption) (*Webhook, error) {
	var resource Webhook
	err := ctx.ReadResource("datadog:index/webhook:Webhook", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Webhook resources.
type webhookState struct {
	// The headers attached to the webhook.
	CustomHeaders *string `pulumi:"customHeaders"`
	// Encoding type. Valid values are `json`, `form`.
	EncodeAs *string `pulumi:"encodeAs"`
	// The name of the webhook. It corresponds with `<WEBHOOK_NAME>`.
	Name *string `pulumi:"name"`
	// The payload of the webhook.
	Payload *string `pulumi:"payload"`
	// The URL of the webhook.
	Url *string `pulumi:"url"`
}

type WebhookState struct {
	// The headers attached to the webhook.
	CustomHeaders pulumi.StringPtrInput
	// Encoding type. Valid values are `json`, `form`.
	EncodeAs pulumi.StringPtrInput
	// The name of the webhook. It corresponds with `<WEBHOOK_NAME>`.
	Name pulumi.StringPtrInput
	// The payload of the webhook.
	Payload pulumi.StringPtrInput
	// The URL of the webhook.
	Url pulumi.StringPtrInput
}

func (WebhookState) ElementType() reflect.Type {
	return reflect.TypeOf((*webhookState)(nil)).Elem()
}

type webhookArgs struct {
	// The headers attached to the webhook.
	CustomHeaders *string `pulumi:"customHeaders"`
	// Encoding type. Valid values are `json`, `form`.
	EncodeAs *string `pulumi:"encodeAs"`
	// The name of the webhook. It corresponds with `<WEBHOOK_NAME>`.
	Name string `pulumi:"name"`
	// The payload of the webhook.
	Payload *string `pulumi:"payload"`
	// The URL of the webhook.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a Webhook resource.
type WebhookArgs struct {
	// The headers attached to the webhook.
	CustomHeaders pulumi.StringPtrInput
	// Encoding type. Valid values are `json`, `form`.
	EncodeAs pulumi.StringPtrInput
	// The name of the webhook. It corresponds with `<WEBHOOK_NAME>`.
	Name pulumi.StringInput
	// The payload of the webhook.
	Payload pulumi.StringPtrInput
	// The URL of the webhook.
	Url pulumi.StringInput
}

func (WebhookArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*webhookArgs)(nil)).Elem()
}

type WebhookInput interface {
	pulumi.Input

	ToWebhookOutput() WebhookOutput
	ToWebhookOutputWithContext(ctx context.Context) WebhookOutput
}

func (*Webhook) ElementType() reflect.Type {
	return reflect.TypeOf((**Webhook)(nil)).Elem()
}

func (i *Webhook) ToWebhookOutput() WebhookOutput {
	return i.ToWebhookOutputWithContext(context.Background())
}

func (i *Webhook) ToWebhookOutputWithContext(ctx context.Context) WebhookOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookOutput)
}

// WebhookArrayInput is an input type that accepts WebhookArray and WebhookArrayOutput values.
// You can construct a concrete instance of `WebhookArrayInput` via:
//
//	WebhookArray{ WebhookArgs{...} }
type WebhookArrayInput interface {
	pulumi.Input

	ToWebhookArrayOutput() WebhookArrayOutput
	ToWebhookArrayOutputWithContext(context.Context) WebhookArrayOutput
}

type WebhookArray []WebhookInput

func (WebhookArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Webhook)(nil)).Elem()
}

func (i WebhookArray) ToWebhookArrayOutput() WebhookArrayOutput {
	return i.ToWebhookArrayOutputWithContext(context.Background())
}

func (i WebhookArray) ToWebhookArrayOutputWithContext(ctx context.Context) WebhookArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookArrayOutput)
}

// WebhookMapInput is an input type that accepts WebhookMap and WebhookMapOutput values.
// You can construct a concrete instance of `WebhookMapInput` via:
//
//	WebhookMap{ "key": WebhookArgs{...} }
type WebhookMapInput interface {
	pulumi.Input

	ToWebhookMapOutput() WebhookMapOutput
	ToWebhookMapOutputWithContext(context.Context) WebhookMapOutput
}

type WebhookMap map[string]WebhookInput

func (WebhookMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Webhook)(nil)).Elem()
}

func (i WebhookMap) ToWebhookMapOutput() WebhookMapOutput {
	return i.ToWebhookMapOutputWithContext(context.Background())
}

func (i WebhookMap) ToWebhookMapOutputWithContext(ctx context.Context) WebhookMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookMapOutput)
}

type WebhookOutput struct{ *pulumi.OutputState }

func (WebhookOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Webhook)(nil)).Elem()
}

func (o WebhookOutput) ToWebhookOutput() WebhookOutput {
	return o
}

func (o WebhookOutput) ToWebhookOutputWithContext(ctx context.Context) WebhookOutput {
	return o
}

// The headers attached to the webhook.
func (o WebhookOutput) CustomHeaders() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringPtrOutput { return v.CustomHeaders }).(pulumi.StringPtrOutput)
}

// Encoding type. Valid values are `json`, `form`.
func (o WebhookOutput) EncodeAs() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.EncodeAs }).(pulumi.StringOutput)
}

// The name of the webhook. It corresponds with `<WEBHOOK_NAME>`.
func (o WebhookOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The payload of the webhook.
func (o WebhookOutput) Payload() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.Payload }).(pulumi.StringOutput)
}

// The URL of the webhook.
func (o WebhookOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type WebhookArrayOutput struct{ *pulumi.OutputState }

func (WebhookArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Webhook)(nil)).Elem()
}

func (o WebhookArrayOutput) ToWebhookArrayOutput() WebhookArrayOutput {
	return o
}

func (o WebhookArrayOutput) ToWebhookArrayOutputWithContext(ctx context.Context) WebhookArrayOutput {
	return o
}

func (o WebhookArrayOutput) Index(i pulumi.IntInput) WebhookOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Webhook {
		return vs[0].([]*Webhook)[vs[1].(int)]
	}).(WebhookOutput)
}

type WebhookMapOutput struct{ *pulumi.OutputState }

func (WebhookMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Webhook)(nil)).Elem()
}

func (o WebhookMapOutput) ToWebhookMapOutput() WebhookMapOutput {
	return o
}

func (o WebhookMapOutput) ToWebhookMapOutputWithContext(ctx context.Context) WebhookMapOutput {
	return o
}

func (o WebhookMapOutput) MapIndex(k pulumi.StringInput) WebhookOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Webhook {
		return vs[0].(map[string]*Webhook)[vs[1].(string)]
	}).(WebhookOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookInput)(nil)).Elem(), &Webhook{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookArrayInput)(nil)).Elem(), WebhookArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookMapInput)(nil)).Elem(), WebhookMap{})
	pulumi.RegisterOutputType(WebhookOutput{})
	pulumi.RegisterOutputType(WebhookArrayOutput{})
	pulumi.RegisterOutputType(WebhookMapOutput{})
}
