// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    /// <summary>
    /// Provides a Datadog Security Monitoring Rule API resource for security filters.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Datadog = Pulumi.Datadog;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var myFilter = new Datadog.SecurityMonitoringFilter("myFilter", new Datadog.SecurityMonitoringFilterArgs
    ///         {
    ///             ExclusionFilters = 
    ///             {
    ///                 new Datadog.Inputs.SecurityMonitoringFilterExclusionFilterArgs
    ///                 {
    ///                     Name = "first",
    ///                     Query = "exclude some logs",
    ///                 },
    ///                 new Datadog.Inputs.SecurityMonitoringFilterExclusionFilterArgs
    ///                 {
    ///                     Name = "second",
    ///                     Query = "exclude some other logs",
    ///                 },
    ///             },
    ///             IsEnabled = true,
    ///             Name = "My filter",
    ///             Query = "The filter is filtering.",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// # Security monitoring filters can be imported using ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import datadog:index/securityMonitoringFilter:SecurityMonitoringFilter my_filter m0o-hto-lkb
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/securityMonitoringFilter:SecurityMonitoringFilter")]
    public partial class SecurityMonitoringFilter : Pulumi.CustomResource
    {
        /// <summary>
        /// Exclusion filters to exclude some logs from the security filter.
        /// </summary>
        [Output("exclusionFilters")]
        public Output<ImmutableArray<Outputs.SecurityMonitoringFilterExclusionFilter>> ExclusionFilters { get; private set; } = null!;

        /// <summary>
        /// The filtered data type. Valid values are `logs`.
        /// </summary>
        [Output("filteredDataType")]
        public Output<string?> FilteredDataType { get; private set; } = null!;

        /// <summary>
        /// Whether the security filter is enabled.
        /// </summary>
        [Output("isEnabled")]
        public Output<bool> IsEnabled { get; private set; } = null!;

        /// <summary>
        /// The name of the security filter.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The query of the security filter.
        /// </summary>
        [Output("query")]
        public Output<string> Query { get; private set; } = null!;

        /// <summary>
        /// The version of the security filter.
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a SecurityMonitoringFilter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecurityMonitoringFilter(string name, SecurityMonitoringFilterArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/securityMonitoringFilter:SecurityMonitoringFilter", name, args ?? new SecurityMonitoringFilterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecurityMonitoringFilter(string name, Input<string> id, SecurityMonitoringFilterState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/securityMonitoringFilter:SecurityMonitoringFilter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecurityMonitoringFilter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecurityMonitoringFilter Get(string name, Input<string> id, SecurityMonitoringFilterState? state = null, CustomResourceOptions? options = null)
        {
            return new SecurityMonitoringFilter(name, id, state, options);
        }
    }

    public sealed class SecurityMonitoringFilterArgs : Pulumi.ResourceArgs
    {
        [Input("exclusionFilters")]
        private InputList<Inputs.SecurityMonitoringFilterExclusionFilterArgs>? _exclusionFilters;

        /// <summary>
        /// Exclusion filters to exclude some logs from the security filter.
        /// </summary>
        public InputList<Inputs.SecurityMonitoringFilterExclusionFilterArgs> ExclusionFilters
        {
            get => _exclusionFilters ?? (_exclusionFilters = new InputList<Inputs.SecurityMonitoringFilterExclusionFilterArgs>());
            set => _exclusionFilters = value;
        }

        /// <summary>
        /// The filtered data type. Valid values are `logs`.
        /// </summary>
        [Input("filteredDataType")]
        public Input<string>? FilteredDataType { get; set; }

        /// <summary>
        /// Whether the security filter is enabled.
        /// </summary>
        [Input("isEnabled", required: true)]
        public Input<bool> IsEnabled { get; set; } = null!;

        /// <summary>
        /// The name of the security filter.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The query of the security filter.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        public SecurityMonitoringFilterArgs()
        {
        }
    }

    public sealed class SecurityMonitoringFilterState : Pulumi.ResourceArgs
    {
        [Input("exclusionFilters")]
        private InputList<Inputs.SecurityMonitoringFilterExclusionFilterGetArgs>? _exclusionFilters;

        /// <summary>
        /// Exclusion filters to exclude some logs from the security filter.
        /// </summary>
        public InputList<Inputs.SecurityMonitoringFilterExclusionFilterGetArgs> ExclusionFilters
        {
            get => _exclusionFilters ?? (_exclusionFilters = new InputList<Inputs.SecurityMonitoringFilterExclusionFilterGetArgs>());
            set => _exclusionFilters = value;
        }

        /// <summary>
        /// The filtered data type. Valid values are `logs`.
        /// </summary>
        [Input("filteredDataType")]
        public Input<string>? FilteredDataType { get; set; }

        /// <summary>
        /// Whether the security filter is enabled.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// The name of the security filter.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The query of the security filter.
        /// </summary>
        [Input("query")]
        public Input<string>? Query { get; set; }

        /// <summary>
        /// The version of the security filter.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public SecurityMonitoringFilterState()
        {
        }
    }
}