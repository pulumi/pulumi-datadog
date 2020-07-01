# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables


class LogsArchive(pulumi.CustomResource):
    azure: pulumi.Output[dict]
    """
    Definition of an azure archive.

      * `client_id` (`str`) - Your client id.
      * `container` (`str`) - The container where the archive will be stored.
      * `path` (`str`) - The path where the archive will be stored.
      * `storage_account` (`str`) - The associated storage account.
      * `tenant_id` (`str`) - Your tenant id.
    """
    gcs: pulumi.Output[dict]
    """
    Definition of an gcs archive.

      * `bucket` (`str`) - Name of your gcs bucket.
      * `client_email` (`str`) - Your client email.
      * `path` (`str`) - The path where the archive will be stored.
      * `project_id` (`str`) - Your project id.
    """
    name: pulumi.Output[str]
    """
    Your archive name.
    """
    query: pulumi.Output[str]
    """
    The archive query/filter. Logs matching this query are included in the archive.
    """
    s3: pulumi.Output[dict]
    """
    Definition of an s3 archive.

      * `account_id` (`str`) - Your AWS account id.
      * `bucket` (`str`) - Name of your gcs bucket.
      * `client_email` (`str`) - Your client email.
      * `path` (`str`) - The path where the archive will be stored.
      * `project_id` (`str`) - Your project id.
      * `role_name` (`str`) - Your AWS role name.
    """
    def __init__(__self__, resource_name, opts=None, azure=None, gcs=None, name=None, query=None, s3=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Datadog [Logs Archive API](https://docs.datadoghq.com/api/v2/logs-archives/) resource, which is used to create and manage Datadog logs archives.

        ## Example Usage

        Create a Datadog logs archive:

        ```python
        import pulumi
        import pulumi_datadog as datadog

        my_s3_archive = datadog.LogsArchive("myS3Archive",
            name="my s3 archive",
            query="service:myservice",
            s3={
                "account_id": "001234567888",
                "bucket": "my-bucket",
                "path": "/path/foo",
                "role_name": "my-role-name",
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] azure: Definition of an azure archive.
        :param pulumi.Input[dict] gcs: Definition of an gcs archive.
        :param pulumi.Input[str] name: Your archive name.
        :param pulumi.Input[str] query: The archive query/filter. Logs matching this query are included in the archive.
        :param pulumi.Input[dict] s3: Definition of an s3 archive.

        The **azure** object supports the following:

          * `client_id` (`pulumi.Input[str]`) - Your client id.
          * `container` (`pulumi.Input[str]`) - The container where the archive will be stored.
          * `path` (`pulumi.Input[str]`) - The path where the archive will be stored.
          * `storage_account` (`pulumi.Input[str]`) - The associated storage account.
          * `tenant_id` (`pulumi.Input[str]`) - Your tenant id.

        The **gcs** object supports the following:

          * `bucket` (`pulumi.Input[str]`) - Name of your gcs bucket.
          * `client_email` (`pulumi.Input[str]`) - Your client email.
          * `path` (`pulumi.Input[str]`) - The path where the archive will be stored.
          * `project_id` (`pulumi.Input[str]`) - Your project id.

        The **s3** object supports the following:

          * `account_id` (`pulumi.Input[str]`) - Your AWS account id.
          * `bucket` (`pulumi.Input[str]`) - Name of your gcs bucket.
          * `client_email` (`pulumi.Input[str]`) - Your client email.
          * `path` (`pulumi.Input[str]`) - The path where the archive will be stored.
          * `project_id` (`pulumi.Input[str]`) - Your project id.
          * `role_name` (`pulumi.Input[str]`) - Your AWS role name.
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['azure'] = azure
            __props__['gcs'] = gcs
            if name is None:
                raise TypeError("Missing required property 'name'")
            __props__['name'] = name
            if query is None:
                raise TypeError("Missing required property 'query'")
            __props__['query'] = query
            __props__['s3'] = s3
        super(LogsArchive, __self__).__init__(
            'datadog:index/logsArchive:LogsArchive',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, azure=None, gcs=None, name=None, query=None, s3=None):
        """
        Get an existing LogsArchive resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] azure: Definition of an azure archive.
        :param pulumi.Input[dict] gcs: Definition of an gcs archive.
        :param pulumi.Input[str] name: Your archive name.
        :param pulumi.Input[str] query: The archive query/filter. Logs matching this query are included in the archive.
        :param pulumi.Input[dict] s3: Definition of an s3 archive.

        The **azure** object supports the following:

          * `client_id` (`pulumi.Input[str]`) - Your client id.
          * `container` (`pulumi.Input[str]`) - The container where the archive will be stored.
          * `path` (`pulumi.Input[str]`) - The path where the archive will be stored.
          * `storage_account` (`pulumi.Input[str]`) - The associated storage account.
          * `tenant_id` (`pulumi.Input[str]`) - Your tenant id.

        The **gcs** object supports the following:

          * `bucket` (`pulumi.Input[str]`) - Name of your gcs bucket.
          * `client_email` (`pulumi.Input[str]`) - Your client email.
          * `path` (`pulumi.Input[str]`) - The path where the archive will be stored.
          * `project_id` (`pulumi.Input[str]`) - Your project id.

        The **s3** object supports the following:

          * `account_id` (`pulumi.Input[str]`) - Your AWS account id.
          * `bucket` (`pulumi.Input[str]`) - Name of your gcs bucket.
          * `client_email` (`pulumi.Input[str]`) - Your client email.
          * `path` (`pulumi.Input[str]`) - The path where the archive will be stored.
          * `project_id` (`pulumi.Input[str]`) - Your project id.
          * `role_name` (`pulumi.Input[str]`) - Your AWS role name.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["azure"] = azure
        __props__["gcs"] = gcs
        __props__["name"] = name
        __props__["query"] = query
        __props__["s3"] = s3
        return LogsArchive(resource_name, opts=opts, __props__=__props__)

    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop