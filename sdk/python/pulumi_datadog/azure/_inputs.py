# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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

__all__ = [
    'IntegrationResourceProviderConfigArgs',
    'IntegrationResourceProviderConfigArgsDict',
]

MYPY = False

if not MYPY:
    class IntegrationResourceProviderConfigArgsDict(TypedDict):
        metrics_enabled: pulumi.Input[bool]
        namespace: pulumi.Input[str]
elif False:
    IntegrationResourceProviderConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class IntegrationResourceProviderConfigArgs:
    def __init__(__self__, *,
                 metrics_enabled: pulumi.Input[bool],
                 namespace: pulumi.Input[str]):
        pulumi.set(__self__, "metrics_enabled", metrics_enabled)
        pulumi.set(__self__, "namespace", namespace)

    @property
    @pulumi.getter(name="metricsEnabled")
    def metrics_enabled(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "metrics_enabled")

    @metrics_enabled.setter
    def metrics_enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "metrics_enabled", value)

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Input[str]:
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: pulumi.Input[str]):
        pulumi.set(self, "namespace", value)

