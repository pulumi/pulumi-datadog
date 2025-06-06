// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
        /// Maximum number of graphs to display in the widget.
        /// </summary>
        public readonly int? Limit;
        /// <summary>
        /// Controls the order in which graphs appear in the split.
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
