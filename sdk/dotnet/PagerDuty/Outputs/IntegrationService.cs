// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.PagerDuty.Outputs
{

    [OutputType]
    public sealed class IntegrationService
    {
        /// <summary>
        /// Your Service name associated service key in Pagerduty.
        /// </summary>
        public readonly string ServiceKey;
        /// <summary>
        /// Your Service name in PagerDuty.
        /// </summary>
        public readonly string ServiceName;

        [OutputConstructor]
        private IntegrationService(
            string serviceKey,

            string serviceName)
        {
            ServiceKey = serviceKey;
            ServiceName = serviceName;
        }
    }
}