// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Aws.Inputs
{

    public sealed class IntegrationAccountAuthConfigAwsAuthConfigKeysGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS Access Key ID
        /// </summary>
        [Input("accessKeyId")]
        public Input<string>? AccessKeyId { get; set; }

        [Input("secretAccessKey")]
        private Input<string>? _secretAccessKey;
        public Input<string>? SecretAccessKey
        {
            get => _secretAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public IntegrationAccountAuthConfigAwsAuthConfigKeysGetArgs()
        {
        }
        public static new IntegrationAccountAuthConfigAwsAuthConfigKeysGetArgs Empty => new IntegrationAccountAuthConfigAwsAuthConfigKeysGetArgs();
    }
}