// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetTimeseriesDefinitionMarkerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// How the marker lines are displayed, options are one of {`error`, `warning`, `info`, `ok`} combined with one of {`dashed`, `solid`, `bold`}. Example: `error dashed`.
        /// </summary>
        [Input("displayType")]
        public Input<string>? DisplayType { get; set; }

        /// <summary>
        /// The label for the custom link URL.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// A value for the comparator.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public PowerpackWidgetTimeseriesDefinitionMarkerGetArgs()
        {
        }
        public static new PowerpackWidgetTimeseriesDefinitionMarkerGetArgs Empty => new PowerpackWidgetTimeseriesDefinitionMarkerGetArgs();
    }
}