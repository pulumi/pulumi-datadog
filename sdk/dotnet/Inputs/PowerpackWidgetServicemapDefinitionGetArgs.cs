// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetServicemapDefinitionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("customLinks")]
        private InputList<Inputs.PowerpackWidgetServicemapDefinitionCustomLinkGetArgs>? _customLinks;

        /// <summary>
        /// A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
        /// </summary>
        public InputList<Inputs.PowerpackWidgetServicemapDefinitionCustomLinkGetArgs> CustomLinks
        {
            get => _customLinks ?? (_customLinks = new InputList<Inputs.PowerpackWidgetServicemapDefinitionCustomLinkGetArgs>());
            set => _customLinks = value;
        }

        [Input("filters", required: true)]
        private InputList<string>? _filters;

        /// <summary>
        /// Your environment and primary tag (or `*` if enabled for your account).
        /// </summary>
        public InputList<string> Filters
        {
            get => _filters ?? (_filters = new InputList<string>());
            set => _filters = value;
        }

        /// <summary>
        /// The ID of the service to map.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

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

        public PowerpackWidgetServicemapDefinitionGetArgs()
        {
        }
        public static new PowerpackWidgetServicemapDefinitionGetArgs Empty => new PowerpackWidgetServicemapDefinitionGetArgs();
    }
}
