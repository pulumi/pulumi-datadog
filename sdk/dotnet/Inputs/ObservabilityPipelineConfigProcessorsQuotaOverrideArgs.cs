// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ObservabilityPipelineConfigProcessorsQuotaOverrideArgs : global::Pulumi.ResourceArgs
    {
        [Input("fields")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsQuotaOverrideFieldArgs>? _fields;

        /// <summary>
        /// Fields that trigger this override.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsQuotaOverrideFieldArgs> Fields
        {
            get => _fields ?? (_fields = new InputList<Inputs.ObservabilityPipelineConfigProcessorsQuotaOverrideFieldArgs>());
            set => _fields = value;
        }

        [Input("limit")]
        public Input<Inputs.ObservabilityPipelineConfigProcessorsQuotaOverrideLimitArgs>? Limit { get; set; }

        public ObservabilityPipelineConfigProcessorsQuotaOverrideArgs()
        {
        }
        public static new ObservabilityPipelineConfigProcessorsQuotaOverrideArgs Empty => new ObservabilityPipelineConfigProcessorsQuotaOverrideArgs();
    }
}
