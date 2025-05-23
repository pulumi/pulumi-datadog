// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class SyntheticsGlobalVariableOptionsTotpParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsGlobalVariableOptionsTotpParametersArgs Empty = new SyntheticsGlobalVariableOptionsTotpParametersArgs();

    /**
     * Number of digits for the OTP. Value must be between 4 and 10.
     * 
     */
    @Import(name="digits", required=true)
    private Output<Integer> digits;

    /**
     * @return Number of digits for the OTP. Value must be between 4 and 10.
     * 
     */
    public Output<Integer> digits() {
        return this.digits;
    }

    /**
     * Interval for which to refresh the token (in seconds). Value must be between 0 and 999.
     * 
     */
    @Import(name="refreshInterval", required=true)
    private Output<Integer> refreshInterval;

    /**
     * @return Interval for which to refresh the token (in seconds). Value must be between 0 and 999.
     * 
     */
    public Output<Integer> refreshInterval() {
        return this.refreshInterval;
    }

    private SyntheticsGlobalVariableOptionsTotpParametersArgs() {}

    private SyntheticsGlobalVariableOptionsTotpParametersArgs(SyntheticsGlobalVariableOptionsTotpParametersArgs $) {
        this.digits = $.digits;
        this.refreshInterval = $.refreshInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsGlobalVariableOptionsTotpParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsGlobalVariableOptionsTotpParametersArgs $;

        public Builder() {
            $ = new SyntheticsGlobalVariableOptionsTotpParametersArgs();
        }

        public Builder(SyntheticsGlobalVariableOptionsTotpParametersArgs defaults) {
            $ = new SyntheticsGlobalVariableOptionsTotpParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param digits Number of digits for the OTP. Value must be between 4 and 10.
         * 
         * @return builder
         * 
         */
        public Builder digits(Output<Integer> digits) {
            $.digits = digits;
            return this;
        }

        /**
         * @param digits Number of digits for the OTP. Value must be between 4 and 10.
         * 
         * @return builder
         * 
         */
        public Builder digits(Integer digits) {
            return digits(Output.of(digits));
        }

        /**
         * @param refreshInterval Interval for which to refresh the token (in seconds). Value must be between 0 and 999.
         * 
         * @return builder
         * 
         */
        public Builder refreshInterval(Output<Integer> refreshInterval) {
            $.refreshInterval = refreshInterval;
            return this;
        }

        /**
         * @param refreshInterval Interval for which to refresh the token (in seconds). Value must be between 0 and 999.
         * 
         * @return builder
         * 
         */
        public Builder refreshInterval(Integer refreshInterval) {
            return refreshInterval(Output.of(refreshInterval));
        }

        public SyntheticsGlobalVariableOptionsTotpParametersArgs build() {
            if ($.digits == null) {
                throw new MissingRequiredPropertyException("SyntheticsGlobalVariableOptionsTotpParametersArgs", "digits");
            }
            if ($.refreshInterval == null) {
                throw new MissingRequiredPropertyException("SyntheticsGlobalVariableOptionsTotpParametersArgs", "refreshInterval");
            }
            return $;
        }
    }

}
