// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmDependencyStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmResourceStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryEventQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryMetricQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryProcessQuery;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQuery {
    private @Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
    private @Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
    private @Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryEventQuery eventQuery;
    private @Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryMetricQuery metricQuery;
    private @Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryProcessQuery processQuery;

    private DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQuery() {}
    public Optional<DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmDependencyStatsQuery> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }
    public Optional<DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmResourceStatsQuery> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }
    public Optional<DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryEventQuery> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }
    public Optional<DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryMetricQuery> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }
    public Optional<DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryEventQuery eventQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryMetricQuery metricQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryProcessQuery processQuery;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmDependencyStatsQuery = defaults.apmDependencyStatsQuery;
    	      this.apmResourceStatsQuery = defaults.apmResourceStatsQuery;
    	      this.eventQuery = defaults.eventQuery;
    	      this.metricQuery = defaults.metricQuery;
    	      this.processQuery = defaults.processQuery;
        }

        @CustomType.Setter
        public Builder apmDependencyStatsQuery(@Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery) {
            this.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder apmResourceStatsQuery(@Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery) {
            this.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder eventQuery(@Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryEventQuery eventQuery) {
            this.eventQuery = eventQuery;
            return this;
        }
        @CustomType.Setter
        public Builder metricQuery(@Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryMetricQuery metricQuery) {
            this.metricQuery = metricQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryProcessQuery processQuery) {
            this.processQuery = processQuery;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQuery build() {
            final var o = new DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQuery();
            o.apmDependencyStatsQuery = apmDependencyStatsQuery;
            o.apmResourceStatsQuery = apmResourceStatsQuery;
            o.eventQuery = eventQuery;
            o.metricQuery = metricQuery;
            o.processQuery = processQuery;
            return o;
        }
    }
}