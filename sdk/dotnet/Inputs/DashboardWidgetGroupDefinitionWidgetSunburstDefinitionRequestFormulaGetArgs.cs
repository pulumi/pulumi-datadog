// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestFormulaGetArgs : Pulumi.ResourceArgs
    {
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        [Input("cellDisplayMode")]
        public Input<string>? CellDisplayMode { get; set; }

        [Input("conditionalFormats")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestFormulaConditionalFormatGetArgs>? _conditionalFormats;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestFormulaConditionalFormatGetArgs> ConditionalFormats
        {
            get => _conditionalFormats ?? (_conditionalFormats = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestFormulaConditionalFormatGetArgs>());
            set => _conditionalFormats = value;
        }

        [Input("formulaExpression", required: true)]
        public Input<string> FormulaExpression { get; set; } = null!;

        [Input("limit")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestFormulaLimitGetArgs>? Limit { get; set; }

        public DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestFormulaGetArgs()
        {
        }
    }
}