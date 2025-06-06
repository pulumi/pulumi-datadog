// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class LogsCustomPipelineProcessorPipelineGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("filters", required: true)]
        private InputList<Inputs.LogsCustomPipelineProcessorPipelineFilterGetArgs>? _filters;
        public InputList<Inputs.LogsCustomPipelineProcessorPipelineFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.LogsCustomPipelineProcessorPipelineFilterGetArgs>());
            set => _filters = value;
        }

        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("processors")]
        private InputList<Inputs.LogsCustomPipelineProcessorPipelineProcessorGetArgs>? _processors;
        public InputList<Inputs.LogsCustomPipelineProcessorPipelineProcessorGetArgs> Processors
        {
            get => _processors ?? (_processors = new InputList<Inputs.LogsCustomPipelineProcessorPipelineProcessorGetArgs>());
            set => _processors = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public LogsCustomPipelineProcessorPipelineGetArgs()
        {
        }
        public static new LogsCustomPipelineProcessorPipelineGetArgs Empty => new LogsCustomPipelineProcessorPipelineGetArgs();
    }
}
