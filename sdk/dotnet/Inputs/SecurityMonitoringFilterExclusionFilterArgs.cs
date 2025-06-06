// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SecurityMonitoringFilterExclusionFilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Exclusion filter name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Exclusion filter query. Logs that match this query are excluded from the security filter.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        public SecurityMonitoringFilterExclusionFilterArgs()
        {
        }
        public static new SecurityMonitoringFilterExclusionFilterArgs Empty => new SecurityMonitoringFilterExclusionFilterArgs();
    }
}
