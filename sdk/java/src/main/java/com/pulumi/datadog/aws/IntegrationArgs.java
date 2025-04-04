// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationArgs Empty = new IntegrationArgs();

    /**
     * Your AWS access key ID. Only required if your AWS account is a GovCloud or China account.
     * 
     */
    @Import(name="accessKeyId")
    private @Nullable Output<String> accessKeyId;

    /**
     * @return Your AWS access key ID. Only required if your AWS account is a GovCloud or China account.
     * 
     */
    public Optional<Output<String>> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }

    /**
     * Your AWS Account ID without dashes.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Your AWS Account ID without dashes.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Enables or disables metric collection for specific AWS namespaces for this AWS account only. A list of namespaces can be found at the [available namespace rules API endpoint](https://docs.datadoghq.com/api/v1/aws-integration/#list-namespace-rules).
     * 
     */
    @Import(name="accountSpecificNamespaceRules")
    private @Nullable Output<Map<String,String>> accountSpecificNamespaceRules;

    /**
     * @return Enables or disables metric collection for specific AWS namespaces for this AWS account only. A list of namespaces can be found at the [available namespace rules API endpoint](https://docs.datadoghq.com/api/v1/aws-integration/#list-namespace-rules).
     * 
     */
    public Optional<Output<Map<String,String>>> accountSpecificNamespaceRules() {
        return Optional.ofNullable(this.accountSpecificNamespaceRules);
    }

    /**
     * Whether Datadog collects cloud security posture management resources from your AWS account. This includes additional resources not covered under the general resource_collection.
     * 
     */
    @Import(name="cspmResourceCollectionEnabled")
    private @Nullable Output<String> cspmResourceCollectionEnabled;

    /**
     * @return Whether Datadog collects cloud security posture management resources from your AWS account. This includes additional resources not covered under the general resource_collection.
     * 
     */
    public Optional<Output<String>> cspmResourceCollectionEnabled() {
        return Optional.ofNullable(this.cspmResourceCollectionEnabled);
    }

    /**
     * An array of AWS regions to exclude from metrics collection.
     * 
     */
    @Import(name="excludedRegions")
    private @Nullable Output<List<String>> excludedRegions;

    /**
     * @return An array of AWS regions to exclude from metrics collection.
     * 
     */
    public Optional<Output<List<String>>> excludedRegions() {
        return Optional.ofNullable(this.excludedRegions);
    }

    /**
     * Whether Datadog collects additional attributes and configuration information about the resources in your AWS account. Required for `cspm_resource_collection_enabled`.
     * 
     */
    @Import(name="extendedResourceCollectionEnabled")
    private @Nullable Output<String> extendedResourceCollectionEnabled;

    /**
     * @return Whether Datadog collects additional attributes and configuration information about the resources in your AWS account. Required for `cspm_resource_collection_enabled`.
     * 
     */
    public Optional<Output<String>> extendedResourceCollectionEnabled() {
        return Optional.ofNullable(this.extendedResourceCollectionEnabled);
    }

    /**
     * Array of EC2 tags (in the form `key:value`) defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as `?` (for single characters) and `*` (for multiple characters) can also be used. Only hosts that match one of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given tag can also be excluded by adding `!` before the tag. e.x. `env:production,instance-type:c1.*,!region:us-east-1`.
     * 
     */
    @Import(name="filterTags")
    private @Nullable Output<List<String>> filterTags;

    /**
     * @return Array of EC2 tags (in the form `key:value`) defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as `?` (for single characters) and `*` (for multiple characters) can also be used. Only hosts that match one of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given tag can also be excluded by adding `!` before the tag. e.x. `env:production,instance-type:c1.*,!region:us-east-1`.
     * 
     */
    public Optional<Output<List<String>>> filterTags() {
        return Optional.ofNullable(this.filterTags);
    }

    /**
     * Array of tags (in the form `key:value`) to add to all hosts and metrics reporting through this integration.
     * 
     */
    @Import(name="hostTags")
    private @Nullable Output<List<String>> hostTags;

    /**
     * @return Array of tags (in the form `key:value`) to add to all hosts and metrics reporting through this integration.
     * 
     */
    public Optional<Output<List<String>>> hostTags() {
        return Optional.ofNullable(this.hostTags);
    }

    /**
     * Whether Datadog collects metrics for this AWS account.
     * 
     */
    @Import(name="metricsCollectionEnabled")
    private @Nullable Output<String> metricsCollectionEnabled;

    /**
     * @return Whether Datadog collects metrics for this AWS account.
     * 
     */
    public Optional<Output<String>> metricsCollectionEnabled() {
        return Optional.ofNullable(this.metricsCollectionEnabled);
    }

    /**
     * Whether Datadog collects a standard set of resources from your AWS account. **Deprecated.** Deprecated in favor of `extended_resource_collection_enabled`.
     * 
     * @deprecated
     * Deprecated in favor of `extended_resource_collection_enabled`.
     * 
     */
    @Deprecated /* Deprecated in favor of `extended_resource_collection_enabled`. */
    @Import(name="resourceCollectionEnabled")
    private @Nullable Output<String> resourceCollectionEnabled;

    /**
     * @return Whether Datadog collects a standard set of resources from your AWS account. **Deprecated.** Deprecated in favor of `extended_resource_collection_enabled`.
     * 
     * @deprecated
     * Deprecated in favor of `extended_resource_collection_enabled`.
     * 
     */
    @Deprecated /* Deprecated in favor of `extended_resource_collection_enabled`. */
    public Optional<Output<String>> resourceCollectionEnabled() {
        return Optional.ofNullable(this.resourceCollectionEnabled);
    }

    /**
     * Your Datadog role delegation name.
     * 
     */
    @Import(name="roleName")
    private @Nullable Output<String> roleName;

    /**
     * @return Your Datadog role delegation name.
     * 
     */
    public Optional<Output<String>> roleName() {
        return Optional.ofNullable(this.roleName);
    }

    /**
     * Your AWS secret access key. Only required if your AWS account is a GovCloud or China account.
     * 
     */
    @Import(name="secretAccessKey")
    private @Nullable Output<String> secretAccessKey;

    /**
     * @return Your AWS secret access key. Only required if your AWS account is a GovCloud or China account.
     * 
     */
    public Optional<Output<String>> secretAccessKey() {
        return Optional.ofNullable(this.secretAccessKey);
    }

    private IntegrationArgs() {}

    private IntegrationArgs(IntegrationArgs $) {
        this.accessKeyId = $.accessKeyId;
        this.accountId = $.accountId;
        this.accountSpecificNamespaceRules = $.accountSpecificNamespaceRules;
        this.cspmResourceCollectionEnabled = $.cspmResourceCollectionEnabled;
        this.excludedRegions = $.excludedRegions;
        this.extendedResourceCollectionEnabled = $.extendedResourceCollectionEnabled;
        this.filterTags = $.filterTags;
        this.hostTags = $.hostTags;
        this.metricsCollectionEnabled = $.metricsCollectionEnabled;
        this.resourceCollectionEnabled = $.resourceCollectionEnabled;
        this.roleName = $.roleName;
        this.secretAccessKey = $.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationArgs $;

        public Builder() {
            $ = new IntegrationArgs();
        }

        public Builder(IntegrationArgs defaults) {
            $ = new IntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKeyId Your AWS access key ID. Only required if your AWS account is a GovCloud or China account.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(@Nullable Output<String> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * @param accessKeyId Your AWS access key ID. Only required if your AWS account is a GovCloud or China account.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(String accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        /**
         * @param accountId Your AWS Account ID without dashes.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Your AWS Account ID without dashes.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param accountSpecificNamespaceRules Enables or disables metric collection for specific AWS namespaces for this AWS account only. A list of namespaces can be found at the [available namespace rules API endpoint](https://docs.datadoghq.com/api/v1/aws-integration/#list-namespace-rules).
         * 
         * @return builder
         * 
         */
        public Builder accountSpecificNamespaceRules(@Nullable Output<Map<String,String>> accountSpecificNamespaceRules) {
            $.accountSpecificNamespaceRules = accountSpecificNamespaceRules;
            return this;
        }

        /**
         * @param accountSpecificNamespaceRules Enables or disables metric collection for specific AWS namespaces for this AWS account only. A list of namespaces can be found at the [available namespace rules API endpoint](https://docs.datadoghq.com/api/v1/aws-integration/#list-namespace-rules).
         * 
         * @return builder
         * 
         */
        public Builder accountSpecificNamespaceRules(Map<String,String> accountSpecificNamespaceRules) {
            return accountSpecificNamespaceRules(Output.of(accountSpecificNamespaceRules));
        }

        /**
         * @param cspmResourceCollectionEnabled Whether Datadog collects cloud security posture management resources from your AWS account. This includes additional resources not covered under the general resource_collection.
         * 
         * @return builder
         * 
         */
        public Builder cspmResourceCollectionEnabled(@Nullable Output<String> cspmResourceCollectionEnabled) {
            $.cspmResourceCollectionEnabled = cspmResourceCollectionEnabled;
            return this;
        }

        /**
         * @param cspmResourceCollectionEnabled Whether Datadog collects cloud security posture management resources from your AWS account. This includes additional resources not covered under the general resource_collection.
         * 
         * @return builder
         * 
         */
        public Builder cspmResourceCollectionEnabled(String cspmResourceCollectionEnabled) {
            return cspmResourceCollectionEnabled(Output.of(cspmResourceCollectionEnabled));
        }

        /**
         * @param excludedRegions An array of AWS regions to exclude from metrics collection.
         * 
         * @return builder
         * 
         */
        public Builder excludedRegions(@Nullable Output<List<String>> excludedRegions) {
            $.excludedRegions = excludedRegions;
            return this;
        }

        /**
         * @param excludedRegions An array of AWS regions to exclude from metrics collection.
         * 
         * @return builder
         * 
         */
        public Builder excludedRegions(List<String> excludedRegions) {
            return excludedRegions(Output.of(excludedRegions));
        }

        /**
         * @param excludedRegions An array of AWS regions to exclude from metrics collection.
         * 
         * @return builder
         * 
         */
        public Builder excludedRegions(String... excludedRegions) {
            return excludedRegions(List.of(excludedRegions));
        }

        /**
         * @param extendedResourceCollectionEnabled Whether Datadog collects additional attributes and configuration information about the resources in your AWS account. Required for `cspm_resource_collection_enabled`.
         * 
         * @return builder
         * 
         */
        public Builder extendedResourceCollectionEnabled(@Nullable Output<String> extendedResourceCollectionEnabled) {
            $.extendedResourceCollectionEnabled = extendedResourceCollectionEnabled;
            return this;
        }

        /**
         * @param extendedResourceCollectionEnabled Whether Datadog collects additional attributes and configuration information about the resources in your AWS account. Required for `cspm_resource_collection_enabled`.
         * 
         * @return builder
         * 
         */
        public Builder extendedResourceCollectionEnabled(String extendedResourceCollectionEnabled) {
            return extendedResourceCollectionEnabled(Output.of(extendedResourceCollectionEnabled));
        }

        /**
         * @param filterTags Array of EC2 tags (in the form `key:value`) defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as `?` (for single characters) and `*` (for multiple characters) can also be used. Only hosts that match one of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given tag can also be excluded by adding `!` before the tag. e.x. `env:production,instance-type:c1.*,!region:us-east-1`.
         * 
         * @return builder
         * 
         */
        public Builder filterTags(@Nullable Output<List<String>> filterTags) {
            $.filterTags = filterTags;
            return this;
        }

        /**
         * @param filterTags Array of EC2 tags (in the form `key:value`) defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as `?` (for single characters) and `*` (for multiple characters) can also be used. Only hosts that match one of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given tag can also be excluded by adding `!` before the tag. e.x. `env:production,instance-type:c1.*,!region:us-east-1`.
         * 
         * @return builder
         * 
         */
        public Builder filterTags(List<String> filterTags) {
            return filterTags(Output.of(filterTags));
        }

        /**
         * @param filterTags Array of EC2 tags (in the form `key:value`) defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as `?` (for single characters) and `*` (for multiple characters) can also be used. Only hosts that match one of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given tag can also be excluded by adding `!` before the tag. e.x. `env:production,instance-type:c1.*,!region:us-east-1`.
         * 
         * @return builder
         * 
         */
        public Builder filterTags(String... filterTags) {
            return filterTags(List.of(filterTags));
        }

        /**
         * @param hostTags Array of tags (in the form `key:value`) to add to all hosts and metrics reporting through this integration.
         * 
         * @return builder
         * 
         */
        public Builder hostTags(@Nullable Output<List<String>> hostTags) {
            $.hostTags = hostTags;
            return this;
        }

        /**
         * @param hostTags Array of tags (in the form `key:value`) to add to all hosts and metrics reporting through this integration.
         * 
         * @return builder
         * 
         */
        public Builder hostTags(List<String> hostTags) {
            return hostTags(Output.of(hostTags));
        }

        /**
         * @param hostTags Array of tags (in the form `key:value`) to add to all hosts and metrics reporting through this integration.
         * 
         * @return builder
         * 
         */
        public Builder hostTags(String... hostTags) {
            return hostTags(List.of(hostTags));
        }

        /**
         * @param metricsCollectionEnabled Whether Datadog collects metrics for this AWS account.
         * 
         * @return builder
         * 
         */
        public Builder metricsCollectionEnabled(@Nullable Output<String> metricsCollectionEnabled) {
            $.metricsCollectionEnabled = metricsCollectionEnabled;
            return this;
        }

        /**
         * @param metricsCollectionEnabled Whether Datadog collects metrics for this AWS account.
         * 
         * @return builder
         * 
         */
        public Builder metricsCollectionEnabled(String metricsCollectionEnabled) {
            return metricsCollectionEnabled(Output.of(metricsCollectionEnabled));
        }

        /**
         * @param resourceCollectionEnabled Whether Datadog collects a standard set of resources from your AWS account. **Deprecated.** Deprecated in favor of `extended_resource_collection_enabled`.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated in favor of `extended_resource_collection_enabled`.
         * 
         */
        @Deprecated /* Deprecated in favor of `extended_resource_collection_enabled`. */
        public Builder resourceCollectionEnabled(@Nullable Output<String> resourceCollectionEnabled) {
            $.resourceCollectionEnabled = resourceCollectionEnabled;
            return this;
        }

        /**
         * @param resourceCollectionEnabled Whether Datadog collects a standard set of resources from your AWS account. **Deprecated.** Deprecated in favor of `extended_resource_collection_enabled`.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated in favor of `extended_resource_collection_enabled`.
         * 
         */
        @Deprecated /* Deprecated in favor of `extended_resource_collection_enabled`. */
        public Builder resourceCollectionEnabled(String resourceCollectionEnabled) {
            return resourceCollectionEnabled(Output.of(resourceCollectionEnabled));
        }

        /**
         * @param roleName Your Datadog role delegation name.
         * 
         * @return builder
         * 
         */
        public Builder roleName(@Nullable Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName Your Datadog role delegation name.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        /**
         * @param secretAccessKey Your AWS secret access key. Only required if your AWS account is a GovCloud or China account.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(@Nullable Output<String> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        /**
         * @param secretAccessKey Your AWS secret access key. Only required if your AWS account is a GovCloud or China account.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(String secretAccessKey) {
            return secretAccessKey(Output.of(secretAccessKey));
        }

        public IntegrationArgs build() {
            return $;
        }
    }

}
