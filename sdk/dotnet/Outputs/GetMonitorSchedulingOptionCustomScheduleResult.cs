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
    public sealed class GetMonitorSchedulingOptionCustomScheduleResult
    {
        /// <summary>
        /// A list of recurrence definitions. Length must be 1.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMonitorSchedulingOptionCustomScheduleRecurrenceResult> Recurrences;

        [OutputConstructor]
        private GetMonitorSchedulingOptionCustomScheduleResult(ImmutableArray<Outputs.GetMonitorSchedulingOptionCustomScheduleRecurrenceResult> recurrences)
        {
            Recurrences = recurrences;
        }
    }
}