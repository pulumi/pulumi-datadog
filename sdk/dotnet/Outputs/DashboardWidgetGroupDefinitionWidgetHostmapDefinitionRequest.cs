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
    public sealed class DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequest
    {
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestFill> Fills;
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestSize> Sizes;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequest(
            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestFill> fills,

            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestSize> sizes)
        {
            Fills = fills;
            Sizes = sizes;
        }
    }
}
