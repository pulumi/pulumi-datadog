// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class OrganizationSettingsSettings
    {
        /// <summary>
        /// Whether or not the organization users can share widgets outside of Datadog. Defaults to `false`.
        /// </summary>
        public readonly bool? PrivateWidgetShare;
        /// <summary>
        /// SAML properties
        /// </summary>
        public readonly Outputs.OrganizationSettingsSettingsSaml Saml;
        /// <summary>
        /// The access role of the user. Options are `st` (standard user), `adm` (admin user), or `ro` (read-only user). Allowed enum values: `st`, `adm` , `ro`, `ERROR` Defaults to `"st"`.
        /// </summary>
        public readonly string? SamlAutocreateAccessRole;
        /// <summary>
        /// List of domains where the SAML automated user creation is enabled.
        /// </summary>
        public readonly Outputs.OrganizationSettingsSettingsSamlAutocreateUsersDomains SamlAutocreateUsersDomains;
        /// <summary>
        /// Whether or not SAML can be enabled for this organization.
        /// </summary>
        public readonly bool? SamlCanBeEnabled;
        /// <summary>
        /// Identity provider endpoint for SAML authentication.
        /// </summary>
        public readonly string? SamlIdpEndpoint;
        /// <summary>
        /// Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
        /// </summary>
        public readonly Outputs.OrganizationSettingsSettingsSamlIdpInitiatedLogin SamlIdpInitiatedLogin;
        /// <summary>
        /// Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
        /// </summary>
        public readonly bool? SamlIdpMetadataUploaded;
        /// <summary>
        /// URL for SAML logging.
        /// </summary>
        public readonly string? SamlLoginUrl;
        /// <summary>
        /// Whether or not the SAML strict mode is enabled. If true, all users must log in with SAML.
        /// </summary>
        public readonly Outputs.OrganizationSettingsSettingsSamlStrictMode SamlStrictMode;

        [OutputConstructor]
        private OrganizationSettingsSettings(
            bool? privateWidgetShare,

            Outputs.OrganizationSettingsSettingsSaml saml,

            string? samlAutocreateAccessRole,

            Outputs.OrganizationSettingsSettingsSamlAutocreateUsersDomains samlAutocreateUsersDomains,

            bool? samlCanBeEnabled,

            string? samlIdpEndpoint,

            Outputs.OrganizationSettingsSettingsSamlIdpInitiatedLogin samlIdpInitiatedLogin,

            bool? samlIdpMetadataUploaded,

            string? samlLoginUrl,

            Outputs.OrganizationSettingsSettingsSamlStrictMode samlStrictMode)
        {
            PrivateWidgetShare = privateWidgetShare;
            Saml = saml;
            SamlAutocreateAccessRole = samlAutocreateAccessRole;
            SamlAutocreateUsersDomains = samlAutocreateUsersDomains;
            SamlCanBeEnabled = samlCanBeEnabled;
            SamlIdpEndpoint = samlIdpEndpoint;
            SamlIdpInitiatedLogin = samlIdpInitiatedLogin;
            SamlIdpMetadataUploaded = samlIdpMetadataUploaded;
            SamlLoginUrl = samlLoginUrl;
            SamlStrictMode = samlStrictMode;
        }
    }
}