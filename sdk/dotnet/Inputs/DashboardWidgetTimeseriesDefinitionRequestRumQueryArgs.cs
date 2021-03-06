// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetTimeseriesDefinitionRequestRumQueryArgs : Pulumi.ResourceArgs
    {
        [Input("compute")]
        public Input<Inputs.DashboardWidgetTimeseriesDefinitionRequestRumQueryComputeArgs>? Compute { get; set; }

        [Input("groupBies")]
        private InputList<Inputs.DashboardWidgetTimeseriesDefinitionRequestRumQueryGroupByArgs>? _groupBies;
        public InputList<Inputs.DashboardWidgetTimeseriesDefinitionRequestRumQueryGroupByArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.DashboardWidgetTimeseriesDefinitionRequestRumQueryGroupByArgs>());
            set => _groupBies = value;
        }

        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        [Input("multiComputes")]
        private InputList<Inputs.DashboardWidgetTimeseriesDefinitionRequestRumQueryMultiComputeArgs>? _multiComputes;
        public InputList<Inputs.DashboardWidgetTimeseriesDefinitionRequestRumQueryMultiComputeArgs> MultiComputes
        {
            get => _multiComputes ?? (_multiComputes = new InputList<Inputs.DashboardWidgetTimeseriesDefinitionRequestRumQueryMultiComputeArgs>());
            set => _multiComputes = value;
        }

        [Input("search")]
        public Input<Inputs.DashboardWidgetTimeseriesDefinitionRequestRumQuerySearchArgs>? Search { get; set; }

        public DashboardWidgetTimeseriesDefinitionRequestRumQueryArgs()
        {
        }
    }
}
