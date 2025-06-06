// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class LogsCustomPipelineProcessorSpanIdRemapperArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If the processor is enabled or not.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// Name of the processor.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("sources", required: true)]
        private InputList<string>? _sources;

        /// <summary>
        /// List of source attributes.
        /// </summary>
        public InputList<string> Sources
        {
            get => _sources ?? (_sources = new InputList<string>());
            set => _sources = value;
        }

        public LogsCustomPipelineProcessorSpanIdRemapperArgs()
        {
        }
        public static new LogsCustomPipelineProcessorSpanIdRemapperArgs Empty => new LogsCustomPipelineProcessorSpanIdRemapperArgs();
    }
}
