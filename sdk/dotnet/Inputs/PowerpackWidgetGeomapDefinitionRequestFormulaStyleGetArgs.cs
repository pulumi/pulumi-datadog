// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetGeomapDefinitionRequestFormulaStyleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The color palette to apply. Valid values are `blue`, `custom_bg`, `custom_image`, `custom_text`, `gray_on_white`, `grey`, `green`, `orange`, `red`, `red_on_white`, `white_on_gray`, `white_on_green`, `green_on_white`, `white_on_red`, `white_on_yellow`, `yellow_on_white`, `black_on_light_yellow`, `black_on_light_green`, `black_on_light_red`.
        /// </summary>
        [Input("palette")]
        public Input<string>? Palette { get; set; }

        /// <summary>
        /// Index specifying which color to use within the palette.
        /// </summary>
        [Input("paletteIndex")]
        public Input<int>? PaletteIndex { get; set; }

        public PowerpackWidgetGeomapDefinitionRequestFormulaStyleGetArgs()
        {
        }
        public static new PowerpackWidgetGeomapDefinitionRequestFormulaStyleGetArgs Empty => new PowerpackWidgetGeomapDefinitionRequestFormulaStyleGetArgs();
    }
}
