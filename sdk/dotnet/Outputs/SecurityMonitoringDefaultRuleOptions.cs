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
    public sealed class SecurityMonitoringDefaultRuleOptions
    {
        /// <summary>
        /// If true, signals in non-production environments have a lower severity than what is defined by the rule case, which can reduce noise. The decrement is applied when the environment tag of the signal starts with `staging`, `test`, or `dev`. Only available when the rule type is `log_detection`. Defaults to `false`.
        /// </summary>
        public readonly bool? DecreaseCriticalityBasedOnEnv;

        [OutputConstructor]
        private SecurityMonitoringDefaultRuleOptions(bool? decreaseCriticalityBasedOnEnv)
        {
            DecreaseCriticalityBasedOnEnv = decreaseCriticalityBasedOnEnv;
        }
    }
}