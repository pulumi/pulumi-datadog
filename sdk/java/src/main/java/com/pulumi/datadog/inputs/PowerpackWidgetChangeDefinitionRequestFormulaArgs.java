// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetChangeDefinitionRequestFormulaConditionalFormatArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetChangeDefinitionRequestFormulaLimitArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetChangeDefinitionRequestFormulaStyleArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetChangeDefinitionRequestFormulaArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetChangeDefinitionRequestFormulaArgs Empty = new PowerpackWidgetChangeDefinitionRequestFormulaArgs();

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
    private @Nullable Output<List<PowerpackWidgetChangeDefinitionRequestFormulaConditionalFormatArgs>> conditionalFormats;

    /**
     * @return Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<PowerpackWidgetChangeDefinitionRequestFormulaConditionalFormatArgs>>> conditionalFormats() {
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
    private @Nullable Output<PowerpackWidgetChangeDefinitionRequestFormulaLimitArgs> limit;

    /**
     * @return The options for limiting results returned.
     * 
     */
    public Optional<Output<PowerpackWidgetChangeDefinitionRequestFormulaLimitArgs>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * Styling options for widget formulas.
     * 
     */
    @Import(name="style")
    private @Nullable Output<PowerpackWidgetChangeDefinitionRequestFormulaStyleArgs> style;

    /**
     * @return Styling options for widget formulas.
     * 
     */
    public Optional<Output<PowerpackWidgetChangeDefinitionRequestFormulaStyleArgs>> style() {
        return Optional.ofNullable(this.style);
    }

    private PowerpackWidgetChangeDefinitionRequestFormulaArgs() {}

    private PowerpackWidgetChangeDefinitionRequestFormulaArgs(PowerpackWidgetChangeDefinitionRequestFormulaArgs $) {
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
    public static Builder builder(PowerpackWidgetChangeDefinitionRequestFormulaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetChangeDefinitionRequestFormulaArgs $;

        public Builder() {
            $ = new PowerpackWidgetChangeDefinitionRequestFormulaArgs();
        }

        public Builder(PowerpackWidgetChangeDefinitionRequestFormulaArgs defaults) {
            $ = new PowerpackWidgetChangeDefinitionRequestFormulaArgs(Objects.requireNonNull(defaults));
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
        public Builder conditionalFormats(@Nullable Output<List<PowerpackWidgetChangeDefinitionRequestFormulaConditionalFormatArgs>> conditionalFormats) {
            $.conditionalFormats = conditionalFormats;
            return this;
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(List<PowerpackWidgetChangeDefinitionRequestFormulaConditionalFormatArgs> conditionalFormats) {
            return conditionalFormats(Output.of(conditionalFormats));
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(PowerpackWidgetChangeDefinitionRequestFormulaConditionalFormatArgs... conditionalFormats) {
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
        public Builder limit(@Nullable Output<PowerpackWidgetChangeDefinitionRequestFormulaLimitArgs> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit The options for limiting results returned.
         * 
         * @return builder
         * 
         */
        public Builder limit(PowerpackWidgetChangeDefinitionRequestFormulaLimitArgs limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param style Styling options for widget formulas.
         * 
         * @return builder
         * 
         */
        public Builder style(@Nullable Output<PowerpackWidgetChangeDefinitionRequestFormulaStyleArgs> style) {
            $.style = style;
            return this;
        }

        /**
         * @param style Styling options for widget formulas.
         * 
         * @return builder
         * 
         */
        public Builder style(PowerpackWidgetChangeDefinitionRequestFormulaStyleArgs style) {
            return style(Output.of(style));
        }

        public PowerpackWidgetChangeDefinitionRequestFormulaArgs build() {
            if ($.formulaExpression == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetChangeDefinitionRequestFormulaArgs", "formulaExpression");
            }
            return $;
        }
    }

}