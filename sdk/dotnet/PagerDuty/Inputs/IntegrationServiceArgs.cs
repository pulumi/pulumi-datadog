// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.PagerDuty.Inputs
{

    public sealed class IntegrationServiceArgs : Pulumi.ResourceArgs
    {
        [Input("serviceKey", required: true)]
        public Input<string> ServiceKey { get; set; } = null!;

        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public IntegrationServiceArgs()
        {
        }
    }
}
