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
    public sealed class DashboardWidgetGeomapDefinitionRequestLogQuery
    {
        public readonly Outputs.DashboardWidgetGeomapDefinitionRequestLogQueryCompute? Compute;
        public readonly Outputs.DashboardWidgetGeomapDefinitionRequestLogQueryComputeQuery? ComputeQuery;
        public readonly ImmutableArray<Outputs.DashboardWidgetGeomapDefinitionRequestLogQueryGroupBy> GroupBies;
        public readonly string Index;
        public readonly ImmutableArray<Outputs.DashboardWidgetGeomapDefinitionRequestLogQueryMultiCompute> MultiComputes;
        public readonly Outputs.DashboardWidgetGeomapDefinitionRequestLogQuerySearch? Search;
        public readonly string? SearchQuery;

        [OutputConstructor]
        private DashboardWidgetGeomapDefinitionRequestLogQuery(
            Outputs.DashboardWidgetGeomapDefinitionRequestLogQueryCompute? compute,

            Outputs.DashboardWidgetGeomapDefinitionRequestLogQueryComputeQuery? computeQuery,

            ImmutableArray<Outputs.DashboardWidgetGeomapDefinitionRequestLogQueryGroupBy> groupBies,

            string index,

            ImmutableArray<Outputs.DashboardWidgetGeomapDefinitionRequestLogQueryMultiCompute> multiComputes,

            Outputs.DashboardWidgetGeomapDefinitionRequestLogQuerySearch? search,

            string? searchQuery)
        {
            Compute = compute;
            ComputeQuery = computeQuery;
            GroupBies = groupBies;
            Index = index;
            MultiComputes = multiComputes;
            Search = search;
            SearchQuery = searchQuery;
        }
    }
}