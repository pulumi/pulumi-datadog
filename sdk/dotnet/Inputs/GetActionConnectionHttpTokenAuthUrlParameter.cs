// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class GetActionConnectionHttpTokenAuthUrlParameterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// URL parameter name
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// URL parameter value
        /// </summary>
        [Input("value", required: true)]
        public string Value { get; set; } = null!;

        public GetActionConnectionHttpTokenAuthUrlParameterArgs()
        {
        }
        public static new GetActionConnectionHttpTokenAuthUrlParameterArgs Empty => new GetActionConnectionHttpTokenAuthUrlParameterArgs();
    }
}
