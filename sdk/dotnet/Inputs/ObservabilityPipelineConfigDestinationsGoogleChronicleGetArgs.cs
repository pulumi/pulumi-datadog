// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ObservabilityPipelineConfigDestinationsGoogleChronicleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// GCP credentials used to authenticate with Google Cloud Storage.
        /// </summary>
        [Input("auth")]
        public Input<Inputs.ObservabilityPipelineConfigDestinationsGoogleChronicleAuthGetArgs>? Auth { get; set; }

        /// <summary>
        /// The Google Chronicle customer ID.
        /// </summary>
        [Input("customerId")]
        public Input<string>? CustomerId { get; set; }

        /// <summary>
        /// The encoding format for the logs sent to Chronicle.
        /// </summary>
        [Input("encoding")]
        public Input<string>? Encoding { get; set; }

        /// <summary>
        /// The unique identifier for this component.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("inputs", required: true)]
        private InputList<string>? _inputs;

        /// <summary>
        /// A list of component IDs whose output is used as the `input` for this component.
        /// </summary>
        public InputList<string> Inputs
        {
            get => _inputs ?? (_inputs = new InputList<string>());
            set => _inputs = value;
        }

        /// <summary>
        /// The log type metadata associated with the Chronicle destination.
        /// </summary>
        [Input("logType")]
        public Input<string>? LogType { get; set; }

        public ObservabilityPipelineConfigDestinationsGoogleChronicleGetArgs()
        {
        }
        public static new ObservabilityPipelineConfigDestinationsGoogleChronicleGetArgs Empty => new ObservabilityPipelineConfigDestinationsGoogleChronicleGetArgs();
    }
}
