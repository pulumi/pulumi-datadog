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
    public sealed class SyntheticsTestMobileOptionsList
    {
        public readonly bool? AllowApplicationCrash;
        public readonly ImmutableArray<Outputs.SyntheticsTestMobileOptionsListBinding> Bindings;
        /// <summary>
        /// CI/CD options for a Synthetic test.
        /// </summary>
        public readonly Outputs.SyntheticsTestMobileOptionsListCi? Ci;
        public readonly int? DefaultStepTimeout;
        public readonly ImmutableArray<string> DeviceIds;
        public readonly bool? DisableAutoAcceptAlert;
        /// <summary>
        /// Minimum amount of time in failure required to trigger an alert (in seconds). Default is `0`.
        /// </summary>
        public readonly int? MinFailureDuration;
        public readonly Outputs.SyntheticsTestMobileOptionsListMobileApplication MobileApplication;
        /// <summary>
        /// The monitor name is used for the alert title as well as for all monitor dashboard widgets and SLOs.
        /// </summary>
        public readonly string? MonitorName;
        public readonly Outputs.SyntheticsTestMobileOptionsListMonitorOptions? MonitorOptions;
        public readonly int? MonitorPriority;
        /// <summary>
        /// Prevents saving screenshots of the steps.
        /// </summary>
        public readonly bool? NoScreenshot;
        /// <summary>
        /// A list of role identifiers pulled from the Roles API to restrict read and write access.
        /// </summary>
        public readonly ImmutableArray<string> RestrictedRoles;
        public readonly Outputs.SyntheticsTestMobileOptionsListRetry? Retry;
        /// <summary>
        /// Object containing timeframes and timezone used for advanced scheduling.
        /// </summary>
        public readonly Outputs.SyntheticsTestMobileOptionsListScheduling? Scheduling;
        /// <summary>
        /// How often the test should run (in seconds).
        /// </summary>
        public readonly int TickEvery;
        public readonly int? Verbosity;

        [OutputConstructor]
        private SyntheticsTestMobileOptionsList(
            bool? allowApplicationCrash,

            ImmutableArray<Outputs.SyntheticsTestMobileOptionsListBinding> bindings,

            Outputs.SyntheticsTestMobileOptionsListCi? ci,

            int? defaultStepTimeout,

            ImmutableArray<string> deviceIds,

            bool? disableAutoAcceptAlert,

            int? minFailureDuration,

            Outputs.SyntheticsTestMobileOptionsListMobileApplication mobileApplication,

            string? monitorName,

            Outputs.SyntheticsTestMobileOptionsListMonitorOptions? monitorOptions,

            int? monitorPriority,

            bool? noScreenshot,

            ImmutableArray<string> restrictedRoles,

            Outputs.SyntheticsTestMobileOptionsListRetry? retry,

            Outputs.SyntheticsTestMobileOptionsListScheduling? scheduling,

            int tickEvery,

            int? verbosity)
        {
            AllowApplicationCrash = allowApplicationCrash;
            Bindings = bindings;
            Ci = ci;
            DefaultStepTimeout = defaultStepTimeout;
            DeviceIds = deviceIds;
            DisableAutoAcceptAlert = disableAutoAcceptAlert;
            MinFailureDuration = minFailureDuration;
            MobileApplication = mobileApplication;
            MonitorName = monitorName;
            MonitorOptions = monitorOptions;
            MonitorPriority = monitorPriority;
            NoScreenshot = noScreenshot;
            RestrictedRoles = restrictedRoles;
            Retry = retry;
            Scheduling = scheduling;
            TickEvery = tickEvery;
            Verbosity = verbosity;
        }
    }
}