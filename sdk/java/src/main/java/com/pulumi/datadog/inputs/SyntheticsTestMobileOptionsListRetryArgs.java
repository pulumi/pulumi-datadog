// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticsTestMobileOptionsListRetryArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestMobileOptionsListRetryArgs Empty = new SyntheticsTestMobileOptionsListRetryArgs();

    /**
     * Number of retries needed to consider a location as failed before sending a notification alert. Maximum value: `5`. Defaults to `0`.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return Number of retries needed to consider a location as failed before sending a notification alert. Maximum value: `5`. Defaults to `0`.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Interval between a failed test and the next retry in milliseconds. Maximum value: `5000`. Defaults to `300`.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return Interval between a failed test and the next retry in milliseconds. Maximum value: `5000`. Defaults to `300`.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    private SyntheticsTestMobileOptionsListRetryArgs() {}

    private SyntheticsTestMobileOptionsListRetryArgs(SyntheticsTestMobileOptionsListRetryArgs $) {
        this.count = $.count;
        this.interval = $.interval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestMobileOptionsListRetryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestMobileOptionsListRetryArgs $;

        public Builder() {
            $ = new SyntheticsTestMobileOptionsListRetryArgs();
        }

        public Builder(SyntheticsTestMobileOptionsListRetryArgs defaults) {
            $ = new SyntheticsTestMobileOptionsListRetryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Number of retries needed to consider a location as failed before sending a notification alert. Maximum value: `5`. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Number of retries needed to consider a location as failed before sending a notification alert. Maximum value: `5`. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param interval Interval between a failed test and the next retry in milliseconds. Maximum value: `5000`. Defaults to `300`.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Interval between a failed test and the next retry in milliseconds. Maximum value: `5000`. Defaults to `300`.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        public SyntheticsTestMobileOptionsListRetryArgs build() {
            return $;
        }
    }

}