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
    public sealed class DashboardWidgetScatterplotDefinitionRequestY
    {
        public readonly string? Aggregator;
        public readonly Outputs.DashboardWidgetScatterplotDefinitionRequestYApmQuery? ApmQuery;
        public readonly Outputs.DashboardWidgetScatterplotDefinitionRequestYLogQuery? LogQuery;
        public readonly Outputs.DashboardWidgetScatterplotDefinitionRequestYProcessQuery? ProcessQuery;
        public readonly string? Q;

        [OutputConstructor]
        private DashboardWidgetScatterplotDefinitionRequestY(
            string? aggregator,

            Outputs.DashboardWidgetScatterplotDefinitionRequestYApmQuery? apmQuery,

            Outputs.DashboardWidgetScatterplotDefinitionRequestYLogQuery? logQuery,

            Outputs.DashboardWidgetScatterplotDefinitionRequestYProcessQuery? processQuery,

            string? q)
        {
            Aggregator = aggregator;
            ApmQuery = apmQuery;
            LogQuery = logQuery;
            ProcessQuery = processQuery;
            Q = q;
        }
    }
}