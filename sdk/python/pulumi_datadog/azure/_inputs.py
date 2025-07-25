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
from .. import _utilities

__all__ = [
    'IntegrationResourceProviderConfigArgs',
    'IntegrationResourceProviderConfigArgsDict',
]

MYPY = False

if not MYPY:
    class IntegrationResourceProviderConfigArgsDict(TypedDict):
        metrics_enabled: pulumi.Input[_builtins.bool]
        namespace: pulumi.Input[_builtins.str]
elif False:
    IntegrationResourceProviderConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class IntegrationResourceProviderConfigArgs:
    def __init__(__self__, *,
                 metrics_enabled: pulumi.Input[_builtins.bool],
                 namespace: pulumi.Input[_builtins.str]):
        pulumi.set(__self__, "metrics_enabled", metrics_enabled)
        pulumi.set(__self__, "namespace", namespace)

    @_builtins.property
    @pulumi.getter(name="metricsEnabled")
    def metrics_enabled(self) -> pulumi.Input[_builtins.bool]:
        return pulumi.get(self, "metrics_enabled")

    @metrics_enabled.setter
    def metrics_enabled(self, value: pulumi.Input[_builtins.bool]):
        pulumi.set(self, "metrics_enabled", value)

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> pulumi.Input[_builtins.str]:
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "namespace", value)


