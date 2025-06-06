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
    public sealed class PowerpackWidgetTreemapDefinitionRequestFormulaNumberFormatUnit
    {
        /// <summary>
        /// Canonical Units
        /// </summary>
        public readonly Outputs.PowerpackWidgetTreemapDefinitionRequestFormulaNumberFormatUnitCanonical? Canonical;
        /// <summary>
        /// Use custom (non canonical metrics)
        /// </summary>
        public readonly Outputs.PowerpackWidgetTreemapDefinitionRequestFormulaNumberFormatUnitCustom? Custom;

        [OutputConstructor]
        private PowerpackWidgetTreemapDefinitionRequestFormulaNumberFormatUnit(
            Outputs.PowerpackWidgetTreemapDefinitionRequestFormulaNumberFormatUnitCanonical? canonical,

            Outputs.PowerpackWidgetTreemapDefinitionRequestFormulaNumberFormatUnitCustom? custom)
        {
            Canonical = canonical;
            Custom = custom;
        }
    }
}
