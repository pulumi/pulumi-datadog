// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetLogStreamDefinitionArgs : global::Pulumi.ResourceArgs
    {
        [Input("columns")]
        private InputList<string>? _columns;

        /// <summary>
        /// Stringified list of columns to use, for example: `["column1","column2","column3"]`.
        /// </summary>
        public InputList<string> Columns
        {
            get => _columns ?? (_columns = new InputList<string>());
            set => _columns = value;
        }

        [Input("indexes")]
        private InputList<string>? _indexes;

        /// <summary>
        /// An array of index names to query in the stream.
        /// </summary>
        public InputList<string> Indexes
        {
            get => _indexes ?? (_indexes = new InputList<string>());
            set => _indexes = value;
        }

        /// <summary>
        /// The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
        /// </summary>
        [Input("liveSpan")]
        public Input<string>? LiveSpan { get; set; }

        /// <summary>
        /// The number of log lines to display. Valid values are `inline`, `expanded-md`, `expanded-lg`.
        /// </summary>
        [Input("messageDisplay")]
        public Input<string>? MessageDisplay { get; set; }

        /// <summary>
        /// The query to use in the widget.
        /// </summary>
        [Input("query")]
        public Input<string>? Query { get; set; }

        /// <summary>
        /// If the date column should be displayed.
        /// </summary>
        [Input("showDateColumn")]
        public Input<bool>? ShowDateColumn { get; set; }

        /// <summary>
        /// If the message column should be displayed.
        /// </summary>
        [Input("showMessageColumn")]
        public Input<bool>? ShowMessageColumn { get; set; }

        /// <summary>
        /// The facet and order to sort the data, for example: `{"column": "time", "order": "desc"}`.
        /// </summary>
        [Input("sort")]
        public Input<Inputs.PowerpackWidgetLogStreamDefinitionSortArgs>? Sort { get; set; }

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

        public PowerpackWidgetLogStreamDefinitionArgs()
        {
        }
        public static new PowerpackWidgetLogStreamDefinitionArgs Empty => new PowerpackWidgetLogStreamDefinitionArgs();
    }
}