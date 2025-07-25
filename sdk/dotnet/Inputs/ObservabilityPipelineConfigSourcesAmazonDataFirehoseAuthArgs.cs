// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ObservabilityPipelineConfigSourcesAmazonDataFirehoseAuthArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the role to assume.
        /// </summary>
        [Input("assumeRole")]
        public Input<string>? AssumeRole { get; set; }

        /// <summary>
        /// A unique identifier for cross-account role assumption.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// A session identifier used for logging and tracing the assumed role session.
        /// </summary>
        [Input("sessionName")]
        public Input<string>? SessionName { get; set; }

        public ObservabilityPipelineConfigSourcesAmazonDataFirehoseAuthArgs()
        {
        }
        public static new ObservabilityPipelineConfigSourcesAmazonDataFirehoseAuthArgs Empty => new ObservabilityPipelineConfigSourcesAmazonDataFirehoseAuthArgs();
    }
}
