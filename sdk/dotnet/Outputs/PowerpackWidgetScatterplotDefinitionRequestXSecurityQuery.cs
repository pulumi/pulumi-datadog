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
    public sealed class PowerpackWidgetScatterplotDefinitionRequestXSecurityQuery
    {
        /// <summary>
        /// `compute_query` or `multi_compute` is required. The map keys are listed below.
        /// </summary>
        public readonly Outputs.PowerpackWidgetScatterplotDefinitionRequestXSecurityQueryComputeQuery? ComputeQuery;
        /// <summary>
        /// Multiple `group_by` blocks are allowed using the structure below.
        /// </summary>
        public readonly ImmutableArray<Outputs.PowerpackWidgetScatterplotDefinitionRequestXSecurityQueryGroupBy> GroupBies;
        /// <summary>
        /// The name of the index to query.
        /// </summary>
        public readonly string Index;
        /// <summary>
        /// `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
        /// </summary>
        public readonly ImmutableArray<Outputs.PowerpackWidgetScatterplotDefinitionRequestXSecurityQueryMultiCompute> MultiComputes;
        /// <summary>
        /// The search query to use.
        /// </summary>
        public readonly string? SearchQuery;

        [OutputConstructor]
        private PowerpackWidgetScatterplotDefinitionRequestXSecurityQuery(
            Outputs.PowerpackWidgetScatterplotDefinitionRequestXSecurityQueryComputeQuery? computeQuery,

            ImmutableArray<Outputs.PowerpackWidgetScatterplotDefinitionRequestXSecurityQueryGroupBy> groupBies,

            string index,

            ImmutableArray<Outputs.PowerpackWidgetScatterplotDefinitionRequestXSecurityQueryMultiCompute> multiComputes,

            string? searchQuery)
        {
            ComputeQuery = computeQuery;
            GroupBies = groupBies;
            Index = index;
            MultiComputes = multiComputes;
            SearchQuery = searchQuery;
        }
    }
}
