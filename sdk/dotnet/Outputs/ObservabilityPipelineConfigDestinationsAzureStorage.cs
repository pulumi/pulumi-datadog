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
    public sealed class ObservabilityPipelineConfigDestinationsAzureStorage
    {
        /// <summary>
        /// Optional prefix for blobs written to the container.
        /// </summary>
        public readonly string? BlobPrefix;
        /// <summary>
        /// The name of the Azure Blob Storage container to store logs in.
        /// </summary>
        public readonly string ContainerName;
        /// <summary>
        /// The unique identifier for this component.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of component IDs whose output is used as the `input` for this component.
        /// </summary>
        public readonly ImmutableArray<string> Inputs;

        [OutputConstructor]
        private ObservabilityPipelineConfigDestinationsAzureStorage(
            string? blobPrefix,

            string containerName,

            string id,

            ImmutableArray<string> inputs)
        {
            BlobPrefix = blobPrefix;
            ContainerName = containerName;
            Id = id;
            Inputs = inputs;
        }
    }
}
