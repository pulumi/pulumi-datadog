// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    /// <summary>
    /// Provides a Datadog AuthN Mappings resource. This feature lets you automatically assign roles to users based on their SAML attributes.
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
    ///     // Source the role
    ///     var roRole = Datadog.GetRole.Invoke(new()
    ///     {
    ///         Filter = "Datadog Read Only Role",
    ///     });
    /// 
    ///     // Create a new AuthN mapping
    ///     var devRoRoleMapping = new Datadog.AuthnMapping("dev_ro_role_mapping", new()
    ///     {
    ///         Key = "Member-of",
    ///         Value = "Development",
    ///         Role = roRole.Apply(getRoleResult =&gt; getRoleResult.Id),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// AuthN mappings can be imported using their ID, e.g.
    /// 
    /// ```sh
    /// $ pulumi import datadog:index/authnMapping:AuthnMapping dev_ro_mapping 000000-0000-0000-0000-000000000000
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/authnMapping:AuthnMapping")]
    public partial class AuthnMapping : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Identity provider key.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// The ID of a role to attach to all users with the corresponding key and value. Cannot be used in conjunction with `team`.
        /// </summary>
        [Output("role")]
        public Output<string?> Role { get; private set; } = null!;

        /// <summary>
        /// The ID of a team to add all users with the corresponding key and value to. Cannot be used in conjunction with `role`.
        /// </summary>
        [Output("team")]
        public Output<string?> Team { get; private set; } = null!;

        /// <summary>
        /// Identity provider value.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a AuthnMapping resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthnMapping(string name, AuthnMappingArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/authnMapping:AuthnMapping", name, args ?? new AuthnMappingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AuthnMapping(string name, Input<string> id, AuthnMappingState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/authnMapping:AuthnMapping", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AuthnMapping resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthnMapping Get(string name, Input<string> id, AuthnMappingState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthnMapping(name, id, state, options);
        }
    }

    public sealed class AuthnMappingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identity provider key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The ID of a role to attach to all users with the corresponding key and value. Cannot be used in conjunction with `team`.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// The ID of a team to add all users with the corresponding key and value to. Cannot be used in conjunction with `role`.
        /// </summary>
        [Input("team")]
        public Input<string>? Team { get; set; }

        /// <summary>
        /// Identity provider value.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public AuthnMappingArgs()
        {
        }
        public static new AuthnMappingArgs Empty => new AuthnMappingArgs();
    }

    public sealed class AuthnMappingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identity provider key.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The ID of a role to attach to all users with the corresponding key and value. Cannot be used in conjunction with `team`.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// The ID of a team to add all users with the corresponding key and value to. Cannot be used in conjunction with `role`.
        /// </summary>
        [Input("team")]
        public Input<string>? Team { get; set; }

        /// <summary>
        /// Identity provider value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public AuthnMappingState()
        {
        }
        public static new AuthnMappingState Empty => new AuthnMappingState();
    }
}
