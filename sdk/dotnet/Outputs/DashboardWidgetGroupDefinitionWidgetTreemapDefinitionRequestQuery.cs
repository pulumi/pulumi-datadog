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
    public sealed class DashboardWidgetGroupDefinitionWidgetTreemapDefinitionRequestQuery
    {
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTreemapDefinitionRequestQueryApmDependencyStatsQuery? ApmDependencyStatsQuery;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTreemapDefinitionRequestQueryApmResourceStatsQuery? ApmResourceStatsQuery;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTreemapDefinitionRequestQueryEventQuery? EventQuery;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTreemapDefinitionRequestQueryMetricQuery? MetricQuery;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTreemapDefinitionRequestQueryProcessQuery? ProcessQuery;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetTreemapDefinitionRequestQuery(
            Outputs.DashboardWidgetGroupDefinitionWidgetTreemapDefinitionRequestQueryApmDependencyStatsQuery? apmDependencyStatsQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetTreemapDefinitionRequestQueryApmResourceStatsQuery? apmResourceStatsQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetTreemapDefinitionRequestQueryEventQuery? eventQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetTreemapDefinitionRequestQueryMetricQuery? metricQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetTreemapDefinitionRequestQueryProcessQuery? processQuery)
        {
            ApmDependencyStatsQuery = apmDependencyStatsQuery;
            ApmResourceStatsQuery = apmResourceStatsQuery;
            EventQuery = eventQuery;
            MetricQuery = metricQuery;
            ProcessQuery = processQuery;
        }
    }
}