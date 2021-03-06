// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetQueryTableDefinitionRequestRumQueryGetArgs : Pulumi.ResourceArgs
    {
        [Input("compute")]
        public Input<Inputs.DashboardWidgetQueryTableDefinitionRequestRumQueryComputeGetArgs>? Compute { get; set; }

        [Input("groupBies")]
        private InputList<Inputs.DashboardWidgetQueryTableDefinitionRequestRumQueryGroupByGetArgs>? _groupBies;
        public InputList<Inputs.DashboardWidgetQueryTableDefinitionRequestRumQueryGroupByGetArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.DashboardWidgetQueryTableDefinitionRequestRumQueryGroupByGetArgs>());
            set => _groupBies = value;
        }

        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        [Input("multiComputes")]
        private InputList<Inputs.DashboardWidgetQueryTableDefinitionRequestRumQueryMultiComputeGetArgs>? _multiComputes;
        public InputList<Inputs.DashboardWidgetQueryTableDefinitionRequestRumQueryMultiComputeGetArgs> MultiComputes
        {
            get => _multiComputes ?? (_multiComputes = new InputList<Inputs.DashboardWidgetQueryTableDefinitionRequestRumQueryMultiComputeGetArgs>());
            set => _multiComputes = value;
        }

        [Input("search")]
        public Input<Inputs.DashboardWidgetQueryTableDefinitionRequestRumQuerySearchGetArgs>? Search { get; set; }

        public DashboardWidgetQueryTableDefinitionRequestRumQueryGetArgs()
        {
        }
    }
}
