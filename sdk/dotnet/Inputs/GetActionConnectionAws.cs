// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class GetActionConnectionAwsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Configuration for an assume role AWS connection
        /// </summary>
        [Input("assumeRole")]
        public Inputs.GetActionConnectionAwsAssumeRoleArgs? AssumeRole { get; set; }

        public GetActionConnectionAwsArgs()
        {
        }
        public static new GetActionConnectionAwsArgs Empty => new GetActionConnectionAwsArgs();
    }
}
