// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGeomapDefinitionRequestFormulaNumberFormatUnitGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Canonical Units
        /// </summary>
        [Input("canonical")]
        public Input<Inputs.DashboardWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCanonicalGetArgs>? Canonical { get; set; }

        /// <summary>
        /// Use custom (non canonical metrics)
        /// </summary>
        [Input("custom")]
        public Input<Inputs.DashboardWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomGetArgs>? Custom { get; set; }

        public DashboardWidgetGeomapDefinitionRequestFormulaNumberFormatUnitGetArgs()
        {
        }
        public static new DashboardWidgetGeomapDefinitionRequestFormulaNumberFormatUnitGetArgs Empty => new DashboardWidgetGeomapDefinitionRequestFormulaNumberFormatUnitGetArgs();
    }
}
