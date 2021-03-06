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
    public sealed class DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestRumQuery
    {
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestRumQueryCompute? Compute;
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestRumQueryGroupBy> GroupBies;
        public readonly string Index;
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestRumQueryMultiCompute> MultiComputes;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestRumQuerySearch? Search;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestRumQuery(
            Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestRumQueryCompute? compute,

            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestRumQueryGroupBy> groupBies,

            string index,

            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestRumQueryMultiCompute> multiComputes,

            Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestRumQuerySearch? search)
        {
            Compute = compute;
            GroupBies = groupBies;
            Index = index;
            MultiComputes = multiComputes;
            Search = search;
        }
    }
}
