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
    public sealed class PowerpackWidgetTopologyMapDefinitionRequest
    {
        /// <summary>
        /// The query for a Topology request.
        /// </summary>
        public readonly ImmutableArray<Outputs.PowerpackWidgetTopologyMapDefinitionRequestQuery> Queries;
        /// <summary>
        /// The request type for the Topology request ('topology'). Valid values are `topology`.
        /// </summary>
        public readonly string RequestType;

        [OutputConstructor]
        private PowerpackWidgetTopologyMapDefinitionRequest(
            ImmutableArray<Outputs.PowerpackWidgetTopologyMapDefinitionRequestQuery> queries,

            string requestType)
        {
            Queries = queries;
            RequestType = requestType;
        }
    }
}