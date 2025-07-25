# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DowntimeArgs', 'Downtime']

@pulumi.input_type
class DowntimeArgs:
    def __init__(__self__, *,
                 scopes: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 end: Optional[pulumi.Input[_builtins.int]] = None,
                 end_date: Optional[pulumi.Input[_builtins.str]] = None,
                 message: Optional[pulumi.Input[_builtins.str]] = None,
                 monitor_id: Optional[pulumi.Input[_builtins.int]] = None,
                 monitor_tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 mute_first_recovery_notification: Optional[pulumi.Input[_builtins.bool]] = None,
                 recurrence: Optional[pulumi.Input['DowntimeRecurrenceArgs']] = None,
                 start: Optional[pulumi.Input[_builtins.int]] = None,
                 start_date: Optional[pulumi.Input[_builtins.str]] = None,
                 timezone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Downtime resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] scopes: specify the group scope to which this downtime applies. For everything use '*'
        :param pulumi.Input[_builtins.int] end: Optionally specify an end date when this downtime should expire. Accepts a Unix timestamp in UTC.
        :param pulumi.Input[_builtins.str] end_date: String representing date and time to end the downtime in RFC3339 format.
        :param pulumi.Input[_builtins.str] message: An optional message to provide when creating the downtime, can include notification handles
        :param pulumi.Input[_builtins.int] monitor_id: When specified, this downtime will only apply to this monitor
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] monitor_tags: A list of monitor tags (up to 32) to base the scheduled downtime on. Only monitors that have all selected tags are silenced
        :param pulumi.Input[_builtins.bool] mute_first_recovery_notification: When true the first recovery notification during the downtime will be muted Defaults to `false`.
        :param pulumi.Input['DowntimeRecurrenceArgs'] recurrence: Optional recurring schedule for this downtime
        :param pulumi.Input[_builtins.int] start: Specify when this downtime should start. Accepts a Unix timestamp in UTC.
        :param pulumi.Input[_builtins.str] start_date: String representing date and time to start the downtime in RFC3339 format.
        :param pulumi.Input[_builtins.str] timezone: The timezone for the downtime. Follows IANA timezone database identifiers. Defaults to `"UTC"`.
        """
        pulumi.set(__self__, "scopes", scopes)
        if end is not None:
            pulumi.set(__self__, "end", end)
        if end_date is not None:
            pulumi.set(__self__, "end_date", end_date)
        if message is not None:
            pulumi.set(__self__, "message", message)
        if monitor_id is not None:
            pulumi.set(__self__, "monitor_id", monitor_id)
        if monitor_tags is not None:
            pulumi.set(__self__, "monitor_tags", monitor_tags)
        if mute_first_recovery_notification is not None:
            pulumi.set(__self__, "mute_first_recovery_notification", mute_first_recovery_notification)
        if recurrence is not None:
            pulumi.set(__self__, "recurrence", recurrence)
        if start is not None:
            pulumi.set(__self__, "start", start)
        if start_date is not None:
            pulumi.set(__self__, "start_date", start_date)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)

    @_builtins.property
    @pulumi.getter
    def scopes(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        specify the group scope to which this downtime applies. For everything use '*'
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "scopes", value)

    @_builtins.property
    @pulumi.getter
    def end(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Optionally specify an end date when this downtime should expire. Accepts a Unix timestamp in UTC.
        """
        return pulumi.get(self, "end")

    @end.setter
    def end(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "end", value)

    @_builtins.property
    @pulumi.getter(name="endDate")
    def end_date(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        String representing date and time to end the downtime in RFC3339 format.
        """
        return pulumi.get(self, "end_date")

    @end_date.setter
    def end_date(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "end_date", value)

    @_builtins.property
    @pulumi.getter
    def message(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An optional message to provide when creating the downtime, can include notification handles
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "message", value)

    @_builtins.property
    @pulumi.getter(name="monitorId")
    def monitor_id(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        When specified, this downtime will only apply to this monitor
        """
        return pulumi.get(self, "monitor_id")

    @monitor_id.setter
    def monitor_id(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "monitor_id", value)

    @_builtins.property
    @pulumi.getter(name="monitorTags")
    def monitor_tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        A list of monitor tags (up to 32) to base the scheduled downtime on. Only monitors that have all selected tags are silenced
        """
        return pulumi.get(self, "monitor_tags")

    @monitor_tags.setter
    def monitor_tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "monitor_tags", value)

    @_builtins.property
    @pulumi.getter(name="muteFirstRecoveryNotification")
    def mute_first_recovery_notification(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        When true the first recovery notification during the downtime will be muted Defaults to `false`.
        """
        return pulumi.get(self, "mute_first_recovery_notification")

    @mute_first_recovery_notification.setter
    def mute_first_recovery_notification(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "mute_first_recovery_notification", value)

    @_builtins.property
    @pulumi.getter
    def recurrence(self) -> Optional[pulumi.Input['DowntimeRecurrenceArgs']]:
        """
        Optional recurring schedule for this downtime
        """
        return pulumi.get(self, "recurrence")

    @recurrence.setter
    def recurrence(self, value: Optional[pulumi.Input['DowntimeRecurrenceArgs']]):
        pulumi.set(self, "recurrence", value)

    @_builtins.property
    @pulumi.getter
    def start(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Specify when this downtime should start. Accepts a Unix timestamp in UTC.
        """
        return pulumi.get(self, "start")

    @start.setter
    def start(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "start", value)

    @_builtins.property
    @pulumi.getter(name="startDate")
    def start_date(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        String representing date and time to start the downtime in RFC3339 format.
        """
        return pulumi.get(self, "start_date")

    @start_date.setter
    def start_date(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "start_date", value)

    @_builtins.property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The timezone for the downtime. Follows IANA timezone database identifiers. Defaults to `"UTC"`.
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "timezone", value)


@pulumi.input_type
class _DowntimeState:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 active_child_id: Optional[pulumi.Input[_builtins.int]] = None,
                 disabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 end: Optional[pulumi.Input[_builtins.int]] = None,
                 end_date: Optional[pulumi.Input[_builtins.str]] = None,
                 message: Optional[pulumi.Input[_builtins.str]] = None,
                 monitor_id: Optional[pulumi.Input[_builtins.int]] = None,
                 monitor_tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 mute_first_recovery_notification: Optional[pulumi.Input[_builtins.bool]] = None,
                 recurrence: Optional[pulumi.Input['DowntimeRecurrenceArgs']] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 start: Optional[pulumi.Input[_builtins.int]] = None,
                 start_date: Optional[pulumi.Input[_builtins.str]] = None,
                 timezone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Downtime resources.
        :param pulumi.Input[_builtins.bool] active: When true indicates this downtime is being actively applied
        :param pulumi.Input[_builtins.int] active_child_id: The id corresponding to the downtime object definition of the active child for the original parent recurring downtime. This field will only exist on recurring downtimes.
        :param pulumi.Input[_builtins.bool] disabled: When true indicates this downtime is not being applied
        :param pulumi.Input[_builtins.int] end: Optionally specify an end date when this downtime should expire. Accepts a Unix timestamp in UTC.
        :param pulumi.Input[_builtins.str] end_date: String representing date and time to end the downtime in RFC3339 format.
        :param pulumi.Input[_builtins.str] message: An optional message to provide when creating the downtime, can include notification handles
        :param pulumi.Input[_builtins.int] monitor_id: When specified, this downtime will only apply to this monitor
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] monitor_tags: A list of monitor tags (up to 32) to base the scheduled downtime on. Only monitors that have all selected tags are silenced
        :param pulumi.Input[_builtins.bool] mute_first_recovery_notification: When true the first recovery notification during the downtime will be muted Defaults to `false`.
        :param pulumi.Input['DowntimeRecurrenceArgs'] recurrence: Optional recurring schedule for this downtime
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] scopes: specify the group scope to which this downtime applies. For everything use '*'
        :param pulumi.Input[_builtins.int] start: Specify when this downtime should start. Accepts a Unix timestamp in UTC.
        :param pulumi.Input[_builtins.str] start_date: String representing date and time to start the downtime in RFC3339 format.
        :param pulumi.Input[_builtins.str] timezone: The timezone for the downtime. Follows IANA timezone database identifiers. Defaults to `"UTC"`.
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if active_child_id is not None:
            pulumi.set(__self__, "active_child_id", active_child_id)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if end is not None:
            pulumi.set(__self__, "end", end)
        if end_date is not None:
            pulumi.set(__self__, "end_date", end_date)
        if message is not None:
            pulumi.set(__self__, "message", message)
        if monitor_id is not None:
            pulumi.set(__self__, "monitor_id", monitor_id)
        if monitor_tags is not None:
            pulumi.set(__self__, "monitor_tags", monitor_tags)
        if mute_first_recovery_notification is not None:
            pulumi.set(__self__, "mute_first_recovery_notification", mute_first_recovery_notification)
        if recurrence is not None:
            pulumi.set(__self__, "recurrence", recurrence)
        if scopes is not None:
            pulumi.set(__self__, "scopes", scopes)
        if start is not None:
            pulumi.set(__self__, "start", start)
        if start_date is not None:
            pulumi.set(__self__, "start_date", start_date)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)

    @_builtins.property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        When true indicates this downtime is being actively applied
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "active", value)

    @_builtins.property
    @pulumi.getter(name="activeChildId")
    def active_child_id(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The id corresponding to the downtime object definition of the active child for the original parent recurring downtime. This field will only exist on recurring downtimes.
        """
        return pulumi.get(self, "active_child_id")

    @active_child_id.setter
    def active_child_id(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "active_child_id", value)

    @_builtins.property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        When true indicates this downtime is not being applied
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "disabled", value)

    @_builtins.property
    @pulumi.getter
    def end(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Optionally specify an end date when this downtime should expire. Accepts a Unix timestamp in UTC.
        """
        return pulumi.get(self, "end")

    @end.setter
    def end(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "end", value)

    @_builtins.property
    @pulumi.getter(name="endDate")
    def end_date(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        String representing date and time to end the downtime in RFC3339 format.
        """
        return pulumi.get(self, "end_date")

    @end_date.setter
    def end_date(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "end_date", value)

    @_builtins.property
    @pulumi.getter
    def message(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An optional message to provide when creating the downtime, can include notification handles
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "message", value)

    @_builtins.property
    @pulumi.getter(name="monitorId")
    def monitor_id(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        When specified, this downtime will only apply to this monitor
        """
        return pulumi.get(self, "monitor_id")

    @monitor_id.setter
    def monitor_id(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "monitor_id", value)

    @_builtins.property
    @pulumi.getter(name="monitorTags")
    def monitor_tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        A list of monitor tags (up to 32) to base the scheduled downtime on. Only monitors that have all selected tags are silenced
        """
        return pulumi.get(self, "monitor_tags")

    @monitor_tags.setter
    def monitor_tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "monitor_tags", value)

    @_builtins.property
    @pulumi.getter(name="muteFirstRecoveryNotification")
    def mute_first_recovery_notification(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        When true the first recovery notification during the downtime will be muted Defaults to `false`.
        """
        return pulumi.get(self, "mute_first_recovery_notification")

    @mute_first_recovery_notification.setter
    def mute_first_recovery_notification(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "mute_first_recovery_notification", value)

    @_builtins.property
    @pulumi.getter
    def recurrence(self) -> Optional[pulumi.Input['DowntimeRecurrenceArgs']]:
        """
        Optional recurring schedule for this downtime
        """
        return pulumi.get(self, "recurrence")

    @recurrence.setter
    def recurrence(self, value: Optional[pulumi.Input['DowntimeRecurrenceArgs']]):
        pulumi.set(self, "recurrence", value)

    @_builtins.property
    @pulumi.getter
    def scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        specify the group scope to which this downtime applies. For everything use '*'
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "scopes", value)

    @_builtins.property
    @pulumi.getter
    def start(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Specify when this downtime should start. Accepts a Unix timestamp in UTC.
        """
        return pulumi.get(self, "start")

    @start.setter
    def start(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "start", value)

    @_builtins.property
    @pulumi.getter(name="startDate")
    def start_date(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        String representing date and time to start the downtime in RFC3339 format.
        """
        return pulumi.get(self, "start_date")

    @start_date.setter
    def start_date(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "start_date", value)

    @_builtins.property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The timezone for the downtime. Follows IANA timezone database identifiers. Defaults to `"UTC"`.
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "timezone", value)


@pulumi.type_token("datadog:index/downtime:Downtime")
class Downtime(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 end: Optional[pulumi.Input[_builtins.int]] = None,
                 end_date: Optional[pulumi.Input[_builtins.str]] = None,
                 message: Optional[pulumi.Input[_builtins.str]] = None,
                 monitor_id: Optional[pulumi.Input[_builtins.int]] = None,
                 monitor_tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 mute_first_recovery_notification: Optional[pulumi.Input[_builtins.bool]] = None,
                 recurrence: Optional[pulumi.Input[Union['DowntimeRecurrenceArgs', 'DowntimeRecurrenceArgsDict']]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 start: Optional[pulumi.Input[_builtins.int]] = None,
                 start_date: Optional[pulumi.Input[_builtins.str]] = None,
                 timezone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        This resource is deprecated — use the `DowntimeSchedule resource` instead. Provides a Datadog downtime resource. This can be used to create and manage Datadog downtimes.

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import datadog:index/downtime:Downtime bytes_received_localhost 2081
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] end: Optionally specify an end date when this downtime should expire. Accepts a Unix timestamp in UTC.
        :param pulumi.Input[_builtins.str] end_date: String representing date and time to end the downtime in RFC3339 format.
        :param pulumi.Input[_builtins.str] message: An optional message to provide when creating the downtime, can include notification handles
        :param pulumi.Input[_builtins.int] monitor_id: When specified, this downtime will only apply to this monitor
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] monitor_tags: A list of monitor tags (up to 32) to base the scheduled downtime on. Only monitors that have all selected tags are silenced
        :param pulumi.Input[_builtins.bool] mute_first_recovery_notification: When true the first recovery notification during the downtime will be muted Defaults to `false`.
        :param pulumi.Input[Union['DowntimeRecurrenceArgs', 'DowntimeRecurrenceArgsDict']] recurrence: Optional recurring schedule for this downtime
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] scopes: specify the group scope to which this downtime applies. For everything use '*'
        :param pulumi.Input[_builtins.int] start: Specify when this downtime should start. Accepts a Unix timestamp in UTC.
        :param pulumi.Input[_builtins.str] start_date: String representing date and time to start the downtime in RFC3339 format.
        :param pulumi.Input[_builtins.str] timezone: The timezone for the downtime. Follows IANA timezone database identifiers. Defaults to `"UTC"`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DowntimeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource is deprecated — use the `DowntimeSchedule resource` instead. Provides a Datadog downtime resource. This can be used to create and manage Datadog downtimes.

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import datadog:index/downtime:Downtime bytes_received_localhost 2081
        ```

        :param str resource_name: The name of the resource.
        :param DowntimeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DowntimeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 end: Optional[pulumi.Input[_builtins.int]] = None,
                 end_date: Optional[pulumi.Input[_builtins.str]] = None,
                 message: Optional[pulumi.Input[_builtins.str]] = None,
                 monitor_id: Optional[pulumi.Input[_builtins.int]] = None,
                 monitor_tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 mute_first_recovery_notification: Optional[pulumi.Input[_builtins.bool]] = None,
                 recurrence: Optional[pulumi.Input[Union['DowntimeRecurrenceArgs', 'DowntimeRecurrenceArgsDict']]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 start: Optional[pulumi.Input[_builtins.int]] = None,
                 start_date: Optional[pulumi.Input[_builtins.str]] = None,
                 timezone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DowntimeArgs.__new__(DowntimeArgs)

            __props__.__dict__["end"] = end
            __props__.__dict__["end_date"] = end_date
            __props__.__dict__["message"] = message
            __props__.__dict__["monitor_id"] = monitor_id
            __props__.__dict__["monitor_tags"] = monitor_tags
            __props__.__dict__["mute_first_recovery_notification"] = mute_first_recovery_notification
            __props__.__dict__["recurrence"] = recurrence
            if scopes is None and not opts.urn:
                raise TypeError("Missing required property 'scopes'")
            __props__.__dict__["scopes"] = scopes
            __props__.__dict__["start"] = start
            __props__.__dict__["start_date"] = start_date
            __props__.__dict__["timezone"] = timezone
            __props__.__dict__["active"] = None
            __props__.__dict__["active_child_id"] = None
            __props__.__dict__["disabled"] = None
        super(Downtime, __self__).__init__(
            'datadog:index/downtime:Downtime',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[_builtins.bool]] = None,
            active_child_id: Optional[pulumi.Input[_builtins.int]] = None,
            disabled: Optional[pulumi.Input[_builtins.bool]] = None,
            end: Optional[pulumi.Input[_builtins.int]] = None,
            end_date: Optional[pulumi.Input[_builtins.str]] = None,
            message: Optional[pulumi.Input[_builtins.str]] = None,
            monitor_id: Optional[pulumi.Input[_builtins.int]] = None,
            monitor_tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            mute_first_recovery_notification: Optional[pulumi.Input[_builtins.bool]] = None,
            recurrence: Optional[pulumi.Input[Union['DowntimeRecurrenceArgs', 'DowntimeRecurrenceArgsDict']]] = None,
            scopes: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            start: Optional[pulumi.Input[_builtins.int]] = None,
            start_date: Optional[pulumi.Input[_builtins.str]] = None,
            timezone: Optional[pulumi.Input[_builtins.str]] = None) -> 'Downtime':
        """
        Get an existing Downtime resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] active: When true indicates this downtime is being actively applied
        :param pulumi.Input[_builtins.int] active_child_id: The id corresponding to the downtime object definition of the active child for the original parent recurring downtime. This field will only exist on recurring downtimes.
        :param pulumi.Input[_builtins.bool] disabled: When true indicates this downtime is not being applied
        :param pulumi.Input[_builtins.int] end: Optionally specify an end date when this downtime should expire. Accepts a Unix timestamp in UTC.
        :param pulumi.Input[_builtins.str] end_date: String representing date and time to end the downtime in RFC3339 format.
        :param pulumi.Input[_builtins.str] message: An optional message to provide when creating the downtime, can include notification handles
        :param pulumi.Input[_builtins.int] monitor_id: When specified, this downtime will only apply to this monitor
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] monitor_tags: A list of monitor tags (up to 32) to base the scheduled downtime on. Only monitors that have all selected tags are silenced
        :param pulumi.Input[_builtins.bool] mute_first_recovery_notification: When true the first recovery notification during the downtime will be muted Defaults to `false`.
        :param pulumi.Input[Union['DowntimeRecurrenceArgs', 'DowntimeRecurrenceArgsDict']] recurrence: Optional recurring schedule for this downtime
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] scopes: specify the group scope to which this downtime applies. For everything use '*'
        :param pulumi.Input[_builtins.int] start: Specify when this downtime should start. Accepts a Unix timestamp in UTC.
        :param pulumi.Input[_builtins.str] start_date: String representing date and time to start the downtime in RFC3339 format.
        :param pulumi.Input[_builtins.str] timezone: The timezone for the downtime. Follows IANA timezone database identifiers. Defaults to `"UTC"`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DowntimeState.__new__(_DowntimeState)

        __props__.__dict__["active"] = active
        __props__.__dict__["active_child_id"] = active_child_id
        __props__.__dict__["disabled"] = disabled
        __props__.__dict__["end"] = end
        __props__.__dict__["end_date"] = end_date
        __props__.__dict__["message"] = message
        __props__.__dict__["monitor_id"] = monitor_id
        __props__.__dict__["monitor_tags"] = monitor_tags
        __props__.__dict__["mute_first_recovery_notification"] = mute_first_recovery_notification
        __props__.__dict__["recurrence"] = recurrence
        __props__.__dict__["scopes"] = scopes
        __props__.__dict__["start"] = start
        __props__.__dict__["start_date"] = start_date
        __props__.__dict__["timezone"] = timezone
        return Downtime(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def active(self) -> pulumi.Output[_builtins.bool]:
        """
        When true indicates this downtime is being actively applied
        """
        return pulumi.get(self, "active")

    @_builtins.property
    @pulumi.getter(name="activeChildId")
    def active_child_id(self) -> pulumi.Output[_builtins.int]:
        """
        The id corresponding to the downtime object definition of the active child for the original parent recurring downtime. This field will only exist on recurring downtimes.
        """
        return pulumi.get(self, "active_child_id")

    @_builtins.property
    @pulumi.getter
    def disabled(self) -> pulumi.Output[_builtins.bool]:
        """
        When true indicates this downtime is not being applied
        """
        return pulumi.get(self, "disabled")

    @_builtins.property
    @pulumi.getter
    def end(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Optionally specify an end date when this downtime should expire. Accepts a Unix timestamp in UTC.
        """
        return pulumi.get(self, "end")

    @_builtins.property
    @pulumi.getter(name="endDate")
    def end_date(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        String representing date and time to end the downtime in RFC3339 format.
        """
        return pulumi.get(self, "end_date")

    @_builtins.property
    @pulumi.getter
    def message(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        An optional message to provide when creating the downtime, can include notification handles
        """
        return pulumi.get(self, "message")

    @_builtins.property
    @pulumi.getter(name="monitorId")
    def monitor_id(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        When specified, this downtime will only apply to this monitor
        """
        return pulumi.get(self, "monitor_id")

    @_builtins.property
    @pulumi.getter(name="monitorTags")
    def monitor_tags(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        A list of monitor tags (up to 32) to base the scheduled downtime on. Only monitors that have all selected tags are silenced
        """
        return pulumi.get(self, "monitor_tags")

    @_builtins.property
    @pulumi.getter(name="muteFirstRecoveryNotification")
    def mute_first_recovery_notification(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        When true the first recovery notification during the downtime will be muted Defaults to `false`.
        """
        return pulumi.get(self, "mute_first_recovery_notification")

    @_builtins.property
    @pulumi.getter
    def recurrence(self) -> pulumi.Output[Optional['outputs.DowntimeRecurrence']]:
        """
        Optional recurring schedule for this downtime
        """
        return pulumi.get(self, "recurrence")

    @_builtins.property
    @pulumi.getter
    def scopes(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        specify the group scope to which this downtime applies. For everything use '*'
        """
        return pulumi.get(self, "scopes")

    @_builtins.property
    @pulumi.getter
    def start(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Specify when this downtime should start. Accepts a Unix timestamp in UTC.
        """
        return pulumi.get(self, "start")

    @_builtins.property
    @pulumi.getter(name="startDate")
    def start_date(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        String representing date and time to start the downtime in RFC3339 format.
        """
        return pulumi.get(self, "start_date")

    @_builtins.property
    @pulumi.getter
    def timezone(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The timezone for the downtime. Follows IANA timezone database identifiers. Defaults to `"UTC"`.
        """
        return pulumi.get(self, "timezone")

