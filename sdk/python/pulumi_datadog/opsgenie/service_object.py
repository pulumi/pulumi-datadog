# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ServiceObjectArgs', 'ServiceObject']

@pulumi.input_type
class ServiceObjectArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 opsgenie_api_key: pulumi.Input[str],
                 region: pulumi.Input[str],
                 custom_url: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ServiceObject resource.
        :param pulumi.Input[str] name: The name for the Opsgenie service.
        :param pulumi.Input[str] opsgenie_api_key: The Opsgenie API key for the Opsgenie service. Note: Since the Datadog API never returns Opsgenie API keys, it is
               impossible to detect [drifts](https://www.hashicorp.com/blog/detecting-and-managing-drift-with-terraform). The best way
               to solve a drift is to manually mark the Service Object resource with [terraform
               taint](https://www.terraform.io/docs/commands/taint.html) to have it destroyed and recreated.
        :param pulumi.Input[str] region: The region for the Opsgenie service.
        :param pulumi.Input[str] custom_url: The custom url for a custom region.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "opsgenie_api_key", opsgenie_api_key)
        pulumi.set(__self__, "region", region)
        if custom_url is not None:
            pulumi.set(__self__, "custom_url", custom_url)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name for the Opsgenie service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="opsgenieApiKey")
    def opsgenie_api_key(self) -> pulumi.Input[str]:
        """
        The Opsgenie API key for the Opsgenie service. Note: Since the Datadog API never returns Opsgenie API keys, it is
        impossible to detect [drifts](https://www.hashicorp.com/blog/detecting-and-managing-drift-with-terraform). The best way
        to solve a drift is to manually mark the Service Object resource with [terraform
        taint](https://www.terraform.io/docs/commands/taint.html) to have it destroyed and recreated.
        """
        return pulumi.get(self, "opsgenie_api_key")

    @opsgenie_api_key.setter
    def opsgenie_api_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "opsgenie_api_key", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        The region for the Opsgenie service.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="customUrl")
    def custom_url(self) -> Optional[pulumi.Input[str]]:
        """
        The custom url for a custom region.
        """
        return pulumi.get(self, "custom_url")

    @custom_url.setter
    def custom_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_url", value)


