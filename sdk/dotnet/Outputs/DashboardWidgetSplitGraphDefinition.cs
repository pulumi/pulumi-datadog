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
    public sealed class DashboardWidgetSplitGraphDefinition
    {
        /// <summary>
        /// Normalize y axes across graphs.
        /// </summary>
        public readonly bool? HasUniformYAxes;
        /// <summary>
        /// The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
        /// </summary>
        public readonly string? LiveSpan;
        /// <summary>
        /// Size of the individual graphs in the split.
        /// </summary>
        public readonly string Size;
        /// <summary>
        /// The original widget we are splitting on.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinition SourceWidgetDefinition;
        /// <summary>
        /// Encapsulates all user choices about how to split a graph.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSplitConfig SplitConfig;
        /// <summary>
        /// The title of the widget.
        /// </summary>
        public readonly string? Title;

        [OutputConstructor]
        private DashboardWidgetSplitGraphDefinition(
            bool? hasUniformYAxes,

            string? liveSpan,

            string size,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinition sourceWidgetDefinition,

            Outputs.DashboardWidgetSplitGraphDefinitionSplitConfig splitConfig,

            string? title)
        {
            HasUniformYAxes = hasUniformYAxes;
            LiveSpan = liveSpan;
            Size = size;
            SourceWidgetDefinition = sourceWidgetDefinition;
            SplitConfig = splitConfig;
            Title = title;
        }
    }
}