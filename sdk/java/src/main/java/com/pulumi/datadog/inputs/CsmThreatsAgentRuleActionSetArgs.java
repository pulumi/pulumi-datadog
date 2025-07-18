// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CsmThreatsAgentRuleActionSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CsmThreatsAgentRuleActionSetArgs Empty = new CsmThreatsAgentRuleActionSetArgs();

    /**
     * Whether to append to the set
     * 
     */
    @Import(name="append")
    private @Nullable Output<Boolean> append;

    /**
     * @return Whether to append to the set
     * 
     */
    public Optional<Output<Boolean>> append() {
        return Optional.ofNullable(this.append);
    }

    /**
     * The field to get the value from
     * 
     */
    @Import(name="field")
    private @Nullable Output<String> field;

    /**
     * @return The field to get the value from
     * 
     */
    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

    /**
     * The name of the set action
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the set action
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The scope of the set action (process, container, cgroup, or empty)
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of the set action (process, container, cgroup, or empty)
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * The maximum size of the set
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return The maximum size of the set
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The time to live for the set in nanoseconds
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return The time to live for the set in nanoseconds
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * The value to set
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value to set
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private CsmThreatsAgentRuleActionSetArgs() {}

    private CsmThreatsAgentRuleActionSetArgs(CsmThreatsAgentRuleActionSetArgs $) {
        this.append = $.append;
        this.field = $.field;
        this.name = $.name;
        this.scope = $.scope;
        this.size = $.size;
        this.ttl = $.ttl;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CsmThreatsAgentRuleActionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CsmThreatsAgentRuleActionSetArgs $;

        public Builder() {
            $ = new CsmThreatsAgentRuleActionSetArgs();
        }

        public Builder(CsmThreatsAgentRuleActionSetArgs defaults) {
            $ = new CsmThreatsAgentRuleActionSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param append Whether to append to the set
         * 
         * @return builder
         * 
         */
        public Builder append(@Nullable Output<Boolean> append) {
            $.append = append;
            return this;
        }

        /**
         * @param append Whether to append to the set
         * 
         * @return builder
         * 
         */
        public Builder append(Boolean append) {
            return append(Output.of(append));
        }

        /**
         * @param field The field to get the value from
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field The field to get the value from
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param name The name of the set action
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the set action
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param scope The scope of the set action (process, container, cgroup, or empty)
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of the set action (process, container, cgroup, or empty)
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param size The maximum size of the set
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The maximum size of the set
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param ttl The time to live for the set in nanoseconds
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl The time to live for the set in nanoseconds
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param value The value to set
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value to set
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CsmThreatsAgentRuleActionSetArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("CsmThreatsAgentRuleActionSetArgs", "name");
            }
            return $;
        }
    }

}
