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
    public sealed class ApmRetentionFilterFilter
    {
        /// <summary>
        /// The search query - follow the span search syntax, use `AND` between tags and `\` to escape special characters, use nanosecond for duration. Defaults to `"*"`.
        /// </summary>
        public readonly string? Query;

        [OutputConstructor]
        private ApmRetentionFilterFilter(string? query)
        {
            Query = query;
        }
    }
}