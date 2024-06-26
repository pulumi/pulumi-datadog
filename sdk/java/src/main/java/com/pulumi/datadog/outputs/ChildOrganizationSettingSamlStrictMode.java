// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChildOrganizationSettingSamlStrictMode {
    /**
     * @return Whether or not the SAML strict mode is enabled. If true, all users must log in with SAML.
     * 
     */
    private @Nullable Boolean enabled;

    private ChildOrganizationSettingSamlStrictMode() {}
    /**
     * @return Whether or not the SAML strict mode is enabled. If true, all users must log in with SAML.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChildOrganizationSettingSamlStrictMode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ChildOrganizationSettingSamlStrictMode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public ChildOrganizationSettingSamlStrictMode build() {
            final var _resultValue = new ChildOrganizationSettingSamlStrictMode();
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
