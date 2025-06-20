// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ObservabilityPipelineConfigDestinationsSumoLogicGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The output encoding format.
        /// </summary>
        [Input("encoding")]
        public Input<string>? Encoding { get; set; }

        [Input("headerCustomFields")]
        private InputList<Inputs.ObservabilityPipelineConfigDestinationsSumoLogicHeaderCustomFieldGetArgs>? _headerCustomFields;

        /// <summary>
        /// A list of custom headers to include in the request to Sumo Logic.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigDestinationsSumoLogicHeaderCustomFieldGetArgs> HeaderCustomFields
        {
            get => _headerCustomFields ?? (_headerCustomFields = new InputList<Inputs.ObservabilityPipelineConfigDestinationsSumoLogicHeaderCustomFieldGetArgs>());
            set => _headerCustomFields = value;
        }

        /// <summary>
        /// Optional override for the host name header.
        /// </summary>
        [Input("headerHostName")]
        public Input<string>? HeaderHostName { get; set; }

        /// <summary>
        /// Optional override for the source category header.
        /// </summary>
        [Input("headerSourceCategory")]
        public Input<string>? HeaderSourceCategory { get; set; }

        /// <summary>
        /// Optional override for the source name header.
        /// </summary>
        [Input("headerSourceName")]
        public Input<string>? HeaderSourceName { get; set; }

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

        public ObservabilityPipelineConfigDestinationsSumoLogicGetArgs()
        {
        }
        public static new ObservabilityPipelineConfigDestinationsSumoLogicGetArgs Empty => new ObservabilityPipelineConfigDestinationsSumoLogicGetArgs();
    }
}
