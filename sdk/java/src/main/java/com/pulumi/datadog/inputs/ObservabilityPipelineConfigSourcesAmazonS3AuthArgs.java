// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObservabilityPipelineConfigSourcesAmazonS3AuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObservabilityPipelineConfigSourcesAmazonS3AuthArgs Empty = new ObservabilityPipelineConfigSourcesAmazonS3AuthArgs();

    /**
     * The Amazon Resource Name (ARN) of the role to assume.
     * 
     */
    @Import(name="assumeRole")
    private @Nullable Output<String> assumeRole;

    /**
     * @return The Amazon Resource Name (ARN) of the role to assume.
     * 
     */
    public Optional<Output<String>> assumeRole() {
        return Optional.ofNullable(this.assumeRole);
    }

    /**
     * A unique identifier for cross-account role assumption.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return A unique identifier for cross-account role assumption.
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * A session identifier used for logging and tracing the assumed role session.
     * 
     */
    @Import(name="sessionName")
    private @Nullable Output<String> sessionName;

    /**
     * @return A session identifier used for logging and tracing the assumed role session.
     * 
     */
    public Optional<Output<String>> sessionName() {
        return Optional.ofNullable(this.sessionName);
    }

    private ObservabilityPipelineConfigSourcesAmazonS3AuthArgs() {}

    private ObservabilityPipelineConfigSourcesAmazonS3AuthArgs(ObservabilityPipelineConfigSourcesAmazonS3AuthArgs $) {
        this.assumeRole = $.assumeRole;
        this.externalId = $.externalId;
        this.sessionName = $.sessionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObservabilityPipelineConfigSourcesAmazonS3AuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObservabilityPipelineConfigSourcesAmazonS3AuthArgs $;

        public Builder() {
            $ = new ObservabilityPipelineConfigSourcesAmazonS3AuthArgs();
        }

        public Builder(ObservabilityPipelineConfigSourcesAmazonS3AuthArgs defaults) {
            $ = new ObservabilityPipelineConfigSourcesAmazonS3AuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assumeRole The Amazon Resource Name (ARN) of the role to assume.
         * 
         * @return builder
         * 
         */
        public Builder assumeRole(@Nullable Output<String> assumeRole) {
            $.assumeRole = assumeRole;
            return this;
        }

        /**
         * @param assumeRole The Amazon Resource Name (ARN) of the role to assume.
         * 
         * @return builder
         * 
         */
        public Builder assumeRole(String assumeRole) {
            return assumeRole(Output.of(assumeRole));
        }

        /**
         * @param externalId A unique identifier for cross-account role assumption.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId A unique identifier for cross-account role assumption.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param sessionName A session identifier used for logging and tracing the assumed role session.
         * 
         * @return builder
         * 
         */
        public Builder sessionName(@Nullable Output<String> sessionName) {
            $.sessionName = sessionName;
            return this;
        }

        /**
         * @param sessionName A session identifier used for logging and tracing the assumed role session.
         * 
         * @return builder
         * 
         */
        public Builder sessionName(String sessionName) {
            return sessionName(Output.of(sessionName));
        }

        public ObservabilityPipelineConfigSourcesAmazonS3AuthArgs build() {
            return $;
        }
    }

}
