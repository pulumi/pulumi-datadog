// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.gcp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.gcp.inputs.IntegrationStsMetricNamespaceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationStsState extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationStsState Empty = new IntegrationStsState();

    /**
     * Tags to be associated with GCP metrics and service checks from your account.
     * 
     */
    @Import(name="accountTags")
    private @Nullable Output<List<String>> accountTags;

    /**
     * @return Tags to be associated with GCP metrics and service checks from your account.
     * 
     */
    public Optional<Output<List<String>>> accountTags() {
        return Optional.ofNullable(this.accountTags);
    }

    /**
     * Silence monitors for expected GCE instance shutdowns.
     * 
     */
    @Import(name="automute")
    private @Nullable Output<Boolean> automute;

    /**
     * @return Silence monitors for expected GCE instance shutdowns.
     * 
     */
    public Optional<Output<Boolean>> automute() {
        return Optional.ofNullable(this.automute);
    }

    /**
     * Your service account email address.
     * 
     */
    @Import(name="clientEmail")
    private @Nullable Output<String> clientEmail;

    /**
     * @return Your service account email address.
     * 
     */
    public Optional<Output<String>> clientEmail() {
        return Optional.ofNullable(this.clientEmail);
    }

    /**
     * Tags to filter which Cloud Run revisions are imported into Datadog. Only revisions that meet specified criteria are monitored.
     * 
     */
    @Import(name="cloudRunRevisionFilters")
    private @Nullable Output<List<String>> cloudRunRevisionFilters;

    /**
     * @return Tags to filter which Cloud Run revisions are imported into Datadog. Only revisions that meet specified criteria are monitored.
     * 
     */
    public Optional<Output<List<String>>> cloudRunRevisionFilters() {
        return Optional.ofNullable(this.cloudRunRevisionFilters);
    }

    /**
     * Datadog&#39;s STS Delegate Email.
     * 
     */
    @Import(name="delegateAccountEmail")
    private @Nullable Output<String> delegateAccountEmail;

    /**
     * @return Datadog&#39;s STS Delegate Email.
     * 
     */
    public Optional<Output<String>> delegateAccountEmail() {
        return Optional.ofNullable(this.delegateAccountEmail);
    }

    /**
     * Your Host Filters.
     * 
     */
    @Import(name="hostFilters")
    private @Nullable Output<List<String>> hostFilters;

    /**
     * @return Your Host Filters.
     * 
     */
    public Optional<Output<List<String>>> hostFilters() {
        return Optional.ofNullable(this.hostFilters);
    }

    /**
     * Whether Datadog collects cloud security posture management resources from your GCP project. If enabled, requires `resource_collection_enabled` to also be enabled.
     * 
     */
    @Import(name="isCspmEnabled")
    private @Nullable Output<Boolean> isCspmEnabled;

    /**
     * @return Whether Datadog collects cloud security posture management resources from your GCP project. If enabled, requires `resource_collection_enabled` to also be enabled.
     * 
     */
    public Optional<Output<Boolean>> isCspmEnabled() {
        return Optional.ofNullable(this.isCspmEnabled);
    }

    /**
     * When enabled, Datadog scans for all resource change data in your Google Cloud environment.
     * 
     */
    @Import(name="isResourceChangeCollectionEnabled")
    private @Nullable Output<Boolean> isResourceChangeCollectionEnabled;

    /**
     * @return When enabled, Datadog scans for all resource change data in your Google Cloud environment.
     * 
     */
    public Optional<Output<Boolean>> isResourceChangeCollectionEnabled() {
        return Optional.ofNullable(this.isResourceChangeCollectionEnabled);
    }

    /**
     * When enabled, Datadog will attempt to collect Security Command Center Findings. Note: This requires additional permissions on the service account. Defaults to `false`.
     * 
     */
    @Import(name="isSecurityCommandCenterEnabled")
    private @Nullable Output<Boolean> isSecurityCommandCenterEnabled;

    /**
     * @return When enabled, Datadog will attempt to collect Security Command Center Findings. Note: This requires additional permissions on the service account. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> isSecurityCommandCenterEnabled() {
        return Optional.ofNullable(this.isSecurityCommandCenterEnabled);
    }

    /**
     * Configuration for a GCP metric namespace.
     * 
     */
    @Import(name="metricNamespaceConfigs")
    private @Nullable Output<List<IntegrationStsMetricNamespaceConfigArgs>> metricNamespaceConfigs;

    /**
     * @return Configuration for a GCP metric namespace.
     * 
     */
    public Optional<Output<List<IntegrationStsMetricNamespaceConfigArgs>>> metricNamespaceConfigs() {
        return Optional.ofNullable(this.metricNamespaceConfigs);
    }

    /**
     * When enabled, Datadog scans for all resources in your GCP environment.
     * 
     */
    @Import(name="resourceCollectionEnabled")
    private @Nullable Output<Boolean> resourceCollectionEnabled;

    /**
     * @return When enabled, Datadog scans for all resources in your GCP environment.
     * 
     */
    public Optional<Output<Boolean>> resourceCollectionEnabled() {
        return Optional.ofNullable(this.resourceCollectionEnabled);
    }

    private IntegrationStsState() {}

    private IntegrationStsState(IntegrationStsState $) {
        this.accountTags = $.accountTags;
        this.automute = $.automute;
        this.clientEmail = $.clientEmail;
        this.cloudRunRevisionFilters = $.cloudRunRevisionFilters;
        this.delegateAccountEmail = $.delegateAccountEmail;
        this.hostFilters = $.hostFilters;
        this.isCspmEnabled = $.isCspmEnabled;
        this.isResourceChangeCollectionEnabled = $.isResourceChangeCollectionEnabled;
        this.isSecurityCommandCenterEnabled = $.isSecurityCommandCenterEnabled;
        this.metricNamespaceConfigs = $.metricNamespaceConfigs;
        this.resourceCollectionEnabled = $.resourceCollectionEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationStsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationStsState $;

        public Builder() {
            $ = new IntegrationStsState();
        }

        public Builder(IntegrationStsState defaults) {
            $ = new IntegrationStsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountTags Tags to be associated with GCP metrics and service checks from your account.
         * 
         * @return builder
         * 
         */
        public Builder accountTags(@Nullable Output<List<String>> accountTags) {
            $.accountTags = accountTags;
            return this;
        }

        /**
         * @param accountTags Tags to be associated with GCP metrics and service checks from your account.
         * 
         * @return builder
         * 
         */
        public Builder accountTags(List<String> accountTags) {
            return accountTags(Output.of(accountTags));
        }

        /**
         * @param accountTags Tags to be associated with GCP metrics and service checks from your account.
         * 
         * @return builder
         * 
         */
        public Builder accountTags(String... accountTags) {
            return accountTags(List.of(accountTags));
        }

        /**
         * @param automute Silence monitors for expected GCE instance shutdowns.
         * 
         * @return builder
         * 
         */
        public Builder automute(@Nullable Output<Boolean> automute) {
            $.automute = automute;
            return this;
        }

        /**
         * @param automute Silence monitors for expected GCE instance shutdowns.
         * 
         * @return builder
         * 
         */
        public Builder automute(Boolean automute) {
            return automute(Output.of(automute));
        }

        /**
         * @param clientEmail Your service account email address.
         * 
         * @return builder
         * 
         */
        public Builder clientEmail(@Nullable Output<String> clientEmail) {
            $.clientEmail = clientEmail;
            return this;
        }

        /**
         * @param clientEmail Your service account email address.
         * 
         * @return builder
         * 
         */
        public Builder clientEmail(String clientEmail) {
            return clientEmail(Output.of(clientEmail));
        }

        /**
         * @param cloudRunRevisionFilters Tags to filter which Cloud Run revisions are imported into Datadog. Only revisions that meet specified criteria are monitored.
         * 
         * @return builder
         * 
         */
        public Builder cloudRunRevisionFilters(@Nullable Output<List<String>> cloudRunRevisionFilters) {
            $.cloudRunRevisionFilters = cloudRunRevisionFilters;
            return this;
        }

        /**
         * @param cloudRunRevisionFilters Tags to filter which Cloud Run revisions are imported into Datadog. Only revisions that meet specified criteria are monitored.
         * 
         * @return builder
         * 
         */
        public Builder cloudRunRevisionFilters(List<String> cloudRunRevisionFilters) {
            return cloudRunRevisionFilters(Output.of(cloudRunRevisionFilters));
        }

        /**
         * @param cloudRunRevisionFilters Tags to filter which Cloud Run revisions are imported into Datadog. Only revisions that meet specified criteria are monitored.
         * 
         * @return builder
         * 
         */
        public Builder cloudRunRevisionFilters(String... cloudRunRevisionFilters) {
            return cloudRunRevisionFilters(List.of(cloudRunRevisionFilters));
        }

        /**
         * @param delegateAccountEmail Datadog&#39;s STS Delegate Email.
         * 
         * @return builder
         * 
         */
        public Builder delegateAccountEmail(@Nullable Output<String> delegateAccountEmail) {
            $.delegateAccountEmail = delegateAccountEmail;
            return this;
        }

        /**
         * @param delegateAccountEmail Datadog&#39;s STS Delegate Email.
         * 
         * @return builder
         * 
         */
        public Builder delegateAccountEmail(String delegateAccountEmail) {
            return delegateAccountEmail(Output.of(delegateAccountEmail));
        }

        /**
         * @param hostFilters Your Host Filters.
         * 
         * @return builder
         * 
         */
        public Builder hostFilters(@Nullable Output<List<String>> hostFilters) {
            $.hostFilters = hostFilters;
            return this;
        }

        /**
         * @param hostFilters Your Host Filters.
         * 
         * @return builder
         * 
         */
        public Builder hostFilters(List<String> hostFilters) {
            return hostFilters(Output.of(hostFilters));
        }

        /**
         * @param hostFilters Your Host Filters.
         * 
         * @return builder
         * 
         */
        public Builder hostFilters(String... hostFilters) {
            return hostFilters(List.of(hostFilters));
        }

        /**
         * @param isCspmEnabled Whether Datadog collects cloud security posture management resources from your GCP project. If enabled, requires `resource_collection_enabled` to also be enabled.
         * 
         * @return builder
         * 
         */
        public Builder isCspmEnabled(@Nullable Output<Boolean> isCspmEnabled) {
            $.isCspmEnabled = isCspmEnabled;
            return this;
        }

        /**
         * @param isCspmEnabled Whether Datadog collects cloud security posture management resources from your GCP project. If enabled, requires `resource_collection_enabled` to also be enabled.
         * 
         * @return builder
         * 
         */
        public Builder isCspmEnabled(Boolean isCspmEnabled) {
            return isCspmEnabled(Output.of(isCspmEnabled));
        }

        /**
         * @param isResourceChangeCollectionEnabled When enabled, Datadog scans for all resource change data in your Google Cloud environment.
         * 
         * @return builder
         * 
         */
        public Builder isResourceChangeCollectionEnabled(@Nullable Output<Boolean> isResourceChangeCollectionEnabled) {
            $.isResourceChangeCollectionEnabled = isResourceChangeCollectionEnabled;
            return this;
        }

        /**
         * @param isResourceChangeCollectionEnabled When enabled, Datadog scans for all resource change data in your Google Cloud environment.
         * 
         * @return builder
         * 
         */
        public Builder isResourceChangeCollectionEnabled(Boolean isResourceChangeCollectionEnabled) {
            return isResourceChangeCollectionEnabled(Output.of(isResourceChangeCollectionEnabled));
        }

        /**
         * @param isSecurityCommandCenterEnabled When enabled, Datadog will attempt to collect Security Command Center Findings. Note: This requires additional permissions on the service account. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder isSecurityCommandCenterEnabled(@Nullable Output<Boolean> isSecurityCommandCenterEnabled) {
            $.isSecurityCommandCenterEnabled = isSecurityCommandCenterEnabled;
            return this;
        }

        /**
         * @param isSecurityCommandCenterEnabled When enabled, Datadog will attempt to collect Security Command Center Findings. Note: This requires additional permissions on the service account. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder isSecurityCommandCenterEnabled(Boolean isSecurityCommandCenterEnabled) {
            return isSecurityCommandCenterEnabled(Output.of(isSecurityCommandCenterEnabled));
        }

        /**
         * @param metricNamespaceConfigs Configuration for a GCP metric namespace.
         * 
         * @return builder
         * 
         */
        public Builder metricNamespaceConfigs(@Nullable Output<List<IntegrationStsMetricNamespaceConfigArgs>> metricNamespaceConfigs) {
            $.metricNamespaceConfigs = metricNamespaceConfigs;
            return this;
        }

        /**
         * @param metricNamespaceConfigs Configuration for a GCP metric namespace.
         * 
         * @return builder
         * 
         */
        public Builder metricNamespaceConfigs(List<IntegrationStsMetricNamespaceConfigArgs> metricNamespaceConfigs) {
            return metricNamespaceConfigs(Output.of(metricNamespaceConfigs));
        }

        /**
         * @param metricNamespaceConfigs Configuration for a GCP metric namespace.
         * 
         * @return builder
         * 
         */
        public Builder metricNamespaceConfigs(IntegrationStsMetricNamespaceConfigArgs... metricNamespaceConfigs) {
            return metricNamespaceConfigs(List.of(metricNamespaceConfigs));
        }

        /**
         * @param resourceCollectionEnabled When enabled, Datadog scans for all resources in your GCP environment.
         * 
         * @return builder
         * 
         */
        public Builder resourceCollectionEnabled(@Nullable Output<Boolean> resourceCollectionEnabled) {
            $.resourceCollectionEnabled = resourceCollectionEnabled;
            return this;
        }

        /**
         * @param resourceCollectionEnabled When enabled, Datadog scans for all resources in your GCP environment.
         * 
         * @return builder
         * 
         */
        public Builder resourceCollectionEnabled(Boolean resourceCollectionEnabled) {
            return resourceCollectionEnabled(Output.of(resourceCollectionEnabled));
        }

        public IntegrationStsState build() {
            return $;
        }
    }

}