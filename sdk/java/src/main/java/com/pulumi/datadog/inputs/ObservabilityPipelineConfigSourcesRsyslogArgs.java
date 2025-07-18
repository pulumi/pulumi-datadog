// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.ObservabilityPipelineConfigSourcesRsyslogTlsArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObservabilityPipelineConfigSourcesRsyslogArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObservabilityPipelineConfigSourcesRsyslogArgs Empty = new ObservabilityPipelineConfigSourcesRsyslogArgs();

    /**
     * The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Protocol used by the syslog source to receive messages.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Protocol used by the syslog source to receive messages.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Configuration for enabling TLS encryption between the pipeline component and external services.
     * 
     */
    @Import(name="tls")
    private @Nullable Output<ObservabilityPipelineConfigSourcesRsyslogTlsArgs> tls;

    /**
     * @return Configuration for enabling TLS encryption between the pipeline component and external services.
     * 
     */
    public Optional<Output<ObservabilityPipelineConfigSourcesRsyslogTlsArgs>> tls() {
        return Optional.ofNullable(this.tls);
    }

    private ObservabilityPipelineConfigSourcesRsyslogArgs() {}

    private ObservabilityPipelineConfigSourcesRsyslogArgs(ObservabilityPipelineConfigSourcesRsyslogArgs $) {
        this.id = $.id;
        this.mode = $.mode;
        this.tls = $.tls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObservabilityPipelineConfigSourcesRsyslogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObservabilityPipelineConfigSourcesRsyslogArgs $;

        public Builder() {
            $ = new ObservabilityPipelineConfigSourcesRsyslogArgs();
        }

        public Builder(ObservabilityPipelineConfigSourcesRsyslogArgs defaults) {
            $ = new ObservabilityPipelineConfigSourcesRsyslogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param mode Protocol used by the syslog source to receive messages.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Protocol used by the syslog source to receive messages.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param tls Configuration for enabling TLS encryption between the pipeline component and external services.
         * 
         * @return builder
         * 
         */
        public Builder tls(@Nullable Output<ObservabilityPipelineConfigSourcesRsyslogTlsArgs> tls) {
            $.tls = tls;
            return this;
        }

        /**
         * @param tls Configuration for enabling TLS encryption between the pipeline component and external services.
         * 
         * @return builder
         * 
         */
        public Builder tls(ObservabilityPipelineConfigSourcesRsyslogTlsArgs tls) {
            return tls(Output.of(tls));
        }

        public ObservabilityPipelineConfigSourcesRsyslogArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("ObservabilityPipelineConfigSourcesRsyslogArgs", "id");
            }
            return $;
        }
    }

}
