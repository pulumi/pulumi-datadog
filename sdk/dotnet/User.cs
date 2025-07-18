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
    /// Provides a Datadog user resource. This can be used to create and manage Datadog users.
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
    ///     // Source a role
    ///     var roRole = Datadog.GetRole.Invoke(new()
    ///     {
    ///         Filter = "Datadog Read Only Role",
    ///     });
    /// 
    ///     // Create a new Datadog user
    ///     var foo = new Datadog.User("foo", new()
    ///     {
    ///         Email = "new@example.com",
    ///         Roles = new[]
    ///         {
    ///             roRole.Apply(getRoleResult =&gt; getRoleResult.Id),
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// ```sh
    /// $ pulumi import datadog:index/user:User example_user 6f1b44c0-30b2-11eb-86bc-279f7c1ebaa4
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/user:User")]
    public partial class User : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether the user is disabled. Defaults to `false`.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// Email address for user.
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// User's name. Should be set only for password authentication, as it is overridden by Google or SAML authentication.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of role IDs to assign to the user.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<string>> Roles { get; private set; } = null!;

        /// <summary>
        /// Whether an invitation email should be sent when the user is created. Defaults to `true`.
        /// </summary>
        [Output("sendUserInvitation")]
        public Output<bool?> SendUserInvitation { get; private set; } = null!;

        /// <summary>
        /// The ID of the user invitation that was sent when creating the user.
        /// </summary>
        [Output("userInvitationId")]
        public Output<string> UserInvitationId { get; private set; } = null!;

        /// <summary>
        /// Returns `true` if the user is verified.
        /// </summary>
        [Output("verified")]
        public Output<bool> Verified { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/user:User", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the user is disabled. Defaults to `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Email address for user.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// User's name. Should be set only for password authentication, as it is overridden by Google or SAML authentication.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// A list of role IDs to assign to the user.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// Whether an invitation email should be sent when the user is created. Defaults to `true`.
        /// </summary>
        [Input("sendUserInvitation")]
        public Input<bool>? SendUserInvitation { get; set; }

        public UserArgs()
        {
        }
        public static new UserArgs Empty => new UserArgs();
    }

    public sealed class UserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the user is disabled. Defaults to `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Email address for user.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// User's name. Should be set only for password authentication, as it is overridden by Google or SAML authentication.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// A list of role IDs to assign to the user.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// Whether an invitation email should be sent when the user is created. Defaults to `true`.
        /// </summary>
        [Input("sendUserInvitation")]
        public Input<bool>? SendUserInvitation { get; set; }

        /// <summary>
        /// The ID of the user invitation that was sent when creating the user.
        /// </summary>
        [Input("userInvitationId")]
        public Input<string>? UserInvitationId { get; set; }

        /// <summary>
        /// Returns `true` if the user is verified.
        /// </summary>
        [Input("verified")]
        public Input<bool>? Verified { get; set; }

        public UserState()
        {
        }
        public static new UserState Empty => new UserState();
    }
}
