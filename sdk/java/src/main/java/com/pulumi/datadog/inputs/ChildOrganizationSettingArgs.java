// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.ChildOrganizationSettingSamlArgs;
import com.pulumi.datadog.inputs.ChildOrganizationSettingSamlAutocreateUsersDomainArgs;
import com.pulumi.datadog.inputs.ChildOrganizationSettingSamlIdpInitiatedLoginArgs;
import com.pulumi.datadog.inputs.ChildOrganizationSettingSamlStrictModeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChildOrganizationSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChildOrganizationSettingArgs Empty = new ChildOrganizationSettingArgs();

    /**
     * Whether or not the organization users can share widgets outside of Datadog.
     * 
     */
    @Import(name="privateWidgetShare")
    private @Nullable Output<Boolean> privateWidgetShare;

    /**
     * @return Whether or not the organization users can share widgets outside of Datadog.
     * 
     */
    public Optional<Output<Boolean>> privateWidgetShare() {
        return Optional.ofNullable(this.privateWidgetShare);
    }

    /**
     * The access role of the user. Options are `st` (standard user), `adm` (admin user), or `ro` (read-only user). Allowed enum values: `st`, `adm` , `ro`, `ERROR`
     * 
     */
    @Import(name="samlAutocreateAccessRole")
    private @Nullable Output<String> samlAutocreateAccessRole;

    /**
     * @return The access role of the user. Options are `st` (standard user), `adm` (admin user), or `ro` (read-only user). Allowed enum values: `st`, `adm` , `ro`, `ERROR`
     * 
     */
    public Optional<Output<String>> samlAutocreateAccessRole() {
        return Optional.ofNullable(this.samlAutocreateAccessRole);
    }

    /**
     * List of domains where the SAML automated user creation is enabled.
     * 
     */
    @Import(name="samlAutocreateUsersDomains")
    private @Nullable Output<List<ChildOrganizationSettingSamlAutocreateUsersDomainArgs>> samlAutocreateUsersDomains;

    /**
     * @return List of domains where the SAML automated user creation is enabled.
     * 
     */
    public Optional<Output<List<ChildOrganizationSettingSamlAutocreateUsersDomainArgs>>> samlAutocreateUsersDomains() {
        return Optional.ofNullable(this.samlAutocreateUsersDomains);
    }

    /**
     * Whether or not SAML can be enabled for this organization.
     * 
     */
    @Import(name="samlCanBeEnabled")
    private @Nullable Output<Boolean> samlCanBeEnabled;

    /**
     * @return Whether or not SAML can be enabled for this organization.
     * 
     */
    public Optional<Output<Boolean>> samlCanBeEnabled() {
        return Optional.ofNullable(this.samlCanBeEnabled);
    }

    /**
     * Identity provider endpoint for SAML authentication.
     * 
     */
    @Import(name="samlIdpEndpoint")
    private @Nullable Output<String> samlIdpEndpoint;

    /**
     * @return Identity provider endpoint for SAML authentication.
     * 
     */
    public Optional<Output<String>> samlIdpEndpoint() {
        return Optional.ofNullable(this.samlIdpEndpoint);
    }

    /**
     * Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
     * 
     */
    @Import(name="samlIdpInitiatedLogins")
    private @Nullable Output<List<ChildOrganizationSettingSamlIdpInitiatedLoginArgs>> samlIdpInitiatedLogins;

    /**
     * @return Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
     * 
     */
    public Optional<Output<List<ChildOrganizationSettingSamlIdpInitiatedLoginArgs>>> samlIdpInitiatedLogins() {
        return Optional.ofNullable(this.samlIdpInitiatedLogins);
    }

    /**
     * Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
     * 
     */
    @Import(name="samlIdpMetadataUploaded")
    private @Nullable Output<Boolean> samlIdpMetadataUploaded;

    /**
     * @return Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
     * 
     */
    public Optional<Output<Boolean>> samlIdpMetadataUploaded() {
        return Optional.ofNullable(this.samlIdpMetadataUploaded);
    }

    /**
     * URL for SAML logging.
     * 
     */
    @Import(name="samlLoginUrl")
    private @Nullable Output<String> samlLoginUrl;

    /**
     * @return URL for SAML logging.
     * 
     */
    public Optional<Output<String>> samlLoginUrl() {
        return Optional.ofNullable(this.samlLoginUrl);
    }

    /**
     * Whether or not the SAML strict mode is enabled. If true, all users must log in with SAML.
     * 
     */
    @Import(name="samlStrictModes")
    private @Nullable Output<List<ChildOrganizationSettingSamlStrictModeArgs>> samlStrictModes;

    /**
     * @return Whether or not the SAML strict mode is enabled. If true, all users must log in with SAML.
     * 
     */
    public Optional<Output<List<ChildOrganizationSettingSamlStrictModeArgs>>> samlStrictModes() {
        return Optional.ofNullable(this.samlStrictModes);
    }

    /**
     * SAML properties
     * 
     */
    @Import(name="samls")
    private @Nullable Output<List<ChildOrganizationSettingSamlArgs>> samls;

    /**
     * @return SAML properties
     * 
     */
    public Optional<Output<List<ChildOrganizationSettingSamlArgs>>> samls() {
        return Optional.ofNullable(this.samls);
    }

    private ChildOrganizationSettingArgs() {}

    private ChildOrganizationSettingArgs(ChildOrganizationSettingArgs $) {
        this.privateWidgetShare = $.privateWidgetShare;
        this.samlAutocreateAccessRole = $.samlAutocreateAccessRole;
        this.samlAutocreateUsersDomains = $.samlAutocreateUsersDomains;
        this.samlCanBeEnabled = $.samlCanBeEnabled;
        this.samlIdpEndpoint = $.samlIdpEndpoint;
        this.samlIdpInitiatedLogins = $.samlIdpInitiatedLogins;
        this.samlIdpMetadataUploaded = $.samlIdpMetadataUploaded;
        this.samlLoginUrl = $.samlLoginUrl;
        this.samlStrictModes = $.samlStrictModes;
        this.samls = $.samls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChildOrganizationSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChildOrganizationSettingArgs $;

        public Builder() {
            $ = new ChildOrganizationSettingArgs();
        }

        public Builder(ChildOrganizationSettingArgs defaults) {
            $ = new ChildOrganizationSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateWidgetShare Whether or not the organization users can share widgets outside of Datadog.
         * 
         * @return builder
         * 
         */
        public Builder privateWidgetShare(@Nullable Output<Boolean> privateWidgetShare) {
            $.privateWidgetShare = privateWidgetShare;
            return this;
        }

        /**
         * @param privateWidgetShare Whether or not the organization users can share widgets outside of Datadog.
         * 
         * @return builder
         * 
         */
        public Builder privateWidgetShare(Boolean privateWidgetShare) {
            return privateWidgetShare(Output.of(privateWidgetShare));
        }

        /**
         * @param samlAutocreateAccessRole The access role of the user. Options are `st` (standard user), `adm` (admin user), or `ro` (read-only user). Allowed enum values: `st`, `adm` , `ro`, `ERROR`
         * 
         * @return builder
         * 
         */
        public Builder samlAutocreateAccessRole(@Nullable Output<String> samlAutocreateAccessRole) {
            $.samlAutocreateAccessRole = samlAutocreateAccessRole;
            return this;
        }

        /**
         * @param samlAutocreateAccessRole The access role of the user. Options are `st` (standard user), `adm` (admin user), or `ro` (read-only user). Allowed enum values: `st`, `adm` , `ro`, `ERROR`
         * 
         * @return builder
         * 
         */
        public Builder samlAutocreateAccessRole(String samlAutocreateAccessRole) {
            return samlAutocreateAccessRole(Output.of(samlAutocreateAccessRole));
        }

        /**
         * @param samlAutocreateUsersDomains List of domains where the SAML automated user creation is enabled.
         * 
         * @return builder
         * 
         */
        public Builder samlAutocreateUsersDomains(@Nullable Output<List<ChildOrganizationSettingSamlAutocreateUsersDomainArgs>> samlAutocreateUsersDomains) {
            $.samlAutocreateUsersDomains = samlAutocreateUsersDomains;
            return this;
        }

        /**
         * @param samlAutocreateUsersDomains List of domains where the SAML automated user creation is enabled.
         * 
         * @return builder
         * 
         */
        public Builder samlAutocreateUsersDomains(List<ChildOrganizationSettingSamlAutocreateUsersDomainArgs> samlAutocreateUsersDomains) {
            return samlAutocreateUsersDomains(Output.of(samlAutocreateUsersDomains));
        }

        /**
         * @param samlAutocreateUsersDomains List of domains where the SAML automated user creation is enabled.
         * 
         * @return builder
         * 
         */
        public Builder samlAutocreateUsersDomains(ChildOrganizationSettingSamlAutocreateUsersDomainArgs... samlAutocreateUsersDomains) {
            return samlAutocreateUsersDomains(List.of(samlAutocreateUsersDomains));
        }

        /**
         * @param samlCanBeEnabled Whether or not SAML can be enabled for this organization.
         * 
         * @return builder
         * 
         */
        public Builder samlCanBeEnabled(@Nullable Output<Boolean> samlCanBeEnabled) {
            $.samlCanBeEnabled = samlCanBeEnabled;
            return this;
        }

        /**
         * @param samlCanBeEnabled Whether or not SAML can be enabled for this organization.
         * 
         * @return builder
         * 
         */
        public Builder samlCanBeEnabled(Boolean samlCanBeEnabled) {
            return samlCanBeEnabled(Output.of(samlCanBeEnabled));
        }

        /**
         * @param samlIdpEndpoint Identity provider endpoint for SAML authentication.
         * 
         * @return builder
         * 
         */
        public Builder samlIdpEndpoint(@Nullable Output<String> samlIdpEndpoint) {
            $.samlIdpEndpoint = samlIdpEndpoint;
            return this;
        }

        /**
         * @param samlIdpEndpoint Identity provider endpoint for SAML authentication.
         * 
         * @return builder
         * 
         */
        public Builder samlIdpEndpoint(String samlIdpEndpoint) {
            return samlIdpEndpoint(Output.of(samlIdpEndpoint));
        }

        /**
         * @param samlIdpInitiatedLogins Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
         * 
         * @return builder
         * 
         */
        public Builder samlIdpInitiatedLogins(@Nullable Output<List<ChildOrganizationSettingSamlIdpInitiatedLoginArgs>> samlIdpInitiatedLogins) {
            $.samlIdpInitiatedLogins = samlIdpInitiatedLogins;
            return this;
        }

        /**
         * @param samlIdpInitiatedLogins Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
         * 
         * @return builder
         * 
         */
        public Builder samlIdpInitiatedLogins(List<ChildOrganizationSettingSamlIdpInitiatedLoginArgs> samlIdpInitiatedLogins) {
            return samlIdpInitiatedLogins(Output.of(samlIdpInitiatedLogins));
        }

        /**
         * @param samlIdpInitiatedLogins Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
         * 
         * @return builder
         * 
         */
        public Builder samlIdpInitiatedLogins(ChildOrganizationSettingSamlIdpInitiatedLoginArgs... samlIdpInitiatedLogins) {
            return samlIdpInitiatedLogins(List.of(samlIdpInitiatedLogins));
        }

        /**
         * @param samlIdpMetadataUploaded Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
         * 
         * @return builder
         * 
         */
        public Builder samlIdpMetadataUploaded(@Nullable Output<Boolean> samlIdpMetadataUploaded) {
            $.samlIdpMetadataUploaded = samlIdpMetadataUploaded;
            return this;
        }

        /**
         * @param samlIdpMetadataUploaded Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
         * 
         * @return builder
         * 
         */
        public Builder samlIdpMetadataUploaded(Boolean samlIdpMetadataUploaded) {
            return samlIdpMetadataUploaded(Output.of(samlIdpMetadataUploaded));
        }

        /**
         * @param samlLoginUrl URL for SAML logging.
         * 
         * @return builder
         * 
         */
        public Builder samlLoginUrl(@Nullable Output<String> samlLoginUrl) {
            $.samlLoginUrl = samlLoginUrl;
            return this;
        }

        /**
         * @param samlLoginUrl URL for SAML logging.
         * 
         * @return builder
         * 
         */
        public Builder samlLoginUrl(String samlLoginUrl) {
            return samlLoginUrl(Output.of(samlLoginUrl));
        }

        /**
         * @param samlStrictModes Whether or not the SAML strict mode is enabled. If true, all users must log in with SAML.
         * 
         * @return builder
         * 
         */
        public Builder samlStrictModes(@Nullable Output<List<ChildOrganizationSettingSamlStrictModeArgs>> samlStrictModes) {
            $.samlStrictModes = samlStrictModes;
            return this;
        }

        /**
         * @param samlStrictModes Whether or not the SAML strict mode is enabled. If true, all users must log in with SAML.
         * 
         * @return builder
         * 
         */
        public Builder samlStrictModes(List<ChildOrganizationSettingSamlStrictModeArgs> samlStrictModes) {
            return samlStrictModes(Output.of(samlStrictModes));
        }

        /**
         * @param samlStrictModes Whether or not the SAML strict mode is enabled. If true, all users must log in with SAML.
         * 
         * @return builder
         * 
         */
        public Builder samlStrictModes(ChildOrganizationSettingSamlStrictModeArgs... samlStrictModes) {
            return samlStrictModes(List.of(samlStrictModes));
        }

        /**
         * @param samls SAML properties
         * 
         * @return builder
         * 
         */
        public Builder samls(@Nullable Output<List<ChildOrganizationSettingSamlArgs>> samls) {
            $.samls = samls;
            return this;
        }

        /**
         * @param samls SAML properties
         * 
         * @return builder
         * 
         */
        public Builder samls(List<ChildOrganizationSettingSamlArgs> samls) {
            return samls(Output.of(samls));
        }

        /**
         * @param samls SAML properties
         * 
         * @return builder
         * 
         */
        public Builder samls(ChildOrganizationSettingSamlArgs... samls) {
            return samls(List.of(samls));
        }

        public ChildOrganizationSettingArgs build() {
            return $;
        }
    }

}