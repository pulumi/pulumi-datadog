// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetQueryTableDefinitionArgs : global::Pulumi.ResourceArgs
    {
        [Input("customLinks")]
        private InputList<Inputs.PowerpackWidgetQueryTableDefinitionCustomLinkArgs>? _customLinks;

        /// <summary>
        /// A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
        /// </summary>
        public InputList<Inputs.PowerpackWidgetQueryTableDefinitionCustomLinkArgs> CustomLinks
        {
            get => _customLinks ?? (_customLinks = new InputList<Inputs.PowerpackWidgetQueryTableDefinitionCustomLinkArgs>());
            set => _customLinks = value;
        }

        /// <summary>
        /// Controls the display of the search bar. Valid values are `always`, `never`, `auto`.
        /// </summary>
        [Input("hasSearchBar")]
        public Input<string>? HasSearchBar { get; set; }

        /// <summary>
        /// The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
        /// </summary>
        [Input("liveSpan")]
        public Input<string>? LiveSpan { get; set; }

        [Input("requests")]
        private InputList<Inputs.PowerpackWidgetQueryTableDefinitionRequestArgs>? _requests;

        /// <summary>
        /// A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the `request` block).
        /// </summary>
        public InputList<Inputs.PowerpackWidgetQueryTableDefinitionRequestArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.PowerpackWidgetQueryTableDefinitionRequestArgs>());
            set => _requests = value;
        }

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

        public PowerpackWidgetQueryTableDefinitionArgs()
        {
        }
        public static new PowerpackWidgetQueryTableDefinitionArgs Empty => new PowerpackWidgetQueryTableDefinitionArgs();
    }
}