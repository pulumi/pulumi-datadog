// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetChangeDefinitionRequestArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("apmQuery")]
        public Input<Inputs.PowerpackWidgetChangeDefinitionRequestApmQueryArgs>? ApmQuery { get; set; }

        /// <summary>
        /// Whether to show absolute or relative change. Valid values are `absolute`, `relative`.
        /// </summary>
        [Input("changeType")]
        public Input<string>? ChangeType { get; set; }

        /// <summary>
        /// Choose from when to compare current data to. Valid values are `hour_before`, `day_before`, `week_before`, `month_before`.
        /// </summary>
        [Input("compareTo")]
        public Input<string>? CompareTo { get; set; }

        [Input("formulas")]
        private InputList<Inputs.PowerpackWidgetChangeDefinitionRequestFormulaArgs>? _formulas;
        public InputList<Inputs.PowerpackWidgetChangeDefinitionRequestFormulaArgs> Formulas
        {
            get => _formulas ?? (_formulas = new InputList<Inputs.PowerpackWidgetChangeDefinitionRequestFormulaArgs>());
            set => _formulas = value;
        }

        /// <summary>
        /// A Boolean indicating whether an increase in the value is good (displayed in green) or not (displayed in red).
        /// </summary>
        [Input("increaseGood")]
        public Input<bool>? IncreaseGood { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("logQuery")]
        public Input<Inputs.PowerpackWidgetChangeDefinitionRequestLogQueryArgs>? LogQuery { get; set; }

        /// <summary>
        /// What to order by. Valid values are `change`, `name`, `present`, `past`.
        /// </summary>
        [Input("orderBy")]
        public Input<string>? OrderBy { get; set; }

        /// <summary>
        /// Widget sorting method. Valid values are `asc`, `desc`.
        /// </summary>
        [Input("orderDir")]
        public Input<string>? OrderDir { get; set; }

        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        [Input("processQuery")]
        public Input<Inputs.PowerpackWidgetChangeDefinitionRequestProcessQueryArgs>? ProcessQuery { get; set; }

        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        [Input("q")]
        public Input<string>? Q { get; set; }

        [Input("queries")]
        private InputList<Inputs.PowerpackWidgetChangeDefinitionRequestQueryArgs>? _queries;
        public InputList<Inputs.PowerpackWidgetChangeDefinitionRequestQueryArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.PowerpackWidgetChangeDefinitionRequestQueryArgs>());
            set => _queries = value;
        }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("rumQuery")]
        public Input<Inputs.PowerpackWidgetChangeDefinitionRequestRumQueryArgs>? RumQuery { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("securityQuery")]
        public Input<Inputs.PowerpackWidgetChangeDefinitionRequestSecurityQueryArgs>? SecurityQuery { get; set; }

        /// <summary>
        /// If set to `true`, displays the current value.
        /// </summary>
        [Input("showPresent")]
        public Input<bool>? ShowPresent { get; set; }

        public PowerpackWidgetChangeDefinitionRequestArgs()
        {
        }
        public static new PowerpackWidgetChangeDefinitionRequestArgs Empty => new PowerpackWidgetChangeDefinitionRequestArgs();
    }
}