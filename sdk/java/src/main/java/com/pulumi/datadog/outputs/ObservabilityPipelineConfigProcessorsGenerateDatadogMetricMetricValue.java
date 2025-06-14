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
public final class ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValue {
    /**
     * @return Name of the log field containing the numeric value to increment the metric by (used only for `increment_by_field`).
     * 
     */
    private @Nullable String field;
    /**
     * @return Metric value strategy: `increment_by_one` or `increment_by_field`.
     * 
     */
    private String strategy;

    private ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValue() {}
    /**
     * @return Name of the log field containing the numeric value to increment the metric by (used only for `increment_by_field`).
     * 
     */
    public Optional<String> field() {
        return Optional.ofNullable(this.field);
    }
    /**
     * @return Metric value strategy: `increment_by_one` or `increment_by_field`.
     * 
     */
    public String strategy() {
        return this.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String field;
        private String strategy;
        public Builder() {}
        public Builder(ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.strategy = defaults.strategy;
        }

        @CustomType.Setter
        public Builder field(@Nullable String field) {

            this.field = field;
            return this;
        }
        @CustomType.Setter
        public Builder strategy(String strategy) {
            if (strategy == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValue", "strategy");
            }
            this.strategy = strategy;
            return this;
        }
        public ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValue build() {
            final var _resultValue = new ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValue();
            _resultValue.field = field;
            _resultValue.strategy = strategy;
            return _resultValue;
        }
    }
}
