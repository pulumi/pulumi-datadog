// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMonitorMonitorThresholdWindow {
    private String recoveryWindow;
    private String triggerWindow;

    private GetMonitorMonitorThresholdWindow() {}
    public String recoveryWindow() {
        return this.recoveryWindow;
    }
    public String triggerWindow() {
        return this.triggerWindow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMonitorMonitorThresholdWindow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String recoveryWindow;
        private String triggerWindow;
        public Builder() {}
        public Builder(GetMonitorMonitorThresholdWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recoveryWindow = defaults.recoveryWindow;
    	      this.triggerWindow = defaults.triggerWindow;
        }

        @CustomType.Setter
        public Builder recoveryWindow(String recoveryWindow) {
            if (recoveryWindow == null) {
              throw new MissingRequiredPropertyException("GetMonitorMonitorThresholdWindow", "recoveryWindow");
            }
            this.recoveryWindow = recoveryWindow;
            return this;
        }
        @CustomType.Setter
        public Builder triggerWindow(String triggerWindow) {
            if (triggerWindow == null) {
              throw new MissingRequiredPropertyException("GetMonitorMonitorThresholdWindow", "triggerWindow");
            }
            this.triggerWindow = triggerWindow;
            return this;
        }
        public GetMonitorMonitorThresholdWindow build() {
            final var _resultValue = new GetMonitorMonitorThresholdWindow();
            _resultValue.recoveryWindow = recoveryWindow;
            _resultValue.triggerWindow = triggerWindow;
            return _resultValue;
        }
    }
}
