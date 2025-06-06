// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetLogsArchivesOrder
    {
        /// <summary>
        /// Get the current order of your logs archives.
        /// </summary>
        public static Task<GetLogsArchivesOrderResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLogsArchivesOrderResult>("datadog:index/getLogsArchivesOrder:getLogsArchivesOrder", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Get the current order of your logs archives.
        /// </summary>
        public static Output<GetLogsArchivesOrderResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLogsArchivesOrderResult>("datadog:index/getLogsArchivesOrder:getLogsArchivesOrder", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Get the current order of your logs archives.
        /// </summary>
        public static Output<GetLogsArchivesOrderResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetLogsArchivesOrderResult>("datadog:index/getLogsArchivesOrder:getLogsArchivesOrder", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetLogsArchivesOrderResult
    {
        /// <summary>
        /// The archive IDs list. The order of archive IDs in this attribute defines the overall archive order for logs.
        /// </summary>
        public readonly ImmutableArray<string> ArchiveIds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetLogsArchivesOrderResult(
            ImmutableArray<string> archiveIds,

            string id)
        {
            ArchiveIds = archiveIds;
            Id = id;
        }
    }
}
