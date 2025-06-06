// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetQueryTableDefinitionRequestFormulaNumberFormatArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unit of the number format.
        /// </summary>
        [Input("unit", required: true)]
        public Input<Inputs.PowerpackWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitArgs> Unit { get; set; } = null!;

        [Input("unitScale")]
        public Input<Inputs.PowerpackWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitScaleArgs>? UnitScale { get; set; }

        public PowerpackWidgetQueryTableDefinitionRequestFormulaNumberFormatArgs()
        {
        }
        public static new PowerpackWidgetQueryTableDefinitionRequestFormulaNumberFormatArgs Empty => new PowerpackWidgetQueryTableDefinitionRequestFormulaNumberFormatArgs();
    }
}
