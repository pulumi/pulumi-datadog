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
    public sealed class SensitiveDataScannerRuleTextReplacement
    {
        /// <summary>
        /// Required if type == 'partial*replacement*from*beginning' or 'partial*replacement*from*end'. It must be &gt; 0.
        /// </summary>
        public readonly int? NumberOfChars;
        /// <summary>
        /// Required if type == 'replacement_string'.
        /// </summary>
        public readonly string? ReplacementString;
        /// <summary>
        /// Type of the replacement text. None means no replacement. hash means the data will be stubbed. replacement*string means that one can chose a text to replace the data. partial*replacement*from*beginning allows a user to partially replace the data from the beginning, and partial*replacement*from_end on the other hand, allows to replace data from the end. Valid values are `none`, `hash`, `replacement_string`, `partial_replacement_from_beginning`, `partial_replacement_from_end`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private SensitiveDataScannerRuleTextReplacement(
            int? numberOfChars,

            string? replacementString,

            string type)
        {
            NumberOfChars = numberOfChars;
            ReplacementString = replacementString;
            Type = type;
        }
    }
}
