// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnitCanonical;
import com.pulumi.datadog.outputs.PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnitCustom;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnit {
    /**
     * @return Canonical Units
     * 
     */
    private @Nullable PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnitCanonical canonical;
    /**
     * @return Use custom (non canonical metrics)
     * 
     */
    private @Nullable PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnitCustom custom;

    private PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnit() {}
    /**
     * @return Canonical Units
     * 
     */
    public Optional<PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnitCanonical> canonical() {
        return Optional.ofNullable(this.canonical);
    }
    /**
     * @return Use custom (non canonical metrics)
     * 
     */
    public Optional<PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnitCustom> custom() {
        return Optional.ofNullable(this.custom);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnitCanonical canonical;
        private @Nullable PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnitCustom custom;
        public Builder() {}
        public Builder(PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonical = defaults.canonical;
    	      this.custom = defaults.custom;
        }

        @CustomType.Setter
        public Builder canonical(@Nullable PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnitCanonical canonical) {

            this.canonical = canonical;
            return this;
        }
        @CustomType.Setter
        public Builder custom(@Nullable PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnitCustom custom) {

            this.custom = custom;
            return this;
        }
        public PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnit build() {
            final var _resultValue = new PowerpackWidgetToplistDefinitionRequestFormulaNumberFormatUnit();
            _resultValue.canonical = canonical;
            _resultValue.custom = custom;
            return _resultValue;
        }
    }
}
