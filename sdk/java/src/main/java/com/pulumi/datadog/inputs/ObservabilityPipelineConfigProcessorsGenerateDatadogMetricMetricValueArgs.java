// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs Empty = new ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs();

    /**
     * Name of the log field containing the numeric value to increment the metric by (used only for `increment_by_field`).
     * 
     */
    @Import(name="field")
    private @Nullable Output<String> field;

    /**
     * @return Name of the log field containing the numeric value to increment the metric by (used only for `increment_by_field`).
     * 
     */
    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

    /**
     * Metric value strategy: `increment_by_one` or `increment_by_field`.
     * 
     */
    @Import(name="strategy", required=true)
    private Output<String> strategy;

    /**
     * @return Metric value strategy: `increment_by_one` or `increment_by_field`.
     * 
     */
    public Output<String> strategy() {
        return this.strategy;
    }

    private ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs() {}

    private ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs(ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs $) {
        this.field = $.field;
        this.strategy = $.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs $;

        public Builder() {
            $ = new ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs();
        }

        public Builder(ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs defaults) {
            $ = new ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param field Name of the log field containing the numeric value to increment the metric by (used only for `increment_by_field`).
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field Name of the log field containing the numeric value to increment the metric by (used only for `increment_by_field`).
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param strategy Metric value strategy: `increment_by_one` or `increment_by_field`.
         * 
         * @return builder
         * 
         */
        public Builder strategy(Output<String> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy Metric value strategy: `increment_by_one` or `increment_by_field`.
         * 
         * @return builder
         * 
         */
        public Builder strategy(String strategy) {
            return strategy(Output.of(strategy));
        }

        public ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs build() {
            if ($.strategy == null) {
                throw new MissingRequiredPropertyException("ObservabilityPipelineConfigProcessorsGenerateDatadogMetricMetricValueArgs", "strategy");
            }
            return $;
        }
    }

}
