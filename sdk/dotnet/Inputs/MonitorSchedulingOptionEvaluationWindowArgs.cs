// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class MonitorSchedulingOptionEvaluationWindowArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time of the day at which a one day cumulative evaluation window starts. Must be defined in UTC time in `HH:mm` format.
        /// </summary>
        [Input("dayStarts")]
        public Input<string>? DayStarts { get; set; }

        /// <summary>
        /// The minute of the hour at which a one hour cumulative evaluation window starts. Must be between 0 and 59.
        /// </summary>
        [Input("hourStarts")]
        public Input<int>? HourStarts { get; set; }

        /// <summary>
        /// The day of the month at which a one month cumulative evaluation window starts. Must be a value of 1.
        /// </summary>
        [Input("monthStarts")]
        public Input<int>? MonthStarts { get; set; }

        public MonitorSchedulingOptionEvaluationWindowArgs()
        {
        }
        public static new MonitorSchedulingOptionEvaluationWindowArgs Empty => new MonitorSchedulingOptionEvaluationWindowArgs();
    }
}