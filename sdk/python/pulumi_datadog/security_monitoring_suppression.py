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

__all__ = ['SecurityMonitoringSuppressionArgs', 'SecurityMonitoringSuppression']

@pulumi.input_type
class SecurityMonitoringSuppressionArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[_builtins.bool],
                 name: pulumi.Input[_builtins.str],
                 rule_query: pulumi.Input[_builtins.str],
                 data_exclusion_query: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 expiration_date: Optional[pulumi.Input[_builtins.str]] = None,
                 start_date: Optional[pulumi.Input[_builtins.str]] = None,
                 suppression_query: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a SecurityMonitoringSuppression resource.
        :param pulumi.Input[_builtins.bool] enabled: Whether the suppression rule is enabled.
        :param pulumi.Input[_builtins.str] name: The name of the suppression rule.
        :param pulumi.Input[_builtins.str] rule_query: The rule query of the suppression rule, with the same syntax as the search bar for detection rules.
        :param pulumi.Input[_builtins.str] data_exclusion_query: An exclusion query on the input data of the security rules, which could be logs, Agent events, or other types of data based on the security rule. Events matching this query are ignored by any detection rules referenced in the suppression rule.
        :param pulumi.Input[_builtins.str] description: A description for the suppression rule.
        :param pulumi.Input[_builtins.str] expiration_date: A RFC3339 timestamp giving an expiration date for the suppression rule. After this date, it won't suppress signals anymore.
        :param pulumi.Input[_builtins.str] start_date: A RFC3339 timestamp giving a start date for the suppression rule. Before this date, it doesn't suppress signals.
        :param pulumi.Input[_builtins.str] suppression_query: The suppression query of the suppression rule. If a signal matches this query, it is suppressed and is not triggered. It uses the same syntax as the queries to search signals in the Signals Explorer.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "rule_query", rule_query)
        if data_exclusion_query is not None:
            pulumi.set(__self__, "data_exclusion_query", data_exclusion_query)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if expiration_date is not None:
            pulumi.set(__self__, "expiration_date", expiration_date)
        if start_date is not None:
            pulumi.set(__self__, "start_date", start_date)
        if suppression_query is not None:
            pulumi.set(__self__, "suppression_query", suppression_query)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[_builtins.bool]:
        """
        Whether the suppression rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[_builtins.bool]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the suppression rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="ruleQuery")
    def rule_query(self) -> pulumi.Input[_builtins.str]:
        """
        The rule query of the suppression rule, with the same syntax as the search bar for detection rules.
        """
        return pulumi.get(self, "rule_query")

    @rule_query.setter
    def rule_query(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "rule_query", value)

    @_builtins.property
    @pulumi.getter(name="dataExclusionQuery")
    def data_exclusion_query(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An exclusion query on the input data of the security rules, which could be logs, Agent events, or other types of data based on the security rule. Events matching this query are ignored by any detection rules referenced in the suppression rule.
        """
        return pulumi.get(self, "data_exclusion_query")

    @data_exclusion_query.setter
    def data_exclusion_query(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "data_exclusion_query", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description for the suppression rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A RFC3339 timestamp giving an expiration date for the suppression rule. After this date, it won't suppress signals anymore.
        """
        return pulumi.get(self, "expiration_date")

    @expiration_date.setter
    def expiration_date(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "expiration_date", value)

    @_builtins.property
    @pulumi.getter(name="startDate")
    def start_date(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A RFC3339 timestamp giving a start date for the suppression rule. Before this date, it doesn't suppress signals.
        """
        return pulumi.get(self, "start_date")

    @start_date.setter
    def start_date(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "start_date", value)

    @_builtins.property
    @pulumi.getter(name="suppressionQuery")
    def suppression_query(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The suppression query of the suppression rule. If a signal matches this query, it is suppressed and is not triggered. It uses the same syntax as the queries to search signals in the Signals Explorer.
        """
        return pulumi.get(self, "suppression_query")

    @suppression_query.setter
    def suppression_query(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "suppression_query", value)


@pulumi.input_type
class _SecurityMonitoringSuppressionState:
    def __init__(__self__, *,
                 data_exclusion_query: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 expiration_date: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_query: Optional[pulumi.Input[_builtins.str]] = None,
                 start_date: Optional[pulumi.Input[_builtins.str]] = None,
                 suppression_query: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering SecurityMonitoringSuppression resources.
        :param pulumi.Input[_builtins.str] data_exclusion_query: An exclusion query on the input data of the security rules, which could be logs, Agent events, or other types of data based on the security rule. Events matching this query are ignored by any detection rules referenced in the suppression rule.
        :param pulumi.Input[_builtins.str] description: A description for the suppression rule.
        :param pulumi.Input[_builtins.bool] enabled: Whether the suppression rule is enabled.
        :param pulumi.Input[_builtins.str] expiration_date: A RFC3339 timestamp giving an expiration date for the suppression rule. After this date, it won't suppress signals anymore.
        :param pulumi.Input[_builtins.str] name: The name of the suppression rule.
        :param pulumi.Input[_builtins.str] rule_query: The rule query of the suppression rule, with the same syntax as the search bar for detection rules.
        :param pulumi.Input[_builtins.str] start_date: A RFC3339 timestamp giving a start date for the suppression rule. Before this date, it doesn't suppress signals.
        :param pulumi.Input[_builtins.str] suppression_query: The suppression query of the suppression rule. If a signal matches this query, it is suppressed and is not triggered. It uses the same syntax as the queries to search signals in the Signals Explorer.
        """
        if data_exclusion_query is not None:
            pulumi.set(__self__, "data_exclusion_query", data_exclusion_query)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if expiration_date is not None:
            pulumi.set(__self__, "expiration_date", expiration_date)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rule_query is not None:
            pulumi.set(__self__, "rule_query", rule_query)
        if start_date is not None:
            pulumi.set(__self__, "start_date", start_date)
        if suppression_query is not None:
            pulumi.set(__self__, "suppression_query", suppression_query)

    @_builtins.property
    @pulumi.getter(name="dataExclusionQuery")
    def data_exclusion_query(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An exclusion query on the input data of the security rules, which could be logs, Agent events, or other types of data based on the security rule. Events matching this query are ignored by any detection rules referenced in the suppression rule.
        """
        return pulumi.get(self, "data_exclusion_query")

    @data_exclusion_query.setter
    def data_exclusion_query(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "data_exclusion_query", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description for the suppression rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the suppression rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A RFC3339 timestamp giving an expiration date for the suppression rule. After this date, it won't suppress signals anymore.
        """
        return pulumi.get(self, "expiration_date")

    @expiration_date.setter
    def expiration_date(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "expiration_date", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the suppression rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="ruleQuery")
    def rule_query(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The rule query of the suppression rule, with the same syntax as the search bar for detection rules.
        """
        return pulumi.get(self, "rule_query")

    @rule_query.setter
    def rule_query(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule_query", value)

    @_builtins.property
    @pulumi.getter(name="startDate")
    def start_date(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A RFC3339 timestamp giving a start date for the suppression rule. Before this date, it doesn't suppress signals.
        """
        return pulumi.get(self, "start_date")

    @start_date.setter
    def start_date(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "start_date", value)

    @_builtins.property
    @pulumi.getter(name="suppressionQuery")
    def suppression_query(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The suppression query of the suppression rule. If a signal matches this query, it is suppressed and is not triggered. It uses the same syntax as the queries to search signals in the Signals Explorer.
        """
        return pulumi.get(self, "suppression_query")

    @suppression_query.setter
    def suppression_query(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "suppression_query", value)


@pulumi.type_token("datadog:index/securityMonitoringSuppression:SecurityMonitoringSuppression")
class SecurityMonitoringSuppression(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_exclusion_query: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 expiration_date: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_query: Optional[pulumi.Input[_builtins.str]] = None,
                 start_date: Optional[pulumi.Input[_builtins.str]] = None,
                 suppression_query: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Datadog Security Monitoring Suppression API resource. It can be used to create and manage Datadog security monitoring suppression rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        my_suppression = datadog.SecurityMonitoringSuppression("my_suppression",
            name="My suppression",
            description="Suppression for low severity CloudTrail signals from John Doe, excluding test environments from analysis, limited to 2024",
            enabled=True,
            rule_query="severity:low source:cloudtrail",
            suppression_query="@usr.id:john.doe",
            data_exclusion_query="env:test",
            start_date="2024-12-01T16:00:00Z",
            expiration_date="2024-12-31T12:00:00Z")
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        Security monitoring suppressions can be imported using ID, for example:

        ```sh
        $ pulumi import datadog:index/securityMonitoringSuppression:SecurityMonitoringSuppression my_suppression m0o-hto-lkb
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] data_exclusion_query: An exclusion query on the input data of the security rules, which could be logs, Agent events, or other types of data based on the security rule. Events matching this query are ignored by any detection rules referenced in the suppression rule.
        :param pulumi.Input[_builtins.str] description: A description for the suppression rule.
        :param pulumi.Input[_builtins.bool] enabled: Whether the suppression rule is enabled.
        :param pulumi.Input[_builtins.str] expiration_date: A RFC3339 timestamp giving an expiration date for the suppression rule. After this date, it won't suppress signals anymore.
        :param pulumi.Input[_builtins.str] name: The name of the suppression rule.
        :param pulumi.Input[_builtins.str] rule_query: The rule query of the suppression rule, with the same syntax as the search bar for detection rules.
        :param pulumi.Input[_builtins.str] start_date: A RFC3339 timestamp giving a start date for the suppression rule. Before this date, it doesn't suppress signals.
        :param pulumi.Input[_builtins.str] suppression_query: The suppression query of the suppression rule. If a signal matches this query, it is suppressed and is not triggered. It uses the same syntax as the queries to search signals in the Signals Explorer.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecurityMonitoringSuppressionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Datadog Security Monitoring Suppression API resource. It can be used to create and manage Datadog security monitoring suppression rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        my_suppression = datadog.SecurityMonitoringSuppression("my_suppression",
            name="My suppression",
            description="Suppression for low severity CloudTrail signals from John Doe, excluding test environments from analysis, limited to 2024",
            enabled=True,
            rule_query="severity:low source:cloudtrail",
            suppression_query="@usr.id:john.doe",
            data_exclusion_query="env:test",
            start_date="2024-12-01T16:00:00Z",
            expiration_date="2024-12-31T12:00:00Z")
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        Security monitoring suppressions can be imported using ID, for example:

        ```sh
        $ pulumi import datadog:index/securityMonitoringSuppression:SecurityMonitoringSuppression my_suppression m0o-hto-lkb
        ```

        :param str resource_name: The name of the resource.
        :param SecurityMonitoringSuppressionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecurityMonitoringSuppressionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_exclusion_query: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 expiration_date: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_query: Optional[pulumi.Input[_builtins.str]] = None,
                 start_date: Optional[pulumi.Input[_builtins.str]] = None,
                 suppression_query: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecurityMonitoringSuppressionArgs.__new__(SecurityMonitoringSuppressionArgs)

            __props__.__dict__["data_exclusion_query"] = data_exclusion_query
            __props__.__dict__["description"] = description
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["expiration_date"] = expiration_date
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if rule_query is None and not opts.urn:
                raise TypeError("Missing required property 'rule_query'")
            __props__.__dict__["rule_query"] = rule_query
            __props__.__dict__["start_date"] = start_date
            __props__.__dict__["suppression_query"] = suppression_query
        super(SecurityMonitoringSuppression, __self__).__init__(
            'datadog:index/securityMonitoringSuppression:SecurityMonitoringSuppression',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            data_exclusion_query: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            expiration_date: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            rule_query: Optional[pulumi.Input[_builtins.str]] = None,
            start_date: Optional[pulumi.Input[_builtins.str]] = None,
            suppression_query: Optional[pulumi.Input[_builtins.str]] = None) -> 'SecurityMonitoringSuppression':
        """
        Get an existing SecurityMonitoringSuppression resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] data_exclusion_query: An exclusion query on the input data of the security rules, which could be logs, Agent events, or other types of data based on the security rule. Events matching this query are ignored by any detection rules referenced in the suppression rule.
        :param pulumi.Input[_builtins.str] description: A description for the suppression rule.
        :param pulumi.Input[_builtins.bool] enabled: Whether the suppression rule is enabled.
        :param pulumi.Input[_builtins.str] expiration_date: A RFC3339 timestamp giving an expiration date for the suppression rule. After this date, it won't suppress signals anymore.
        :param pulumi.Input[_builtins.str] name: The name of the suppression rule.
        :param pulumi.Input[_builtins.str] rule_query: The rule query of the suppression rule, with the same syntax as the search bar for detection rules.
        :param pulumi.Input[_builtins.str] start_date: A RFC3339 timestamp giving a start date for the suppression rule. Before this date, it doesn't suppress signals.
        :param pulumi.Input[_builtins.str] suppression_query: The suppression query of the suppression rule. If a signal matches this query, it is suppressed and is not triggered. It uses the same syntax as the queries to search signals in the Signals Explorer.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecurityMonitoringSuppressionState.__new__(_SecurityMonitoringSuppressionState)

        __props__.__dict__["data_exclusion_query"] = data_exclusion_query
        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["expiration_date"] = expiration_date
        __props__.__dict__["name"] = name
        __props__.__dict__["rule_query"] = rule_query
        __props__.__dict__["start_date"] = start_date
        __props__.__dict__["suppression_query"] = suppression_query
        return SecurityMonitoringSuppression(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="dataExclusionQuery")
    def data_exclusion_query(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        An exclusion query on the input data of the security rules, which could be logs, Agent events, or other types of data based on the security rule. Events matching this query are ignored by any detection rules referenced in the suppression rule.
        """
        return pulumi.get(self, "data_exclusion_query")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A description for the suppression rule.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        Whether the suppression rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A RFC3339 timestamp giving an expiration date for the suppression rule. After this date, it won't suppress signals anymore.
        """
        return pulumi.get(self, "expiration_date")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the suppression rule.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="ruleQuery")
    def rule_query(self) -> pulumi.Output[_builtins.str]:
        """
        The rule query of the suppression rule, with the same syntax as the search bar for detection rules.
        """
        return pulumi.get(self, "rule_query")

    @_builtins.property
    @pulumi.getter(name="startDate")
    def start_date(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A RFC3339 timestamp giving a start date for the suppression rule. Before this date, it doesn't suppress signals.
        """
        return pulumi.get(self, "start_date")

    @_builtins.property
    @pulumi.getter(name="suppressionQuery")
    def suppression_query(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The suppression query of the suppression rule. If a signal matches this query, it is suppressed and is not triggered. It uses the same syntax as the queries to search signals in the Signals Explorer.
        """
        return pulumi.get(self, "suppression_query")

