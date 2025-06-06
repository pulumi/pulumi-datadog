// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSloListDefinitionRequestQueryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum number of results to display in the table. Defaults to `100`.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// Widget query.
        /// </summary>
        [Input("queryString", required: true)]
        public Input<string> QueryString { get; set; } = null!;

        /// <summary>
        /// The facet and order to sort the data, for example: `{"column": "status.sli", "order": "desc"}`.
        /// </summary>
        [Input("sort")]
        public Input<Inputs.DashboardWidgetSloListDefinitionRequestQuerySortArgs>? Sort { get; set; }

        public DashboardWidgetSloListDefinitionRequestQueryArgs()
        {
        }
        public static new DashboardWidgetSloListDefinitionRequestQueryArgs Empty => new DashboardWidgetSloListDefinitionRequestQueryArgs();
    }
}
