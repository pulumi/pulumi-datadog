// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ChildOrganizationApplicationKeyArgs : global::Pulumi.ResourceArgs
    {
        [Input("hash")]
        private Input<string>? _hash;

        /// <summary>
        /// Hash of an application key.
        /// </summary>
        public Input<string>? Hash
        {
            get => _hash;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _hash = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Name of an application key.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Owner of an application key.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        public ChildOrganizationApplicationKeyArgs()
        {
        }
        public static new ChildOrganizationApplicationKeyArgs Empty => new ChildOrganizationApplicationKeyArgs();
    }
}
