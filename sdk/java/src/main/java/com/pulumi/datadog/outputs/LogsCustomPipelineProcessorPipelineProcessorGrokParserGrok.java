// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LogsCustomPipelineProcessorPipelineProcessorGrokParserGrok {
    /**
     * @return Match rules for your grok parser.
     * 
     */
    private String matchRules;
    /**
     * @return Support rules for your grok parser.
     * 
     */
    private String supportRules;

    private LogsCustomPipelineProcessorPipelineProcessorGrokParserGrok() {}
    /**
     * @return Match rules for your grok parser.
     * 
     */
    public String matchRules() {
        return this.matchRules;
    }
    /**
     * @return Support rules for your grok parser.
     * 
     */
    public String supportRules() {
        return this.supportRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsCustomPipelineProcessorPipelineProcessorGrokParserGrok defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String matchRules;
        private String supportRules;
        public Builder() {}
        public Builder(LogsCustomPipelineProcessorPipelineProcessorGrokParserGrok defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchRules = defaults.matchRules;
    	      this.supportRules = defaults.supportRules;
        }

        @CustomType.Setter
        public Builder matchRules(String matchRules) {
            if (matchRules == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorPipelineProcessorGrokParserGrok", "matchRules");
            }
            this.matchRules = matchRules;
            return this;
        }
        @CustomType.Setter
        public Builder supportRules(String supportRules) {
            if (supportRules == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorPipelineProcessorGrokParserGrok", "supportRules");
            }
            this.supportRules = supportRules;
            return this;
        }
        public LogsCustomPipelineProcessorPipelineProcessorGrokParserGrok build() {
            final var _resultValue = new LogsCustomPipelineProcessorPipelineProcessorGrokParserGrok();
            _resultValue.matchRules = matchRules;
            _resultValue.supportRules = supportRules;
            return _resultValue;
        }
    }
}