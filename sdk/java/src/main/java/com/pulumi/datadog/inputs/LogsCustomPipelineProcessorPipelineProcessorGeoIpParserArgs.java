// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs Empty = new LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs();

    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="sources", required=true)
    private Output<List<String>> sources;

    public Output<List<String>> sources() {
        return this.sources;
    }

    @Import(name="target", required=true)
    private Output<String> target;

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

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder sources(Output<List<String>> sources) {
            $.sources = sources;
            return this;
        }

        public Builder sources(List<String> sources) {
            return sources(Output.of(sources));
        }

        public Builder sources(String... sources) {
            return sources(List.of(sources));
        }

        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs build() {
            $.sources = Objects.requireNonNull($.sources, "expected parameter 'sources' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}