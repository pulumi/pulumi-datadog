// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.LogsCustomPipelineProcessorGrokParserGrok;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogsCustomPipelineProcessorGrokParser {
    private LogsCustomPipelineProcessorGrokParserGrok grok;
    /**
     * @return If the processor is enabled or not.
     * 
     */
    private @Nullable Boolean isEnabled;
    /**
     * @return Name of the processor
     * 
     */
    private @Nullable String name;
    /**
     * @return List of sample logs for this parser. It can save up to 5 samples. Each sample takes up to 5000 characters.
     * 
     */
    private @Nullable List<String> samples;
    /**
     * @return Name of the log attribute to parse.
     * 
     */
    private String source;

    private LogsCustomPipelineProcessorGrokParser() {}
    public LogsCustomPipelineProcessorGrokParserGrok grok() {
        return this.grok;
    }
    /**
     * @return If the processor is enabled or not.
     * 
     */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * @return Name of the processor
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return List of sample logs for this parser. It can save up to 5 samples. Each sample takes up to 5000 characters.
     * 
     */
    public List<String> samples() {
        return this.samples == null ? List.of() : this.samples;
    }
    /**
     * @return Name of the log attribute to parse.
     * 
     */
    public String source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsCustomPipelineProcessorGrokParser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private LogsCustomPipelineProcessorGrokParserGrok grok;
        private @Nullable Boolean isEnabled;
        private @Nullable String name;
        private @Nullable List<String> samples;
        private String source;
        public Builder() {}
        public Builder(LogsCustomPipelineProcessorGrokParser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grok = defaults.grok;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.samples = defaults.samples;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder grok(LogsCustomPipelineProcessorGrokParserGrok grok) {
            if (grok == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorGrokParser", "grok");
            }
            this.grok = grok;
            return this;
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
        public Builder samples(@Nullable List<String> samples) {

            this.samples = samples;
            return this;
        }
        public Builder samples(String... samples) {
            return samples(List.of(samples));
        }
        @CustomType.Setter
        public Builder source(String source) {
            if (source == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorGrokParser", "source");
            }
            this.source = source;
            return this;
        }
        public LogsCustomPipelineProcessorGrokParser build() {
            final var _resultValue = new LogsCustomPipelineProcessorGrokParser();
            _resultValue.grok = grok;
            _resultValue.isEnabled = isEnabled;
            _resultValue.name = name;
            _resultValue.samples = samples;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
