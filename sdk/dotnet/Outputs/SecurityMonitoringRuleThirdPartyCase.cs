// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class SecurityMonitoringRuleThirdPartyCase
    {
        /// <summary>
        /// Name of the case.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Notification targets for each rule case.
        /// </summary>
        public readonly ImmutableArray<string> Notifications;
        /// <summary>
        /// A query to associate a third-party event to this case.
        /// </summary>
        public readonly string? Query;
        /// <summary>
        /// Severity of the Security Signal. Valid values are `info`, `low`, `medium`, `high`, `critical`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private SecurityMonitoringRuleThirdPartyCase(
            string? name,

            ImmutableArray<string> notifications,

            string? query,

            string status)
        {
            Name = name;
            Notifications = notifications;
            Query = query;
            Status = status;
        }
    }
}