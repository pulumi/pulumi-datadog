// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitArgs;
import com.pulumi.datadog.inputs.DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitScaleArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs Empty = new DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs();

    /**
     * Unit of the number format.
     * 
     */
    @Import(name="unit", required=true)
    private Output<DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitArgs> unit;

    /**
     * @return Unit of the number format.
     * 
     */
    public Output<DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitArgs> unit() {
        return this.unit;
    }

    @Import(name="unitScale")
    private @Nullable Output<DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitScaleArgs> unitScale;

    public Optional<Output<DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitScaleArgs>> unitScale() {
        return Optional.ofNullable(this.unitScale);
    }

    private DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs() {}

    private DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs(DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs $) {
        this.unit = $.unit;
        this.unitScale = $.unitScale;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs $;

        public Builder() {
            $ = new DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs();
        }

        public Builder(DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs defaults) {
            $ = new DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param unit Unit of the number format.
         * 
         * @return builder
         * 
         */
        public Builder unit(Output<DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitArgs> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit Unit of the number format.
         * 
         * @return builder
         * 
         */
        public Builder unit(DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitArgs unit) {
            return unit(Output.of(unit));
        }

        public Builder unitScale(@Nullable Output<DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitScaleArgs> unitScale) {
            $.unitScale = unitScale;
            return this;
        }

        public Builder unitScale(DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitScaleArgs unitScale) {
            return unitScale(Output.of(unitScale));
        }

        public DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs build() {
            if ($.unit == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetQueryValueDefinitionRequestFormulaNumberFormatArgs", "unit");
            }
            return $;
        }
    }

}
