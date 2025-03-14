// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnit;
import com.pulumi.datadog.outputs.DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormat {
    /**
     * @return Unit of the number format.
     * 
     */
    private DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnit unit;
    private @Nullable DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale unitScale;

    private DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormat() {}
    /**
     * @return Unit of the number format.
     * 
     */
    public DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnit unit() {
        return this.unit;
    }
    public Optional<DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale> unitScale() {
        return Optional.ofNullable(this.unitScale);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnit unit;
        private @Nullable DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale unitScale;
        public Builder() {}
        public Builder(DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.unitScale = defaults.unitScale;
        }

        @CustomType.Setter
        public Builder unit(DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnit unit) {
            if (unit == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormat", "unit");
            }
            this.unit = unit;
            return this;
        }
        @CustomType.Setter
        public Builder unitScale(@Nullable DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitScale unitScale) {

            this.unitScale = unitScale;
            return this;
        }
        public DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormat build() {
            final var _resultValue = new DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormat();
            _resultValue.unit = unit;
            _resultValue.unitScale = unitScale;
            return _resultValue;
        }
    }
}
