// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetDistributionDefinitionYaxisArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetDistributionDefinitionYaxisArgs Empty = new PowerpackWidgetDistributionDefinitionYaxisArgs();

    /**
     * Always include zero or fit the axis to the data range.
     * 
     */
    @Import(name="includeZero")
    private @Nullable Output<Boolean> includeZero;

    /**
     * @return Always include zero or fit the axis to the data range.
     * 
     */
    public Optional<Output<Boolean>> includeZero() {
        return Optional.ofNullable(this.includeZero);
    }

    /**
     * The label of the axis to display on the graph.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The label of the axis to display on the graph.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Specify the maximum value to show on the Y-axis.
     * 
     */
    @Import(name="max")
    private @Nullable Output<String> max;

    /**
     * @return Specify the maximum value to show on the Y-axis.
     * 
     */
    public Optional<Output<String>> max() {
        return Optional.ofNullable(this.max);
    }

    /**
     * Specify the minimum value to show on the Y-axis.
     * 
     */
    @Import(name="min")
    private @Nullable Output<String> min;

    /**
     * @return Specify the minimum value to show on the Y-axis.
     * 
     */
    public Optional<Output<String>> min() {
        return Optional.ofNullable(this.min);
    }

    /**
     * Specify the scale type, options: `linear`, `log`, `pow`, `sqrt`.
     * 
     */
    @Import(name="scale")
    private @Nullable Output<String> scale;

    /**
     * @return Specify the scale type, options: `linear`, `log`, `pow`, `sqrt`.
     * 
     */
    public Optional<Output<String>> scale() {
        return Optional.ofNullable(this.scale);
    }

    private PowerpackWidgetDistributionDefinitionYaxisArgs() {}

    private PowerpackWidgetDistributionDefinitionYaxisArgs(PowerpackWidgetDistributionDefinitionYaxisArgs $) {
        this.includeZero = $.includeZero;
        this.label = $.label;
        this.max = $.max;
        this.min = $.min;
        this.scale = $.scale;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetDistributionDefinitionYaxisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetDistributionDefinitionYaxisArgs $;

        public Builder() {
            $ = new PowerpackWidgetDistributionDefinitionYaxisArgs();
        }

        public Builder(PowerpackWidgetDistributionDefinitionYaxisArgs defaults) {
            $ = new PowerpackWidgetDistributionDefinitionYaxisArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param includeZero Always include zero or fit the axis to the data range.
         * 
         * @return builder
         * 
         */
        public Builder includeZero(@Nullable Output<Boolean> includeZero) {
            $.includeZero = includeZero;
            return this;
        }

        /**
         * @param includeZero Always include zero or fit the axis to the data range.
         * 
         * @return builder
         * 
         */
        public Builder includeZero(Boolean includeZero) {
            return includeZero(Output.of(includeZero));
        }

        /**
         * @param label The label of the axis to display on the graph.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label of the axis to display on the graph.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param max Specify the maximum value to show on the Y-axis.
         * 
         * @return builder
         * 
         */
        public Builder max(@Nullable Output<String> max) {
            $.max = max;
            return this;
        }

        /**
         * @param max Specify the maximum value to show on the Y-axis.
         * 
         * @return builder
         * 
         */
        public Builder max(String max) {
            return max(Output.of(max));
        }

        /**
         * @param min Specify the minimum value to show on the Y-axis.
         * 
         * @return builder
         * 
         */
        public Builder min(@Nullable Output<String> min) {
            $.min = min;
            return this;
        }

        /**
         * @param min Specify the minimum value to show on the Y-axis.
         * 
         * @return builder
         * 
         */
        public Builder min(String min) {
            return min(Output.of(min));
        }

        /**
         * @param scale Specify the scale type, options: `linear`, `log`, `pow`, `sqrt`.
         * 
         * @return builder
         * 
         */
        public Builder scale(@Nullable Output<String> scale) {
            $.scale = scale;
            return this;
        }

        /**
         * @param scale Specify the scale type, options: `linear`, `log`, `pow`, `sqrt`.
         * 
         * @return builder
         * 
         */
        public Builder scale(String scale) {
            return scale(Output.of(scale));
        }

        public PowerpackWidgetDistributionDefinitionYaxisArgs build() {
            return $;
        }
    }

}