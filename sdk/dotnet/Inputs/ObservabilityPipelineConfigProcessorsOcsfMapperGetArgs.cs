// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ObservabilityPipelineConfigProcessorsOcsfMapperGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique identifier for this component.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// Search query to select logs.
        /// </summary>
        [Input("include", required: true)]
        public Input<string> Include { get; set; } = null!;

        [Input("inputs", required: true)]
        private InputList<string>? _inputs;

        /// <summary>
        /// List of component IDs whose output is used as input.
        /// </summary>
        public InputList<string> Inputs
        {
            get => _inputs ?? (_inputs = new InputList<string>());
            set => _inputs = value;
        }

        [Input("mappings")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsOcsfMapperMappingGetArgs>? _mappings;

        /// <summary>
        /// List of OCSF mapping entries using library mapping.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsOcsfMapperMappingGetArgs> Mappings
        {
            get => _mappings ?? (_mappings = new InputList<Inputs.ObservabilityPipelineConfigProcessorsOcsfMapperMappingGetArgs>());
            set => _mappings = value;
        }

        public ObservabilityPipelineConfigProcessorsOcsfMapperGetArgs()
        {
        }
        public static new ObservabilityPipelineConfigProcessorsOcsfMapperGetArgs Empty => new ObservabilityPipelineConfigProcessorsOcsfMapperGetArgs();
    }
}
