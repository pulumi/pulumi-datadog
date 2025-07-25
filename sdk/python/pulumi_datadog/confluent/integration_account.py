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

__all__ = ['IntegrationAccountArgs', 'IntegrationAccount']

@pulumi.input_type
class IntegrationAccountArgs:
    def __init__(__self__, *,
                 api_key: pulumi.Input[_builtins.str],
                 api_secret: pulumi.Input[_builtins.str],
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a IntegrationAccount resource.
        :param pulumi.Input[_builtins.str] api_key: The API key associated with your Confluent account.
        :param pulumi.Input[_builtins.str] api_secret: The API secret associated with your Confluent account.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
        """
        pulumi.set(__self__, "api_key", api_key)
        pulumi.set(__self__, "api_secret", api_secret)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> pulumi.Input[_builtins.str]:
        """
        The API key associated with your Confluent account.
        """
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "api_key", value)

    @_builtins.property
    @pulumi.getter(name="apiSecret")
    def api_secret(self) -> pulumi.Input[_builtins.str]:
        """
        The API secret associated with your Confluent account.
        """
        return pulumi.get(self, "api_secret")

    @api_secret.setter
    def api_secret(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "api_secret", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _IntegrationAccountState:
    def __init__(__self__, *,
                 api_key: Optional[pulumi.Input[_builtins.str]] = None,
                 api_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering IntegrationAccount resources.
        :param pulumi.Input[_builtins.str] api_key: The API key associated with your Confluent account.
        :param pulumi.Input[_builtins.str] api_secret: The API secret associated with your Confluent account.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
        """
        if api_key is not None:
            pulumi.set(__self__, "api_key", api_key)
        if api_secret is not None:
            pulumi.set(__self__, "api_secret", api_secret)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The API key associated with your Confluent account.
        """
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "api_key", value)

    @_builtins.property
    @pulumi.getter(name="apiSecret")
    def api_secret(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The API secret associated with your Confluent account.
        """
        return pulumi.get(self, "api_secret")

    @api_secret.setter
    def api_secret(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "api_secret", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.type_token("datadog:confluent/integrationAccount:IntegrationAccount")
class IntegrationAccount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_key: Optional[pulumi.Input[_builtins.str]] = None,
                 api_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Provides a Datadog IntegrationConfluentAccount resource. This can be used to create and manage Datadog integration_confluent_account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        # Create new integration_confluent_account resource
        foo = datadog.confluent.IntegrationAccount("foo",
            api_key="TESTAPIKEY123",
            api_secret="test-api-secret-123",
            tags=[
                "mytag",
                "mytag2:myvalue",
            ])
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        Confluent account ID can be retrieved using the ListConfluentAccounts endpoint

        https://docs.datadoghq.com/api/latest/confluent-cloud/#list-confluent-accounts

        ```sh
        $ pulumi import datadog:confluent/integrationAccount:IntegrationAccount new_list "<ID>"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] api_key: The API key associated with your Confluent account.
        :param pulumi.Input[_builtins.str] api_secret: The API secret associated with your Confluent account.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IntegrationAccountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Datadog IntegrationConfluentAccount resource. This can be used to create and manage Datadog integration_confluent_account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        # Create new integration_confluent_account resource
        foo = datadog.confluent.IntegrationAccount("foo",
            api_key="TESTAPIKEY123",
            api_secret="test-api-secret-123",
            tags=[
                "mytag",
                "mytag2:myvalue",
            ])
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        Confluent account ID can be retrieved using the ListConfluentAccounts endpoint

        https://docs.datadoghq.com/api/latest/confluent-cloud/#list-confluent-accounts

        ```sh
        $ pulumi import datadog:confluent/integrationAccount:IntegrationAccount new_list "<ID>"
        ```

        :param str resource_name: The name of the resource.
        :param IntegrationAccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IntegrationAccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_key: Optional[pulumi.Input[_builtins.str]] = None,
                 api_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IntegrationAccountArgs.__new__(IntegrationAccountArgs)

            if api_key is None and not opts.urn:
                raise TypeError("Missing required property 'api_key'")
            __props__.__dict__["api_key"] = api_key
            if api_secret is None and not opts.urn:
                raise TypeError("Missing required property 'api_secret'")
            __props__.__dict__["api_secret"] = None if api_secret is None else pulumi.Output.secret(api_secret)
            __props__.__dict__["tags"] = tags
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["apiSecret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(IntegrationAccount, __self__).__init__(
            'datadog:confluent/integrationAccount:IntegrationAccount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_key: Optional[pulumi.Input[_builtins.str]] = None,
            api_secret: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None) -> 'IntegrationAccount':
        """
        Get an existing IntegrationAccount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] api_key: The API key associated with your Confluent account.
        :param pulumi.Input[_builtins.str] api_secret: The API secret associated with your Confluent account.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IntegrationAccountState.__new__(_IntegrationAccountState)

        __props__.__dict__["api_key"] = api_key
        __props__.__dict__["api_secret"] = api_secret
        __props__.__dict__["tags"] = tags
        return IntegrationAccount(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> pulumi.Output[_builtins.str]:
        """
        The API key associated with your Confluent account.
        """
        return pulumi.get(self, "api_key")

    @_builtins.property
    @pulumi.getter(name="apiSecret")
    def api_secret(self) -> pulumi.Output[_builtins.str]:
        """
        The API secret associated with your Confluent account.
        """
        return pulumi.get(self, "api_secret")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
        """
        return pulumi.get(self, "tags")

