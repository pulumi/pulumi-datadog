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
    'DefaultTags',
]

@pulumi.output_type
class DefaultTags(dict):
    def __init__(__self__, *,
                 tags: Optional[Mapping[str, str]] = None):
        """
        :param Mapping[str, str] tags: [Experimental - Monitors only] Resource tags to be applied by default across all resources.
        """
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, str]]:
        """
        [Experimental - Monitors only] Resource tags to be applied by default across all resources.
        """
        return pulumi.get(self, "tags")

