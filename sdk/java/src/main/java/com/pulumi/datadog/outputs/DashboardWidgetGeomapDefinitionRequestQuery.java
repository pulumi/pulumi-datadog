// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGeomapDefinitionRequestQueryApmDependencyStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGeomapDefinitionRequestQueryApmResourceStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGeomapDefinitionRequestQueryCloudCostQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGeomapDefinitionRequestQueryEventQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGeomapDefinitionRequestQueryMetricQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGeomapDefinitionRequestQueryProcessQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGeomapDefinitionRequestQuerySloQuery;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGeomapDefinitionRequestQuery {
    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetGeomapDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetGeomapDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetGeomapDefinitionRequestQueryCloudCostQuery cloudCostQuery;
    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    private @Nullable DashboardWidgetGeomapDefinitionRequestQueryEventQuery eventQuery;
    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    private @Nullable DashboardWidgetGeomapDefinitionRequestQueryMetricQuery metricQuery;
    /**
     * @return The process query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetGeomapDefinitionRequestQueryProcessQuery processQuery;
    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetGeomapDefinitionRequestQuerySloQuery sloQuery;

    private DashboardWidgetGeomapDefinitionRequestQuery() {}
    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetGeomapDefinitionRequestQueryApmDependencyStatsQuery> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }
    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetGeomapDefinitionRequestQueryApmResourceStatsQuery> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }
    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetGeomapDefinitionRequestQueryCloudCostQuery> cloudCostQuery() {
        return Optional.ofNullable(this.cloudCostQuery);
    }
    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    public Optional<DashboardWidgetGeomapDefinitionRequestQueryEventQuery> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }
    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    public Optional<DashboardWidgetGeomapDefinitionRequestQueryMetricQuery> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }
    /**
     * @return The process query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetGeomapDefinitionRequestQueryProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetGeomapDefinitionRequestQuerySloQuery> sloQuery() {
        return Optional.ofNullable(this.sloQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGeomapDefinitionRequestQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetGeomapDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
        private @Nullable DashboardWidgetGeomapDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
        private @Nullable DashboardWidgetGeomapDefinitionRequestQueryCloudCostQuery cloudCostQuery;
        private @Nullable DashboardWidgetGeomapDefinitionRequestQueryEventQuery eventQuery;
        private @Nullable DashboardWidgetGeomapDefinitionRequestQueryMetricQuery metricQuery;
        private @Nullable DashboardWidgetGeomapDefinitionRequestQueryProcessQuery processQuery;
        private @Nullable DashboardWidgetGeomapDefinitionRequestQuerySloQuery sloQuery;
        public Builder() {}
        public Builder(DashboardWidgetGeomapDefinitionRequestQuery defaults) {
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
        public Builder apmDependencyStatsQuery(@Nullable DashboardWidgetGeomapDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery) {

            this.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder apmResourceStatsQuery(@Nullable DashboardWidgetGeomapDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery) {

            this.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder cloudCostQuery(@Nullable DashboardWidgetGeomapDefinitionRequestQueryCloudCostQuery cloudCostQuery) {

            this.cloudCostQuery = cloudCostQuery;
            return this;
        }
        @CustomType.Setter
        public Builder eventQuery(@Nullable DashboardWidgetGeomapDefinitionRequestQueryEventQuery eventQuery) {

            this.eventQuery = eventQuery;
            return this;
        }
        @CustomType.Setter
        public Builder metricQuery(@Nullable DashboardWidgetGeomapDefinitionRequestQueryMetricQuery metricQuery) {

            this.metricQuery = metricQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetGeomapDefinitionRequestQueryProcessQuery processQuery) {

            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder sloQuery(@Nullable DashboardWidgetGeomapDefinitionRequestQuerySloQuery sloQuery) {

            this.sloQuery = sloQuery;
            return this;
        }
        public DashboardWidgetGeomapDefinitionRequestQuery build() {
            final var _resultValue = new DashboardWidgetGeomapDefinitionRequestQuery();
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
