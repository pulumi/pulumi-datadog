// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityMonitoringRuleOptionsNewValueOptions {
    /**
     * @return The duration in days after which a learned value is forgotten. Valid values are `1`, `2`, `7`, `14`, `21`, `28`.
     * 
     */
    private Integer forgetAfter;
    /**
     * @return The duration in days during which values are learned, and after which signals will be generated for values that weren&#39;t learned. If set to 0, a signal will be generated for all new values after the first value is learned. Valid values are `0`, `1`, `7`. Defaults to `1`.
     * 
     */
    private @Nullable Integer learningDuration;
    /**
     * @return The learning method used to determine when signals should be generated for values that weren&#39;t learned. Valid values are `duration`, `threshold`. Defaults to `&#34;duration&#34;`.
     * 
     */
    private @Nullable String learningMethod;
    /**
     * @return A number of occurrences after which signals are generated for values that weren&#39;t learned. Valid values are `0`, `1`. Defaults to `0`.
     * 
     */
    private @Nullable Integer learningThreshold;

    private SecurityMonitoringRuleOptionsNewValueOptions() {}
    /**
     * @return The duration in days after which a learned value is forgotten. Valid values are `1`, `2`, `7`, `14`, `21`, `28`.
     * 
     */
    public Integer forgetAfter() {
        return this.forgetAfter;
    }
    /**
     * @return The duration in days during which values are learned, and after which signals will be generated for values that weren&#39;t learned. If set to 0, a signal will be generated for all new values after the first value is learned. Valid values are `0`, `1`, `7`. Defaults to `1`.
     * 
     */
    public Optional<Integer> learningDuration() {
        return Optional.ofNullable(this.learningDuration);
    }
    /**
     * @return The learning method used to determine when signals should be generated for values that weren&#39;t learned. Valid values are `duration`, `threshold`. Defaults to `&#34;duration&#34;`.
     * 
     */
    public Optional<String> learningMethod() {
        return Optional.ofNullable(this.learningMethod);
    }
    /**
     * @return A number of occurrences after which signals are generated for values that weren&#39;t learned. Valid values are `0`, `1`. Defaults to `0`.
     * 
     */
    public Optional<Integer> learningThreshold() {
        return Optional.ofNullable(this.learningThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityMonitoringRuleOptionsNewValueOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer forgetAfter;
        private @Nullable Integer learningDuration;
        private @Nullable String learningMethod;
        private @Nullable Integer learningThreshold;
        public Builder() {}
        public Builder(SecurityMonitoringRuleOptionsNewValueOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forgetAfter = defaults.forgetAfter;
    	      this.learningDuration = defaults.learningDuration;
    	      this.learningMethod = defaults.learningMethod;
    	      this.learningThreshold = defaults.learningThreshold;
        }

        @CustomType.Setter
        public Builder forgetAfter(Integer forgetAfter) {
            if (forgetAfter == null) {
              throw new MissingRequiredPropertyException("SecurityMonitoringRuleOptionsNewValueOptions", "forgetAfter");
            }
            this.forgetAfter = forgetAfter;
            return this;
        }
        @CustomType.Setter
        public Builder learningDuration(@Nullable Integer learningDuration) {

            this.learningDuration = learningDuration;
            return this;
        }
        @CustomType.Setter
        public Builder learningMethod(@Nullable String learningMethod) {

            this.learningMethod = learningMethod;
            return this;
        }
        @CustomType.Setter
        public Builder learningThreshold(@Nullable Integer learningThreshold) {

            this.learningThreshold = learningThreshold;
            return this;
        }
        public SecurityMonitoringRuleOptionsNewValueOptions build() {
            final var _resultValue = new SecurityMonitoringRuleOptionsNewValueOptions();
            _resultValue.forgetAfter = forgetAfter;
            _resultValue.learningDuration = learningDuration;
            _resultValue.learningMethod = learningMethod;
            _resultValue.learningThreshold = learningThreshold;
            return _resultValue;
        }
    }
}
