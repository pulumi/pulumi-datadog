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
    public sealed class PowerpackWidgetListStreamDefinitionRequest
    {
        /// <summary>
        /// Widget columns.
        /// </summary>
        public readonly ImmutableArray<Outputs.PowerpackWidgetListStreamDefinitionRequestColumn> Columns;
        /// <summary>
        /// Updated list stream widget.
        /// </summary>
        public readonly Outputs.PowerpackWidgetListStreamDefinitionRequestQuery Query;
        /// <summary>
        /// Widget response format. Valid values are `event_list`.
        /// </summary>
        public readonly string ResponseFormat;

        [OutputConstructor]
        private PowerpackWidgetListStreamDefinitionRequest(
            ImmutableArray<Outputs.PowerpackWidgetListStreamDefinitionRequestColumn> columns,

            Outputs.PowerpackWidgetListStreamDefinitionRequestQuery query,

            string responseFormat)
        {
            Columns = columns;
            Query = query;
            ResponseFormat = responseFormat;
        }
    }
}
