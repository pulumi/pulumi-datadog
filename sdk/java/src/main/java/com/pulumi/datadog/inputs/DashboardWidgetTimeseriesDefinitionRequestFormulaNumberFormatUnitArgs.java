// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCanonicalArgs;
import com.pulumi.datadog.inputs.DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCustomArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs Empty = new DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs();

    /**
     * Canonical Units
     * 
     */
    @Import(name="canonical")
    private @Nullable Output<DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCanonicalArgs> canonical;

    /**
     * @return Canonical Units
     * 
     */
    public Optional<Output<DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCanonicalArgs>> canonical() {
        return Optional.ofNullable(this.canonical);
    }

    /**
     * Use custom (non canonical metrics)
     * 
     */
    @Import(name="custom")
    private @Nullable Output<DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCustomArgs> custom;

    /**
     * @return Use custom (non canonical metrics)
     * 
     */
    public Optional<Output<DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCustomArgs>> custom() {
        return Optional.ofNullable(this.custom);
    }

    private DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs() {}

    private DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs(DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs $) {
        this.canonical = $.canonical;
        this.custom = $.custom;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs $;

        public Builder() {
            $ = new DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs();
        }

        public Builder(DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs defaults) {
            $ = new DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param canonical Canonical Units
         * 
         * @return builder
         * 
         */
        public Builder canonical(@Nullable Output<DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCanonicalArgs> canonical) {
            $.canonical = canonical;
            return this;
        }

        /**
         * @param canonical Canonical Units
         * 
         * @return builder
         * 
         */
        public Builder canonical(DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCanonicalArgs canonical) {
            return canonical(Output.of(canonical));
        }

        /**
         * @param custom Use custom (non canonical metrics)
         * 
         * @return builder
         * 
         */
        public Builder custom(@Nullable Output<DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCustomArgs> custom) {
            $.custom = custom;
            return this;
        }

        /**
         * @param custom Use custom (non canonical metrics)
         * 
         * @return builder
         * 
         */
        public Builder custom(DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitCustomArgs custom) {
            return custom(Output.of(custom));
        }

        public DashboardWidgetTimeseriesDefinitionRequestFormulaNumberFormatUnitArgs build() {
            return $;
        }
    }

}
