// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetUser
    {
        /// <summary>
        /// Use this data source to retrieve information about an existing user to use it in an other resources.
        /// </summary>
        public static Task<GetUserResult> InvokeAsync(GetUserArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("datadog:index/getUser:getUser", args ?? new GetUserArgs(), options.WithVersion());
    }


    public sealed class GetUserArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter all users by the given string.
        /// </summary>
        [Input("filter", required: true)]
        public string Filter { get; set; } = null!;

        public GetUserArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetUserResult
    {
        /// <summary>
        /// Email of the user.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// Filter all users by the given string.
        /// </summary>
        public readonly string Filter;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the user.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetUserResult(
            string email,

            string filter,

            string id,

            string name)
        {
            Email = email;
            Filter = filter;
            Id = id;
            Name = name;
        }
    }
}