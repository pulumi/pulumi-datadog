// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetChangeDefinitionRequestFormulaNumberFormatGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unit of the number format.
        /// </summary>
        [Input("unit", required: true)]
        public Input<Inputs.PowerpackWidgetChangeDefinitionRequestFormulaNumberFormatUnitGetArgs> Unit { get; set; } = null!;

        [Input("unitScale")]
        public Input<Inputs.PowerpackWidgetChangeDefinitionRequestFormulaNumberFormatUnitScaleGetArgs>? UnitScale { get; set; }

        public PowerpackWidgetChangeDefinitionRequestFormulaNumberFormatGetArgs()
        {
        }
        public static new PowerpackWidgetChangeDefinitionRequestFormulaNumberFormatGetArgs Empty => new PowerpackWidgetChangeDefinitionRequestFormulaNumberFormatGetArgs();
    }
}
