// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnit;
import com.pulumi.datadog.outputs.PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitScale;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormat {
    /**
     * @return Unit of the number format.
     * 
     */
    private PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnit unit;
    private @Nullable PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitScale unitScale;

    private PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormat() {}
    /**
     * @return Unit of the number format.
     * 
     */
    public PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnit unit() {
        return this.unit;
    }
    public Optional<PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitScale> unitScale() {
        return Optional.ofNullable(this.unitScale);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnit unit;
        private @Nullable PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitScale unitScale;
        public Builder() {}
        public Builder(PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.unitScale = defaults.unitScale;
        }

        @CustomType.Setter
        public Builder unit(PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnit unit) {
            if (unit == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormat", "unit");
            }
            this.unit = unit;
            return this;
        }
        @CustomType.Setter
        public Builder unitScale(@Nullable PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitScale unitScale) {

            this.unitScale = unitScale;
            return this;
        }
        public PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormat build() {
            final var _resultValue = new PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormat();
            _resultValue.unit = unit;
            _resultValue.unitScale = unitScale;
            return _resultValue;
        }
    }
}
