// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

var _ = internal.GetEnvOrDefault

// (Required unless validate is false) Datadog API key. This can also be set via the DD_API_KEY environment variable.
func GetApiKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "datadog:apiKey")
}

// The API URL. This can also be set via the DD_HOST environment variable, and defaults to `https://api.datadoghq.com`.
// Note that this URL must not end with the `/api/` path. For example, `https://api.datadoghq.com/` is a correct value,
// while `https://api.datadoghq.com/api/` is not. And if you're working with "EU" version of Datadog, use
// `https://api.datadoghq.eu/`. Other Datadog region examples: `https://api.us5.datadoghq.com/`,
// `https://api.us3.datadoghq.com/` and `https://api.ddog-gov.com/`. See https://docs.datadoghq.com/getting_started/site/
// for all available regions.
func GetApiUrl(ctx *pulumi.Context) string {
	return config.Get(ctx, "datadog:apiUrl")
}

// (Required unless validate is false) Datadog APP key. This can also be set via the DD_APP_KEY environment variable.
func GetAppKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "datadog:appKey")
}

// [Experimental - Logs Pipelines, Monitors Security Monitoring Rules, and Service Level Objectives only] Configuration
// block containing settings to apply default resource tags across all resources.
func GetDefaultTags(ctx *pulumi.Context) string {
	return config.Get(ctx, "datadog:defaultTags")
}

// The HTTP request retry back off base. Defaults to 2.
func GetHttpClientRetryBackoffBase(ctx *pulumi.Context) int {
	return config.GetInt(ctx, "datadog:httpClientRetryBackoffBase")
}

// The HTTP request retry back off multiplier. Defaults to 2.
func GetHttpClientRetryBackoffMultiplier(ctx *pulumi.Context) int {
	return config.GetInt(ctx, "datadog:httpClientRetryBackoffMultiplier")
}

// Enables request retries on HTTP status codes 429 and 5xx. Valid values are [`true`, `false`]. Defaults to `true`.
func GetHttpClientRetryEnabled(ctx *pulumi.Context) string {
	return config.Get(ctx, "datadog:httpClientRetryEnabled")
}

// The HTTP request maximum retry number. Defaults to 3.
func GetHttpClientRetryMaxRetries(ctx *pulumi.Context) int {
	return config.GetInt(ctx, "datadog:httpClientRetryMaxRetries")
}

// The HTTP request retry timeout period. Defaults to 60 seconds.
func GetHttpClientRetryTimeout(ctx *pulumi.Context) int {
	return config.GetInt(ctx, "datadog:httpClientRetryTimeout")
}

// Enables validation of the provided API key during provider initialization. Valid values are [`true`, `false`]. Default
// is true. When false, apiKey won't be checked.
func GetValidate(ctx *pulumi.Context) string {
	return config.Get(ctx, "datadog:validate")
}
