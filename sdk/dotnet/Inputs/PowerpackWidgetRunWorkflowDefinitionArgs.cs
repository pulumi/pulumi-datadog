// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetRunWorkflowDefinitionArgs : global::Pulumi.ResourceArgs
    {
        [Input("customLinks")]
        private InputList<Inputs.PowerpackWidgetRunWorkflowDefinitionCustomLinkArgs>? _customLinks;

        /// <summary>
        /// A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
        /// </summary>
        public InputList<Inputs.PowerpackWidgetRunWorkflowDefinitionCustomLinkArgs> CustomLinks
        {
            get => _customLinks ?? (_customLinks = new InputList<Inputs.PowerpackWidgetRunWorkflowDefinitionCustomLinkArgs>());
            set => _customLinks = value;
        }

        [Input("inputs")]
        private InputList<Inputs.PowerpackWidgetRunWorkflowDefinitionInputArgs>? _inputs;

        /// <summary>
        /// Array of workflow inputs to map to dashboard template variables.
        /// </summary>
        public InputList<Inputs.PowerpackWidgetRunWorkflowDefinitionInputArgs> Inputs
        {
            get => _inputs ?? (_inputs = new InputList<Inputs.PowerpackWidgetRunWorkflowDefinitionInputArgs>());
            set => _inputs = value;
        }

        /// <summary>
        /// The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
        /// </summary>
        [Input("liveSpan")]
        public Input<string>? LiveSpan { get; set; }

        /// <summary>
        /// The title of the widget.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        /// <summary>
        /// The alignment of the widget's title. Valid values are `center`, `left`, `right`.
        /// </summary>
        [Input("titleAlign")]
        public Input<string>? TitleAlign { get; set; }

        /// <summary>
        /// The size of the widget's title (defaults to 16).
        /// </summary>
        [Input("titleSize")]
        public Input<string>? TitleSize { get; set; }

        /// <summary>
        /// Workflow ID
        /// </summary>
        [Input("workflowId", required: true)]
        public Input<string> WorkflowId { get; set; } = null!;

        public PowerpackWidgetRunWorkflowDefinitionArgs()
        {
        }
        public static new PowerpackWidgetRunWorkflowDefinitionArgs Empty => new PowerpackWidgetRunWorkflowDefinitionArgs();
    }
}