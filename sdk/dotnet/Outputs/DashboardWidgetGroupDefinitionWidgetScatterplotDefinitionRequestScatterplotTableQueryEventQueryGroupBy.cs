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
    public sealed class DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryGroupBy
    {
        public readonly string Facet;
        public readonly int? Limit;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryGroupBySort? Sort;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryGroupBy(
            string facet,

            int? limit,

            Outputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryGroupBySort? sort)
        {
            Facet = facet;
            Limit = limit;
            Sort = sort;
        }
    }
}