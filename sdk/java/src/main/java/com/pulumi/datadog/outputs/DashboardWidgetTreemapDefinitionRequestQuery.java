// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetTreemapDefinitionRequestQueryApmDependencyStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetTreemapDefinitionRequestQueryApmResourceStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetTreemapDefinitionRequestQueryCloudCostQuery;
import com.pulumi.datadog.outputs.DashboardWidgetTreemapDefinitionRequestQueryEventQuery;
import com.pulumi.datadog.outputs.DashboardWidgetTreemapDefinitionRequestQueryMetricQuery;
import com.pulumi.datadog.outputs.DashboardWidgetTreemapDefinitionRequestQueryProcessQuery;
import com.pulumi.datadog.outputs.DashboardWidgetTreemapDefinitionRequestQuerySloQuery;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetTreemapDefinitionRequestQuery {
    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetTreemapDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetTreemapDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetTreemapDefinitionRequestQueryCloudCostQuery cloudCostQuery;
    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    private @Nullable DashboardWidgetTreemapDefinitionRequestQueryEventQuery eventQuery;
    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    private @Nullable DashboardWidgetTreemapDefinitionRequestQueryMetricQuery metricQuery;
    /**
     * @return The process query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetTreemapDefinitionRequestQueryProcessQuery processQuery;
    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetTreemapDefinitionRequestQuerySloQuery sloQuery;

    private DashboardWidgetTreemapDefinitionRequestQuery() {}
    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetTreemapDefinitionRequestQueryApmDependencyStatsQuery> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }
    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetTreemapDefinitionRequestQueryApmResourceStatsQuery> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }
    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetTreemapDefinitionRequestQueryCloudCostQuery> cloudCostQuery() {
        return Optional.ofNullable(this.cloudCostQuery);
    }
    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    public Optional<DashboardWidgetTreemapDefinitionRequestQueryEventQuery> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }
    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    public Optional<DashboardWidgetTreemapDefinitionRequestQueryMetricQuery> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }
    /**
     * @return The process query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetTreemapDefinitionRequestQueryProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetTreemapDefinitionRequestQuerySloQuery> sloQuery() {
        return Optional.ofNullable(this.sloQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetTreemapDefinitionRequestQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetTreemapDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
        private @Nullable DashboardWidgetTreemapDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
        private @Nullable DashboardWidgetTreemapDefinitionRequestQueryCloudCostQuery cloudCostQuery;
        private @Nullable DashboardWidgetTreemapDefinitionRequestQueryEventQuery eventQuery;
        private @Nullable DashboardWidgetTreemapDefinitionRequestQueryMetricQuery metricQuery;
        private @Nullable DashboardWidgetTreemapDefinitionRequestQueryProcessQuery processQuery;
        private @Nullable DashboardWidgetTreemapDefinitionRequestQuerySloQuery sloQuery;
        public Builder() {}
        public Builder(DashboardWidgetTreemapDefinitionRequestQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmDependencyStatsQuery = defaults.apmDependencyStatsQuery;
    	      this.apmResourceStatsQuery = defaults.apmResourceStatsQuery;
    	      this.cloudCostQuery = defaults.cloudCostQuery;
    	      this.eventQuery = defaults.eventQuery;
    	      this.metricQuery = defaults.metricQuery;
    	      this.processQuery = defaults.processQuery;
    	      this.sloQuery = defaults.sloQuery;
        }

        @CustomType.Setter
        public Builder apmDependencyStatsQuery(@Nullable DashboardWidgetTreemapDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery) {

            this.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder apmResourceStatsQuery(@Nullable DashboardWidgetTreemapDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery) {

            this.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder cloudCostQuery(@Nullable DashboardWidgetTreemapDefinitionRequestQueryCloudCostQuery cloudCostQuery) {

            this.cloudCostQuery = cloudCostQuery;
            return this;
        }
        @CustomType.Setter
        public Builder eventQuery(@Nullable DashboardWidgetTreemapDefinitionRequestQueryEventQuery eventQuery) {

            this.eventQuery = eventQuery;
            return this;
        }
        @CustomType.Setter
        public Builder metricQuery(@Nullable DashboardWidgetTreemapDefinitionRequestQueryMetricQuery metricQuery) {

            this.metricQuery = metricQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetTreemapDefinitionRequestQueryProcessQuery processQuery) {

            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder sloQuery(@Nullable DashboardWidgetTreemapDefinitionRequestQuerySloQuery sloQuery) {

            this.sloQuery = sloQuery;
            return this;
        }
        public DashboardWidgetTreemapDefinitionRequestQuery build() {
            final var _resultValue = new DashboardWidgetTreemapDefinitionRequestQuery();
            _resultValue.apmDependencyStatsQuery = apmDependencyStatsQuery;
            _resultValue.apmResourceStatsQuery = apmResourceStatsQuery;
            _resultValue.cloudCostQuery = cloudCostQuery;
            _resultValue.eventQuery = eventQuery;
            _resultValue.metricQuery = metricQuery;
            _resultValue.processQuery = processQuery;
            _resultValue.sloQuery = sloQuery;
            return _resultValue;
        }
    }
}
