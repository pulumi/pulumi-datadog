// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class DashboardWidgetSloListDefinitionRequestQuery
    {
        /// <summary>
        /// Maximum number of results to display in the table. Defaults to `100`.
        /// </summary>
        public readonly int? Limit;
        /// <summary>
        /// Widget query.
        /// </summary>
        public readonly string QueryString;
        /// <summary>
        /// The facet and order to sort the data, for example: `{"column": "status.sli", "order": "desc"}`.
        /// </summary>
        public readonly Outputs.DashboardWidgetSloListDefinitionRequestQuerySort? Sort;

        [OutputConstructor]
        private DashboardWidgetSloListDefinitionRequestQuery(
            int? limit,

            string queryString,

            Outputs.DashboardWidgetSloListDefinitionRequestQuerySort? sort)
        {
            Limit = limit;
            QueryString = queryString;
            Sort = sort;
        }
    }
}
