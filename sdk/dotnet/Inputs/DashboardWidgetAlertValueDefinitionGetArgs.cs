// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetAlertValueDefinitionGetArgs : Pulumi.ResourceArgs
    {
        [Input("alertId", required: true)]
        public Input<string> AlertId { get; set; } = null!;

        [Input("precision")]
        public Input<int>? Precision { get; set; }

        [Input("textAlign")]
        public Input<string>? TextAlign { get; set; }

        [Input("title")]
        public Input<string>? Title { get; set; }

        [Input("titleAlign")]
        public Input<string>? TitleAlign { get; set; }

        [Input("titleSize")]
        public Input<string>? TitleSize { get; set; }

        [Input("unit")]
        public Input<string>? Unit { get; set; }

        public DashboardWidgetAlertValueDefinitionGetArgs()
        {
        }
    }
}
