// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSunburstDefinitionRequestFormulaNumberFormatUnitGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Canonical Units
        /// </summary>
        [Input("canonical")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestFormulaNumberFormatUnitCanonicalGetArgs>? Canonical { get; set; }

        /// <summary>
        /// Use custom (non canonical metrics)
        /// </summary>
        [Input("custom")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestFormulaNumberFormatUnitCustomGetArgs>? Custom { get; set; }

        public DashboardWidgetSunburstDefinitionRequestFormulaNumberFormatUnitGetArgs()
        {
        }
        public static new DashboardWidgetSunburstDefinitionRequestFormulaNumberFormatUnitGetArgs Empty => new DashboardWidgetSunburstDefinitionRequestFormulaNumberFormatUnitGetArgs();
    }
}
