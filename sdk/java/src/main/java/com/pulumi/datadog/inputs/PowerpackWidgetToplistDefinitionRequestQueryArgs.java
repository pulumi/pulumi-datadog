// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetToplistDefinitionRequestQueryCloudCostQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetToplistDefinitionRequestQueryEventQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetToplistDefinitionRequestQueryMetricQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetToplistDefinitionRequestQueryProcessQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetToplistDefinitionRequestQuerySloQueryArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetToplistDefinitionRequestQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetToplistDefinitionRequestQueryArgs Empty = new PowerpackWidgetToplistDefinitionRequestQueryArgs();

    /**
     * The APM Dependency Stats query using formulas and functions.
     * 
     */
    @Import(name="apmDependencyStatsQuery")
    private @Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery;

    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    public Optional<Output<PowerpackWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs>> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }

    /**
     * The APM Resource Stats query using formulas and functions.
     * 
     */
    @Import(name="apmResourceStatsQuery")
    private @Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery;

    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    public Optional<Output<PowerpackWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs>> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }

    /**
     * The Cloud Cost query using formulas and functions.
     * 
     */
    @Import(name="cloudCostQuery")
    private @Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryCloudCostQueryArgs> cloudCostQuery;

    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    public Optional<Output<PowerpackWidgetToplistDefinitionRequestQueryCloudCostQueryArgs>> cloudCostQuery() {
        return Optional.ofNullable(this.cloudCostQuery);
    }

    /**
     * A timeseries formula and functions events query.
     * 
     */
    @Import(name="eventQuery")
    private @Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryEventQueryArgs> eventQuery;

    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    public Optional<Output<PowerpackWidgetToplistDefinitionRequestQueryEventQueryArgs>> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }

    /**
     * A timeseries formula and functions metrics query.
     * 
     */
    @Import(name="metricQuery")
    private @Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryMetricQueryArgs> metricQuery;

    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    public Optional<Output<PowerpackWidgetToplistDefinitionRequestQueryMetricQueryArgs>> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }

    /**
     * The process query using formulas and functions.
     * 
     */
    @Import(name="processQuery")
    private @Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryProcessQueryArgs> processQuery;

    /**
     * @return The process query using formulas and functions.
     * 
     */
    public Optional<Output<PowerpackWidgetToplistDefinitionRequestQueryProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    /**
     * The SLO query using formulas and functions.
     * 
     */
    @Import(name="sloQuery")
    private @Nullable Output<PowerpackWidgetToplistDefinitionRequestQuerySloQueryArgs> sloQuery;

    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    public Optional<Output<PowerpackWidgetToplistDefinitionRequestQuerySloQueryArgs>> sloQuery() {
        return Optional.ofNullable(this.sloQuery);
    }

    private PowerpackWidgetToplistDefinitionRequestQueryArgs() {}

    private PowerpackWidgetToplistDefinitionRequestQueryArgs(PowerpackWidgetToplistDefinitionRequestQueryArgs $) {
        this.apmDependencyStatsQuery = $.apmDependencyStatsQuery;
        this.apmResourceStatsQuery = $.apmResourceStatsQuery;
        this.cloudCostQuery = $.cloudCostQuery;
        this.eventQuery = $.eventQuery;
        this.metricQuery = $.metricQuery;
        this.processQuery = $.processQuery;
        this.sloQuery = $.sloQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetToplistDefinitionRequestQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetToplistDefinitionRequestQueryArgs $;

        public Builder() {
            $ = new PowerpackWidgetToplistDefinitionRequestQueryArgs();
        }

        public Builder(PowerpackWidgetToplistDefinitionRequestQueryArgs defaults) {
            $ = new PowerpackWidgetToplistDefinitionRequestQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apmDependencyStatsQuery The APM Dependency Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmDependencyStatsQuery(@Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery) {
            $.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }

        /**
         * @param apmDependencyStatsQuery The APM Dependency Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmDependencyStatsQuery(PowerpackWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs apmDependencyStatsQuery) {
            return apmDependencyStatsQuery(Output.of(apmDependencyStatsQuery));
        }

        /**
         * @param apmResourceStatsQuery The APM Resource Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmResourceStatsQuery(@Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery) {
            $.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }

        /**
         * @param apmResourceStatsQuery The APM Resource Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmResourceStatsQuery(PowerpackWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs apmResourceStatsQuery) {
            return apmResourceStatsQuery(Output.of(apmResourceStatsQuery));
        }

        /**
         * @param cloudCostQuery The Cloud Cost query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder cloudCostQuery(@Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryCloudCostQueryArgs> cloudCostQuery) {
            $.cloudCostQuery = cloudCostQuery;
            return this;
        }

        /**
         * @param cloudCostQuery The Cloud Cost query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder cloudCostQuery(PowerpackWidgetToplistDefinitionRequestQueryCloudCostQueryArgs cloudCostQuery) {
            return cloudCostQuery(Output.of(cloudCostQuery));
        }

        /**
         * @param eventQuery A timeseries formula and functions events query.
         * 
         * @return builder
         * 
         */
        public Builder eventQuery(@Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryEventQueryArgs> eventQuery) {
            $.eventQuery = eventQuery;
            return this;
        }

        /**
         * @param eventQuery A timeseries formula and functions events query.
         * 
         * @return builder
         * 
         */
        public Builder eventQuery(PowerpackWidgetToplistDefinitionRequestQueryEventQueryArgs eventQuery) {
            return eventQuery(Output.of(eventQuery));
        }

        /**
         * @param metricQuery A timeseries formula and functions metrics query.
         * 
         * @return builder
         * 
         */
        public Builder metricQuery(@Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryMetricQueryArgs> metricQuery) {
            $.metricQuery = metricQuery;
            return this;
        }

        /**
         * @param metricQuery A timeseries formula and functions metrics query.
         * 
         * @return builder
         * 
         */
        public Builder metricQuery(PowerpackWidgetToplistDefinitionRequestQueryMetricQueryArgs metricQuery) {
            return metricQuery(Output.of(metricQuery));
        }

        /**
         * @param processQuery The process query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(@Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        /**
         * @param processQuery The process query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(PowerpackWidgetToplistDefinitionRequestQueryProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        /**
         * @param sloQuery The SLO query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder sloQuery(@Nullable Output<PowerpackWidgetToplistDefinitionRequestQuerySloQueryArgs> sloQuery) {
            $.sloQuery = sloQuery;
            return this;
        }

        /**
         * @param sloQuery The SLO query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder sloQuery(PowerpackWidgetToplistDefinitionRequestQuerySloQueryArgs sloQuery) {
            return sloQuery(Output.of(sloQuery));
        }

        public PowerpackWidgetToplistDefinitionRequestQueryArgs build() {
            return $;
        }
    }

}
