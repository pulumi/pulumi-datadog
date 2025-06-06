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
    public sealed class SecurityMonitoringRuleOptionsNewValueOptions
    {
        /// <summary>
        /// The duration in days after which a learned value is forgotten. Valid values are `1`, `2`, `7`, `14`, `21`, `28`.
        /// </summary>
        public readonly int ForgetAfter;
        /// <summary>
        /// The duration in days during which values are learned, and after which signals will be generated for values that weren't learned. If set to 0, a signal will be generated for all new values after the first value is learned. Valid values are `0`, `1`, `7`. Defaults to `1`.
        /// </summary>
        public readonly int? LearningDuration;
        /// <summary>
        /// The learning method used to determine when signals should be generated for values that weren't learned. Valid values are `duration`, `threshold`. Defaults to `"duration"`.
        /// </summary>
        public readonly string? LearningMethod;
        /// <summary>
        /// A number of occurrences after which signals are generated for values that weren't learned. Valid values are `0`, `1`. Defaults to `0`.
        /// </summary>
        public readonly int? LearningThreshold;

        [OutputConstructor]
        private SecurityMonitoringRuleOptionsNewValueOptions(
            int forgetAfter,

            int? learningDuration,

            string? learningMethod,

            int? learningThreshold)
        {
            ForgetAfter = forgetAfter;
            LearningDuration = learningDuration;
            LearningMethod = learningMethod;
            LearningThreshold = learningThreshold;
        }
    }
}
