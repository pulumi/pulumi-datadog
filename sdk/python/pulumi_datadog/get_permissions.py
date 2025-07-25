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
    'GetPermissionsResult',
    'AwaitableGetPermissionsResult',
    'get_permissions',
    'get_permissions_output',
]

@pulumi.output_type
class GetPermissionsResult:
    """
    A collection of values returned by getPermissions.
    """
    def __init__(__self__, id=None, include_restricted=None, permissions=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if include_restricted and not isinstance(include_restricted, bool):
            raise TypeError("Expected argument 'include_restricted' to be a bool")
        pulumi.set(__self__, "include_restricted", include_restricted)
        if permissions and not isinstance(permissions, dict):
            raise TypeError("Expected argument 'permissions' to be a dict")
        pulumi.set(__self__, "permissions", permissions)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="includeRestricted")
    def include_restricted(self) -> Optional[_builtins.bool]:
        """
        Whether to include restricted permissions. Restricted permissions are granted by default to all users of a Datadog org, and cannot be manually granted or revoked. Defaults to `false`.
        """
        return pulumi.get(self, "include_restricted")

    @_builtins.property
    @pulumi.getter
    def permissions(self) -> Mapping[str, _builtins.str]:
        """
        Map of permissions names to their corresponding ID.
        """
        return pulumi.get(self, "permissions")


class AwaitableGetPermissionsResult(GetPermissionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPermissionsResult(
            id=self.id,
            include_restricted=self.include_restricted,
            permissions=self.permissions)


def get_permissions(include_restricted: Optional[_builtins.bool] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPermissionsResult:
    """
    Use this data source to retrieve the list of Datadog permissions by name and their corresponding ID, for use in the role resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_datadog as datadog

    permissions = datadog.get_permissions()
    ```


    :param _builtins.bool include_restricted: Whether to include restricted permissions. Restricted permissions are granted by default to all users of a Datadog org, and cannot be manually granted or revoked. Defaults to `false`.
    """
    __args__ = dict()
    __args__['includeRestricted'] = include_restricted
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('datadog:index/getPermissions:getPermissions', __args__, opts=opts, typ=GetPermissionsResult).value

    return AwaitableGetPermissionsResult(
        id=pulumi.get(__ret__, 'id'),
        include_restricted=pulumi.get(__ret__, 'include_restricted'),
        permissions=pulumi.get(__ret__, 'permissions'))
def get_permissions_output(include_restricted: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPermissionsResult]:
    """
    Use this data source to retrieve the list of Datadog permissions by name and their corresponding ID, for use in the role resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_datadog as datadog

    permissions = datadog.get_permissions()
    ```


    :param _builtins.bool include_restricted: Whether to include restricted permissions. Restricted permissions are granted by default to all users of a Datadog org, and cannot be manually granted or revoked. Defaults to `false`.
    """
    __args__ = dict()
    __args__['includeRestricted'] = include_restricted
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('datadog:index/getPermissions:getPermissions', __args__, opts=opts, typ=GetPermissionsResult)
    return __ret__.apply(lambda __response__: GetPermissionsResult(
        id=pulumi.get(__response__, 'id'),
        include_restricted=pulumi.get(__response__, 'include_restricted'),
        permissions=pulumi.get(__response__, 'permissions')))
