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
    public sealed class DashboardWidgetToplistDefinitionRequestSecurityQuery
    {
        public readonly Outputs.DashboardWidgetToplistDefinitionRequestSecurityQueryCompute? Compute;
        public readonly ImmutableArray<Outputs.DashboardWidgetToplistDefinitionRequestSecurityQueryGroupBy> GroupBies;
        public readonly string Index;
        public readonly ImmutableArray<Outputs.DashboardWidgetToplistDefinitionRequestSecurityQueryMultiCompute> MultiComputes;
        public readonly Outputs.DashboardWidgetToplistDefinitionRequestSecurityQuerySearch? Search;

        [OutputConstructor]
        private DashboardWidgetToplistDefinitionRequestSecurityQuery(
            Outputs.DashboardWidgetToplistDefinitionRequestSecurityQueryCompute? compute,

            ImmutableArray<Outputs.DashboardWidgetToplistDefinitionRequestSecurityQueryGroupBy> groupBies,

            string index,

            ImmutableArray<Outputs.DashboardWidgetToplistDefinitionRequestSecurityQueryMultiCompute> multiComputes,

            Outputs.DashboardWidgetToplistDefinitionRequestSecurityQuerySearch? search)
        {
            Compute = compute;
            GroupBies = groupBies;
            Index = index;
            MultiComputes = multiComputes;
            Search = search;
        }
    }
}
