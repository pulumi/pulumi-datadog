// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SyntheticsTestRequestClientCertificateKeyArgs : global::Pulumi.ResourceArgs
    {
        [Input("content", required: true)]
        private Input<string>? _content;

        /// <summary>
        /// Content of the certificate.
        /// </summary>
        public Input<string>? Content
        {
            get => _content;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _content = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// File name for the certificate.
        /// </summary>
        [Input("filename")]
        public Input<string>? Filename { get; set; }

        public SyntheticsTestRequestClientCertificateKeyArgs()
        {
        }
        public static new SyntheticsTestRequestClientCertificateKeyArgs Empty => new SyntheticsTestRequestClientCertificateKeyArgs();
    }
}