// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetChangeDefinitionRequestFormulaConditionalFormat;
import com.pulumi.datadog.outputs.PowerpackWidgetChangeDefinitionRequestFormulaLimit;
import com.pulumi.datadog.outputs.PowerpackWidgetChangeDefinitionRequestFormulaNumberFormat;
import com.pulumi.datadog.outputs.PowerpackWidgetChangeDefinitionRequestFormulaStyle;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetChangeDefinitionRequestFormula {
    /**
     * @return An expression alias.
     * 
     */
    private @Nullable String alias;
    /**
     * @return A list of display modes for each table cell. Valid values are `number`, `bar`, `trend`.
     * 
     */
    private @Nullable String cellDisplayMode;
    /**
     * @return Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<PowerpackWidgetChangeDefinitionRequestFormulaConditionalFormat> conditionalFormats;
    /**
     * @return A string expression built from queries, formulas, and functions.
     * 
     */
    private String formulaExpression;
    /**
     * @return The options for limiting results returned.
     * 
     */
    private @Nullable PowerpackWidgetChangeDefinitionRequestFormulaLimit limit;
    /**
     * @return Number formatting options for the formula.
     * 
     */
    private @Nullable PowerpackWidgetChangeDefinitionRequestFormulaNumberFormat numberFormat;
    /**
     * @return Styling options for widget formulas.
     * 
     */
    private @Nullable PowerpackWidgetChangeDefinitionRequestFormulaStyle style;

    private PowerpackWidgetChangeDefinitionRequestFormula() {}
    /**
     * @return An expression alias.
     * 
     */
    public Optional<String> alias() {
        return Optional.ofNullable(this.alias);
    }
    /**
     * @return A list of display modes for each table cell. Valid values are `number`, `bar`, `trend`.
     * 
     */
    public Optional<String> cellDisplayMode() {
        return Optional.ofNullable(this.cellDisplayMode);
    }
    /**
     * @return Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    public List<PowerpackWidgetChangeDefinitionRequestFormulaConditionalFormat> conditionalFormats() {
        return this.conditionalFormats == null ? List.of() : this.conditionalFormats;
    }
    /**
     * @return A string expression built from queries, formulas, and functions.
     * 
     */
    public String formulaExpression() {
        return this.formulaExpression;
    }
    /**
     * @return The options for limiting results returned.
     * 
     */
    public Optional<PowerpackWidgetChangeDefinitionRequestFormulaLimit> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return Number formatting options for the formula.
     * 
     */
    public Optional<PowerpackWidgetChangeDefinitionRequestFormulaNumberFormat> numberFormat() {
        return Optional.ofNullable(this.numberFormat);
    }
    /**
     * @return Styling options for widget formulas.
     * 
     */
    public Optional<PowerpackWidgetChangeDefinitionRequestFormulaStyle> style() {
        return Optional.ofNullable(this.style);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetChangeDefinitionRequestFormula defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alias;
        private @Nullable String cellDisplayMode;
        private @Nullable List<PowerpackWidgetChangeDefinitionRequestFormulaConditionalFormat> conditionalFormats;
        private String formulaExpression;
        private @Nullable PowerpackWidgetChangeDefinitionRequestFormulaLimit limit;
        private @Nullable PowerpackWidgetChangeDefinitionRequestFormulaNumberFormat numberFormat;
        private @Nullable PowerpackWidgetChangeDefinitionRequestFormulaStyle style;
        public Builder() {}
        public Builder(PowerpackWidgetChangeDefinitionRequestFormula defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.cellDisplayMode = defaults.cellDisplayMode;
    	      this.conditionalFormats = defaults.conditionalFormats;
    	      this.formulaExpression = defaults.formulaExpression;
    	      this.limit = defaults.limit;
    	      this.numberFormat = defaults.numberFormat;
    	      this.style = defaults.style;
        }

        @CustomType.Setter
        public Builder alias(@Nullable String alias) {

            this.alias = alias;
            return this;
        }
        @CustomType.Setter
        public Builder cellDisplayMode(@Nullable String cellDisplayMode) {

            this.cellDisplayMode = cellDisplayMode;
            return this;
        }
        @CustomType.Setter
        public Builder conditionalFormats(@Nullable List<PowerpackWidgetChangeDefinitionRequestFormulaConditionalFormat> conditionalFormats) {

            this.conditionalFormats = conditionalFormats;
            return this;
        }
        public Builder conditionalFormats(PowerpackWidgetChangeDefinitionRequestFormulaConditionalFormat... conditionalFormats) {
            return conditionalFormats(List.of(conditionalFormats));
        }
        @CustomType.Setter
        public Builder formulaExpression(String formulaExpression) {
            if (formulaExpression == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetChangeDefinitionRequestFormula", "formulaExpression");
            }
            this.formulaExpression = formulaExpression;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable PowerpackWidgetChangeDefinitionRequestFormulaLimit limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder numberFormat(@Nullable PowerpackWidgetChangeDefinitionRequestFormulaNumberFormat numberFormat) {

            this.numberFormat = numberFormat;
            return this;
        }
        @CustomType.Setter
        public Builder style(@Nullable PowerpackWidgetChangeDefinitionRequestFormulaStyle style) {

            this.style = style;
            return this;
        }
        public PowerpackWidgetChangeDefinitionRequestFormula build() {
            final var _resultValue = new PowerpackWidgetChangeDefinitionRequestFormula();
            _resultValue.alias = alias;
            _resultValue.cellDisplayMode = cellDisplayMode;
            _resultValue.conditionalFormats = conditionalFormats;
            _resultValue.formulaExpression = formulaExpression;
            _resultValue.limit = limit;
            _resultValue.numberFormat = numberFormat;
            _resultValue.style = style;
            return _resultValue;
        }
    }
}
