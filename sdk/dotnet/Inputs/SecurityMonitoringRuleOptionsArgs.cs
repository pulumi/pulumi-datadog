// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SecurityMonitoringRuleOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, signals in non-production environments have a lower severity than what is defined by the rule case, which can reduce noise. The decrement is applied when the environment tag of the signal starts with `staging`, `test`, or `dev`. Only available when the rule type is `log_detection`. Defaults to `false`.
        /// </summary>
        [Input("decreaseCriticalityBasedOnEnv")]
        public Input<bool>? DecreaseCriticalityBasedOnEnv { get; set; }

        /// <summary>
        /// The detection method. Valid values are `threshold`, `new_value`, `anomaly_detection`, `impossible_travel`, `hardcoded`, `third_party`, `anomaly_threshold`. Defaults to `"threshold"`.
        /// </summary>
        [Input("detectionMethod")]
        public Input<string>? DetectionMethod { get; set; }

        /// <summary>
        /// A time window is specified to match when at least one of the cases matches true. This is a sliding window and evaluates in real time. Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
        /// </summary>
        [Input("evaluationWindow")]
        public Input<int>? EvaluationWindow { get; set; }

        /// <summary>
        /// Options for rules using the impossible travel detection method.
        /// </summary>
        [Input("impossibleTravelOptions")]
        public Input<Inputs.SecurityMonitoringRuleOptionsImpossibleTravelOptionsArgs>? ImpossibleTravelOptions { get; set; }

        /// <summary>
        /// Once a signal is generated, the signal will remain “open” if a case is matched at least once within this keep alive window (in seconds). Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
        /// </summary>
        [Input("keepAlive")]
        public Input<int>? KeepAlive { get; set; }

        /// <summary>
        /// A signal will “close” regardless of the query being matched once the time exceeds the maximum duration (in seconds). This time is calculated from the first seen timestamp. Valid values are `0`, `60`, `300`, `600`, `900`, `1800`, `3600`, `7200`, `10800`, `21600`, `43200`, `86400`.
        /// </summary>
        [Input("maxSignalDuration")]
        public Input<int>? MaxSignalDuration { get; set; }

        /// <summary>
        /// New value rules specific options.
        /// </summary>
        [Input("newValueOptions")]
        public Input<Inputs.SecurityMonitoringRuleOptionsNewValueOptionsArgs>? NewValueOptions { get; set; }

        /// <summary>
        /// Options for rules using the third-party detection method.
        /// </summary>
        [Input("thirdPartyRuleOptions")]
        public Input<Inputs.SecurityMonitoringRuleOptionsThirdPartyRuleOptionsArgs>? ThirdPartyRuleOptions { get; set; }

        public SecurityMonitoringRuleOptionsArgs()
        {
        }
        public static new SecurityMonitoringRuleOptionsArgs Empty => new SecurityMonitoringRuleOptionsArgs();
    }
}
