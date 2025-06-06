// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class LogsArchiveAzureArchiveGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Your client id.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        /// <summary>
        /// The container where the archive is stored.
        /// </summary>
        [Input("container", required: true)]
        public Input<string> Container { get; set; } = null!;

        /// <summary>
        /// The path where the archive is stored.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The associated storage account.
        /// </summary>
        [Input("storageAccount", required: true)]
        public Input<string> StorageAccount { get; set; } = null!;

        /// <summary>
        /// Your tenant id.
        /// </summary>
        [Input("tenantId", required: true)]
        public Input<string> TenantId { get; set; } = null!;

        public LogsArchiveAzureArchiveGetArgs()
        {
        }
        public static new LogsArchiveAzureArchiveGetArgs Empty => new LogsArchiveAzureArchiveGetArgs();
    }
}
