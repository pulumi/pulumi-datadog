// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    /// <summary>
    /// Provides a Datadog RumRetentionFilter resource. This can be used to create and manage Datadog rum_retention_filter.
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
    ///     // Create new rum_retention_filter resource
    ///     var testingRumRetentionFilter = new Datadog.RumRetentionFilter("testing_rum_retention_filter", new()
    ///     {
    ///         ApplicationId = "&lt;APPLICATION_ID&gt;",
    ///         Name = "testing.rum.retention_filter",
    ///         EventType = "session",
    ///         SampleRate = 41,
    ///         Query = "@session.has_replay:true",
    ///         Enabled = false,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// ```sh
    /// $ pulumi import datadog:index/rumRetentionFilter:RumRetentionFilter testing_rum_retention_filter "&lt;application_id&gt;:&lt;retention_filter_id&gt;"
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/rumRetentionFilter:RumRetentionFilter")]
    public partial class RumRetentionFilter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// RUM application ID.
        /// </summary>
        [Output("applicationId")]
        public Output<string> ApplicationId { get; private set; } = null!;

        /// <summary>
        /// Whether the retention filter is to be enabled. Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The type of RUM events to filter on.
        /// </summary>
        [Output("eventType")]
        public Output<string> EventType { get; private set; } = null!;

        /// <summary>
        /// The name of a RUM retention filter.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Query string for a RUM retention filter. Defaults to `""`.
        /// </summary>
        [Output("query")]
        public Output<string> Query { get; private set; } = null!;

        /// <summary>
        /// The sample rate for a RUM retention filter, between 0 and 100.
        /// </summary>
        [Output("sampleRate")]
        public Output<int> SampleRate { get; private set; } = null!;


        /// <summary>
        /// Create a RumRetentionFilter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RumRetentionFilter(string name, RumRetentionFilterArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/rumRetentionFilter:RumRetentionFilter", name, args ?? new RumRetentionFilterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RumRetentionFilter(string name, Input<string> id, RumRetentionFilterState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/rumRetentionFilter:RumRetentionFilter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RumRetentionFilter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RumRetentionFilter Get(string name, Input<string> id, RumRetentionFilterState? state = null, CustomResourceOptions? options = null)
        {
            return new RumRetentionFilter(name, id, state, options);
        }
    }

    public sealed class RumRetentionFilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// RUM application ID.
        /// </summary>
        [Input("applicationId", required: true)]
        public Input<string> ApplicationId { get; set; } = null!;

        /// <summary>
        /// Whether the retention filter is to be enabled. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The type of RUM events to filter on.
        /// </summary>
        [Input("eventType", required: true)]
        public Input<string> EventType { get; set; } = null!;

        /// <summary>
        /// The name of a RUM retention filter.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The Query string for a RUM retention filter. Defaults to `""`.
        /// </summary>
        [Input("query")]
        public Input<string>? Query { get; set; }

        /// <summary>
        /// The sample rate for a RUM retention filter, between 0 and 100.
        /// </summary>
        [Input("sampleRate", required: true)]
        public Input<int> SampleRate { get; set; } = null!;

        public RumRetentionFilterArgs()
        {
        }
        public static new RumRetentionFilterArgs Empty => new RumRetentionFilterArgs();
    }

    public sealed class RumRetentionFilterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// RUM application ID.
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        /// <summary>
        /// Whether the retention filter is to be enabled. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The type of RUM events to filter on.
        /// </summary>
        [Input("eventType")]
        public Input<string>? EventType { get; set; }

        /// <summary>
        /// The name of a RUM retention filter.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Query string for a RUM retention filter. Defaults to `""`.
        /// </summary>
        [Input("query")]
        public Input<string>? Query { get; set; }

        /// <summary>
        /// The sample rate for a RUM retention filter, between 0 and 100.
        /// </summary>
        [Input("sampleRate")]
        public Input<int>? SampleRate { get; set; }

        public RumRetentionFilterState()
        {
        }
        public static new RumRetentionFilterState Empty => new RumRetentionFilterState();
    }
}
