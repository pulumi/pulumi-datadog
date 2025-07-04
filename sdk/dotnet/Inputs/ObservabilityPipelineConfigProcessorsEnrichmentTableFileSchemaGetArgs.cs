// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ObservabilityPipelineConfigProcessorsEnrichmentTableFileSchemaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The `items` `column`.
        /// </summary>
        [Input("column")]
        public Input<string>? Column { get; set; }

        /// <summary>
        /// The type of the column (e.g. string, boolean, integer, etc.).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ObservabilityPipelineConfigProcessorsEnrichmentTableFileSchemaGetArgs()
        {
        }
        public static new ObservabilityPipelineConfigProcessorsEnrichmentTableFileSchemaGetArgs Empty => new ObservabilityPipelineConfigProcessorsEnrichmentTableFileSchemaGetArgs();
    }
}
