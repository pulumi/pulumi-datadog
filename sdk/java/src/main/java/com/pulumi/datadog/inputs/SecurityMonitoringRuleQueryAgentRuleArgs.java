// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SecurityMonitoringRuleQueryAgentRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityMonitoringRuleQueryAgentRuleArgs Empty = new SecurityMonitoringRuleQueryAgentRuleArgs();

    /**
     * **Deprecated**. It won&#39;t be applied anymore.
     * 
     */
    @Import(name="agentRuleId", required=true)
    private Output<String> agentRuleId;

    /**
     * @return **Deprecated**. It won&#39;t be applied anymore.
     * 
     */
    public Output<String> agentRuleId() {
        return this.agentRuleId;
    }

    /**
     * **Deprecated**. It won&#39;t be applied anymore.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return **Deprecated**. It won&#39;t be applied anymore.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    private SecurityMonitoringRuleQueryAgentRuleArgs() {}

    private SecurityMonitoringRuleQueryAgentRuleArgs(SecurityMonitoringRuleQueryAgentRuleArgs $) {
        this.agentRuleId = $.agentRuleId;
        this.expression = $.expression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityMonitoringRuleQueryAgentRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityMonitoringRuleQueryAgentRuleArgs $;

        public Builder() {
            $ = new SecurityMonitoringRuleQueryAgentRuleArgs();
        }

        public Builder(SecurityMonitoringRuleQueryAgentRuleArgs defaults) {
            $ = new SecurityMonitoringRuleQueryAgentRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentRuleId **Deprecated**. It won&#39;t be applied anymore.
         * 
         * @return builder
         * 
         */
        public Builder agentRuleId(Output<String> agentRuleId) {
            $.agentRuleId = agentRuleId;
            return this;
        }

        /**
         * @param agentRuleId **Deprecated**. It won&#39;t be applied anymore.
         * 
         * @return builder
         * 
         */
        public Builder agentRuleId(String agentRuleId) {
            return agentRuleId(Output.of(agentRuleId));
        }

        /**
         * @param expression **Deprecated**. It won&#39;t be applied anymore.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression **Deprecated**. It won&#39;t be applied anymore.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public SecurityMonitoringRuleQueryAgentRuleArgs build() {
            if ($.agentRuleId == null) {
                throw new MissingRequiredPropertyException("SecurityMonitoringRuleQueryAgentRuleArgs", "agentRuleId");
            }
            if ($.expression == null) {
                throw new MissingRequiredPropertyException("SecurityMonitoringRuleQueryAgentRuleArgs", "expression");
            }
            return $;
        }
    }

}
