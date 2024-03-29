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
    public sealed class PowerpackWidgetGeomapDefinitionRequestQueryEventQueryCompute
    {
        /// <summary>
        /// The aggregation method.
        /// </summary>
        public readonly string Aggregation;
        /// <summary>
        /// Define the time interval in seconds.
        /// </summary>
        public readonly int? Interval;
        /// <summary>
        /// The metric from the request to correlate with this conditional format.
        /// </summary>
        public readonly string? Metric;

        [OutputConstructor]
        private PowerpackWidgetGeomapDefinitionRequestQueryEventQueryCompute(
            string aggregation,

            int? interval,

            string? metric)
        {
            Aggregation = aggregation;
            Interval = interval;
            Metric = metric;
        }
    }
}
