// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class DashboardWidgetGroupDefinitionWidgetHostmapDefinitionStyle
    {
        public readonly string? FillMax;
        public readonly string? FillMin;
        public readonly string? Palette;
        public readonly bool? PaletteFlip;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetHostmapDefinitionStyle(
            string? fillMax,

            string? fillMin,

            string? palette,

            bool? paletteFlip)
        {
            FillMax = fillMax;
            FillMin = fillMin;
            Palette = palette;
            PaletteFlip = paletteFlip;
        }
    }
}
