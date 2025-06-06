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
    public sealed class DashboardWidgetTimeseriesDefinitionRequestStyle
    {
        /// <summary>
        /// The type of lines displayed. Valid values are `dashed`, `dotted`, `solid`.
        /// </summary>
        public readonly string? LineType;
        /// <summary>
        /// The width of line displayed. Valid values are `normal`, `thick`, `thin`.
        /// </summary>
        public readonly string? LineWidth;
        /// <summary>
        /// A color palette to apply to the widget. The available options are available at: https://docs.datadoghq.com/dashboards/widgets/timeseries/#appearance.
        /// </summary>
        public readonly string? Palette;

        [OutputConstructor]
        private DashboardWidgetTimeseriesDefinitionRequestStyle(
            string? lineType,

            string? lineWidth,

            string? palette)
        {
            LineType = lineType;
            LineWidth = lineWidth;
            Palette = palette;
        }
    }
}
