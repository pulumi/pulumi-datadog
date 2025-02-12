// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SecurityMonitoringRuleFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityMonitoringRuleFilterArgs Empty = new SecurityMonitoringRuleFilterArgs();

    /**
     * The type of filtering action. Valid values are `require`, `suppress`.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The type of filtering action. Valid values are `require`, `suppress`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * Query for selecting logs to apply the filtering action.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return Query for selecting logs to apply the filtering action.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    private SecurityMonitoringRuleFilterArgs() {}

    private SecurityMonitoringRuleFilterArgs(SecurityMonitoringRuleFilterArgs $) {
        this.action = $.action;
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityMonitoringRuleFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityMonitoringRuleFilterArgs $;

        public Builder() {
            $ = new SecurityMonitoringRuleFilterArgs();
        }

        public Builder(SecurityMonitoringRuleFilterArgs defaults) {
            $ = new SecurityMonitoringRuleFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The type of filtering action. Valid values are `require`, `suppress`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The type of filtering action. Valid values are `require`, `suppress`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param query Query for selecting logs to apply the filtering action.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Query for selecting logs to apply the filtering action.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        public SecurityMonitoringRuleFilterArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("SecurityMonitoringRuleFilterArgs", "action");
            }
            if ($.query == null) {
                throw new MissingRequiredPropertyException("SecurityMonitoringRuleFilterArgs", "query");
            }
            return $;
        }
    }

}
