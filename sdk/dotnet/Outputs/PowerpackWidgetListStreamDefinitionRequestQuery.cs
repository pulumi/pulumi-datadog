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
    public sealed class PowerpackWidgetListStreamDefinitionRequestQuery
    {
        /// <summary>
        /// The data source for APM Dependency Stats queries. Valid values are `apm_dependency_stats`.
        /// </summary>
        public readonly string DataSource;
        /// <summary>
        /// The size to use to display an event. Valid values are `s`, `l`.
        /// </summary>
        public readonly string? EventSize;
        /// <summary>
        /// An array of index names to query in the stream.
        /// </summary>
        public readonly ImmutableArray<string> Indexes;
        /// <summary>
        /// Widget query.
        /// </summary>
        public readonly string? QueryString;
        /// <summary>
        /// The options for sorting group by results.
        /// </summary>
        public readonly Outputs.PowerpackWidgetListStreamDefinitionRequestQuerySort? Sort;
        /// <summary>
        /// Storage location (private beta).
        /// </summary>
        public readonly string? Storage;

        [OutputConstructor]
        private PowerpackWidgetListStreamDefinitionRequestQuery(
            string dataSource,

            string? eventSize,

            ImmutableArray<string> indexes,

            string? queryString,

            Outputs.PowerpackWidgetListStreamDefinitionRequestQuerySort? sort,

            string? storage)
        {
            DataSource = dataSource;
            EventSize = eventSize;
            Indexes = indexes;
            QueryString = queryString;
            Sort = sort;
            Storage = storage;
        }
    }
}