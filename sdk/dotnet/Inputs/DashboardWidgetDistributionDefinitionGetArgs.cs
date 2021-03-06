// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetDistributionDefinitionGetArgs : Pulumi.ResourceArgs
    {
        [Input("legendSize")]
        public Input<string>? LegendSize { get; set; }

        [Input("requests")]
        private InputList<Inputs.DashboardWidgetDistributionDefinitionRequestGetArgs>? _requests;
        public InputList<Inputs.DashboardWidgetDistributionDefinitionRequestGetArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.DashboardWidgetDistributionDefinitionRequestGetArgs>());
            set => _requests = value;
        }

        [Input("showLegend")]
        public Input<bool>? ShowLegend { get; set; }

        [Input("time")]
        public Input<Inputs.DashboardWidgetDistributionDefinitionTimeGetArgs>? Time { get; set; }

        [Input("title")]
        public Input<string>? Title { get; set; }

        [Input("titleAlign")]
        public Input<string>? TitleAlign { get; set; }

        [Input("titleSize")]
        public Input<string>? TitleSize { get; set; }

        public DashboardWidgetDistributionDefinitionGetArgs()
        {
        }
    }
}
