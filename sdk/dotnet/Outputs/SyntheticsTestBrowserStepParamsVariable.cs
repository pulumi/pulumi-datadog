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
    public sealed class SyntheticsTestBrowserStepParamsVariable
    {
        /// <summary>
        /// Example of the extracted variable. Defaults to `""`.
        /// </summary>
        public readonly string? Example;
        /// <summary>
        /// Name of the extracted variable.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Whether the value of this variable will be obfuscated in test results. Defaults to `false`.
        /// </summary>
        public readonly bool? Secure;

        [OutputConstructor]
        private SyntheticsTestBrowserStepParamsVariable(
            string? example,

            string? name,

            bool? secure)
        {
            Example = example;
            Name = name;
            Secure = secure;
        }
    }
}
