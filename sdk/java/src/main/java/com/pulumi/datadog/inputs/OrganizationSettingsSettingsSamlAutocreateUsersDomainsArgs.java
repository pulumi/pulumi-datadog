// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationSettingsSettingsSamlAutocreateUsersDomainsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationSettingsSettingsSamlAutocreateUsersDomainsArgs Empty = new OrganizationSettingsSettingsSamlAutocreateUsersDomainsArgs();

    @Import(name="domains")
    private @Nullable Output<List<String>> domains;

    public Optional<Output<List<String>>> domains() {
        return Optional.ofNullable(this.domains);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private OrganizationSettingsSettingsSamlAutocreateUsersDomainsArgs() {}

    private OrganizationSettingsSettingsSamlAutocreateUsersDomainsArgs(OrganizationSettingsSettingsSamlAutocreateUsersDomainsArgs $) {
        this.domains = $.domains;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationSettingsSettingsSamlAutocreateUsersDomainsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationSettingsSettingsSamlAutocreateUsersDomainsArgs $;

        public Builder() {
            $ = new OrganizationSettingsSettingsSamlAutocreateUsersDomainsArgs();
        }

        public Builder(OrganizationSettingsSettingsSamlAutocreateUsersDomainsArgs defaults) {
            $ = new OrganizationSettingsSettingsSamlAutocreateUsersDomainsArgs(Objects.requireNonNull(defaults));
        }

        public Builder domains(@Nullable Output<List<String>> domains) {
            $.domains = domains;
            return this;
        }

        public Builder domains(List<String> domains) {
            return domains(Output.of(domains));
        }

        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public OrganizationSettingsSettingsSamlAutocreateUsersDomainsArgs build() {
            return $;
        }
    }

}