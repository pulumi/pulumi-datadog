// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class MonitorVariablesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("cloudCostQueries")]
        private InputList<Inputs.MonitorVariablesCloudCostQueryGetArgs>? _cloudCostQueries;

        /// <summary>
        /// The Cloud Cost query using formulas and functions.
        /// </summary>
        public InputList<Inputs.MonitorVariablesCloudCostQueryGetArgs> CloudCostQueries
        {
            get => _cloudCostQueries ?? (_cloudCostQueries = new InputList<Inputs.MonitorVariablesCloudCostQueryGetArgs>());
            set => _cloudCostQueries = value;
        }

        [Input("eventQueries")]
        private InputList<Inputs.MonitorVariablesEventQueryGetArgs>? _eventQueries;

        /// <summary>
        /// A timeseries formula and functions events query.
        /// </summary>
        public InputList<Inputs.MonitorVariablesEventQueryGetArgs> EventQueries
        {
            get => _eventQueries ?? (_eventQueries = new InputList<Inputs.MonitorVariablesEventQueryGetArgs>());
            set => _eventQueries = value;
        }

        public MonitorVariablesGetArgs()
        {
        }
        public static new MonitorVariablesGetArgs Empty => new MonitorVariablesGetArgs();
    }
}
