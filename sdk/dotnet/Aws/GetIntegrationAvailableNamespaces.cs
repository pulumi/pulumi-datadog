// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Aws
{
    public static class GetIntegrationAvailableNamespaces
    {
        /// <summary>
        /// Use this data source to retrieve all available AWS namespaces. This is the list of allowed values for `metrics_config.namespace_filters` `include_only` or `exclude_only` in `datadog.aws.IntegrationAccount` resource.
        /// </summary>
        public static Task<GetIntegrationAvailableNamespacesResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIntegrationAvailableNamespacesResult>("datadog:aws/getIntegrationAvailableNamespaces:getIntegrationAvailableNamespaces", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve all available AWS namespaces. This is the list of allowed values for `metrics_config.namespace_filters` `include_only` or `exclude_only` in `datadog.aws.IntegrationAccount` resource.
        /// </summary>
        public static Output<GetIntegrationAvailableNamespacesResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIntegrationAvailableNamespacesResult>("datadog:aws/getIntegrationAvailableNamespaces:getIntegrationAvailableNamespaces", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve all available AWS namespaces. This is the list of allowed values for `metrics_config.namespace_filters` `include_only` or `exclude_only` in `datadog.aws.IntegrationAccount` resource.
        /// </summary>
        public static Output<GetIntegrationAvailableNamespacesResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetIntegrationAvailableNamespacesResult>("datadog:aws/getIntegrationAvailableNamespaces:getIntegrationAvailableNamespaces", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetIntegrationAvailableNamespacesResult
    {
        /// <summary>
        /// List of available AWS namespaces.
        /// </summary>
        public readonly ImmutableArray<string> AwsNamespaces;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetIntegrationAvailableNamespacesResult(
            ImmutableArray<string> awsNamespaces,

            string id)
        {
            AwsNamespaces = awsNamespaces;
            Id = id;
        }
    }
}
