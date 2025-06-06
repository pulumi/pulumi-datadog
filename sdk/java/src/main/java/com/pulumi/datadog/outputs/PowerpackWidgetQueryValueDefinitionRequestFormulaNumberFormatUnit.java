// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitCanonical;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitCustom;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit {
    /**
     * @return Canonical Units
     * 
     */
    private @Nullable PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitCanonical canonical;
    /**
     * @return Use custom (non canonical metrics)
     * 
     */
    private @Nullable PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitCustom custom;

    private PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit() {}
    /**
     * @return Canonical Units
     * 
     */
    public Optional<PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitCanonical> canonical() {
        return Optional.ofNullable(this.canonical);
    }
    /**
     * @return Use custom (non canonical metrics)
     * 
     */
    public Optional<PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitCustom> custom() {
        return Optional.ofNullable(this.custom);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitCanonical canonical;
        private @Nullable PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitCustom custom;
        public Builder() {}
        public Builder(PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonical = defaults.canonical;
    	      this.custom = defaults.custom;
        }

        @CustomType.Setter
        public Builder canonical(@Nullable PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitCanonical canonical) {

            this.canonical = canonical;
            return this;
        }
        @CustomType.Setter
        public Builder custom(@Nullable PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnitCustom custom) {

            this.custom = custom;
            return this;
        }
        public PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit build() {
            final var _resultValue = new PowerpackWidgetQueryValueDefinitionRequestFormulaNumberFormatUnit();
            _resultValue.canonical = canonical;
            _resultValue.custom = custom;
            return _resultValue;
        }
    }
}
