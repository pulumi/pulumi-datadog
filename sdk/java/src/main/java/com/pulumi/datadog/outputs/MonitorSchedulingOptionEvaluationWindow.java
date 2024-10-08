// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitorSchedulingOptionEvaluationWindow {
    /**
     * @return The time of the day at which a one day cumulative evaluation window starts. Must be defined in UTC time in `HH:mm` format.
     * 
     */
    private @Nullable String dayStarts;
    /**
     * @return The minute of the hour at which a one hour cumulative evaluation window starts. Must be between 0 and 59.
     * 
     */
    private @Nullable Integer hourStarts;
    /**
     * @return The day of the month at which a one month cumulative evaluation window starts. Must be a value of 1.
     * 
     */
    private @Nullable Integer monthStarts;

    private MonitorSchedulingOptionEvaluationWindow() {}
    /**
     * @return The time of the day at which a one day cumulative evaluation window starts. Must be defined in UTC time in `HH:mm` format.
     * 
     */
    public Optional<String> dayStarts() {
        return Optional.ofNullable(this.dayStarts);
    }
    /**
     * @return The minute of the hour at which a one hour cumulative evaluation window starts. Must be between 0 and 59.
     * 
     */
    public Optional<Integer> hourStarts() {
        return Optional.ofNullable(this.hourStarts);
    }
    /**
     * @return The day of the month at which a one month cumulative evaluation window starts. Must be a value of 1.
     * 
     */
    public Optional<Integer> monthStarts() {
        return Optional.ofNullable(this.monthStarts);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorSchedulingOptionEvaluationWindow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dayStarts;
        private @Nullable Integer hourStarts;
        private @Nullable Integer monthStarts;
        public Builder() {}
        public Builder(MonitorSchedulingOptionEvaluationWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayStarts = defaults.dayStarts;
    	      this.hourStarts = defaults.hourStarts;
    	      this.monthStarts = defaults.monthStarts;
        }

        @CustomType.Setter
        public Builder dayStarts(@Nullable String dayStarts) {

            this.dayStarts = dayStarts;
            return this;
        }
        @CustomType.Setter
        public Builder hourStarts(@Nullable Integer hourStarts) {

            this.hourStarts = hourStarts;
            return this;
        }
        @CustomType.Setter
        public Builder monthStarts(@Nullable Integer monthStarts) {

            this.monthStarts = monthStarts;
            return this;
        }
        public MonitorSchedulingOptionEvaluationWindow build() {
            final var _resultValue = new MonitorSchedulingOptionEvaluationWindow();
            _resultValue.dayStarts = dayStarts;
            _resultValue.hourStarts = hourStarts;
            _resultValue.monthStarts = monthStarts;
            return _resultValue;
        }
    }
}
