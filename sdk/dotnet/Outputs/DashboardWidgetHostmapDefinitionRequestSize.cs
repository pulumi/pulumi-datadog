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
    public sealed class DashboardWidgetHostmapDefinitionRequestSize
    {
        public readonly Outputs.DashboardWidgetHostmapDefinitionRequestSizeApmQuery? ApmQuery;
        public readonly Outputs.DashboardWidgetHostmapDefinitionRequestSizeLogQuery? LogQuery;
        public readonly Outputs.DashboardWidgetHostmapDefinitionRequestSizeProcessQuery? ProcessQuery;
        public readonly string? Q;
        public readonly Outputs.DashboardWidgetHostmapDefinitionRequestSizeRumQuery? RumQuery;
        public readonly Outputs.DashboardWidgetHostmapDefinitionRequestSizeSecurityQuery? SecurityQuery;

        [OutputConstructor]
        private DashboardWidgetHostmapDefinitionRequestSize(
            Outputs.DashboardWidgetHostmapDefinitionRequestSizeApmQuery? apmQuery,

            Outputs.DashboardWidgetHostmapDefinitionRequestSizeLogQuery? logQuery,

            Outputs.DashboardWidgetHostmapDefinitionRequestSizeProcessQuery? processQuery,

            string? q,

            Outputs.DashboardWidgetHostmapDefinitionRequestSizeRumQuery? rumQuery,

            Outputs.DashboardWidgetHostmapDefinitionRequestSizeSecurityQuery? securityQuery)
        {
            ApmQuery = apmQuery;
            LogQuery = logQuery;
            ProcessQuery = processQuery;
            Q = q;
            RumQuery = rumQuery;
            SecurityQuery = securityQuery;
        }
    }
}
