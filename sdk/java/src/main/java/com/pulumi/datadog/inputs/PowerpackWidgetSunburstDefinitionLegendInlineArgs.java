// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetSunburstDefinitionLegendInlineArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetSunburstDefinitionLegendInlineArgs Empty = new PowerpackWidgetSunburstDefinitionLegendInlineArgs();

    /**
     * Whether to hide the percentages of the groups.
     * 
     */
    @Import(name="hidePercent")
    private @Nullable Output<Boolean> hidePercent;

    /**
     * @return Whether to hide the percentages of the groups.
     * 
     */
    public Optional<Output<Boolean>> hidePercent() {
        return Optional.ofNullable(this.hidePercent);
    }

    /**
     * Setting this to True hides values.
     * 
     */
    @Import(name="hideValue")
    private @Nullable Output<Boolean> hideValue;

    /**
     * @return Setting this to True hides values.
     * 
     */
    public Optional<Output<Boolean>> hideValue() {
        return Optional.ofNullable(this.hideValue);
    }

    /**
     * Whether the Timeseries is made using an area or bars. Valid values are `bars`, `area`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Whether the Timeseries is made using an area or bars. Valid values are `bars`, `area`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private PowerpackWidgetSunburstDefinitionLegendInlineArgs() {}

    private PowerpackWidgetSunburstDefinitionLegendInlineArgs(PowerpackWidgetSunburstDefinitionLegendInlineArgs $) {
        this.hidePercent = $.hidePercent;
        this.hideValue = $.hideValue;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetSunburstDefinitionLegendInlineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetSunburstDefinitionLegendInlineArgs $;

        public Builder() {
            $ = new PowerpackWidgetSunburstDefinitionLegendInlineArgs();
        }

        public Builder(PowerpackWidgetSunburstDefinitionLegendInlineArgs defaults) {
            $ = new PowerpackWidgetSunburstDefinitionLegendInlineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hidePercent Whether to hide the percentages of the groups.
         * 
         * @return builder
         * 
         */
        public Builder hidePercent(@Nullable Output<Boolean> hidePercent) {
            $.hidePercent = hidePercent;
            return this;
        }

        /**
         * @param hidePercent Whether to hide the percentages of the groups.
         * 
         * @return builder
         * 
         */
        public Builder hidePercent(Boolean hidePercent) {
            return hidePercent(Output.of(hidePercent));
        }

        /**
         * @param hideValue Setting this to True hides values.
         * 
         * @return builder
         * 
         */
        public Builder hideValue(@Nullable Output<Boolean> hideValue) {
            $.hideValue = hideValue;
            return this;
        }

        /**
         * @param hideValue Setting this to True hides values.
         * 
         * @return builder
         * 
         */
        public Builder hideValue(Boolean hideValue) {
            return hideValue(Output.of(hideValue));
        }

        /**
         * @param type Whether the Timeseries is made using an area or bars. Valid values are `bars`, `area`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Whether the Timeseries is made using an area or bars. Valid values are `bars`, `area`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PowerpackWidgetSunburstDefinitionLegendInlineArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetSunburstDefinitionLegendInlineArgs", "type");
            }
            return $;
        }
    }

}