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
    public sealed class ChildOrganizationSetting
    {
        /// <summary>
        /// Whether or not the organization users can share widgets outside of Datadog.
        /// </summary>
        public readonly bool? PrivateWidgetShare;
        /// <summary>
        /// The access role of the user. Options are `st` (standard user), `adm` (admin user), or `ro` (read-only user). Allowed enum values: `st`, `adm` , `ro`, `ERROR`
        /// </summary>
        public readonly string? SamlAutocreateAccessRole;
        /// <summary>
        /// List of domains where the SAML automated user creation is enabled.
        /// </summary>
        public readonly ImmutableArray<Outputs.ChildOrganizationSettingSamlAutocreateUsersDomain> SamlAutocreateUsersDomains;
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
        public readonly ImmutableArray<Outputs.ChildOrganizationSettingSamlIdpInitiatedLogin> SamlIdpInitiatedLogins;
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
        public readonly ImmutableArray<Outputs.ChildOrganizationSettingSamlStrictMode> SamlStrictModes;
        /// <summary>
        /// SAML properties
        /// </summary>
        public readonly ImmutableArray<Outputs.ChildOrganizationSettingSaml> Samls;

        [OutputConstructor]
        private ChildOrganizationSetting(
            bool? privateWidgetShare,

            string? samlAutocreateAccessRole,

            ImmutableArray<Outputs.ChildOrganizationSettingSamlAutocreateUsersDomain> samlAutocreateUsersDomains,

            bool? samlCanBeEnabled,

            string? samlIdpEndpoint,

            ImmutableArray<Outputs.ChildOrganizationSettingSamlIdpInitiatedLogin> samlIdpInitiatedLogins,

            bool? samlIdpMetadataUploaded,

            string? samlLoginUrl,

            ImmutableArray<Outputs.ChildOrganizationSettingSamlStrictMode> samlStrictModes,

            ImmutableArray<Outputs.ChildOrganizationSettingSaml> samls)
        {
            PrivateWidgetShare = privateWidgetShare;
            SamlAutocreateAccessRole = samlAutocreateAccessRole;
            SamlAutocreateUsersDomains = samlAutocreateUsersDomains;
            SamlCanBeEnabled = samlCanBeEnabled;
            SamlIdpEndpoint = samlIdpEndpoint;
            SamlIdpInitiatedLogins = samlIdpInitiatedLogins;
            SamlIdpMetadataUploaded = samlIdpMetadataUploaded;
            SamlLoginUrl = samlLoginUrl;
            SamlStrictModes = samlStrictModes;
            Samls = samls;
        }
    }
}