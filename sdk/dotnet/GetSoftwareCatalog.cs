// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetSoftwareCatalog
    {
        /// <summary>
        /// Use this data source to list software catalog entities to use in other resources.
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
        ///     var test = Datadog.GetSoftwareCatalog.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSoftwareCatalogResult> InvokeAsync(GetSoftwareCatalogArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSoftwareCatalogResult>("datadog:index/getSoftwareCatalog:getSoftwareCatalog", args ?? new GetSoftwareCatalogArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to list software catalog entities to use in other resources.
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
        ///     var test = Datadog.GetSoftwareCatalog.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSoftwareCatalogResult> Invoke(GetSoftwareCatalogInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSoftwareCatalogResult>("datadog:index/getSoftwareCatalog:getSoftwareCatalog", args ?? new GetSoftwareCatalogInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to list software catalog entities to use in other resources.
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
        ///     var test = Datadog.GetSoftwareCatalog.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSoftwareCatalogResult> Invoke(GetSoftwareCatalogInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSoftwareCatalogResult>("datadog:index/getSoftwareCatalog:getSoftwareCatalog", args ?? new GetSoftwareCatalogInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSoftwareCatalogArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter entities by excluding snapshotted entities.
        /// </summary>
        [Input("filterExcludeSnapshot")]
        public string? FilterExcludeSnapshot { get; set; }

        /// <summary>
        /// Filter entities by UUID.
        /// </summary>
        [Input("filterId")]
        public string? FilterId { get; set; }

        /// <summary>
        /// Filter entities by kind.
        /// </summary>
        [Input("filterKind")]
        public string? FilterKind { get; set; }

        /// <summary>
        /// Filter entities by name.
        /// </summary>
        [Input("filterName")]
        public string? FilterName { get; set; }

        /// <summary>
        /// Filter entities by owner.
        /// </summary>
        [Input("filterOwner")]
        public string? FilterOwner { get; set; }

        /// <summary>
        /// Filter entities by reference.
        /// </summary>
        [Input("filterRef")]
        public string? FilterRef { get; set; }

        /// <summary>
        /// Filter entities by relation type.
        /// </summary>
        [Input("filterRelationType")]
        public string? FilterRelationType { get; set; }

        public GetSoftwareCatalogArgs()
        {
        }
        public static new GetSoftwareCatalogArgs Empty => new GetSoftwareCatalogArgs();
    }

    public sealed class GetSoftwareCatalogInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter entities by excluding snapshotted entities.
        /// </summary>
        [Input("filterExcludeSnapshot")]
        public Input<string>? FilterExcludeSnapshot { get; set; }

        /// <summary>
        /// Filter entities by UUID.
        /// </summary>
        [Input("filterId")]
        public Input<string>? FilterId { get; set; }

        /// <summary>
        /// Filter entities by kind.
        /// </summary>
        [Input("filterKind")]
        public Input<string>? FilterKind { get; set; }

        /// <summary>
        /// Filter entities by name.
        /// </summary>
        [Input("filterName")]
        public Input<string>? FilterName { get; set; }

        /// <summary>
        /// Filter entities by owner.
        /// </summary>
        [Input("filterOwner")]
        public Input<string>? FilterOwner { get; set; }

        /// <summary>
        /// Filter entities by reference.
        /// </summary>
        [Input("filterRef")]
        public Input<string>? FilterRef { get; set; }

        /// <summary>
        /// Filter entities by relation type.
        /// </summary>
        [Input("filterRelationType")]
        public Input<string>? FilterRelationType { get; set; }

        public GetSoftwareCatalogInvokeArgs()
        {
        }
        public static new GetSoftwareCatalogInvokeArgs Empty => new GetSoftwareCatalogInvokeArgs();
    }


    [OutputType]
    public sealed class GetSoftwareCatalogResult
    {
        /// <summary>
        /// List of entities
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSoftwareCatalogEntityResult> Entities;
        /// <summary>
        /// Filter entities by excluding snapshotted entities.
        /// </summary>
        public readonly string? FilterExcludeSnapshot;
        /// <summary>
        /// Filter entities by UUID.
        /// </summary>
        public readonly string? FilterId;
        /// <summary>
        /// Filter entities by kind.
        /// </summary>
        public readonly string? FilterKind;
        /// <summary>
        /// Filter entities by name.
        /// </summary>
        public readonly string? FilterName;
        /// <summary>
        /// Filter entities by owner.
        /// </summary>
        public readonly string? FilterOwner;
        /// <summary>
        /// Filter entities by reference.
        /// </summary>
        public readonly string? FilterRef;
        /// <summary>
        /// Filter entities by relation type.
        /// </summary>
        public readonly string? FilterRelationType;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetSoftwareCatalogResult(
            ImmutableArray<Outputs.GetSoftwareCatalogEntityResult> entities,

            string? filterExcludeSnapshot,

            string? filterId,

            string? filterKind,

            string? filterName,

            string? filterOwner,

            string? filterRef,

            string? filterRelationType,

            string id)
        {
            Entities = entities;
            FilterExcludeSnapshot = filterExcludeSnapshot;
            FilterId = filterId;
            FilterKind = filterKind;
            FilterName = filterName;
            FilterOwner = filterOwner;
            FilterRef = filterRef;
            FilterRelationType = filterRelationType;
            Id = id;
        }
    }
}
