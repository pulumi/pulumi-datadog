// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetHostmapDefinitionRequestSizeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("apmQuery")]
        public Input<Inputs.PowerpackWidgetHostmapDefinitionRequestSizeApmQueryGetArgs>? ApmQuery { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("logQuery")]
        public Input<Inputs.PowerpackWidgetHostmapDefinitionRequestSizeLogQueryGetArgs>? LogQuery { get; set; }

        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        [Input("processQuery")]
        public Input<Inputs.PowerpackWidgetHostmapDefinitionRequestSizeProcessQueryGetArgs>? ProcessQuery { get; set; }

        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        [Input("q")]
        public Input<string>? Q { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("rumQuery")]
        public Input<Inputs.PowerpackWidgetHostmapDefinitionRequestSizeRumQueryGetArgs>? RumQuery { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("securityQuery")]
        public Input<Inputs.PowerpackWidgetHostmapDefinitionRequestSizeSecurityQueryGetArgs>? SecurityQuery { get; set; }

        public PowerpackWidgetHostmapDefinitionRequestSizeGetArgs()
        {
        }
        public static new PowerpackWidgetHostmapDefinitionRequestSizeGetArgs Empty => new PowerpackWidgetHostmapDefinitionRequestSizeGetArgs();
    }
}
