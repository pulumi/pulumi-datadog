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
    public sealed class DashboardWidgetWidgetLayout
    {
        public readonly int Height;
        public readonly bool? IsColumnBreak;
        public readonly int Width;
        public readonly int X;
        public readonly int Y;

        [OutputConstructor]
        private DashboardWidgetWidgetLayout(
            int height,

            bool? isColumnBreak,

            int width,

            int x,

            int y)
        {
            Height = height;
            IsColumnBreak = isColumnBreak;
            Width = width;
            X = x;
            Y = y;
        }
    }
}