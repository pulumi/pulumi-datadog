// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SyntheticsTestMobileOptionsListCiArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Execution rule for a Synthetics test. Valid values are `blocking`, `non_blocking`, `skipped`.
        /// </summary>
        [Input("executionRule", required: true)]
        public Input<string> ExecutionRule { get; set; } = null!;

        public SyntheticsTestMobileOptionsListCiArgs()
        {
        }
        public static new SyntheticsTestMobileOptionsListCiArgs Empty => new SyntheticsTestMobileOptionsListCiArgs();
    }
}