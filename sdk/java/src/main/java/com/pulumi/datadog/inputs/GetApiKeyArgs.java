// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiKeyArgs Empty = new GetApiKeyArgs();

    /**
     * Whether to use exact match when searching by name.
     * 
     */
    @Import(name="exactMatch")
    private @Nullable Output<Boolean> exactMatch;

    /**
     * @return Whether to use exact match when searching by name.
     * 
     */
    public Optional<Output<Boolean>> exactMatch() {
        return Optional.ofNullable(this.exactMatch);
    }

    /**
     * The ID of this resource.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of this resource.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name for API Key.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name for API Key.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetApiKeyArgs() {}

    private GetApiKeyArgs(GetApiKeyArgs $) {
        this.exactMatch = $.exactMatch;
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiKeyArgs $;

        public Builder() {
            $ = new GetApiKeyArgs();
        }

        public Builder(GetApiKeyArgs defaults) {
            $ = new GetApiKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exactMatch Whether to use exact match when searching by name.
         * 
         * @return builder
         * 
         */
        public Builder exactMatch(@Nullable Output<Boolean> exactMatch) {
            $.exactMatch = exactMatch;
            return this;
        }

        /**
         * @param exactMatch Whether to use exact match when searching by name.
         * 
         * @return builder
         * 
         */
        public Builder exactMatch(Boolean exactMatch) {
            return exactMatch(Output.of(exactMatch));
        }

        /**
         * @param id The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Name for API Key.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for API Key.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetApiKeyArgs build() {
            return $;
        }
    }

}