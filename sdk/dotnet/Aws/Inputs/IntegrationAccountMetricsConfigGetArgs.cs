// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Aws.Inputs
{

    public sealed class IntegrationAccountMetricsConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable EC2 automute for AWS metrics Defaults to `true`.
        /// </summary>
        [Input("automuteEnabled")]
        public Input<bool>? AutomuteEnabled { get; set; }

        /// <summary>
        /// Enable CloudWatch alarms collection Defaults to `false`.
        /// </summary>
        [Input("collectCloudwatchAlarms")]
        public Input<bool>? CollectCloudwatchAlarms { get; set; }

        /// <summary>
        /// Enable custom metrics collection Defaults to `false`.
        /// </summary>
        [Input("collectCustomMetrics")]
        public Input<bool>? CollectCustomMetrics { get; set; }

        /// <summary>
        /// Enable AWS metrics collection Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// AWS metrics namespace filters. Defaults to a pre-set `exclude_only` list if block is empty.
        /// </summary>
        [Input("namespaceFilters")]
        public Input<Inputs.IntegrationAccountMetricsConfigNamespaceFiltersGetArgs>? NamespaceFilters { get; set; }

        [Input("tagFilters")]
        private InputList<Inputs.IntegrationAccountMetricsConfigTagFilterGetArgs>? _tagFilters;

        /// <summary>
        /// AWS Metrics Collection tag filters list. The array of custom AWS resource tags (in the form `key:value`) defines a filter that Datadog uses when collecting metrics from a specified service. Wildcards, such as `?` (match a single character) and `*` (match multiple characters), and exclusion using `!` before the tag are supported. For EC2, only hosts that match one of the defined tags will be imported into Datadog. The rest will be ignored. For example, `env:production,instance-type:c?.*,!region:us-east-1`.
        /// </summary>
        public InputList<Inputs.IntegrationAccountMetricsConfigTagFilterGetArgs> TagFilters
        {
            get => _tagFilters ?? (_tagFilters = new InputList<Inputs.IntegrationAccountMetricsConfigTagFilterGetArgs>());
            set => _tagFilters = value;
        }

        public IntegrationAccountMetricsConfigGetArgs()
        {
        }
        public static new IntegrationAccountMetricsConfigGetArgs Empty => new IntegrationAccountMetricsConfigGetArgs();
    }
}
