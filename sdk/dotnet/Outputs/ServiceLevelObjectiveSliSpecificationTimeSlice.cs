// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class ServiceLevelObjectiveSliSpecificationTimeSlice
    {
        /// <summary>
        /// The comparator used to compare the SLI value to the threshold. Valid values are `&gt;`, `&gt;=`, `&lt;`, `&lt;=`.
        /// </summary>
        public readonly string Comparator;
        /// <summary>
        /// A timeseries query, containing named data-source-specific queries and a formula involving the named queries.
        /// </summary>
        public readonly Outputs.ServiceLevelObjectiveSliSpecificationTimeSliceQuery Query;
        /// <summary>
        /// The interval used when querying data, which defines the size of a time slice. Valid values are `60`, `300`. Defaults to `300`.
        /// </summary>
        public readonly int? QueryIntervalSeconds;
        /// <summary>
        /// The threshold value to which each SLI value will be compared.
        /// </summary>
        public readonly double Threshold;

        [OutputConstructor]
        private ServiceLevelObjectiveSliSpecificationTimeSlice(
            string comparator,

            Outputs.ServiceLevelObjectiveSliSpecificationTimeSliceQuery query,

            int? queryIntervalSeconds,

            double threshold)
        {
            Comparator = comparator;
            Query = query;
            QueryIntervalSeconds = queryIntervalSeconds;
            Threshold = threshold;
        }
    }
}