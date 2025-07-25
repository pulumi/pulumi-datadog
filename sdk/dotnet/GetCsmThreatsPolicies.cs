// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetCsmThreatsPolicies
    {
        /// <summary>
        /// Use this data source to retrieve information about existing policies.
        /// </summary>
        public static Task<GetCsmThreatsPoliciesResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCsmThreatsPoliciesResult>("datadog:index/getCsmThreatsPolicies:getCsmThreatsPolicies", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about existing policies.
        /// </summary>
        public static Output<GetCsmThreatsPoliciesResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCsmThreatsPoliciesResult>("datadog:index/getCsmThreatsPolicies:getCsmThreatsPolicies", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about existing policies.
        /// </summary>
        public static Output<GetCsmThreatsPoliciesResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCsmThreatsPoliciesResult>("datadog:index/getCsmThreatsPolicies:getCsmThreatsPolicies", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetCsmThreatsPoliciesResult
    {
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of policies
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCsmThreatsPoliciesPolicyResult> Policies;
        /// <summary>
        /// List of IDs for the policies.
        /// </summary>
        public readonly ImmutableArray<string> PolicyIds;

        [OutputConstructor]
        private GetCsmThreatsPoliciesResult(
            string id,

            ImmutableArray<Outputs.GetCsmThreatsPoliciesPolicyResult> policies,

            ImmutableArray<string> policyIds)
        {
            Id = id;
            Policies = policies;
            PolicyIds = policyIds;
        }
    }
}
