// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogsPipelineOrderState extends com.pulumi.resources.ResourceArgs {

    public static final LogsPipelineOrderState Empty = new LogsPipelineOrderState();

    /**
     * The name attribute in the resource `datadog.LogsPipelineOrder` needs to be unique. It&#39;s recommended to use the same value as the resource name. No related field is available in [Logs Pipeline API](https://docs.datadoghq.com/api/v1/logs-pipelines/#get-pipeline-order).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name attribute in the resource `datadog.LogsPipelineOrder` needs to be unique. It&#39;s recommended to use the same value as the resource name. No related field is available in [Logs Pipeline API](https://docs.datadoghq.com/api/v1/logs-pipelines/#get-pipeline-order).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The pipeline IDs list. The order of pipeline IDs in this attribute defines the overall pipeline order for logs.
     * 
     */
    @Import(name="pipelines")
    private @Nullable Output<List<String>> pipelines;

    /**
     * @return The pipeline IDs list. The order of pipeline IDs in this attribute defines the overall pipeline order for logs.
     * 
     */
    public Optional<Output<List<String>>> pipelines() {
        return Optional.ofNullable(this.pipelines);
    }

    private LogsPipelineOrderState() {}

    private LogsPipelineOrderState(LogsPipelineOrderState $) {
        this.name = $.name;
        this.pipelines = $.pipelines;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsPipelineOrderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsPipelineOrderState $;

        public Builder() {
            $ = new LogsPipelineOrderState();
        }

        public Builder(LogsPipelineOrderState defaults) {
            $ = new LogsPipelineOrderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name attribute in the resource `datadog.LogsPipelineOrder` needs to be unique. It&#39;s recommended to use the same value as the resource name. No related field is available in [Logs Pipeline API](https://docs.datadoghq.com/api/v1/logs-pipelines/#get-pipeline-order).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name attribute in the resource `datadog.LogsPipelineOrder` needs to be unique. It&#39;s recommended to use the same value as the resource name. No related field is available in [Logs Pipeline API](https://docs.datadoghq.com/api/v1/logs-pipelines/#get-pipeline-order).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pipelines The pipeline IDs list. The order of pipeline IDs in this attribute defines the overall pipeline order for logs.
         * 
         * @return builder
         * 
         */
        public Builder pipelines(@Nullable Output<List<String>> pipelines) {
            $.pipelines = pipelines;
            return this;
        }

        /**
         * @param pipelines The pipeline IDs list. The order of pipeline IDs in this attribute defines the overall pipeline order for logs.
         * 
         * @return builder
         * 
         */
        public Builder pipelines(List<String> pipelines) {
            return pipelines(Output.of(pipelines));
        }

        /**
         * @param pipelines The pipeline IDs list. The order of pipeline IDs in this attribute defines the overall pipeline order for logs.
         * 
         * @return builder
         * 
         */
        public Builder pipelines(String... pipelines) {
            return pipelines(List.of(pipelines));
        }

        public LogsPipelineOrderState build() {
            return $;
        }
    }

}
