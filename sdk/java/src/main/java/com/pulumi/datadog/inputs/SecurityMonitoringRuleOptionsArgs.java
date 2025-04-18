// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.SecurityMonitoringRuleOptionsImpossibleTravelOptionsArgs;
import com.pulumi.datadog.inputs.SecurityMonitoringRuleOptionsNewValueOptionsArgs;
import com.pulumi.datadog.inputs.SecurityMonitoringRuleOptionsThirdPartyRuleOptionsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityMonitoringRuleOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityMonitoringRuleOptionsArgs Empty = new SecurityMonitoringRuleOptionsArgs();

    /**
     * If true, signals in non-production environments have a lower severity than what is defined by the rule case, which can reduce noise. The decrement is applied when the environment tag of the signal starts with `staging`, `test`, or `dev`. Only available when the rule type is `log_detection`. Defaults to `false`.
     * 
     */
    @Import(name="decreaseCriticalityBasedOnEnv")
    private @Nullable Output<Boolean> decreaseCriticalityBasedOnEnv;

    /**
     * @return If true, signals in non-production environments have a lower severity than what is defined by the rule case, which can reduce noise. The decrement is applied when the environment tag of the signal starts with `staging`, `test`, or `dev`. Only available when the rule type is `log_detection`. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> decreaseCriticalityBasedOnEnv() {
        return Optional.ofNullable(this.decreaseCriticalityBasedOnEnv);
    }

    /**
     * The detection method. Valid values are `threshold`, `new_value`, `anomaly_detection`, `impossible_travel`, `hardcoded`, `third_party`, `anomaly_threshold`. Defaults to `&#34;threshold&#34;`.
     * 
     */
    @Import(name="detectionMethod")
    private @Nullable Output<String> detectionMethod;

    /**
     * @return The detection method. Valid values are `threshold`, `new_value`, `anomaly_detection`, `impossible_travel`, `hardcoded`, `third_party`, `anomaly_threshold`. Defaults to `&#34;threshold&#34;`.
     * 
     */
    public Optional<Output<String>> detectionMethod() {
        return Optional.ofNullable(this.detectionMethod);
    }

    /**
     * A time window is specified to match when at least one of the cases matches true. This is a sliding window and evaluates in real time. Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
     * 
     */
    @Import(name="evaluationWindow")
    private @Nullable Output<Integer> evaluationWindow;

    /**
     * @return A time window is specified to match when at least one of the cases matches true. This is a sliding window and evaluates in real time. Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
     * 
     */
    public Optional<Output<Integer>> evaluationWindow() {
        return Optional.ofNullable(this.evaluationWindow);
    }

    /**
     * Options for rules using the impossible travel detection method.
     * 
     */
    @Import(name="impossibleTravelOptions")
    private @Nullable Output<SecurityMonitoringRuleOptionsImpossibleTravelOptionsArgs> impossibleTravelOptions;

    /**
     * @return Options for rules using the impossible travel detection method.
     * 
     */
    public Optional<Output<SecurityMonitoringRuleOptionsImpossibleTravelOptionsArgs>> impossibleTravelOptions() {
        return Optional.ofNullable(this.impossibleTravelOptions);
    }

    /**
     * Once a signal is generated, the signal will remain “open” if a case is matched at least once within this keep alive window (in seconds). Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
     * 
     */
    @Import(name="keepAlive")
    private @Nullable Output<Integer> keepAlive;

    /**
     * @return Once a signal is generated, the signal will remain “open” if a case is matched at least once within this keep alive window (in seconds). Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
     * 
     */
    public Optional<Output<Integer>> keepAlive() {
        return Optional.ofNullable(this.keepAlive);
    }

    /**
     * A signal will “close” regardless of the query being matched once the time exceeds the maximum duration (in seconds). This time is calculated from the first seen timestamp. Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
     * 
     */
    @Import(name="maxSignalDuration")
    private @Nullable Output<Integer> maxSignalDuration;

    /**
     * @return A signal will “close” regardless of the query being matched once the time exceeds the maximum duration (in seconds). This time is calculated from the first seen timestamp. Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
     * 
     */
    public Optional<Output<Integer>> maxSignalDuration() {
        return Optional.ofNullable(this.maxSignalDuration);
    }

    /**
     * New value rules specific options.
     * 
     */
    @Import(name="newValueOptions")
    private @Nullable Output<SecurityMonitoringRuleOptionsNewValueOptionsArgs> newValueOptions;

    /**
     * @return New value rules specific options.
     * 
     */
    public Optional<Output<SecurityMonitoringRuleOptionsNewValueOptionsArgs>> newValueOptions() {
        return Optional.ofNullable(this.newValueOptions);
    }

    /**
     * Options for rules using the third-party detection method.
     * 
     */
    @Import(name="thirdPartyRuleOptions")
    private @Nullable Output<SecurityMonitoringRuleOptionsThirdPartyRuleOptionsArgs> thirdPartyRuleOptions;

    /**
     * @return Options for rules using the third-party detection method.
     * 
     */
    public Optional<Output<SecurityMonitoringRuleOptionsThirdPartyRuleOptionsArgs>> thirdPartyRuleOptions() {
        return Optional.ofNullable(this.thirdPartyRuleOptions);
    }

    private SecurityMonitoringRuleOptionsArgs() {}

    private SecurityMonitoringRuleOptionsArgs(SecurityMonitoringRuleOptionsArgs $) {
        this.decreaseCriticalityBasedOnEnv = $.decreaseCriticalityBasedOnEnv;
        this.detectionMethod = $.detectionMethod;
        this.evaluationWindow = $.evaluationWindow;
        this.impossibleTravelOptions = $.impossibleTravelOptions;
        this.keepAlive = $.keepAlive;
        this.maxSignalDuration = $.maxSignalDuration;
        this.newValueOptions = $.newValueOptions;
        this.thirdPartyRuleOptions = $.thirdPartyRuleOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityMonitoringRuleOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityMonitoringRuleOptionsArgs $;

        public Builder() {
            $ = new SecurityMonitoringRuleOptionsArgs();
        }

        public Builder(SecurityMonitoringRuleOptionsArgs defaults) {
            $ = new SecurityMonitoringRuleOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param decreaseCriticalityBasedOnEnv If true, signals in non-production environments have a lower severity than what is defined by the rule case, which can reduce noise. The decrement is applied when the environment tag of the signal starts with `staging`, `test`, or `dev`. Only available when the rule type is `log_detection`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder decreaseCriticalityBasedOnEnv(@Nullable Output<Boolean> decreaseCriticalityBasedOnEnv) {
            $.decreaseCriticalityBasedOnEnv = decreaseCriticalityBasedOnEnv;
            return this;
        }

        /**
         * @param decreaseCriticalityBasedOnEnv If true, signals in non-production environments have a lower severity than what is defined by the rule case, which can reduce noise. The decrement is applied when the environment tag of the signal starts with `staging`, `test`, or `dev`. Only available when the rule type is `log_detection`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder decreaseCriticalityBasedOnEnv(Boolean decreaseCriticalityBasedOnEnv) {
            return decreaseCriticalityBasedOnEnv(Output.of(decreaseCriticalityBasedOnEnv));
        }

        /**
         * @param detectionMethod The detection method. Valid values are `threshold`, `new_value`, `anomaly_detection`, `impossible_travel`, `hardcoded`, `third_party`, `anomaly_threshold`. Defaults to `&#34;threshold&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder detectionMethod(@Nullable Output<String> detectionMethod) {
            $.detectionMethod = detectionMethod;
            return this;
        }

        /**
         * @param detectionMethod The detection method. Valid values are `threshold`, `new_value`, `anomaly_detection`, `impossible_travel`, `hardcoded`, `third_party`, `anomaly_threshold`. Defaults to `&#34;threshold&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder detectionMethod(String detectionMethod) {
            return detectionMethod(Output.of(detectionMethod));
        }

        /**
         * @param evaluationWindow A time window is specified to match when at least one of the cases matches true. This is a sliding window and evaluates in real time. Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
         * 
         * @return builder
         * 
         */
        public Builder evaluationWindow(@Nullable Output<Integer> evaluationWindow) {
            $.evaluationWindow = evaluationWindow;
            return this;
        }

        /**
         * @param evaluationWindow A time window is specified to match when at least one of the cases matches true. This is a sliding window and evaluates in real time. Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
         * 
         * @return builder
         * 
         */
        public Builder evaluationWindow(Integer evaluationWindow) {
            return evaluationWindow(Output.of(evaluationWindow));
        }

        /**
         * @param impossibleTravelOptions Options for rules using the impossible travel detection method.
         * 
         * @return builder
         * 
         */
        public Builder impossibleTravelOptions(@Nullable Output<SecurityMonitoringRuleOptionsImpossibleTravelOptionsArgs> impossibleTravelOptions) {
            $.impossibleTravelOptions = impossibleTravelOptions;
            return this;
        }

        /**
         * @param impossibleTravelOptions Options for rules using the impossible travel detection method.
         * 
         * @return builder
         * 
         */
        public Builder impossibleTravelOptions(SecurityMonitoringRuleOptionsImpossibleTravelOptionsArgs impossibleTravelOptions) {
            return impossibleTravelOptions(Output.of(impossibleTravelOptions));
        }

        /**
         * @param keepAlive Once a signal is generated, the signal will remain “open” if a case is matched at least once within this keep alive window (in seconds). Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
         * 
         * @return builder
         * 
         */
        public Builder keepAlive(@Nullable Output<Integer> keepAlive) {
            $.keepAlive = keepAlive;
            return this;
        }

        /**
         * @param keepAlive Once a signal is generated, the signal will remain “open” if a case is matched at least once within this keep alive window (in seconds). Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
         * 
         * @return builder
         * 
         */
        public Builder keepAlive(Integer keepAlive) {
            return keepAlive(Output.of(keepAlive));
        }

        /**
         * @param maxSignalDuration A signal will “close” regardless of the query being matched once the time exceeds the maximum duration (in seconds). This time is calculated from the first seen timestamp. Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
         * 
         * @return builder
         * 
         */
        public Builder maxSignalDuration(@Nullable Output<Integer> maxSignalDuration) {
            $.maxSignalDuration = maxSignalDuration;
            return this;
        }

        /**
         * @param maxSignalDuration A signal will “close” regardless of the query being matched once the time exceeds the maximum duration (in seconds). This time is calculated from the first seen timestamp. Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
         * 
         * @return builder
         * 
         */
        public Builder maxSignalDuration(Integer maxSignalDuration) {
            return maxSignalDuration(Output.of(maxSignalDuration));
        }

        /**
         * @param newValueOptions New value rules specific options.
         * 
         * @return builder
         * 
         */
        public Builder newValueOptions(@Nullable Output<SecurityMonitoringRuleOptionsNewValueOptionsArgs> newValueOptions) {
            $.newValueOptions = newValueOptions;
            return this;
        }

        /**
         * @param newValueOptions New value rules specific options.
         * 
         * @return builder
         * 
         */
        public Builder newValueOptions(SecurityMonitoringRuleOptionsNewValueOptionsArgs newValueOptions) {
            return newValueOptions(Output.of(newValueOptions));
        }

        /**
         * @param thirdPartyRuleOptions Options for rules using the third-party detection method.
         * 
         * @return builder
         * 
         */
        public Builder thirdPartyRuleOptions(@Nullable Output<SecurityMonitoringRuleOptionsThirdPartyRuleOptionsArgs> thirdPartyRuleOptions) {
            $.thirdPartyRuleOptions = thirdPartyRuleOptions;
            return this;
        }

        /**
         * @param thirdPartyRuleOptions Options for rules using the third-party detection method.
         * 
         * @return builder
         * 
         */
        public Builder thirdPartyRuleOptions(SecurityMonitoringRuleOptionsThirdPartyRuleOptionsArgs thirdPartyRuleOptions) {
            return thirdPartyRuleOptions(Output.of(thirdPartyRuleOptions));
        }

        public SecurityMonitoringRuleOptionsArgs build() {
            return $;
        }
    }

}
