// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChildOrganizationSettingSamlIdpInitiatedLogin {
    private @Nullable Boolean enabled;

    private ChildOrganizationSettingSamlIdpInitiatedLogin() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChildOrganizationSettingSamlIdpInitiatedLogin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ChildOrganizationSettingSamlIdpInitiatedLogin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public ChildOrganizationSettingSamlIdpInitiatedLogin build() {
            final var o = new ChildOrganizationSettingSamlIdpInitiatedLogin();
            o.enabled = enabled;
            return o;
        }
    }
}