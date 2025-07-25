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

__all__ = [
    'GetSensitiveDataScannerGroupOrderResult',
    'AwaitableGetSensitiveDataScannerGroupOrderResult',
    'get_sensitive_data_scanner_group_order',
    'get_sensitive_data_scanner_group_order_output',
]

@pulumi.output_type
class GetSensitiveDataScannerGroupOrderResult:
    """
    A collection of values returned by getSensitiveDataScannerGroupOrder.
    """
    def __init__(__self__, group_ids=None, id=None):
        if group_ids and not isinstance(group_ids, list):
            raise TypeError("Expected argument 'group_ids' to be a list")
        pulumi.set(__self__, "group_ids", group_ids)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @_builtins.property
    @pulumi.getter(name="groupIds")
    def group_ids(self) -> Sequence[_builtins.str]:
        """
        The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
        """
        return pulumi.get(self, "group_ids")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of this resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetSensitiveDataScannerGroupOrderResult(GetSensitiveDataScannerGroupOrderResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSensitiveDataScannerGroupOrderResult(
            group_ids=self.group_ids,
            id=self.id)


def get_sensitive_data_scanner_group_order(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSensitiveDataScannerGroupOrderResult:
    """
    Provides a Datadog Sensitive Data Scanner Group Order API data source. This can be used to retrieve the order of Datadog Sensitive Data Scanner Groups.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_datadog as datadog

    foo = datadog.get_sensitive_data_scanner_group_order()
    foobar = datadog.SensitiveDataScannerGroupOrder("foobar", group_ids=foo.group_ids)
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('datadog:index/getSensitiveDataScannerGroupOrder:getSensitiveDataScannerGroupOrder', __args__, opts=opts, typ=GetSensitiveDataScannerGroupOrderResult).value

    return AwaitableGetSensitiveDataScannerGroupOrderResult(
        group_ids=pulumi.get(__ret__, 'group_ids'),
        id=pulumi.get(__ret__, 'id'))
def get_sensitive_data_scanner_group_order_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSensitiveDataScannerGroupOrderResult]:
    """
    Provides a Datadog Sensitive Data Scanner Group Order API data source. This can be used to retrieve the order of Datadog Sensitive Data Scanner Groups.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_datadog as datadog

    foo = datadog.get_sensitive_data_scanner_group_order()
    foobar = datadog.SensitiveDataScannerGroupOrder("foobar", group_ids=foo.group_ids)
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('datadog:index/getSensitiveDataScannerGroupOrder:getSensitiveDataScannerGroupOrder', __args__, opts=opts, typ=GetSensitiveDataScannerGroupOrderResult)
    return __ret__.apply(lambda __response__: GetSensitiveDataScannerGroupOrderResult(
        group_ids=pulumi.get(__response__, 'group_ids'),
        id=pulumi.get(__response__, 'id')))
