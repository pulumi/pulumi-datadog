// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class MonitorMonitorThresholdWindows
    {
        /// <summary>
        /// Describes how long an anomalous metric must be normal before the alert recovers.
        /// </summary>
        public readonly string? RecoveryWindow;
        /// <summary>
        /// Describes how long a metric must be anomalous before an alert triggers.
        /// </summary>
        public readonly string? TriggerWindow;

        [OutputConstructor]
        private MonitorMonitorThresholdWindows(
            string? recoveryWindow,

            string? triggerWindow)
        {
            RecoveryWindow = recoveryWindow;
            TriggerWindow = triggerWindow;
        }
    }
}
