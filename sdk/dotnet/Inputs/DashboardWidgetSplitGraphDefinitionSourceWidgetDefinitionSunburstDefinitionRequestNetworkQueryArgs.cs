// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `compute_query` or `multi_compute` is required. The map keys are listed below.
        /// </summary>
        [Input("computeQuery")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryComputeQueryArgs>? ComputeQuery { get; set; }

        [Input("groupBies")]
        private InputList<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupByArgs>? _groupBies;

        /// <summary>
        /// Multiple `group_by` blocks are allowed using the structure below.
        /// </summary>
        public InputList<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupByArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryGroupByArgs>());
            set => _groupBies = value;
        }

        /// <summary>
        /// The name of the index to query.
        /// </summary>
        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        [Input("multiComputes")]
        private InputList<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryMultiComputeArgs>? _multiComputes;

        /// <summary>
        /// `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
        /// </summary>
        public InputList<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryMultiComputeArgs> MultiComputes
        {
            get => _multiComputes ?? (_multiComputes = new InputList<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryMultiComputeArgs>());
            set => _multiComputes = value;
        }

        /// <summary>
        /// The search query to use.
        /// </summary>
        [Input("searchQuery")]
        public Input<string>? SearchQuery { get; set; }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryArgs()
        {
        }
        public static new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryArgs Empty => new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestNetworkQueryArgs();
    }
}