// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetToplistDefinitionRequestQueryEventQueryCompute {
    /**
     * @return The aggregation methods for event platform queries. Valid values are `count`, `cardinality`, `median`, `pc75`, `pc90`, `pc95`, `pc98`, `pc99`, `sum`, `min`, `max`, `avg`.
     * 
     */
    private String aggregation;
    /**
     * @return A time interval in milliseconds.
     * 
     */
    private @Nullable Integer interval;
    /**
     * @return The measurable attribute to compute.
     * 
     */
    private @Nullable String metric;

    private DashboardWidgetToplistDefinitionRequestQueryEventQueryCompute() {}
    /**
     * @return The aggregation methods for event platform queries. Valid values are `count`, `cardinality`, `median`, `pc75`, `pc90`, `pc95`, `pc98`, `pc99`, `sum`, `min`, `max`, `avg`.
     * 
     */
    public String aggregation() {
        return this.aggregation;
    }
    /**
     * @return A time interval in milliseconds.
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * @return The measurable attribute to compute.
     * 
     */
    public Optional<String> metric() {
        return Optional.ofNullable(this.metric);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetToplistDefinitionRequestQueryEventQueryCompute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String aggregation;
        private @Nullable Integer interval;
        private @Nullable String metric;
        public Builder() {}
        public Builder(DashboardWidgetToplistDefinitionRequestQueryEventQueryCompute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.interval = defaults.interval;
    	      this.metric = defaults.metric;
        }

        @CustomType.Setter
        public Builder aggregation(String aggregation) {
            if (aggregation == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetToplistDefinitionRequestQueryEventQueryCompute", "aggregation");
            }
            this.aggregation = aggregation;
            return this;
        }
        @CustomType.Setter
        public Builder interval(@Nullable Integer interval) {

            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder metric(@Nullable String metric) {

            this.metric = metric;
            return this;
        }
        public DashboardWidgetToplistDefinitionRequestQueryEventQueryCompute build() {
            final var _resultValue = new DashboardWidgetToplistDefinitionRequestQueryEventQueryCompute();
            _resultValue.aggregation = aggregation;
            _resultValue.interval = interval;
            _resultValue.metric = metric;
            return _resultValue;
        }
    }
}