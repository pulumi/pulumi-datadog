// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SyntheticsGlobalVariableOptionsTotpParametersGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of digits for the OTP.
        /// </summary>
        [Input("digits", required: true)]
        public Input<int> Digits { get; set; } = null!;

        /// <summary>
        /// Interval for which to refresh the token (in seconds).
        /// </summary>
        [Input("refreshInterval", required: true)]
        public Input<int> RefreshInterval { get; set; } = null!;

        public SyntheticsGlobalVariableOptionsTotpParametersGetArgs()
        {
        }
        public static new SyntheticsGlobalVariableOptionsTotpParametersGetArgs Empty => new SyntheticsGlobalVariableOptionsTotpParametersGetArgs();
    }
}