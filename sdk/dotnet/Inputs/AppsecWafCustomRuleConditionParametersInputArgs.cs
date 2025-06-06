// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class AppsecWafCustomRuleConditionParametersInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Input from the request on which the condition should apply.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        [Input("keyPaths")]
        private InputList<string>? _keyPaths;

        /// <summary>
        /// Specific path for the input.
        /// </summary>
        public InputList<string> KeyPaths
        {
            get => _keyPaths ?? (_keyPaths = new InputList<string>());
            set => _keyPaths = value;
        }

        public AppsecWafCustomRuleConditionParametersInputArgs()
        {
        }
        public static new AppsecWafCustomRuleConditionParametersInputArgs Empty => new AppsecWafCustomRuleConditionParametersInputArgs();
    }
}
