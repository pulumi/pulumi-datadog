// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorMonitorThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorMonitorThresholdsArgs Empty = new MonitorMonitorThresholdsArgs();

    /**
     * The monitor `CRITICAL` threshold. Must be a number.
     * 
     */
    @Import(name="critical")
    private @Nullable Output<String> critical;

    /**
     * @return The monitor `CRITICAL` threshold. Must be a number.
     * 
     */
    public Optional<Output<String>> critical() {
        return Optional.ofNullable(this.critical);
    }

    /**
     * The monitor `CRITICAL` recovery threshold. Must be a number.
     * 
     */
    @Import(name="criticalRecovery")
    private @Nullable Output<String> criticalRecovery;

    /**
     * @return The monitor `CRITICAL` recovery threshold. Must be a number.
     * 
     */
    public Optional<Output<String>> criticalRecovery() {
        return Optional.ofNullable(this.criticalRecovery);
    }

    /**
     * The monitor `OK` threshold. Only supported in monitor type `service check`. Must be a number.
     * 
     */
    @Import(name="ok")
    private @Nullable Output<String> ok;

    /**
     * @return The monitor `OK` threshold. Only supported in monitor type `service check`. Must be a number.
     * 
     */
    public Optional<Output<String>> ok() {
        return Optional.ofNullable(this.ok);
    }

    /**
     * The monitor `UNKNOWN` threshold. Only supported in monitor type `service check`. Must be a number.
     * 
     */
    @Import(name="unknown")
    private @Nullable Output<String> unknown;

    /**
     * @return The monitor `UNKNOWN` threshold. Only supported in monitor type `service check`. Must be a number.
     * 
     */
    public Optional<Output<String>> unknown() {
        return Optional.ofNullable(this.unknown);
    }

    /**
     * The monitor `WARNING` threshold. Must be a number.
     * 
     */
    @Import(name="warning")
    private @Nullable Output<String> warning;

    /**
     * @return The monitor `WARNING` threshold. Must be a number.
     * 
     */
    public Optional<Output<String>> warning() {
        return Optional.ofNullable(this.warning);
    }

    /**
     * The monitor `WARNING` recovery threshold. Must be a number.
     * 
     */
    @Import(name="warningRecovery")
    private @Nullable Output<String> warningRecovery;

    /**
     * @return The monitor `WARNING` recovery threshold. Must be a number.
     * 
     */
    public Optional<Output<String>> warningRecovery() {
        return Optional.ofNullable(this.warningRecovery);
    }

    private MonitorMonitorThresholdsArgs() {}

    private MonitorMonitorThresholdsArgs(MonitorMonitorThresholdsArgs $) {
        this.critical = $.critical;
        this.criticalRecovery = $.criticalRecovery;
        this.ok = $.ok;
        this.unknown = $.unknown;
        this.warning = $.warning;
        this.warningRecovery = $.warningRecovery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorMonitorThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorMonitorThresholdsArgs $;

        public Builder() {
            $ = new MonitorMonitorThresholdsArgs();
        }

        public Builder(MonitorMonitorThresholdsArgs defaults) {
            $ = new MonitorMonitorThresholdsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param critical The monitor `CRITICAL` threshold. Must be a number.
         * 
         * @return builder
         * 
         */
        public Builder critical(@Nullable Output<String> critical) {
            $.critical = critical;
            return this;
        }

        /**
         * @param critical The monitor `CRITICAL` threshold. Must be a number.
         * 
         * @return builder
         * 
         */
        public Builder critical(String critical) {
            return critical(Output.of(critical));
        }

        /**
         * @param criticalRecovery The monitor `CRITICAL` recovery threshold. Must be a number.
         * 
         * @return builder
         * 
         */
        public Builder criticalRecovery(@Nullable Output<String> criticalRecovery) {
            $.criticalRecovery = criticalRecovery;
            return this;
        }

        /**
         * @param criticalRecovery The monitor `CRITICAL` recovery threshold. Must be a number.
         * 
         * @return builder
         * 
         */
        public Builder criticalRecovery(String criticalRecovery) {
            return criticalRecovery(Output.of(criticalRecovery));
        }

        /**
         * @param ok The monitor `OK` threshold. Only supported in monitor type `service check`. Must be a number.
         * 
         * @return builder
         * 
         */
        public Builder ok(@Nullable Output<String> ok) {
            $.ok = ok;
            return this;
        }

        /**
         * @param ok The monitor `OK` threshold. Only supported in monitor type `service check`. Must be a number.
         * 
         * @return builder
         * 
         */
        public Builder ok(String ok) {
            return ok(Output.of(ok));
        }

        /**
         * @param unknown The monitor `UNKNOWN` threshold. Only supported in monitor type `service check`. Must be a number.
         * 
         * @return builder
         * 
         */
        public Builder unknown(@Nullable Output<String> unknown) {
            $.unknown = unknown;
            return this;
        }

        /**
         * @param unknown The monitor `UNKNOWN` threshold. Only supported in monitor type `service check`. Must be a number.
         * 
         * @return builder
         * 
         */
        public Builder unknown(String unknown) {
            return unknown(Output.of(unknown));
        }

        /**
         * @param warning The monitor `WARNING` threshold. Must be a number.
         * 
         * @return builder
         * 
         */
        public Builder warning(@Nullable Output<String> warning) {
            $.warning = warning;
            return this;
        }

        /**
         * @param warning The monitor `WARNING` threshold. Must be a number.
         * 
         * @return builder
         * 
         */
        public Builder warning(String warning) {
            return warning(Output.of(warning));
        }

        /**
         * @param warningRecovery The monitor `WARNING` recovery threshold. Must be a number.
         * 
         * @return builder
         * 
         */
        public Builder warningRecovery(@Nullable Output<String> warningRecovery) {
            $.warningRecovery = warningRecovery;
            return this;
        }

        /**
         * @param warningRecovery The monitor `WARNING` recovery threshold. Must be a number.
         * 
         * @return builder
         * 
         */
        public Builder warningRecovery(String warningRecovery) {
            return warningRecovery(Output.of(warningRecovery));
        }

        public MonitorMonitorThresholdsArgs build() {
            return $;
        }
    }

}