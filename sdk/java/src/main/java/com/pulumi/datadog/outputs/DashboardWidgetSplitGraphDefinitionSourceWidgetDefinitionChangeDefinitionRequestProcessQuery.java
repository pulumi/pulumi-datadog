// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestProcessQuery {
    /**
     * @return A list of processes.
     * 
     */
    private @Nullable List<String> filterBies;
    /**
     * @return The maximum number of items in the group.
     * 
     */
    private @Nullable Integer limit;
    /**
     * @return The metric from the request to correlate with this conditional format.
     * 
     */
    private String metric;
    /**
     * @return Your chosen search term.
     * 
     */
    private @Nullable String searchBy;

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestProcessQuery() {}
    /**
     * @return A list of processes.
     * 
     */
    public List<String> filterBies() {
        return this.filterBies == null ? List.of() : this.filterBies;
    }
    /**
     * @return The maximum number of items in the group.
     * 
     */
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return The metric from the request to correlate with this conditional format.
     * 
     */
    public String metric() {
        return this.metric;
    }
    /**
     * @return Your chosen search term.
     * 
     */
    public Optional<String> searchBy() {
        return Optional.ofNullable(this.searchBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestProcessQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> filterBies;
        private @Nullable Integer limit;
        private String metric;
        private @Nullable String searchBy;
        public Builder() {}
        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestProcessQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterBies = defaults.filterBies;
    	      this.limit = defaults.limit;
    	      this.metric = defaults.metric;
    	      this.searchBy = defaults.searchBy;
        }

        @CustomType.Setter
        public Builder filterBies(@Nullable List<String> filterBies) {

            this.filterBies = filterBies;
            return this;
        }
        public Builder filterBies(String... filterBies) {
            return filterBies(List.of(filterBies));
        }
        @CustomType.Setter
        public Builder limit(@Nullable Integer limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder metric(String metric) {
            if (metric == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestProcessQuery", "metric");
            }
            this.metric = metric;
            return this;
        }
        @CustomType.Setter
        public Builder searchBy(@Nullable String searchBy) {

            this.searchBy = searchBy;
            return this;
        }
        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestProcessQuery build() {
            final var _resultValue = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestProcessQuery();
            _resultValue.filterBies = filterBies;
            _resultValue.limit = limit;
            _resultValue.metric = metric;
            _resultValue.searchBy = searchBy;
            return _resultValue;
        }
    }
}