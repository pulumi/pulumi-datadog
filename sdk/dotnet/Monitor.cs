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
    /// ## Import
    /// 
    /// Import is supported using the following syntax
    /// 
    /// ```sh
    ///  $ pulumi import datadog:index/monitor:Monitor bytes_received_localhost 2081
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/monitor:Monitor")]
    public partial class Monitor : Pulumi.CustomResource
    {
        /// <summary>
        /// A boolean indicating whether or not to include a list of log values which triggered the alert. This is only used by log
        /// monitors. Defaults to `false`.
        /// </summary>
        [Output("enableLogsSample")]
        public Output<bool?> EnableLogsSample { get; private set; } = null!;

        /// <summary>
        /// A message to include with a re-notification. Supports the `@username` notification allowed elsewhere.
        /// </summary>
        [Output("escalationMessage")]
        public Output<string?> EscalationMessage { get; private set; } = null!;

        /// <summary>
        /// (Only applies to metric alert) Time (in seconds) to delay evaluation, as a non-negative integer. For example, if the
        /// value is set to `300` (5min), the `timeframe` is set to `last_5m` and the time is 7:00, the monitor will evaluate data
        /// from 6:50 to 6:55. This is useful for AWS CloudWatch and other backfilled metrics to ensure the monitor will always have
        /// data during evaluation.
        /// </summary>
        [Output("evaluationDelay")]
        public Output<int> EvaluationDelay { get; private set; } = null!;

        /// <summary>
        /// A boolean indicating whether this monitor can be deleted even if it’s referenced by other resources (e.g. SLO,
        /// composite monitor).
        /// </summary>
        [Output("forceDelete")]
        public Output<bool?> ForceDelete { get; private set; } = null!;

        /// <summary>
        /// A boolean indicating whether notifications from this monitor automatically insert its triggering tags into the title.
        /// Defaults to `true`.
        /// </summary>
        [Output("includeTags")]
        public Output<bool?> IncludeTags { get; private set; } = null!;

        /// <summary>
        /// A boolean indicating whether changes to to this monitor should be restricted to the creator or admins. Defaults to
        /// `false`.
        /// </summary>
        [Output("locked")]
        public Output<bool?> Locked { get; private set; } = null!;

        /// <summary>
        /// A message to include with notifications for this monitor. Email notifications can be sent to specific users by using the
        /// same `@username` notation as events.
        /// </summary>
        [Output("message")]
        public Output<string> Message { get; private set; } = null!;

        /// <summary>
        /// A mapping containing `recovery_window` and `trigger_window` values, e.g. `last_15m` . Can only be used for, and are
        /// required for, anomaly monitors.
        /// </summary>
        [Output("monitorThresholdWindows")]
        public Output<Outputs.MonitorMonitorThresholdWindows?> MonitorThresholdWindows { get; private set; } = null!;

        /// <summary>
        /// Alert thresholds of the monitor.
        /// </summary>
        [Output("monitorThresholds")]
        public Output<Outputs.MonitorMonitorThresholds?> MonitorThresholds { get; private set; } = null!;

        /// <summary>
        /// Name of Datadog monitor.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Time (in seconds) to allow a host to boot and applications to fully start before starting the evaluation of monitor
        /// results. Should be a non negative integer. Defaults to `300`.
        /// </summary>
        [Output("newHostDelay")]
        public Output<int?> NewHostDelay { get; private set; } = null!;

        /// <summary>
        /// The number of minutes before a monitor will notify when data stops reporting. Provider defaults to 10 minutes. We
        /// recommend at least 2x the monitor timeframe for metric alerts or 2 minutes for service checks.
        /// </summary>
        [Output("noDataTimeframe")]
        public Output<int?> NoDataTimeframe { get; private set; } = null!;

        /// <summary>
        /// A boolean indicating whether tagged users will be notified on changes to this monitor. Defaults to `false`.
        /// </summary>
        [Output("notifyAudit")]
        public Output<bool?> NotifyAudit { get; private set; } = null!;

        /// <summary>
        /// A boolean indicating whether this monitor will notify when data stops reporting. Defaults to false.
        /// </summary>
        [Output("notifyNoData")]
        public Output<bool?> NotifyNoData { get; private set; } = null!;

        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// The monitor query to notify on. Note this is not the same query you see in the UI and the syntax is different depending
        /// on the monitor type, please see the [API Reference](https://docs.datadoghq.com/api/v1/monitors/#create-a-monitor) for
        /// details. Warning: `terraform plan` won't perform any validation of the query contents.
        /// </summary>
        [Output("query")]
        public Output<string> Query { get; private set; } = null!;

        /// <summary>
        /// The number of minutes after the last notification before a monitor will re-notify on the current status. It will only
        /// re-notify if it's not resolved.
        /// </summary>
        [Output("renotifyInterval")]
        public Output<int?> RenotifyInterval { get; private set; } = null!;

        /// <summary>
        /// A boolean indicating whether this monitor needs a full window of data before it's evaluated. We highly recommend you set
        /// this to `false` for s metrics, otherwise some evaluations will be skipped. Default: `true` for `on average`, `at all
        /// times` and `in total` aggregation. `false` otherwise.
        /// </summary>
        [Output("requireFullWindow")]
        public Output<bool?> RequireFullWindow { get; private set; } = null!;

        /// <summary>
        /// Each scope will be muted until the given POSIX timestamp or forever if the value is `0`. Use `-1` if you want to unmute
        /// the scope. Deprecated: the silenced parameter is being deprecated in favor of the downtime resource. This will be
        /// removed in the next major version of the Terraform Provider.
        /// </summary>
        [Output("silenced")]
        public Output<ImmutableDictionary<string, object>?> Silenced { get; private set; } = null!;

        /// <summary>
        /// A list of tags to associate with your monitor. This can help you categorize and filter monitors in the manage monitors
        /// page of the UI. Note: it's not currently possible to filter by these tags when querying via the API
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// A mapping containing `recovery_window` and `trigger_window` values, e.g. `last_15m`. Can only be used for, and are
        /// required for, anomaly monitors.
        /// </summary>
        [Output("thresholdWindows")]
        public Output<Outputs.MonitorThresholdWindows?> ThresholdWindows { get; private set; } = null!;

        /// <summary>
        /// Alert thresholds of the monitor.
        /// </summary>
        [Output("thresholds")]
        public Output<Outputs.MonitorThresholds?> Thresholds { get; private set; } = null!;

        /// <summary>
        /// The number of hours of the monitor not reporting data before it will automatically resolve from a triggered state.
        /// Defaults to `false`.
        /// </summary>
        [Output("timeoutH")]
        public Output<int?> TimeoutH { get; private set; } = null!;

        /// <summary>
        /// The type of the monitor. The mapping from these types to the types found in the Datadog Web UI can be found in the
        /// Datadog API [documentation page](https://docs.datadoghq.com/api/v1/monitors/#create-a-monitor). Note: The monitor type
        /// cannot be changed after a monitor is created.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// If set to `false`, skip the validation call done during plan.
        /// </summary>
        [Output("validate")]
        public Output<bool?> Validate { get; private set; } = null!;


        /// <summary>
        /// Create a Monitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Monitor(string name, MonitorArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/monitor:Monitor", name, args ?? new MonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Monitor(string name, Input<string> id, MonitorState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/monitor:Monitor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Monitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Monitor Get(string name, Input<string> id, MonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new Monitor(name, id, state, options);
        }
    }

    public sealed class MonitorArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A boolean indicating whether or not to include a list of log values which triggered the alert. This is only used by log
        /// monitors. Defaults to `false`.
        /// </summary>
        [Input("enableLogsSample")]
        public Input<bool>? EnableLogsSample { get; set; }

        /// <summary>
        /// A message to include with a re-notification. Supports the `@username` notification allowed elsewhere.
        /// </summary>
        [Input("escalationMessage")]
        public Input<string>? EscalationMessage { get; set; }

        /// <summary>
        /// (Only applies to metric alert) Time (in seconds) to delay evaluation, as a non-negative integer. For example, if the
        /// value is set to `300` (5min), the `timeframe` is set to `last_5m` and the time is 7:00, the monitor will evaluate data
        /// from 6:50 to 6:55. This is useful for AWS CloudWatch and other backfilled metrics to ensure the monitor will always have
        /// data during evaluation.
        /// </summary>
        [Input("evaluationDelay")]
        public Input<int>? EvaluationDelay { get; set; }

        /// <summary>
        /// A boolean indicating whether this monitor can be deleted even if it’s referenced by other resources (e.g. SLO,
        /// composite monitor).
        /// </summary>
        [Input("forceDelete")]
        public Input<bool>? ForceDelete { get; set; }

        /// <summary>
        /// A boolean indicating whether notifications from this monitor automatically insert its triggering tags into the title.
        /// Defaults to `true`.
        /// </summary>
        [Input("includeTags")]
        public Input<bool>? IncludeTags { get; set; }

        /// <summary>
        /// A boolean indicating whether changes to to this monitor should be restricted to the creator or admins. Defaults to
        /// `false`.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// A message to include with notifications for this monitor. Email notifications can be sent to specific users by using the
        /// same `@username` notation as events.
        /// </summary>
        [Input("message", required: true)]
        public Input<string> Message { get; set; } = null!;

        /// <summary>
        /// A mapping containing `recovery_window` and `trigger_window` values, e.g. `last_15m` . Can only be used for, and are
        /// required for, anomaly monitors.
        /// </summary>
        [Input("monitorThresholdWindows")]
        public Input<Inputs.MonitorMonitorThresholdWindowsArgs>? MonitorThresholdWindows { get; set; }

        /// <summary>
        /// Alert thresholds of the monitor.
        /// </summary>
        [Input("monitorThresholds")]
        public Input<Inputs.MonitorMonitorThresholdsArgs>? MonitorThresholds { get; set; }

        /// <summary>
        /// Name of Datadog monitor.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Time (in seconds) to allow a host to boot and applications to fully start before starting the evaluation of monitor
        /// results. Should be a non negative integer. Defaults to `300`.
        /// </summary>
        [Input("newHostDelay")]
        public Input<int>? NewHostDelay { get; set; }

        /// <summary>
        /// The number of minutes before a monitor will notify when data stops reporting. Provider defaults to 10 minutes. We
        /// recommend at least 2x the monitor timeframe for metric alerts or 2 minutes for service checks.
        /// </summary>
        [Input("noDataTimeframe")]
        public Input<int>? NoDataTimeframe { get; set; }

        /// <summary>
        /// A boolean indicating whether tagged users will be notified on changes to this monitor. Defaults to `false`.
        /// </summary>
        [Input("notifyAudit")]
        public Input<bool>? NotifyAudit { get; set; }

        /// <summary>
        /// A boolean indicating whether this monitor will notify when data stops reporting. Defaults to false.
        /// </summary>
        [Input("notifyNoData")]
        public Input<bool>? NotifyNoData { get; set; }

        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The monitor query to notify on. Note this is not the same query you see in the UI and the syntax is different depending
        /// on the monitor type, please see the [API Reference](https://docs.datadoghq.com/api/v1/monitors/#create-a-monitor) for
        /// details. Warning: `terraform plan` won't perform any validation of the query contents.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        /// <summary>
        /// The number of minutes after the last notification before a monitor will re-notify on the current status. It will only
        /// re-notify if it's not resolved.
        /// </summary>
        [Input("renotifyInterval")]
        public Input<int>? RenotifyInterval { get; set; }

        /// <summary>
        /// A boolean indicating whether this monitor needs a full window of data before it's evaluated. We highly recommend you set
        /// this to `false` for s metrics, otherwise some evaluations will be skipped. Default: `true` for `on average`, `at all
        /// times` and `in total` aggregation. `false` otherwise.
        /// </summary>
        [Input("requireFullWindow")]
        public Input<bool>? RequireFullWindow { get; set; }

        [Input("silenced")]
        private InputMap<object>? _silenced;

        /// <summary>
        /// Each scope will be muted until the given POSIX timestamp or forever if the value is `0`. Use `-1` if you want to unmute
        /// the scope. Deprecated: the silenced parameter is being deprecated in favor of the downtime resource. This will be
        /// removed in the next major version of the Terraform Provider.
        /// </summary>
        [Obsolete(@"use Downtime Resource instead")]
        public InputMap<object> Silenced
        {
            get => _silenced ?? (_silenced = new InputMap<object>());
            set => _silenced = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags to associate with your monitor. This can help you categorize and filter monitors in the manage monitors
        /// page of the UI. Note: it's not currently possible to filter by these tags when querying via the API
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// A mapping containing `recovery_window` and `trigger_window` values, e.g. `last_15m`. Can only be used for, and are
        /// required for, anomaly monitors.
        /// </summary>
        [Input("thresholdWindows")]
        public Input<Inputs.MonitorThresholdWindowsArgs>? ThresholdWindows { get; set; }

        /// <summary>
        /// Alert thresholds of the monitor.
        /// </summary>
        [Input("thresholds")]
        public Input<Inputs.MonitorThresholdsArgs>? Thresholds { get; set; }

        /// <summary>
        /// The number of hours of the monitor not reporting data before it will automatically resolve from a triggered state.
        /// Defaults to `false`.
        /// </summary>
        [Input("timeoutH")]
        public Input<int>? TimeoutH { get; set; }

        /// <summary>
        /// The type of the monitor. The mapping from these types to the types found in the Datadog Web UI can be found in the
        /// Datadog API [documentation page](https://docs.datadoghq.com/api/v1/monitors/#create-a-monitor). Note: The monitor type
        /// cannot be changed after a monitor is created.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// If set to `false`, skip the validation call done during plan.
        /// </summary>
        [Input("validate")]
        public Input<bool>? Validate { get; set; }

        public MonitorArgs()
        {
        }
    }

    public sealed class MonitorState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A boolean indicating whether or not to include a list of log values which triggered the alert. This is only used by log
        /// monitors. Defaults to `false`.
        /// </summary>
        [Input("enableLogsSample")]
        public Input<bool>? EnableLogsSample { get; set; }

        /// <summary>
        /// A message to include with a re-notification. Supports the `@username` notification allowed elsewhere.
        /// </summary>
        [Input("escalationMessage")]
        public Input<string>? EscalationMessage { get; set; }

        /// <summary>
        /// (Only applies to metric alert) Time (in seconds) to delay evaluation, as a non-negative integer. For example, if the
        /// value is set to `300` (5min), the `timeframe` is set to `last_5m` and the time is 7:00, the monitor will evaluate data
        /// from 6:50 to 6:55. This is useful for AWS CloudWatch and other backfilled metrics to ensure the monitor will always have
        /// data during evaluation.
        /// </summary>
        [Input("evaluationDelay")]
        public Input<int>? EvaluationDelay { get; set; }

        /// <summary>
        /// A boolean indicating whether this monitor can be deleted even if it’s referenced by other resources (e.g. SLO,
        /// composite monitor).
        /// </summary>
        [Input("forceDelete")]
        public Input<bool>? ForceDelete { get; set; }

        /// <summary>
        /// A boolean indicating whether notifications from this monitor automatically insert its triggering tags into the title.
        /// Defaults to `true`.
        /// </summary>
        [Input("includeTags")]
        public Input<bool>? IncludeTags { get; set; }

        /// <summary>
        /// A boolean indicating whether changes to to this monitor should be restricted to the creator or admins. Defaults to
        /// `false`.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// A message to include with notifications for this monitor. Email notifications can be sent to specific users by using the
        /// same `@username` notation as events.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// A mapping containing `recovery_window` and `trigger_window` values, e.g. `last_15m` . Can only be used for, and are
        /// required for, anomaly monitors.
        /// </summary>
        [Input("monitorThresholdWindows")]
        public Input<Inputs.MonitorMonitorThresholdWindowsGetArgs>? MonitorThresholdWindows { get; set; }

        /// <summary>
        /// Alert thresholds of the monitor.
        /// </summary>
        [Input("monitorThresholds")]
        public Input<Inputs.MonitorMonitorThresholdsGetArgs>? MonitorThresholds { get; set; }

        /// <summary>
        /// Name of Datadog monitor.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Time (in seconds) to allow a host to boot and applications to fully start before starting the evaluation of monitor
        /// results. Should be a non negative integer. Defaults to `300`.
        /// </summary>
        [Input("newHostDelay")]
        public Input<int>? NewHostDelay { get; set; }

        /// <summary>
        /// The number of minutes before a monitor will notify when data stops reporting. Provider defaults to 10 minutes. We
        /// recommend at least 2x the monitor timeframe for metric alerts or 2 minutes for service checks.
        /// </summary>
        [Input("noDataTimeframe")]
        public Input<int>? NoDataTimeframe { get; set; }

        /// <summary>
        /// A boolean indicating whether tagged users will be notified on changes to this monitor. Defaults to `false`.
        /// </summary>
        [Input("notifyAudit")]
        public Input<bool>? NotifyAudit { get; set; }

        /// <summary>
        /// A boolean indicating whether this monitor will notify when data stops reporting. Defaults to false.
        /// </summary>
        [Input("notifyNoData")]
        public Input<bool>? NotifyNoData { get; set; }

        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The monitor query to notify on. Note this is not the same query you see in the UI and the syntax is different depending
        /// on the monitor type, please see the [API Reference](https://docs.datadoghq.com/api/v1/monitors/#create-a-monitor) for
        /// details. Warning: `terraform plan` won't perform any validation of the query contents.
        /// </summary>
        [Input("query")]
        public Input<string>? Query { get; set; }

        /// <summary>
        /// The number of minutes after the last notification before a monitor will re-notify on the current status. It will only
        /// re-notify if it's not resolved.
        /// </summary>
        [Input("renotifyInterval")]
        public Input<int>? RenotifyInterval { get; set; }

        /// <summary>
        /// A boolean indicating whether this monitor needs a full window of data before it's evaluated. We highly recommend you set
        /// this to `false` for s metrics, otherwise some evaluations will be skipped. Default: `true` for `on average`, `at all
        /// times` and `in total` aggregation. `false` otherwise.
        /// </summary>
        [Input("requireFullWindow")]
        public Input<bool>? RequireFullWindow { get; set; }

        [Input("silenced")]
        private InputMap<object>? _silenced;

        /// <summary>
        /// Each scope will be muted until the given POSIX timestamp or forever if the value is `0`. Use `-1` if you want to unmute
        /// the scope. Deprecated: the silenced parameter is being deprecated in favor of the downtime resource. This will be
        /// removed in the next major version of the Terraform Provider.
        /// </summary>
        [Obsolete(@"use Downtime Resource instead")]
        public InputMap<object> Silenced
        {
            get => _silenced ?? (_silenced = new InputMap<object>());
            set => _silenced = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags to associate with your monitor. This can help you categorize and filter monitors in the manage monitors
        /// page of the UI. Note: it's not currently possible to filter by these tags when querying via the API
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// A mapping containing `recovery_window` and `trigger_window` values, e.g. `last_15m`. Can only be used for, and are
        /// required for, anomaly monitors.
        /// </summary>
        [Input("thresholdWindows")]
        public Input<Inputs.MonitorThresholdWindowsGetArgs>? ThresholdWindows { get; set; }

        /// <summary>
        /// Alert thresholds of the monitor.
        /// </summary>
        [Input("thresholds")]
        public Input<Inputs.MonitorThresholdsGetArgs>? Thresholds { get; set; }

        /// <summary>
        /// The number of hours of the monitor not reporting data before it will automatically resolve from a triggered state.
        /// Defaults to `false`.
        /// </summary>
        [Input("timeoutH")]
        public Input<int>? TimeoutH { get; set; }

        /// <summary>
        /// The type of the monitor. The mapping from these types to the types found in the Datadog Web UI can be found in the
        /// Datadog API [documentation page](https://docs.datadoghq.com/api/v1/monitors/#create-a-monitor). Note: The monitor type
        /// cannot be changed after a monitor is created.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// If set to `false`, skip the validation call done during plan.
        /// </summary>
        [Input("validate")]
        public Input<bool>? Validate { get; set; }

        public MonitorState()
        {
        }
    }
}
