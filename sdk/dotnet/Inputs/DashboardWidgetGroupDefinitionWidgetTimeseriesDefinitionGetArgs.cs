// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionGetArgs : Pulumi.ResourceArgs
    {
        [Input("customLinks")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionCustomLinkGetArgs>? _customLinks;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionCustomLinkGetArgs> CustomLinks
        {
            get => _customLinks ?? (_customLinks = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionCustomLinkGetArgs>());
            set => _customLinks = value;
        }

        [Input("events")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionEventGetArgs>? _events;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionEventGetArgs> Events
        {
            get => _events ?? (_events = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionEventGetArgs>());
            set => _events = value;
        }

        [Input("legendSize")]
        public Input<string>? LegendSize { get; set; }

        [Input("markers")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionMarkerGetArgs>? _markers;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionMarkerGetArgs> Markers
        {
            get => _markers ?? (_markers = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionMarkerGetArgs>());
            set => _markers = value;
        }

        [Input("requests")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestGetArgs>? _requests;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestGetArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestGetArgs>());
            set => _requests = value;
        }

        [Input("rightYaxis")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRightYaxisGetArgs>? RightYaxis { get; set; }

        [Input("showLegend")]
        public Input<bool>? ShowLegend { get; set; }

        [Input("time")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionTimeGetArgs>? Time { get; set; }

        [Input("title")]
        public Input<string>? Title { get; set; }

        [Input("titleAlign")]
        public Input<string>? TitleAlign { get; set; }

        [Input("titleSize")]
        public Input<string>? TitleSize { get; set; }

        [Input("yaxis")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionYaxisGetArgs>? Yaxis { get; set; }

        public DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionGetArgs()
        {
        }
    }
}
