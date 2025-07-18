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
    /// Provides a Datadog Security Monitoring Rule API resource. This can be used to create and manage Datadog security monitoring rules. To change settings for a default rule, use `datadog.SecurityMonitoringDefaultRule` instead.
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
    ///     var myrule = new Datadog.SecurityMonitoringRule("myrule", new()
    ///     {
    ///         Name = "My rule",
    ///         Message = "The rule has triggered.",
    ///         Enabled = true,
    ///         Queries = new[]
    ///         {
    ///             new Datadog.Inputs.SecurityMonitoringRuleQueryArgs
    ///             {
    ///                 Name = "errors",
    ///                 Query = "status:error",
    ///                 Aggregation = "count",
    ///                 DataSource = "logs",
    ///                 GroupByFields = new[]
    ///                 {
    ///                     "host",
    ///                 },
    ///             },
    ///             new Datadog.Inputs.SecurityMonitoringRuleQueryArgs
    ///             {
    ///                 Name = "warnings",
    ///                 Query = "status:warning",
    ///                 Aggregation = "count",
    ///                 DataSource = "logs",
    ///                 GroupByFields = new[]
    ///                 {
    ///                     "host",
    ///                 },
    ///             },
    ///         },
    ///         Cases = new[]
    ///         {
    ///             new Datadog.Inputs.SecurityMonitoringRuleCaseArgs
    ///             {
    ///                 Status = "high",
    ///                 Condition = "errors &gt; 3 &amp;&amp; warnings &gt; 10",
    ///                 Notifications = new[]
    ///                 {
    ///                     "@user",
    ///                 },
    ///             },
    ///         },
    ///         Options = new Datadog.Inputs.SecurityMonitoringRuleOptionsArgs
    ///         {
    ///             EvaluationWindow = 300,
    ///             KeepAlive = 600,
    ///             MaxSignalDuration = 900,
    ///         },
    ///         Tags = new[]
    ///         {
    ///             "type:dos",
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
    /// Security monitoring rules can be imported using ID, e.g.
    /// 
    /// ```sh
    /// $ pulumi import datadog:index/securityMonitoringRule:SecurityMonitoringRule my_rule m0o-hto-lkb
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/securityMonitoringRule:SecurityMonitoringRule")]
    public partial class SecurityMonitoringRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Cases for generating signals.
        /// </summary>
        [Output("cases")]
        public Output<ImmutableArray<Outputs.SecurityMonitoringRuleCase>> Cases { get; private set; } = null!;

        /// <summary>
        /// Whether the rule is enabled. Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Additional queries to filter matched events before they are processed. **Note**: This field is deprecated for log detection, signal correlation, and workload security rules.
        /// </summary>
        [Output("filters")]
        public Output<ImmutableArray<Outputs.SecurityMonitoringRuleFilter>> Filters { get; private set; } = null!;

        /// <summary>
        /// Additional grouping to perform on top of the query grouping.
        /// </summary>
        [Output("groupSignalsBies")]
        public Output<ImmutableArray<string>> GroupSignalsBies { get; private set; } = null!;

        /// <summary>
        /// Whether the notifications include the triggering group-by values in their title. Defaults to `false`.
        /// </summary>
        [Output("hasExtendedTitle")]
        public Output<bool?> HasExtendedTitle { get; private set; } = null!;

        /// <summary>
        /// Message for generated signals.
        /// </summary>
        [Output("message")]
        public Output<string> Message { get; private set; } = null!;

        /// <summary>
        /// The name of the rule.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Options on rules.
        /// </summary>
        [Output("options")]
        public Output<Outputs.SecurityMonitoringRuleOptions?> Options { get; private set; } = null!;

        /// <summary>
        /// Queries for selecting logs which are part of the rule.
        /// </summary>
        [Output("queries")]
        public Output<ImmutableArray<Outputs.SecurityMonitoringRuleQuery>> Queries { get; private set; } = null!;

        /// <summary>
        /// Reference tables for filtering query results.
        /// </summary>
        [Output("referenceTables")]
        public Output<ImmutableArray<Outputs.SecurityMonitoringRuleReferenceTable>> ReferenceTables { get; private set; } = null!;

        /// <summary>
        /// Queries for selecting logs which are part of the rule.
        /// </summary>
        [Output("signalQueries")]
        public Output<ImmutableArray<Outputs.SecurityMonitoringRuleSignalQuery>> SignalQueries { get; private set; } = null!;

        /// <summary>
        /// Tags for generated signals. Note: if default tags are present at provider level, they will be added to this resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Cases for generating signals for third-party rules. Only required and accepted for third-party rules
        /// </summary>
        [Output("thirdPartyCases")]
        public Output<ImmutableArray<Outputs.SecurityMonitoringRuleThirdPartyCase>> ThirdPartyCases { get; private set; } = null!;

        /// <summary>
        /// The rule type. Valid values are `application_security`, `log_detection`, `workload_security`, `signal_correlation`. Defaults to `"log_detection"`.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// Whether or not to validate the Rule.
        /// </summary>
        [Output("validate")]
        public Output<bool?> Validate { get; private set; } = null!;


        /// <summary>
        /// Create a SecurityMonitoringRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecurityMonitoringRule(string name, SecurityMonitoringRuleArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/securityMonitoringRule:SecurityMonitoringRule", name, args ?? new SecurityMonitoringRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecurityMonitoringRule(string name, Input<string> id, SecurityMonitoringRuleState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/securityMonitoringRule:SecurityMonitoringRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecurityMonitoringRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecurityMonitoringRule Get(string name, Input<string> id, SecurityMonitoringRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new SecurityMonitoringRule(name, id, state, options);
        }
    }

    public sealed class SecurityMonitoringRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("cases")]
        private InputList<Inputs.SecurityMonitoringRuleCaseArgs>? _cases;

        /// <summary>
        /// Cases for generating signals.
        /// </summary>
        public InputList<Inputs.SecurityMonitoringRuleCaseArgs> Cases
        {
            get => _cases ?? (_cases = new InputList<Inputs.SecurityMonitoringRuleCaseArgs>());
            set => _cases = value;
        }

        /// <summary>
        /// Whether the rule is enabled. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("filters")]
        private InputList<Inputs.SecurityMonitoringRuleFilterArgs>? _filters;

        /// <summary>
        /// Additional queries to filter matched events before they are processed. **Note**: This field is deprecated for log detection, signal correlation, and workload security rules.
        /// </summary>
        public InputList<Inputs.SecurityMonitoringRuleFilterArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.SecurityMonitoringRuleFilterArgs>());
            set => _filters = value;
        }

        [Input("groupSignalsBies")]
        private InputList<string>? _groupSignalsBies;

        /// <summary>
        /// Additional grouping to perform on top of the query grouping.
        /// </summary>
        public InputList<string> GroupSignalsBies
        {
            get => _groupSignalsBies ?? (_groupSignalsBies = new InputList<string>());
            set => _groupSignalsBies = value;
        }

        /// <summary>
        /// Whether the notifications include the triggering group-by values in their title. Defaults to `false`.
        /// </summary>
        [Input("hasExtendedTitle")]
        public Input<bool>? HasExtendedTitle { get; set; }

        /// <summary>
        /// Message for generated signals.
        /// </summary>
        [Input("message", required: true)]
        public Input<string> Message { get; set; } = null!;

        /// <summary>
        /// The name of the rule.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Options on rules.
        /// </summary>
        [Input("options")]
        public Input<Inputs.SecurityMonitoringRuleOptionsArgs>? Options { get; set; }

        [Input("queries")]
        private InputList<Inputs.SecurityMonitoringRuleQueryArgs>? _queries;

        /// <summary>
        /// Queries for selecting logs which are part of the rule.
        /// </summary>
        public InputList<Inputs.SecurityMonitoringRuleQueryArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.SecurityMonitoringRuleQueryArgs>());
            set => _queries = value;
        }

        [Input("referenceTables")]
        private InputList<Inputs.SecurityMonitoringRuleReferenceTableArgs>? _referenceTables;

        /// <summary>
        /// Reference tables for filtering query results.
        /// </summary>
        public InputList<Inputs.SecurityMonitoringRuleReferenceTableArgs> ReferenceTables
        {
            get => _referenceTables ?? (_referenceTables = new InputList<Inputs.SecurityMonitoringRuleReferenceTableArgs>());
            set => _referenceTables = value;
        }

        [Input("signalQueries")]
        private InputList<Inputs.SecurityMonitoringRuleSignalQueryArgs>? _signalQueries;

        /// <summary>
        /// Queries for selecting logs which are part of the rule.
        /// </summary>
        public InputList<Inputs.SecurityMonitoringRuleSignalQueryArgs> SignalQueries
        {
            get => _signalQueries ?? (_signalQueries = new InputList<Inputs.SecurityMonitoringRuleSignalQueryArgs>());
            set => _signalQueries = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags for generated signals. Note: if default tags are present at provider level, they will be added to this resource.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("thirdPartyCases")]
        private InputList<Inputs.SecurityMonitoringRuleThirdPartyCaseArgs>? _thirdPartyCases;

        /// <summary>
        /// Cases for generating signals for third-party rules. Only required and accepted for third-party rules
        /// </summary>
        public InputList<Inputs.SecurityMonitoringRuleThirdPartyCaseArgs> ThirdPartyCases
        {
            get => _thirdPartyCases ?? (_thirdPartyCases = new InputList<Inputs.SecurityMonitoringRuleThirdPartyCaseArgs>());
            set => _thirdPartyCases = value;
        }

        /// <summary>
        /// The rule type. Valid values are `application_security`, `log_detection`, `workload_security`, `signal_correlation`. Defaults to `"log_detection"`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Whether or not to validate the Rule.
        /// </summary>
        [Input("validate")]
        public Input<bool>? Validate { get; set; }

        public SecurityMonitoringRuleArgs()
        {
        }
        public static new SecurityMonitoringRuleArgs Empty => new SecurityMonitoringRuleArgs();
    }

    public sealed class SecurityMonitoringRuleState : global::Pulumi.ResourceArgs
    {
        [Input("cases")]
        private InputList<Inputs.SecurityMonitoringRuleCaseGetArgs>? _cases;

        /// <summary>
        /// Cases for generating signals.
        /// </summary>
        public InputList<Inputs.SecurityMonitoringRuleCaseGetArgs> Cases
        {
            get => _cases ?? (_cases = new InputList<Inputs.SecurityMonitoringRuleCaseGetArgs>());
            set => _cases = value;
        }

        /// <summary>
        /// Whether the rule is enabled. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("filters")]
        private InputList<Inputs.SecurityMonitoringRuleFilterGetArgs>? _filters;

        /// <summary>
        /// Additional queries to filter matched events before they are processed. **Note**: This field is deprecated for log detection, signal correlation, and workload security rules.
        /// </summary>
        public InputList<Inputs.SecurityMonitoringRuleFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.SecurityMonitoringRuleFilterGetArgs>());
            set => _filters = value;
        }

        [Input("groupSignalsBies")]
        private InputList<string>? _groupSignalsBies;

        /// <summary>
        /// Additional grouping to perform on top of the query grouping.
        /// </summary>
        public InputList<string> GroupSignalsBies
        {
            get => _groupSignalsBies ?? (_groupSignalsBies = new InputList<string>());
            set => _groupSignalsBies = value;
        }

        /// <summary>
        /// Whether the notifications include the triggering group-by values in their title. Defaults to `false`.
        /// </summary>
        [Input("hasExtendedTitle")]
        public Input<bool>? HasExtendedTitle { get; set; }

        /// <summary>
        /// Message for generated signals.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// The name of the rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Options on rules.
        /// </summary>
        [Input("options")]
        public Input<Inputs.SecurityMonitoringRuleOptionsGetArgs>? Options { get; set; }

        [Input("queries")]
        private InputList<Inputs.SecurityMonitoringRuleQueryGetArgs>? _queries;

        /// <summary>
        /// Queries for selecting logs which are part of the rule.
        /// </summary>
        public InputList<Inputs.SecurityMonitoringRuleQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.SecurityMonitoringRuleQueryGetArgs>());
            set => _queries = value;
        }

        [Input("referenceTables")]
        private InputList<Inputs.SecurityMonitoringRuleReferenceTableGetArgs>? _referenceTables;

        /// <summary>
        /// Reference tables for filtering query results.
        /// </summary>
        public InputList<Inputs.SecurityMonitoringRuleReferenceTableGetArgs> ReferenceTables
        {
            get => _referenceTables ?? (_referenceTables = new InputList<Inputs.SecurityMonitoringRuleReferenceTableGetArgs>());
            set => _referenceTables = value;
        }

        [Input("signalQueries")]
        private InputList<Inputs.SecurityMonitoringRuleSignalQueryGetArgs>? _signalQueries;

        /// <summary>
        /// Queries for selecting logs which are part of the rule.
        /// </summary>
        public InputList<Inputs.SecurityMonitoringRuleSignalQueryGetArgs> SignalQueries
        {
            get => _signalQueries ?? (_signalQueries = new InputList<Inputs.SecurityMonitoringRuleSignalQueryGetArgs>());
            set => _signalQueries = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags for generated signals. Note: if default tags are present at provider level, they will be added to this resource.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("thirdPartyCases")]
        private InputList<Inputs.SecurityMonitoringRuleThirdPartyCaseGetArgs>? _thirdPartyCases;

        /// <summary>
        /// Cases for generating signals for third-party rules. Only required and accepted for third-party rules
        /// </summary>
        public InputList<Inputs.SecurityMonitoringRuleThirdPartyCaseGetArgs> ThirdPartyCases
        {
            get => _thirdPartyCases ?? (_thirdPartyCases = new InputList<Inputs.SecurityMonitoringRuleThirdPartyCaseGetArgs>());
            set => _thirdPartyCases = value;
        }

        /// <summary>
        /// The rule type. Valid values are `application_security`, `log_detection`, `workload_security`, `signal_correlation`. Defaults to `"log_detection"`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Whether or not to validate the Rule.
        /// </summary>
        [Input("validate")]
        public Input<bool>? Validate { get; set; }

        public SecurityMonitoringRuleState()
        {
        }
        public static new SecurityMonitoringRuleState Empty => new SecurityMonitoringRuleState();
    }
}
