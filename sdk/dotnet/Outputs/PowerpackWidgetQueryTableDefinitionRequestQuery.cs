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
    public sealed class PowerpackWidgetQueryTableDefinitionRequestQuery
    {
        /// <summary>
        /// The APM Dependency Stats query using formulas and functions.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryTableDefinitionRequestQueryApmDependencyStatsQuery? ApmDependencyStatsQuery;
        /// <summary>
        /// The APM Resource Stats query using formulas and functions.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryTableDefinitionRequestQueryApmResourceStatsQuery? ApmResourceStatsQuery;
        /// <summary>
        /// The Cloud Cost query using formulas and functions.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryTableDefinitionRequestQueryCloudCostQuery? CloudCostQuery;
        /// <summary>
        /// A timeseries formula and functions events query.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryTableDefinitionRequestQueryEventQuery? EventQuery;
        /// <summary>
        /// A timeseries formula and functions metrics query.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryTableDefinitionRequestQueryMetricQuery? MetricQuery;
        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryTableDefinitionRequestQueryProcessQuery? ProcessQuery;
        /// <summary>
        /// The SLO query using formulas and functions.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryTableDefinitionRequestQuerySloQuery? SloQuery;

        [OutputConstructor]
        private PowerpackWidgetQueryTableDefinitionRequestQuery(
            Outputs.PowerpackWidgetQueryTableDefinitionRequestQueryApmDependencyStatsQuery? apmDependencyStatsQuery,

            Outputs.PowerpackWidgetQueryTableDefinitionRequestQueryApmResourceStatsQuery? apmResourceStatsQuery,

            Outputs.PowerpackWidgetQueryTableDefinitionRequestQueryCloudCostQuery? cloudCostQuery,

            Outputs.PowerpackWidgetQueryTableDefinitionRequestQueryEventQuery? eventQuery,

            Outputs.PowerpackWidgetQueryTableDefinitionRequestQueryMetricQuery? metricQuery,

            Outputs.PowerpackWidgetQueryTableDefinitionRequestQueryProcessQuery? processQuery,

            Outputs.PowerpackWidgetQueryTableDefinitionRequestQuerySloQuery? sloQuery)
        {
            ApmDependencyStatsQuery = apmDependencyStatsQuery;
            ApmResourceStatsQuery = apmResourceStatsQuery;
            CloudCostQuery = cloudCostQuery;
            EventQuery = eventQuery;
            MetricQuery = metricQuery;
            ProcessQuery = processQuery;
            SloQuery = sloQuery;
        }
    }
}