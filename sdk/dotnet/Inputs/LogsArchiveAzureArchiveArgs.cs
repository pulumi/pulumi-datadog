// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class LogsArchiveAzureArchiveArgs : Pulumi.ResourceArgs
    {
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        [Input("container", required: true)]
        public Input<string> Container { get; set; } = null!;

        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("storageAccount", required: true)]
        public Input<string> StorageAccount { get; set; } = null!;

        [Input("tenantId", required: true)]
        public Input<string> TenantId { get; set; } = null!;

        public LogsArchiveAzureArchiveArgs()
        {
        }
    }
}