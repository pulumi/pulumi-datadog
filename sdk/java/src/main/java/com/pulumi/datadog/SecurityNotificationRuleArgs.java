// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.SecurityNotificationRuleSelectorsArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityNotificationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityNotificationRuleArgs Empty = new SecurityNotificationRuleArgs();

    /**
     * Indicates whether the rule is enabled. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Indicates whether the rule is enabled. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The name of the rule (must be unique).
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the rule (must be unique).
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Defines selectors to filter security issues that generate notifications.
     * 
     */
    @Import(name="selectors")
    private @Nullable Output<SecurityNotificationRuleSelectorsArgs> selectors;

    /**
     * @return Defines selectors to filter security issues that generate notifications.
     * 
     */
    public Optional<Output<SecurityNotificationRuleSelectorsArgs>> selectors() {
        return Optional.ofNullable(this.selectors);
    }

    /**
     * The list of handle targets for the notifications. A target must be prefixed with an {@literal @}. It can be an email address ({@literal @}bob{@literal @}email.com), or any installed integration. For example, a Slack recipient ({@literal @}slack-ops), or a Teams recipient ({@literal @}teams-ops).
     * 
     */
    @Import(name="targets", required=true)
    private Output<List<String>> targets;

    /**
     * @return The list of handle targets for the notifications. A target must be prefixed with an {@literal @}. It can be an email address ({@literal @}bob{@literal @}email.com), or any installed integration. For example, a Slack recipient ({@literal @}slack-ops), or a Teams recipient ({@literal @}teams-ops).
     * 
     */
    public Output<List<String>> targets() {
        return this.targets;
    }

    /**
     * Specifies the time period, in seconds, used to aggregate the notification. Defaults to `0`.
     * 
     */
    @Import(name="timeAggregation")
    private @Nullable Output<Integer> timeAggregation;

    /**
     * @return Specifies the time period, in seconds, used to aggregate the notification. Defaults to `0`.
     * 
     */
    public Optional<Output<Integer>> timeAggregation() {
        return Optional.ofNullable(this.timeAggregation);
    }

    private SecurityNotificationRuleArgs() {}

    private SecurityNotificationRuleArgs(SecurityNotificationRuleArgs $) {
        this.enabled = $.enabled;
        this.name = $.name;
        this.selectors = $.selectors;
        this.targets = $.targets;
        this.timeAggregation = $.timeAggregation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityNotificationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityNotificationRuleArgs $;

        public Builder() {
            $ = new SecurityNotificationRuleArgs();
        }

        public Builder(SecurityNotificationRuleArgs defaults) {
            $ = new SecurityNotificationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Indicates whether the rule is enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicates whether the rule is enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name The name of the rule (must be unique).
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the rule (must be unique).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param selectors Defines selectors to filter security issues that generate notifications.
         * 
         * @return builder
         * 
         */
        public Builder selectors(@Nullable Output<SecurityNotificationRuleSelectorsArgs> selectors) {
            $.selectors = selectors;
            return this;
        }

        /**
         * @param selectors Defines selectors to filter security issues that generate notifications.
         * 
         * @return builder
         * 
         */
        public Builder selectors(SecurityNotificationRuleSelectorsArgs selectors) {
            return selectors(Output.of(selectors));
        }

        /**
         * @param targets The list of handle targets for the notifications. A target must be prefixed with an {@literal @}. It can be an email address ({@literal @}bob{@literal @}email.com), or any installed integration. For example, a Slack recipient ({@literal @}slack-ops), or a Teams recipient ({@literal @}teams-ops).
         * 
         * @return builder
         * 
         */
        public Builder targets(Output<List<String>> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @param targets The list of handle targets for the notifications. A target must be prefixed with an {@literal @}. It can be an email address ({@literal @}bob{@literal @}email.com), or any installed integration. For example, a Slack recipient ({@literal @}slack-ops), or a Teams recipient ({@literal @}teams-ops).
         * 
         * @return builder
         * 
         */
        public Builder targets(List<String> targets) {
            return targets(Output.of(targets));
        }

        /**
         * @param targets The list of handle targets for the notifications. A target must be prefixed with an {@literal @}. It can be an email address ({@literal @}bob{@literal @}email.com), or any installed integration. For example, a Slack recipient ({@literal @}slack-ops), or a Teams recipient ({@literal @}teams-ops).
         * 
         * @return builder
         * 
         */
        public Builder targets(String... targets) {
            return targets(List.of(targets));
        }

        /**
         * @param timeAggregation Specifies the time period, in seconds, used to aggregate the notification. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder timeAggregation(@Nullable Output<Integer> timeAggregation) {
            $.timeAggregation = timeAggregation;
            return this;
        }

        /**
         * @param timeAggregation Specifies the time period, in seconds, used to aggregate the notification. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder timeAggregation(Integer timeAggregation) {
            return timeAggregation(Output.of(timeAggregation));
        }

        public SecurityNotificationRuleArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("SecurityNotificationRuleArgs", "name");
            }
            if ($.targets == null) {
                throw new MissingRequiredPropertyException("SecurityNotificationRuleArgs", "targets");
            }
            return $;
        }
    }

}
