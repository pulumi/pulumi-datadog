// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetHeatmapDefinitionRequestQueryEventQueryGroupByArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The event facet.
        /// </summary>
        [Input("facet", required: true)]
        public Input<string> Facet { get; set; } = null!;

        /// <summary>
        /// The number of groups to return.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// The options for sorting group by results.
        /// </summary>
        [Input("sort")]
        public Input<Inputs.DashboardWidgetHeatmapDefinitionRequestQueryEventQueryGroupBySortArgs>? Sort { get; set; }

        public DashboardWidgetHeatmapDefinitionRequestQueryEventQueryGroupByArgs()
        {
        }
        public static new DashboardWidgetHeatmapDefinitionRequestQueryEventQueryGroupByArgs Empty => new DashboardWidgetHeatmapDefinitionRequestQueryEventQueryGroupByArgs();
    }
}
