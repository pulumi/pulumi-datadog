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
    public sealed class PowerpackWidgetSloListDefinitionRequestQuery
    {
        /// <summary>
        /// The maximum number of items in the group.
        /// </summary>
        public readonly int? Limit;
        /// <summary>
        /// Widget query.
        /// </summary>
        public readonly string QueryString;
        /// <summary>
        /// The options for sorting group by results.
        /// </summary>
        public readonly Outputs.PowerpackWidgetSloListDefinitionRequestQuerySort? Sort;

        [OutputConstructor]
        private PowerpackWidgetSloListDefinitionRequestQuery(
            int? limit,

            string queryString,

            Outputs.PowerpackWidgetSloListDefinitionRequestQuerySort? sort)
        {
            Limit = limit;
            QueryString = queryString;
            Sort = sort;
        }
    }
}