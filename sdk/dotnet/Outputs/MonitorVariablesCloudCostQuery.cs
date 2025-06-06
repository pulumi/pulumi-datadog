// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class MonitorVariablesCloudCostQuery
    {
        /// <summary>
        /// The aggregation methods available for cloud cost queries. Valid values are `avg`, `sum`, `max`, `min`, `last`, `area`, `l2norm`, `percentile`, `stddev`.
        /// </summary>
        public readonly string? Aggregator;
        /// <summary>
        /// The data source for cloud cost queries. Valid values are `metrics`, `cloud_cost`, `datadog_usage`.
        /// </summary>
        public readonly string DataSource;
        /// <summary>
        /// The name of the query for use in formulas.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The cloud cost query definition.
        /// </summary>
        public readonly string Query;

        [OutputConstructor]
        private MonitorVariablesCloudCostQuery(
            string? aggregator,

            string dataSource,

            string name,

            string query)
        {
            Aggregator = aggregator;
            DataSource = dataSource;
            Name = name;
            Query = query;
        }
    }
}
