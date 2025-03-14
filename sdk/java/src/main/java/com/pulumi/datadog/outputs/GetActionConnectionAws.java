// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.GetActionConnectionAwsAssumeRole;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetActionConnectionAws {
    /**
     * @return Configuration for an assume role AWS connection
     * 
     */
    private @Nullable GetActionConnectionAwsAssumeRole assumeRole;

    private GetActionConnectionAws() {}
    /**
     * @return Configuration for an assume role AWS connection
     * 
     */
    public Optional<GetActionConnectionAwsAssumeRole> assumeRole() {
        return Optional.ofNullable(this.assumeRole);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionConnectionAws defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetActionConnectionAwsAssumeRole assumeRole;
        public Builder() {}
        public Builder(GetActionConnectionAws defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assumeRole = defaults.assumeRole;
        }

        @CustomType.Setter
        public Builder assumeRole(@Nullable GetActionConnectionAwsAssumeRole assumeRole) {

            this.assumeRole = assumeRole;
            return this;
        }
        public GetActionConnectionAws build() {
            final var _resultValue = new GetActionConnectionAws();
            _resultValue.assumeRole = assumeRole;
            return _resultValue;
        }
    }
}
