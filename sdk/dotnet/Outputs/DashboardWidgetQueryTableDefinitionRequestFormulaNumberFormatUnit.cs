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
    public sealed class DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnit
    {
        /// <summary>
        /// Canonical Units
        /// </summary>
        public readonly Outputs.DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCanonical? Canonical;
        /// <summary>
        /// Use custom (non canonical metrics)
        /// </summary>
        public readonly Outputs.DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustom? Custom;

        [OutputConstructor]
        private DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnit(
            Outputs.DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCanonical? canonical,

            Outputs.DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustom? custom)
        {
            Canonical = canonical;
            Custom = custom;
        }
    }
}
