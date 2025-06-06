// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGeomapDefinitionRequestArgs : global::Pulumi.ResourceArgs
    {
        [Input("formulas")]
        private InputList<Inputs.DashboardWidgetGeomapDefinitionRequestFormulaArgs>? _formulas;
        public InputList<Inputs.DashboardWidgetGeomapDefinitionRequestFormulaArgs> Formulas
        {
            get => _formulas ?? (_formulas = new InputList<Inputs.DashboardWidgetGeomapDefinitionRequestFormulaArgs>());
            set => _formulas = value;
        }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("logQuery")]
        public Input<Inputs.DashboardWidgetLogQueryArgs>? LogQuery { get; set; }

        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        [Input("q")]
        public Input<string>? Q { get; set; }

        [Input("queries")]
        private InputList<Inputs.DashboardWidgetGeomapDefinitionRequestQueryArgs>? _queries;
        public InputList<Inputs.DashboardWidgetGeomapDefinitionRequestQueryArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.DashboardWidgetGeomapDefinitionRequestQueryArgs>());
            set => _queries = value;
        }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("rumQuery")]
        public Input<Inputs.DashboardWidgetRumQueryArgs>? RumQuery { get; set; }

        public DashboardWidgetGeomapDefinitionRequestArgs()
        {
        }
        public static new DashboardWidgetGeomapDefinitionRequestArgs Empty => new DashboardWidgetGeomapDefinitionRequestArgs();
    }
}
