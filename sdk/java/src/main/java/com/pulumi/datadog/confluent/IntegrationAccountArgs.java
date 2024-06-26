// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.confluent;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountArgs Empty = new IntegrationAccountArgs();

    /**
     * The API key associated with your Confluent account.
     * 
     */
    @Import(name="apiKey", required=true)
    private Output<String> apiKey;

    /**
     * @return The API key associated with your Confluent account.
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }

    /**
     * The API secret associated with your Confluent account.
     * 
     */
    @Import(name="apiSecret", required=true)
    private Output<String> apiSecret;

    /**
     * @return The API secret associated with your Confluent account.
     * 
     */
    public Output<String> apiSecret() {
        return this.apiSecret;
    }

    /**
     * A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private IntegrationAccountArgs() {}

    private IntegrationAccountArgs(IntegrationAccountArgs $) {
        this.apiKey = $.apiKey;
        this.apiSecret = $.apiSecret;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountArgs $;

        public Builder() {
            $ = new IntegrationAccountArgs();
        }

        public Builder(IntegrationAccountArgs defaults) {
            $ = new IntegrationAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey The API key associated with your Confluent account.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey The API key associated with your Confluent account.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param apiSecret The API secret associated with your Confluent account.
         * 
         * @return builder
         * 
         */
        public Builder apiSecret(Output<String> apiSecret) {
            $.apiSecret = apiSecret;
            return this;
        }

        /**
         * @param apiSecret The API secret associated with your Confluent account.
         * 
         * @return builder
         * 
         */
        public Builder apiSecret(String apiSecret) {
            return apiSecret(Output.of(apiSecret));
        }

        /**
         * @param tags A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public IntegrationAccountArgs build() {
            if ($.apiKey == null) {
                throw new MissingRequiredPropertyException("IntegrationAccountArgs", "apiKey");
            }
            if ($.apiSecret == null) {
                throw new MissingRequiredPropertyException("IntegrationAccountArgs", "apiSecret");
            }
            return $;
        }
    }

}
