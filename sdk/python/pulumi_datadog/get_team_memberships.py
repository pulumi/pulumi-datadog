# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetTeamMembershipsResult',
    'AwaitableGetTeamMembershipsResult',
    'get_team_memberships',
    'get_team_memberships_output',
]

@pulumi.output_type
class GetTeamMembershipsResult:
    """
    A collection of values returned by getTeamMemberships.
    """
    def __init__(__self__, filter_keyword=None, id=None, team_id=None, team_memberships=None):
        if filter_keyword and not isinstance(filter_keyword, str):
            raise TypeError("Expected argument 'filter_keyword' to be a str")
        pulumi.set(__self__, "filter_keyword", filter_keyword)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if team_id and not isinstance(team_id, str):
            raise TypeError("Expected argument 'team_id' to be a str")
        pulumi.set(__self__, "team_id", team_id)
        if team_memberships and not isinstance(team_memberships, list):
            raise TypeError("Expected argument 'team_memberships' to be a list")
        pulumi.set(__self__, "team_memberships", team_memberships)

    @property
    @pulumi.getter(name="filterKeyword")
    def filter_keyword(self) -> Optional[str]:
        """
        Search query, can be user email or name.
        """
        return pulumi.get(self, "filter_keyword")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of this resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> str:
        """
        The team's identifier.
        """
        return pulumi.get(self, "team_id")

    @property
    @pulumi.getter(name="teamMemberships")
    def team_memberships(self) -> Sequence['outputs.GetTeamMembershipsTeamMembershipResult']:
        """
        List of team memberships.
        """
        return pulumi.get(self, "team_memberships")


class AwaitableGetTeamMembershipsResult(GetTeamMembershipsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTeamMembershipsResult(
            filter_keyword=self.filter_keyword,
            id=self.id,
            team_id=self.team_id,
            team_memberships=self.team_memberships)


def get_team_memberships(filter_keyword: Optional[str] = None,
                         team_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTeamMembershipsResult:
    """
    Use this data source to retrieve information about existing Datadog team memberships.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_datadog as datadog

    foo = datadog.get_team_memberships(filter_keyword="foo@example.com",
        team_id="e6723c40-edb1-11ed-b816-da7ad0900002")
    ```


    :param str filter_keyword: Search query, can be user email or name.
    :param str team_id: The team's identifier.
    """
    __args__ = dict()
    __args__['filterKeyword'] = filter_keyword
    __args__['teamId'] = team_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('datadog:index/getTeamMemberships:getTeamMemberships', __args__, opts=opts, typ=GetTeamMembershipsResult).value

    return AwaitableGetTeamMembershipsResult(
        filter_keyword=pulumi.get(__ret__, 'filter_keyword'),
        id=pulumi.get(__ret__, 'id'),
        team_id=pulumi.get(__ret__, 'team_id'),
        team_memberships=pulumi.get(__ret__, 'team_memberships'))


@_utilities.lift_output_func(get_team_memberships)
def get_team_memberships_output(filter_keyword: Optional[pulumi.Input[Optional[str]]] = None,
                                team_id: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTeamMembershipsResult]:
    """
    Use this data source to retrieve information about existing Datadog team memberships.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_datadog as datadog

    foo = datadog.get_team_memberships(filter_keyword="foo@example.com",
        team_id="e6723c40-edb1-11ed-b816-da7ad0900002")
    ```


    :param str filter_keyword: Search query, can be user email or name.
    :param str team_id: The team's identifier.
    """
    ...