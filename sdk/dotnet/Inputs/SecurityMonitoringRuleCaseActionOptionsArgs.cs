// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SecurityMonitoringRuleCaseActionOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Duration of the action in seconds.
        /// </summary>
        [Input("duration")]
        public Input<int>? Duration { get; set; }

        public SecurityMonitoringRuleCaseActionOptionsArgs()
        {
        }
        public static new SecurityMonitoringRuleCaseActionOptionsArgs Empty => new SecurityMonitoringRuleCaseActionOptionsArgs();
    }
}
