// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormulaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An expression alias.
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        /// <summary>
        /// A list of display modes for each table cell. Valid values are `number`, `bar`.
        /// </summary>
        [Input("cellDisplayMode")]
        public Input<string>? CellDisplayMode { get; set; }

        [Input("conditionalFormats")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormulaConditionalFormatArgs>? _conditionalFormats;

        /// <summary>
        /// Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
        /// </summary>
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormulaConditionalFormatArgs> ConditionalFormats
        {
            get => _conditionalFormats ?? (_conditionalFormats = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormulaConditionalFormatArgs>());
            set => _conditionalFormats = value;
        }

        /// <summary>
        /// A string expression built from queries, formulas, and functions.
        /// </summary>
        [Input("formulaExpression", required: true)]
        public Input<string> FormulaExpression { get; set; } = null!;

        /// <summary>
        /// The maximum number of items in the group.
        /// </summary>
        [Input("limit")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormulaLimitArgs>? Limit { get; set; }

        /// <summary>
        /// Styling options for widget formulas.
        /// </summary>
        [Input("style")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormulaStyleArgs>? Style { get; set; }

        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormulaArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormulaArgs Empty => new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormulaArgs();
    }
}