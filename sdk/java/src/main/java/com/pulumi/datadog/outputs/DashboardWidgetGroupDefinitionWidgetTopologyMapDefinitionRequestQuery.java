// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestQuery {
    private String dataSource;
    private List<String> filters;
    private String service;

    private DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestQuery() {}
    public String dataSource() {
        return this.dataSource;
    }
    public List<String> filters() {
        return this.filters;
    }
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dataSource;
        private List<String> filters;
        private String service;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSource = defaults.dataSource;
    	      this.filters = defaults.filters;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder dataSource(String dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }
        @CustomType.Setter
        public Builder filters(List<String> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }
        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestQuery build() {
            final var o = new DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestQuery();
            o.dataSource = dataSource;
            o.filters = filters;
            o.service = service;
            return o;
        }
    }
}