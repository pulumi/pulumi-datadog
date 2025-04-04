// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityMonitoringDefaultRuleOptions {
    /**
     * @return If true, signals in non-production environments have a lower severity than what is defined by the rule case, which can reduce noise. The decrement is applied when the environment tag of the signal starts with `staging`, `test`, or `dev`. Only available when the rule type is `log_detection`. Defaults to `false`.
     * 
     */
    private @Nullable Boolean decreaseCriticalityBasedOnEnv;

    private SecurityMonitoringDefaultRuleOptions() {}
    /**
     * @return If true, signals in non-production environments have a lower severity than what is defined by the rule case, which can reduce noise. The decrement is applied when the environment tag of the signal starts with `staging`, `test`, or `dev`. Only available when the rule type is `log_detection`. Defaults to `false`.
     * 
     */
    public Optional<Boolean> decreaseCriticalityBasedOnEnv() {
        return Optional.ofNullable(this.decreaseCriticalityBasedOnEnv);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityMonitoringDefaultRuleOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean decreaseCriticalityBasedOnEnv;
        public Builder() {}
        public Builder(SecurityMonitoringDefaultRuleOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decreaseCriticalityBasedOnEnv = defaults.decreaseCriticalityBasedOnEnv;
        }

        @CustomType.Setter
        public Builder decreaseCriticalityBasedOnEnv(@Nullable Boolean decreaseCriticalityBasedOnEnv) {

            this.decreaseCriticalityBasedOnEnv = decreaseCriticalityBasedOnEnv;
            return this;
        }
        public SecurityMonitoringDefaultRuleOptions build() {
            final var _resultValue = new SecurityMonitoringDefaultRuleOptions();
            _resultValue.decreaseCriticalityBasedOnEnv = decreaseCriticalityBasedOnEnv;
            return _resultValue;
        }
    }
}
