// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetTopologyMapDefinitionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("customLinks")]
        private InputList<Inputs.DashboardWidgetTopologyMapDefinitionCustomLinkGetArgs>? _customLinks;

        /// <summary>
        /// A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
        /// </summary>
        public InputList<Inputs.DashboardWidgetTopologyMapDefinitionCustomLinkGetArgs> CustomLinks
        {
            get => _customLinks ?? (_customLinks = new InputList<Inputs.DashboardWidgetTopologyMapDefinitionCustomLinkGetArgs>());
            set => _customLinks = value;
        }

        [Input("requests")]
        private InputList<Inputs.DashboardWidgetTopologyMapDefinitionRequestGetArgs>? _requests;

        /// <summary>
        /// A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (`query` and `request_type` are required within the request).
        /// </summary>
        public InputList<Inputs.DashboardWidgetTopologyMapDefinitionRequestGetArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.DashboardWidgetTopologyMapDefinitionRequestGetArgs>());
            set => _requests = value;
        }

        /// <summary>
        /// The title of the widget.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        /// <summary>
        /// The alignment of the widget's title. Valid values are `center`, `left`, `right`.
        /// </summary>
        [Input("titleAlign")]
        public Input<string>? TitleAlign { get; set; }

        /// <summary>
        /// The size of the widget's title (defaults to 16).
        /// </summary>
        [Input("titleSize")]
        public Input<string>? TitleSize { get; set; }

        public DashboardWidgetTopologyMapDefinitionGetArgs()
        {
        }
        public static new DashboardWidgetTopologyMapDefinitionGetArgs Empty => new DashboardWidgetTopologyMapDefinitionGetArgs();
    }
}