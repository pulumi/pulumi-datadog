// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.GetCsmThreatsAgentRulesAgentRule;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCsmThreatsAgentRulesResult {
    /**
     * @return List of Agent rules
     * 
     */
    private List<GetCsmThreatsAgentRulesAgentRule> agentRules;
    /**
     * @return List of IDs for the Agent rules.
     * 
     */
    private List<String> agentRulesIds;
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;

    private GetCsmThreatsAgentRulesResult() {}
    /**
     * @return List of Agent rules
     * 
     */
    public List<GetCsmThreatsAgentRulesAgentRule> agentRules() {
        return this.agentRules;
    }
    /**
     * @return List of IDs for the Agent rules.
     * 
     */
    public List<String> agentRulesIds() {
        return this.agentRulesIds;
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCsmThreatsAgentRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCsmThreatsAgentRulesAgentRule> agentRules;
        private List<String> agentRulesIds;
        private String id;
        public Builder() {}
        public Builder(GetCsmThreatsAgentRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentRules = defaults.agentRules;
    	      this.agentRulesIds = defaults.agentRulesIds;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder agentRules(List<GetCsmThreatsAgentRulesAgentRule> agentRules) {
            if (agentRules == null) {
              throw new MissingRequiredPropertyException("GetCsmThreatsAgentRulesResult", "agentRules");
            }
            this.agentRules = agentRules;
            return this;
        }
        public Builder agentRules(GetCsmThreatsAgentRulesAgentRule... agentRules) {
            return agentRules(List.of(agentRules));
        }
        @CustomType.Setter
        public Builder agentRulesIds(List<String> agentRulesIds) {
            if (agentRulesIds == null) {
              throw new MissingRequiredPropertyException("GetCsmThreatsAgentRulesResult", "agentRulesIds");
            }
            this.agentRulesIds = agentRulesIds;
            return this;
        }
        public Builder agentRulesIds(String... agentRulesIds) {
            return agentRulesIds(List.of(agentRulesIds));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCsmThreatsAgentRulesResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetCsmThreatsAgentRulesResult build() {
            final var _resultValue = new GetCsmThreatsAgentRulesResult();
            _resultValue.agentRules = agentRules;
            _resultValue.agentRulesIds = agentRulesIds;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}