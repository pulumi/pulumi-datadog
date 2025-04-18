// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogsArchiveAzureArchiveArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogsArchiveAzureArchiveArgs Empty = new LogsArchiveAzureArchiveArgs();

    /**
     * Your client id.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return Your client id.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The container where the archive is stored.
     * 
     */
    @Import(name="container", required=true)
    private Output<String> container;

    /**
     * @return The container where the archive is stored.
     * 
     */
    public Output<String> container() {
        return this.container;
    }

    /**
     * The path where the archive is stored.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path where the archive is stored.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The associated storage account.
     * 
     */
    @Import(name="storageAccount", required=true)
    private Output<String> storageAccount;

    /**
     * @return The associated storage account.
     * 
     */
    public Output<String> storageAccount() {
        return this.storageAccount;
    }

    /**
     * Your tenant id.
     * 
     */
    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    /**
     * @return Your tenant id.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    private LogsArchiveAzureArchiveArgs() {}

    private LogsArchiveAzureArchiveArgs(LogsArchiveAzureArchiveArgs $) {
        this.clientId = $.clientId;
        this.container = $.container;
        this.path = $.path;
        this.storageAccount = $.storageAccount;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsArchiveAzureArchiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsArchiveAzureArchiveArgs $;

        public Builder() {
            $ = new LogsArchiveAzureArchiveArgs();
        }

        public Builder(LogsArchiveAzureArchiveArgs defaults) {
            $ = new LogsArchiveAzureArchiveArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId Your client id.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Your client id.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param container The container where the archive is stored.
         * 
         * @return builder
         * 
         */
        public Builder container(Output<String> container) {
            $.container = container;
            return this;
        }

        /**
         * @param container The container where the archive is stored.
         * 
         * @return builder
         * 
         */
        public Builder container(String container) {
            return container(Output.of(container));
        }

        /**
         * @param path The path where the archive is stored.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path where the archive is stored.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param storageAccount The associated storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccount(Output<String> storageAccount) {
            $.storageAccount = storageAccount;
            return this;
        }

        /**
         * @param storageAccount The associated storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccount(String storageAccount) {
            return storageAccount(Output.of(storageAccount));
        }

        /**
         * @param tenantId Your tenant id.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId Your tenant id.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public LogsArchiveAzureArchiveArgs build() {
            if ($.clientId == null) {
                throw new MissingRequiredPropertyException("LogsArchiveAzureArchiveArgs", "clientId");
            }
            if ($.container == null) {
                throw new MissingRequiredPropertyException("LogsArchiveAzureArchiveArgs", "container");
            }
            if ($.storageAccount == null) {
                throw new MissingRequiredPropertyException("LogsArchiveAzureArchiveArgs", "storageAccount");
            }
            if ($.tenantId == null) {
                throw new MissingRequiredPropertyException("LogsArchiveAzureArchiveArgs", "tenantId");
            }
            return $;
        }
    }

}
