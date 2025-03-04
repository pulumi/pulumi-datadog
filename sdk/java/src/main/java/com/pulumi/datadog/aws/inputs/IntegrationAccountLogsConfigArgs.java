// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.aws.inputs.IntegrationAccountLogsConfigLambdaForwarderArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountLogsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountLogsConfigArgs Empty = new IntegrationAccountLogsConfigArgs();

    /**
     * Leave empty to omit logs config.
     * 
     */
    @Import(name="lambdaForwarder")
    private @Nullable Output<IntegrationAccountLogsConfigLambdaForwarderArgs> lambdaForwarder;

    /**
     * @return Leave empty to omit logs config.
     * 
     */
    public Optional<Output<IntegrationAccountLogsConfigLambdaForwarderArgs>> lambdaForwarder() {
        return Optional.ofNullable(this.lambdaForwarder);
    }

    private IntegrationAccountLogsConfigArgs() {}

    private IntegrationAccountLogsConfigArgs(IntegrationAccountLogsConfigArgs $) {
        this.lambdaForwarder = $.lambdaForwarder;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountLogsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountLogsConfigArgs $;

        public Builder() {
            $ = new IntegrationAccountLogsConfigArgs();
        }

        public Builder(IntegrationAccountLogsConfigArgs defaults) {
            $ = new IntegrationAccountLogsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lambdaForwarder Leave empty to omit logs config.
         * 
         * @return builder
         * 
         */
        public Builder lambdaForwarder(@Nullable Output<IntegrationAccountLogsConfigLambdaForwarderArgs> lambdaForwarder) {
            $.lambdaForwarder = lambdaForwarder;
            return this;
        }

        /**
         * @param lambdaForwarder Leave empty to omit logs config.
         * 
         * @return builder
         * 
         */
        public Builder lambdaForwarder(IntegrationAccountLogsConfigLambdaForwarderArgs lambdaForwarder) {
            return lambdaForwarder(Output.of(lambdaForwarder));
        }

        public IntegrationAccountLogsConfigArgs build() {
            return $;
        }
    }

}