@pulumi.input_type
class _ServiceObjectState:
    def __init__(__self__, *,
                 custom_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 opsgenie_api_key: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceObject resources.
        :param pulumi.Input[str] custom_url: The custom url for a custom region.
        :param pulumi.Input[str] name: The name for the Opsgenie service.
        :param pulumi.Input[str] opsgenie_api_key: The Opsgenie API key for the Opsgenie service. Note: Since the Datadog API never returns Opsgenie API keys, it is
               impossible to detect [drifts](https://www.hashicorp.com/blog/detecting-and-managing-drift-with-terraform). The best way
               to solve a drift is to manually mark the Service Object resource with [terraform
               taint](https://www.terraform.io/docs/commands/taint.html) to have it destroyed and recreated.
        :param pulumi.Input[str] region: The region for the Opsgenie service.
        """
        if custom_url is not None:
            pulumi.set(__self__, "custom_url", custom_url)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if opsgenie_api_key is not None:
            pulumi.set(__self__, "opsgenie_api_key", opsgenie_api_key)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter(name="customUrl")
    def custom_url(self) -> Optional[pulumi.Input[str]]:
        """
        The custom url for a custom region.
        """
        return pulumi.get(self, "custom_url")

    @custom_url.setter
    def custom_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_url", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the Opsgenie service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="opsgenieApiKey")
    def opsgenie_api_key(self) -> Optional[pulumi.Input[str]]:
        """
        The Opsgenie API key for the Opsgenie service. Note: Since the Datadog API never returns Opsgenie API keys, it is
        impossible to detect [drifts](https://www.hashicorp.com/blog/detecting-and-managing-drift-with-terraform). The best way
        to solve a drift is to manually mark the Service Object resource with [terraform
        taint](https://www.terraform.io/docs/commands/taint.html) to have it destroyed and recreated.
        """
        return pulumi.get(self, "opsgenie_api_key")

    @opsgenie_api_key.setter
    def opsgenie_api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "opsgenie_api_key", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region for the Opsgenie service.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)


class ServiceObject(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 opsgenie_api_key: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for interacting with Datadog Opsgenie Service API.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        fake_service_name = datadog.opsgenie.ServiceObject("fakeServiceName",
            name="fake_service_name",
            opsgenie_api_key="00000000-0000-0000-0000-000000000000",
            region="us")
        fake_service_name2 = datadog.opsgenie.ServiceObject("fakeServiceName2",
            name="fake_service_name_2",
            opsgenie_api_key="11111111-1111-1111-1111-111111111111",
            region="eu")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] custom_url: The custom url for a custom region.
        :param pulumi.Input[str] name: The name for the Opsgenie service.
        :param pulumi.Input[str] opsgenie_api_key: The Opsgenie API key for the Opsgenie service. Note: Since the Datadog API never returns Opsgenie API keys, it is
               impossible to detect [drifts](https://www.hashicorp.com/blog/detecting-and-managing-drift-with-terraform). The best way
               to solve a drift is to manually mark the Service Object resource with [terraform
               taint](https://www.terraform.io/docs/commands/taint.html) to have it destroyed and recreated.
        :param pulumi.Input[str] region: The region for the Opsgenie service.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceObjectArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for interacting with Datadog Opsgenie Service API.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        fake_service_name = datadog.opsgenie.ServiceObject("fakeServiceName",
            name="fake_service_name",
            opsgenie_api_key="00000000-0000-0000-0000-000000000000",
            region="us")
        fake_service_name2 = datadog.opsgenie.ServiceObject("fakeServiceName2",
            name="fake_service_name_2",
            opsgenie_api_key="11111111-1111-1111-1111-111111111111",
            region="eu")
        ```

        :param str resource_name: The name of the resource.
        :param ServiceObjectArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceObjectArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 opsgenie_api_key: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceObjectArgs.__new__(ServiceObjectArgs)

            __props__.__dict__["custom_url"] = custom_url
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if opsgenie_api_key is None and not opts.urn:
                raise TypeError("Missing required property 'opsgenie_api_key'")
            __props__.__dict__["opsgenie_api_key"] = opsgenie_api_key
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
        super(ServiceObject, __self__).__init__(
            'datadog:opsgenie/serviceObject:ServiceObject',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            custom_url: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            opsgenie_api_key: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None) -> 'ServiceObject':
        """
        Get an existing ServiceObject resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] custom_url: The custom url for a custom region.
        :param pulumi.Input[str] name: The name for the Opsgenie service.
        :param pulumi.Input[str] opsgenie_api_key: The Opsgenie API key for the Opsgenie service. Note: Since the Datadog API never returns Opsgenie API keys, it is
               impossible to detect [drifts](https://www.hashicorp.com/blog/detecting-and-managing-drift-with-terraform). The best way
               to solve a drift is to manually mark the Service Object resource with [terraform
               taint](https://www.terraform.io/docs/commands/taint.html) to have it destroyed and recreated.
        :param pulumi.Input[str] region: The region for the Opsgenie service.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceObjectState.__new__(_ServiceObjectState)

        __props__.__dict__["custom_url"] = custom_url
        __props__.__dict__["name"] = name
        __props__.__dict__["opsgenie_api_key"] = opsgenie_api_key
        __props__.__dict__["region"] = region
        return ServiceObject(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="customUrl")
    def custom_url(self) -> pulumi.Output[Optional[str]]:
        """
        The custom url for a custom region.
        """
        return pulumi.get(self, "custom_url")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name for the Opsgenie service.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="opsgenieApiKey")
    def opsgenie_api_key(self) -> pulumi.Output[str]:
        """
        The Opsgenie API key for the Opsgenie service. Note: Since the Datadog API never returns Opsgenie API keys, it is
        impossible to detect [drifts](https://www.hashicorp.com/blog/detecting-and-managing-drift-with-terraform). The best way
        to solve a drift is to manually mark the Service Object resource with [terraform
        taint](https://www.terraform.io/docs/commands/taint.html) to have it destroyed and recreated.
        """
        return pulumi.get(self, "opsgenie_api_key")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The region for the Opsgenie service.
        """
        return pulumi.get(self, "region")
