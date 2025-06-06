// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetRoles
    {
        /// <summary>
        /// Use this data source to retrieve information about multiple roles for use in other resources.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Datadog.GetRoles.Invoke(new()
        ///     {
        ///         Filter = "Datadog",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetRolesResult> InvokeAsync(GetRolesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRolesResult>("datadog:index/getRoles:getRoles", args ?? new GetRolesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about multiple roles for use in other resources.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Datadog.GetRoles.Invoke(new()
        ///     {
        ///         Filter = "Datadog",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetRolesResult> Invoke(GetRolesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRolesResult>("datadog:index/getRoles:getRoles", args ?? new GetRolesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about multiple roles for use in other resources.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Datadog.GetRoles.Invoke(new()
        ///     {
        ///         Filter = "Datadog",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetRolesResult> Invoke(GetRolesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRolesResult>("datadog:index/getRoles:getRoles", args ?? new GetRolesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRolesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter all roles by the given string.
        /// </summary>
        [Input("filter")]
        public string? Filter { get; set; }

        public GetRolesArgs()
        {
        }
        public static new GetRolesArgs Empty => new GetRolesArgs();
    }

    public sealed class GetRolesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter all roles by the given string.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        public GetRolesInvokeArgs()
        {
        }
        public static new GetRolesInvokeArgs Empty => new GetRolesInvokeArgs();
    }


    [OutputType]
    public sealed class GetRolesResult
    {
        /// <summary>
        /// Filter all roles by the given string.
        /// </summary>
        public readonly string? Filter;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of Roles
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRolesRoleResult> Roles;

        [OutputConstructor]
        private GetRolesResult(
            string? filter,

            string id,

            ImmutableArray<Outputs.GetRolesRoleResult> roles)
        {
            Filter = filter;
            Id = id;
            Roles = roles;
        }
    }
}
