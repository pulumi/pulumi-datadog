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
    public sealed class LogsCustomPipelineProcessorGeoIpParser
    {
        /// <summary>
        /// If the processor is enabled or not.
        /// </summary>
        public readonly bool? IsEnabled;
        /// <summary>
        /// Name of the processor.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// List of source attributes.
        /// </summary>
        public readonly ImmutableArray<string> Sources;
        /// <summary>
        /// Name of the parent attribute that contains all the extracted details from the sources.
        /// </summary>
        public readonly string Target;

        [OutputConstructor]
        private LogsCustomPipelineProcessorGeoIpParser(
            bool? isEnabled,

            string? name,

            ImmutableArray<string> sources,

            string target)
        {
            IsEnabled = isEnabled;
            Name = name;
            Sources = sources;
            Target = target;
        }
    }
}
