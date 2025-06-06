// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetTimeseriesDefinitionRequestSecurityQueryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `compute_query` or `multi_compute` is required. The map keys are listed below.
        /// </summary>
        [Input("computeQuery")]
        public Input<Inputs.PowerpackWidgetTimeseriesDefinitionRequestSecurityQueryComputeQueryGetArgs>? ComputeQuery { get; set; }

        [Input("groupBies")]
        private InputList<Inputs.PowerpackWidgetTimeseriesDefinitionRequestSecurityQueryGroupByGetArgs>? _groupBies;

        /// <summary>
        /// Multiple `group_by` blocks are allowed using the structure below.
        /// </summary>
        public InputList<Inputs.PowerpackWidgetTimeseriesDefinitionRequestSecurityQueryGroupByGetArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.PowerpackWidgetTimeseriesDefinitionRequestSecurityQueryGroupByGetArgs>());
            set => _groupBies = value;
        }

        /// <summary>
        /// The name of the index to query.
        /// </summary>
        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        [Input("multiComputes")]
        private InputList<Inputs.PowerpackWidgetTimeseriesDefinitionRequestSecurityQueryMultiComputeGetArgs>? _multiComputes;

        /// <summary>
        /// `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
        /// </summary>
        public InputList<Inputs.PowerpackWidgetTimeseriesDefinitionRequestSecurityQueryMultiComputeGetArgs> MultiComputes
        {
            get => _multiComputes ?? (_multiComputes = new InputList<Inputs.PowerpackWidgetTimeseriesDefinitionRequestSecurityQueryMultiComputeGetArgs>());
            set => _multiComputes = value;
        }

        /// <summary>
        /// The search query to use.
        /// </summary>
        [Input("searchQuery")]
        public Input<string>? SearchQuery { get; set; }

        public PowerpackWidgetTimeseriesDefinitionRequestSecurityQueryGetArgs()
        {
        }
        public static new PowerpackWidgetTimeseriesDefinitionRequestSecurityQueryGetArgs Empty => new PowerpackWidgetTimeseriesDefinitionRequestSecurityQueryGetArgs();
    }
}
