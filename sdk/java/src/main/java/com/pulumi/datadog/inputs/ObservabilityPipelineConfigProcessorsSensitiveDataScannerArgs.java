// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs Empty = new ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs();

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
     * A Datadog search query used to determine which logs this processor targets.
     * 
     */
    @Import(name="include", required=true)
    private Output<String> include;

    /**
     * @return A Datadog search query used to determine which logs this processor targets.
     * 
     */
    public Output<String> include() {
        return this.include;
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
     * A list of rules for identifying and acting on sensitive data patterns.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleArgs>> rules;

    /**
     * @return A list of rules for identifying and acting on sensitive data patterns.
     * 
     */
    public Optional<Output<List<ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs() {}

    private ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs(ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs $) {
        this.id = $.id;
        this.include = $.include;
        this.inputs = $.inputs;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs $;

        public Builder() {
            $ = new ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs();
        }

        public Builder(ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs defaults) {
            $ = new ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs(Objects.requireNonNull(defaults));
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
         * @param include A Datadog search query used to determine which logs this processor targets.
         * 
         * @return builder
         * 
         */
        public Builder include(Output<String> include) {
            $.include = include;
            return this;
        }

        /**
         * @param include A Datadog search query used to determine which logs this processor targets.
         * 
         * @return builder
         * 
         */
        public Builder include(String include) {
            return include(Output.of(include));
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
         * @param rules A list of rules for identifying and acting on sensitive data patterns.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules A list of rules for identifying and acting on sensitive data patterns.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules A list of rules for identifying and acting on sensitive data patterns.
         * 
         * @return builder
         * 
         */
        public Builder rules(ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs", "id");
            }
            if ($.include == null) {
                throw new MissingRequiredPropertyException("ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs", "include");
            }
            if ($.inputs == null) {
                throw new MissingRequiredPropertyException("ObservabilityPipelineConfigProcessorsSensitiveDataScannerArgs", "inputs");
            }
            return $;
        }
    }

}
