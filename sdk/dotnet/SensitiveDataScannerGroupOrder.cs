// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    /// <summary>
    /// Provides a Datadog Sensitive Data Scanner Group Order API resource. This can be used to manage the order of Datadog Sensitive Data Scanner Groups.
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
    ///     // Create new sensitive_data_scanner_group_order resource
    ///     var mygrouporder = new Datadog.SensitiveDataScannerGroupOrder("mygrouporder", new()
    ///     {
    ///         GroupIds = new[]
    ///         {
    ///             "group-id-1",
    ///             "group-id-2",
    ///             "group-id-3",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import datadog:index/sensitiveDataScannerGroupOrder:SensitiveDataScannerGroupOrder mygrouporder order
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/sensitiveDataScannerGroupOrder:SensitiveDataScannerGroupOrder")]
    public partial class SensitiveDataScannerGroupOrder : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
        /// </summary>
        [Output("groupIds")]
        public Output<ImmutableArray<string>> GroupIds { get; private set; } = null!;


        /// <summary>
        /// Create a SensitiveDataScannerGroupOrder resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SensitiveDataScannerGroupOrder(string name, SensitiveDataScannerGroupOrderArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/sensitiveDataScannerGroupOrder:SensitiveDataScannerGroupOrder", name, args ?? new SensitiveDataScannerGroupOrderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SensitiveDataScannerGroupOrder(string name, Input<string> id, SensitiveDataScannerGroupOrderState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/sensitiveDataScannerGroupOrder:SensitiveDataScannerGroupOrder", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SensitiveDataScannerGroupOrder resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SensitiveDataScannerGroupOrder Get(string name, Input<string> id, SensitiveDataScannerGroupOrderState? state = null, CustomResourceOptions? options = null)
        {
            return new SensitiveDataScannerGroupOrder(name, id, state, options);
        }
    }

    public sealed class SensitiveDataScannerGroupOrderArgs : global::Pulumi.ResourceArgs
    {
        [Input("groupIds", required: true)]
        private InputList<string>? _groupIds;

        /// <summary>
        /// The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
        /// </summary>
        public InputList<string> GroupIds
        {
            get => _groupIds ?? (_groupIds = new InputList<string>());
            set => _groupIds = value;
        }

        public SensitiveDataScannerGroupOrderArgs()
        {
        }
        public static new SensitiveDataScannerGroupOrderArgs Empty => new SensitiveDataScannerGroupOrderArgs();
    }

    public sealed class SensitiveDataScannerGroupOrderState : global::Pulumi.ResourceArgs
    {
        [Input("groupIds")]
        private InputList<string>? _groupIds;

        /// <summary>
        /// The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
        /// </summary>
        public InputList<string> GroupIds
        {
            get => _groupIds ?? (_groupIds = new InputList<string>());
            set => _groupIds = value;
        }

        public SensitiveDataScannerGroupOrderState()
        {
        }
        public static new SensitiveDataScannerGroupOrderState Empty => new SensitiveDataScannerGroupOrderState();
    }
}