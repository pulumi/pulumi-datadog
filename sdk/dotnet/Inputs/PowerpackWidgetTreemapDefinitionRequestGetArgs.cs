// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetTreemapDefinitionRequestGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("formulas")]
        private InputList<Inputs.PowerpackWidgetTreemapDefinitionRequestFormulaGetArgs>? _formulas;
        public InputList<Inputs.PowerpackWidgetTreemapDefinitionRequestFormulaGetArgs> Formulas
        {
            get => _formulas ?? (_formulas = new InputList<Inputs.PowerpackWidgetTreemapDefinitionRequestFormulaGetArgs>());
            set => _formulas = value;
        }

        [Input("queries")]
        private InputList<Inputs.PowerpackWidgetTreemapDefinitionRequestQueryGetArgs>? _queries;
        public InputList<Inputs.PowerpackWidgetTreemapDefinitionRequestQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.PowerpackWidgetTreemapDefinitionRequestQueryGetArgs>());
            set => _queries = value;
        }

        public PowerpackWidgetTreemapDefinitionRequestGetArgs()
        {
        }
        public static new PowerpackWidgetTreemapDefinitionRequestGetArgs Empty => new PowerpackWidgetTreemapDefinitionRequestGetArgs();
    }
}