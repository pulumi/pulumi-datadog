// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SpansMetricComputeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of aggregation to use. This field can't be updated after creation.
        /// </summary>
        [Input("aggregationType", required: true)]
        public Input<string> AggregationType { get; set; } = null!;

        /// <summary>
        /// Toggle to include or exclude percentile aggregations for distribution metrics. Only present when the `aggregation_type` is `distribution`.
        /// </summary>
        [Input("includePercentiles")]
        public Input<bool>? IncludePercentiles { get; set; }

        /// <summary>
        /// The path to the value the span-based metric will aggregate on (only used if the aggregation type is a "distribution"). This field can't be updated after creation.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        public SpansMetricComputeGetArgs()
        {
        }
        public static new SpansMetricComputeGetArgs Empty => new SpansMetricComputeGetArgs();
    }
}
