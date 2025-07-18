// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class CsmThreatsAgentRuleActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Hash action configuration
        /// </summary>
        [Input("hash")]
        public Input<Inputs.CsmThreatsAgentRuleActionHashGetArgs>? Hash { get; set; }

        /// <summary>
        /// Set action configuration
        /// </summary>
        [Input("set")]
        public Input<Inputs.CsmThreatsAgentRuleActionSetGetArgs>? Set { get; set; }

        public CsmThreatsAgentRuleActionGetArgs()
        {
        }
        public static new CsmThreatsAgentRuleActionGetArgs Empty => new CsmThreatsAgentRuleActionGetArgs();
    }
}
