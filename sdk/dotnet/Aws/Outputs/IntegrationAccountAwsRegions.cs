// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Aws.Outputs
{

    [OutputType]
    public sealed class IntegrationAccountAwsRegions
    {
        /// <summary>
        /// Include all regions. Defaults to `true`.
        /// </summary>
        public readonly bool? IncludeAll;
        /// <summary>
        /// Include only these regions.
        /// </summary>
        public readonly ImmutableArray<string> IncludeOnlies;

        [OutputConstructor]
        private IntegrationAccountAwsRegions(
            bool? includeAll,

            ImmutableArray<string> includeOnlies)
        {
            IncludeAll = includeAll;
            IncludeOnlies = includeOnlies;
        }
    }
}
