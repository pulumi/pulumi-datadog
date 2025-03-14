// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitScale;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormat {
    /**
     * @return Unit of the number format.
     * 
     */
    private PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit unit;
    private @Nullable PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitScale unitScale;

    private PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormat() {}
    /**
     * @return Unit of the number format.
     * 
     */
    public PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit unit() {
        return this.unit;
    }
    public Optional<PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitScale> unitScale() {
        return Optional.ofNullable(this.unitScale);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit unit;
        private @Nullable PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitScale unitScale;
        public Builder() {}
        public Builder(PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.unitScale = defaults.unitScale;
        }

        @CustomType.Setter
        public Builder unit(PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit unit) {
            if (unit == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormat", "unit");
            }
            this.unit = unit;
            return this;
        }
        @CustomType.Setter
        public Builder unitScale(@Nullable PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitScale unitScale) {

            this.unitScale = unitScale;
            return this;
        }
        public PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormat build() {
            final var _resultValue = new PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormat();
            _resultValue.unit = unit;
            _resultValue.unitScale = unitScale;
            return _resultValue;
        }
    }
}
