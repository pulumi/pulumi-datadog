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
    public sealed class ActionConnectionAwsAssumeRole
    {
        /// <summary>
        /// AWS account that the connection is created for. String length must be at least 1.
        /// </summary>
        public readonly string? AccountId;
        /// <summary>
        /// External ID that specifies which connection can be used to assume the role
        /// </summary>
        public readonly string? ExternalId;
        /// <summary>
        /// AWS account that will assume the role
        /// </summary>
        public readonly string? PrincipalId;
        /// <summary>
        /// Role to assume. String length must be at least 1.
        /// </summary>
        public readonly string? Role;

        [OutputConstructor]
        private ActionConnectionAwsAssumeRole(
            string? accountId,

            string? externalId,

            string? principalId,

            string? role)
        {
            AccountId = accountId;
            ExternalId = externalId;
            PrincipalId = principalId;
            Role = role;
        }
    }
}
