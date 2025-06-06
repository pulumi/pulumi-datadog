// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetScatterplotDefinitionRequestScatterplotTableGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("formulas")]
        private InputList<Inputs.PowerpackWidgetScatterplotDefinitionRequestScatterplotTableFormulaGetArgs>? _formulas;
        public InputList<Inputs.PowerpackWidgetScatterplotDefinitionRequestScatterplotTableFormulaGetArgs> Formulas
        {
            get => _formulas ?? (_formulas = new InputList<Inputs.PowerpackWidgetScatterplotDefinitionRequestScatterplotTableFormulaGetArgs>());
            set => _formulas = value;
        }

        [Input("queries")]
        private InputList<Inputs.PowerpackWidgetScatterplotDefinitionRequestScatterplotTableQueryGetArgs>? _queries;
        public InputList<Inputs.PowerpackWidgetScatterplotDefinitionRequestScatterplotTableQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.PowerpackWidgetScatterplotDefinitionRequestScatterplotTableQueryGetArgs>());
            set => _queries = value;
        }

        public PowerpackWidgetScatterplotDefinitionRequestScatterplotTableGetArgs()
        {
        }
        public static new PowerpackWidgetScatterplotDefinitionRequestScatterplotTableGetArgs Empty => new PowerpackWidgetScatterplotDefinitionRequestScatterplotTableGetArgs();
    }
}
