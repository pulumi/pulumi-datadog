// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetQueryValueDefinitionRequestQueryApmDependencyStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetQueryValueDefinitionRequestQueryApmResourceStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetQueryValueDefinitionRequestQueryEventQuery;
import com.pulumi.datadog.outputs.DashboardWidgetQueryValueDefinitionRequestQueryMetricQuery;
import com.pulumi.datadog.outputs.DashboardWidgetQueryValueDefinitionRequestQueryProcessQuery;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetQueryValueDefinitionRequestQuery {
    private @Nullable DashboardWidgetQueryValueDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
    private @Nullable DashboardWidgetQueryValueDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
    private @Nullable DashboardWidgetQueryValueDefinitionRequestQueryEventQuery eventQuery;
    private @Nullable DashboardWidgetQueryValueDefinitionRequestQueryMetricQuery metricQuery;
    private @Nullable DashboardWidgetQueryValueDefinitionRequestQueryProcessQuery processQuery;

    private DashboardWidgetQueryValueDefinitionRequestQuery() {}
    public Optional<DashboardWidgetQueryValueDefinitionRequestQueryApmDependencyStatsQuery> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }
    public Optional<DashboardWidgetQueryValueDefinitionRequestQueryApmResourceStatsQuery> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }
    public Optional<DashboardWidgetQueryValueDefinitionRequestQueryEventQuery> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }
    public Optional<DashboardWidgetQueryValueDefinitionRequestQueryMetricQuery> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }
    public Optional<DashboardWidgetQueryValueDefinitionRequestQueryProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetQueryValueDefinitionRequestQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetQueryValueDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
        private @Nullable DashboardWidgetQueryValueDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
        private @Nullable DashboardWidgetQueryValueDefinitionRequestQueryEventQuery eventQuery;
        private @Nullable DashboardWidgetQueryValueDefinitionRequestQueryMetricQuery metricQuery;
        private @Nullable DashboardWidgetQueryValueDefinitionRequestQueryProcessQuery processQuery;
        public Builder() {}
        public Builder(DashboardWidgetQueryValueDefinitionRequestQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmDependencyStatsQuery = defaults.apmDependencyStatsQuery;
    	      this.apmResourceStatsQuery = defaults.apmResourceStatsQuery;
    	      this.eventQuery = defaults.eventQuery;
    	      this.metricQuery = defaults.metricQuery;
    	      this.processQuery = defaults.processQuery;
        }

        @CustomType.Setter
        public Builder apmDependencyStatsQuery(@Nullable DashboardWidgetQueryValueDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery) {
            this.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder apmResourceStatsQuery(@Nullable DashboardWidgetQueryValueDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery) {
            this.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder eventQuery(@Nullable DashboardWidgetQueryValueDefinitionRequestQueryEventQuery eventQuery) {
            this.eventQuery = eventQuery;
            return this;
        }
        @CustomType.Setter
        public Builder metricQuery(@Nullable DashboardWidgetQueryValueDefinitionRequestQueryMetricQuery metricQuery) {
            this.metricQuery = metricQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetQueryValueDefinitionRequestQueryProcessQuery processQuery) {
            this.processQuery = processQuery;
            return this;
        }
        public DashboardWidgetQueryValueDefinitionRequestQuery build() {
            final var o = new DashboardWidgetQueryValueDefinitionRequestQuery();
            o.apmDependencyStatsQuery = apmDependencyStatsQuery;
            o.apmResourceStatsQuery = apmResourceStatsQuery;
            o.eventQuery = eventQuery;
            o.metricQuery = metricQuery;
            o.processQuery = processQuery;
            return o;
        }
    }
}