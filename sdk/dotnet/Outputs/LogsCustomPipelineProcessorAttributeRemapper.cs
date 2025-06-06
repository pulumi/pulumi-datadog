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
    public sealed class LogsCustomPipelineProcessorAttributeRemapper
    {
        /// <summary>
        /// If the processor is enabled or not.
        /// </summary>
        public readonly bool? IsEnabled;
        /// <summary>
        /// Name of the processor
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Override the target element if already set.
        /// </summary>
        public readonly bool? OverrideOnConflict;
        /// <summary>
        /// Remove or preserve the remapped source element.
        /// </summary>
        public readonly bool? PreserveSource;
        /// <summary>
        /// Defines where the sources are from (log `attribute` or `tag`).
        /// </summary>
        public readonly string SourceType;
        /// <summary>
        /// List of source attributes or tags.
        /// </summary>
        public readonly ImmutableArray<string> Sources;
        /// <summary>
        /// Final attribute or tag name to remap the sources.
        /// </summary>
        public readonly string Target;
        /// <summary>
        /// If the `target_type` of the remapper is `attribute`, try to cast the value to a new specific type. If the cast is not possible, the original type is kept. `string`, `integer`, or `double` are the possible types. If the `target_type` is `tag`, this parameter may not be specified.
        /// </summary>
        public readonly string? TargetFormat;
        /// <summary>
        /// Defines if the target is a log `attribute` or `tag`.
        /// </summary>
        public readonly string TargetType;

        [OutputConstructor]
        private LogsCustomPipelineProcessorAttributeRemapper(
            bool? isEnabled,

            string? name,

            bool? overrideOnConflict,

            bool? preserveSource,

            string sourceType,

            ImmutableArray<string> sources,

            string target,

            string? targetFormat,

            string targetType)
        {
            IsEnabled = isEnabled;
            Name = name;
            OverrideOnConflict = overrideOnConflict;
            PreserveSource = preserveSource;
            SourceType = sourceType;
            Sources = sources;
            Target = target;
            TargetFormat = targetFormat;
            TargetType = targetType;
        }
    }
}
