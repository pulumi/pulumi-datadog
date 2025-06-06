// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetSyntheticsGlobalVariable
    {
        /// <summary>
        /// Use this data source to retrieve a Datadog Synthetics global variable (to be used in Synthetics tests).
        /// </summary>
        public static Task<GetSyntheticsGlobalVariableResult> InvokeAsync(GetSyntheticsGlobalVariableArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSyntheticsGlobalVariableResult>("datadog:index/getSyntheticsGlobalVariable:getSyntheticsGlobalVariable", args ?? new GetSyntheticsGlobalVariableArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve a Datadog Synthetics global variable (to be used in Synthetics tests).
        /// </summary>
        public static Output<GetSyntheticsGlobalVariableResult> Invoke(GetSyntheticsGlobalVariableInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSyntheticsGlobalVariableResult>("datadog:index/getSyntheticsGlobalVariable:getSyntheticsGlobalVariable", args ?? new GetSyntheticsGlobalVariableInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve a Datadog Synthetics global variable (to be used in Synthetics tests).
        /// </summary>
        public static Output<GetSyntheticsGlobalVariableResult> Invoke(GetSyntheticsGlobalVariableInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSyntheticsGlobalVariableResult>("datadog:index/getSyntheticsGlobalVariable:getSyntheticsGlobalVariable", args ?? new GetSyntheticsGlobalVariableInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSyntheticsGlobalVariableArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The synthetics global variable name to search for. Must only match one global variable.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetSyntheticsGlobalVariableArgs()
        {
        }
        public static new GetSyntheticsGlobalVariableArgs Empty => new GetSyntheticsGlobalVariableArgs();
    }

    public sealed class GetSyntheticsGlobalVariableInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The synthetics global variable name to search for. Must only match one global variable.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetSyntheticsGlobalVariableInvokeArgs()
        {
        }
        public static new GetSyntheticsGlobalVariableInvokeArgs Empty => new GetSyntheticsGlobalVariableInvokeArgs();
    }


    [OutputType]
    public sealed class GetSyntheticsGlobalVariableResult
    {
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The synthetics global variable name to search for. Must only match one global variable.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A list of tags assigned to the Synthetics global variable.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetSyntheticsGlobalVariableResult(
            string id,

            string name,

            ImmutableArray<string> tags)
        {
            Id = id;
            Name = name;
            Tags = tags;
        }
    }
}
