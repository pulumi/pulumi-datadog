// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class RestrictionPolicyBindingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("principals", required: true)]
        private InputList<string>? _principals;

        /// <summary>
        /// An array of principals. A principal is a subject or group of subjects. Each principal is formatted as `type:id`. Supported types: `role` and `org`. The org ID can be obtained through the api/v2/users API.
        /// </summary>
        public InputList<string> Principals
        {
            get => _principals ?? (_principals = new InputList<string>());
            set => _principals = value;
        }

        /// <summary>
        /// The role/level of access. See this page for more details https://docs.datadoghq.com/api/latest/restriction-policies/#supported-relations-for-resources
        /// </summary>
        [Input("relation", required: true)]
        public Input<string> Relation { get; set; } = null!;

        public RestrictionPolicyBindingGetArgs()
        {
        }
        public static new RestrictionPolicyBindingGetArgs Empty => new RestrictionPolicyBindingGetArgs();
    }
}