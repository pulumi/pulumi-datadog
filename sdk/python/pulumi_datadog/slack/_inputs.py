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
from .. import _utilities

__all__ = [
    'ChannelDisplayArgs',
    'ChannelDisplayArgsDict',
]

MYPY = False

if not MYPY:
    class ChannelDisplayArgsDict(TypedDict):
        message: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Show the main body of the alert event. Defaults to `true`.
        """
        mute_buttons: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Show interactive buttons to mute the alerting monitor. Defaults to `true`.
        """
        notified: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Show the list of @-handles in the alert event. Defaults to `true`.
        """
        snapshot: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Show the alert event's snapshot image. Defaults to `true`.
        """
        tags: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Show the scopes on which the monitor alerted. Defaults to `true`.
        """
elif False:
    ChannelDisplayArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ChannelDisplayArgs:
    def __init__(__self__, *,
                 message: Optional[pulumi.Input[_builtins.bool]] = None,
                 mute_buttons: Optional[pulumi.Input[_builtins.bool]] = None,
                 notified: Optional[pulumi.Input[_builtins.bool]] = None,
                 snapshot: Optional[pulumi.Input[_builtins.bool]] = None,
                 tags: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        :param pulumi.Input[_builtins.bool] message: Show the main body of the alert event. Defaults to `true`.
        :param pulumi.Input[_builtins.bool] mute_buttons: Show interactive buttons to mute the alerting monitor. Defaults to `true`.
        :param pulumi.Input[_builtins.bool] notified: Show the list of @-handles in the alert event. Defaults to `true`.
        :param pulumi.Input[_builtins.bool] snapshot: Show the alert event's snapshot image. Defaults to `true`.
        :param pulumi.Input[_builtins.bool] tags: Show the scopes on which the monitor alerted. Defaults to `true`.
        """
        if message is not None:
            pulumi.set(__self__, "message", message)
        if mute_buttons is not None:
            pulumi.set(__self__, "mute_buttons", mute_buttons)
        if notified is not None:
            pulumi.set(__self__, "notified", notified)
        if snapshot is not None:
            pulumi.set(__self__, "snapshot", snapshot)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter
    def message(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Show the main body of the alert event. Defaults to `true`.
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "message", value)

    @_builtins.property
    @pulumi.getter(name="muteButtons")
    def mute_buttons(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Show interactive buttons to mute the alerting monitor. Defaults to `true`.
        """
        return pulumi.get(self, "mute_buttons")

    @mute_buttons.setter
    def mute_buttons(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "mute_buttons", value)

    @_builtins.property
    @pulumi.getter
    def notified(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Show the list of @-handles in the alert event. Defaults to `true`.
        """
        return pulumi.get(self, "notified")

    @notified.setter
    def notified(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "notified", value)

    @_builtins.property
    @pulumi.getter
    def snapshot(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Show the alert event's snapshot image. Defaults to `true`.
        """
        return pulumi.get(self, "snapshot")

    @snapshot.setter
    def snapshot(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "snapshot", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Show the scopes on which the monitor alerted. Defaults to `true`.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "tags", value)


