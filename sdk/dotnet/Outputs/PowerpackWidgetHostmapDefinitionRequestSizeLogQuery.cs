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
    public sealed class PowerpackWidgetHostmapDefinitionRequestSizeLogQuery
    {
        /// <summary>
        /// `compute_query` or `multi_compute` is required. The map keys are listed below.
        /// </summary>
        public readonly Outputs.PowerpackWidgetHostmapDefinitionRequestSizeLogQueryComputeQuery? ComputeQuery;
        /// <summary>
        /// Multiple `group_by` blocks are allowed using the structure below.
        /// </summary>
        public readonly ImmutableArray<Outputs.PowerpackWidgetHostmapDefinitionRequestSizeLogQueryGroupBy> GroupBies;
        /// <summary>
        /// The name of the index to query.
        /// </summary>
        public readonly string Index;
        /// <summary>
        /// `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
        /// </summary>
        public readonly ImmutableArray<Outputs.PowerpackWidgetHostmapDefinitionRequestSizeLogQueryMultiCompute> MultiComputes;
        /// <summary>
        /// The search query to use.
        /// </summary>
        public readonly string? SearchQuery;

        [OutputConstructor]
        private PowerpackWidgetHostmapDefinitionRequestSizeLogQuery(
            Outputs.PowerpackWidgetHostmapDefinitionRequestSizeLogQueryComputeQuery? computeQuery,

            ImmutableArray<Outputs.PowerpackWidgetHostmapDefinitionRequestSizeLogQueryGroupBy> groupBies,

            string index,

            ImmutableArray<Outputs.PowerpackWidgetHostmapDefinitionRequestSizeLogQueryMultiCompute> multiComputes,

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
