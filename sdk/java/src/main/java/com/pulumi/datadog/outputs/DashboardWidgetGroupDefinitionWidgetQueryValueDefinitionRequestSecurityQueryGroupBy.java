// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBySortQuery;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBy {
    private @Nullable String facet;
    private @Nullable Integer limit;
    private @Nullable DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBySortQuery sortQuery;

    private DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBy() {}
    public Optional<String> facet() {
        return Optional.ofNullable(this.facet);
    }
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    public Optional<DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBySortQuery> sortQuery() {
        return Optional.ofNullable(this.sortQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String facet;
        private @Nullable Integer limit;
        private @Nullable DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBySortQuery sortQuery;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.facet = defaults.facet;
    	      this.limit = defaults.limit;
    	      this.sortQuery = defaults.sortQuery;
        }

        @CustomType.Setter
        public Builder facet(@Nullable String facet) {
            this.facet = facet;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable Integer limit) {
            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder sortQuery(@Nullable DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBySortQuery sortQuery) {
            this.sortQuery = sortQuery;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBy build() {
            final var o = new DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBy();
            o.facet = facet;
            o.limit = limit;
            o.sortQuery = sortQuery;
            return o;
        }
    }
}