// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class PowerpackWidgetSunburstDefinitionLegendTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetSunburstDefinitionLegendTableArgs Empty = new PowerpackWidgetSunburstDefinitionLegendTableArgs();

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

    private PowerpackWidgetSunburstDefinitionLegendTableArgs() {}

    private PowerpackWidgetSunburstDefinitionLegendTableArgs(PowerpackWidgetSunburstDefinitionLegendTableArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetSunburstDefinitionLegendTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetSunburstDefinitionLegendTableArgs $;

        public Builder() {
            $ = new PowerpackWidgetSunburstDefinitionLegendTableArgs();
        }

        public Builder(PowerpackWidgetSunburstDefinitionLegendTableArgs defaults) {
            $ = new PowerpackWidgetSunburstDefinitionLegendTableArgs(Objects.requireNonNull(defaults));
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

        public PowerpackWidgetSunburstDefinitionLegendTableArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetSunburstDefinitionLegendTableArgs", "type");
            }
            return $;
        }
    }

}