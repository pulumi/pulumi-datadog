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


public final class MonitorSchedulingOptionCustomScheduleRecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorSchedulingOptionCustomScheduleRecurrenceArgs Empty = new MonitorSchedulingOptionCustomScheduleRecurrenceArgs();

    /**
     * Must be a valid `rrule`. See API docs for supported fields
     * 
     */
    @Import(name="rrule", required=true)
    private Output<String> rrule;

    /**
     * @return Must be a valid `rrule`. See API docs for supported fields
     * 
     */
    public Output<String> rrule() {
        return this.rrule;
    }

    /**
     * Time to start recurrence cycle. Similar to DTSTART. Expected format &#39;YYYY-MM-DDThh:mm:ss&#39;
     * 
     */
    @Import(name="start")
    private @Nullable Output<String> start;

    /**
     * @return Time to start recurrence cycle. Similar to DTSTART. Expected format &#39;YYYY-MM-DDThh:mm:ss&#39;
     * 
     */
    public Optional<Output<String>> start() {
        return Optional.ofNullable(this.start);
    }

    /**
     * &#39;tz database&#39; format. Example: `America/New_York` or `UTC`
     * 
     */
    @Import(name="timezone", required=true)
    private Output<String> timezone;

    /**
     * @return &#39;tz database&#39; format. Example: `America/New_York` or `UTC`
     * 
     */
    public Output<String> timezone() {
        return this.timezone;
    }

    private MonitorSchedulingOptionCustomScheduleRecurrenceArgs() {}

    private MonitorSchedulingOptionCustomScheduleRecurrenceArgs(MonitorSchedulingOptionCustomScheduleRecurrenceArgs $) {
        this.rrule = $.rrule;
        this.start = $.start;
        this.timezone = $.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorSchedulingOptionCustomScheduleRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorSchedulingOptionCustomScheduleRecurrenceArgs $;

        public Builder() {
            $ = new MonitorSchedulingOptionCustomScheduleRecurrenceArgs();
        }

        public Builder(MonitorSchedulingOptionCustomScheduleRecurrenceArgs defaults) {
            $ = new MonitorSchedulingOptionCustomScheduleRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rrule Must be a valid `rrule`. See API docs for supported fields
         * 
         * @return builder
         * 
         */
        public Builder rrule(Output<String> rrule) {
            $.rrule = rrule;
            return this;
        }

        /**
         * @param rrule Must be a valid `rrule`. See API docs for supported fields
         * 
         * @return builder
         * 
         */
        public Builder rrule(String rrule) {
            return rrule(Output.of(rrule));
        }

        /**
         * @param start Time to start recurrence cycle. Similar to DTSTART. Expected format &#39;YYYY-MM-DDThh:mm:ss&#39;
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<String> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start Time to start recurrence cycle. Similar to DTSTART. Expected format &#39;YYYY-MM-DDThh:mm:ss&#39;
         * 
         * @return builder
         * 
         */
        public Builder start(String start) {
            return start(Output.of(start));
        }

        /**
         * @param timezone &#39;tz database&#39; format. Example: `America/New_York` or `UTC`
         * 
         * @return builder
         * 
         */
        public Builder timezone(Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone &#39;tz database&#39; format. Example: `America/New_York` or `UTC`
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public MonitorSchedulingOptionCustomScheduleRecurrenceArgs build() {
            if ($.rrule == null) {
                throw new MissingRequiredPropertyException("MonitorSchedulingOptionCustomScheduleRecurrenceArgs", "rrule");
            }
            if ($.timezone == null) {
                throw new MissingRequiredPropertyException("MonitorSchedulingOptionCustomScheduleRecurrenceArgs", "timezone");
            }
            return $;
        }
    }

}
