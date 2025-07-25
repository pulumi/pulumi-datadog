// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class ObservabilityPipelineConfigProcessorsParseGrokRuleSupportRule
    {
        /// <summary>
        /// The name of the helper Grok rule.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The definition of the helper Grok rule.
        /// </summary>
        public readonly string Rule;

        [OutputConstructor]
        private ObservabilityPipelineConfigProcessorsParseGrokRuleSupportRule(
            string name,

            string rule)
        {
            Name = name;
            Rule = rule;
        }
    }
}
