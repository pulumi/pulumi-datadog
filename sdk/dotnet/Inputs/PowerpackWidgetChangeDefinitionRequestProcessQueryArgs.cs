// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetChangeDefinitionRequestProcessQueryArgs : global::Pulumi.ResourceArgs
    {
        [Input("filterBies")]
        private InputList<string>? _filterBies;

        /// <summary>
        /// A list of processes.
        /// </summary>
        public InputList<string> FilterBies
        {
            get => _filterBies ?? (_filterBies = new InputList<string>());
            set => _filterBies = value;
        }

        /// <summary>
        /// The max number of items in the filter list.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// Your chosen metric.
        /// </summary>
        [Input("metric", required: true)]
        public Input<string> Metric { get; set; } = null!;

        /// <summary>
        /// Your chosen search term.
        /// </summary>
        [Input("searchBy")]
        public Input<string>? SearchBy { get; set; }

        public PowerpackWidgetChangeDefinitionRequestProcessQueryArgs()
        {
        }
        public static new PowerpackWidgetChangeDefinitionRequestProcessQueryArgs Empty => new PowerpackWidgetChangeDefinitionRequestProcessQueryArgs();
    }
}