// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetHeatmapDefinitionRequestApmQueryGroupBySortQuery;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetHeatmapDefinitionRequestApmQueryGroupBy {
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
    private @Nullable PowerpackWidgetHeatmapDefinitionRequestApmQueryGroupBySortQuery sortQuery;

    private PowerpackWidgetHeatmapDefinitionRequestApmQueryGroupBy() {}
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
    public Optional<PowerpackWidgetHeatmapDefinitionRequestApmQueryGroupBySortQuery> sortQuery() {
        return Optional.ofNullable(this.sortQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetHeatmapDefinitionRequestApmQueryGroupBy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String facet;
        private @Nullable Integer limit;
        private @Nullable PowerpackWidgetHeatmapDefinitionRequestApmQueryGroupBySortQuery sortQuery;
        public Builder() {}
        public Builder(PowerpackWidgetHeatmapDefinitionRequestApmQueryGroupBy defaults) {
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
        public Builder sortQuery(@Nullable PowerpackWidgetHeatmapDefinitionRequestApmQueryGroupBySortQuery sortQuery) {

            this.sortQuery = sortQuery;
            return this;
        }
        public PowerpackWidgetHeatmapDefinitionRequestApmQueryGroupBy build() {
            final var _resultValue = new PowerpackWidgetHeatmapDefinitionRequestApmQueryGroupBy();
            _resultValue.facet = facet;
            _resultValue.limit = limit;
            _resultValue.sortQuery = sortQuery;
            return _resultValue;
        }
    }
}
