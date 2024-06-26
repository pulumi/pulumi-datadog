// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetSplitGraphDefinitionSplitConfigSortCompute {
    /**
     * @return How to aggregate the sort metric for the purposes of ordering.
     * 
     */
    private @Nullable String aggregation;
    /**
     * @return The metric to use for sorting graphs.
     * 
     */
    private String metric;

    private DashboardWidgetSplitGraphDefinitionSplitConfigSortCompute() {}
    /**
     * @return How to aggregate the sort metric for the purposes of ordering.
     * 
     */
    public Optional<String> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }
    /**
     * @return The metric to use for sorting graphs.
     * 
     */
    public String metric() {
        return this.metric;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSplitGraphDefinitionSplitConfigSortCompute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aggregation;
        private String metric;
        public Builder() {}
        public Builder(DashboardWidgetSplitGraphDefinitionSplitConfigSortCompute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.metric = defaults.metric;
        }

        @CustomType.Setter
        public Builder aggregation(@Nullable String aggregation) {

            this.aggregation = aggregation;
            return this;
        }
        @CustomType.Setter
        public Builder metric(String metric) {
            if (metric == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSplitConfigSortCompute", "metric");
            }
            this.metric = metric;
            return this;
        }
        public DashboardWidgetSplitGraphDefinitionSplitConfigSortCompute build() {
            final var _resultValue = new DashboardWidgetSplitGraphDefinitionSplitConfigSortCompute();
            _resultValue.aggregation = aggregation;
            _resultValue.metric = metric;
            return _resultValue;
        }
    }
}
