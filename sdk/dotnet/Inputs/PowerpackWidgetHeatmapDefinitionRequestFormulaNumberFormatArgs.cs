// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetHeatmapDefinitionRequestFormulaNumberFormatArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unit of the number format.
        /// </summary>
        [Input("unit", required: true)]
        public Input<Inputs.PowerpackWidgetHeatmapDefinitionRequestFormulaNumberFormatUnitArgs> Unit { get; set; } = null!;

        [Input("unitScale")]
        public Input<Inputs.PowerpackWidgetHeatmapDefinitionRequestFormulaNumberFormatUnitScaleArgs>? UnitScale { get; set; }

        public PowerpackWidgetHeatmapDefinitionRequestFormulaNumberFormatArgs()
        {
        }
        public static new PowerpackWidgetHeatmapDefinitionRequestFormulaNumberFormatArgs Empty => new PowerpackWidgetHeatmapDefinitionRequestFormulaNumberFormatArgs();
    }
}
