// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ServiceLevelObjectiveSliSpecificationTimeSliceQueryQueryMetricQueryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data source for metrics queries. Defaults to `"metrics"`.
        /// </summary>
        [Input("dataSource")]
        public Input<string>? DataSource { get; set; }

        /// <summary>
        /// The name of the query for use in formulas.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// A timeseries query, containing named data-source-specific queries and a formula involving the named queries.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        public ServiceLevelObjectiveSliSpecificationTimeSliceQueryQueryMetricQueryArgs()
        {
        }
        public static new ServiceLevelObjectiveSliSpecificationTimeSliceQueryQueryMetricQueryArgs Empty => new ServiceLevelObjectiveSliSpecificationTimeSliceQueryQueryMetricQueryArgs();
    }
}