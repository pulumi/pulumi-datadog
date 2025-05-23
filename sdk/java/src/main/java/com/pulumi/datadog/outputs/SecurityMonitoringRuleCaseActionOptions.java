// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityMonitoringRuleCaseActionOptions {
    /**
     * @return Duration of the action in seconds.
     * 
     */
    private @Nullable Integer duration;

    private SecurityMonitoringRuleCaseActionOptions() {}
    /**
     * @return Duration of the action in seconds.
     * 
     */
    public Optional<Integer> duration() {
        return Optional.ofNullable(this.duration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityMonitoringRuleCaseActionOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer duration;
        public Builder() {}
        public Builder(SecurityMonitoringRuleCaseActionOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
        }

        @CustomType.Setter
        public Builder duration(@Nullable Integer duration) {

            this.duration = duration;
            return this;
        }
        public SecurityMonitoringRuleCaseActionOptions build() {
            final var _resultValue = new SecurityMonitoringRuleCaseActionOptions();
            _resultValue.duration = duration;
            return _resultValue;
        }
    }
}
