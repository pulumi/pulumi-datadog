// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionGetArgs : Pulumi.ResourceArgs
    {
        [Input("customLinks")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionCustomLinkGetArgs>? _customLinks;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionCustomLinkGetArgs> CustomLinks
        {
            get => _customLinks ?? (_customLinks = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionCustomLinkGetArgs>());
            set => _customLinks = value;
        }

        [Input("requests")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestGetArgs>? _requests;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestGetArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestGetArgs>());
            set => _requests = value;
        }

        [Input("title")]
        public Input<string>? Title { get; set; }

        [Input("titleAlign")]
        public Input<string>? TitleAlign { get; set; }

        [Input("titleSize")]
        public Input<string>? TitleSize { get; set; }

        public DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionGetArgs()
        {
        }
    }
}