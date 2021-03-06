# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['MetricMetadata']


class MetricMetadata(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 metric: Optional[pulumi.Input[str]] = None,
                 per_unit: Optional[pulumi.Input[str]] = None,
                 short_name: Optional[pulumi.Input[str]] = None,
                 statsd_interval: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 unit: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Datadog metric_metadata resource. This can be used to manage a metric's metadata.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        # Manage a Datadog metric's metadata
        request_time = datadog.MetricMetadata("requestTime",
            description="99th percentile request time in millseconds",
            metric="request.time",
            short_name="Request time",
            type="gauge",
            unit="millisecond")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description of the metric.
        :param pulumi.Input[str] metric: The name of the metric.
        :param pulumi.Input[str] per_unit: Per unit of the metric such as `second` in `bytes per second`.
        :param pulumi.Input[str] short_name: A short name of the metric.
        :param pulumi.Input[int] statsd_interval: If applicable, statsd flush interval in seconds for the metric.
        :param pulumi.Input[str] type: Type of the metric.
        :param pulumi.Input[str] unit: Primary unit of the metric such as `byte` or `operation`.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['description'] = description
            if metric is None and not opts.urn:
                raise TypeError("Missing required property 'metric'")
            __props__['metric'] = metric
            __props__['per_unit'] = per_unit
            __props__['short_name'] = short_name
            __props__['statsd_interval'] = statsd_interval
            __props__['type'] = type
            __props__['unit'] = unit
        super(MetricMetadata, __self__).__init__(
            'datadog:index/metricMetadata:MetricMetadata',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            metric: Optional[pulumi.Input[str]] = None,
            per_unit: Optional[pulumi.Input[str]] = None,
            short_name: Optional[pulumi.Input[str]] = None,
            statsd_interval: Optional[pulumi.Input[int]] = None,
            type: Optional[pulumi.Input[str]] = None,
            unit: Optional[pulumi.Input[str]] = None) -> 'MetricMetadata':
        """
        Get an existing MetricMetadata resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description of the metric.
        :param pulumi.Input[str] metric: The name of the metric.
        :param pulumi.Input[str] per_unit: Per unit of the metric such as `second` in `bytes per second`.
        :param pulumi.Input[str] short_name: A short name of the metric.
        :param pulumi.Input[int] statsd_interval: If applicable, statsd flush interval in seconds for the metric.
        :param pulumi.Input[str] type: Type of the metric.
        :param pulumi.Input[str] unit: Primary unit of the metric such as `byte` or `operation`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["description"] = description
        __props__["metric"] = metric
        __props__["per_unit"] = per_unit
        __props__["short_name"] = short_name
        __props__["statsd_interval"] = statsd_interval
        __props__["type"] = type
        __props__["unit"] = unit
        return MetricMetadata(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A description of the metric.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def metric(self) -> pulumi.Output[str]:
        """
        The name of the metric.
        """
        return pulumi.get(self, "metric")

    @property
    @pulumi.getter(name="perUnit")
    def per_unit(self) -> pulumi.Output[Optional[str]]:
        """
        Per unit of the metric such as `second` in `bytes per second`.
        """
        return pulumi.get(self, "per_unit")

    @property
    @pulumi.getter(name="shortName")
    def short_name(self) -> pulumi.Output[Optional[str]]:
        """
        A short name of the metric.
        """
        return pulumi.get(self, "short_name")

    @property
    @pulumi.getter(name="statsdInterval")
    def statsd_interval(self) -> pulumi.Output[Optional[int]]:
        """
        If applicable, statsd flush interval in seconds for the metric.
        """
        return pulumi.get(self, "statsd_interval")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        Type of the metric.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def unit(self) -> pulumi.Output[Optional[str]]:
        """
        Primary unit of the metric such as `byte` or `operation`.
        """
        return pulumi.get(self, "unit")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

