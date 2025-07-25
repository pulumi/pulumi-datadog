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

__all__ = ['OrganizationSettingsArgs', 'OrganizationSettings']

@pulumi.input_type
class OrganizationSettingsArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 security_contacts: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 settings: Optional[pulumi.Input['OrganizationSettingsSettingsArgs']] = None):
        """
        The set of arguments for constructing a OrganizationSettings resource.
        :param pulumi.Input[_builtins.str] name: Name for Organization.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] security_contacts: List of emails used for security event notifications from the organization.
        :param pulumi.Input['OrganizationSettingsSettingsArgs'] settings: Organization settings
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if security_contacts is not None:
            pulumi.set(__self__, "security_contacts", security_contacts)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name for Organization.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="securityContacts")
    def security_contacts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of emails used for security event notifications from the organization.
        """
        return pulumi.get(self, "security_contacts")

    @security_contacts.setter
    def security_contacts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "security_contacts", value)

    @_builtins.property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input['OrganizationSettingsSettingsArgs']]:
        """
        Organization settings
        """
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input['OrganizationSettingsSettingsArgs']]):
        pulumi.set(self, "settings", value)


@pulumi.input_type
class _OrganizationSettingsState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 public_id: Optional[pulumi.Input[_builtins.str]] = None,
                 security_contacts: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 settings: Optional[pulumi.Input['OrganizationSettingsSettingsArgs']] = None):
        """
        Input properties used for looking up and filtering OrganizationSettings resources.
        :param pulumi.Input[_builtins.str] description: Description of the organization.
        :param pulumi.Input[_builtins.str] name: Name for Organization.
        :param pulumi.Input[_builtins.str] public_id: The `public_id` of the organization you are operating within.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] security_contacts: List of emails used for security event notifications from the organization.
        :param pulumi.Input['OrganizationSettingsSettingsArgs'] settings: Organization settings
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if public_id is not None:
            pulumi.set(__self__, "public_id", public_id)
        if security_contacts is not None:
            pulumi.set(__self__, "security_contacts", security_contacts)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of the organization.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name for Organization.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="publicId")
    def public_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The `public_id` of the organization you are operating within.
        """
        return pulumi.get(self, "public_id")

    @public_id.setter
    def public_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "public_id", value)

    @_builtins.property
    @pulumi.getter(name="securityContacts")
    def security_contacts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of emails used for security event notifications from the organization.
        """
        return pulumi.get(self, "security_contacts")

    @security_contacts.setter
    def security_contacts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "security_contacts", value)

    @_builtins.property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input['OrganizationSettingsSettingsArgs']]:
        """
        Organization settings
        """
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input['OrganizationSettingsSettingsArgs']]):
        pulumi.set(self, "settings", value)


@pulumi.type_token("datadog:index/organizationSettings:OrganizationSettings")
class OrganizationSettings(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 security_contacts: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 settings: Optional[pulumi.Input[Union['OrganizationSettingsSettingsArgs', 'OrganizationSettingsSettingsArgsDict']]] = None,
                 __props__=None):
        """
        Provides a Datadog Organization resource. This can be used to manage your Datadog organization's settings.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        # Manage Datadog Organization
        organization = datadog.OrganizationSettings("organization", name="foo-organization")
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import datadog:index/organizationSettings:OrganizationSettings organization 11111111-2222-3333-4444-555555555555
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: Name for Organization.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] security_contacts: List of emails used for security event notifications from the organization.
        :param pulumi.Input[Union['OrganizationSettingsSettingsArgs', 'OrganizationSettingsSettingsArgsDict']] settings: Organization settings
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[OrganizationSettingsArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Datadog Organization resource. This can be used to manage your Datadog organization's settings.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        # Manage Datadog Organization
        organization = datadog.OrganizationSettings("organization", name="foo-organization")
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import datadog:index/organizationSettings:OrganizationSettings organization 11111111-2222-3333-4444-555555555555
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationSettingsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationSettingsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 security_contacts: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 settings: Optional[pulumi.Input[Union['OrganizationSettingsSettingsArgs', 'OrganizationSettingsSettingsArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationSettingsArgs.__new__(OrganizationSettingsArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["security_contacts"] = security_contacts
            __props__.__dict__["settings"] = settings
            __props__.__dict__["description"] = None
            __props__.__dict__["public_id"] = None
        super(OrganizationSettings, __self__).__init__(
            'datadog:index/organizationSettings:OrganizationSettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            public_id: Optional[pulumi.Input[_builtins.str]] = None,
            security_contacts: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            settings: Optional[pulumi.Input[Union['OrganizationSettingsSettingsArgs', 'OrganizationSettingsSettingsArgsDict']]] = None) -> 'OrganizationSettings':
        """
        Get an existing OrganizationSettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: Description of the organization.
        :param pulumi.Input[_builtins.str] name: Name for Organization.
        :param pulumi.Input[_builtins.str] public_id: The `public_id` of the organization you are operating within.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] security_contacts: List of emails used for security event notifications from the organization.
        :param pulumi.Input[Union['OrganizationSettingsSettingsArgs', 'OrganizationSettingsSettingsArgsDict']] settings: Organization settings
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationSettingsState.__new__(_OrganizationSettingsState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["public_id"] = public_id
        __props__.__dict__["security_contacts"] = security_contacts
        __props__.__dict__["settings"] = settings
        return OrganizationSettings(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[_builtins.str]:
        """
        Description of the organization.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Name for Organization.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="publicId")
    def public_id(self) -> pulumi.Output[_builtins.str]:
        """
        The `public_id` of the organization you are operating within.
        """
        return pulumi.get(self, "public_id")

    @_builtins.property
    @pulumi.getter(name="securityContacts")
    def security_contacts(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        List of emails used for security event notifications from the organization.
        """
        return pulumi.get(self, "security_contacts")

    @_builtins.property
    @pulumi.getter
    def settings(self) -> pulumi.Output['outputs.OrganizationSettingsSettings']:
        """
        Organization settings
        """
        return pulumi.get(self, "settings")

