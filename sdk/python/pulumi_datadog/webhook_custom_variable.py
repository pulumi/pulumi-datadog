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

__all__ = ['WebhookCustomVariableArgs', 'WebhookCustomVariable']

@pulumi.input_type
class WebhookCustomVariableArgs:
    def __init__(__self__, *,
                 is_secret: pulumi.Input[_builtins.bool],
                 name: pulumi.Input[_builtins.str],
                 value: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a WebhookCustomVariable resource.
        :param pulumi.Input[_builtins.bool] is_secret: Whether the custom variable is secret or not.
        :param pulumi.Input[_builtins.str] name: The name of the variable. It corresponds with `<CUSTOM_VARIABLE_NAME>`.
        :param pulumi.Input[_builtins.str] value: The value of the custom variable.
        """
        pulumi.set(__self__, "is_secret", is_secret)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "value", value)

    @_builtins.property
    @pulumi.getter(name="isSecret")
    def is_secret(self) -> pulumi.Input[_builtins.bool]:
        """
        Whether the custom variable is secret or not.
        """
        return pulumi.get(self, "is_secret")

    @is_secret.setter
    def is_secret(self, value: pulumi.Input[_builtins.bool]):
        pulumi.set(self, "is_secret", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the variable. It corresponds with `<CUSTOM_VARIABLE_NAME>`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Input[_builtins.str]:
        """
        The value of the custom variable.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class _WebhookCustomVariableState:
    def __init__(__self__, *,
                 is_secret: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering WebhookCustomVariable resources.
        :param pulumi.Input[_builtins.bool] is_secret: Whether the custom variable is secret or not.
        :param pulumi.Input[_builtins.str] name: The name of the variable. It corresponds with `<CUSTOM_VARIABLE_NAME>`.
        :param pulumi.Input[_builtins.str] value: The value of the custom variable.
        """
        if is_secret is not None:
            pulumi.set(__self__, "is_secret", is_secret)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @_builtins.property
    @pulumi.getter(name="isSecret")
    def is_secret(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the custom variable is secret or not.
        """
        return pulumi.get(self, "is_secret")

    @is_secret.setter
    def is_secret(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "is_secret", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the variable. It corresponds with `<CUSTOM_VARIABLE_NAME>`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The value of the custom variable.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "value", value)


@pulumi.type_token("datadog:index/webhookCustomVariable:WebhookCustomVariable")
class WebhookCustomVariable(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 is_secret: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Datadog webhooks custom variable resource. This can be used to create and manage Datadog webhooks custom variables.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        # Create a new Datadog webhook custom variable.
        foo = datadog.WebhookCustomVariable("foo",
            name="EXAMPLE_VARIABLE",
            value="EXAMPLE-VALUE",
            is_secret=True)
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import datadog:index/webhookCustomVariable:WebhookCustomVariable foo EXAMPLE_VARIABLE
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] is_secret: Whether the custom variable is secret or not.
        :param pulumi.Input[_builtins.str] name: The name of the variable. It corresponds with `<CUSTOM_VARIABLE_NAME>`.
        :param pulumi.Input[_builtins.str] value: The value of the custom variable.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebhookCustomVariableArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Datadog webhooks custom variable resource. This can be used to create and manage Datadog webhooks custom variables.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        # Create a new Datadog webhook custom variable.
        foo = datadog.WebhookCustomVariable("foo",
            name="EXAMPLE_VARIABLE",
            value="EXAMPLE-VALUE",
            is_secret=True)
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import datadog:index/webhookCustomVariable:WebhookCustomVariable foo EXAMPLE_VARIABLE
        ```

        :param str resource_name: The name of the resource.
        :param WebhookCustomVariableArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebhookCustomVariableArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 is_secret: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebhookCustomVariableArgs.__new__(WebhookCustomVariableArgs)

            if is_secret is None and not opts.urn:
                raise TypeError("Missing required property 'is_secret'")
            __props__.__dict__["is_secret"] = is_secret
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = None if value is None else pulumi.Output.secret(value)
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["value"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(WebhookCustomVariable, __self__).__init__(
            'datadog:index/webhookCustomVariable:WebhookCustomVariable',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            is_secret: Optional[pulumi.Input[_builtins.bool]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            value: Optional[pulumi.Input[_builtins.str]] = None) -> 'WebhookCustomVariable':
        """
        Get an existing WebhookCustomVariable resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] is_secret: Whether the custom variable is secret or not.
        :param pulumi.Input[_builtins.str] name: The name of the variable. It corresponds with `<CUSTOM_VARIABLE_NAME>`.
        :param pulumi.Input[_builtins.str] value: The value of the custom variable.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebhookCustomVariableState.__new__(_WebhookCustomVariableState)

        __props__.__dict__["is_secret"] = is_secret
        __props__.__dict__["name"] = name
        __props__.__dict__["value"] = value
        return WebhookCustomVariable(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="isSecret")
    def is_secret(self) -> pulumi.Output[_builtins.bool]:
        """
        Whether the custom variable is secret or not.
        """
        return pulumi.get(self, "is_secret")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the variable. It corresponds with `<CUSTOM_VARIABLE_NAME>`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Output[_builtins.str]:
        """
        The value of the custom variable.
        """
        return pulumi.get(self, "value")

