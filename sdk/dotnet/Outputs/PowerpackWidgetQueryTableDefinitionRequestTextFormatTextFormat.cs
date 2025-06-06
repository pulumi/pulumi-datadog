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
    public sealed class PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormat
    {
        /// <summary>
        /// The custom color palette to apply to the background.
        /// </summary>
        public readonly string? CustomBgColor;
        /// <summary>
        /// The custom color palette to apply to the foreground text.
        /// </summary>
        public readonly string? CustomFgColor;
        /// <summary>
        /// Match rule for the table widget text format.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormatMatch Match;
        /// <summary>
        /// The color palette to apply. Valid values are `white_on_red`, `white_on_yellow`, `white_on_green`, `black_on_light_red`, `black_on_light_yellow`, `black_on_light_green`, `red_on_white`, `yellow_on_white`, `green_on_white`, `custom_bg`, `custom_text`.
        /// </summary>
        public readonly string? Palette;
        /// <summary>
        /// Match rule for the table widget text format.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormatReplace? Replace;

        [OutputConstructor]
        private PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormat(
            string? customBgColor,

            string? customFgColor,

            Outputs.PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormatMatch match,

            string? palette,

            Outputs.PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormatReplace? replace)
        {
            CustomBgColor = customBgColor;
            CustomFgColor = customFgColor;
            Match = match;
            Palette = palette;
            Replace = replace;
        }
    }
}
