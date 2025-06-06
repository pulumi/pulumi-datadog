// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class MonitorVariablesEventQueryArgs : global::Pulumi.ResourceArgs
    {
        [Input("computes", required: true)]
        private InputList<Inputs.MonitorVariablesEventQueryComputeArgs>? _computes;

        /// <summary>
        /// The compute options.
        /// </summary>
        public InputList<Inputs.MonitorVariablesEventQueryComputeArgs> Computes
        {
            get => _computes ?? (_computes = new InputList<Inputs.MonitorVariablesEventQueryComputeArgs>());
            set => _computes = value;
        }

        /// <summary>
        /// The data source for event platform-based queries. Valid values are `rum`, `ci_pipelines`, `ci_tests`, `audit`, `events`, `logs`, `spans`, `database_queries`, `network`.
        /// </summary>
        [Input("dataSource", required: true)]
        public Input<string> DataSource { get; set; } = null!;

        [Input("groupBies")]
        private InputList<Inputs.MonitorVariablesEventQueryGroupByArgs>? _groupBies;

        /// <summary>
        /// Group by options.
        /// </summary>
        public InputList<Inputs.MonitorVariablesEventQueryGroupByArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.MonitorVariablesEventQueryGroupByArgs>());
            set => _groupBies = value;
        }

        [Input("indexes")]
        private InputList<string>? _indexes;

        /// <summary>
        /// An array of index names to query in the stream.
        /// </summary>
        public InputList<string> Indexes
        {
            get => _indexes ?? (_indexes = new InputList<string>());
            set => _indexes = value;
        }

        /// <summary>
        /// The name of query for use in formulas.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The search options.
        /// </summary>
        [Input("search", required: true)]
        public Input<Inputs.MonitorVariablesEventQuerySearchArgs> Search { get; set; } = null!;

        public MonitorVariablesEventQueryArgs()
        {
        }
        public static new MonitorVariablesEventQueryArgs Empty => new MonitorVariablesEventQueryArgs();
    }
}
