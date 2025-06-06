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
    public sealed class PowerpackWidgetFreeTextDefinition
    {
        /// <summary>
        /// The color of the text in the widget.
        /// </summary>
        public readonly string? Color;
        /// <summary>
        /// The size of the text in the widget.
        /// </summary>
        public readonly string? FontSize;
        /// <summary>
        /// The text to display in the widget.
        /// </summary>
        public readonly string Text;
        /// <summary>
        /// The alignment of the text in the widget. Valid values are `center`, `left`, `right`.
        /// </summary>
        public readonly string? TextAlign;

        [OutputConstructor]
        private PowerpackWidgetFreeTextDefinition(
            string? color,

            string? fontSize,

            string text,

            string? textAlign)
        {
            Color = color;
            FontSize = fontSize;
            Text = text;
            TextAlign = textAlign;
        }
    }
}
