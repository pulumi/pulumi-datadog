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
    /// Provides a Datadog dashboard_list resource. This can be used to create and manage Datadog Dashboard Lists and the individual dashboards within them.
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
    ///     var time = new Datadog.Dashboard("time", new()
    ///     {
    ///         Title = "TF Test Layout Dashboard",
    ///         Description = "Created using the Datadog provider in Pulumi",
    ///         LayoutType = "ordered",
    ///         IsReadOnly = true,
    ///         Widgets = new[]
    ///         {
    ///             new Datadog.Inputs.DashboardWidgetArgs
    ///             {
    ///                 AlertGraphDefinition = new Datadog.Inputs.DashboardWidgetAlertGraphDefinitionArgs
    ///                 {
    ///                     AlertId = "1234",
    ///                     VizType = "timeseries",
    ///                     Title = "Widget Title",
    ///                     LiveSpan = "1h",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var screen = new Datadog.Dashboard("screen", new()
    ///     {
    ///         Title = "TF Test Free Layout Dashboard",
    ///         Description = "Created using the Datadog provider in Pulumi",
    ///         LayoutType = "free",
    ///         IsReadOnly = false,
    ///         Widgets = new[]
    ///         {
    ///             new Datadog.Inputs.DashboardWidgetArgs
    ///             {
    ///                 EventStreamDefinition = new Datadog.Inputs.DashboardWidgetEventStreamDefinitionArgs
    ///                 {
    ///                     Query = "*",
    ///                     EventSize = "l",
    ///                     Title = "Widget Title",
    ///                     TitleSize = "16",
    ///                     TitleAlign = "left",
    ///                     LiveSpan = "1h",
    ///                 },
    ///                 WidgetLayout = new Datadog.Inputs.DashboardWidgetWidgetLayoutArgs
    ///                 {
    ///                     Height = 43,
    ///                     Width = 32,
    ///                     X = 5,
    ///                     Y = 5,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     // Create a new Dashboard List with two Dashboards
    ///     var newList = new Datadog.DashboardList("new_list", new()
    ///     {
    ///         Name = "Automated Created List",
    ///         DashItems = new[]
    ///         {
    ///             new Datadog.Inputs.DashboardListDashItemArgs
    ///             {
    ///                 Type = "custom_timeboard",
    ///                 DashId = time.Id,
    ///             },
    ///             new Datadog.Inputs.DashboardListDashItemArgs
    ///             {
    ///                 Type = "custom_screenboard",
    ///                 DashId = screen.Id,
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             screen,
    ///             time,
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
    /// $ pulumi import datadog:index/dashboardList:DashboardList new_list 123456
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/dashboardList:DashboardList")]
    public partial class DashboardList : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A set of dashboard items that belong to this list
        /// </summary>
        [Output("dashItems")]
        public Output<ImmutableArray<Outputs.DashboardListDashItem>> DashItems { get; private set; } = null!;

        /// <summary>
        /// The name of the Dashboard List
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a DashboardList resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DashboardList(string name, DashboardListArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/dashboardList:DashboardList", name, args ?? new DashboardListArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DashboardList(string name, Input<string> id, DashboardListState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/dashboardList:DashboardList", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DashboardList resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DashboardList Get(string name, Input<string> id, DashboardListState? state = null, CustomResourceOptions? options = null)
        {
            return new DashboardList(name, id, state, options);
        }
    }

    public sealed class DashboardListArgs : global::Pulumi.ResourceArgs
    {
        [Input("dashItems")]
        private InputList<Inputs.DashboardListDashItemArgs>? _dashItems;

        /// <summary>
        /// A set of dashboard items that belong to this list
        /// </summary>
        public InputList<Inputs.DashboardListDashItemArgs> DashItems
        {
            get => _dashItems ?? (_dashItems = new InputList<Inputs.DashboardListDashItemArgs>());
            set => _dashItems = value;
        }

        /// <summary>
        /// The name of the Dashboard List
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public DashboardListArgs()
        {
        }
        public static new DashboardListArgs Empty => new DashboardListArgs();
    }

    public sealed class DashboardListState : global::Pulumi.ResourceArgs
    {
        [Input("dashItems")]
        private InputList<Inputs.DashboardListDashItemGetArgs>? _dashItems;

        /// <summary>
        /// A set of dashboard items that belong to this list
        /// </summary>
        public InputList<Inputs.DashboardListDashItemGetArgs> DashItems
        {
            get => _dashItems ?? (_dashItems = new InputList<Inputs.DashboardListDashItemGetArgs>());
            set => _dashItems = value;
        }

        /// <summary>
        /// The name of the Dashboard List
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public DashboardListState()
        {
        }
        public static new DashboardListState Empty => new DashboardListState();
    }
}
