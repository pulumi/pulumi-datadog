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
    public sealed class GetMonitorConfigPoliciesMonitorConfigPolicyResult
    {
        /// <summary>
        /// ID of the monitor config policy
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The monitor config policy type
        /// </summary>
        public readonly string PolicyType;
        /// <summary>
        /// Config for a tag policy. Only set if `policy_type` is `tag`.
        /// </summary>
        public readonly Outputs.GetMonitorConfigPoliciesMonitorConfigPolicyTagPolicyResult TagPolicy;

        [OutputConstructor]
        private GetMonitorConfigPoliciesMonitorConfigPolicyResult(
            string id,

            string policyType,

            Outputs.GetMonitorConfigPoliciesMonitorConfigPolicyTagPolicyResult tagPolicy)
        {
            Id = id;
            PolicyType = policyType;
            TagPolicy = tagPolicy;
        }
    }
}
