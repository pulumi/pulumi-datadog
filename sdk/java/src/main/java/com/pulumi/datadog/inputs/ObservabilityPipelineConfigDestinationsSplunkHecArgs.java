// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObservabilityPipelineConfigDestinationsSplunkHecArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObservabilityPipelineConfigDestinationsSplunkHecArgs Empty = new ObservabilityPipelineConfigDestinationsSplunkHecArgs();

    /**
     * If `true`, Splunk tries to extract timestamps from incoming log events.
     * 
     */
    @Import(name="autoExtractTimestamp")
    private @Nullable Output<Boolean> autoExtractTimestamp;

    /**
     * @return If `true`, Splunk tries to extract timestamps from incoming log events.
     * 
     */
    public Optional<Output<Boolean>> autoExtractTimestamp() {
        return Optional.ofNullable(this.autoExtractTimestamp);
    }

    /**
     * Encoding format for log events. Valid values: `json`, `raw_message`.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<String> encoding;

    /**
     * @return Encoding format for log events. Valid values: `json`, `raw_message`.
     * 
     */
    public Optional<Output<String>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Optional name of the Splunk index where logs are written.
     * 
     */
    @Import(name="index")
    private @Nullable Output<String> index;

    /**
     * @return Optional name of the Splunk index where logs are written.
     * 
     */
    public Optional<Output<String>> index() {
        return Optional.ofNullable(this.index);
    }

    /**
     * A list of component IDs whose output is used as the `input` for this component.
     * 
     */
    @Import(name="inputs", required=true)
    private Output<List<String>> inputs;

    /**
     * @return A list of component IDs whose output is used as the `input` for this component.
     * 
     */
    public Output<List<String>> inputs() {
        return this.inputs;
    }

    /**
     * The Splunk sourcetype to assign to log events.
     * 
     */
    @Import(name="sourcetype")
    private @Nullable Output<String> sourcetype;

    /**
     * @return The Splunk sourcetype to assign to log events.
     * 
     */
    public Optional<Output<String>> sourcetype() {
        return Optional.ofNullable(this.sourcetype);
    }

    private ObservabilityPipelineConfigDestinationsSplunkHecArgs() {}

    private ObservabilityPipelineConfigDestinationsSplunkHecArgs(ObservabilityPipelineConfigDestinationsSplunkHecArgs $) {
        this.autoExtractTimestamp = $.autoExtractTimestamp;
        this.encoding = $.encoding;
        this.id = $.id;
        this.index = $.index;
        this.inputs = $.inputs;
        this.sourcetype = $.sourcetype;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObservabilityPipelineConfigDestinationsSplunkHecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObservabilityPipelineConfigDestinationsSplunkHecArgs $;

        public Builder() {
            $ = new ObservabilityPipelineConfigDestinationsSplunkHecArgs();
        }

        public Builder(ObservabilityPipelineConfigDestinationsSplunkHecArgs defaults) {
            $ = new ObservabilityPipelineConfigDestinationsSplunkHecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoExtractTimestamp If `true`, Splunk tries to extract timestamps from incoming log events.
         * 
         * @return builder
         * 
         */
        public Builder autoExtractTimestamp(@Nullable Output<Boolean> autoExtractTimestamp) {
            $.autoExtractTimestamp = autoExtractTimestamp;
            return this;
        }

        /**
         * @param autoExtractTimestamp If `true`, Splunk tries to extract timestamps from incoming log events.
         * 
         * @return builder
         * 
         */
        public Builder autoExtractTimestamp(Boolean autoExtractTimestamp) {
            return autoExtractTimestamp(Output.of(autoExtractTimestamp));
        }

        /**
         * @param encoding Encoding format for log events. Valid values: `json`, `raw_message`.
         * 
         * @return builder
         * 
         */
        public Builder encoding(@Nullable Output<String> encoding) {
            $.encoding = encoding;
            return this;
        }

        /**
         * @param encoding Encoding format for log events. Valid values: `json`, `raw_message`.
         * 
         * @return builder
         * 
         */
        public Builder encoding(String encoding) {
            return encoding(Output.of(encoding));
        }

        /**
         * @param id The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param index Optional name of the Splunk index where logs are written.
         * 
         * @return builder
         * 
         */
        public Builder index(@Nullable Output<String> index) {
            $.index = index;
            return this;
        }

        /**
         * @param index Optional name of the Splunk index where logs are written.
         * 
         * @return builder
         * 
         */
        public Builder index(String index) {
            return index(Output.of(index));
        }

        /**
         * @param inputs A list of component IDs whose output is used as the `input` for this component.
         * 
         * @return builder
         * 
         */
        public Builder inputs(Output<List<String>> inputs) {
            $.inputs = inputs;
            return this;
        }

        /**
         * @param inputs A list of component IDs whose output is used as the `input` for this component.
         * 
         * @return builder
         * 
         */
        public Builder inputs(List<String> inputs) {
            return inputs(Output.of(inputs));
        }

        /**
         * @param inputs A list of component IDs whose output is used as the `input` for this component.
         * 
         * @return builder
         * 
         */
        public Builder inputs(String... inputs) {
            return inputs(List.of(inputs));
        }

        /**
         * @param sourcetype The Splunk sourcetype to assign to log events.
         * 
         * @return builder
         * 
         */
        public Builder sourcetype(@Nullable Output<String> sourcetype) {
            $.sourcetype = sourcetype;
            return this;
        }

        /**
         * @param sourcetype The Splunk sourcetype to assign to log events.
         * 
         * @return builder
         * 
         */
        public Builder sourcetype(String sourcetype) {
            return sourcetype(Output.of(sourcetype));
        }

        public ObservabilityPipelineConfigDestinationsSplunkHecArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("ObservabilityPipelineConfigDestinationsSplunkHecArgs", "id");
            }
            if ($.inputs == null) {
                throw new MissingRequiredPropertyException("ObservabilityPipelineConfigDestinationsSplunkHecArgs", "inputs");
            }
            return $;
        }
    }

}
