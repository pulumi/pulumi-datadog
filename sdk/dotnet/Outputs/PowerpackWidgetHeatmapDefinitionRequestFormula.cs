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
    public sealed class PowerpackWidgetHeatmapDefinitionRequestFormula
    {
        /// <summary>
        /// An expression alias.
        /// </summary>
        public readonly string? Alias;
        /// <summary>
        /// A list of display modes for each table cell. Valid values are `number`, `bar`, `trend`.
        /// </summary>
        public readonly string? CellDisplayMode;
        /// <summary>
        /// Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
        /// </summary>
        public readonly ImmutableArray<Outputs.PowerpackWidgetHeatmapDefinitionRequestFormulaConditionalFormat> ConditionalFormats;
        /// <summary>
        /// A string expression built from queries, formulas, and functions.
        /// </summary>
        public readonly string FormulaExpression;
        /// <summary>
        /// The options for limiting results returned.
        /// </summary>
        public readonly Outputs.PowerpackWidgetHeatmapDefinitionRequestFormulaLimit? Limit;
        /// <summary>
        /// Number formatting options for the formula.
        /// </summary>
        public readonly Outputs.PowerpackWidgetHeatmapDefinitionRequestFormulaNumberFormat? NumberFormat;
        /// <summary>
        /// Styling options for widget formulas.
        /// </summary>
        public readonly Outputs.PowerpackWidgetHeatmapDefinitionRequestFormulaStyle? Style;

        [OutputConstructor]
        private PowerpackWidgetHeatmapDefinitionRequestFormula(
            string? alias,

            string? cellDisplayMode,

            ImmutableArray<Outputs.PowerpackWidgetHeatmapDefinitionRequestFormulaConditionalFormat> conditionalFormats,

            string formulaExpression,

            Outputs.PowerpackWidgetHeatmapDefinitionRequestFormulaLimit? limit,

            Outputs.PowerpackWidgetHeatmapDefinitionRequestFormulaNumberFormat? numberFormat,

            Outputs.PowerpackWidgetHeatmapDefinitionRequestFormulaStyle? style)
        {
            Alias = alias;
            CellDisplayMode = cellDisplayMode;
            ConditionalFormats = conditionalFormats;
            FormulaExpression = formulaExpression;
            Limit = limit;
            NumberFormat = numberFormat;
            Style = style;
        }
    }
}
