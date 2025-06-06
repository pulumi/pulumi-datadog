// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetScatterplotDefinitionRequestArgs : global::Pulumi.ResourceArgs
    {
        [Input("scatterplotTables")]
        private InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableArgs>? _scatterplotTables;

        /// <summary>
        /// Scatterplot request containing formulas and functions.
        /// </summary>
        public InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableArgs> ScatterplotTables
        {
            get => _scatterplotTables ?? (_scatterplotTables = new InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableArgs>());
            set => _scatterplotTables = value;
        }

        [Input("xes")]
        private InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestXArgs>? _xes;

        /// <summary>
        /// The query used for the X-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
        /// </summary>
        public InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestXArgs> Xes
        {
            get => _xes ?? (_xes = new InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestXArgs>());
            set => _xes = value;
        }

        [Input("ys")]
        private InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestYArgs>? _ys;

        /// <summary>
        /// The query used for the Y-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
        /// </summary>
        public InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestYArgs> Ys
        {
            get => _ys ?? (_ys = new InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestYArgs>());
            set => _ys = value;
        }

        public DashboardWidgetScatterplotDefinitionRequestArgs()
        {
        }
        public static new DashboardWidgetScatterplotDefinitionRequestArgs Empty => new DashboardWidgetScatterplotDefinitionRequestArgs();
    }
}
