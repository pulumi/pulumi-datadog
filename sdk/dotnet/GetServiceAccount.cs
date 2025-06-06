// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetServiceAccount
    {
        /// <summary>
        /// Use this data source to retrieve information about an existing Datadog service account.
        /// </summary>
        public static Task<GetServiceAccountResult> InvokeAsync(GetServiceAccountArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceAccountResult>("datadog:index/getServiceAccount:getServiceAccount", args ?? new GetServiceAccountArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about an existing Datadog service account.
        /// </summary>
        public static Output<GetServiceAccountResult> Invoke(GetServiceAccountInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceAccountResult>("datadog:index/getServiceAccount:getServiceAccount", args ?? new GetServiceAccountInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about an existing Datadog service account.
        /// </summary>
        public static Output<GetServiceAccountResult> Invoke(GetServiceAccountInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceAccountResult>("datadog:index/getServiceAccount:getServiceAccount", args ?? new GetServiceAccountInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceAccountArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// When true, `filter` string is exact matched against the user's `email`, followed by `name` attribute.
        /// </summary>
        [Input("exactMatch")]
        public bool? ExactMatch { get; set; }

        /// <summary>
        /// Filter all users and service accounts by name, email, or role.
        /// </summary>
        [Input("filter")]
        public string? Filter { get; set; }

        /// <summary>
        /// Filter on status attribute. Comma separated list, with possible values `Active`, `Pending`, and `Disabled`.
        /// </summary>
        [Input("filterStatus")]
        public string? FilterStatus { get; set; }

        /// <summary>
        /// The service account's ID.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetServiceAccountArgs()
        {
        }
        public static new GetServiceAccountArgs Empty => new GetServiceAccountArgs();
    }

    public sealed class GetServiceAccountInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// When true, `filter` string is exact matched against the user's `email`, followed by `name` attribute.
        /// </summary>
        [Input("exactMatch")]
        public Input<bool>? ExactMatch { get; set; }

        /// <summary>
        /// Filter all users and service accounts by name, email, or role.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// Filter on status attribute. Comma separated list, with possible values `Active`, `Pending`, and `Disabled`.
        /// </summary>
        [Input("filterStatus")]
        public Input<string>? FilterStatus { get; set; }

        /// <summary>
        /// The service account's ID.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetServiceAccountInvokeArgs()
        {
        }
        public static new GetServiceAccountInvokeArgs Empty => new GetServiceAccountInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceAccountResult
    {
        /// <summary>
        /// Whether the user is disabled.
        /// </summary>
        public readonly bool Disabled;
        /// <summary>
        /// Email of the user.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// When true, `filter` string is exact matched against the user's `email`, followed by `name` attribute.
        /// </summary>
        public readonly bool? ExactMatch;
        /// <summary>
        /// Filter all users and service accounts by name, email, or role.
        /// </summary>
        public readonly string? Filter;
        /// <summary>
        /// Filter on status attribute. Comma separated list, with possible values `Active`, `Pending`, and `Disabled`.
        /// </summary>
        public readonly string? FilterStatus;
        /// <summary>
        /// Handle of the user.
        /// </summary>
        public readonly string Handle;
        /// <summary>
        /// URL of the user's icon.
        /// </summary>
        public readonly string Icon;
        /// <summary>
        /// The service account's ID.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the user.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Roles assigned to this service account.
        /// </summary>
        public readonly ImmutableArray<string> Roles;
        /// <summary>
        /// Status of the user.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Title of the user.
        /// </summary>
        public readonly string Title;
        /// <summary>
        /// Whether the user is verified.
        /// </summary>
        public readonly bool Verified;

        [OutputConstructor]
        private GetServiceAccountResult(
            bool disabled,

            string email,

            bool? exactMatch,

            string? filter,

            string? filterStatus,

            string handle,

            string icon,

            string id,

            string name,

            ImmutableArray<string> roles,

            string status,

            string title,

            bool verified)
        {
            Disabled = disabled;
            Email = email;
            ExactMatch = exactMatch;
            Filter = filter;
            FilterStatus = filterStatus;
            Handle = handle;
            Icon = icon;
            Id = id;
            Name = name;
            Roles = roles;
            Status = status;
            Title = title;
            Verified = verified;
        }
    }
}
