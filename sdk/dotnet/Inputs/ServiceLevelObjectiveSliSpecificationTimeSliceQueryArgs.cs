// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ServiceLevelObjectiveSliSpecificationTimeSliceQueryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A list that contains exactly one formula, as only a single formula may be used to define a timeseries query for a time-slice SLO.
        /// </summary>
        [Input("formula", required: true)]
        public Input<Inputs.ServiceLevelObjectiveSliSpecificationTimeSliceQueryFormulaArgs> Formula { get; set; } = null!;

        [Input("queries", required: true)]
        private InputList<Inputs.ServiceLevelObjectiveSliSpecificationTimeSliceQueryQueryArgs>? _queries;

        /// <summary>
        /// A list of data-source-specific queries that are in the formula.
        /// </summary>
        public InputList<Inputs.ServiceLevelObjectiveSliSpecificationTimeSliceQueryQueryArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.ServiceLevelObjectiveSliSpecificationTimeSliceQueryQueryArgs>());
            set => _queries = value;
        }

        public ServiceLevelObjectiveSliSpecificationTimeSliceQueryArgs()
        {
        }
        public static new ServiceLevelObjectiveSliSpecificationTimeSliceQueryArgs Empty => new ServiceLevelObjectiveSliSpecificationTimeSliceQueryArgs();
    }
}
