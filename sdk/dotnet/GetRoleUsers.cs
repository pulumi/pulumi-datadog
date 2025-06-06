// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetRoleUsers
    {
        /// <summary>
        /// Use this data source to retrieve information about existing Datadog role users assignments. This data source is in beta and is subject to change.
        /// </summary>
        public static Task<GetRoleUsersResult> InvokeAsync(GetRoleUsersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRoleUsersResult>("datadog:index/getRoleUsers:getRoleUsers", args ?? new GetRoleUsersArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about existing Datadog role users assignments. This data source is in beta and is subject to change.
        /// </summary>
        public static Output<GetRoleUsersResult> Invoke(GetRoleUsersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRoleUsersResult>("datadog:index/getRoleUsers:getRoleUsers", args ?? new GetRoleUsersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about existing Datadog role users assignments. This data source is in beta and is subject to change.
        /// </summary>
        public static Output<GetRoleUsersResult> Invoke(GetRoleUsersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRoleUsersResult>("datadog:index/getRoleUsers:getRoleUsers", args ?? new GetRoleUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRoleUsersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// When true, `filter_keyword` string is exact matched against the user's `name`.
        /// </summary>
        [Input("exactMatch")]
        public bool? ExactMatch { get; set; }

        /// <summary>
        /// Search query, can be user name.
        /// </summary>
        [Input("filter")]
        public string? Filter { get; set; }

        /// <summary>
        /// The role's identifier.
        /// </summary>
        [Input("roleId", required: true)]
        public string RoleId { get; set; } = null!;

        public GetRoleUsersArgs()
        {
        }
        public static new GetRoleUsersArgs Empty => new GetRoleUsersArgs();
    }

    public sealed class GetRoleUsersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// When true, `filter_keyword` string is exact matched against the user's `name`.
        /// </summary>
        [Input("exactMatch")]
        public Input<bool>? ExactMatch { get; set; }

        /// <summary>
        /// Search query, can be user name.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// The role's identifier.
        /// </summary>
        [Input("roleId", required: true)]
        public Input<string> RoleId { get; set; } = null!;

        public GetRoleUsersInvokeArgs()
        {
        }
        public static new GetRoleUsersInvokeArgs Empty => new GetRoleUsersInvokeArgs();
    }


    [OutputType]
    public sealed class GetRoleUsersResult
    {
        /// <summary>
        /// When true, `filter_keyword` string is exact matched against the user's `name`.
        /// </summary>
        public readonly bool? ExactMatch;
        /// <summary>
        /// Search query, can be user name.
        /// </summary>
        public readonly string? Filter;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The role's identifier.
        /// </summary>
        public readonly string RoleId;
        /// <summary>
        /// List of users assigned to role.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRoleUsersRoleUserResult> RoleUsers;

        [OutputConstructor]
        private GetRoleUsersResult(
            bool? exactMatch,

            string? filter,

            string id,

            string roleId,

            ImmutableArray<Outputs.GetRoleUsersRoleUserResult> roleUsers)
        {
            ExactMatch = exactMatch;
            Filter = filter;
            Id = id;
            RoleId = roleId;
            RoleUsers = roleUsers;
        }
    }
}
