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
    public sealed class IntegrationAccountLogsConfig
    {
        /// <summary>
        /// Leave empty to omit logs config.
        /// </summary>
        public readonly Outputs.IntegrationAccountLogsConfigLambdaForwarder? LambdaForwarder;

        [OutputConstructor]
        private IntegrationAccountLogsConfig(Outputs.IntegrationAccountLogsConfigLambdaForwarder? lambdaForwarder)
        {
            LambdaForwarder = lambdaForwarder;
        }
    }
}
