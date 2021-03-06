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
    public sealed class DashboardWidgetGroupDefinitionWidgetHostmapDefinition
    {
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionCustomLink> CustomLinks;
        public readonly ImmutableArray<string> Groups;
        public readonly bool? NoGroupHosts;
        public readonly bool? NoMetricHosts;
        public readonly string? NodeType;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequest? Request;
        public readonly ImmutableArray<string> Scopes;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionStyle? Style;
        public readonly string? Title;
        public readonly string? TitleAlign;
        public readonly string? TitleSize;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetHostmapDefinition(
            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionCustomLink> customLinks,

            ImmutableArray<string> groups,

            bool? noGroupHosts,

            bool? noMetricHosts,

            string? nodeType,

            Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequest? request,

            ImmutableArray<string> scopes,

            Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionStyle? style,

            string? title,

            string? titleAlign,

            string? titleSize)
        {
            CustomLinks = customLinks;
            Groups = groups;
            NoGroupHosts = noGroupHosts;
            NoMetricHosts = noMetricHosts;
            NodeType = nodeType;
            Request = request;
            Scopes = scopes;
            Style = style;
            Title = title;
            TitleAlign = titleAlign;
            TitleSize = titleSize;
        }
    }
}
