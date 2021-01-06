// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs : Pulumi.ResourceArgs
    {
        [Input("compute")]
        public Input<Inputs.DashboardWidgetDistributionDefinitionRequestSecurityQueryComputeArgs>? Compute { get; set; }

        [Input("groupBies")]
        private InputList<Inputs.DashboardWidgetDistributionDefinitionRequestSecurityQueryGroupByArgs>? _groupBies;
        public InputList<Inputs.DashboardWidgetDistributionDefinitionRequestSecurityQueryGroupByArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.DashboardWidgetDistributionDefinitionRequestSecurityQueryGroupByArgs>());
            set => _groupBies = value;
        }

        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        [Input("multiComputes")]
        private InputList<Inputs.DashboardWidgetDistributionDefinitionRequestSecurityQueryMultiComputeArgs>? _multiComputes;
        public InputList<Inputs.DashboardWidgetDistributionDefinitionRequestSecurityQueryMultiComputeArgs> MultiComputes
        {
            get => _multiComputes ?? (_multiComputes = new InputList<Inputs.DashboardWidgetDistributionDefinitionRequestSecurityQueryMultiComputeArgs>());
            set => _multiComputes = value;
        }

        [Input("search")]
        public Input<Inputs.DashboardWidgetDistributionDefinitionRequestSecurityQuerySearchArgs>? Search { get; set; }

        public DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs()
        {
        }
    }
}