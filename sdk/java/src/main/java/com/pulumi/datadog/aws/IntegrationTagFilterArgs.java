// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class IntegrationTagFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationTagFilterArgs Empty = new IntegrationTagFilterArgs();

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
     * The namespace associated with the tag filter entry. Valid values are `elb`, `application_elb`, `sqs`, `rds`, `custom`, `network_elb`, `lambda`, `step_functions`.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return The namespace associated with the tag filter entry. Valid values are `elb`, `application_elb`, `sqs`, `rds`, `custom`, `network_elb`, `lambda`, `step_functions`.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * The tag filter string.
     * 
     */
    @Import(name="tagFilterStr", required=true)
    private Output<String> tagFilterStr;

    /**
     * @return The tag filter string.
     * 
     */
    public Output<String> tagFilterStr() {
        return this.tagFilterStr;
    }

    private IntegrationTagFilterArgs() {}

    private IntegrationTagFilterArgs(IntegrationTagFilterArgs $) {
        this.accountId = $.accountId;
        this.namespace = $.namespace;
        this.tagFilterStr = $.tagFilterStr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationTagFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationTagFilterArgs $;

        public Builder() {
            $ = new IntegrationTagFilterArgs();
        }

        public Builder(IntegrationTagFilterArgs defaults) {
            $ = new IntegrationTagFilterArgs(Objects.requireNonNull(defaults));
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
         * @param namespace The namespace associated with the tag filter entry. Valid values are `elb`, `application_elb`, `sqs`, `rds`, `custom`, `network_elb`, `lambda`, `step_functions`.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace associated with the tag filter entry. Valid values are `elb`, `application_elb`, `sqs`, `rds`, `custom`, `network_elb`, `lambda`, `step_functions`.
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
        public Builder tagFilterStr(Output<String> tagFilterStr) {
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

        public IntegrationTagFilterArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("IntegrationTagFilterArgs", "accountId");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("IntegrationTagFilterArgs", "namespace");
            }
            if ($.tagFilterStr == null) {
                throw new MissingRequiredPropertyException("IntegrationTagFilterArgs", "tagFilterStr");
            }
            return $;
        }
    }

}
