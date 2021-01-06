// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryGetArgs : Pulumi.ResourceArgs
    {
        [Input("compute")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryComputeGetArgs>? Compute { get; set; }

        [Input("groupBies")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryGroupByGetArgs>? _groupBies;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryGroupByGetArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryGroupByGetArgs>());
            set => _groupBies = value;
        }

        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        [Input("multiComputes")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryMultiComputeGetArgs>? _multiComputes;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryMultiComputeGetArgs> MultiComputes
        {
            get => _multiComputes ?? (_multiComputes = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryMultiComputeGetArgs>());
            set => _multiComputes = value;
        }

        [Input("search")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQuerySearchGetArgs>? Search { get; set; }

        public DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryGetArgs()
        {
        }
    }
}