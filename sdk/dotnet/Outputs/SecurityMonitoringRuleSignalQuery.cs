// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class SecurityMonitoringRuleSignalQuery
    {
        /// <summary>
        /// The aggregation type. For Signal Correlation rules, it must be event_count. Valid values are `count`, `cardinality`, `sum`, `max`, `new_value`, `geo_data`, `event_count`, `none`. Defaults to `"event_count"`.
        /// </summary>
        public readonly string? Aggregation;
        /// <summary>
        /// Fields to correlate by.
        /// </summary>
        public readonly ImmutableArray<string> CorrelatedByFields;
        /// <summary>
        /// Index of the rule query used to retrieve the correlated field. An empty string applies correlation on the non-projected per query attributes of the rule. Defaults to `""`.
        /// </summary>
        public readonly string? CorrelatedQueryIndex;
        /// <summary>
        /// Default Rule ID of the signal to correlate. This value is READ-ONLY.
        /// </summary>
        public readonly string? DefaultRuleId;
        /// <summary>
        /// Name of the query. Not compatible with `new_value` aggregations.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Rule ID of the signal to correlate.
        /// </summary>
        public readonly string RuleId;

        [OutputConstructor]
        private SecurityMonitoringRuleSignalQuery(
            string? aggregation,

            ImmutableArray<string> correlatedByFields,

            string? correlatedQueryIndex,

            string? defaultRuleId,

            string? name,

            string ruleId)
        {
            Aggregation = aggregation;
            CorrelatedByFields = correlatedByFields;
            CorrelatedQueryIndex = correlatedQueryIndex;
            DefaultRuleId = defaultRuleId;
            Name = name;
            RuleId = ruleId;
        }
    }
}