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
    public sealed class DashboardWidgetDistributionDefinitionRequestApmQuery
    {
        public readonly Outputs.DashboardWidgetDistributionDefinitionRequestApmQueryCompute? Compute;
        public readonly ImmutableArray<Outputs.DashboardWidgetDistributionDefinitionRequestApmQueryGroupBy> GroupBies;
        public readonly string Index;
        public readonly ImmutableArray<Outputs.DashboardWidgetDistributionDefinitionRequestApmQueryMultiCompute> MultiComputes;
        public readonly Outputs.DashboardWidgetDistributionDefinitionRequestApmQuerySearch? Search;

        [OutputConstructor]
        private DashboardWidgetDistributionDefinitionRequestApmQuery(
            Outputs.DashboardWidgetDistributionDefinitionRequestApmQueryCompute? compute,

            ImmutableArray<Outputs.DashboardWidgetDistributionDefinitionRequestApmQueryGroupBy> groupBies,

            string index,

            ImmutableArray<Outputs.DashboardWidgetDistributionDefinitionRequestApmQueryMultiCompute> multiComputes,

            Outputs.DashboardWidgetDistributionDefinitionRequestApmQuerySearch? search)
        {
            Compute = compute;
            GroupBies = groupBies;
            Index = index;
            MultiComputes = multiComputes;
            Search = search;
        }
    }
}
