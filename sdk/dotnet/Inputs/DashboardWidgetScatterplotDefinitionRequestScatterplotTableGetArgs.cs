// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetScatterplotDefinitionRequestScatterplotTableGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("formulas")]
        private InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableFormulaGetArgs>? _formulas;
        public InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableFormulaGetArgs> Formulas
        {
            get => _formulas ?? (_formulas = new InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableFormulaGetArgs>());
            set => _formulas = value;
        }

        [Input("queries")]
        private InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryGetArgs>? _queries;
        public InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryGetArgs>());
            set => _queries = value;
        }

        public DashboardWidgetScatterplotDefinitionRequestScatterplotTableGetArgs()
        {
        }
        public static new DashboardWidgetScatterplotDefinitionRequestScatterplotTableGetArgs Empty => new DashboardWidgetScatterplotDefinitionRequestScatterplotTableGetArgs();
    }
}