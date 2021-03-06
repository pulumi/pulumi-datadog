# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs

__all__ = [
    'GetMonitorResult',
    'AwaitableGetMonitorResult',
    'get_monitor',
]

@pulumi.output_type
class GetMonitorResult:
    """
    A collection of values returned by getMonitor.
    """
    def __init__(__self__, enable_logs_sample=None, escalation_message=None, evaluation_delay=None, id=None, include_tags=None, locked=None, message=None, monitor_tags_filters=None, monitor_threshold_windows=None, monitor_thresholds=None, name=None, name_filter=None, new_host_delay=None, no_data_timeframe=None, notify_audit=None, notify_no_data=None, query=None, renotify_interval=None, require_full_window=None, tags=None, tags_filters=None, threshold_windows=None, thresholds=None, timeout_h=None, type=None):
        if enable_logs_sample and not isinstance(enable_logs_sample, bool):
            raise TypeError("Expected argument 'enable_logs_sample' to be a bool")
        pulumi.set(__self__, "enable_logs_sample", enable_logs_sample)
        if escalation_message and not isinstance(escalation_message, str):
            raise TypeError("Expected argument 'escalation_message' to be a str")
        pulumi.set(__self__, "escalation_message", escalation_message)
        if evaluation_delay and not isinstance(evaluation_delay, int):
            raise TypeError("Expected argument 'evaluation_delay' to be a int")
        pulumi.set(__self__, "evaluation_delay", evaluation_delay)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if include_tags and not isinstance(include_tags, bool):
            raise TypeError("Expected argument 'include_tags' to be a bool")
        pulumi.set(__self__, "include_tags", include_tags)
        if locked and not isinstance(locked, bool):
            raise TypeError("Expected argument 'locked' to be a bool")
        pulumi.set(__self__, "locked", locked)
        if message and not isinstance(message, str):
            raise TypeError("Expected argument 'message' to be a str")
        pulumi.set(__self__, "message", message)
        if monitor_tags_filters and not isinstance(monitor_tags_filters, list):
            raise TypeError("Expected argument 'monitor_tags_filters' to be a list")
        pulumi.set(__self__, "monitor_tags_filters", monitor_tags_filters)
        if monitor_threshold_windows and not isinstance(monitor_threshold_windows, dict):
            raise TypeError("Expected argument 'monitor_threshold_windows' to be a dict")
        pulumi.set(__self__, "monitor_threshold_windows", monitor_threshold_windows)
        if monitor_thresholds and not isinstance(monitor_thresholds, dict):
            raise TypeError("Expected argument 'monitor_thresholds' to be a dict")
        pulumi.set(__self__, "monitor_thresholds", monitor_thresholds)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if name_filter and not isinstance(name_filter, str):
            raise TypeError("Expected argument 'name_filter' to be a str")
        pulumi.set(__self__, "name_filter", name_filter)
        if new_host_delay and not isinstance(new_host_delay, int):
            raise TypeError("Expected argument 'new_host_delay' to be a int")
        pulumi.set(__self__, "new_host_delay", new_host_delay)
        if no_data_timeframe and not isinstance(no_data_timeframe, int):
            raise TypeError("Expected argument 'no_data_timeframe' to be a int")
        pulumi.set(__self__, "no_data_timeframe", no_data_timeframe)
        if notify_audit and not isinstance(notify_audit, bool):
            raise TypeError("Expected argument 'notify_audit' to be a bool")
        pulumi.set(__self__, "notify_audit", notify_audit)
        if notify_no_data and not isinstance(notify_no_data, bool):
            raise TypeError("Expected argument 'notify_no_data' to be a bool")
        pulumi.set(__self__, "notify_no_data", notify_no_data)
        if query and not isinstance(query, str):
            raise TypeError("Expected argument 'query' to be a str")
        pulumi.set(__self__, "query", query)
        if renotify_interval and not isinstance(renotify_interval, int):
            raise TypeError("Expected argument 'renotify_interval' to be a int")
        pulumi.set(__self__, "renotify_interval", renotify_interval)
        if require_full_window and not isinstance(require_full_window, bool):
            raise TypeError("Expected argument 'require_full_window' to be a bool")
        pulumi.set(__self__, "require_full_window", require_full_window)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if tags_filters and not isinstance(tags_filters, list):
            raise TypeError("Expected argument 'tags_filters' to be a list")
        pulumi.set(__self__, "tags_filters", tags_filters)
        if threshold_windows and not isinstance(threshold_windows, dict):
            raise TypeError("Expected argument 'threshold_windows' to be a dict")
        if threshold_windows is not None:
            warnings.warn("""Define `monitor_threshold_windows` list with one element instead.""", DeprecationWarning)
            pulumi.log.warn("threshold_windows is deprecated: Define `monitor_threshold_windows` list with one element instead.")

        pulumi.set(__self__, "threshold_windows", threshold_windows)
        if thresholds and not isinstance(thresholds, dict):
            raise TypeError("Expected argument 'thresholds' to be a dict")
        if thresholds is not None:
            warnings.warn("""Define `monitor_thresholds` list with one element instead.""", DeprecationWarning)
            pulumi.log.warn("thresholds is deprecated: Define `monitor_thresholds` list with one element instead.")

        pulumi.set(__self__, "thresholds", thresholds)
        if timeout_h and not isinstance(timeout_h, int):
            raise TypeError("Expected argument 'timeout_h' to be a int")
        pulumi.set(__self__, "timeout_h", timeout_h)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="enableLogsSample")
    def enable_logs_sample(self) -> bool:
        return pulumi.get(self, "enable_logs_sample")

    @property
    @pulumi.getter(name="escalationMessage")
    def escalation_message(self) -> str:
        return pulumi.get(self, "escalation_message")

    @property
    @pulumi.getter(name="evaluationDelay")
    def evaluation_delay(self) -> int:
        return pulumi.get(self, "evaluation_delay")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="includeTags")
    def include_tags(self) -> bool:
        return pulumi.get(self, "include_tags")

    @property
    @pulumi.getter
    def locked(self) -> bool:
        return pulumi.get(self, "locked")

    @property
    @pulumi.getter
    def message(self) -> str:
        return pulumi.get(self, "message")

    @property
    @pulumi.getter(name="monitorTagsFilters")
    def monitor_tags_filters(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "monitor_tags_filters")

    @property
    @pulumi.getter(name="monitorThresholdWindows")
    def monitor_threshold_windows(self) -> 'outputs.GetMonitorMonitorThresholdWindowsResult':
        return pulumi.get(self, "monitor_threshold_windows")

    @property
    @pulumi.getter(name="monitorThresholds")
    def monitor_thresholds(self) -> 'outputs.GetMonitorMonitorThresholdsResult':
        return pulumi.get(self, "monitor_thresholds")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nameFilter")
    def name_filter(self) -> Optional[str]:
        return pulumi.get(self, "name_filter")

    @property
    @pulumi.getter(name="newHostDelay")
    def new_host_delay(self) -> int:
        return pulumi.get(self, "new_host_delay")

    @property
    @pulumi.getter(name="noDataTimeframe")
    def no_data_timeframe(self) -> int:
        return pulumi.get(self, "no_data_timeframe")

    @property
    @pulumi.getter(name="notifyAudit")
    def notify_audit(self) -> bool:
        return pulumi.get(self, "notify_audit")

    @property
    @pulumi.getter(name="notifyNoData")
    def notify_no_data(self) -> bool:
        return pulumi.get(self, "notify_no_data")

    @property
    @pulumi.getter
    def query(self) -> str:
        return pulumi.get(self, "query")

    @property
    @pulumi.getter(name="renotifyInterval")
    def renotify_interval(self) -> int:
        return pulumi.get(self, "renotify_interval")

    @property
    @pulumi.getter(name="requireFullWindow")
    def require_full_window(self) -> bool:
        return pulumi.get(self, "require_full_window")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsFilters")
    def tags_filters(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "tags_filters")

    @property
    @pulumi.getter(name="thresholdWindows")
    def threshold_windows(self) -> 'outputs.GetMonitorThresholdWindowsResult':
        return pulumi.get(self, "threshold_windows")

    @property
    @pulumi.getter
    def thresholds(self) -> 'outputs.GetMonitorThresholdsResult':
        return pulumi.get(self, "thresholds")

    @property
    @pulumi.getter(name="timeoutH")
    def timeout_h(self) -> int:
        return pulumi.get(self, "timeout_h")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")


