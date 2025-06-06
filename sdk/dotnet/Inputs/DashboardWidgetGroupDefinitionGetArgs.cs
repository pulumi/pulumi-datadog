// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The background color of the group title, options: `vivid_blue`, `vivid_purple`, `vivid_pink`, `vivid_orange`, `vivid_yellow`, `vivid_green`, `blue`, `purple`, `pink`, `orange`, `yellow`, `green`, `gray` or `white`
        /// </summary>
        [Input("backgroundColor")]
        public Input<string>? BackgroundColor { get; set; }

        /// <summary>
        /// The image URL to display as a banner for the group.
        /// </summary>
        [Input("bannerImg")]
        public Input<string>? BannerImg { get; set; }

        /// <summary>
        /// The layout type of the group. Valid values are `ordered`.
        /// </summary>
        [Input("layoutType", required: true)]
        public Input<string> LayoutType { get; set; } = null!;

        /// <summary>
        /// Whether to show the title or not. Defaults to `true`.
        /// </summary>
        [Input("showTitle")]
        public Input<bool>? ShowTitle { get; set; }

        /// <summary>
        /// The title of the group.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        [Input("widgets")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetGetArgs>? _widgets;

        /// <summary>
        /// The list of widgets in this group.
        /// </summary>
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetGetArgs> Widgets
        {
            get => _widgets ?? (_widgets = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetGetArgs>());
            set => _widgets = value;
        }

        public DashboardWidgetGroupDefinitionGetArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionGetArgs Empty => new DashboardWidgetGroupDefinitionGetArgs();
    }
}
