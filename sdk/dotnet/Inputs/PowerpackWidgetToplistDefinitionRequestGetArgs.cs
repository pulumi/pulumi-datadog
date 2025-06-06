// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetToplistDefinitionRequestGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("apmQuery")]
        public Input<Inputs.PowerpackWidgetToplistDefinitionRequestApmQueryGetArgs>? ApmQuery { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("auditQuery")]
        public Input<Inputs.PowerpackWidgetToplistDefinitionRequestAuditQueryGetArgs>? AuditQuery { get; set; }

        [Input("conditionalFormats")]
        private InputList<Inputs.PowerpackWidgetToplistDefinitionRequestConditionalFormatGetArgs>? _conditionalFormats;

        /// <summary>
        /// Conditional formats allow you to set the color of your widget content or background, depending on a rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
        /// </summary>
        public InputList<Inputs.PowerpackWidgetToplistDefinitionRequestConditionalFormatGetArgs> ConditionalFormats
        {
            get => _conditionalFormats ?? (_conditionalFormats = new InputList<Inputs.PowerpackWidgetToplistDefinitionRequestConditionalFormatGetArgs>());
            set => _conditionalFormats = value;
        }

        [Input("formulas")]
        private InputList<Inputs.PowerpackWidgetToplistDefinitionRequestFormulaGetArgs>? _formulas;
        public InputList<Inputs.PowerpackWidgetToplistDefinitionRequestFormulaGetArgs> Formulas
        {
            get => _formulas ?? (_formulas = new InputList<Inputs.PowerpackWidgetToplistDefinitionRequestFormulaGetArgs>());
            set => _formulas = value;
        }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("logQuery")]
        public Input<Inputs.PowerpackWidgetToplistDefinitionRequestLogQueryGetArgs>? LogQuery { get; set; }

        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        [Input("processQuery")]
        public Input<Inputs.PowerpackWidgetToplistDefinitionRequestProcessQueryGetArgs>? ProcessQuery { get; set; }

        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        [Input("q")]
        public Input<string>? Q { get; set; }

        [Input("queries")]
        private InputList<Inputs.PowerpackWidgetToplistDefinitionRequestQueryGetArgs>? _queries;
        public InputList<Inputs.PowerpackWidgetToplistDefinitionRequestQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.PowerpackWidgetToplistDefinitionRequestQueryGetArgs>());
            set => _queries = value;
        }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("rumQuery")]
        public Input<Inputs.PowerpackWidgetToplistDefinitionRequestRumQueryGetArgs>? RumQuery { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("securityQuery")]
        public Input<Inputs.PowerpackWidgetToplistDefinitionRequestSecurityQueryGetArgs>? SecurityQuery { get; set; }

        /// <summary>
        /// Define request for the widget's style.
        /// </summary>
        [Input("style")]
        public Input<Inputs.PowerpackWidgetToplistDefinitionRequestStyleGetArgs>? Style { get; set; }

        public PowerpackWidgetToplistDefinitionRequestGetArgs()
        {
        }
        public static new PowerpackWidgetToplistDefinitionRequestGetArgs Empty => new PowerpackWidgetToplistDefinitionRequestGetArgs();
    }
}
