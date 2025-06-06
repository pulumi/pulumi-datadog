// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetChangeDefinitionRequestFormulaNumberFormatArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unit of the number format.
        /// </summary>
        [Input("unit", required: true)]
        public Input<Inputs.PowerpackWidgetChangeDefinitionRequestFormulaNumberFormatUnitArgs> Unit { get; set; } = null!;

        [Input("unitScale")]
        public Input<Inputs.PowerpackWidgetChangeDefinitionRequestFormulaNumberFormatUnitScaleArgs>? UnitScale { get; set; }

        public PowerpackWidgetChangeDefinitionRequestFormulaNumberFormatArgs()
        {
        }
        public static new PowerpackWidgetChangeDefinitionRequestFormulaNumberFormatArgs Empty => new PowerpackWidgetChangeDefinitionRequestFormulaNumberFormatArgs();
    }
}
