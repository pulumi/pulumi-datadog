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
    /// Resource for interacting with the logs_metric API
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
    ///     var testingLogsMetric = new Datadog.LogsMetric("testing_logs_metric", new()
    ///     {
    ///         Name = "testing.logs.metric",
    ///         Compute = new Datadog.Inputs.LogsMetricComputeArgs
    ///         {
    ///             AggregationType = "distribution",
    ///             Path = "@duration",
    ///         },
    ///         Filter = new Datadog.Inputs.LogsMetricFilterArgs
    ///         {
    ///             Query = "service:test",
    ///         },
    ///         GroupBies = new[]
    ///         {
    ///             new Datadog.Inputs.LogsMetricGroupByArgs
    ///             {
    ///                 Path = "@status",
    ///                 TagName = "status",
    ///             },
    ///             new Datadog.Inputs.LogsMetricGroupByArgs
    ///             {
    ///                 Path = "@version",
    ///                 TagName = "version",
    ///             },
    ///         },
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
    /// $ pulumi import datadog:index/logsMetric:LogsMetric testing_logs_metric testing.logs.metric
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/logsMetric:LogsMetric")]
    public partial class LogsMetric : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The compute rule to compute the log-based metric. This field can't be updated after creation.
        /// </summary>
        [Output("compute")]
        public Output<Outputs.LogsMetricCompute> Compute { get; private set; } = null!;

        /// <summary>
        /// The log-based metric filter. Logs matching this filter will be aggregated in this metric.
        /// </summary>
        [Output("filter")]
        public Output<Outputs.LogsMetricFilter> Filter { get; private set; } = null!;

        /// <summary>
        /// The rules for the group by.
        /// </summary>
        [Output("groupBies")]
        public Output<ImmutableArray<Outputs.LogsMetricGroupBy>> GroupBies { get; private set; } = null!;

        /// <summary>
        /// The name of the log-based metric. This field can't be updated after creation.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a LogsMetric resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogsMetric(string name, LogsMetricArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/logsMetric:LogsMetric", name, args ?? new LogsMetricArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogsMetric(string name, Input<string> id, LogsMetricState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/logsMetric:LogsMetric", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LogsMetric resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogsMetric Get(string name, Input<string> id, LogsMetricState? state = null, CustomResourceOptions? options = null)
        {
            return new LogsMetric(name, id, state, options);
        }
    }

    public sealed class LogsMetricArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The compute rule to compute the log-based metric. This field can't be updated after creation.
        /// </summary>
        [Input("compute", required: true)]
        public Input<Inputs.LogsMetricComputeArgs> Compute { get; set; } = null!;

        /// <summary>
        /// The log-based metric filter. Logs matching this filter will be aggregated in this metric.
        /// </summary>
        [Input("filter", required: true)]
        public Input<Inputs.LogsMetricFilterArgs> Filter { get; set; } = null!;

        [Input("groupBies")]
        private InputList<Inputs.LogsMetricGroupByArgs>? _groupBies;

        /// <summary>
        /// The rules for the group by.
        /// </summary>
        public InputList<Inputs.LogsMetricGroupByArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.LogsMetricGroupByArgs>());
            set => _groupBies = value;
        }

        /// <summary>
        /// The name of the log-based metric. This field can't be updated after creation.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public LogsMetricArgs()
        {
        }
        public static new LogsMetricArgs Empty => new LogsMetricArgs();
    }

    public sealed class LogsMetricState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The compute rule to compute the log-based metric. This field can't be updated after creation.
        /// </summary>
        [Input("compute")]
        public Input<Inputs.LogsMetricComputeGetArgs>? Compute { get; set; }

        /// <summary>
        /// The log-based metric filter. Logs matching this filter will be aggregated in this metric.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.LogsMetricFilterGetArgs>? Filter { get; set; }

        [Input("groupBies")]
        private InputList<Inputs.LogsMetricGroupByGetArgs>? _groupBies;

        /// <summary>
        /// The rules for the group by.
        /// </summary>
        public InputList<Inputs.LogsMetricGroupByGetArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.LogsMetricGroupByGetArgs>());
            set => _groupBies = value;
        }

        /// <summary>
        /// The name of the log-based metric. This field can't be updated after creation.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public LogsMetricState()
        {
        }
        public static new LogsMetricState Empty => new LogsMetricState();
    }
}
