// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetQueryValueDefinitionRequestQueryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The APM Dependency Stats query using formulas and functions.
        /// </summary>
        [Input("apmDependencyStatsQuery")]
        public Input<Inputs.PowerpackWidgetQueryValueDefinitionRequestQueryApmDependencyStatsQueryArgs>? ApmDependencyStatsQuery { get; set; }

        /// <summary>
        /// The APM Resource Stats query using formulas and functions.
        /// </summary>
        [Input("apmResourceStatsQuery")]
        public Input<Inputs.PowerpackWidgetQueryValueDefinitionRequestQueryApmResourceStatsQueryArgs>? ApmResourceStatsQuery { get; set; }

        /// <summary>
        /// The Cloud Cost query using formulas and functions.
        /// </summary>
        [Input("cloudCostQuery")]
        public Input<Inputs.PowerpackWidgetQueryValueDefinitionRequestQueryCloudCostQueryArgs>? CloudCostQuery { get; set; }

        /// <summary>
        /// A timeseries formula and functions events query.
        /// </summary>
        [Input("eventQuery")]
        public Input<Inputs.PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryArgs>? EventQuery { get; set; }

        /// <summary>
        /// A timeseries formula and functions metrics query.
        /// </summary>
        [Input("metricQuery")]
        public Input<Inputs.PowerpackWidgetQueryValueDefinitionRequestQueryMetricQueryArgs>? MetricQuery { get; set; }

        /// <summary>
        /// The process query using formulas and functions.
        /// </summary>
        [Input("processQuery")]
        public Input<Inputs.PowerpackWidgetQueryValueDefinitionRequestQueryProcessQueryArgs>? ProcessQuery { get; set; }

        /// <summary>
        /// The SLO query using formulas and functions.
        /// </summary>
        [Input("sloQuery")]
        public Input<Inputs.PowerpackWidgetQueryValueDefinitionRequestQuerySloQueryArgs>? SloQuery { get; set; }

        public PowerpackWidgetQueryValueDefinitionRequestQueryArgs()
        {
        }
        public static new PowerpackWidgetQueryValueDefinitionRequestQueryArgs Empty => new PowerpackWidgetQueryValueDefinitionRequestQueryArgs();
    }
}