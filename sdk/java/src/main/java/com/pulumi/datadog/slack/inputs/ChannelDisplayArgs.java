// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.slack.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelDisplayArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelDisplayArgs Empty = new ChannelDisplayArgs();

    @Import(name="message")
    private @Nullable Output<Boolean> message;

    public Optional<Output<Boolean>> message() {
        return Optional.ofNullable(this.message);
    }

    @Import(name="notified")
    private @Nullable Output<Boolean> notified;

    public Optional<Output<Boolean>> notified() {
        return Optional.ofNullable(this.notified);
    }

    @Import(name="snapshot")
    private @Nullable Output<Boolean> snapshot;

    public Optional<Output<Boolean>> snapshot() {
        return Optional.ofNullable(this.snapshot);
    }

    @Import(name="tags")
    private @Nullable Output<Boolean> tags;

    public Optional<Output<Boolean>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ChannelDisplayArgs() {}

    private ChannelDisplayArgs(ChannelDisplayArgs $) {
        this.message = $.message;
        this.notified = $.notified;
        this.snapshot = $.snapshot;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelDisplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelDisplayArgs $;

        public Builder() {
            $ = new ChannelDisplayArgs();
        }

        public Builder(ChannelDisplayArgs defaults) {
            $ = new ChannelDisplayArgs(Objects.requireNonNull(defaults));
        }

        public Builder message(@Nullable Output<Boolean> message) {
            $.message = message;
            return this;
        }

        public Builder message(Boolean message) {
            return message(Output.of(message));
        }

        public Builder notified(@Nullable Output<Boolean> notified) {
            $.notified = notified;
            return this;
        }

        public Builder notified(Boolean notified) {
            return notified(Output.of(notified));
        }

        public Builder snapshot(@Nullable Output<Boolean> snapshot) {
            $.snapshot = snapshot;
            return this;
        }

        public Builder snapshot(Boolean snapshot) {
            return snapshot(Output.of(snapshot));
        }

        public Builder tags(@Nullable Output<Boolean> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Boolean tags) {
            return tags(Output.of(tags));
        }

        public ChannelDisplayArgs build() {
            return $;
        }
    }

}