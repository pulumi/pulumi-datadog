// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class LogsCustomDestinationHttpDestinationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Basic access authentication.
        /// </summary>
        [Input("basicAuth")]
        public Input<Inputs.LogsCustomDestinationHttpDestinationBasicAuthArgs>? BasicAuth { get; set; }

        /// <summary>
        /// Custom header access authentication.
        /// </summary>
        [Input("customHeaderAuth")]
        public Input<Inputs.LogsCustomDestinationHttpDestinationCustomHeaderAuthArgs>? CustomHeaderAuth { get; set; }

        /// <summary>
        /// The destination for which logs will be forwarded to. Must have HTTPS scheme. Forwarding back to Datadog is not allowed.
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        public LogsCustomDestinationHttpDestinationArgs()
        {
        }
        public static new LogsCustomDestinationHttpDestinationArgs Empty => new LogsCustomDestinationHttpDestinationArgs();
    }
}
