// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetTimeseriesDefinitionRequestStyleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of lines displayed. Valid values are `dashed`, `dotted`, `solid`.
        /// </summary>
        [Input("lineType")]
        public Input<string>? LineType { get; set; }

        /// <summary>
        /// The width of line displayed. Valid values are `normal`, `thick`, `thin`.
        /// </summary>
        [Input("lineWidth")]
        public Input<string>? LineWidth { get; set; }

        /// <summary>
        /// A color palette to apply to the widget. The available options are available at: https://docs.datadoghq.com/dashboards/widgets/timeseries/#appearance.
        /// </summary>
        [Input("palette")]
        public Input<string>? Palette { get; set; }

        public DashboardWidgetTimeseriesDefinitionRequestStyleGetArgs()
        {
        }
        public static new DashboardWidgetTimeseriesDefinitionRequestStyleGetArgs Empty => new DashboardWidgetTimeseriesDefinitionRequestStyleGetArgs();
    }
}
