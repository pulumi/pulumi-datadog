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
    public sealed class DashboardWidgetChangeDefinitionRequestFormulaNumberFormatUnit
    {
        /// <summary>
        /// Canonical Units
        /// </summary>
        public readonly Outputs.DashboardWidgetChangeDefinitionRequestFormulaNumberFormatUnitCanonical? Canonical;
        /// <summary>
        /// Use custom (non canonical metrics)
        /// </summary>
        public readonly Outputs.DashboardWidgetChangeDefinitionRequestFormulaNumberFormatUnitCustom? Custom;

        [OutputConstructor]
        private DashboardWidgetChangeDefinitionRequestFormulaNumberFormatUnit(
            Outputs.DashboardWidgetChangeDefinitionRequestFormulaNumberFormatUnitCanonical? canonical,

            Outputs.DashboardWidgetChangeDefinitionRequestFormulaNumberFormatUnitCustom? custom)
        {
            Canonical = canonical;
            Custom = custom;
        }
    }
}
