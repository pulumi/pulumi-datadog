// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.GetMonitorConfigPoliciesMonitorConfigPolicyTagPolicy;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMonitorConfigPoliciesMonitorConfigPolicy {
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;
    private String policyType;
    private GetMonitorConfigPoliciesMonitorConfigPolicyTagPolicy tagPolicy;

    private GetMonitorConfigPoliciesMonitorConfigPolicy() {}
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String policyType() {
        return this.policyType;
    }
    public GetMonitorConfigPoliciesMonitorConfigPolicyTagPolicy tagPolicy() {
        return this.tagPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMonitorConfigPoliciesMonitorConfigPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String policyType;
        private GetMonitorConfigPoliciesMonitorConfigPolicyTagPolicy tagPolicy;
        public Builder() {}
        public Builder(GetMonitorConfigPoliciesMonitorConfigPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.policyType = defaults.policyType;
    	      this.tagPolicy = defaults.tagPolicy;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder policyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }
        @CustomType.Setter
        public Builder tagPolicy(GetMonitorConfigPoliciesMonitorConfigPolicyTagPolicy tagPolicy) {
            this.tagPolicy = Objects.requireNonNull(tagPolicy);
            return this;
        }
        public GetMonitorConfigPoliciesMonitorConfigPolicy build() {
            final var o = new GetMonitorConfigPoliciesMonitorConfigPolicy();
            o.id = id;
            o.policyType = policyType;
            o.tagPolicy = tagPolicy;
            return o;
        }
    }
}