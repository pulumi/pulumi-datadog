// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetLogsIndexesOrder
    {
        /// <summary>
        /// Get the current order of your log indexes.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Datadog.GetLogsIndexesOrder.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLogsIndexesOrderResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLogsIndexesOrderResult>("datadog:index/getLogsIndexesOrder:getLogsIndexesOrder", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Get the current order of your log indexes.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Datadog.GetLogsIndexesOrder.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLogsIndexesOrderResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLogsIndexesOrderResult>("datadog:index/getLogsIndexesOrder:getLogsIndexesOrder", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Get the current order of your log indexes.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Datadog.GetLogsIndexesOrder.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLogsIndexesOrderResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetLogsIndexesOrderResult>("datadog:index/getLogsIndexesOrder:getLogsIndexesOrder", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetLogsIndexesOrderResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of strings identifying by their name(s) the index(es) of your organization. Logs are tested against the query filter of each index one by one, following the order of the array. Logs are eventually stored in the first matching index.
        /// </summary>
        public readonly ImmutableArray<string> IndexNames;

        [OutputConstructor]
        private GetLogsIndexesOrderResult(
            string id,

            ImmutableArray<string> indexNames)
        {
            Id = id;
            IndexNames = indexNames;
        }
    }
}
