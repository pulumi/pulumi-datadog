// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSplitGraphDefinitionSplitConfigSortGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines the metric and aggregation used as the sort value
        /// </summary>
        [Input("compute")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSplitConfigSortComputeGetArgs>? Compute { get; set; }

        /// <summary>
        /// Widget sorting methods. Valid values are `asc`, `desc`.
        /// </summary>
        [Input("order", required: true)]
        public Input<string> Order { get; set; } = null!;

        public DashboardWidgetSplitGraphDefinitionSplitConfigSortGetArgs()
        {
        }
        public static new DashboardWidgetSplitGraphDefinitionSplitConfigSortGetArgs Empty => new DashboardWidgetSplitGraphDefinitionSplitConfigSortGetArgs();
    }
}