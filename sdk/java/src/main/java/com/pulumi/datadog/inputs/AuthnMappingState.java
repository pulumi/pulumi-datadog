// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthnMappingState extends com.pulumi.resources.ResourceArgs {

    public static final AuthnMappingState Empty = new AuthnMappingState();

    /**
     * Identity provider key.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Identity provider key.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The ID of a role to attach to all users with the corresponding key and value. Cannot be used in conjunction with `team`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The ID of a role to attach to all users with the corresponding key and value. Cannot be used in conjunction with `team`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The ID of a team to add all users with the corresponding key and value to. Cannot be used in conjunction with `role`.
     * 
     */
    @Import(name="team")
    private @Nullable Output<String> team;

    /**
     * @return The ID of a team to add all users with the corresponding key and value to. Cannot be used in conjunction with `role`.
     * 
     */
    public Optional<Output<String>> team() {
        return Optional.ofNullable(this.team);
    }

    /**
     * Identity provider value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Identity provider value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private AuthnMappingState() {}

    private AuthnMappingState(AuthnMappingState $) {
        this.key = $.key;
        this.role = $.role;
        this.team = $.team;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthnMappingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthnMappingState $;

        public Builder() {
            $ = new AuthnMappingState();
        }

        public Builder(AuthnMappingState defaults) {
            $ = new AuthnMappingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Identity provider key.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Identity provider key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param role The ID of a role to attach to all users with the corresponding key and value. Cannot be used in conjunction with `team`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The ID of a role to attach to all users with the corresponding key and value. Cannot be used in conjunction with `team`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param team The ID of a team to add all users with the corresponding key and value to. Cannot be used in conjunction with `role`.
         * 
         * @return builder
         * 
         */
        public Builder team(@Nullable Output<String> team) {
            $.team = team;
            return this;
        }

        /**
         * @param team The ID of a team to add all users with the corresponding key and value to. Cannot be used in conjunction with `role`.
         * 
         * @return builder
         * 
         */
        public Builder team(String team) {
            return team(Output.of(team));
        }

        /**
         * @param value Identity provider value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Identity provider value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public AuthnMappingState build() {
            return $;
        }
    }

}