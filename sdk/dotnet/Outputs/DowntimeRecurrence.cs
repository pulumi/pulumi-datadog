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
    public sealed class DowntimeRecurrence
    {
        /// <summary>
        /// How often to repeat as an integer. For example to repeat every 3 days, select a `type` of `days` and a `period` of `3`.
        /// </summary>
        public readonly int? Period;
        /// <summary>
        /// The RRULE standard for defining recurring events. For example, to have a recurring event on the first day of each month, use `FREQ=MONTHLY;INTERVAL=1`. Most common rrule options from the iCalendar Spec are supported. Attributes specifying the duration in RRULE are not supported (for example, `DTSTART`, `DTEND`, `DURATION`). Only applicable when `type` is `rrule`.
        /// </summary>
        public readonly string? Rrule;
        /// <summary>
        /// One of `days`, `weeks`, `months`, `years`, or `rrule`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The date at which the recurrence should end as a POSIX timestamp. `until_occurrences` and `until_date` are mutually exclusive.
        /// </summary>
        public readonly int? UntilDate;
        /// <summary>
        /// How many times the downtime will be rescheduled. `until_occurrences` and `until_date` are mutually exclusive.
        /// </summary>
        public readonly int? UntilOccurrences;
        /// <summary>
        /// A list of week days to repeat on. Choose from: `Mon`, `Tue`, `Wed`, `Thu`, `Fri`, `Sat` or `Sun`. Only applicable when `type` is `weeks`. First letter must be capitalized.
        /// </summary>
        public readonly ImmutableArray<string> WeekDays;

        [OutputConstructor]
        private DowntimeRecurrence(
            int? period,

            string? rrule,

            string type,

            int? untilDate,

            int? untilOccurrences,

            ImmutableArray<string> weekDays)
        {
            Period = period;
            Rrule = rrule;
            Type = type;
            UntilDate = untilDate;
            UntilOccurrences = untilOccurrences;
            WeekDays = weekDays;
        }
    }
}
