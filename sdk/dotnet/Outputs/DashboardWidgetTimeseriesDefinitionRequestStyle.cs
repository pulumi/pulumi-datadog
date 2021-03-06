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
    public sealed class DashboardWidgetTimeseriesDefinitionRequestStyle
    {
        public readonly string? LineType;
        public readonly string? LineWidth;
        public readonly string? Palette;

        [OutputConstructor]
        private DashboardWidgetTimeseriesDefinitionRequestStyle(
            string? lineType,

            string? lineWidth,

            string? palette)
        {
            LineType = lineType;
            LineWidth = lineWidth;
            Palette = palette;
        }
    }
}
