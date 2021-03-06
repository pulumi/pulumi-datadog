// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ScreenBoardWidgetTileDefArgs : Pulumi.ResourceArgs
    {
        [Input("autoscale")]
        public Input<bool>? Autoscale { get; set; }

        [Input("customUnit")]
        public Input<string>? CustomUnit { get; set; }

        [Input("events")]
        private InputList<Inputs.ScreenBoardWidgetTileDefEventArgs>? _events;
        public InputList<Inputs.ScreenBoardWidgetTileDefEventArgs> Events
        {
            get => _events ?? (_events = new InputList<Inputs.ScreenBoardWidgetTileDefEventArgs>());
            set => _events = value;
        }

        [Input("groups")]
        private InputList<string>? _groups;
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        [Input("markers")]
        private InputList<Inputs.ScreenBoardWidgetTileDefMarkerArgs>? _markers;
        public InputList<Inputs.ScreenBoardWidgetTileDefMarkerArgs> Markers
        {
            get => _markers ?? (_markers = new InputList<Inputs.ScreenBoardWidgetTileDefMarkerArgs>());
            set => _markers = value;
        }

        [Input("noGroupHosts")]
        public Input<bool>? NoGroupHosts { get; set; }

        [Input("noMetricHosts")]
        public Input<bool>? NoMetricHosts { get; set; }

        [Input("nodeType")]
        public Input<string>? NodeType { get; set; }

        [Input("precision")]
        public Input<string>? Precision { get; set; }

        [Input("requests", required: true)]
        private InputList<Inputs.ScreenBoardWidgetTileDefRequestArgs>? _requests;
        public InputList<Inputs.ScreenBoardWidgetTileDefRequestArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.ScreenBoardWidgetTileDefRequestArgs>());
            set => _requests = value;
        }

        [Input("scopes")]
        private InputList<string>? _scopes;
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        [Input("style")]
        private InputMap<object>? _style;
        public InputMap<object> Style
        {
            get => _style ?? (_style = new InputMap<object>());
            set => _style = value;
        }

        [Input("textAlign")]
        public Input<string>? TextAlign { get; set; }

        [Input("viz", required: true)]
        public Input<string> Viz { get; set; } = null!;

        public ScreenBoardWidgetTileDefArgs()
        {
        }
    }
}
