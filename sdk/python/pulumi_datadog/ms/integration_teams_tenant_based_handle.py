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

__all__ = ['IntegrationTeamsTenantBasedHandleArgs', 'IntegrationTeamsTenantBasedHandle']

@pulumi.input_type
class IntegrationTeamsTenantBasedHandleArgs:
    def __init__(__self__, *,
                 channel_name: pulumi.Input[_builtins.str],
                 name: pulumi.Input[_builtins.str],
                 team_name: pulumi.Input[_builtins.str],
                 tenant_name: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a IntegrationTeamsTenantBasedHandle resource.
        :param pulumi.Input[_builtins.str] channel_name: Your channel name.
        :param pulumi.Input[_builtins.str] name: Your tenant-based handle name.
        :param pulumi.Input[_builtins.str] team_name: Your team name.
        :param pulumi.Input[_builtins.str] tenant_name: Your tenant name.
        """
        pulumi.set(__self__, "channel_name", channel_name)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "team_name", team_name)
        pulumi.set(__self__, "tenant_name", tenant_name)

    @_builtins.property
    @pulumi.getter(name="channelName")
    def channel_name(self) -> pulumi.Input[_builtins.str]:
        """
        Your channel name.
        """
        return pulumi.get(self, "channel_name")

    @channel_name.setter
    def channel_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "channel_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Input[_builtins.str]:
        """
        Your tenant-based handle name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="teamName")
    def team_name(self) -> pulumi.Input[_builtins.str]:
        """
        Your team name.
        """
        return pulumi.get(self, "team_name")

    @team_name.setter
    def team_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "team_name", value)

    @_builtins.property
    @pulumi.getter(name="tenantName")
    def tenant_name(self) -> pulumi.Input[_builtins.str]:
        """
        Your tenant name.
        """
        return pulumi.get(self, "tenant_name")

    @tenant_name.setter
    def tenant_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "tenant_name", value)


@pulumi.input_type
class _IntegrationTeamsTenantBasedHandleState:
    def __init__(__self__, *,
                 channel_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 team_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tenant_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering IntegrationTeamsTenantBasedHandle resources.
        :param pulumi.Input[_builtins.str] channel_name: Your channel name.
        :param pulumi.Input[_builtins.str] name: Your tenant-based handle name.
        :param pulumi.Input[_builtins.str] team_name: Your team name.
        :param pulumi.Input[_builtins.str] tenant_name: Your tenant name.
        """
        if channel_name is not None:
            pulumi.set(__self__, "channel_name", channel_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if team_name is not None:
            pulumi.set(__self__, "team_name", team_name)
        if tenant_name is not None:
            pulumi.set(__self__, "tenant_name", tenant_name)

    @_builtins.property
    @pulumi.getter(name="channelName")
    def channel_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Your channel name.
        """
        return pulumi.get(self, "channel_name")

    @channel_name.setter
    def channel_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "channel_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Your tenant-based handle name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="teamName")
    def team_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Your team name.
        """
        return pulumi.get(self, "team_name")

    @team_name.setter
    def team_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "team_name", value)

    @_builtins.property
    @pulumi.getter(name="tenantName")
    def tenant_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Your tenant name.
        """
        return pulumi.get(self, "tenant_name")

    @tenant_name.setter
    def tenant_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tenant_name", value)


@pulumi.type_token("datadog:ms/integrationTeamsTenantBasedHandle:IntegrationTeamsTenantBasedHandle")
class IntegrationTeamsTenantBasedHandle(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 channel_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 team_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tenant_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Resource for interacting with Datadog Microsoft Teams Integration tenant-based handles.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] channel_name: Your channel name.
        :param pulumi.Input[_builtins.str] name: Your tenant-based handle name.
        :param pulumi.Input[_builtins.str] team_name: Your team name.
        :param pulumi.Input[_builtins.str] tenant_name: Your tenant name.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IntegrationTeamsTenantBasedHandleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for interacting with Datadog Microsoft Teams Integration tenant-based handles.

        :param str resource_name: The name of the resource.
        :param IntegrationTeamsTenantBasedHandleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IntegrationTeamsTenantBasedHandleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 channel_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 team_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tenant_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IntegrationTeamsTenantBasedHandleArgs.__new__(IntegrationTeamsTenantBasedHandleArgs)

            if channel_name is None and not opts.urn:
                raise TypeError("Missing required property 'channel_name'")
            __props__.__dict__["channel_name"] = channel_name
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if team_name is None and not opts.urn:
                raise TypeError("Missing required property 'team_name'")
            __props__.__dict__["team_name"] = team_name
            if tenant_name is None and not opts.urn:
                raise TypeError("Missing required property 'tenant_name'")
            __props__.__dict__["tenant_name"] = tenant_name
        super(IntegrationTeamsTenantBasedHandle, __self__).__init__(
            'datadog:ms/integrationTeamsTenantBasedHandle:IntegrationTeamsTenantBasedHandle',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            channel_name: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            team_name: Optional[pulumi.Input[_builtins.str]] = None,
            tenant_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'IntegrationTeamsTenantBasedHandle':
        """
        Get an existing IntegrationTeamsTenantBasedHandle resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] channel_name: Your channel name.
        :param pulumi.Input[_builtins.str] name: Your tenant-based handle name.
        :param pulumi.Input[_builtins.str] team_name: Your team name.
        :param pulumi.Input[_builtins.str] tenant_name: Your tenant name.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IntegrationTeamsTenantBasedHandleState.__new__(_IntegrationTeamsTenantBasedHandleState)

        __props__.__dict__["channel_name"] = channel_name
        __props__.__dict__["name"] = name
        __props__.__dict__["team_name"] = team_name
        __props__.__dict__["tenant_name"] = tenant_name
        return IntegrationTeamsTenantBasedHandle(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="channelName")
    def channel_name(self) -> pulumi.Output[_builtins.str]:
        """
        Your channel name.
        """
        return pulumi.get(self, "channel_name")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Your tenant-based handle name.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="teamName")
    def team_name(self) -> pulumi.Output[_builtins.str]:
        """
        Your team name.
        """
        return pulumi.get(self, "team_name")

    @_builtins.property
    @pulumi.getter(name="tenantName")
    def tenant_name(self) -> pulumi.Output[_builtins.str]:
        """
        Your tenant name.
        """
        return pulumi.get(self, "tenant_name")

