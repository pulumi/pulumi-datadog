// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupBySortQuery;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupBy {
    /**
     * @return The facet name.
     * 
     */
    private @Nullable String facet;
    /**
     * @return The maximum number of items in the group.
     * 
     */
    private @Nullable Integer limit;
    /**
     * @return A list of exactly one element describing the sort query to use.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupBySortQuery sortQuery;

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupBy() {}
    /**
     * @return The facet name.
     * 
     */
    public Optional<String> facet() {
        return Optional.ofNullable(this.facet);
    }
    /**
     * @return The maximum number of items in the group.
     * 
     */
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return A list of exactly one element describing the sort query to use.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupBySortQuery> sortQuery() {
        return Optional.ofNullable(this.sortQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupBy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String facet;
        private @Nullable Integer limit;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupBySortQuery sortQuery;
        public Builder() {}
        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupBy defaults) {
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
        public Builder sortQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupBySortQuery sortQuery) {

            this.sortQuery = sortQuery;
            return this;
        }
        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupBy build() {
            final var _resultValue = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupBy();
            _resultValue.facet = facet;
            _resultValue.limit = limit;
            _resultValue.sortQuery = sortQuery;
            return _resultValue;
        }
    }
}