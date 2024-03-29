// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationEventBridgeState extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationEventBridgeState Empty = new IntegrationEventBridgeState();

    /**
     * Your AWS Account ID without dashes.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Your AWS Account ID without dashes.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
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
    @Import(name="eventGeneratorName")
    private @Nullable Output<String> eventGeneratorName;

    /**
     * @return The given part of the event source name, which is then combined with an assigned suffix to form the full name.
     * 
     */
    public Optional<Output<String>> eventGeneratorName() {
        return Optional.ofNullable(this.eventGeneratorName);
    }

    /**
     * The event source&#39;s [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The event source&#39;s [AWS region](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints).
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private IntegrationEventBridgeState() {}

    private IntegrationEventBridgeState(IntegrationEventBridgeState $) {
        this.accountId = $.accountId;
        this.createEventBus = $.createEventBus;
        this.eventGeneratorName = $.eventGeneratorName;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationEventBridgeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationEventBridgeState $;

        public Builder() {
            $ = new IntegrationEventBridgeState();
        }

        public Builder(IntegrationEventBridgeState defaults) {
            $ = new IntegrationEventBridgeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Your AWS Account ID without dashes.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
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
        public Builder eventGeneratorName(@Nullable Output<String> eventGeneratorName) {
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
        public Builder region(@Nullable Output<String> region) {
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

        public IntegrationEventBridgeState build() {
            return $;
        }
    }

}
