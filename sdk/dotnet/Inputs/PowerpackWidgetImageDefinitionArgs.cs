// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetImageDefinitionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to display a background or not. Defaults to `true`.
        /// </summary>
        [Input("hasBackground")]
        public Input<bool>? HasBackground { get; set; }

        /// <summary>
        /// Whether to display a border or not. Defaults to `true`.
        /// </summary>
        [Input("hasBorder")]
        public Input<bool>? HasBorder { get; set; }

        /// <summary>
        /// The horizontal alignment for the widget. Valid values are `center`, `left`, `right`.
        /// </summary>
        [Input("horizontalAlign")]
        public Input<string>? HorizontalAlign { get; set; }

        /// <summary>
        /// The margins to use around the image. Note: `small` and `large` values are deprecated. Valid values are `sm`, `md`, `lg`, `small`, `large`.
        /// </summary>
        [Input("margin")]
        public Input<string>? Margin { get; set; }

        /// <summary>
        /// The preferred method to adapt the dimensions of the image. The values are based on the image `object-fit` CSS properties. Note: `zoom`, `fit` and `center` values are deprecated. Valid values are `fill`, `contain`, `cover`, `none`, `scale-down`, `zoom`, `fit`, `center`.
        /// </summary>
        [Input("sizing")]
        public Input<string>? Sizing { get; set; }

        /// <summary>
        /// The URL to use as a data source for the widget.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        /// <summary>
        /// The URL in dark mode to use as a data source for the widget.
        /// </summary>
        [Input("urlDarkTheme")]
        public Input<string>? UrlDarkTheme { get; set; }

        /// <summary>
        /// The vertical alignment for the widget. Valid values are `center`, `top`, `bottom`.
        /// </summary>
        [Input("verticalAlign")]
        public Input<string>? VerticalAlign { get; set; }

        public PowerpackWidgetImageDefinitionArgs()
        {
        }
        public static new PowerpackWidgetImageDefinitionArgs Empty => new PowerpackWidgetImageDefinitionArgs();
    }
}