// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCanonicalArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCustomArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs Empty = new PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs();

    /**
     * Canonical Units
     * 
     */
    @Import(name="canonical")
    private @Nullable Output<PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCanonicalArgs> canonical;

    /**
     * @return Canonical Units
     * 
     */
    public Optional<Output<PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCanonicalArgs>> canonical() {
        return Optional.ofNullable(this.canonical);
    }

    /**
     * Use custom (non canonical metrics)
     * 
     */
    @Import(name="custom")
    private @Nullable Output<PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCustomArgs> custom;

    /**
     * @return Use custom (non canonical metrics)
     * 
     */
    public Optional<Output<PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCustomArgs>> custom() {
        return Optional.ofNullable(this.custom);
    }

    private PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs() {}

    private PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs(PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs $) {
        this.canonical = $.canonical;
        this.custom = $.custom;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs $;

        public Builder() {
            $ = new PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs();
        }

        public Builder(PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs defaults) {
            $ = new PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param canonical Canonical Units
         * 
         * @return builder
         * 
         */
        public Builder canonical(@Nullable Output<PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCanonicalArgs> canonical) {
            $.canonical = canonical;
            return this;
        }

        /**
         * @param canonical Canonical Units
         * 
         * @return builder
         * 
         */
        public Builder canonical(PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCanonicalArgs canonical) {
            return canonical(Output.of(canonical));
        }

        /**
         * @param custom Use custom (non canonical metrics)
         * 
         * @return builder
         * 
         */
        public Builder custom(@Nullable Output<PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCustomArgs> custom) {
            $.custom = custom;
            return this;
        }

        /**
         * @param custom Use custom (non canonical metrics)
         * 
         * @return builder
         * 
         */
        public Builder custom(PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCustomArgs custom) {
            return custom(Output.of(custom));
        }

        public PowerpackWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs build() {
            return $;
        }
    }

}
