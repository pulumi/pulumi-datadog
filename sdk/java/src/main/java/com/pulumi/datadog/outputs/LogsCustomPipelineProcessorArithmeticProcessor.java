// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogsCustomPipelineProcessorArithmeticProcessor {
    /**
     * @return Arithmetic operation between one or more log attributes.
     * 
     */
    private String expression;
    /**
     * @return Boolean value to enable your pipeline.
     * 
     */
    private @Nullable Boolean isEnabled;
    /**
     * @return If true, it replaces all missing attributes of expression by 0, false skips the operation if an attribute is missing.
     * 
     */
    private @Nullable Boolean isReplaceMissing;
    /**
     * @return Your pipeline name.
     * 
     */
    private @Nullable String name;
    /**
     * @return Name of the attribute that contains the result of the arithmetic operation.
     * 
     */
    private String target;

    private LogsCustomPipelineProcessorArithmeticProcessor() {}
    /**
     * @return Arithmetic operation between one or more log attributes.
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return Boolean value to enable your pipeline.
     * 
     */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * @return If true, it replaces all missing attributes of expression by 0, false skips the operation if an attribute is missing.
     * 
     */
    public Optional<Boolean> isReplaceMissing() {
        return Optional.ofNullable(this.isReplaceMissing);
    }
    /**
     * @return Your pipeline name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Name of the attribute that contains the result of the arithmetic operation.
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsCustomPipelineProcessorArithmeticProcessor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expression;
        private @Nullable Boolean isEnabled;
        private @Nullable Boolean isReplaceMissing;
        private @Nullable String name;
        private String target;
        public Builder() {}
        public Builder(LogsCustomPipelineProcessorArithmeticProcessor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isReplaceMissing = defaults.isReplaceMissing;
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder expression(String expression) {
            if (expression == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorArithmeticProcessor", "expression");
            }
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder isEnabled(@Nullable Boolean isEnabled) {

            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder isReplaceMissing(@Nullable Boolean isReplaceMissing) {

            this.isReplaceMissing = isReplaceMissing;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder target(String target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorArithmeticProcessor", "target");
            }
            this.target = target;
            return this;
        }
        public LogsCustomPipelineProcessorArithmeticProcessor build() {
            final var _resultValue = new LogsCustomPipelineProcessorArithmeticProcessor();
            _resultValue.expression = expression;
            _resultValue.isEnabled = isEnabled;
            _resultValue.isReplaceMissing = isReplaceMissing;
            _resultValue.name = name;
            _resultValue.target = target;
            return _resultValue;
        }
    }
}