# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['IntegrationEventBridgeArgs', 'IntegrationEventBridge']

@pulumi.input_type
class IntegrationEventBridgeArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 event_generator_name: pulumi.Input[str],
                 region: pulumi.Input[str],
                 create_event_bus: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a IntegrationEventBridge resource.
        :param pulumi.Input[str] account_id: Your AWS Account ID without dashes.
        :param pulumi.Input[str] event_generator_name: The given part of the event source name, which is then combined with an assigned suffix to form the full name.
        :param pulumi.Input[str] region: The event source's [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
        :param pulumi.Input[bool] create_event_bus: True if Datadog should create the event bus in addition to the event source. Requires the `events:CreateEventBus` permission. Defaults to `true`.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "event_generator_name", event_generator_name)
        pulumi.set(__self__, "region", region)
        if create_event_bus is not None:
            pulumi.set(__self__, "create_event_bus", create_event_bus)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        Your AWS Account ID without dashes.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="eventGeneratorName")
    def event_generator_name(self) -> pulumi.Input[str]:
        """
        The given part of the event source name, which is then combined with an assigned suffix to form the full name.
        """
        return pulumi.get(self, "event_generator_name")

    @event_generator_name.setter
    def event_generator_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "event_generator_name", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        The event source's [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="createEventBus")
    def create_event_bus(self) -> Optional[pulumi.Input[bool]]:
        """
        True if Datadog should create the event bus in addition to the event source. Requires the `events:CreateEventBus` permission. Defaults to `true`.
        """
        return pulumi.get(self, "create_event_bus")

    @create_event_bus.setter
    def create_event_bus(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "create_event_bus", value)


@pulumi.input_type
class _IntegrationEventBridgeState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 create_event_bus: Optional[pulumi.Input[bool]] = None,
                 event_generator_name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IntegrationEventBridge resources.
        :param pulumi.Input[str] account_id: Your AWS Account ID without dashes.
        :param pulumi.Input[bool] create_event_bus: True if Datadog should create the event bus in addition to the event source. Requires the `events:CreateEventBus` permission. Defaults to `true`.
        :param pulumi.Input[str] event_generator_name: The given part of the event source name, which is then combined with an assigned suffix to form the full name.
        :param pulumi.Input[str] region: The event source's [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if create_event_bus is not None:
            pulumi.set(__self__, "create_event_bus", create_event_bus)
        if event_generator_name is not None:
            pulumi.set(__self__, "event_generator_name", event_generator_name)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Your AWS Account ID without dashes.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="createEventBus")
    def create_event_bus(self) -> Optional[pulumi.Input[bool]]:
        """
        True if Datadog should create the event bus in addition to the event source. Requires the `events:CreateEventBus` permission. Defaults to `true`.
        """
        return pulumi.get(self, "create_event_bus")

    @create_event_bus.setter
    def create_event_bus(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "create_event_bus", value)

    @property
    @pulumi.getter(name="eventGeneratorName")
    def event_generator_name(self) -> Optional[pulumi.Input[str]]:
        """
        The given part of the event source name, which is then combined with an assigned suffix to form the full name.
        """
        return pulumi.get(self, "event_generator_name")

    @event_generator_name.setter
    def event_generator_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_generator_name", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The event source's [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)


class IntegrationEventBridge(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 create_event_bus: Optional[pulumi.Input[bool]] = None,
                 event_generator_name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Datadog - Amazon Web Services integration EventBridge resource. This can be used to create and manage Event Sources for each Datadog integrated AWS account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        foo = datadog.aws.IntegrationEventBridge("foo",
            account_id="123456789012",
            create_event_bus=True,
            event_generator_name="app-alerts",
            region="us-east-1")
        ```

        ## Import

        Amazon Web Service EventBridge integrations are imported using the Event Source name as listed for an integrated AWS account in Datadog

        ```sh
        $ pulumi import datadog:aws/integrationEventBridge:IntegrationEventBridge foo event-source-name-abc12345
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Your AWS Account ID without dashes.
        :param pulumi.Input[bool] create_event_bus: True if Datadog should create the event bus in addition to the event source. Requires the `events:CreateEventBus` permission. Defaults to `true`.
        :param pulumi.Input[str] event_generator_name: The given part of the event source name, which is then combined with an assigned suffix to form the full name.
        :param pulumi.Input[str] region: The event source's [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IntegrationEventBridgeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Datadog - Amazon Web Services integration EventBridge resource. This can be used to create and manage Event Sources for each Datadog integrated AWS account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        foo = datadog.aws.IntegrationEventBridge("foo",
            account_id="123456789012",
            create_event_bus=True,
            event_generator_name="app-alerts",
            region="us-east-1")
        ```

        ## Import

        Amazon Web Service EventBridge integrations are imported using the Event Source name as listed for an integrated AWS account in Datadog

        ```sh
        $ pulumi import datadog:aws/integrationEventBridge:IntegrationEventBridge foo event-source-name-abc12345
        ```

        :param str resource_name: The name of the resource.
        :param IntegrationEventBridgeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IntegrationEventBridgeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 create_event_bus: Optional[pulumi.Input[bool]] = None,
                 event_generator_name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IntegrationEventBridgeArgs.__new__(IntegrationEventBridgeArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["create_event_bus"] = create_event_bus
            if event_generator_name is None and not opts.urn:
                raise TypeError("Missing required property 'event_generator_name'")
            __props__.__dict__["event_generator_name"] = event_generator_name
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
        super(IntegrationEventBridge, __self__).__init__(
            'datadog:aws/integrationEventBridge:IntegrationEventBridge',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            create_event_bus: Optional[pulumi.Input[bool]] = None,
            event_generator_name: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None) -> 'IntegrationEventBridge':
        """
        Get an existing IntegrationEventBridge resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Your AWS Account ID without dashes.
        :param pulumi.Input[bool] create_event_bus: True if Datadog should create the event bus in addition to the event source. Requires the `events:CreateEventBus` permission. Defaults to `true`.
        :param pulumi.Input[str] event_generator_name: The given part of the event source name, which is then combined with an assigned suffix to form the full name.
        :param pulumi.Input[str] region: The event source's [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IntegrationEventBridgeState.__new__(_IntegrationEventBridgeState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["create_event_bus"] = create_event_bus
        __props__.__dict__["event_generator_name"] = event_generator_name
        __props__.__dict__["region"] = region
        return IntegrationEventBridge(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        Your AWS Account ID without dashes.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="createEventBus")
    def create_event_bus(self) -> pulumi.Output[bool]:
        """
        True if Datadog should create the event bus in addition to the event source. Requires the `events:CreateEventBus` permission. Defaults to `true`.
        """
        return pulumi.get(self, "create_event_bus")

    @property
    @pulumi.getter(name="eventGeneratorName")
    def event_generator_name(self) -> pulumi.Output[str]:
        """
        The given part of the event source name, which is then combined with an assigned suffix to form the full name.
        """
        return pulumi.get(self, "event_generator_name")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The event source's [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
        """
        return pulumi.get(self, "region")
