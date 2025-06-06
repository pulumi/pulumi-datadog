// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetApplicationKey
    {
        /// <summary>
        /// Use this data source to retrieve information about an existing application key. Deprecated. This will be removed in a future release with prior notice. Securely store your application keys using a secret management system or use the datadog.ApplicationKey resource to manage application keys in your Datadog account.
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
        ///     var foo = Datadog.GetApplicationKey.Invoke(new()
        ///     {
        ///         Name = "foo-application",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplicationKeyResult> InvokeAsync(GetApplicationKeyArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplicationKeyResult>("datadog:index/getApplicationKey:getApplicationKey", args ?? new GetApplicationKeyArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about an existing application key. Deprecated. This will be removed in a future release with prior notice. Securely store your application keys using a secret management system or use the datadog.ApplicationKey resource to manage application keys in your Datadog account.
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
        ///     var foo = Datadog.GetApplicationKey.Invoke(new()
        ///     {
        ///         Name = "foo-application",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplicationKeyResult> Invoke(GetApplicationKeyInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationKeyResult>("datadog:index/getApplicationKey:getApplicationKey", args ?? new GetApplicationKeyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about an existing application key. Deprecated. This will be removed in a future release with prior notice. Securely store your application keys using a secret management system or use the datadog.ApplicationKey resource to manage application keys in your Datadog account.
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
        ///     var foo = Datadog.GetApplicationKey.Invoke(new()
        ///     {
        ///         Name = "foo-application",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplicationKeyResult> Invoke(GetApplicationKeyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationKeyResult>("datadog:index/getApplicationKey:getApplicationKey", args ?? new GetApplicationKeyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplicationKeyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether to use exact match when searching by name.
        /// </summary>
        [Input("exactMatch")]
        public bool? ExactMatch { get; set; }

        /// <summary>
        /// Id for Application Key.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Name for Application Key.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetApplicationKeyArgs()
        {
        }
        public static new GetApplicationKeyArgs Empty => new GetApplicationKeyArgs();
    }

    public sealed class GetApplicationKeyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether to use exact match when searching by name.
        /// </summary>
        [Input("exactMatch")]
        public Input<bool>? ExactMatch { get; set; }

        /// <summary>
        /// Id for Application Key.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Name for Application Key.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetApplicationKeyInvokeArgs()
        {
        }
        public static new GetApplicationKeyInvokeArgs Empty => new GetApplicationKeyInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplicationKeyResult
    {
        /// <summary>
        /// Whether to use exact match when searching by name.
        /// </summary>
        public readonly bool? ExactMatch;
        /// <summary>
        /// Id for Application Key.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The value of the Application Key.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// Name for Application Key.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private GetApplicationKeyResult(
            bool? exactMatch,

            string? id,

            string key,

            string? name)
        {
            ExactMatch = exactMatch;
            Id = id;
            Key = key;
            Name = name;
        }
    }
}
