// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetScatterplotDefinitionRequestScatterplotTableFormula {
    /**
     * @return An expression alias.
     * 
     */
    private @Nullable String alias;
    /**
     * @return Dimension of the Scatterplot. Valid values are `x`, `y`, `radius`, `color`.
     * 
     */
    private String dimension;
    /**
     * @return A string expression built from queries, formulas, and functions.
     * 
     */
    private String formulaExpression;

    private PowerpackWidgetScatterplotDefinitionRequestScatterplotTableFormula() {}
    /**
     * @return An expression alias.
     * 
     */
    public Optional<String> alias() {
        return Optional.ofNullable(this.alias);
    }
    /**
     * @return Dimension of the Scatterplot. Valid values are `x`, `y`, `radius`, `color`.
     * 
     */
    public String dimension() {
        return this.dimension;
    }
    /**
     * @return A string expression built from queries, formulas, and functions.
     * 
     */
    public String formulaExpression() {
        return this.formulaExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetScatterplotDefinitionRequestScatterplotTableFormula defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alias;
        private String dimension;
        private String formulaExpression;
        public Builder() {}
        public Builder(PowerpackWidgetScatterplotDefinitionRequestScatterplotTableFormula defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.dimension = defaults.dimension;
    	      this.formulaExpression = defaults.formulaExpression;
        }

        @CustomType.Setter
        public Builder alias(@Nullable String alias) {

            this.alias = alias;
            return this;
        }
        @CustomType.Setter
        public Builder dimension(String dimension) {
            if (dimension == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetScatterplotDefinitionRequestScatterplotTableFormula", "dimension");
            }
            this.dimension = dimension;
            return this;
        }
        @CustomType.Setter
        public Builder formulaExpression(String formulaExpression) {
            if (formulaExpression == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetScatterplotDefinitionRequestScatterplotTableFormula", "formulaExpression");
            }
            this.formulaExpression = formulaExpression;
            return this;
        }
        public PowerpackWidgetScatterplotDefinitionRequestScatterplotTableFormula build() {
            final var _resultValue = new PowerpackWidgetScatterplotDefinitionRequestScatterplotTableFormula();
            _resultValue.alias = alias;
            _resultValue.dimension = dimension;
            _resultValue.formulaExpression = formulaExpression;
            return _resultValue;
        }
    }
}