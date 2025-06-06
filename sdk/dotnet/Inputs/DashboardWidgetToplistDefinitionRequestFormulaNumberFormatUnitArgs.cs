// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetToplistDefinitionRequestFormulaNumberFormatUnitArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Canonical Units
        /// </summary>
        [Input("canonical")]
        public Input<Inputs.DashboardWidgetToplistDefinitionRequestFormulaNumberFormatUnitCanonicalArgs>? Canonical { get; set; }

        /// <summary>
        /// Use custom (non canonical metrics)
        /// </summary>
        [Input("custom")]
        public Input<Inputs.DashboardWidgetToplistDefinitionRequestFormulaNumberFormatUnitCustomArgs>? Custom { get; set; }

        public DashboardWidgetToplistDefinitionRequestFormulaNumberFormatUnitArgs()
        {
        }
        public static new DashboardWidgetToplistDefinitionRequestFormulaNumberFormatUnitArgs Empty => new DashboardWidgetToplistDefinitionRequestFormulaNumberFormatUnitArgs();
    }
}
