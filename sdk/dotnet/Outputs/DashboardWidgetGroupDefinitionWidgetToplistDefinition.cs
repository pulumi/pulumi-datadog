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
    public sealed class DashboardWidgetGroupDefinitionWidgetToplistDefinition
    {
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionCustomLink> CustomLinks;
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest> Requests;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionTime? Time;
        public readonly string? Title;
        public readonly string? TitleAlign;
        public readonly string? TitleSize;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetToplistDefinition(
            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionCustomLink> customLinks,

            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest> requests,

            Outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionTime? time,

            string? title,

            string? titleAlign,

            string? titleSize)
        {
            CustomLinks = customLinks;
            Requests = requests;
            Time = time;
            Title = title;
            TitleAlign = titleAlign;
            TitleSize = titleSize;
        }
    }
}
