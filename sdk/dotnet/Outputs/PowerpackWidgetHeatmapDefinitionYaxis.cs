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
    public sealed class PowerpackWidgetHeatmapDefinitionYaxis
    {
        /// <summary>
        /// Always include zero or fit the axis to the data range.
        /// </summary>
        public readonly bool? IncludeZero;
        /// <summary>
        /// The label for the custom link URL.
        /// </summary>
        public readonly string? Label;
        /// <summary>
        /// Specify the maximum value to show on the Y-axis.
        /// </summary>
        public readonly string? Max;
        /// <summary>
        /// Specify the minimum value to show on the Y-axis.
        /// </summary>
        public readonly string? Min;
        /// <summary>
        /// Specify the scale type, options: `linear`, `log`, `pow`, `sqrt`.
        /// </summary>
        public readonly string? Scale;

        [OutputConstructor]
        private PowerpackWidgetHeatmapDefinitionYaxis(
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