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
    public sealed class SyntheticsTestApiStepRequestClientCertificate
    {
        public readonly Outputs.SyntheticsTestApiStepRequestClientCertificateCert Cert;
        public readonly Outputs.SyntheticsTestApiStepRequestClientCertificateKey Key;

        [OutputConstructor]
        private SyntheticsTestApiStepRequestClientCertificate(
            Outputs.SyntheticsTestApiStepRequestClientCertificateCert cert,

            Outputs.SyntheticsTestApiStepRequestClientCertificateKey key)
        {
            Cert = cert;
            Key = key;
        }
    }
}