// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class OrganizationSettingsSettingsSamlAutocreateUsersDomainsGetArgs : Pulumi.ResourceArgs
    {
        [Input("domains")]
        private InputList<string>? _domains;
        public InputList<string> Domains
        {
            get => _domains ?? (_domains = new InputList<string>());
            set => _domains = value;
        }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public OrganizationSettingsSettingsSamlAutocreateUsersDomainsGetArgs()
        {
        }
    }
}