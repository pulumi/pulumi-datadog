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
    public sealed class GetSecurityMonitoringFiltersFilterResult
    {
        public readonly ImmutableArray<Outputs.GetSecurityMonitoringFiltersFilterExclusionFilterResult> ExclusionFilters;
        public readonly string? FilteredDataType;
        public readonly bool IsEnabled;
        public readonly string Name;
        public readonly string Query;
        public readonly int Version;

        [OutputConstructor]
        private GetSecurityMonitoringFiltersFilterResult(
            ImmutableArray<Outputs.GetSecurityMonitoringFiltersFilterExclusionFilterResult> exclusionFilters,

            string? filteredDataType,

            bool isEnabled,

            string name,

            string query,

            int version)
        {
            ExclusionFilters = exclusionFilters;
            FilteredDataType = filteredDataType;
            IsEnabled = isEnabled;
            Name = name;
            Query = query;
            Version = version;
        }
    }
}