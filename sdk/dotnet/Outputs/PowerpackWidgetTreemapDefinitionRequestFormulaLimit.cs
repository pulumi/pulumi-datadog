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
    public sealed class PowerpackWidgetTreemapDefinitionRequestFormulaLimit
    {
        /// <summary>
        /// The number of results to return.
        /// </summary>
        public readonly int? Count;
        /// <summary>
        /// Widget sorting methods. Valid values are `asc`, `desc`.
        /// </summary>
        public readonly string? Order;

        [OutputConstructor]
        private PowerpackWidgetTreemapDefinitionRequestFormulaLimit(
            int? count,

            string? order)
        {
            Count = count;
            Order = order;
        }
    }
}