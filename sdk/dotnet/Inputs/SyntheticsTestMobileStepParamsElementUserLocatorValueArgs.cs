// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SyntheticsTestMobileStepParamsElementUserLocatorValueArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Valid values are `accessibility-id`, `id`, `ios-predicate-string`, `ios-class-chain`, `xpath`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public SyntheticsTestMobileStepParamsElementUserLocatorValueArgs()
        {
        }
        public static new SyntheticsTestMobileStepParamsElementUserLocatorValueArgs Empty => new SyntheticsTestMobileStepParamsElementUserLocatorValueArgs();
    }
}