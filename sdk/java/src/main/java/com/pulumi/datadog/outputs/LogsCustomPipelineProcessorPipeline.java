// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.LogsCustomPipelineProcessorPipelineFilter;
import com.pulumi.datadog.outputs.LogsCustomPipelineProcessorPipelineProcessor;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogsCustomPipelineProcessorPipeline {
    private @Nullable String description;
    private List<LogsCustomPipelineProcessorPipelineFilter> filters;
    private @Nullable Boolean isEnabled;
    private String name;
    private @Nullable List<LogsCustomPipelineProcessorPipelineProcessor> processors;
    private @Nullable List<String> tags;

    private LogsCustomPipelineProcessorPipeline() {}
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public List<LogsCustomPipelineProcessorPipelineFilter> filters() {
        return this.filters;
    }
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    public String name() {
        return this.name;
    }
    public List<LogsCustomPipelineProcessorPipelineProcessor> processors() {
        return this.processors == null ? List.of() : this.processors;
    }
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsCustomPipelineProcessorPipeline defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private List<LogsCustomPipelineProcessorPipelineFilter> filters;
        private @Nullable Boolean isEnabled;
        private String name;
        private @Nullable List<LogsCustomPipelineProcessorPipelineProcessor> processors;
        private @Nullable List<String> tags;
        public Builder() {}
        public Builder(LogsCustomPipelineProcessorPipeline defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.filters = defaults.filters;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.processors = defaults.processors;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder filters(List<LogsCustomPipelineProcessorPipelineFilter> filters) {
            if (filters == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorPipeline", "filters");
            }
            this.filters = filters;
            return this;
        }
        public Builder filters(LogsCustomPipelineProcessorPipelineFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder isEnabled(@Nullable Boolean isEnabled) {

            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorPipeline", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder processors(@Nullable List<LogsCustomPipelineProcessorPipelineProcessor> processors) {

            this.processors = processors;
            return this;
        }
        public Builder processors(LogsCustomPipelineProcessorPipelineProcessor... processors) {
            return processors(List.of(processors));
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public LogsCustomPipelineProcessorPipeline build() {
            final var _resultValue = new LogsCustomPipelineProcessorPipeline();
            _resultValue.description = description;
            _resultValue.filters = filters;
            _resultValue.isEnabled = isEnabled;
            _resultValue.name = name;
            _resultValue.processors = processors;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