class AwaitableGetMonitorResult(GetMonitorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMonitorResult(
            enable_logs_sample=self.enable_logs_sample,
            escalation_message=self.escalation_message,
            evaluation_delay=self.evaluation_delay,
            id=self.id,
            include_tags=self.include_tags,
            locked=self.locked,
            message=self.message,
            monitor_tags_filters=self.monitor_tags_filters,
            monitor_threshold_windows=self.monitor_threshold_windows,
            monitor_thresholds=self.monitor_thresholds,
            name=self.name,
            name_filter=self.name_filter,
            new_host_delay=self.new_host_delay,
            no_data_timeframe=self.no_data_timeframe,
            notify_audit=self.notify_audit,
            notify_no_data=self.notify_no_data,
            query=self.query,
            renotify_interval=self.renotify_interval,
            require_full_window=self.require_full_window,
            tags=self.tags,
            tags_filters=self.tags_filters,
            threshold_windows=self.threshold_windows,
            thresholds=self.thresholds,
            timeout_h=self.timeout_h,
            type=self.type)


def get_monitor(monitor_tags_filters: Optional[Sequence[str]] = None,
                name_filter: Optional[str] = None,
                tags_filters: Optional[Sequence[str]] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMonitorResult:
    """
    Use this data source to retrieve information about an existing monitor for use in other resources.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_datadog as datadog

    test = datadog.get_monitor(monitor_tags_filters=["foo:bar"],
        name_filter="My awesome monitor")
    ```
    ## Schema

    ### Optional

    - **id** (String) The ID of this resource.
    - **monitor_tags_filter** (List of String) A list of monitor tags to limit the search. This filters on the tags set on the monitor itself.
    - **name_filter** (String) A monitor name to limit the search.
    - **tags_filter** (List of String) A list of tags to limit the search. This filters on the monitor scope.

    ### Read-only

    - **enable_logs_sample** (Boolean) Whether or not a list of log values which triggered the alert is included. This is only used by log monitors.
    - **escalation_message** (String) Message included with a re-notification for this monitor.
    - **evaluation_delay** (Number) Time (in seconds) for which evaluation is delayed. This is only used by metric monitors.
    - **include_tags** (Boolean) Whether or not notifications from the monitor automatically inserts its triggering tags into the title.
    - **locked** (Boolean) Whether or not changes to the monitor are restricted to the creator or admins.
    - **message** (String) Message included with notifications for this monitor
    - **monitor_threshold_windows** (List of Object) Mapping containing `recovery_window` and `trigger_window` values, e.g. `last_15m`. This is only used by anomaly monitors. (see below for nested schema)
    - **monitor_thresholds** (List of Object) Alert thresholds of the monitor. (see below for nested schema)
    - **name** (String) Name of the monitor
    - **new_host_delay** (Number) Time (in seconds) allowing a host to boot and applications to fully start before starting the evaluation of monitor results.
    - **no_data_timeframe** (Number) The number of minutes before the monitor notifies when data stops reporting.
    - **notify_audit** (Boolean) Whether or not tagged users are notified on changes to the monitor.
    - **notify_no_data** (Boolean) Whether or not this monitor notifies when data stops reporting.
    - **query** (String) Query of the monitor.
    - **renotify_interval** (Number) The number of minutes after the last notification before the monitor re-notifies on the current status.
    - **require_full_window** (Boolean) Whether or not the monitor needs a full window of data before it is evaluated.
    - **tags** (Set of String) List of tags associated with the monitor.
    - **threshold_windows** (Map of String, Deprecated) Mapping containing `recovery_window` and `trigger_window` values, e.g. `last_15m`. This is only used by anomaly monitors.
    - **thresholds** (Map of String, Deprecated) Alert thresholds of the monitor.
    - **timeout_h** (Number) Number of hours of the monitor not reporting data before it automatically resolves from a triggered state.
    - **type** (String) Type of the monitor.

    <a id="nestedatt--monitor_threshold_windows"></a>
    ### Nested Schema for `monitor_threshold_windows`

    Read-only:

    - **recovery_window** (String)
    - **trigger_window** (String)

    <a id="nestedatt--monitor_thresholds"></a>
    ### Nested Schema for `monitor_thresholds`

    Read-only:

    - **critical** (String)
    - **critical_recovery** (String)
    - **ok** (String)
    - **unknown** (String)
    - **warning** (String)
    - **warning_recovery** (String)
    """
    __args__ = dict()
    __args__['monitorTagsFilters'] = monitor_tags_filters
    __args__['nameFilter'] = name_filter
    __args__['tagsFilters'] = tags_filters
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('datadog:index/getMonitor:getMonitor', __args__, opts=opts, typ=GetMonitorResult).value

    return AwaitableGetMonitorResult(
        enable_logs_sample=__ret__.enable_logs_sample,
        escalation_message=__ret__.escalation_message,
        evaluation_delay=__ret__.evaluation_delay,
        id=__ret__.id,
        include_tags=__ret__.include_tags,
        locked=__ret__.locked,
        message=__ret__.message,
        monitor_tags_filters=__ret__.monitor_tags_filters,
        monitor_threshold_windows=__ret__.monitor_threshold_windows,
        monitor_thresholds=__ret__.monitor_thresholds,
        name=__ret__.name,
        name_filter=__ret__.name_filter,
        new_host_delay=__ret__.new_host_delay,
        no_data_timeframe=__ret__.no_data_timeframe,
        notify_audit=__ret__.notify_audit,
        notify_no_data=__ret__.notify_no_data,
        query=__ret__.query,
        renotify_interval=__ret__.renotify_interval,
        require_full_window=__ret__.require_full_window,
        tags=__ret__.tags,
        tags_filters=__ret__.tags_filters,
        threshold_windows=__ret__.threshold_windows,
        thresholds=__ret__.thresholds,
        timeout_h=__ret__.timeout_h,
        type=__ret__.type)
