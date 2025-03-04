// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnit;
import com.pulumi.datadog.outputs.PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormat {
    /**
     * @return Unit of the number format.
     * 
     */
    private PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnit unit;
    private @Nullable PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale unitScale;

    private PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormat() {}
    /**
     * @return Unit of the number format.
     * 
     */
    public PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnit unit() {
        return this.unit;
    }
    public Optional<PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale> unitScale() {
        return Optional.ofNullable(this.unitScale);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnit unit;
        private @Nullable PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale unitScale;
        public Builder() {}
        public Builder(PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.unitScale = defaults.unitScale;
        }

        @CustomType.Setter
        public Builder unit(PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnit unit) {
            if (unit == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormat", "unit");
            }
            this.unit = unit;
            return this;
        }
        @CustomType.Setter
        public Builder unitScale(@Nullable PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale unitScale) {

            this.unitScale = unitScale;
            return this;
        }
        public PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormat build() {
            final var _resultValue = new PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormat();
            _resultValue.unit = unit;
            _resultValue.unitScale = unitScale;
            return _resultValue;
        }
    }
}
