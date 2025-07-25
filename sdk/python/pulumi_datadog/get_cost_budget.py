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

__all__ = [
    'GetCostBudgetResult',
    'AwaitableGetCostBudgetResult',
    'get_cost_budget',
    'get_cost_budget_output',
]

@pulumi.output_type
class GetCostBudgetResult:
    """
    A collection of values returned by getCostBudget.
    """
    def __init__(__self__, end_month=None, entries=None, id=None, metrics_query=None, name=None, start_month=None, total_amount=None):
        if end_month and not isinstance(end_month, int):
            raise TypeError("Expected argument 'end_month' to be a int")
        pulumi.set(__self__, "end_month", end_month)
        if entries and not isinstance(entries, list):
            raise TypeError("Expected argument 'entries' to be a list")
        pulumi.set(__self__, "entries", entries)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if metrics_query and not isinstance(metrics_query, str):
            raise TypeError("Expected argument 'metrics_query' to be a str")
        pulumi.set(__self__, "metrics_query", metrics_query)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if start_month and not isinstance(start_month, int):
            raise TypeError("Expected argument 'start_month' to be a int")
        pulumi.set(__self__, "start_month", start_month)
        if total_amount and not isinstance(total_amount, float):
            raise TypeError("Expected argument 'total_amount' to be a float")
        pulumi.set(__self__, "total_amount", total_amount)

    @_builtins.property
    @pulumi.getter(name="endMonth")
    def end_month(self) -> _builtins.int:
        """
        The month when the budget ends (YYYYMM).
        """
        return pulumi.get(self, "end_month")

    @_builtins.property
    @pulumi.getter
    def entries(self) -> Optional[Sequence['outputs.GetCostBudgetEntryResult']]:
        """
        The entries of the budget.
        """
        return pulumi.get(self, "entries")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the budget.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="metricsQuery")
    def metrics_query(self) -> _builtins.str:
        """
        The cost query used to track against the budget.
        """
        return pulumi.get(self, "metrics_query")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the budget.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="startMonth")
    def start_month(self) -> _builtins.int:
        """
        The month when the budget starts (YYYYMM).
        """
        return pulumi.get(self, "start_month")

    @_builtins.property
    @pulumi.getter(name="totalAmount")
    def total_amount(self) -> _builtins.float:
        """
        The sum of all budget entries' amounts.
        """
        return pulumi.get(self, "total_amount")


class AwaitableGetCostBudgetResult(GetCostBudgetResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCostBudgetResult(
            end_month=self.end_month,
            entries=self.entries,
            id=self.id,
            metrics_query=self.metrics_query,
            name=self.name,
            start_month=self.start_month,
            total_amount=self.total_amount)


def get_cost_budget(entries: Optional[Sequence[Union['GetCostBudgetEntryArgs', 'GetCostBudgetEntryArgsDict']]] = None,
                    id: Optional[_builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCostBudgetResult:
    """
    Use this data source to retrieve information about an existing Datadog cost budget.


    :param Sequence[Union['GetCostBudgetEntryArgs', 'GetCostBudgetEntryArgsDict']] entries: The entries of the budget.
    :param _builtins.str id: The ID of the budget.
    """
    __args__ = dict()
    __args__['entries'] = entries
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('datadog:index/getCostBudget:getCostBudget', __args__, opts=opts, typ=GetCostBudgetResult).value

    return AwaitableGetCostBudgetResult(
        end_month=pulumi.get(__ret__, 'end_month'),
        entries=pulumi.get(__ret__, 'entries'),
        id=pulumi.get(__ret__, 'id'),
        metrics_query=pulumi.get(__ret__, 'metrics_query'),
        name=pulumi.get(__ret__, 'name'),
        start_month=pulumi.get(__ret__, 'start_month'),
        total_amount=pulumi.get(__ret__, 'total_amount'))
def get_cost_budget_output(entries: Optional[pulumi.Input[Optional[Sequence[Union['GetCostBudgetEntryArgs', 'GetCostBudgetEntryArgsDict']]]]] = None,
                           id: Optional[pulumi.Input[_builtins.str]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCostBudgetResult]:
    """
    Use this data source to retrieve information about an existing Datadog cost budget.


    :param Sequence[Union['GetCostBudgetEntryArgs', 'GetCostBudgetEntryArgsDict']] entries: The entries of the budget.
    :param _builtins.str id: The ID of the budget.
    """
    __args__ = dict()
    __args__['entries'] = entries
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('datadog:index/getCostBudget:getCostBudget', __args__, opts=opts, typ=GetCostBudgetResult)
    return __ret__.apply(lambda __response__: GetCostBudgetResult(
        end_month=pulumi.get(__response__, 'end_month'),
        entries=pulumi.get(__response__, 'entries'),
        id=pulumi.get(__response__, 'id'),
        metrics_query=pulumi.get(__response__, 'metrics_query'),
        name=pulumi.get(__response__, 'name'),
        start_month=pulumi.get(__response__, 'start_month'),
        total_amount=pulumi.get(__response__, 'total_amount')))
