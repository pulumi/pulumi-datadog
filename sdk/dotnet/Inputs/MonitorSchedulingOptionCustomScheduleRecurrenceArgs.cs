// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class MonitorSchedulingOptionCustomScheduleRecurrenceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Must be a valid `rrule`. See API docs for supported fields
        /// </summary>
        [Input("rrule", required: true)]
        public Input<string> Rrule { get; set; } = null!;

        /// <summary>
        /// Time to start recurrence cycle. Similar to DTSTART. Expected format 'YYYY-MM-DDThh:mm:ss'
        /// </summary>
        [Input("start")]
        public Input<string>? Start { get; set; }

        /// <summary>
        /// 'tz database' format. Example: `America/New_York` or `UTC`
        /// </summary>
        [Input("timezone", required: true)]
        public Input<string> Timezone { get; set; } = null!;

        public MonitorSchedulingOptionCustomScheduleRecurrenceArgs()
        {
        }
        public static new MonitorSchedulingOptionCustomScheduleRecurrenceArgs Empty => new MonitorSchedulingOptionCustomScheduleRecurrenceArgs();
    }
}