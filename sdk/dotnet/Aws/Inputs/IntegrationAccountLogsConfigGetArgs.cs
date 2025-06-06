// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Aws.Inputs
{

    public sealed class IntegrationAccountLogsConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Leave empty to omit logs config.
        /// </summary>
        [Input("lambdaForwarder")]
        public Input<Inputs.IntegrationAccountLogsConfigLambdaForwarderGetArgs>? LambdaForwarder { get; set; }

        public IntegrationAccountLogsConfigGetArgs()
        {
        }
        public static new IntegrationAccountLogsConfigGetArgs Empty => new IntegrationAccountLogsConfigGetArgs();
    }
}
