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
    public sealed class DowntimeScheduleRecurringScheduleRecurrence
    {
        /// <summary>
        /// The length of the downtime. Must begin with an integer and end with one of 'm', 'h', d', or 'w'.
        /// </summary>
        public readonly string Duration;
        /// <summary>
        /// The `RRULE` standard for defining recurring events. For example, to have a recurring event on the first day of each month, set the type to `rrule` and set the `FREQ` to `MONTHLY` and `BYMONTHDAY` to `1`. Most common `rrule` options from the [iCalendar Spec](https://tools.ietf.org/html/rfc5545) are supported.  **Note**: Attributes specifying the duration in `RRULE` are not supported (for example, `DTSTART`, `DTEND`, `DURATION`). More examples available in this [downtime guide](https://docs.datadoghq.com/monitors/guide/suppress-alert-with-downtimes/?tab=api).
        /// </summary>
        public readonly string Rrule;
        /// <summary>
        /// ISO-8601 Datetime to start the downtime. Must not include a UTC offset. If not provided, the downtime starts the moment it is created.
        /// </summary>
        public readonly string? Start;

        [OutputConstructor]
        private DowntimeScheduleRecurringScheduleRecurrence(
            string duration,

            string rrule,

            string? start)
        {
            Duration = duration;
            Rrule = rrule;
            Start = start;
        }
    }
}
