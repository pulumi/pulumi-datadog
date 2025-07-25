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

__all__ = ['IntegrationServiceArgs', 'IntegrationService']

@pulumi.input_type
class IntegrationServiceArgs:
    def __init__(__self__, *,
                 service_id: pulumi.Input[_builtins.str],
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a IntegrationService resource.
        :param pulumi.Input[_builtins.str] service_id: The ID of the Fastly service.
        :param pulumi.Input[_builtins.str] account_id: Fastly Account id.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: A list of tags for the Fastly service.
        """
        pulumi.set(__self__, "service_id", service_id)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Fastly service.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "service_id", value)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Fastly Account id.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        A list of tags for the Fastly service.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _IntegrationServiceState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 service_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering IntegrationService resources.
        :param pulumi.Input[_builtins.str] account_id: Fastly Account id.
        :param pulumi.Input[_builtins.str] service_id: The ID of the Fastly service.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: A list of tags for the Fastly service.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Fastly Account id.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Fastly service.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "service_id", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        A list of tags for the Fastly service.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.type_token("datadog:fastly/integrationService:IntegrationService")
class IntegrationService(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 service_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Provides a Datadog IntegrationFastlyService resource. This can be used to create and manage Datadog integration_fastly_service.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        foo = datadog.fastly.IntegrationAccount("foo",
            api_key="ABCDEFG123",
            name="test-name")
        # Create new integration_fastly_service resource
        foo_integration_service = datadog.fastly.IntegrationService("foo",
            account_id=foo.id,
            tags=[
                "mytag",
                "mytag2:myvalue",
            ],
            service_id="my-service-id")
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import datadog:fastly/integrationService:IntegrationService new_list "account-id:service-id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: Fastly Account id.
        :param pulumi.Input[_builtins.str] service_id: The ID of the Fastly service.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: A list of tags for the Fastly service.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IntegrationServiceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Datadog IntegrationFastlyService resource. This can be used to create and manage Datadog integration_fastly_service.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        foo = datadog.fastly.IntegrationAccount("foo",
            api_key="ABCDEFG123",
            name="test-name")
        # Create new integration_fastly_service resource
        foo_integration_service = datadog.fastly.IntegrationService("foo",
            account_id=foo.id,
            tags=[
                "mytag",
                "mytag2:myvalue",
            ],
            service_id="my-service-id")
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import datadog:fastly/integrationService:IntegrationService new_list "account-id:service-id"
        ```

        :param str resource_name: The name of the resource.
        :param IntegrationServiceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IntegrationServiceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 service_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IntegrationServiceArgs.__new__(IntegrationServiceArgs)

            __props__.__dict__["account_id"] = account_id
            if service_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_id'")
            __props__.__dict__["service_id"] = service_id
            __props__.__dict__["tags"] = tags
        super(IntegrationService, __self__).__init__(
            'datadog:fastly/integrationService:IntegrationService',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            service_id: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None) -> 'IntegrationService':
        """
        Get an existing IntegrationService resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: Fastly Account id.
        :param pulumi.Input[_builtins.str] service_id: The ID of the Fastly service.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: A list of tags for the Fastly service.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IntegrationServiceState.__new__(_IntegrationServiceState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["service_id"] = service_id
        __props__.__dict__["tags"] = tags
        return IntegrationService(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Fastly Account id.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Fastly service.
        """
        return pulumi.get(self, "service_id")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        A list of tags for the Fastly service.
        """
        return pulumi.get(self, "tags")

