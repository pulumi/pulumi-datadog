// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleOnMatchPartialRedactGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of characters to keep.
        /// </summary>
        [Input("characters")]
        public Input<int>? Characters { get; set; }

        /// <summary>
        /// Direction from which to keep characters: `first` or `last`.
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        public ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleOnMatchPartialRedactGetArgs()
        {
        }
        public static new ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleOnMatchPartialRedactGetArgs Empty => new ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleOnMatchPartialRedactGetArgs();
    }
}
