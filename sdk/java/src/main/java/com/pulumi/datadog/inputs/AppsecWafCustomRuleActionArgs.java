// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.AppsecWafCustomRuleActionParametersArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppsecWafCustomRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppsecWafCustomRuleActionArgs Empty = new AppsecWafCustomRuleActionArgs();

    /**
     * Override the default action to take when the WAF custom rule would block.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return Override the default action to take when the WAF custom rule would block.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="parameters")
    private @Nullable Output<AppsecWafCustomRuleActionParametersArgs> parameters;

    public Optional<Output<AppsecWafCustomRuleActionParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private AppsecWafCustomRuleActionArgs() {}

    private AppsecWafCustomRuleActionArgs(AppsecWafCustomRuleActionArgs $) {
        this.action = $.action;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppsecWafCustomRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppsecWafCustomRuleActionArgs $;

        public Builder() {
            $ = new AppsecWafCustomRuleActionArgs();
        }

        public Builder(AppsecWafCustomRuleActionArgs defaults) {
            $ = new AppsecWafCustomRuleActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Override the default action to take when the WAF custom rule would block.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Override the default action to take when the WAF custom rule would block.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder parameters(@Nullable Output<AppsecWafCustomRuleActionParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(AppsecWafCustomRuleActionParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public AppsecWafCustomRuleActionArgs build() {
            return $;
        }
    }

}
