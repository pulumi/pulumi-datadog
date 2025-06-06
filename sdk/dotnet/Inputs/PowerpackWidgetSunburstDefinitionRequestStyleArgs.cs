// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetSunburstDefinitionRequestStyleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A color palette to apply to the widget. The available options are available at: https://docs.datadoghq.com/dashboards/widgets/timeseries/#appearance.
        /// </summary>
        [Input("palette")]
        public Input<string>? Palette { get; set; }

        public PowerpackWidgetSunburstDefinitionRequestStyleArgs()
        {
        }
        public static new PowerpackWidgetSunburstDefinitionRequestStyleArgs Empty => new PowerpackWidgetSunburstDefinitionRequestStyleArgs();
    }
}
