// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.aws.outputs.IntegrationAccountTracesConfigXrayServices;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationAccountTracesConfig {
    /**
     * @return AWS X-Ray services to collect traces from. Defaults to `include_only`.
     * 
     */
    private @Nullable IntegrationAccountTracesConfigXrayServices xrayServices;

    private IntegrationAccountTracesConfig() {}
    /**
     * @return AWS X-Ray services to collect traces from. Defaults to `include_only`.
     * 
     */
    public Optional<IntegrationAccountTracesConfigXrayServices> xrayServices() {
        return Optional.ofNullable(this.xrayServices);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountTracesConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable IntegrationAccountTracesConfigXrayServices xrayServices;
        public Builder() {}
        public Builder(IntegrationAccountTracesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.xrayServices = defaults.xrayServices;
        }

        @CustomType.Setter
        public Builder xrayServices(@Nullable IntegrationAccountTracesConfigXrayServices xrayServices) {

            this.xrayServices = xrayServices;
            return this;
        }
        public IntegrationAccountTracesConfig build() {
            final var _resultValue = new IntegrationAccountTracesConfig();
            _resultValue.xrayServices = xrayServices;
            return _resultValue;
        }
    }
}