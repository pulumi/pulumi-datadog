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
    public sealed class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequest
    {
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestApmQuery? ApmQuery;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestAuditQuery? AuditQuery;
        /// <summary>
        /// Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
        /// </summary>
        public readonly ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestConditionalFormat> ConditionalFormats;
        public readonly ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormula> Formulas;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestLogQuery? LogQuery;
        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestProcessQuery? ProcessQuery;
        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        public readonly string? Q;
        public readonly ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQuery> Queries;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestRumQuery? RumQuery;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestSecurityQuery? SecurityQuery;
        /// <summary>
        /// Styling options for widget formulas.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestStyle? Style;

        [OutputConstructor]
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequest(
            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestApmQuery? apmQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestAuditQuery? auditQuery,

            ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestConditionalFormat> conditionalFormats,

            ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormula> formulas,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestLogQuery? logQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestProcessQuery? processQuery,

            string? q,

            ImmutableArray<Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQuery> queries,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestRumQuery? rumQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestSecurityQuery? securityQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestStyle? style)
        {
            ApmQuery = apmQuery;
            AuditQuery = auditQuery;
            ConditionalFormats = conditionalFormats;
            Formulas = formulas;
            LogQuery = logQuery;
            ProcessQuery = processQuery;
            Q = q;
            Queries = queries;
            RumQuery = rumQuery;
            SecurityQuery = securityQuery;
            Style = style;
        }
    }
}