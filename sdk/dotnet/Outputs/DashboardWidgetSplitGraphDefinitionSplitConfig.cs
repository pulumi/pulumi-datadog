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
    public sealed class DashboardWidgetSplitGraphDefinitionSplitConfig
    {
        /// <summary>
        /// The maximum number of items in the group.
        /// </summary>
        public readonly int? Limit;
        /// <summary>
        /// The options for sorting group by results.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSplitConfigSort Sort;
        /// <summary>
        /// The property by which the graph splits
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSplitConfigSplitDimensions SplitDimensions;
        /// <summary>
        /// The property by which the graph splits
        /// </summary>
        public readonly ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSplitConfigStaticSplit> StaticSplits;

        [OutputConstructor]
        private DashboardWidgetSplitGraphDefinitionSplitConfig(
            int? limit,

            Outputs.DashboardWidgetSplitGraphDefinitionSplitConfigSort sort,

            Outputs.DashboardWidgetSplitGraphDefinitionSplitConfigSplitDimensions splitDimensions,

            ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSplitConfigStaticSplit> staticSplits)
        {
            Limit = limit;
            Sort = sort;
            SplitDimensions = splitDimensions;
            StaticSplits = staticSplits;
        }
    }
}