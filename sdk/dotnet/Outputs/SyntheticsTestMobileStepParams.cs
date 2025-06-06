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
    public sealed class SyntheticsTestMobileStepParams
    {
        /// <summary>
        /// Check type to use for an assertion step. Valid values are `equals`, `notEquals`, `contains`, `notContains`, `startsWith`, `notStartsWith`, `greater`, `lower`, `greaterEquals`, `lowerEquals`, `matchRegex`, `between`, `isEmpty`, `notIsEmpty`.
        /// </summary>
        public readonly string? Check;
        /// <summary>
        /// Delay between each key stroke for a "type test" step.
        /// </summary>
        public readonly int? Delay;
        /// <summary>
        /// Valid values are `up`, `down`, `left`, `right`.
        /// </summary>
        public readonly string? Direction;
        /// <summary>
        /// Element to use for the step, JSON encoded string.
        /// </summary>
        public readonly Outputs.SyntheticsTestMobileStepParamsElement? Element;
        public readonly bool? Enable;
        public readonly int? MaxScrolls;
        public readonly ImmutableArray<Outputs.SyntheticsTestMobileStepParamsPosition> Positions;
        /// <summary>
        /// ID of the Synthetics test to use as subtest.
        /// </summary>
        public readonly string? SubtestPublicId;
        /// <summary>
        /// Value of the step.
        /// </summary>
        public readonly string? Value;
        /// <summary>
        /// Details of the variable to extract.
        /// </summary>
        public readonly Outputs.SyntheticsTestMobileStepParamsVariable? Variable;
        public readonly bool? WithEnter;
        /// <summary>
        /// X coordinates for a "scroll step".
        /// </summary>
        public readonly double? X;
        /// <summary>
        /// Y coordinates for a "scroll step".
        /// </summary>
        public readonly double? Y;

        [OutputConstructor]
        private SyntheticsTestMobileStepParams(
            string? check,

            int? delay,

            string? direction,

            Outputs.SyntheticsTestMobileStepParamsElement? element,

            bool? enable,

            int? maxScrolls,

            ImmutableArray<Outputs.SyntheticsTestMobileStepParamsPosition> positions,

            string? subtestPublicId,

            string? value,

            Outputs.SyntheticsTestMobileStepParamsVariable? variable,

            bool? withEnter,

            double? x,

            double? y)
        {
            Check = check;
            Delay = delay;
            Direction = direction;
            Element = element;
            Enable = enable;
            MaxScrolls = maxScrolls;
            Positions = positions;
            SubtestPublicId = subtestPublicId;
            Value = value;
            Variable = variable;
            WithEnter = withEnter;
            X = x;
            Y = y;
        }
    }
}
