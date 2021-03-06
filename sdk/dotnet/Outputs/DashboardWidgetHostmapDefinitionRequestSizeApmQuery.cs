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
    public sealed class DashboardWidgetHostmapDefinitionRequestSizeApmQuery
    {
        public readonly Outputs.DashboardWidgetHostmapDefinitionRequestSizeApmQueryCompute? Compute;
        public readonly ImmutableArray<Outputs.DashboardWidgetHostmapDefinitionRequestSizeApmQueryGroupBy> GroupBies;
        public readonly string Index;
        public readonly ImmutableArray<Outputs.DashboardWidgetHostmapDefinitionRequestSizeApmQueryMultiCompute> MultiComputes;
        public readonly Outputs.DashboardWidgetHostmapDefinitionRequestSizeApmQuerySearch? Search;

        [OutputConstructor]
        private DashboardWidgetHostmapDefinitionRequestSizeApmQuery(
            Outputs.DashboardWidgetHostmapDefinitionRequestSizeApmQueryCompute? compute,

            ImmutableArray<Outputs.DashboardWidgetHostmapDefinitionRequestSizeApmQueryGroupBy> groupBies,

            string index,

            ImmutableArray<Outputs.DashboardWidgetHostmapDefinitionRequestSizeApmQueryMultiCompute> multiComputes,

            Outputs.DashboardWidgetHostmapDefinitionRequestSizeApmQuerySearch? search)
        {
            Compute = compute;
            GroupBies = groupBies;
            Index = index;
            MultiComputes = multiComputes;
            Search = search;
        }
    }
}
