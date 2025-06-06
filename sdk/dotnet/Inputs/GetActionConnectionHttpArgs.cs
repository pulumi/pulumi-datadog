// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class GetActionConnectionHttpInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Base HTTP url for the integration
        /// </summary>
        [Input("baseUrl", required: true)]
        public Input<string> BaseUrl { get; set; } = null!;

        /// <summary>
        /// Configuration for an HTTP connection that uses token auth
        /// </summary>
        [Input("tokenAuth")]
        public Input<Inputs.GetActionConnectionHttpTokenAuthInputArgs>? TokenAuth { get; set; }

        public GetActionConnectionHttpInputArgs()
        {
        }
        public static new GetActionConnectionHttpInputArgs Empty => new GetActionConnectionHttpInputArgs();
    }
}
