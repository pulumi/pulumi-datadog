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
    public sealed class DashboardWidgetDistributionDefinitionRequestApmQueryGroupBy
    {
        public readonly string? Facet;
        public readonly int? Limit;
        public readonly Outputs.DashboardWidgetDistributionDefinitionRequestApmQueryGroupBySort? Sort;

        [OutputConstructor]
        private DashboardWidgetDistributionDefinitionRequestApmQueryGroupBy(
            string? facet,

            int? limit,

            Outputs.DashboardWidgetDistributionDefinitionRequestApmQueryGroupBySort? sort)
        {
            Facet = facet;
            Limit = limit;
            Sort = sort;
        }
    }
}
