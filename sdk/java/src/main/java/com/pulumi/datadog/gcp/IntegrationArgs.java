// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.gcp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationArgs Empty = new IntegrationArgs();

    /**
     * Silence monitors for expected GCE instance shutdowns. Defaults to `false`.
     * 
     */
    @Import(name="automute")
    private @Nullable Output<Boolean> automute;

    /**
     * @return Silence monitors for expected GCE instance shutdowns. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> automute() {
        return Optional.ofNullable(this.automute);
    }

    /**
     * Your email found in your JSON service account key.
     * 
     */
    @Import(name="clientEmail", required=true)
    private Output<String> clientEmail;

    /**
     * @return Your email found in your JSON service account key.
     * 
     */
    public Output<String> clientEmail() {
        return this.clientEmail;
    }

    /**
     * Your ID found in your JSON service account key.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return Your ID found in your JSON service account key.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * Whether Datadog collects cloud security posture management resources from your GCP project. If enabled, requires `resource_collection_enabled` to also be enabled. Defaults to `false`.
     * 
     */
    @Import(name="cspmResourceCollectionEnabled")
    private @Nullable Output<Boolean> cspmResourceCollectionEnabled;

    /**
     * @return Whether Datadog collects cloud security posture management resources from your GCP project. If enabled, requires `resource_collection_enabled` to also be enabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> cspmResourceCollectionEnabled() {
        return Optional.ofNullable(this.cspmResourceCollectionEnabled);
    }

    /**
     * Limit the GCE instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog. Defaults to `&#34;&#34;`.
     * 
     */
    @Import(name="hostFilters")
    private @Nullable Output<String> hostFilters;

    /**
     * @return Limit the GCE instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog. Defaults to `&#34;&#34;`.
     * 
     */
    public Optional<Output<String>> hostFilters() {
        return Optional.ofNullable(this.hostFilters);
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
     * Your private key name found in your JSON service account key.
     * 
     */
    @Import(name="privateKey", required=true)
    private Output<String> privateKey;

    /**
     * @return Your private key name found in your JSON service account key.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }

    /**
     * Your private key ID found in your JSON service account key.
     * 
     */
    @Import(name="privateKeyId", required=true)
    private Output<String> privateKeyId;

    /**
     * @return Your private key ID found in your JSON service account key.
     * 
     */
    public Output<String> privateKeyId() {
        return this.privateKeyId;
    }

    /**
     * Your Google Cloud project ID found in your JSON service account key.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Your Google Cloud project ID found in your JSON service account key.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
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

    private IntegrationArgs() {}

    private IntegrationArgs(IntegrationArgs $) {
        this.automute = $.automute;
        this.clientEmail = $.clientEmail;
        this.clientId = $.clientId;
        this.cspmResourceCollectionEnabled = $.cspmResourceCollectionEnabled;
        this.hostFilters = $.hostFilters;
        this.isSecurityCommandCenterEnabled = $.isSecurityCommandCenterEnabled;
        this.privateKey = $.privateKey;
        this.privateKeyId = $.privateKeyId;
        this.projectId = $.projectId;
        this.resourceCollectionEnabled = $.resourceCollectionEnabled;
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
         * @param automute Silence monitors for expected GCE instance shutdowns. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder automute(@Nullable Output<Boolean> automute) {
            $.automute = automute;
            return this;
        }

        /**
         * @param automute Silence monitors for expected GCE instance shutdowns. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder automute(Boolean automute) {
            return automute(Output.of(automute));
        }

        /**
         * @param clientEmail Your email found in your JSON service account key.
         * 
         * @return builder
         * 
         */
        public Builder clientEmail(Output<String> clientEmail) {
            $.clientEmail = clientEmail;
            return this;
        }

        /**
         * @param clientEmail Your email found in your JSON service account key.
         * 
         * @return builder
         * 
         */
        public Builder clientEmail(String clientEmail) {
            return clientEmail(Output.of(clientEmail));
        }

        /**
         * @param clientId Your ID found in your JSON service account key.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Your ID found in your JSON service account key.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param cspmResourceCollectionEnabled Whether Datadog collects cloud security posture management resources from your GCP project. If enabled, requires `resource_collection_enabled` to also be enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder cspmResourceCollectionEnabled(@Nullable Output<Boolean> cspmResourceCollectionEnabled) {
            $.cspmResourceCollectionEnabled = cspmResourceCollectionEnabled;
            return this;
        }

        /**
         * @param cspmResourceCollectionEnabled Whether Datadog collects cloud security posture management resources from your GCP project. If enabled, requires `resource_collection_enabled` to also be enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder cspmResourceCollectionEnabled(Boolean cspmResourceCollectionEnabled) {
            return cspmResourceCollectionEnabled(Output.of(cspmResourceCollectionEnabled));
        }

        /**
         * @param hostFilters Limit the GCE instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder hostFilters(@Nullable Output<String> hostFilters) {
            $.hostFilters = hostFilters;
            return this;
        }

        /**
         * @param hostFilters Limit the GCE instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder hostFilters(String hostFilters) {
            return hostFilters(Output.of(hostFilters));
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
         * @param privateKey Your private key name found in your JSON service account key.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey Your private key name found in your JSON service account key.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param privateKeyId Your private key ID found in your JSON service account key.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyId(Output<String> privateKeyId) {
            $.privateKeyId = privateKeyId;
            return this;
        }

        /**
         * @param privateKeyId Your private key ID found in your JSON service account key.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyId(String privateKeyId) {
            return privateKeyId(Output.of(privateKeyId));
        }

        /**
         * @param projectId Your Google Cloud project ID found in your JSON service account key.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Your Google Cloud project ID found in your JSON service account key.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
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

        public IntegrationArgs build() {
            if ($.clientEmail == null) {
                throw new MissingRequiredPropertyException("IntegrationArgs", "clientEmail");
            }
            if ($.clientId == null) {
                throw new MissingRequiredPropertyException("IntegrationArgs", "clientId");
            }
            if ($.privateKey == null) {
                throw new MissingRequiredPropertyException("IntegrationArgs", "privateKey");
            }
            if ($.privateKeyId == null) {
                throw new MissingRequiredPropertyException("IntegrationArgs", "privateKeyId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("IntegrationArgs", "projectId");
            }
            return $;
        }
    }

}
