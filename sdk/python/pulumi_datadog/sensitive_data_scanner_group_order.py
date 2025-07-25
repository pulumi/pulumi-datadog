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

__all__ = ['SensitiveDataScannerGroupOrderArgs', 'SensitiveDataScannerGroupOrder']

@pulumi.input_type
class SensitiveDataScannerGroupOrderArgs:
    def __init__(__self__, *,
                 group_ids: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        """
        The set of arguments for constructing a SensitiveDataScannerGroupOrder resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] group_ids: The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
        """
        pulumi.set(__self__, "group_ids", group_ids)

    @_builtins.property
    @pulumi.getter(name="groupIds")
    def group_ids(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
        """
        return pulumi.get(self, "group_ids")

    @group_ids.setter
    def group_ids(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "group_ids", value)


@pulumi.input_type
class _SensitiveDataScannerGroupOrderState:
    def __init__(__self__, *,
                 group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering SensitiveDataScannerGroupOrder resources.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] group_ids: The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
        """
        if group_ids is not None:
            pulumi.set(__self__, "group_ids", group_ids)

    @_builtins.property
    @pulumi.getter(name="groupIds")
    def group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
        """
        return pulumi.get(self, "group_ids")

    @group_ids.setter
    def group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "group_ids", value)


@pulumi.type_token("datadog:index/sensitiveDataScannerGroupOrder:SensitiveDataScannerGroupOrder")
class SensitiveDataScannerGroupOrder(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Provides a Datadog Sensitive Data Scanner Group Order API resource. This can be used to manage the order of Datadog Sensitive Data Scanner Groups.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        # Create new sensitive_data_scanner_group_order resource
        mygrouporder = datadog.SensitiveDataScannerGroupOrder("mygrouporder", group_ids=[
            "group-id-1",
            "group-id-2",
            "group-id-3",
        ])
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import datadog:index/sensitiveDataScannerGroupOrder:SensitiveDataScannerGroupOrder mygrouporder order
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] group_ids: The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SensitiveDataScannerGroupOrderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Datadog Sensitive Data Scanner Group Order API resource. This can be used to manage the order of Datadog Sensitive Data Scanner Groups.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        # Create new sensitive_data_scanner_group_order resource
        mygrouporder = datadog.SensitiveDataScannerGroupOrder("mygrouporder", group_ids=[
            "group-id-1",
            "group-id-2",
            "group-id-3",
        ])
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import datadog:index/sensitiveDataScannerGroupOrder:SensitiveDataScannerGroupOrder mygrouporder order
        ```

        :param str resource_name: The name of the resource.
        :param SensitiveDataScannerGroupOrderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SensitiveDataScannerGroupOrderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SensitiveDataScannerGroupOrderArgs.__new__(SensitiveDataScannerGroupOrderArgs)

            if group_ids is None and not opts.urn:
                raise TypeError("Missing required property 'group_ids'")
            __props__.__dict__["group_ids"] = group_ids
        super(SensitiveDataScannerGroupOrder, __self__).__init__(
            'datadog:index/sensitiveDataScannerGroupOrder:SensitiveDataScannerGroupOrder',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None) -> 'SensitiveDataScannerGroupOrder':
        """
        Get an existing SensitiveDataScannerGroupOrder resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] group_ids: The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SensitiveDataScannerGroupOrderState.__new__(_SensitiveDataScannerGroupOrderState)

        __props__.__dict__["group_ids"] = group_ids
        return SensitiveDataScannerGroupOrder(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="groupIds")
    def group_ids(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
        """
        return pulumi.get(self, "group_ids")

