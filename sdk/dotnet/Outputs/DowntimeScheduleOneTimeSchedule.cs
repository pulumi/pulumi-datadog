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
    public sealed class DowntimeScheduleOneTimeSchedule
    {
        /// <summary>
        /// ISO-8601 Datetime to end the downtime. Must include a UTC offset of zero. If not provided, the downtime never ends.
        /// </summary>
        public readonly string? End;
        /// <summary>
        /// ISO-8601 Datetime to start the downtime. Must include a UTC offset of zero. If not provided, the downtime starts the moment it is created.
        /// </summary>
        public readonly string? Start;

        [OutputConstructor]
        private DowntimeScheduleOneTimeSchedule(
            string? end,

            string? start)
        {
            End = end;
            Start = start;
        }
    }
}
