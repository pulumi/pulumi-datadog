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
    public sealed class ObservabilityPipelineConfigProcessorsAddEnvVarVariable
    {
        /// <summary>
        /// The target field in the log event.
        /// </summary>
        public readonly string Field;
        /// <summary>
        /// The name of the environment variable to read.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private ObservabilityPipelineConfigProcessorsAddEnvVarVariable(
            string field,

            string name)
        {
            Field = field;
            Name = name;
        }
    }
}
