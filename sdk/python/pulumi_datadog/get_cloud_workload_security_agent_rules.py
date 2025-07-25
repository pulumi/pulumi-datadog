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

__all__ = [
    'GetCloudWorkloadSecurityAgentRulesResult',
    'AwaitableGetCloudWorkloadSecurityAgentRulesResult',
    'get_cloud_workload_security_agent_rules',
    'get_cloud_workload_security_agent_rules_output',
]

@pulumi.output_type
class GetCloudWorkloadSecurityAgentRulesResult:
    """
    A collection of values returned by getCloudWorkloadSecurityAgentRules.
    """
    def __init__(__self__, agent_rules=None, id=None):
        if agent_rules and not isinstance(agent_rules, list):
            raise TypeError("Expected argument 'agent_rules' to be a list")
        pulumi.set(__self__, "agent_rules", agent_rules)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @_builtins.property
    @pulumi.getter(name="agentRules")
    def agent_rules(self) -> Sequence['outputs.GetCloudWorkloadSecurityAgentRulesAgentRuleResult']:
        """
        List of Agent rules.
        """
        return pulumi.get(self, "agent_rules")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetCloudWorkloadSecurityAgentRulesResult(GetCloudWorkloadSecurityAgentRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCloudWorkloadSecurityAgentRulesResult(
            agent_rules=self.agent_rules,
            id=self.id)


def get_cloud_workload_security_agent_rules(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCloudWorkloadSecurityAgentRulesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_datadog as datadog

    test = datadog.get_cloud_workload_security_agent_rules()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('datadog:index/getCloudWorkloadSecurityAgentRules:getCloudWorkloadSecurityAgentRules', __args__, opts=opts, typ=GetCloudWorkloadSecurityAgentRulesResult).value

    return AwaitableGetCloudWorkloadSecurityAgentRulesResult(
        agent_rules=pulumi.get(__ret__, 'agent_rules'),
        id=pulumi.get(__ret__, 'id'))
def get_cloud_workload_security_agent_rules_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCloudWorkloadSecurityAgentRulesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_datadog as datadog

    test = datadog.get_cloud_workload_security_agent_rules()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('datadog:index/getCloudWorkloadSecurityAgentRules:getCloudWorkloadSecurityAgentRules', __args__, opts=opts, typ=GetCloudWorkloadSecurityAgentRulesResult)
    return __ret__.apply(lambda __response__: GetCloudWorkloadSecurityAgentRulesResult(
        agent_rules=pulumi.get(__response__, 'agent_rules'),
        id=pulumi.get(__response__, 'id')))
