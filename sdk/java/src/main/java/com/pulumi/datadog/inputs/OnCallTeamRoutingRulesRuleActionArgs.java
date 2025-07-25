// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.OnCallTeamRoutingRulesRuleActionSendSlackMessageArgs;
import com.pulumi.datadog.inputs.OnCallTeamRoutingRulesRuleActionSendTeamsMessageArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OnCallTeamRoutingRulesRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnCallTeamRoutingRulesRuleActionArgs Empty = new OnCallTeamRoutingRulesRuleActionArgs();

    @Import(name="sendSlackMessage")
    private @Nullable Output<OnCallTeamRoutingRulesRuleActionSendSlackMessageArgs> sendSlackMessage;

    public Optional<Output<OnCallTeamRoutingRulesRuleActionSendSlackMessageArgs>> sendSlackMessage() {
        return Optional.ofNullable(this.sendSlackMessage);
    }

    @Import(name="sendTeamsMessage")
    private @Nullable Output<OnCallTeamRoutingRulesRuleActionSendTeamsMessageArgs> sendTeamsMessage;

    public Optional<Output<OnCallTeamRoutingRulesRuleActionSendTeamsMessageArgs>> sendTeamsMessage() {
        return Optional.ofNullable(this.sendTeamsMessage);
    }

    private OnCallTeamRoutingRulesRuleActionArgs() {}

    private OnCallTeamRoutingRulesRuleActionArgs(OnCallTeamRoutingRulesRuleActionArgs $) {
        this.sendSlackMessage = $.sendSlackMessage;
        this.sendTeamsMessage = $.sendTeamsMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnCallTeamRoutingRulesRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnCallTeamRoutingRulesRuleActionArgs $;

        public Builder() {
            $ = new OnCallTeamRoutingRulesRuleActionArgs();
        }

        public Builder(OnCallTeamRoutingRulesRuleActionArgs defaults) {
            $ = new OnCallTeamRoutingRulesRuleActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder sendSlackMessage(@Nullable Output<OnCallTeamRoutingRulesRuleActionSendSlackMessageArgs> sendSlackMessage) {
            $.sendSlackMessage = sendSlackMessage;
            return this;
        }

        public Builder sendSlackMessage(OnCallTeamRoutingRulesRuleActionSendSlackMessageArgs sendSlackMessage) {
            return sendSlackMessage(Output.of(sendSlackMessage));
        }

        public Builder sendTeamsMessage(@Nullable Output<OnCallTeamRoutingRulesRuleActionSendTeamsMessageArgs> sendTeamsMessage) {
            $.sendTeamsMessage = sendTeamsMessage;
            return this;
        }

        public Builder sendTeamsMessage(OnCallTeamRoutingRulesRuleActionSendTeamsMessageArgs sendTeamsMessage) {
            return sendTeamsMessage(Output.of(sendTeamsMessage));
        }

        public OnCallTeamRoutingRulesRuleActionArgs build() {
            return $;
        }
    }

}
