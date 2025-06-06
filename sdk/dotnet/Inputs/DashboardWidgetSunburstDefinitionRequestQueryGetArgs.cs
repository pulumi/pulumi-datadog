// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSunburstDefinitionRequestQueryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The APM Dependency Stats query using formulas and functions.
        /// </summary>
        [Input("apmDependencyStatsQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestQueryApmDependencyStatsQueryGetArgs>? ApmDependencyStatsQuery { get; set; }

        /// <summary>
        /// The APM Resource Stats query using formulas and functions.
        /// </summary>
        [Input("apmResourceStatsQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestQueryApmResourceStatsQueryGetArgs>? ApmResourceStatsQuery { get; set; }

        /// <summary>
        /// The Cloud Cost query using formulas and functions.
        /// </summary>
        [Input("cloudCostQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestQueryCloudCostQueryGetArgs>? CloudCostQuery { get; set; }

        /// <summary>
        /// A timeseries formula and functions events query.
        /// </summary>
        [Input("eventQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestQueryEventQueryGetArgs>? EventQuery { get; set; }

        /// <summary>
        /// A timeseries formula and functions metrics query.
        /// </summary>
        [Input("metricQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestQueryMetricQueryGetArgs>? MetricQuery { get; set; }

        /// <summary>
        /// The process query using formulas and functions.
        /// </summary>
        [Input("processQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestQueryProcessQueryGetArgs>? ProcessQuery { get; set; }

        /// <summary>
        /// The SLO query using formulas and functions.
        /// </summary>
        [Input("sloQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestQuerySloQueryGetArgs>? SloQuery { get; set; }

        public DashboardWidgetSunburstDefinitionRequestQueryGetArgs()
        {
        }
        public static new DashboardWidgetSunburstDefinitionRequestQueryGetArgs Empty => new DashboardWidgetSunburstDefinitionRequestQueryGetArgs();
    }
}
