// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs Empty = new SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs();

    /**
     * Fields to group by. If empty, each log triggers a signal.
     * 
     */
    @Import(name="groupByFields")
    private @Nullable Output<List<String>> groupByFields;

    /**
     * @return Fields to group by. If empty, each log triggers a signal.
     * 
     */
    public Optional<Output<List<String>>> groupByFields() {
        return Optional.ofNullable(this.groupByFields);
    }

    /**
     * Query to filter logs.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return Query to filter logs.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    private SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs() {}

    private SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs(SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs $) {
        this.groupByFields = $.groupByFields;
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs $;

        public Builder() {
            $ = new SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs();
        }

        public Builder(SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs defaults) {
            $ = new SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupByFields Fields to group by. If empty, each log triggers a signal.
         * 
         * @return builder
         * 
         */
        public Builder groupByFields(@Nullable Output<List<String>> groupByFields) {
            $.groupByFields = groupByFields;
            return this;
        }

        /**
         * @param groupByFields Fields to group by. If empty, each log triggers a signal.
         * 
         * @return builder
         * 
         */
        public Builder groupByFields(List<String> groupByFields) {
            return groupByFields(Output.of(groupByFields));
        }

        /**
         * @param groupByFields Fields to group by. If empty, each log triggers a signal.
         * 
         * @return builder
         * 
         */
        public Builder groupByFields(String... groupByFields) {
            return groupByFields(List.of(groupByFields));
        }

        /**
         * @param query Query to filter logs.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Query to filter logs.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        public SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs build() {
            if ($.query == null) {
                throw new MissingRequiredPropertyException("SecurityMonitoringRuleOptionsThirdPartyRuleOptionsRootQueryArgs", "query");
            }
            return $;
        }
    }

}