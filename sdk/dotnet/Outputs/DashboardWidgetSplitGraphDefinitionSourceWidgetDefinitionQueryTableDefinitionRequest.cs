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
    public sealed class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequest
    {
        /// <summary>
        /// The aggregation methods available for cloud cost queries. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
        /// </summary>
        public readonly string? Aggregator;
        /// <summary>
        /// An expression alias.
        /// </summary>
        public readonly string? Alias;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmQuery? ApmQuery;
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQuery? ApmStatsQuery;
        /// <summary>
        /// A list of display modes for each table cell. Valid values are `number`, `bar`.
        /// </summary>
        public readonly ImmutableArray<string> CellDisplayModes;
        /// <summary>
        /// Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
        /// </summary>
        public readonly ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestConditionalFormat> ConditionalFormats;
        public readonly ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestFormula> Formulas;
        /// <summary>
        /// The maximum number of items in the group.
        /// </summary>
        public readonly int? Limit;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestLogQuery? LogQuery;
        /// <summary>
        /// Widget sorting methods. Valid values are `asc`, `desc`.
        /// </summary>
        public readonly string? Order;
        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestProcessQuery? ProcessQuery;
        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        public readonly string? Q;
        public readonly ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestQuery> Queries;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestRumQuery? RumQuery;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestSecurityQuery? SecurityQuery;

        [OutputConstructor]
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequest(
            string? aggregator,

            string? alias,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmQuery? apmQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQuery? apmStatsQuery,

            ImmutableArray<string> cellDisplayModes,

            ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestConditionalFormat> conditionalFormats,

            ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestFormula> formulas,

            int? limit,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestLogQuery? logQuery,

            string? order,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestProcessQuery? processQuery,

            string? q,

            ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestQuery> queries,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestRumQuery? rumQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestSecurityQuery? securityQuery)
        {
            Aggregator = aggregator;
            Alias = alias;
            ApmQuery = apmQuery;
            ApmStatsQuery = apmStatsQuery;
            CellDisplayModes = cellDisplayModes;
            ConditionalFormats = conditionalFormats;
            Formulas = formulas;
            Limit = limit;
            LogQuery = logQuery;
            Order = order;
            ProcessQuery = processQuery;
            Q = q;
            Queries = queries;
            RumQuery = rumQuery;
            SecurityQuery = securityQuery;
        }
    }
}