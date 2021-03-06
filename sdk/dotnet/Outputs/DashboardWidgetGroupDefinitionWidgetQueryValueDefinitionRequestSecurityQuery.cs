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
    public sealed class DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQuery
    {
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryCompute? Compute;
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBy> GroupBies;
        public readonly string Index;
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryMultiCompute> MultiComputes;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQuerySearch? Search;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQuery(
            Outputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryCompute? compute,

            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryGroupBy> groupBies,

            string index,

            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQueryMultiCompute> multiComputes,

            Outputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestSecurityQuerySearch? search)
        {
            Compute = compute;
            GroupBies = groupBies;
            Index = index;
            MultiComputes = multiComputes;
            Search = search;
        }
    }
}
