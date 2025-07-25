// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.GetCsmThreatsPoliciesPolicy;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCsmThreatsPoliciesResult {
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;
    /**
     * @return List of policies
     * 
     */
    private List<GetCsmThreatsPoliciesPolicy> policies;
    /**
     * @return List of IDs for the policies.
     * 
     */
    private List<String> policyIds;

    private GetCsmThreatsPoliciesResult() {}
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of policies
     * 
     */
    public List<GetCsmThreatsPoliciesPolicy> policies() {
        return this.policies;
    }
    /**
     * @return List of IDs for the policies.
     * 
     */
    public List<String> policyIds() {
        return this.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCsmThreatsPoliciesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetCsmThreatsPoliciesPolicy> policies;
        private List<String> policyIds;
        public Builder() {}
        public Builder(GetCsmThreatsPoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.policies = defaults.policies;
    	      this.policyIds = defaults.policyIds;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCsmThreatsPoliciesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder policies(List<GetCsmThreatsPoliciesPolicy> policies) {
            if (policies == null) {
              throw new MissingRequiredPropertyException("GetCsmThreatsPoliciesResult", "policies");
            }
            this.policies = policies;
            return this;
        }
        public Builder policies(GetCsmThreatsPoliciesPolicy... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder policyIds(List<String> policyIds) {
            if (policyIds == null) {
              throw new MissingRequiredPropertyException("GetCsmThreatsPoliciesResult", "policyIds");
            }
            this.policyIds = policyIds;
            return this;
        }
        public Builder policyIds(String... policyIds) {
            return policyIds(List.of(policyIds));
        }
        public GetCsmThreatsPoliciesResult build() {
            final var _resultValue = new GetCsmThreatsPoliciesResult();
            _resultValue.id = id;
            _resultValue.policies = policies;
            _resultValue.policyIds = policyIds;
            return _resultValue;
        }
    }
}
