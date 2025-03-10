// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitCanonicalArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitCustomArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitArgs Empty = new PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitArgs();

    /**
     * Canonical Units
     * 
     */
    @Import(name="canonical")
    private @Nullable Output<PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitCanonicalArgs> canonical;

    /**
     * @return Canonical Units
     * 
     */
    public Optional<Output<PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitCanonicalArgs>> canonical() {
        return Optional.ofNullable(this.canonical);
    }

    /**
     * Use custom (non canonical metrics)
     * 
     */
    @Import(name="custom")
    private @Nullable Output<PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitCustomArgs> custom;

    /**
     * @return Use custom (non canonical metrics)
     * 
     */
    public Optional<Output<PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitCustomArgs>> custom() {
        return Optional.ofNullable(this.custom);
    }

    private PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitArgs() {}

    private PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitArgs(PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitArgs $) {
        this.canonical = $.canonical;
        this.custom = $.custom;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitArgs $;

        public Builder() {
            $ = new PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitArgs();
        }

        public Builder(PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitArgs defaults) {
            $ = new PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param canonical Canonical Units
         * 
         * @return builder
         * 
         */
        public Builder canonical(@Nullable Output<PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitCanonicalArgs> canonical) {
            $.canonical = canonical;
            return this;
        }

        /**
         * @param canonical Canonical Units
         * 
         * @return builder
         * 
         */
        public Builder canonical(PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitCanonicalArgs canonical) {
            return canonical(Output.of(canonical));
        }

        /**
         * @param custom Use custom (non canonical metrics)
         * 
         * @return builder
         * 
         */
        public Builder custom(@Nullable Output<PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitCustomArgs> custom) {
            $.custom = custom;
            return this;
        }

        /**
         * @param custom Use custom (non canonical metrics)
         * 
         * @return builder
         * 
         */
        public Builder custom(PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitCustomArgs custom) {
            return custom(Output.of(custom));
        }

        public PowerpackWidgetSunburstDefinitionRequestFormulaNumberFormatUnitArgs build() {
            return $;
        }
    }

}
