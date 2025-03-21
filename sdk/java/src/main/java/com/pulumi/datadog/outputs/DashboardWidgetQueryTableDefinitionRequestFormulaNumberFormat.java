// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnit;
import com.pulumi.datadog.outputs.DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitScale;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormat {
    /**
     * @return Unit of the number format.
     * 
     */
    private DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnit unit;
    private @Nullable DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitScale unitScale;

    private DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormat() {}
    /**
     * @return Unit of the number format.
     * 
     */
    public DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnit unit() {
        return this.unit;
    }
    public Optional<DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitScale> unitScale() {
        return Optional.ofNullable(this.unitScale);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnit unit;
        private @Nullable DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitScale unitScale;
        public Builder() {}
        public Builder(DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.unitScale = defaults.unitScale;
        }

        @CustomType.Setter
        public Builder unit(DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnit unit) {
            if (unit == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormat", "unit");
            }
            this.unit = unit;
            return this;
        }
        @CustomType.Setter
        public Builder unitScale(@Nullable DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitScale unitScale) {

            this.unitScale = unitScale;
            return this;
        }
        public DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormat build() {
            final var _resultValue = new DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormat();
            _resultValue.unit = unit;
            _resultValue.unitScale = unitScale;
            return _resultValue;
        }
    }
}
