// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SecurityMonitoringDefaultRuleCase {
    private List<String> notifications;
    private String status;

    private SecurityMonitoringDefaultRuleCase() {}
    public List<String> notifications() {
        return this.notifications;
    }
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityMonitoringDefaultRuleCase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> notifications;
        private String status;
        public Builder() {}
        public Builder(SecurityMonitoringDefaultRuleCase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notifications = defaults.notifications;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder notifications(List<String> notifications) {
            this.notifications = Objects.requireNonNull(notifications);
            return this;
        }
        public Builder notifications(String... notifications) {
            return notifications(List.of(notifications));
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public SecurityMonitoringDefaultRuleCase build() {
            final var o = new SecurityMonitoringDefaultRuleCase();
            o.notifications = notifications;
            o.status = status;
            return o;
        }
    }
}