// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryApmDependencyStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryApmResourceStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryCloudCostQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryEventQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryMetricQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryProcessQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQuerySloQueryArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryArgs Empty = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryArgs();

    /**
     * The APM Dependency Stats query using formulas and functions.
     * 
     */
    @Import(name="apmDependencyStatsQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery;

    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryApmDependencyStatsQueryArgs>> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }

    /**
     * The APM Resource Stats query using formulas and functions.
     * 
     */
    @Import(name="apmResourceStatsQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery;

    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryApmResourceStatsQueryArgs>> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }

    /**
     * The Cloud Cost query using formulas and functions.
     * 
     */
    @Import(name="cloudCostQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryCloudCostQueryArgs> cloudCostQuery;

    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryCloudCostQueryArgs>> cloudCostQuery() {
        return Optional.ofNullable(this.cloudCostQuery);
    }

    /**
     * A timeseries formula and functions events query.
     * 
     */
    @Import(name="eventQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryEventQueryArgs> eventQuery;

    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryEventQueryArgs>> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }

    /**
     * A timeseries formula and functions metrics query.
     * 
     */
    @Import(name="metricQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryMetricQueryArgs> metricQuery;

    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryMetricQueryArgs>> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }

    /**
     * The process query to use in the widget. The structure of this block is described below.
     * 
     */
    @Import(name="processQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryProcessQueryArgs> processQuery;

    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    /**
     * The SLO query using formulas and functions.
     * 
     */
    @Import(name="sloQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQuerySloQueryArgs> sloQuery;

    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQuerySloQueryArgs>> sloQuery() {
        return Optional.ofNullable(this.sloQuery);
    }

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryArgs() {}

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryArgs(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryArgs $) {
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
    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryArgs();
        }

        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryArgs defaults) {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apmDependencyStatsQuery The APM Dependency Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmDependencyStatsQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery) {
            $.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }

        /**
         * @param apmDependencyStatsQuery The APM Dependency Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmDependencyStatsQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryApmDependencyStatsQueryArgs apmDependencyStatsQuery) {
            return apmDependencyStatsQuery(Output.of(apmDependencyStatsQuery));
        }

        /**
         * @param apmResourceStatsQuery The APM Resource Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmResourceStatsQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery) {
            $.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }

        /**
         * @param apmResourceStatsQuery The APM Resource Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmResourceStatsQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryApmResourceStatsQueryArgs apmResourceStatsQuery) {
            return apmResourceStatsQuery(Output.of(apmResourceStatsQuery));
        }

        /**
         * @param cloudCostQuery The Cloud Cost query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder cloudCostQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryCloudCostQueryArgs> cloudCostQuery) {
            $.cloudCostQuery = cloudCostQuery;
            return this;
        }

        /**
         * @param cloudCostQuery The Cloud Cost query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder cloudCostQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryCloudCostQueryArgs cloudCostQuery) {
            return cloudCostQuery(Output.of(cloudCostQuery));
        }

        /**
         * @param eventQuery A timeseries formula and functions events query.
         * 
         * @return builder
         * 
         */
        public Builder eventQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryEventQueryArgs> eventQuery) {
            $.eventQuery = eventQuery;
            return this;
        }

        /**
         * @param eventQuery A timeseries formula and functions events query.
         * 
         * @return builder
         * 
         */
        public Builder eventQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryEventQueryArgs eventQuery) {
            return eventQuery(Output.of(eventQuery));
        }

        /**
         * @param metricQuery A timeseries formula and functions metrics query.
         * 
         * @return builder
         * 
         */
        public Builder metricQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryMetricQueryArgs> metricQuery) {
            $.metricQuery = metricQuery;
            return this;
        }

        /**
         * @param metricQuery A timeseries formula and functions metrics query.
         * 
         * @return builder
         * 
         */
        public Builder metricQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryMetricQueryArgs metricQuery) {
            return metricQuery(Output.of(metricQuery));
        }

        /**
         * @param processQuery The process query to use in the widget. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        /**
         * @param processQuery The process query to use in the widget. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        /**
         * @param sloQuery The SLO query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder sloQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQuerySloQueryArgs> sloQuery) {
            $.sloQuery = sloQuery;
            return this;
        }

        /**
         * @param sloQuery The SLO query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder sloQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQuerySloQueryArgs sloQuery) {
            return sloQuery(Output.of(sloQuery));
        }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryArgs build() {
            return $;
        }
    }

}