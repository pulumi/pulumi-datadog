// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogsIntegrationPipelineArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogsIntegrationPipelineArgs Empty = new LogsIntegrationPipelineArgs();

    /**
     * Boolean value to enable your pipeline.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Boolean value to enable your pipeline.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    private LogsIntegrationPipelineArgs() {}

    private LogsIntegrationPipelineArgs(LogsIntegrationPipelineArgs $) {
        this.isEnabled = $.isEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsIntegrationPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsIntegrationPipelineArgs $;

        public Builder() {
            $ = new LogsIntegrationPipelineArgs();
        }

        public Builder(LogsIntegrationPipelineArgs defaults) {
            $ = new LogsIntegrationPipelineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isEnabled Boolean value to enable your pipeline.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Boolean value to enable your pipeline.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public LogsIntegrationPipelineArgs build() {
            return $;
        }
    }

}
