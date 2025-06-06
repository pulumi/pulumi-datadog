// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetDistributionDefinitionRequestGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("apmQuery")]
        public Input<Inputs.PowerpackWidgetDistributionDefinitionRequestApmQueryGetArgs>? ApmQuery { get; set; }

        [Input("apmStatsQuery")]
        public Input<Inputs.PowerpackWidgetDistributionDefinitionRequestApmStatsQueryGetArgs>? ApmStatsQuery { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("logQuery")]
        public Input<Inputs.PowerpackWidgetDistributionDefinitionRequestLogQueryGetArgs>? LogQuery { get; set; }

        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        [Input("processQuery")]
        public Input<Inputs.PowerpackWidgetDistributionDefinitionRequestProcessQueryGetArgs>? ProcessQuery { get; set; }

        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        [Input("q")]
        public Input<string>? Q { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("rumQuery")]
        public Input<Inputs.PowerpackWidgetDistributionDefinitionRequestRumQueryGetArgs>? RumQuery { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("securityQuery")]
        public Input<Inputs.PowerpackWidgetDistributionDefinitionRequestSecurityQueryGetArgs>? SecurityQuery { get; set; }

        /// <summary>
        /// The style of the widget graph. One nested block is allowed using the structure below.
        /// </summary>
        [Input("style")]
        public Input<Inputs.PowerpackWidgetDistributionDefinitionRequestStyleGetArgs>? Style { get; set; }

        public PowerpackWidgetDistributionDefinitionRequestGetArgs()
        {
        }
        public static new PowerpackWidgetDistributionDefinitionRequestGetArgs Empty => new PowerpackWidgetDistributionDefinitionRequestGetArgs();
    }
}
