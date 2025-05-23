// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMonitorMonitorThreshold {
    private String critical;
    private String criticalRecovery;
    private String ok;
    private String unknown;
    private String warning;
    private String warningRecovery;

    private GetMonitorMonitorThreshold() {}
    public String critical() {
        return this.critical;
    }
    public String criticalRecovery() {
        return this.criticalRecovery;
    }
    public String ok() {
        return this.ok;
    }
    public String unknown() {
        return this.unknown;
    }
    public String warning() {
        return this.warning;
    }
    public String warningRecovery() {
        return this.warningRecovery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMonitorMonitorThreshold defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String critical;
        private String criticalRecovery;
        private String ok;
        private String unknown;
        private String warning;
        private String warningRecovery;
        public Builder() {}
        public Builder(GetMonitorMonitorThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.criticalRecovery = defaults.criticalRecovery;
    	      this.ok = defaults.ok;
    	      this.unknown = defaults.unknown;
    	      this.warning = defaults.warning;
    	      this.warningRecovery = defaults.warningRecovery;
        }

        @CustomType.Setter
        public Builder critical(String critical) {
            if (critical == null) {
              throw new MissingRequiredPropertyException("GetMonitorMonitorThreshold", "critical");
            }
            this.critical = critical;
            return this;
        }
        @CustomType.Setter
        public Builder criticalRecovery(String criticalRecovery) {
            if (criticalRecovery == null) {
              throw new MissingRequiredPropertyException("GetMonitorMonitorThreshold", "criticalRecovery");
            }
            this.criticalRecovery = criticalRecovery;
            return this;
        }
        @CustomType.Setter
        public Builder ok(String ok) {
            if (ok == null) {
              throw new MissingRequiredPropertyException("GetMonitorMonitorThreshold", "ok");
            }
            this.ok = ok;
            return this;
        }
        @CustomType.Setter
        public Builder unknown(String unknown) {
            if (unknown == null) {
              throw new MissingRequiredPropertyException("GetMonitorMonitorThreshold", "unknown");
            }
            this.unknown = unknown;
            return this;
        }
        @CustomType.Setter
        public Builder warning(String warning) {
            if (warning == null) {
              throw new MissingRequiredPropertyException("GetMonitorMonitorThreshold", "warning");
            }
            this.warning = warning;
            return this;
        }
        @CustomType.Setter
        public Builder warningRecovery(String warningRecovery) {
            if (warningRecovery == null) {
              throw new MissingRequiredPropertyException("GetMonitorMonitorThreshold", "warningRecovery");
            }
            this.warningRecovery = warningRecovery;
            return this;
        }
        public GetMonitorMonitorThreshold build() {
            final var _resultValue = new GetMonitorMonitorThreshold();
            _resultValue.critical = critical;
            _resultValue.criticalRecovery = criticalRecovery;
            _resultValue.ok = ok;
            _resultValue.unknown = unknown;
            _resultValue.warning = warning;
            _resultValue.warningRecovery = warningRecovery;
            return _resultValue;
        }
    }
}
