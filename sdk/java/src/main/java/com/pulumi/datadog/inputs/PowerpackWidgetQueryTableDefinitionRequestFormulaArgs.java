// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryTableDefinitionRequestFormulaConditionalFormatArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryTableDefinitionRequestFormulaLimitArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryTableDefinitionRequestFormulaNumberFormatArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryTableDefinitionRequestFormulaStyleArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetQueryTableDefinitionRequestFormulaArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetQueryTableDefinitionRequestFormulaArgs Empty = new PowerpackWidgetQueryTableDefinitionRequestFormulaArgs();

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
     * A list of display modes for each table cell. Valid values are `number`, `bar`, `trend`.
     * 
     */
    @Import(name="cellDisplayMode")
    private @Nullable Output<String> cellDisplayMode;

    /**
     * @return A list of display modes for each table cell. Valid values are `number`, `bar`, `trend`.
     * 
     */
    public Optional<Output<String>> cellDisplayMode() {
        return Optional.ofNullable(this.cellDisplayMode);
    }

    /**
     * A list of display modes for each table cell.
     * 
     */
    @Import(name="cellDisplayModeOptions")
    private @Nullable Output<PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs> cellDisplayModeOptions;

    /**
     * @return A list of display modes for each table cell.
     * 
     */
    public Optional<Output<PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs>> cellDisplayModeOptions() {
        return Optional.ofNullable(this.cellDisplayModeOptions);
    }

    /**
     * Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    @Import(name="conditionalFormats")
    private @Nullable Output<List<PowerpackWidgetQueryTableDefinitionRequestFormulaConditionalFormatArgs>> conditionalFormats;

    /**
     * @return Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<PowerpackWidgetQueryTableDefinitionRequestFormulaConditionalFormatArgs>>> conditionalFormats() {
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
     * The options for limiting results returned.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<PowerpackWidgetQueryTableDefinitionRequestFormulaLimitArgs> limit;

    /**
     * @return The options for limiting results returned.
     * 
     */
    public Optional<Output<PowerpackWidgetQueryTableDefinitionRequestFormulaLimitArgs>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * Number formatting options for the formula.
     * 
     */
    @Import(name="numberFormat")
    private @Nullable Output<PowerpackWidgetQueryTableDefinitionRequestFormulaNumberFormatArgs> numberFormat;

    /**
     * @return Number formatting options for the formula.
     * 
     */
    public Optional<Output<PowerpackWidgetQueryTableDefinitionRequestFormulaNumberFormatArgs>> numberFormat() {
        return Optional.ofNullable(this.numberFormat);
    }

    /**
     * Styling options for widget formulas.
     * 
     */
    @Import(name="style")
    private @Nullable Output<PowerpackWidgetQueryTableDefinitionRequestFormulaStyleArgs> style;

    /**
     * @return Styling options for widget formulas.
     * 
     */
    public Optional<Output<PowerpackWidgetQueryTableDefinitionRequestFormulaStyleArgs>> style() {
        return Optional.ofNullable(this.style);
    }

    private PowerpackWidgetQueryTableDefinitionRequestFormulaArgs() {}

    private PowerpackWidgetQueryTableDefinitionRequestFormulaArgs(PowerpackWidgetQueryTableDefinitionRequestFormulaArgs $) {
        this.alias = $.alias;
        this.cellDisplayMode = $.cellDisplayMode;
        this.cellDisplayModeOptions = $.cellDisplayModeOptions;
        this.conditionalFormats = $.conditionalFormats;
        this.formulaExpression = $.formulaExpression;
        this.limit = $.limit;
        this.numberFormat = $.numberFormat;
        this.style = $.style;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetQueryTableDefinitionRequestFormulaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetQueryTableDefinitionRequestFormulaArgs $;

        public Builder() {
            $ = new PowerpackWidgetQueryTableDefinitionRequestFormulaArgs();
        }

        public Builder(PowerpackWidgetQueryTableDefinitionRequestFormulaArgs defaults) {
            $ = new PowerpackWidgetQueryTableDefinitionRequestFormulaArgs(Objects.requireNonNull(defaults));
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
         * @param cellDisplayMode A list of display modes for each table cell. Valid values are `number`, `bar`, `trend`.
         * 
         * @return builder
         * 
         */
        public Builder cellDisplayMode(@Nullable Output<String> cellDisplayMode) {
            $.cellDisplayMode = cellDisplayMode;
            return this;
        }

        /**
         * @param cellDisplayMode A list of display modes for each table cell. Valid values are `number`, `bar`, `trend`.
         * 
         * @return builder
         * 
         */
        public Builder cellDisplayMode(String cellDisplayMode) {
            return cellDisplayMode(Output.of(cellDisplayMode));
        }

        /**
         * @param cellDisplayModeOptions A list of display modes for each table cell.
         * 
         * @return builder
         * 
         */
        public Builder cellDisplayModeOptions(@Nullable Output<PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs> cellDisplayModeOptions) {
            $.cellDisplayModeOptions = cellDisplayModeOptions;
            return this;
        }

        /**
         * @param cellDisplayModeOptions A list of display modes for each table cell.
         * 
         * @return builder
         * 
         */
        public Builder cellDisplayModeOptions(PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs cellDisplayModeOptions) {
            return cellDisplayModeOptions(Output.of(cellDisplayModeOptions));
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(@Nullable Output<List<PowerpackWidgetQueryTableDefinitionRequestFormulaConditionalFormatArgs>> conditionalFormats) {
            $.conditionalFormats = conditionalFormats;
            return this;
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(List<PowerpackWidgetQueryTableDefinitionRequestFormulaConditionalFormatArgs> conditionalFormats) {
            return conditionalFormats(Output.of(conditionalFormats));
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(PowerpackWidgetQueryTableDefinitionRequestFormulaConditionalFormatArgs... conditionalFormats) {
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
         * @param limit The options for limiting results returned.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<PowerpackWidgetQueryTableDefinitionRequestFormulaLimitArgs> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit The options for limiting results returned.
         * 
         * @return builder
         * 
         */
        public Builder limit(PowerpackWidgetQueryTableDefinitionRequestFormulaLimitArgs limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param numberFormat Number formatting options for the formula.
         * 
         * @return builder
         * 
         */
        public Builder numberFormat(@Nullable Output<PowerpackWidgetQueryTableDefinitionRequestFormulaNumberFormatArgs> numberFormat) {
            $.numberFormat = numberFormat;
            return this;
        }

        /**
         * @param numberFormat Number formatting options for the formula.
         * 
         * @return builder
         * 
         */
        public Builder numberFormat(PowerpackWidgetQueryTableDefinitionRequestFormulaNumberFormatArgs numberFormat) {
            return numberFormat(Output.of(numberFormat));
        }

        /**
         * @param style Styling options for widget formulas.
         * 
         * @return builder
         * 
         */
        public Builder style(@Nullable Output<PowerpackWidgetQueryTableDefinitionRequestFormulaStyleArgs> style) {
            $.style = style;
            return this;
        }

        /**
         * @param style Styling options for widget formulas.
         * 
         * @return builder
         * 
         */
        public Builder style(PowerpackWidgetQueryTableDefinitionRequestFormulaStyleArgs style) {
            return style(Output.of(style));
        }

        public PowerpackWidgetQueryTableDefinitionRequestFormulaArgs build() {
            if ($.formulaExpression == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetQueryTableDefinitionRequestFormulaArgs", "formulaExpression");
            }
            return $;
        }
    }

}
