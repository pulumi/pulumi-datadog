// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class LogsCustomDestinationSplunkDestinationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessToken", required: true)]
        private Input<string>? _accessToken;

        /// <summary>
        /// Access token of the Splunk HTTP Event Collector. This field is not returned by the API.
        /// </summary>
        public Input<string>? AccessToken
        {
            get => _accessToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The destination for which logs will be forwarded to. Must have HTTPS scheme. Forwarding back to Datadog is not allowed.
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        public LogsCustomDestinationSplunkDestinationGetArgs()
        {
        }
        public static new LogsCustomDestinationSplunkDestinationGetArgs Empty => new LogsCustomDestinationSplunkDestinationGetArgs();
    }
}
