// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class OnCallTeamRoutingRulesRuleActionArgs : global::Pulumi.ResourceArgs
    {
        [Input("sendSlackMessage")]
        public Input<Inputs.OnCallTeamRoutingRulesRuleActionSendSlackMessageArgs>? SendSlackMessage { get; set; }

        [Input("sendTeamsMessage")]
        public Input<Inputs.OnCallTeamRoutingRulesRuleActionSendTeamsMessageArgs>? SendTeamsMessage { get; set; }

        public OnCallTeamRoutingRulesRuleActionArgs()
        {
        }
        public static new OnCallTeamRoutingRulesRuleActionArgs Empty => new OnCallTeamRoutingRulesRuleActionArgs();
    }
}
