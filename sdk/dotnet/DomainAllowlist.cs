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
    /// Provides the Datadog Email Domain Allowlist resource. This can be used to manage the Datadog Email Domain Allowlist.
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
    ///     var example = new Datadog.DomainAllowlist("example", new()
    ///     {
    ///         Enabled = true,
    ///         Domains = new[]
    ///         {
    ///             "@gmail.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/domainAllowlist:DomainAllowlist")]
    public partial class DomainAllowlist : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The domains within the domain allowlist.
        /// </summary>
        [Output("domains")]
        public Output<ImmutableArray<string>> Domains { get; private set; } = null!;

        /// <summary>
        /// Whether the Email Domain Allowlist is enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;


        /// <summary>
        /// Create a DomainAllowlist resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DomainAllowlist(string name, DomainAllowlistArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/domainAllowlist:DomainAllowlist", name, args ?? new DomainAllowlistArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DomainAllowlist(string name, Input<string> id, DomainAllowlistState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/domainAllowlist:DomainAllowlist", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DomainAllowlist resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DomainAllowlist Get(string name, Input<string> id, DomainAllowlistState? state = null, CustomResourceOptions? options = null)
        {
            return new DomainAllowlist(name, id, state, options);
        }
    }

    public sealed class DomainAllowlistArgs : global::Pulumi.ResourceArgs
    {
        [Input("domains", required: true)]
        private InputList<string>? _domains;

        /// <summary>
        /// The domains within the domain allowlist.
        /// </summary>
        public InputList<string> Domains
        {
            get => _domains ?? (_domains = new InputList<string>());
            set => _domains = value;
        }

        /// <summary>
        /// Whether the Email Domain Allowlist is enabled.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public DomainAllowlistArgs()
        {
        }
        public static new DomainAllowlistArgs Empty => new DomainAllowlistArgs();
    }

    public sealed class DomainAllowlistState : global::Pulumi.ResourceArgs
    {
        [Input("domains")]
        private InputList<string>? _domains;

        /// <summary>
        /// The domains within the domain allowlist.
        /// </summary>
        public InputList<string> Domains
        {
            get => _domains ?? (_domains = new InputList<string>());
            set => _domains = value;
        }

        /// <summary>
        /// Whether the Email Domain Allowlist is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public DomainAllowlistState()
        {
        }
        public static new DomainAllowlistState Empty => new DomainAllowlistState();
    }
}
