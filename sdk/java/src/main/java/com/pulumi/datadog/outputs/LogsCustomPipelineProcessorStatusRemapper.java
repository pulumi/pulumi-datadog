// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogsCustomPipelineProcessorStatusRemapper {
    private @Nullable Boolean isEnabled;
    private @Nullable String name;
    private List<String> sources;

    private LogsCustomPipelineProcessorStatusRemapper() {}
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<String> sources() {
        return this.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsCustomPipelineProcessorStatusRemapper defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isEnabled;
        private @Nullable String name;
        private List<String> sources;
        public Builder() {}
        public Builder(LogsCustomPipelineProcessorStatusRemapper defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.sources = defaults.sources;
        }

        @CustomType.Setter
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder sources(List<String> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }
        public Builder sources(String... sources) {
            return sources(List.of(sources));
        }
        public LogsCustomPipelineProcessorStatusRemapper build() {
            final var o = new LogsCustomPipelineProcessorStatusRemapper();
            o.isEnabled = isEnabled;
            o.name = name;
            o.sources = sources;
            return o;
        }
    }
}