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
    public sealed class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQuery
    {
        /// <summary>
        /// The APM Dependency Stats query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryApmDependencyStatsQuery? ApmDependencyStatsQuery;
        /// <summary>
        /// The APM Resource Stats query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryApmResourceStatsQuery? ApmResourceStatsQuery;
        /// <summary>
        /// The Cloud Cost query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryCloudCostQuery? CloudCostQuery;
        /// <summary>
        /// A timeseries formula and functions events query.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryEventQuery? EventQuery;
        /// <summary>
        /// A timeseries formula and functions metrics query.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryMetricQuery? MetricQuery;
        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryProcessQuery? ProcessQuery;
        /// <summary>
        /// The SLO query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQuerySloQuery? SloQuery;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQuery(
            Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryApmDependencyStatsQuery? apmDependencyStatsQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryApmResourceStatsQuery? apmResourceStatsQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryCloudCostQuery? cloudCostQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryEventQuery? eventQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryMetricQuery? metricQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryProcessQuery? processQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQuerySloQuery? sloQuery)
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