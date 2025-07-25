// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SecurityMonitoringRuleQueryArgs : global::Pulumi.ResourceArgs
    {
        [Input("agentRules")]
        private InputList<Inputs.SecurityMonitoringRuleQueryAgentRuleArgs>? _agentRules;

        /// <summary>
        /// **Deprecated**. It won't be applied anymore. **Deprecated.** `agent_rule` has been deprecated in favor of new Agent Rule resource.
        /// </summary>
        [Obsolete(@"`agent_rule` has been deprecated in favor of new Agent Rule resource.")]
        public InputList<Inputs.SecurityMonitoringRuleQueryAgentRuleArgs> AgentRules
        {
            get => _agentRules ?? (_agentRules = new InputList<Inputs.SecurityMonitoringRuleQueryAgentRuleArgs>());
            set => _agentRules = value;
        }

        /// <summary>
        /// The aggregation type. For Signal Correlation rules, it must be event_count. Valid values are `count`, `cardinality`, `sum`, `max`, `new_value`, `geo_data`, `event_count`, `none`. Defaults to `"count"`.
        /// </summary>
        [Input("aggregation")]
        public Input<string>? Aggregation { get; set; }

        /// <summary>
        /// Source of events. Valid values are `logs`, `audit`, `app_sec_spans`, `spans`, `security_runtime`, `network`, `events`. Defaults to `"logs"`.
        /// </summary>
        [Input("dataSource")]
        public Input<string>? DataSource { get; set; }

        [Input("distinctFields")]
        private InputList<string>? _distinctFields;

        /// <summary>
        /// Field for which the cardinality is measured. Sent as an array.
        /// </summary>
        public InputList<string> DistinctFields
        {
            get => _distinctFields ?? (_distinctFields = new InputList<string>());
            set => _distinctFields = value;
        }

        [Input("groupByFields")]
        private InputList<string>? _groupByFields;

        /// <summary>
        /// Fields to group by.
        /// </summary>
        public InputList<string> GroupByFields
        {
            get => _groupByFields ?? (_groupByFields = new InputList<string>());
            set => _groupByFields = value;
        }

        /// <summary>
        /// The target field to aggregate over when using the `sum`, `max`, or `geo_data` aggregations. **Deprecated.** Configure `metrics` instead. This attribute will be removed in the next major version of the provider.
        /// </summary>
        [Input("metric")]
        public Input<string>? Metric { get; set; }

        [Input("metrics")]
        private InputList<string>? _metrics;

        /// <summary>
        /// Group of target fields to aggregate over when using the `sum`, `max`, `geo_data`, or `new_value` aggregations. The `sum`, `max`, and `geo_data` aggregations only accept one value in this list, whereas the `new_value` aggregation accepts up to five values.
        /// </summary>
        public InputList<string> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<string>());
            set => _metrics = value;
        }

        /// <summary>
        /// Name of the query. Not compatible with `new_value` aggregations.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Query to run on logs.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        public SecurityMonitoringRuleQueryArgs()
        {
        }
        public static new SecurityMonitoringRuleQueryArgs Empty => new SecurityMonitoringRuleQueryArgs();
    }
}
