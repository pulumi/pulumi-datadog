// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogsMetricCompute {
    /**
     * @return The type of aggregation to use. This field can&#39;t be updated after creation. Valid values are `count`, `distribution`.
     * 
     */
    private String aggregationType;
    /**
     * @return Toggle to include/exclude percentiles for a distribution metric. Defaults to false. Can only be applied to metrics that have an `aggregation_type` of distribution.
     * 
     */
    private @Nullable Boolean includePercentiles;
    /**
     * @return The path to the value the log-based metric will aggregate on (only used if the aggregation type is a &#34;distribution&#34;). This field can&#39;t be updated after creation.
     * 
     */
    private @Nullable String path;

    private LogsMetricCompute() {}
    /**
     * @return The type of aggregation to use. This field can&#39;t be updated after creation. Valid values are `count`, `distribution`.
     * 
     */
    public String aggregationType() {
        return this.aggregationType;
    }
    /**
     * @return Toggle to include/exclude percentiles for a distribution metric. Defaults to false. Can only be applied to metrics that have an `aggregation_type` of distribution.
     * 
     */
    public Optional<Boolean> includePercentiles() {
        return Optional.ofNullable(this.includePercentiles);
    }
    /**
     * @return The path to the value the log-based metric will aggregate on (only used if the aggregation type is a &#34;distribution&#34;). This field can&#39;t be updated after creation.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsMetricCompute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String aggregationType;
        private @Nullable Boolean includePercentiles;
        private @Nullable String path;
        public Builder() {}
        public Builder(LogsMetricCompute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationType = defaults.aggregationType;
    	      this.includePercentiles = defaults.includePercentiles;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder aggregationType(String aggregationType) {
            if (aggregationType == null) {
              throw new MissingRequiredPropertyException("LogsMetricCompute", "aggregationType");
            }
            this.aggregationType = aggregationType;
            return this;
        }
        @CustomType.Setter
        public Builder includePercentiles(@Nullable Boolean includePercentiles) {

            this.includePercentiles = includePercentiles;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        public LogsMetricCompute build() {
            final var _resultValue = new LogsMetricCompute();
            _resultValue.aggregationType = aggregationType;
            _resultValue.includePercentiles = includePercentiles;
            _resultValue.path = path;
            return _resultValue;
        }
    }
}