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


public final class SecurityNotificationRuleSelectorsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityNotificationRuleSelectorsArgs Empty = new SecurityNotificationRuleSelectorsArgs();

    /**
     * Comprises one or several key:value pairs for filtering security issues based on tags and attributes. Defaults to `&#34;&#34;`.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return Comprises one or several key:value pairs for filtering security issues based on tags and attributes. Defaults to `&#34;&#34;`.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * Specifies security rule types for filtering signals and vulnerabilities that generate notifications.
     * 
     */
    @Import(name="ruleTypes", required=true)
    private Output<List<String>> ruleTypes;

    /**
     * @return Specifies security rule types for filtering signals and vulnerabilities that generate notifications.
     * 
     */
    public Output<List<String>> ruleTypes() {
        return this.ruleTypes;
    }

    /**
     * The security rules severities to consider.
     * 
     */
    @Import(name="severities")
    private @Nullable Output<List<String>> severities;

    /**
     * @return The security rules severities to consider.
     * 
     */
    public Optional<Output<List<String>>> severities() {
        return Optional.ofNullable(this.severities);
    }

    /**
     * The type of security issues the rule applies to. Use `security_signals` for rules based on security signals and `security_findings` for those based on vulnerabilities.
     * 
     */
    @Import(name="triggerSource", required=true)
    private Output<String> triggerSource;

    /**
     * @return The type of security issues the rule applies to. Use `security_signals` for rules based on security signals and `security_findings` for those based on vulnerabilities.
     * 
     */
    public Output<String> triggerSource() {
        return this.triggerSource;
    }

    private SecurityNotificationRuleSelectorsArgs() {}

    private SecurityNotificationRuleSelectorsArgs(SecurityNotificationRuleSelectorsArgs $) {
        this.query = $.query;
        this.ruleTypes = $.ruleTypes;
        this.severities = $.severities;
        this.triggerSource = $.triggerSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityNotificationRuleSelectorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityNotificationRuleSelectorsArgs $;

        public Builder() {
            $ = new SecurityNotificationRuleSelectorsArgs();
        }

        public Builder(SecurityNotificationRuleSelectorsArgs defaults) {
            $ = new SecurityNotificationRuleSelectorsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param query Comprises one or several key:value pairs for filtering security issues based on tags and attributes. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Comprises one or several key:value pairs for filtering security issues based on tags and attributes. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param ruleTypes Specifies security rule types for filtering signals and vulnerabilities that generate notifications.
         * 
         * @return builder
         * 
         */
        public Builder ruleTypes(Output<List<String>> ruleTypes) {
            $.ruleTypes = ruleTypes;
            return this;
        }

        /**
         * @param ruleTypes Specifies security rule types for filtering signals and vulnerabilities that generate notifications.
         * 
         * @return builder
         * 
         */
        public Builder ruleTypes(List<String> ruleTypes) {
            return ruleTypes(Output.of(ruleTypes));
        }

        /**
         * @param ruleTypes Specifies security rule types for filtering signals and vulnerabilities that generate notifications.
         * 
         * @return builder
         * 
         */
        public Builder ruleTypes(String... ruleTypes) {
            return ruleTypes(List.of(ruleTypes));
        }

        /**
         * @param severities The security rules severities to consider.
         * 
         * @return builder
         * 
         */
        public Builder severities(@Nullable Output<List<String>> severities) {
            $.severities = severities;
            return this;
        }

        /**
         * @param severities The security rules severities to consider.
         * 
         * @return builder
         * 
         */
        public Builder severities(List<String> severities) {
            return severities(Output.of(severities));
        }

        /**
         * @param severities The security rules severities to consider.
         * 
         * @return builder
         * 
         */
        public Builder severities(String... severities) {
            return severities(List.of(severities));
        }

        /**
         * @param triggerSource The type of security issues the rule applies to. Use `security_signals` for rules based on security signals and `security_findings` for those based on vulnerabilities.
         * 
         * @return builder
         * 
         */
        public Builder triggerSource(Output<String> triggerSource) {
            $.triggerSource = triggerSource;
            return this;
        }

        /**
         * @param triggerSource The type of security issues the rule applies to. Use `security_signals` for rules based on security signals and `security_findings` for those based on vulnerabilities.
         * 
         * @return builder
         * 
         */
        public Builder triggerSource(String triggerSource) {
            return triggerSource(Output.of(triggerSource));
        }

        public SecurityNotificationRuleSelectorsArgs build() {
            if ($.ruleTypes == null) {
                throw new MissingRequiredPropertyException("SecurityNotificationRuleSelectorsArgs", "ruleTypes");
            }
            if ($.triggerSource == null) {
                throw new MissingRequiredPropertyException("SecurityNotificationRuleSelectorsArgs", "triggerSource");
            }
            return $;
        }
    }

}
