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
    public sealed class PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormat
    {
        /// <summary>
        /// Unit of the number format.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit Unit;
        public readonly Outputs.PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitScale? UnitScale;

        [OutputConstructor]
        private PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormat(
            Outputs.PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit unit,

            Outputs.PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitScale? unitScale)
        {
            Unit = unit;
            UnitScale = unitScale;
        }
    }
}
