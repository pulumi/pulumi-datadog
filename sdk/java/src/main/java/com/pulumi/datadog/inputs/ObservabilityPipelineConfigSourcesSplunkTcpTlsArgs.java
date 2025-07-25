// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObservabilityPipelineConfigSourcesSplunkTcpTlsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObservabilityPipelineConfigSourcesSplunkTcpTlsArgs Empty = new ObservabilityPipelineConfigSourcesSplunkTcpTlsArgs();

    /**
     * Path to the Certificate Authority (CA) file used to validate the server’s TLS certificate.
     * 
     */
    @Import(name="caFile")
    private @Nullable Output<String> caFile;

    /**
     * @return Path to the Certificate Authority (CA) file used to validate the server’s TLS certificate.
     * 
     */
    public Optional<Output<String>> caFile() {
        return Optional.ofNullable(this.caFile);
    }

    /**
     * Path to the TLS client certificate file used to authenticate the pipeline component with upstream or downstream services.
     * 
     */
    @Import(name="crtFile")
    private @Nullable Output<String> crtFile;

    /**
     * @return Path to the TLS client certificate file used to authenticate the pipeline component with upstream or downstream services.
     * 
     */
    public Optional<Output<String>> crtFile() {
        return Optional.ofNullable(this.crtFile);
    }

    /**
     * Path to the private key file associated with the TLS client certificate. Used for mutual TLS authentication.
     * 
     */
    @Import(name="keyFile")
    private @Nullable Output<String> keyFile;

    /**
     * @return Path to the private key file associated with the TLS client certificate. Used for mutual TLS authentication.
     * 
     */
    public Optional<Output<String>> keyFile() {
        return Optional.ofNullable(this.keyFile);
    }

    private ObservabilityPipelineConfigSourcesSplunkTcpTlsArgs() {}

    private ObservabilityPipelineConfigSourcesSplunkTcpTlsArgs(ObservabilityPipelineConfigSourcesSplunkTcpTlsArgs $) {
        this.caFile = $.caFile;
        this.crtFile = $.crtFile;
        this.keyFile = $.keyFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObservabilityPipelineConfigSourcesSplunkTcpTlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObservabilityPipelineConfigSourcesSplunkTcpTlsArgs $;

        public Builder() {
            $ = new ObservabilityPipelineConfigSourcesSplunkTcpTlsArgs();
        }

        public Builder(ObservabilityPipelineConfigSourcesSplunkTcpTlsArgs defaults) {
            $ = new ObservabilityPipelineConfigSourcesSplunkTcpTlsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caFile Path to the Certificate Authority (CA) file used to validate the server’s TLS certificate.
         * 
         * @return builder
         * 
         */
        public Builder caFile(@Nullable Output<String> caFile) {
            $.caFile = caFile;
            return this;
        }

        /**
         * @param caFile Path to the Certificate Authority (CA) file used to validate the server’s TLS certificate.
         * 
         * @return builder
         * 
         */
        public Builder caFile(String caFile) {
            return caFile(Output.of(caFile));
        }

        /**
         * @param crtFile Path to the TLS client certificate file used to authenticate the pipeline component with upstream or downstream services.
         * 
         * @return builder
         * 
         */
        public Builder crtFile(@Nullable Output<String> crtFile) {
            $.crtFile = crtFile;
            return this;
        }

        /**
         * @param crtFile Path to the TLS client certificate file used to authenticate the pipeline component with upstream or downstream services.
         * 
         * @return builder
         * 
         */
        public Builder crtFile(String crtFile) {
            return crtFile(Output.of(crtFile));
        }

        /**
         * @param keyFile Path to the private key file associated with the TLS client certificate. Used for mutual TLS authentication.
         * 
         * @return builder
         * 
         */
        public Builder keyFile(@Nullable Output<String> keyFile) {
            $.keyFile = keyFile;
            return this;
        }

        /**
         * @param keyFile Path to the private key file associated with the TLS client certificate. Used for mutual TLS authentication.
         * 
         * @return builder
         * 
         */
        public Builder keyFile(String keyFile) {
            return keyFile(Output.of(keyFile));
        }

        public ObservabilityPipelineConfigSourcesSplunkTcpTlsArgs build() {
            return $;
        }
    }

}
