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
    public sealed class DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestFillRumQuery
    {
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestFillRumQueryCompute? Compute;
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestFillRumQueryGroupBy> GroupBies;
        public readonly string Index;
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestFillRumQueryMultiCompute> MultiComputes;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestFillRumQuerySearch? Search;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestFillRumQuery(
            Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestFillRumQueryCompute? compute,

            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestFillRumQueryGroupBy> groupBies,

            string index,

            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestFillRumQueryMultiCompute> multiComputes,

            Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestFillRumQuerySearch? search)
        {
            Compute = compute;
            GroupBies = groupBies;
            Index = index;
            MultiComputes = multiComputes;
            Search = search;
        }
    }
}