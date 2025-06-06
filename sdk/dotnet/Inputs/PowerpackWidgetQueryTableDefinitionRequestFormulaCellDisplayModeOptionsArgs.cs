// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of trend line to display. Valid values are `area`, `line`, `bars`.
        /// </summary>
        [Input("trendType")]
        public Input<string>? TrendType { get; set; }

        /// <summary>
        /// The scale of the y-axis. Valid values are `shared`, `independent`.
        /// </summary>
        [Input("yScale")]
        public Input<string>? YScale { get; set; }

        public PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs()
        {
        }
        public static new PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs Empty => new PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs();
    }
}
