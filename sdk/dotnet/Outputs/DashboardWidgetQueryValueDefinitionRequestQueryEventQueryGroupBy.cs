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
    public sealed class DashboardWidgetQueryValueDefinitionRequestQueryEventQueryGroupBy
    {
        /// <summary>
        /// The event facet.
        /// </summary>
        public readonly string Facet;
        /// <summary>
        /// The number of groups to return.
        /// </summary>
        public readonly int? Limit;
        /// <summary>
        /// The options for sorting group by results.
        /// </summary>
        public readonly Outputs.DashboardWidgetQueryValueDefinitionRequestQueryEventQueryGroupBySort? Sort;

        [OutputConstructor]
        private DashboardWidgetQueryValueDefinitionRequestQueryEventQueryGroupBy(
            string facet,

            int? limit,

            Outputs.DashboardWidgetQueryValueDefinitionRequestQueryEventQueryGroupBySort? sort)
        {
            Facet = facet;
            Limit = limit;
            Sort = sort;
        }
    }
}