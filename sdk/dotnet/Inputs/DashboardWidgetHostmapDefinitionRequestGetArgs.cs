// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetHostmapDefinitionRequestGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("fills")]
        private InputList<Inputs.DashboardWidgetHostmapDefinitionRequestFillGetArgs>? _fills;

        /// <summary>
        /// The query used to fill the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
        /// </summary>
        public InputList<Inputs.DashboardWidgetHostmapDefinitionRequestFillGetArgs> Fills
        {
            get => _fills ?? (_fills = new InputList<Inputs.DashboardWidgetHostmapDefinitionRequestFillGetArgs>());
            set => _fills = value;
        }

        [Input("sizes")]
        private InputList<Inputs.DashboardWidgetHostmapDefinitionRequestSizeGetArgs>? _sizes;

        /// <summary>
        /// The query used to size the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
        /// </summary>
        public InputList<Inputs.DashboardWidgetHostmapDefinitionRequestSizeGetArgs> Sizes
        {
            get => _sizes ?? (_sizes = new InputList<Inputs.DashboardWidgetHostmapDefinitionRequestSizeGetArgs>());
            set => _sizes = value;
        }

        public DashboardWidgetHostmapDefinitionRequestGetArgs()
        {
        }
        public static new DashboardWidgetHostmapDefinitionRequestGetArgs Empty => new DashboardWidgetHostmapDefinitionRequestGetArgs();
    }
}
