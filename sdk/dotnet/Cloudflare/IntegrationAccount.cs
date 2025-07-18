// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Cloudflare
{
    /// <summary>
    /// Provides a Datadog IntegrationCloudflareAccount resource. This can be used to create and manage Datadog integration_cloudflare_account.
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
    ///     // Create new integration_cloudflare_account resource
    ///     var foo = new Datadog.Cloudflare.IntegrationAccount("foo", new()
    ///     {
    ///         ApiKey = "12345678910abc",
    ///         Email = "test-email@example.com",
    ///         Name = "test-name",
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
    /// $ pulumi import datadog:cloudflare/integrationAccount:IntegrationAccount new_list "&lt;ID&gt;"
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:cloudflare/integrationAccount:IntegrationAccount")]
    public partial class IntegrationAccount : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The API key (or token) for the Cloudflare account.
        /// </summary>
        [Output("apiKey")]
        public Output<string> ApiKey { get; private set; } = null!;

        /// <summary>
        /// The email associated with the Cloudflare account. If an API key is provided (and not a token), this field is also required.
        /// </summary>
        [Output("email")]
        public Output<string?> Email { get; private set; } = null!;

        /// <summary>
        /// The name of the Cloudflare account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// An allowlist of resources to pull metrics for. Includes `web`, `dns`, `lb` (load balancer), and `worker`).
        /// </summary>
        [Output("resources")]
        public Output<ImmutableArray<string>> Resources { get; private set; } = null!;


        /// <summary>
        /// Create a IntegrationAccount resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IntegrationAccount(string name, IntegrationAccountArgs args, CustomResourceOptions? options = null)
            : base("datadog:cloudflare/integrationAccount:IntegrationAccount", name, args ?? new IntegrationAccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IntegrationAccount(string name, Input<string> id, IntegrationAccountState? state = null, CustomResourceOptions? options = null)
            : base("datadog:cloudflare/integrationAccount:IntegrationAccount", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "apiKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing IntegrationAccount resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IntegrationAccount Get(string name, Input<string> id, IntegrationAccountState? state = null, CustomResourceOptions? options = null)
        {
            return new IntegrationAccount(name, id, state, options);
        }
    }

    public sealed class IntegrationAccountArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiKey", required: true)]
        private Input<string>? _apiKey;

        /// <summary>
        /// The API key (or token) for the Cloudflare account.
        /// </summary>
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The email associated with the Cloudflare account. If an API key is provided (and not a token), this field is also required.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// The name of the Cloudflare account.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("resources")]
        private InputList<string>? _resources;

        /// <summary>
        /// An allowlist of resources to pull metrics for. Includes `web`, `dns`, `lb` (load balancer), and `worker`).
        /// </summary>
        public InputList<string> Resources
        {
            get => _resources ?? (_resources = new InputList<string>());
            set => _resources = value;
        }

        public IntegrationAccountArgs()
        {
        }
        public static new IntegrationAccountArgs Empty => new IntegrationAccountArgs();
    }

    public sealed class IntegrationAccountState : global::Pulumi.ResourceArgs
    {
        [Input("apiKey")]
        private Input<string>? _apiKey;

        /// <summary>
        /// The API key (or token) for the Cloudflare account.
        /// </summary>
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The email associated with the Cloudflare account. If an API key is provided (and not a token), this field is also required.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// The name of the Cloudflare account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("resources")]
        private InputList<string>? _resources;

        /// <summary>
        /// An allowlist of resources to pull metrics for. Includes `web`, `dns`, `lb` (load balancer), and `worker`).
        /// </summary>
        public InputList<string> Resources
        {
            get => _resources ?? (_resources = new InputList<string>());
            set => _resources = value;
        }

        public IntegrationAccountState()
        {
        }
        public static new IntegrationAccountState Empty => new IntegrationAccountState();
    }
}
