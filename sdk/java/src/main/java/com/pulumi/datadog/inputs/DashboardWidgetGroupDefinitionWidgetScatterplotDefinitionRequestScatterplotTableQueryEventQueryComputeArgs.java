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


public final class DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs Empty = new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs();

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

    /**
     * The metric from the request to correlate with this conditional format.
     * 
     */
    @Import(name="metric")
    private @Nullable Output<String> metric;

    /**
     * @return The metric from the request to correlate with this conditional format.
     * 
     */
    public Optional<Output<String>> metric() {
        return Optional.ofNullable(this.metric);
    }

    private DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs() {}

    private DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs $) {
        this.aggregation = $.aggregation;
        this.interval = $.interval;
        this.metric = $.metric;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param metric The metric from the request to correlate with this conditional format.
         * 
         * @return builder
         * 
         */
        public Builder metric(@Nullable Output<String> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric The metric from the request to correlate with this conditional format.
         * 
         * @return builder
         * 
         */
        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        public DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs build() {
            if ($.aggregation == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryComputeArgs", "aggregation");
            }
            return $;
        }
    }

}
