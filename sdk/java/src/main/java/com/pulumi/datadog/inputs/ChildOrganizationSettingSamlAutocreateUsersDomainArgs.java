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


public final class ChildOrganizationSettingSamlAutocreateUsersDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChildOrganizationSettingSamlAutocreateUsersDomainArgs Empty = new ChildOrganizationSettingSamlAutocreateUsersDomainArgs();

    /**
     * List of domains where the SAML automated user creation is enabled.
     * 
     */
    @Import(name="domains")
    private @Nullable Output<List<String>> domains;

    /**
     * @return List of domains where the SAML automated user creation is enabled.
     * 
     */
    public Optional<Output<List<String>>> domains() {
        return Optional.ofNullable(this.domains);
    }

    /**
     * Whether or not the automated user creation based on SAML domain is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether or not the automated user creation based on SAML domain is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ChildOrganizationSettingSamlAutocreateUsersDomainArgs() {}

    private ChildOrganizationSettingSamlAutocreateUsersDomainArgs(ChildOrganizationSettingSamlAutocreateUsersDomainArgs $) {
        this.domains = $.domains;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChildOrganizationSettingSamlAutocreateUsersDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChildOrganizationSettingSamlAutocreateUsersDomainArgs $;

        public Builder() {
            $ = new ChildOrganizationSettingSamlAutocreateUsersDomainArgs();
        }

        public Builder(ChildOrganizationSettingSamlAutocreateUsersDomainArgs defaults) {
            $ = new ChildOrganizationSettingSamlAutocreateUsersDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domains List of domains where the SAML automated user creation is enabled.
         * 
         * @return builder
         * 
         */
        public Builder domains(@Nullable Output<List<String>> domains) {
            $.domains = domains;
            return this;
        }

        /**
         * @param domains List of domains where the SAML automated user creation is enabled.
         * 
         * @return builder
         * 
         */
        public Builder domains(List<String> domains) {
            return domains(Output.of(domains));
        }

        /**
         * @param domains List of domains where the SAML automated user creation is enabled.
         * 
         * @return builder
         * 
         */
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        /**
         * @param enabled Whether or not the automated user creation based on SAML domain is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether or not the automated user creation based on SAML domain is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ChildOrganizationSettingSamlAutocreateUsersDomainArgs build() {
            return $;
        }
    }

}