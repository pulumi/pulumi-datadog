// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.SyntheticsTestOptionsListSchedulingTimeframeArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SyntheticsTestOptionsListSchedulingArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestOptionsListSchedulingArgs Empty = new SyntheticsTestOptionsListSchedulingArgs();

    /**
     * Array containing objects describing the scheduling pattern to apply to each day.
     * 
     */
    @Import(name="timeframes", required=true)
    private Output<List<SyntheticsTestOptionsListSchedulingTimeframeArgs>> timeframes;

    /**
     * @return Array containing objects describing the scheduling pattern to apply to each day.
     * 
     */
    public Output<List<SyntheticsTestOptionsListSchedulingTimeframeArgs>> timeframes() {
        return this.timeframes;
    }

    /**
     * Timezone in which the timeframe is based.
     * 
     */
    @Import(name="timezone", required=true)
    private Output<String> timezone;

    /**
     * @return Timezone in which the timeframe is based.
     * 
     */
    public Output<String> timezone() {
        return this.timezone;
    }

    private SyntheticsTestOptionsListSchedulingArgs() {}

    private SyntheticsTestOptionsListSchedulingArgs(SyntheticsTestOptionsListSchedulingArgs $) {
        this.timeframes = $.timeframes;
        this.timezone = $.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestOptionsListSchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestOptionsListSchedulingArgs $;

        public Builder() {
            $ = new SyntheticsTestOptionsListSchedulingArgs();
        }

        public Builder(SyntheticsTestOptionsListSchedulingArgs defaults) {
            $ = new SyntheticsTestOptionsListSchedulingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param timeframes Array containing objects describing the scheduling pattern to apply to each day.
         * 
         * @return builder
         * 
         */
        public Builder timeframes(Output<List<SyntheticsTestOptionsListSchedulingTimeframeArgs>> timeframes) {
            $.timeframes = timeframes;
            return this;
        }

        /**
         * @param timeframes Array containing objects describing the scheduling pattern to apply to each day.
         * 
         * @return builder
         * 
         */
        public Builder timeframes(List<SyntheticsTestOptionsListSchedulingTimeframeArgs> timeframes) {
            return timeframes(Output.of(timeframes));
        }

        /**
         * @param timeframes Array containing objects describing the scheduling pattern to apply to each day.
         * 
         * @return builder
         * 
         */
        public Builder timeframes(SyntheticsTestOptionsListSchedulingTimeframeArgs... timeframes) {
            return timeframes(List.of(timeframes));
        }

        /**
         * @param timezone Timezone in which the timeframe is based.
         * 
         * @return builder
         * 
         */
        public Builder timezone(Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone Timezone in which the timeframe is based.
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public SyntheticsTestOptionsListSchedulingArgs build() {
            if ($.timeframes == null) {
                throw new MissingRequiredPropertyException("SyntheticsTestOptionsListSchedulingArgs", "timeframes");
            }
            if ($.timezone == null) {
                throw new MissingRequiredPropertyException("SyntheticsTestOptionsListSchedulingArgs", "timezone");
            }
            return $;
        }
    }

}
