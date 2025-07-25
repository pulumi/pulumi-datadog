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
    /// Provides a Datadog Application Key resource. This can be used to create and manage Datadog Application Keys. Import functionality for this resource is deprecated and will be removed in a future release with prior notice. Securely store your application keys using a secret management system or use this resource to create and manage new application keys.
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
    ///     // Create a new Datadog Application Key
    ///     var foo = new Datadog.ApplicationKey("foo", new()
    ///     {
    ///         Name = "foo-application",
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
    /// $ pulumi import datadog:index/applicationKey:ApplicationKey foo 11111111-2222-3333-4444-555555555555
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/applicationKey:ApplicationKey")]
    public partial class ApplicationKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The value of the Application Key.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// Name for Application Key.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Authorization scopes for the Application Key. Application Keys configured with no scopes have full access.
        /// </summary>
        [Output("scopes")]
        public Output<ImmutableArray<string>> Scopes { get; private set; } = null!;


        /// <summary>
        /// Create a ApplicationKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApplicationKey(string name, ApplicationKeyArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/applicationKey:ApplicationKey", name, args ?? new ApplicationKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApplicationKey(string name, Input<string> id, ApplicationKeyState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/applicationKey:ApplicationKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "key",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ApplicationKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApplicationKey Get(string name, Input<string> id, ApplicationKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new ApplicationKey(name, id, state, options);
        }
    }

    public sealed class ApplicationKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name for Application Key.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// Authorization scopes for the Application Key. Application Keys configured with no scopes have full access.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        public ApplicationKeyArgs()
        {
        }
        public static new ApplicationKeyArgs Empty => new ApplicationKeyArgs();
    }

    public sealed class ApplicationKeyState : global::Pulumi.ResourceArgs
    {
        [Input("key")]
        private Input<string>? _key;

        /// <summary>
        /// The value of the Application Key.
        /// </summary>
        public Input<string>? Key
        {
            get => _key;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _key = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Name for Application Key.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// Authorization scopes for the Application Key. Application Keys configured with no scopes have full access.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        public ApplicationKeyState()
        {
        }
        public static new ApplicationKeyState Empty => new ApplicationKeyState();
    }
}
