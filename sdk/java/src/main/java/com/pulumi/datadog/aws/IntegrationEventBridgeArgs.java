// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationEventBridgeArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationEventBridgeArgs Empty = new IntegrationEventBridgeArgs();

    /**
     * Your AWS Account ID without dashes.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Your AWS Account ID without dashes.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * True if Datadog should create the event bus in addition to the event source. Requires the `events:CreateEventBus` permission. Defaults to `true`.
     * 
     */
    @Import(name="createEventBus")
    private @Nullable Output<Boolean> createEventBus;

    /**
     * @return True if Datadog should create the event bus in addition to the event source. Requires the `events:CreateEventBus` permission. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> createEventBus() {
        return Optional.ofNullable(this.createEventBus);
    }

    /**
     * The given part of the event source name, which is then combined with an assigned suffix to form the full name.
     * 
     */
    @Import(name="eventGeneratorName", required=true)
    private Output<String> eventGeneratorName;

    /**
     * @return The given part of the event source name, which is then combined with an assigned suffix to form the full name.
     * 
     */
    public Output<String> eventGeneratorName() {
        return this.eventGeneratorName;
    }

    /**
     * The event source&#39;s [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The event source&#39;s [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private IntegrationEventBridgeArgs() {}

    private IntegrationEventBridgeArgs(IntegrationEventBridgeArgs $) {
        this.accountId = $.accountId;
        this.createEventBus = $.createEventBus;
        this.eventGeneratorName = $.eventGeneratorName;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationEventBridgeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationEventBridgeArgs $;

        public Builder() {
            $ = new IntegrationEventBridgeArgs();
        }

        public Builder(IntegrationEventBridgeArgs defaults) {
            $ = new IntegrationEventBridgeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Your AWS Account ID without dashes.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
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
         * @param createEventBus True if Datadog should create the event bus in addition to the event source. Requires the `events:CreateEventBus` permission. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder createEventBus(@Nullable Output<Boolean> createEventBus) {
            $.createEventBus = createEventBus;
            return this;
        }

        /**
         * @param createEventBus True if Datadog should create the event bus in addition to the event source. Requires the `events:CreateEventBus` permission. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder createEventBus(Boolean createEventBus) {
            return createEventBus(Output.of(createEventBus));
        }

        /**
         * @param eventGeneratorName The given part of the event source name, which is then combined with an assigned suffix to form the full name.
         * 
         * @return builder
         * 
         */
        public Builder eventGeneratorName(Output<String> eventGeneratorName) {
            $.eventGeneratorName = eventGeneratorName;
            return this;
        }

        /**
         * @param eventGeneratorName The given part of the event source name, which is then combined with an assigned suffix to form the full name.
         * 
         * @return builder
         * 
         */
        public Builder eventGeneratorName(String eventGeneratorName) {
            return eventGeneratorName(Output.of(eventGeneratorName));
        }

        /**
         * @param region The event source&#39;s [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The event source&#39;s [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public IntegrationEventBridgeArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("IntegrationEventBridgeArgs", "accountId");
            }
            if ($.eventGeneratorName == null) {
                throw new MissingRequiredPropertyException("IntegrationEventBridgeArgs", "eventGeneratorName");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("IntegrationEventBridgeArgs", "region");
            }
            return $;
        }
    }

}