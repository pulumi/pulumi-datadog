// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale {
    private String unitName;

    private PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale() {}
    public String unitName() {
        return this.unitName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String unitName;
        public Builder() {}
        public Builder(PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unitName = defaults.unitName;
        }

        @CustomType.Setter
        public Builder unitName(String unitName) {
            if (unitName == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale", "unitName");
            }
            this.unitName = unitName;
            return this;
        }
        public PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale build() {
            final var _resultValue = new PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale();
            _resultValue.unitName = unitName;
            return _resultValue;
        }
    }
}
