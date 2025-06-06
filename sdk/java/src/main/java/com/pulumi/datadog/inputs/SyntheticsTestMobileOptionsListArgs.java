// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.SyntheticsTestMobileOptionsListBindingArgs;
import com.pulumi.datadog.inputs.SyntheticsTestMobileOptionsListCiArgs;
import com.pulumi.datadog.inputs.SyntheticsTestMobileOptionsListMobileApplicationArgs;
import com.pulumi.datadog.inputs.SyntheticsTestMobileOptionsListMonitorOptionsArgs;
import com.pulumi.datadog.inputs.SyntheticsTestMobileOptionsListRetryArgs;
import com.pulumi.datadog.inputs.SyntheticsTestMobileOptionsListSchedulingArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticsTestMobileOptionsListArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestMobileOptionsListArgs Empty = new SyntheticsTestMobileOptionsListArgs();

    @Import(name="allowApplicationCrash")
    private @Nullable Output<Boolean> allowApplicationCrash;

    public Optional<Output<Boolean>> allowApplicationCrash() {
        return Optional.ofNullable(this.allowApplicationCrash);
    }

    /**
     * Restriction policy bindings for the Synthetic mobile test. Should not be used in parallel with a `datadog.RestrictionPolicy` resource
     * 
     */
    @Import(name="bindings")
    private @Nullable Output<List<SyntheticsTestMobileOptionsListBindingArgs>> bindings;

    /**
     * @return Restriction policy bindings for the Synthetic mobile test. Should not be used in parallel with a `datadog.RestrictionPolicy` resource
     * 
     */
    public Optional<Output<List<SyntheticsTestMobileOptionsListBindingArgs>>> bindings() {
        return Optional.ofNullable(this.bindings);
    }

    /**
     * CI/CD options for a Synthetic test.
     * 
     */
    @Import(name="ci")
    private @Nullable Output<SyntheticsTestMobileOptionsListCiArgs> ci;

    /**
     * @return CI/CD options for a Synthetic test.
     * 
     */
    public Optional<Output<SyntheticsTestMobileOptionsListCiArgs>> ci() {
        return Optional.ofNullable(this.ci);
    }

    @Import(name="defaultStepTimeout")
    private @Nullable Output<Integer> defaultStepTimeout;

    public Optional<Output<Integer>> defaultStepTimeout() {
        return Optional.ofNullable(this.defaultStepTimeout);
    }

    @Import(name="deviceIds", required=true)
    private Output<List<String>> deviceIds;

    public Output<List<String>> deviceIds() {
        return this.deviceIds;
    }

    @Import(name="disableAutoAcceptAlert")
    private @Nullable Output<Boolean> disableAutoAcceptAlert;

    public Optional<Output<Boolean>> disableAutoAcceptAlert() {
        return Optional.ofNullable(this.disableAutoAcceptAlert);
    }

    /**
     * Minimum amount of time in failure required to trigger an alert (in seconds). Default is `0`.
     * 
     */
    @Import(name="minFailureDuration")
    private @Nullable Output<Integer> minFailureDuration;

    /**
     * @return Minimum amount of time in failure required to trigger an alert (in seconds). Default is `0`.
     * 
     */
    public Optional<Output<Integer>> minFailureDuration() {
        return Optional.ofNullable(this.minFailureDuration);
    }

    @Import(name="mobileApplication", required=true)
    private Output<SyntheticsTestMobileOptionsListMobileApplicationArgs> mobileApplication;

    public Output<SyntheticsTestMobileOptionsListMobileApplicationArgs> mobileApplication() {
        return this.mobileApplication;
    }

    /**
     * The monitor name is used for the alert title as well as for all monitor dashboard widgets and SLOs.
     * 
     */
    @Import(name="monitorName")
    private @Nullable Output<String> monitorName;

    /**
     * @return The monitor name is used for the alert title as well as for all monitor dashboard widgets and SLOs.
     * 
     */
    public Optional<Output<String>> monitorName() {
        return Optional.ofNullable(this.monitorName);
    }

    @Import(name="monitorOptions")
    private @Nullable Output<SyntheticsTestMobileOptionsListMonitorOptionsArgs> monitorOptions;

    public Optional<Output<SyntheticsTestMobileOptionsListMonitorOptionsArgs>> monitorOptions() {
        return Optional.ofNullable(this.monitorOptions);
    }

    @Import(name="monitorPriority")
    private @Nullable Output<Integer> monitorPriority;

    public Optional<Output<Integer>> monitorPriority() {
        return Optional.ofNullable(this.monitorPriority);
    }

    /**
     * Prevents saving screenshots of the steps.
     * 
     */
    @Import(name="noScreenshot")
    private @Nullable Output<Boolean> noScreenshot;

    /**
     * @return Prevents saving screenshots of the steps.
     * 
     */
    public Optional<Output<Boolean>> noScreenshot() {
        return Optional.ofNullable(this.noScreenshot);
    }

    /**
     * A list of role identifiers pulled from the Roles API to restrict read and write access. **Deprecated.** This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
     * 
     * @deprecated
     * This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
     * 
     */
    @Deprecated /* This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead. */
    @Import(name="restrictedRoles")
    private @Nullable Output<List<String>> restrictedRoles;

    /**
     * @return A list of role identifiers pulled from the Roles API to restrict read and write access. **Deprecated.** This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
     * 
     * @deprecated
     * This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
     * 
     */
    @Deprecated /* This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead. */
    public Optional<Output<List<String>>> restrictedRoles() {
        return Optional.ofNullable(this.restrictedRoles);
    }

    @Import(name="retry")
    private @Nullable Output<SyntheticsTestMobileOptionsListRetryArgs> retry;

    public Optional<Output<SyntheticsTestMobileOptionsListRetryArgs>> retry() {
        return Optional.ofNullable(this.retry);
    }

    /**
     * Object containing timeframes and timezone used for advanced scheduling.
     * 
     */
    @Import(name="scheduling")
    private @Nullable Output<SyntheticsTestMobileOptionsListSchedulingArgs> scheduling;

    /**
     * @return Object containing timeframes and timezone used for advanced scheduling.
     * 
     */
    public Optional<Output<SyntheticsTestMobileOptionsListSchedulingArgs>> scheduling() {
        return Optional.ofNullable(this.scheduling);
    }

    /**
     * How often the test should run (in seconds). Valid range is `300-604800` for mobile tests.
     * 
     */
    @Import(name="tickEvery", required=true)
    private Output<Integer> tickEvery;

    /**
     * @return How often the test should run (in seconds). Valid range is `300-604800` for mobile tests.
     * 
     */
    public Output<Integer> tickEvery() {
        return this.tickEvery;
    }

    @Import(name="verbosity")
    private @Nullable Output<Integer> verbosity;

    public Optional<Output<Integer>> verbosity() {
        return Optional.ofNullable(this.verbosity);
    }

    private SyntheticsTestMobileOptionsListArgs() {}

    private SyntheticsTestMobileOptionsListArgs(SyntheticsTestMobileOptionsListArgs $) {
        this.allowApplicationCrash = $.allowApplicationCrash;
        this.bindings = $.bindings;
        this.ci = $.ci;
        this.defaultStepTimeout = $.defaultStepTimeout;
        this.deviceIds = $.deviceIds;
        this.disableAutoAcceptAlert = $.disableAutoAcceptAlert;
        this.minFailureDuration = $.minFailureDuration;
        this.mobileApplication = $.mobileApplication;
        this.monitorName = $.monitorName;
        this.monitorOptions = $.monitorOptions;
        this.monitorPriority = $.monitorPriority;
        this.noScreenshot = $.noScreenshot;
        this.restrictedRoles = $.restrictedRoles;
        this.retry = $.retry;
        this.scheduling = $.scheduling;
        this.tickEvery = $.tickEvery;
        this.verbosity = $.verbosity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestMobileOptionsListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestMobileOptionsListArgs $;

        public Builder() {
            $ = new SyntheticsTestMobileOptionsListArgs();
        }

        public Builder(SyntheticsTestMobileOptionsListArgs defaults) {
            $ = new SyntheticsTestMobileOptionsListArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowApplicationCrash(@Nullable Output<Boolean> allowApplicationCrash) {
            $.allowApplicationCrash = allowApplicationCrash;
            return this;
        }

        public Builder allowApplicationCrash(Boolean allowApplicationCrash) {
            return allowApplicationCrash(Output.of(allowApplicationCrash));
        }

        /**
         * @param bindings Restriction policy bindings for the Synthetic mobile test. Should not be used in parallel with a `datadog.RestrictionPolicy` resource
         * 
         * @return builder
         * 
         */
        public Builder bindings(@Nullable Output<List<SyntheticsTestMobileOptionsListBindingArgs>> bindings) {
            $.bindings = bindings;
            return this;
        }

        /**
         * @param bindings Restriction policy bindings for the Synthetic mobile test. Should not be used in parallel with a `datadog.RestrictionPolicy` resource
         * 
         * @return builder
         * 
         */
        public Builder bindings(List<SyntheticsTestMobileOptionsListBindingArgs> bindings) {
            return bindings(Output.of(bindings));
        }

        /**
         * @param bindings Restriction policy bindings for the Synthetic mobile test. Should not be used in parallel with a `datadog.RestrictionPolicy` resource
         * 
         * @return builder
         * 
         */
        public Builder bindings(SyntheticsTestMobileOptionsListBindingArgs... bindings) {
            return bindings(List.of(bindings));
        }

        /**
         * @param ci CI/CD options for a Synthetic test.
         * 
         * @return builder
         * 
         */
        public Builder ci(@Nullable Output<SyntheticsTestMobileOptionsListCiArgs> ci) {
            $.ci = ci;
            return this;
        }

        /**
         * @param ci CI/CD options for a Synthetic test.
         * 
         * @return builder
         * 
         */
        public Builder ci(SyntheticsTestMobileOptionsListCiArgs ci) {
            return ci(Output.of(ci));
        }

        public Builder defaultStepTimeout(@Nullable Output<Integer> defaultStepTimeout) {
            $.defaultStepTimeout = defaultStepTimeout;
            return this;
        }

        public Builder defaultStepTimeout(Integer defaultStepTimeout) {
            return defaultStepTimeout(Output.of(defaultStepTimeout));
        }

        public Builder deviceIds(Output<List<String>> deviceIds) {
            $.deviceIds = deviceIds;
            return this;
        }

        public Builder deviceIds(List<String> deviceIds) {
            return deviceIds(Output.of(deviceIds));
        }

        public Builder deviceIds(String... deviceIds) {
            return deviceIds(List.of(deviceIds));
        }

        public Builder disableAutoAcceptAlert(@Nullable Output<Boolean> disableAutoAcceptAlert) {
            $.disableAutoAcceptAlert = disableAutoAcceptAlert;
            return this;
        }

        public Builder disableAutoAcceptAlert(Boolean disableAutoAcceptAlert) {
            return disableAutoAcceptAlert(Output.of(disableAutoAcceptAlert));
        }

        /**
         * @param minFailureDuration Minimum amount of time in failure required to trigger an alert (in seconds). Default is `0`.
         * 
         * @return builder
         * 
         */
        public Builder minFailureDuration(@Nullable Output<Integer> minFailureDuration) {
            $.minFailureDuration = minFailureDuration;
            return this;
        }

        /**
         * @param minFailureDuration Minimum amount of time in failure required to trigger an alert (in seconds). Default is `0`.
         * 
         * @return builder
         * 
         */
        public Builder minFailureDuration(Integer minFailureDuration) {
            return minFailureDuration(Output.of(minFailureDuration));
        }

        public Builder mobileApplication(Output<SyntheticsTestMobileOptionsListMobileApplicationArgs> mobileApplication) {
            $.mobileApplication = mobileApplication;
            return this;
        }

        public Builder mobileApplication(SyntheticsTestMobileOptionsListMobileApplicationArgs mobileApplication) {
            return mobileApplication(Output.of(mobileApplication));
        }

        /**
         * @param monitorName The monitor name is used for the alert title as well as for all monitor dashboard widgets and SLOs.
         * 
         * @return builder
         * 
         */
        public Builder monitorName(@Nullable Output<String> monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        /**
         * @param monitorName The monitor name is used for the alert title as well as for all monitor dashboard widgets and SLOs.
         * 
         * @return builder
         * 
         */
        public Builder monitorName(String monitorName) {
            return monitorName(Output.of(monitorName));
        }

        public Builder monitorOptions(@Nullable Output<SyntheticsTestMobileOptionsListMonitorOptionsArgs> monitorOptions) {
            $.monitorOptions = monitorOptions;
            return this;
        }

        public Builder monitorOptions(SyntheticsTestMobileOptionsListMonitorOptionsArgs monitorOptions) {
            return monitorOptions(Output.of(monitorOptions));
        }

        public Builder monitorPriority(@Nullable Output<Integer> monitorPriority) {
            $.monitorPriority = monitorPriority;
            return this;
        }

        public Builder monitorPriority(Integer monitorPriority) {
            return monitorPriority(Output.of(monitorPriority));
        }

        /**
         * @param noScreenshot Prevents saving screenshots of the steps.
         * 
         * @return builder
         * 
         */
        public Builder noScreenshot(@Nullable Output<Boolean> noScreenshot) {
            $.noScreenshot = noScreenshot;
            return this;
        }

        /**
         * @param noScreenshot Prevents saving screenshots of the steps.
         * 
         * @return builder
         * 
         */
        public Builder noScreenshot(Boolean noScreenshot) {
            return noScreenshot(Output.of(noScreenshot));
        }

        /**
         * @param restrictedRoles A list of role identifiers pulled from the Roles API to restrict read and write access. **Deprecated.** This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
         * 
         */
        @Deprecated /* This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead. */
        public Builder restrictedRoles(@Nullable Output<List<String>> restrictedRoles) {
            $.restrictedRoles = restrictedRoles;
            return this;
        }

        /**
         * @param restrictedRoles A list of role identifiers pulled from the Roles API to restrict read and write access. **Deprecated.** This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
         * 
         */
        @Deprecated /* This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead. */
        public Builder restrictedRoles(List<String> restrictedRoles) {
            return restrictedRoles(Output.of(restrictedRoles));
        }

        /**
         * @param restrictedRoles A list of role identifiers pulled from the Roles API to restrict read and write access. **Deprecated.** This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
         * 
         */
        @Deprecated /* This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead. */
        public Builder restrictedRoles(String... restrictedRoles) {
            return restrictedRoles(List.of(restrictedRoles));
        }

        public Builder retry(@Nullable Output<SyntheticsTestMobileOptionsListRetryArgs> retry) {
            $.retry = retry;
            return this;
        }

        public Builder retry(SyntheticsTestMobileOptionsListRetryArgs retry) {
            return retry(Output.of(retry));
        }

        /**
         * @param scheduling Object containing timeframes and timezone used for advanced scheduling.
         * 
         * @return builder
         * 
         */
        public Builder scheduling(@Nullable Output<SyntheticsTestMobileOptionsListSchedulingArgs> scheduling) {
            $.scheduling = scheduling;
            return this;
        }

        /**
         * @param scheduling Object containing timeframes and timezone used for advanced scheduling.
         * 
         * @return builder
         * 
         */
        public Builder scheduling(SyntheticsTestMobileOptionsListSchedulingArgs scheduling) {
            return scheduling(Output.of(scheduling));
        }

        /**
         * @param tickEvery How often the test should run (in seconds). Valid range is `300-604800` for mobile tests.
         * 
         * @return builder
         * 
         */
        public Builder tickEvery(Output<Integer> tickEvery) {
            $.tickEvery = tickEvery;
            return this;
        }

        /**
         * @param tickEvery How often the test should run (in seconds). Valid range is `300-604800` for mobile tests.
         * 
         * @return builder
         * 
         */
        public Builder tickEvery(Integer tickEvery) {
            return tickEvery(Output.of(tickEvery));
        }

        public Builder verbosity(@Nullable Output<Integer> verbosity) {
            $.verbosity = verbosity;
            return this;
        }

        public Builder verbosity(Integer verbosity) {
            return verbosity(Output.of(verbosity));
        }

        public SyntheticsTestMobileOptionsListArgs build() {
            if ($.deviceIds == null) {
                throw new MissingRequiredPropertyException("SyntheticsTestMobileOptionsListArgs", "deviceIds");
            }
            if ($.mobileApplication == null) {
                throw new MissingRequiredPropertyException("SyntheticsTestMobileOptionsListArgs", "mobileApplication");
            }
            if ($.tickEvery == null) {
                throw new MissingRequiredPropertyException("SyntheticsTestMobileOptionsListArgs", "tickEvery");
            }
            return $;
        }
    }

}
