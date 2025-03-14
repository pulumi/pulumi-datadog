// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.GetCloudWorkloadSecurityAgentRulesAgentRule;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCloudWorkloadSecurityAgentRulesResult {
    /**
     * @return List of Agent rules.
     * 
     */
    private List<GetCloudWorkloadSecurityAgentRulesAgentRule> agentRules;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetCloudWorkloadSecurityAgentRulesResult() {}
    /**
     * @return List of Agent rules.
     * 
     */
    public List<GetCloudWorkloadSecurityAgentRulesAgentRule> agentRules() {
        return this.agentRules;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudWorkloadSecurityAgentRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCloudWorkloadSecurityAgentRulesAgentRule> agentRules;
        private String id;
        public Builder() {}
        public Builder(GetCloudWorkloadSecurityAgentRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentRules = defaults.agentRules;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder agentRules(List<GetCloudWorkloadSecurityAgentRulesAgentRule> agentRules) {
            if (agentRules == null) {
              throw new MissingRequiredPropertyException("GetCloudWorkloadSecurityAgentRulesResult", "agentRules");
            }
            this.agentRules = agentRules;
            return this;
        }
        public Builder agentRules(GetCloudWorkloadSecurityAgentRulesAgentRule... agentRules) {
            return agentRules(List.of(agentRules));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudWorkloadSecurityAgentRulesResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetCloudWorkloadSecurityAgentRulesResult build() {
            final var _resultValue = new GetCloudWorkloadSecurityAgentRulesResult();
            _resultValue.agentRules = agentRules;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
