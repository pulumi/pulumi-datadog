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
    public sealed class DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQuery
    {
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmDependencyStatsQuery? ApmDependencyStatsQuery;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmResourceStatsQuery? ApmResourceStatsQuery;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryEventQuery? EventQuery;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryMetricQuery? MetricQuery;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryProcessQuery? ProcessQuery;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQuery(
            Outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmDependencyStatsQuery? apmDependencyStatsQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmResourceStatsQuery? apmResourceStatsQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryEventQuery? eventQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryMetricQuery? metricQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryProcessQuery? processQuery)
        {
            ApmDependencyStatsQuery = apmDependencyStatsQuery;
            ApmResourceStatsQuery = apmResourceStatsQuery;
            EventQuery = eventQuery;
            MetricQuery = metricQuery;
            ProcessQuery = processQuery;
        }
    }
}