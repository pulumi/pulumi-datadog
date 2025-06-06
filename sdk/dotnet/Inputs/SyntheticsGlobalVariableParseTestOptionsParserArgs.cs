// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SyntheticsGlobalVariableParseTestOptionsParserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of parser to extract the value. Valid values are `raw`, `json_path`, `regex`, `x_path`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Value for the parser to use, required for type `json_path` or `regex`.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public SyntheticsGlobalVariableParseTestOptionsParserArgs()
        {
        }
        public static new SyntheticsGlobalVariableParseTestOptionsParserArgs Empty => new SyntheticsGlobalVariableParseTestOptionsParserArgs();
    }
}
