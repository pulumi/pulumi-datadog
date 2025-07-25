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
    /// Provides a Datadog webhooks custom variable resource. This can be used to create and manage Datadog webhooks custom variables.
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
    ///     // Create a new Datadog webhook custom variable.
    ///     var foo = new Datadog.WebhookCustomVariable("foo", new()
    ///     {
    ///         Name = "EXAMPLE_VARIABLE",
    ///         Value = "EXAMPLE-VALUE",
    ///         IsSecret = true,
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
    /// $ pulumi import datadog:index/webhookCustomVariable:WebhookCustomVariable foo EXAMPLE_VARIABLE
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/webhookCustomVariable:WebhookCustomVariable")]
    public partial class WebhookCustomVariable : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether the custom variable is secret or not.
        /// </summary>
        [Output("isSecret")]
        public Output<bool> IsSecret { get; private set; } = null!;

        /// <summary>
        /// The name of the variable. It corresponds with `&lt;CUSTOM_VARIABLE_NAME&gt;`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The value of the custom variable.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a WebhookCustomVariable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WebhookCustomVariable(string name, WebhookCustomVariableArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/webhookCustomVariable:WebhookCustomVariable", name, args ?? new WebhookCustomVariableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WebhookCustomVariable(string name, Input<string> id, WebhookCustomVariableState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/webhookCustomVariable:WebhookCustomVariable", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "value",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WebhookCustomVariable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WebhookCustomVariable Get(string name, Input<string> id, WebhookCustomVariableState? state = null, CustomResourceOptions? options = null)
        {
            return new WebhookCustomVariable(name, id, state, options);
        }
    }

    public sealed class WebhookCustomVariableArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the custom variable is secret or not.
        /// </summary>
        [Input("isSecret", required: true)]
        public Input<bool> IsSecret { get; set; } = null!;

        /// <summary>
        /// The name of the variable. It corresponds with `&lt;CUSTOM_VARIABLE_NAME&gt;`.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("value", required: true)]
        private Input<string>? _value;

        /// <summary>
        /// The value of the custom variable.
        /// </summary>
        public Input<string>? Value
        {
            get => _value;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _value = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public WebhookCustomVariableArgs()
        {
        }
        public static new WebhookCustomVariableArgs Empty => new WebhookCustomVariableArgs();
    }

    public sealed class WebhookCustomVariableState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the custom variable is secret or not.
        /// </summary>
        [Input("isSecret")]
        public Input<bool>? IsSecret { get; set; }

        /// <summary>
        /// The name of the variable. It corresponds with `&lt;CUSTOM_VARIABLE_NAME&gt;`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("value")]
        private Input<string>? _value;

        /// <summary>
        /// The value of the custom variable.
        /// </summary>
        public Input<string>? Value
        {
            get => _value;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _value = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public WebhookCustomVariableState()
        {
        }
        public static new WebhookCustomVariableState Empty => new WebhookCustomVariableState();
    }
}
