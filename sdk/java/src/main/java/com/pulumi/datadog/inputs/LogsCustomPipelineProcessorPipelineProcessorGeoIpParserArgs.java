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


public final class LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs Empty = new LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs();

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
     * Name of the processor.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the processor.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of source attributes.
     * 
     */
    @Import(name="sources", required=true)
    private Output<List<String>> sources;

    /**
     * @return List of source attributes.
     * 
     */
    public Output<List<String>> sources() {
        return this.sources;
    }

    /**
     * Name of the parent attribute that contains all the extracted details from the sources.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    /**
     * @return Name of the parent attribute that contains all the extracted details from the sources.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    private LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs() {}

    private LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs(LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs $) {
        this.isEnabled = $.isEnabled;
        this.name = $.name;
        this.sources = $.sources;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs $;

        public Builder() {
            $ = new LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs();
        }

        public Builder(LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs defaults) {
            $ = new LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs(Objects.requireNonNull(defaults));
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
         * @param name Name of the processor.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the processor.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sources List of source attributes.
         * 
         * @return builder
         * 
         */
        public Builder sources(Output<List<String>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources List of source attributes.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<String> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources List of source attributes.
         * 
         * @return builder
         * 
         */
        public Builder sources(String... sources) {
            return sources(List.of(sources));
        }

        /**
         * @param target Name of the parent attribute that contains all the extracted details from the sources.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Name of the parent attribute that contains all the extracted details from the sources.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        public LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs build() {
            if ($.sources == null) {
                throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs", "sources");
            }
            if ($.target == null) {
                throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs", "target");
            }
            return $;
        }
    }

}