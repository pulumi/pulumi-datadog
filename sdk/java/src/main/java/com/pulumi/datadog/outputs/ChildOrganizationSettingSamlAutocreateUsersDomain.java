// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChildOrganizationSettingSamlAutocreateUsersDomain {
    private @Nullable List<String> domains;
    private @Nullable Boolean enabled;

    private ChildOrganizationSettingSamlAutocreateUsersDomain() {}
    public List<String> domains() {
        return this.domains == null ? List.of() : this.domains;
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChildOrganizationSettingSamlAutocreateUsersDomain defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> domains;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ChildOrganizationSettingSamlAutocreateUsersDomain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder domains(@Nullable List<String> domains) {
            this.domains = domains;
            return this;
        }
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public ChildOrganizationSettingSamlAutocreateUsersDomain build() {
            final var o = new ChildOrganizationSettingSamlAutocreateUsersDomain();
            o.domains = domains;
            o.enabled = enabled;
            return o;
        }
    }
}