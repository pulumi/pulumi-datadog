// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationTagFilterState extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationTagFilterState Empty = new IntegrationTagFilterState();

    /**
     * Your AWS Account ID without dashes. If your account is a GovCloud or China account, specify the `access_key_id` here.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Your AWS Account ID without dashes. If your account is a GovCloud or China account, specify the `access_key_id` here.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The namespace associated with the tag filter entry.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace associated with the tag filter entry.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * The tag filter string.
     * 
     */
    @Import(name="tagFilterStr")
    private @Nullable Output<String> tagFilterStr;

    /**
     * @return The tag filter string.
     * 
     */
    public Optional<Output<String>> tagFilterStr() {
        return Optional.ofNullable(this.tagFilterStr);
    }

    private IntegrationTagFilterState() {}

    private IntegrationTagFilterState(IntegrationTagFilterState $) {
        this.accountId = $.accountId;
        this.namespace = $.namespace;
        this.tagFilterStr = $.tagFilterStr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationTagFilterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationTagFilterState $;

        public Builder() {
            $ = new IntegrationTagFilterState();
        }

        public Builder(IntegrationTagFilterState defaults) {
            $ = new IntegrationTagFilterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Your AWS Account ID without dashes. If your account is a GovCloud or China account, specify the `access_key_id` here.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Your AWS Account ID without dashes. If your account is a GovCloud or China account, specify the `access_key_id` here.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param namespace The namespace associated with the tag filter entry.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace associated with the tag filter entry.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param tagFilterStr The tag filter string.
         * 
         * @return builder
         * 
         */
        public Builder tagFilterStr(@Nullable Output<String> tagFilterStr) {
            $.tagFilterStr = tagFilterStr;
            return this;
        }

        /**
         * @param tagFilterStr The tag filter string.
         * 
         * @return builder
         * 
         */
        public Builder tagFilterStr(String tagFilterStr) {
            return tagFilterStr(Output.of(tagFilterStr));
        }

        public IntegrationTagFilterState build() {
            return $;
        }
    }

}