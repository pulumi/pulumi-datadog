// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.aws.outputs.IntegrationAccountAuthConfigAwsAuthConfigKeys;
import com.pulumi.datadog.aws.outputs.IntegrationAccountAuthConfigAwsAuthConfigRole;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationAccountAuthConfig {
    /**
     * @return Datadog will use the provided AWS Access Key ID and Secret Access Key to authenticate to your account.
     * 
     */
    private @Nullable IntegrationAccountAuthConfigAwsAuthConfigKeys awsAuthConfigKeys;
    private @Nullable IntegrationAccountAuthConfigAwsAuthConfigRole awsAuthConfigRole;

    private IntegrationAccountAuthConfig() {}
    /**
     * @return Datadog will use the provided AWS Access Key ID and Secret Access Key to authenticate to your account.
     * 
     */
    public Optional<IntegrationAccountAuthConfigAwsAuthConfigKeys> awsAuthConfigKeys() {
        return Optional.ofNullable(this.awsAuthConfigKeys);
    }
    public Optional<IntegrationAccountAuthConfigAwsAuthConfigRole> awsAuthConfigRole() {
        return Optional.ofNullable(this.awsAuthConfigRole);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountAuthConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable IntegrationAccountAuthConfigAwsAuthConfigKeys awsAuthConfigKeys;
        private @Nullable IntegrationAccountAuthConfigAwsAuthConfigRole awsAuthConfigRole;
        public Builder() {}
        public Builder(IntegrationAccountAuthConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAuthConfigKeys = defaults.awsAuthConfigKeys;
    	      this.awsAuthConfigRole = defaults.awsAuthConfigRole;
        }

        @CustomType.Setter
        public Builder awsAuthConfigKeys(@Nullable IntegrationAccountAuthConfigAwsAuthConfigKeys awsAuthConfigKeys) {

            this.awsAuthConfigKeys = awsAuthConfigKeys;
            return this;
        }
        @CustomType.Setter
        public Builder awsAuthConfigRole(@Nullable IntegrationAccountAuthConfigAwsAuthConfigRole awsAuthConfigRole) {

            this.awsAuthConfigRole = awsAuthConfigRole;
            return this;
        }
        public IntegrationAccountAuthConfig build() {
            final var _resultValue = new IntegrationAccountAuthConfig();
            _resultValue.awsAuthConfigKeys = awsAuthConfigKeys;
            _resultValue.awsAuthConfigRole = awsAuthConfigRole;
            return _resultValue;
        }
    }
}