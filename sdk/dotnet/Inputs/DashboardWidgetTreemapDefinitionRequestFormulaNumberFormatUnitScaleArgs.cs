// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetTreemapDefinitionRequestFormulaNumberFormatUnitScaleArgs : global::Pulumi.ResourceArgs
    {
        [Input("unitName", required: true)]
        public Input<string> UnitName { get; set; } = null!;

        public DashboardWidgetTreemapDefinitionRequestFormulaNumberFormatUnitScaleArgs()
        {
        }
        public static new DashboardWidgetTreemapDefinitionRequestFormulaNumberFormatUnitScaleArgs Empty => new DashboardWidgetTreemapDefinitionRequestFormulaNumberFormatUnitScaleArgs();
    }
}
