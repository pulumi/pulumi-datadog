// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetHeatmapDefinitionRequestQueryEventQueryGroupByArgs : global::Pulumi.ResourceArgs
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
        public Input<Inputs.PowerpackWidgetHeatmapDefinitionRequestQueryEventQueryGroupBySortArgs>? Sort { get; set; }

        public PowerpackWidgetHeatmapDefinitionRequestQueryEventQueryGroupByArgs()
        {
        }
        public static new PowerpackWidgetHeatmapDefinitionRequestQueryEventQueryGroupByArgs Empty => new PowerpackWidgetHeatmapDefinitionRequestQueryEventQueryGroupByArgs();
    }
}