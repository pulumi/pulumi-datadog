// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Aws.Outputs
{

    [OutputType]
    public sealed class IntegrationAccountLogsConfigLambdaForwarder
    {
        /// <summary>
        /// List of Datadog Lambda Log Forwarder ARNs in your AWS account. Defaults to `[]`.
        /// </summary>
        public readonly ImmutableArray<string> Lambdas;
        /// <summary>
        /// List of service IDs set to enable automatic log collection. Use `datadog.aws.getIntegrationAvailableLogsServices` data source or [the AWS Logs Integration API](https://docs.datadoghq.com/api/latest/aws-logs-integration/?#get-list-of-aws-log-ready-services) to get allowed values. Defaults to `[]`.
        /// </summary>
        public readonly ImmutableArray<string> Sources;

        [OutputConstructor]
        private IntegrationAccountLogsConfigLambdaForwarder(
            ImmutableArray<string> lambdas,

            ImmutableArray<string> sources)
        {
            Lambdas = lambdas;
            Sources = sources;
        }
    }
}
