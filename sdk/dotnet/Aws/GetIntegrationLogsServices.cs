// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Aws
{
    public static class GetIntegrationLogsServices
    {
        /// <summary>
        /// Use this data source to retrieve all AWS log ready services.
        /// </summary>
        public static Task<GetIntegrationLogsServicesResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIntegrationLogsServicesResult>("datadog:aws/getIntegrationLogsServices:getIntegrationLogsServices", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetIntegrationLogsServicesResult
    {
        /// <summary>
        /// List of AWS log ready services.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetIntegrationLogsServicesAwsLogsServiceResult> AwsLogsServices;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetIntegrationLogsServicesResult(
            ImmutableArray<Outputs.GetIntegrationLogsServicesAwsLogsServiceResult> awsLogsServices,

            string id)
        {
            AwsLogsServices = awsLogsServices;
            Id = id;
        }
    }
}