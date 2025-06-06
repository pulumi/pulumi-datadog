// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetHeatmapDefinitionEventGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The event query to use in the widget.
        /// </summary>
        [Input("q", required: true)]
        public Input<string> Q { get; set; } = null!;

        /// <summary>
        /// The execution method for multi-value filters.
        /// </summary>
        [Input("tagsExecution")]
        public Input<string>? TagsExecution { get; set; }

        public DashboardWidgetHeatmapDefinitionEventGetArgs()
        {
        }
        public static new DashboardWidgetHeatmapDefinitionEventGetArgs Empty => new DashboardWidgetHeatmapDefinitionEventGetArgs();
    }
}
