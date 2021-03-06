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
    public sealed class DashboardWidgetScatterplotDefinitionXaxis
    {
        public readonly bool? IncludeZero;
        public readonly string? Label;
        public readonly string? Max;
        public readonly string? Min;
        public readonly string? Scale;

        [OutputConstructor]
        private DashboardWidgetScatterplotDefinitionXaxis(
            bool? includeZero,

            string? label,

            string? max,

            string? min,

            string? scale)
        {
            IncludeZero = includeZero;
            Label = label;
            Max = max;
            Min = min;
            Scale = scale;
        }
    }
}
