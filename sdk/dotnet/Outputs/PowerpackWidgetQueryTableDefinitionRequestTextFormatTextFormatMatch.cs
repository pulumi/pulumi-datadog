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
    public sealed class PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormatMatch
    {
        /// <summary>
        /// Match or compare option. Valid values are `is`, `is_not`, `contains`, `does_not_contain`, `starts_with`, `ends_with`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Table Widget Match String.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormatMatch(
            string type,

            string value)
        {
            Type = type;
            Value = value;
        }
    }
}
