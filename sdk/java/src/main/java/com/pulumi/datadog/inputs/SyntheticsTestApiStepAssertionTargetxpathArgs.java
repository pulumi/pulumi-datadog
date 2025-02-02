// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticsTestApiStepAssertionTargetxpathArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestApiStepAssertionTargetxpathArgs Empty = new SyntheticsTestApiStepAssertionTargetxpathArgs();

    /**
     * The specific operator to use on the path.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return The specific operator to use on the path.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * Expected matching value.
     * 
     */
    @Import(name="targetvalue")
    private @Nullable Output<String> targetvalue;

    /**
     * @return Expected matching value.
     * 
     */
    public Optional<Output<String>> targetvalue() {
        return Optional.ofNullable(this.targetvalue);
    }

    /**
     * The xpath to assert.
     * 
     */
    @Import(name="xpath", required=true)
    private Output<String> xpath;

    /**
     * @return The xpath to assert.
     * 
     */
    public Output<String> xpath() {
        return this.xpath;
    }

    private SyntheticsTestApiStepAssertionTargetxpathArgs() {}

    private SyntheticsTestApiStepAssertionTargetxpathArgs(SyntheticsTestApiStepAssertionTargetxpathArgs $) {
        this.operator = $.operator;
        this.targetvalue = $.targetvalue;
        this.xpath = $.xpath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestApiStepAssertionTargetxpathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestApiStepAssertionTargetxpathArgs $;

        public Builder() {
            $ = new SyntheticsTestApiStepAssertionTargetxpathArgs();
        }

        public Builder(SyntheticsTestApiStepAssertionTargetxpathArgs defaults) {
            $ = new SyntheticsTestApiStepAssertionTargetxpathArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operator The specific operator to use on the path.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The specific operator to use on the path.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param targetvalue Expected matching value.
         * 
         * @return builder
         * 
         */
        public Builder targetvalue(@Nullable Output<String> targetvalue) {
            $.targetvalue = targetvalue;
            return this;
        }

        /**
         * @param targetvalue Expected matching value.
         * 
         * @return builder
         * 
         */
        public Builder targetvalue(String targetvalue) {
            return targetvalue(Output.of(targetvalue));
        }

        /**
         * @param xpath The xpath to assert.
         * 
         * @return builder
         * 
         */
        public Builder xpath(Output<String> xpath) {
            $.xpath = xpath;
            return this;
        }

        /**
         * @param xpath The xpath to assert.
         * 
         * @return builder
         * 
         */
        public Builder xpath(String xpath) {
            return xpath(Output.of(xpath));
        }

        public SyntheticsTestApiStepAssertionTargetxpathArgs build() {
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("SyntheticsTestApiStepAssertionTargetxpathArgs", "operator");
            }
            if ($.xpath == null) {
                throw new MissingRequiredPropertyException("SyntheticsTestApiStepAssertionTargetxpathArgs", "xpath");
            }
            return $;
        }
    }

}
