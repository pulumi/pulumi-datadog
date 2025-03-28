// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.SecurityMonitoringRuleCaseActionArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityMonitoringRuleCaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityMonitoringRuleCaseArgs Empty = new SecurityMonitoringRuleCaseArgs();

    /**
     * Action to perform when the case trigger
     * 
     */
    @Import(name="actions")
    private @Nullable Output<List<SecurityMonitoringRuleCaseActionArgs>> actions;

    /**
     * @return Action to perform when the case trigger
     * 
     */
    public Optional<Output<List<SecurityMonitoringRuleCaseActionArgs>>> actions() {
        return Optional.ofNullable(this.actions);
    }

    /**
     * A rule case contains logical operations (`&gt;`,`&gt;=`, `&amp;&amp;`, `||`) to determine if a signal should be generated based on the event counts in the previously defined queries.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<String> condition;

    /**
     * @return A rule case contains logical operations (`&gt;`,`&gt;=`, `&amp;&amp;`, `||`) to determine if a signal should be generated based on the event counts in the previously defined queries.
     * 
     */
    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * Name of the case.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the case.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Notification targets for each rule case.
     * 
     */
    @Import(name="notifications")
    private @Nullable Output<List<String>> notifications;

    /**
     * @return Notification targets for each rule case.
     * 
     */
    public Optional<Output<List<String>>> notifications() {
        return Optional.ofNullable(this.notifications);
    }

    /**
     * Severity of the Security Signal. Valid values are `info`, `low`, `medium`, `high`, `critical`.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return Severity of the Security Signal. Valid values are `info`, `low`, `medium`, `high`, `critical`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    private SecurityMonitoringRuleCaseArgs() {}

    private SecurityMonitoringRuleCaseArgs(SecurityMonitoringRuleCaseArgs $) {
        this.actions = $.actions;
        this.condition = $.condition;
        this.name = $.name;
        this.notifications = $.notifications;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityMonitoringRuleCaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityMonitoringRuleCaseArgs $;

        public Builder() {
            $ = new SecurityMonitoringRuleCaseArgs();
        }

        public Builder(SecurityMonitoringRuleCaseArgs defaults) {
            $ = new SecurityMonitoringRuleCaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions Action to perform when the case trigger
         * 
         * @return builder
         * 
         */
        public Builder actions(@Nullable Output<List<SecurityMonitoringRuleCaseActionArgs>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions Action to perform when the case trigger
         * 
         * @return builder
         * 
         */
        public Builder actions(List<SecurityMonitoringRuleCaseActionArgs> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions Action to perform when the case trigger
         * 
         * @return builder
         * 
         */
        public Builder actions(SecurityMonitoringRuleCaseActionArgs... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param condition A rule case contains logical operations (`&gt;`,`&gt;=`, `&amp;&amp;`, `||`) to determine if a signal should be generated based on the event counts in the previously defined queries.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition A rule case contains logical operations (`&gt;`,`&gt;=`, `&amp;&amp;`, `||`) to determine if a signal should be generated based on the event counts in the previously defined queries.
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param name Name of the case.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the case.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notifications Notification targets for each rule case.
         * 
         * @return builder
         * 
         */
        public Builder notifications(@Nullable Output<List<String>> notifications) {
            $.notifications = notifications;
            return this;
        }

        /**
         * @param notifications Notification targets for each rule case.
         * 
         * @return builder
         * 
         */
        public Builder notifications(List<String> notifications) {
            return notifications(Output.of(notifications));
        }

        /**
         * @param notifications Notification targets for each rule case.
         * 
         * @return builder
         * 
         */
        public Builder notifications(String... notifications) {
            return notifications(List.of(notifications));
        }

        /**
         * @param status Severity of the Security Signal. Valid values are `info`, `low`, `medium`, `high`, `critical`.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Severity of the Security Signal. Valid values are `info`, `low`, `medium`, `high`, `critical`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public SecurityMonitoringRuleCaseArgs build() {
            if ($.status == null) {
                throw new MissingRequiredPropertyException("SecurityMonitoringRuleCaseArgs", "status");
            }
            return $;
        }
    }

}
