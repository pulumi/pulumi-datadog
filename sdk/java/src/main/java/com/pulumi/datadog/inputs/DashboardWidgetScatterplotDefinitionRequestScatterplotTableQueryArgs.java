// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryApmDependencyStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryApmResourceStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryCloudCostQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryMetricQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryProcessQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryArgs Empty = new DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryArgs();

    /**
     * The APM Dependency Stats query using formulas and functions.
     * 
     */
    @Import(name="apmDependencyStatsQuery")
    private @Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery;

    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryApmDependencyStatsQueryArgs>> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }

    /**
     * The APM Resource Stats query using formulas and functions.
     * 
     */
    @Import(name="apmResourceStatsQuery")
    private @Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryApmResourceStatsQueryArgs> apmResourceStatsQuery;

    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryApmResourceStatsQueryArgs>> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }

    /**
     * The Cloud Cost query using formulas and functions.
     * 
     */
    @Import(name="cloudCostQuery")
    private @Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryCloudCostQueryArgs> cloudCostQuery;

    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryCloudCostQueryArgs>> cloudCostQuery() {
        return Optional.ofNullable(this.cloudCostQuery);
    }

    /**
     * A timeseries formula and functions events query.
     * 
     */
    @Import(name="eventQuery")
    private @Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryArgs> eventQuery;

    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    public Optional<Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryArgs>> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }

    /**
     * A timeseries formula and functions metrics query.
     * 
     */
    @Import(name="metricQuery")
    private @Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryMetricQueryArgs> metricQuery;

    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    public Optional<Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryMetricQueryArgs>> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }

    /**
     * The process query using formulas and functions.
     * 
     */
    @Import(name="processQuery")
    private @Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryProcessQueryArgs> processQuery;

    /**
     * @return The process query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    /**
     * The SLO query using formulas and functions.
     * 
     */
    @Import(name="sloQuery")
    private @Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs> sloQuery;

    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs>> sloQuery() {
        return Optional.ofNullable(this.sloQuery);
    }

    private DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryArgs() {}

    private DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryArgs(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryArgs $) {
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
    public static Builder builder(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryArgs();
        }

        public Builder(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryArgs defaults) {
            $ = new DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apmDependencyStatsQuery The APM Dependency Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmDependencyStatsQuery(@Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery) {
            $.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }

        /**
         * @param apmDependencyStatsQuery The APM Dependency Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmDependencyStatsQuery(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryApmDependencyStatsQueryArgs apmDependencyStatsQuery) {
            return apmDependencyStatsQuery(Output.of(apmDependencyStatsQuery));
        }

        /**
         * @param apmResourceStatsQuery The APM Resource Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmResourceStatsQuery(@Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryApmResourceStatsQueryArgs> apmResourceStatsQuery) {
            $.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }

        /**
         * @param apmResourceStatsQuery The APM Resource Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmResourceStatsQuery(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryApmResourceStatsQueryArgs apmResourceStatsQuery) {
            return apmResourceStatsQuery(Output.of(apmResourceStatsQuery));
        }

        /**
         * @param cloudCostQuery The Cloud Cost query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder cloudCostQuery(@Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryCloudCostQueryArgs> cloudCostQuery) {
            $.cloudCostQuery = cloudCostQuery;
            return this;
        }

        /**
         * @param cloudCostQuery The Cloud Cost query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder cloudCostQuery(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryCloudCostQueryArgs cloudCostQuery) {
            return cloudCostQuery(Output.of(cloudCostQuery));
        }

        /**
         * @param eventQuery A timeseries formula and functions events query.
         * 
         * @return builder
         * 
         */
        public Builder eventQuery(@Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryArgs> eventQuery) {
            $.eventQuery = eventQuery;
            return this;
        }

        /**
         * @param eventQuery A timeseries formula and functions events query.
         * 
         * @return builder
         * 
         */
        public Builder eventQuery(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryArgs eventQuery) {
            return eventQuery(Output.of(eventQuery));
        }

        /**
         * @param metricQuery A timeseries formula and functions metrics query.
         * 
         * @return builder
         * 
         */
        public Builder metricQuery(@Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryMetricQueryArgs> metricQuery) {
            $.metricQuery = metricQuery;
            return this;
        }

        /**
         * @param metricQuery A timeseries formula and functions metrics query.
         * 
         * @return builder
         * 
         */
        public Builder metricQuery(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryMetricQueryArgs metricQuery) {
            return metricQuery(Output.of(metricQuery));
        }

        /**
         * @param processQuery The process query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(@Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        /**
         * @param processQuery The process query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        /**
         * @param sloQuery The SLO query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder sloQuery(@Nullable Output<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs> sloQuery) {
            $.sloQuery = sloQuery;
            return this;
        }

        /**
         * @param sloQuery The SLO query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder sloQuery(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs sloQuery) {
            return sloQuery(Output.of(sloQuery));
        }

        public DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryArgs build() {
            return $;
        }
    }

}
