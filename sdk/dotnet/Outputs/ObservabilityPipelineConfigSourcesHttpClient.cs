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
    public sealed class ObservabilityPipelineConfigSourcesHttpClient
    {
        /// <summary>
        /// Optional authentication strategy for HTTP requests.
        /// </summary>
        public readonly string? AuthStrategy;
        /// <summary>
        /// The decoding format used to interpret incoming logs.
        /// </summary>
        public readonly string Decoding;
        /// <summary>
        /// The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The interval (in seconds) between HTTP scrape requests.
        /// </summary>
        public readonly int? ScrapeIntervalSecs;
        /// <summary>
        /// The timeout (in seconds) for each scrape request.
        /// </summary>
        public readonly int? ScrapeTimeoutSecs;
        /// <summary>
        /// Configuration for enabling TLS encryption between the pipeline component and external services.
        /// </summary>
        public readonly Outputs.ObservabilityPipelineConfigSourcesHttpClientTls? Tls;

        [OutputConstructor]
        private ObservabilityPipelineConfigSourcesHttpClient(
            string? authStrategy,

            string decoding,

            string id,

            int? scrapeIntervalSecs,

            int? scrapeTimeoutSecs,

            Outputs.ObservabilityPipelineConfigSourcesHttpClientTls? tls)
        {
            AuthStrategy = authStrategy;
            Decoding = decoding;
            Id = id;
            ScrapeIntervalSecs = scrapeIntervalSecs;
            ScrapeTimeoutSecs = scrapeTimeoutSecs;
            Tls = tls;
        }
    }
}
