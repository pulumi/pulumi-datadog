// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs Empty = new PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs();

    /**
     * The aggregation method.
     * 
     */
    @Import(name="aggregation", required=true)
    private Output<String> aggregation;

    /**
     * @return The aggregation method.
     * 
     */
    public Output<String> aggregation() {
        return this.aggregation;
    }

    /**
     * The facet name.
     * 
     */
    @Import(name="facet")
    private @Nullable Output<String> facet;

    /**
     * @return The facet name.
     * 
     */
    public Optional<Output<String>> facet() {
        return Optional.ofNullable(this.facet);
    }

    /**
     * Define the time interval in seconds.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return Define the time interval in seconds.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    private PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs() {}

    private PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs(PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs $) {
        this.aggregation = $.aggregation;
        this.facet = $.facet;
        this.interval = $.interval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs $;

        public Builder() {
            $ = new PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs();
        }

        public Builder(PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs defaults) {
            $ = new PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregation The aggregation method.
         * 
         * @return builder
         * 
         */
        public Builder aggregation(Output<String> aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        /**
         * @param aggregation The aggregation method.
         * 
         * @return builder
         * 
         */
        public Builder aggregation(String aggregation) {
            return aggregation(Output.of(aggregation));
        }

        /**
         * @param facet The facet name.
         * 
         * @return builder
         * 
         */
        public Builder facet(@Nullable Output<String> facet) {
            $.facet = facet;
            return this;
        }

        /**
         * @param facet The facet name.
         * 
         * @return builder
         * 
         */
        public Builder facet(String facet) {
            return facet(Output.of(facet));
        }

        /**
         * @param interval Define the time interval in seconds.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Define the time interval in seconds.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        public PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs build() {
            if ($.aggregation == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs", "aggregation");
            }
            return $;
        }
    }

}