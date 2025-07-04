// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObservabilityPipelineConfigSourcesKafkaSaslArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObservabilityPipelineConfigSourcesKafkaSaslArgs Empty = new ObservabilityPipelineConfigSourcesKafkaSaslArgs();

    /**
     * SASL mechanism to use (e.g., PLAIN, SCRAM-SHA-256, SCRAM-SHA-512). Valid values are `PLAIN`, `SCRAM-SHA-256`, `SCRAM-SHA-512`.
     * 
     */
    @Import(name="mechanism")
    private @Nullable Output<String> mechanism;

    /**
     * @return SASL mechanism to use (e.g., PLAIN, SCRAM-SHA-256, SCRAM-SHA-512). Valid values are `PLAIN`, `SCRAM-SHA-256`, `SCRAM-SHA-512`.
     * 
     */
    public Optional<Output<String>> mechanism() {
        return Optional.ofNullable(this.mechanism);
    }

    private ObservabilityPipelineConfigSourcesKafkaSaslArgs() {}

    private ObservabilityPipelineConfigSourcesKafkaSaslArgs(ObservabilityPipelineConfigSourcesKafkaSaslArgs $) {
        this.mechanism = $.mechanism;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObservabilityPipelineConfigSourcesKafkaSaslArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObservabilityPipelineConfigSourcesKafkaSaslArgs $;

        public Builder() {
            $ = new ObservabilityPipelineConfigSourcesKafkaSaslArgs();
        }

        public Builder(ObservabilityPipelineConfigSourcesKafkaSaslArgs defaults) {
            $ = new ObservabilityPipelineConfigSourcesKafkaSaslArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mechanism SASL mechanism to use (e.g., PLAIN, SCRAM-SHA-256, SCRAM-SHA-512). Valid values are `PLAIN`, `SCRAM-SHA-256`, `SCRAM-SHA-512`.
         * 
         * @return builder
         * 
         */
        public Builder mechanism(@Nullable Output<String> mechanism) {
            $.mechanism = mechanism;
            return this;
        }

        /**
         * @param mechanism SASL mechanism to use (e.g., PLAIN, SCRAM-SHA-256, SCRAM-SHA-512). Valid values are `PLAIN`, `SCRAM-SHA-256`, `SCRAM-SHA-512`.
         * 
         * @return builder
         * 
         */
        public Builder mechanism(String mechanism) {
            return mechanism(Output.of(mechanism));
        }

        public ObservabilityPipelineConfigSourcesKafkaSaslArgs build() {
            return $;
        }
    }

}
