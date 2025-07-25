// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class OnCallEscalationPolicyStepArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies how this escalation step will assign targets. Can be `default` (page all targets at once) or `round-robin`. Valid values are `default`, `round-robin`. Defaults to `"default"`.
        /// </summary>
        [Input("assignment")]
        public Input<string>? Assignment { get; set; }

        /// <summary>
        /// Defines how many seconds to wait before escalating to the next step. Value must be between 60 and 36000.
        /// </summary>
        [Input("escalateAfterSeconds", required: true)]
        public Input<int> EscalateAfterSeconds { get; set; } = null!;

        /// <summary>
        /// The ID of this step.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("targets", required: true)]
        private InputList<Inputs.OnCallEscalationPolicyStepTargetArgs>? _targets;

        /// <summary>
        /// List of targets for the step.
        /// </summary>
        public InputList<Inputs.OnCallEscalationPolicyStepTargetArgs> Targets
        {
            get => _targets ?? (_targets = new InputList<Inputs.OnCallEscalationPolicyStepTargetArgs>());
            set => _targets = value;
        }

        public OnCallEscalationPolicyStepArgs()
        {
        }
        public static new OnCallEscalationPolicyStepArgs Empty => new OnCallEscalationPolicyStepArgs();
    }
}
