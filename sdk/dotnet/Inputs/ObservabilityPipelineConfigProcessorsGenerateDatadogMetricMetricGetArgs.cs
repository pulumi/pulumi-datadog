// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("groupBies")]
        private InputList<string>? _groupBies;

        /// <summary>
        /// Optional fields used to group the metric series.
        /// </summary>
        public InputList<string> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<string>());
            set => _groupBies = value;
        }

        /// <summary>
        /// Datadog filter query to match logs for metric generation.
        /// </summary>
        [Input("include", required: true)]
        public Input<string> Include { get; set; } = null!;

        /// <summary>
        /// Type of metric to create.
        /// </summary>
        [Input("metricType", required: true)]
        public Input<string> MetricType { get; set; } = null!;

        /// <summary>
        /// Name of the custom metric to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies how the value of the generated metric is computed.
        /// </summary>
        [Input("value")]
        public Input<Inputs.ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueGetArgs>? Value { get; set; }

        public ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricGetArgs()
        {
        }
        public static new ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricGetArgs Empty => new ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricGetArgs();
    }
}
