// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SensitiveDataScannerRuleIncludedKeywordConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of characters before the match to find a keyword validating the match. It must be between 1 and 50 (inclusive).
        /// </summary>
        [Input("characterCount", required: true)]
        public Input<int> CharacterCount { get; set; } = null!;

        [Input("keywords", required: true)]
        private InputList<string>? _keywords;

        /// <summary>
        /// Keyword list that is checked during scanning in order to validate a match. The number of keywords in the list must be lower than or equal to 30.
        /// </summary>
        public InputList<string> Keywords
        {
            get => _keywords ?? (_keywords = new InputList<string>());
            set => _keywords = value;
        }

        public SensitiveDataScannerRuleIncludedKeywordConfigurationGetArgs()
        {
        }
        public static new SensitiveDataScannerRuleIncludedKeywordConfigurationGetArgs Empty => new SensitiveDataScannerRuleIncludedKeywordConfigurationGetArgs();
    }
}