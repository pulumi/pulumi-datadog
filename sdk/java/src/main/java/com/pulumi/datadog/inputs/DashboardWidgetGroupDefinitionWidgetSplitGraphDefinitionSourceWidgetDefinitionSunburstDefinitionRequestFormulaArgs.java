// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaConditionalFormatArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaLimitArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaStyleArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs Empty = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs();

    /**
     * An expression alias.
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    /**
     * @return An expression alias.
     * 
     */
    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * A list of display modes for each table cell. Valid values are `number`, `bar`.
     * 
     */
    @Import(name="cellDisplayMode")
    private @Nullable Output<String> cellDisplayMode;

    /**
     * @return A list of display modes for each table cell. Valid values are `number`, `bar`.
     * 
     */
    public Optional<Output<String>> cellDisplayMode() {
        return Optional.ofNullable(this.cellDisplayMode);
    }

    /**
     * Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    @Import(name="conditionalFormats")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaConditionalFormatArgs>> conditionalFormats;

    /**
     * @return Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaConditionalFormatArgs>>> conditionalFormats() {
        return Optional.ofNullable(this.conditionalFormats);
    }

    /**
     * A string expression built from queries, formulas, and functions.
     * 
     */
    @Import(name="formulaExpression", required=true)
    private Output<String> formulaExpression;

    /**
     * @return A string expression built from queries, formulas, and functions.
     * 
     */
    public Output<String> formulaExpression() {
        return this.formulaExpression;
    }

    /**
     * The maximum number of items in the group.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaLimitArgs> limit;

    /**
     * @return The maximum number of items in the group.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaLimitArgs>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * Styling options for widget formulas.
     * 
     */
    @Import(name="style")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaStyleArgs> style;

    /**
     * @return Styling options for widget formulas.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaStyleArgs>> style() {
        return Optional.ofNullable(this.style);
    }

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs() {}

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs $) {
        this.alias = $.alias;
        this.cellDisplayMode = $.cellDisplayMode;
        this.conditionalFormats = $.conditionalFormats;
        this.formulaExpression = $.formulaExpression;
        this.limit = $.limit;
        this.style = $.style;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alias An expression alias.
         * 
         * @return builder
         * 
         */
        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias An expression alias.
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param cellDisplayMode A list of display modes for each table cell. Valid values are `number`, `bar`.
         * 
         * @return builder
         * 
         */
        public Builder cellDisplayMode(@Nullable Output<String> cellDisplayMode) {
            $.cellDisplayMode = cellDisplayMode;
            return this;
        }

        /**
         * @param cellDisplayMode A list of display modes for each table cell. Valid values are `number`, `bar`.
         * 
         * @return builder
         * 
         */
        public Builder cellDisplayMode(String cellDisplayMode) {
            return cellDisplayMode(Output.of(cellDisplayMode));
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaConditionalFormatArgs>> conditionalFormats) {
            $.conditionalFormats = conditionalFormats;
            return this;
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaConditionalFormatArgs> conditionalFormats) {
            return conditionalFormats(Output.of(conditionalFormats));
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaConditionalFormatArgs... conditionalFormats) {
            return conditionalFormats(List.of(conditionalFormats));
        }

        /**
         * @param formulaExpression A string expression built from queries, formulas, and functions.
         * 
         * @return builder
         * 
         */
        public Builder formulaExpression(Output<String> formulaExpression) {
            $.formulaExpression = formulaExpression;
            return this;
        }

        /**
         * @param formulaExpression A string expression built from queries, formulas, and functions.
         * 
         * @return builder
         * 
         */
        public Builder formulaExpression(String formulaExpression) {
            return formulaExpression(Output.of(formulaExpression));
        }

        /**
         * @param limit The maximum number of items in the group.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaLimitArgs> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit The maximum number of items in the group.
         * 
         * @return builder
         * 
         */
        public Builder limit(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaLimitArgs limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param style Styling options for widget formulas.
         * 
         * @return builder
         * 
         */
        public Builder style(@Nullable Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaStyleArgs> style) {
            $.style = style;
            return this;
        }

        /**
         * @param style Styling options for widget formulas.
         * 
         * @return builder
         * 
         */
        public Builder style(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaStyleArgs style) {
            return style(Output.of(style));
        }

        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs build() {
            if ($.formulaExpression == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestFormulaArgs", "formulaExpression");
            }
            return $;
        }
    }

}