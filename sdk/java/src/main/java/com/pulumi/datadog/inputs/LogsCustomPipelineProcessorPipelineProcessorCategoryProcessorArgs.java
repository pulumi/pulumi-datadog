// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs Empty = new LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs();

    /**
     * List of filters to match or exclude a log with their corresponding name to assign a custom value to the log.
     * 
     */
    @Import(name="categories", required=true)
    private Output<List<LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryArgs>> categories;

    /**
     * @return List of filters to match or exclude a log with their corresponding name to assign a custom value to the log.
     * 
     */
    public Output<List<LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryArgs>> categories() {
        return this.categories;
    }

    /**
     * If the processor is enabled or not.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return If the processor is enabled or not.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * Name of the category
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the category
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of the target attribute whose value is defined by the matching category.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    /**
     * @return Name of the target attribute whose value is defined by the matching category.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    private LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs() {}

    private LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs(LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs $) {
        this.categories = $.categories;
        this.isEnabled = $.isEnabled;
        this.name = $.name;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs $;

        public Builder() {
            $ = new LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs();
        }

        public Builder(LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs defaults) {
            $ = new LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param categories List of filters to match or exclude a log with their corresponding name to assign a custom value to the log.
         * 
         * @return builder
         * 
         */
        public Builder categories(Output<List<LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryArgs>> categories) {
            $.categories = categories;
            return this;
        }

        /**
         * @param categories List of filters to match or exclude a log with their corresponding name to assign a custom value to the log.
         * 
         * @return builder
         * 
         */
        public Builder categories(List<LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryArgs> categories) {
            return categories(Output.of(categories));
        }

        /**
         * @param categories List of filters to match or exclude a log with their corresponding name to assign a custom value to the log.
         * 
         * @return builder
         * 
         */
        public Builder categories(LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryArgs... categories) {
            return categories(List.of(categories));
        }

        /**
         * @param isEnabled If the processor is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled If the processor is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param name Name of the category
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the category
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param target Name of the target attribute whose value is defined by the matching category.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Name of the target attribute whose value is defined by the matching category.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        public LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs build() {
            if ($.categories == null) {
                throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs", "categories");
            }
            if ($.target == null) {
                throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs", "target");
            }
            return $;
        }
    }

}