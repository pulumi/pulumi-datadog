// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetHeatmapDefinitionRequestApmQueryComputeQuery;
import com.pulumi.datadog.outputs.DashboardWidgetHeatmapDefinitionRequestApmQueryGroupBy;
import com.pulumi.datadog.outputs.DashboardWidgetHeatmapDefinitionRequestApmQueryMultiCompute;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetHeatmapDefinitionRequestApmQuery {
    private @Nullable DashboardWidgetHeatmapDefinitionRequestApmQueryComputeQuery computeQuery;
    private @Nullable List<DashboardWidgetHeatmapDefinitionRequestApmQueryGroupBy> groupBies;
    private String index;
    private @Nullable List<DashboardWidgetHeatmapDefinitionRequestApmQueryMultiCompute> multiComputes;
    private @Nullable String searchQuery;

    private DashboardWidgetHeatmapDefinitionRequestApmQuery() {}
    public Optional<DashboardWidgetHeatmapDefinitionRequestApmQueryComputeQuery> computeQuery() {
        return Optional.ofNullable(this.computeQuery);
    }
    public List<DashboardWidgetHeatmapDefinitionRequestApmQueryGroupBy> groupBies() {
        return this.groupBies == null ? List.of() : this.groupBies;
    }
    public String index() {
        return this.index;
    }
    public List<DashboardWidgetHeatmapDefinitionRequestApmQueryMultiCompute> multiComputes() {
        return this.multiComputes == null ? List.of() : this.multiComputes;
    }
    public Optional<String> searchQuery() {
        return Optional.ofNullable(this.searchQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetHeatmapDefinitionRequestApmQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetHeatmapDefinitionRequestApmQueryComputeQuery computeQuery;
        private @Nullable List<DashboardWidgetHeatmapDefinitionRequestApmQueryGroupBy> groupBies;
        private String index;
        private @Nullable List<DashboardWidgetHeatmapDefinitionRequestApmQueryMultiCompute> multiComputes;
        private @Nullable String searchQuery;
        public Builder() {}
        public Builder(DashboardWidgetHeatmapDefinitionRequestApmQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeQuery = defaults.computeQuery;
    	      this.groupBies = defaults.groupBies;
    	      this.index = defaults.index;
    	      this.multiComputes = defaults.multiComputes;
    	      this.searchQuery = defaults.searchQuery;
        }

        @CustomType.Setter
        public Builder computeQuery(@Nullable DashboardWidgetHeatmapDefinitionRequestApmQueryComputeQuery computeQuery) {
            this.computeQuery = computeQuery;
            return this;
        }
        @CustomType.Setter
        public Builder groupBies(@Nullable List<DashboardWidgetHeatmapDefinitionRequestApmQueryGroupBy> groupBies) {
            this.groupBies = groupBies;
            return this;
        }
        public Builder groupBies(DashboardWidgetHeatmapDefinitionRequestApmQueryGroupBy... groupBies) {
            return groupBies(List.of(groupBies));
        }
        @CustomType.Setter
        public Builder index(String index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        @CustomType.Setter
        public Builder multiComputes(@Nullable List<DashboardWidgetHeatmapDefinitionRequestApmQueryMultiCompute> multiComputes) {
            this.multiComputes = multiComputes;
            return this;
        }
        public Builder multiComputes(DashboardWidgetHeatmapDefinitionRequestApmQueryMultiCompute... multiComputes) {
            return multiComputes(List.of(multiComputes));
        }
        @CustomType.Setter
        public Builder searchQuery(@Nullable String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }
        public DashboardWidgetHeatmapDefinitionRequestApmQuery build() {
            final var o = new DashboardWidgetHeatmapDefinitionRequestApmQuery();
            o.computeQuery = computeQuery;
            o.groupBies = groupBies;
            o.index = index;
            o.multiComputes = multiComputes;
            o.searchQuery = searchQuery;
            return o;
        }
    }
}