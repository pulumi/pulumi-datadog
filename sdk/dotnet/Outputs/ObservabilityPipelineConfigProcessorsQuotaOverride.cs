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
    public sealed class ObservabilityPipelineConfigProcessorsQuotaOverride
    {
        /// <summary>
        /// Fields that trigger this override.
        /// </summary>
        public readonly ImmutableArray<Outputs.ObservabilityPipelineConfigProcessorsQuotaOverrideField> Fields;
        public readonly Outputs.ObservabilityPipelineConfigProcessorsQuotaOverrideLimit? Limit;

        [OutputConstructor]
        private ObservabilityPipelineConfigProcessorsQuotaOverride(
            ImmutableArray<Outputs.ObservabilityPipelineConfigProcessorsQuotaOverrideField> fields,

            Outputs.ObservabilityPipelineConfigProcessorsQuotaOverrideLimit? limit)
        {
            Fields = fields;
            Limit = limit;
        }
    }
}
