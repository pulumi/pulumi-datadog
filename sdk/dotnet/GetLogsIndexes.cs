// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetLogsIndexes
    {
        /// <summary>
        /// Use this data source to list several existing logs indexes for use in other resources.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var test = Output.Create(Datadog.GetLogsIndexes.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetLogsIndexesResult> InvokeAsync(InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetLogsIndexesResult>("datadog:index/getLogsIndexes:getLogsIndexes", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetLogsIndexesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of logs indexes
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLogsIndexesLogsIndexResult> LogsIndexes;

        [OutputConstructor]
        private GetLogsIndexesResult(
            string id,

            ImmutableArray<Outputs.GetLogsIndexesLogsIndexResult> logsIndexes)
        {
            Id = id;
            LogsIndexes = logsIndexes;
        }
    }
}