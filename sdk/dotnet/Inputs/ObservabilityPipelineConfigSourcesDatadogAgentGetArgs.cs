// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ObservabilityPipelineConfigSourcesDatadogAgentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique ID of the source.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// Configuration for enabling TLS encryption between the pipeline component and external services.
        /// </summary>
        [Input("tls")]
        public Input<Inputs.ObservabilityPipelineConfigSourcesDatadogAgentTlsGetArgs>? Tls { get; set; }

        public ObservabilityPipelineConfigSourcesDatadogAgentGetArgs()
        {
        }
        public static new ObservabilityPipelineConfigSourcesDatadogAgentGetArgs Empty => new ObservabilityPipelineConfigSourcesDatadogAgentGetArgs();
    }
}
