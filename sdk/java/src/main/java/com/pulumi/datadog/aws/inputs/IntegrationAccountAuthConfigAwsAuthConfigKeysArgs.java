// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountAuthConfigAwsAuthConfigKeysArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountAuthConfigAwsAuthConfigKeysArgs Empty = new IntegrationAccountAuthConfigAwsAuthConfigKeysArgs();

    /**
     * AWS Access Key ID
     * 
     */
    @Import(name="accessKeyId")
    private @Nullable Output<String> accessKeyId;

    /**
     * @return AWS Access Key ID
     * 
     */
    public Optional<Output<String>> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }

    @Import(name="secretAccessKey")
    private @Nullable Output<String> secretAccessKey;

    public Optional<Output<String>> secretAccessKey() {
        return Optional.ofNullable(this.secretAccessKey);
    }

    private IntegrationAccountAuthConfigAwsAuthConfigKeysArgs() {}

    private IntegrationAccountAuthConfigAwsAuthConfigKeysArgs(IntegrationAccountAuthConfigAwsAuthConfigKeysArgs $) {
        this.accessKeyId = $.accessKeyId;
        this.secretAccessKey = $.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountAuthConfigAwsAuthConfigKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountAuthConfigAwsAuthConfigKeysArgs $;

        public Builder() {
            $ = new IntegrationAccountAuthConfigAwsAuthConfigKeysArgs();
        }

        public Builder(IntegrationAccountAuthConfigAwsAuthConfigKeysArgs defaults) {
            $ = new IntegrationAccountAuthConfigAwsAuthConfigKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKeyId AWS Access Key ID
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(@Nullable Output<String> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * @param accessKeyId AWS Access Key ID
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(String accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        public Builder secretAccessKey(@Nullable Output<String> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        public Builder secretAccessKey(String secretAccessKey) {
            return secretAccessKey(Output.of(secretAccessKey));
        }

        public IntegrationAccountAuthConfigAwsAuthConfigKeysArgs build() {
            return $;
        }
    }

}