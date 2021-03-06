# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

# Export this package's modules as members:
from .integration import *
from .integration_lambda_arn import *
from .integration_log_collection import *

def _register_module():
    import pulumi
    from .. import _utilities


    class Module(pulumi.runtime.ResourceModule):
        _version = _utilities.get_semver_version()

        def version(self):
            return Module._version

        def construct(self, name: str, typ: str, urn: str) -> pulumi.Resource:
            if typ == "datadog:aws/integration:Integration":
                return Integration(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "datadog:aws/integrationLambdaArn:IntegrationLambdaArn":
                return IntegrationLambdaArn(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "datadog:aws/integrationLogCollection:IntegrationLogCollection":
                return IntegrationLogCollection(name, pulumi.ResourceOptions(urn=urn))
            else:
                raise Exception(f"unknown resource type {typ}")


    _module_instance = Module()
    pulumi.runtime.register_resource_module("datadog", "aws/integration", _module_instance)
    pulumi.runtime.register_resource_module("datadog", "aws/integrationLambdaArn", _module_instance)
    pulumi.runtime.register_resource_module("datadog", "aws/integrationLogCollection", _module_instance)

_register_module()
