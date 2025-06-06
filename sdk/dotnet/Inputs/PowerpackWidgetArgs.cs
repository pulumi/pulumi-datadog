// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The definition for a Alert Graph widget.
        /// </summary>
        [Input("alertGraphDefinition")]
        public Input<Inputs.PowerpackWidgetAlertGraphDefinitionArgs>? AlertGraphDefinition { get; set; }

        /// <summary>
        /// The definition for a Alert Value widget.
        /// </summary>
        [Input("alertValueDefinition")]
        public Input<Inputs.PowerpackWidgetAlertValueDefinitionArgs>? AlertValueDefinition { get; set; }

        /// <summary>
        /// The definition for a Change widget.
        /// </summary>
        [Input("changeDefinition")]
        public Input<Inputs.PowerpackWidgetChangeDefinitionArgs>? ChangeDefinition { get; set; }

        /// <summary>
        /// The definition for a Check Status widget.
        /// </summary>
        [Input("checkStatusDefinition")]
        public Input<Inputs.PowerpackWidgetCheckStatusDefinitionArgs>? CheckStatusDefinition { get; set; }

        /// <summary>
        /// The definition for a Distribution widget.
        /// </summary>
        [Input("distributionDefinition")]
        public Input<Inputs.PowerpackWidgetDistributionDefinitionArgs>? DistributionDefinition { get; set; }

        /// <summary>
        /// The definition for a Event Stream widget.
        /// </summary>
        [Input("eventStreamDefinition")]
        public Input<Inputs.PowerpackWidgetEventStreamDefinitionArgs>? EventStreamDefinition { get; set; }

        /// <summary>
        /// The definition for a Event Timeline widget.
        /// </summary>
        [Input("eventTimelineDefinition")]
        public Input<Inputs.PowerpackWidgetEventTimelineDefinitionArgs>? EventTimelineDefinition { get; set; }

        /// <summary>
        /// The definition for a Free Text widget.
        /// </summary>
        [Input("freeTextDefinition")]
        public Input<Inputs.PowerpackWidgetFreeTextDefinitionArgs>? FreeTextDefinition { get; set; }

        /// <summary>
        /// The definition for a Geomap widget.
        /// </summary>
        [Input("geomapDefinition")]
        public Input<Inputs.PowerpackWidgetGeomapDefinitionArgs>? GeomapDefinition { get; set; }

        /// <summary>
        /// The definition for a Heatmap widget.
        /// </summary>
        [Input("heatmapDefinition")]
        public Input<Inputs.PowerpackWidgetHeatmapDefinitionArgs>? HeatmapDefinition { get; set; }

        /// <summary>
        /// The definition for a Hostmap widget.
        /// </summary>
        [Input("hostmapDefinition")]
        public Input<Inputs.PowerpackWidgetHostmapDefinitionArgs>? HostmapDefinition { get; set; }

        /// <summary>
        /// The ID of the widget.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// The definition for an Iframe widget.
        /// </summary>
        [Input("iframeDefinition")]
        public Input<Inputs.PowerpackWidgetIframeDefinitionArgs>? IframeDefinition { get; set; }

        /// <summary>
        /// The definition for an Image widget
        /// </summary>
        [Input("imageDefinition")]
        public Input<Inputs.PowerpackWidgetImageDefinitionArgs>? ImageDefinition { get; set; }

        /// <summary>
        /// The definition for a List Stream widget.
        /// </summary>
        [Input("listStreamDefinition")]
        public Input<Inputs.PowerpackWidgetListStreamDefinitionArgs>? ListStreamDefinition { get; set; }

        /// <summary>
        /// The definition for an Log Stream widget.
        /// </summary>
        [Input("logStreamDefinition")]
        public Input<Inputs.PowerpackWidgetLogStreamDefinitionArgs>? LogStreamDefinition { get; set; }

        /// <summary>
        /// The definition for an Manage Status widget.
        /// </summary>
        [Input("manageStatusDefinition")]
        public Input<Inputs.PowerpackWidgetManageStatusDefinitionArgs>? ManageStatusDefinition { get; set; }

        /// <summary>
        /// The definition for a Note widget.
        /// </summary>
        [Input("noteDefinition")]
        public Input<Inputs.PowerpackWidgetNoteDefinitionArgs>? NoteDefinition { get; set; }

        /// <summary>
        /// The definition for a Query Table widget.
        /// </summary>
        [Input("queryTableDefinition")]
        public Input<Inputs.PowerpackWidgetQueryTableDefinitionArgs>? QueryTableDefinition { get; set; }

        /// <summary>
        /// The definition for a Query Value widget.
        /// </summary>
        [Input("queryValueDefinition")]
        public Input<Inputs.PowerpackWidgetQueryValueDefinitionArgs>? QueryValueDefinition { get; set; }

        /// <summary>
        /// The definition for a Run Workflow widget.
        /// </summary>
        [Input("runWorkflowDefinition")]
        public Input<Inputs.PowerpackWidgetRunWorkflowDefinitionArgs>? RunWorkflowDefinition { get; set; }

        /// <summary>
        /// The definition for a Scatterplot widget.
        /// </summary>
        [Input("scatterplotDefinition")]
        public Input<Inputs.PowerpackWidgetScatterplotDefinitionArgs>? ScatterplotDefinition { get; set; }

        /// <summary>
        /// The definition for a Service Level Objective widget.
        /// </summary>
        [Input("serviceLevelObjectiveDefinition")]
        public Input<Inputs.PowerpackWidgetServiceLevelObjectiveDefinitionArgs>? ServiceLevelObjectiveDefinition { get; set; }

        /// <summary>
        /// The definition for a Service Map widget.
        /// </summary>
        [Input("servicemapDefinition")]
        public Input<Inputs.PowerpackWidgetServicemapDefinitionArgs>? ServicemapDefinition { get; set; }

        /// <summary>
        /// The definition for an SLO (Service Level Objective) List widget.
        /// </summary>
        [Input("sloListDefinition")]
        public Input<Inputs.PowerpackWidgetSloListDefinitionArgs>? SloListDefinition { get; set; }

        /// <summary>
        /// The definition for a Sunburst widget.
        /// </summary>
        [Input("sunburstDefinition")]
        public Input<Inputs.PowerpackWidgetSunburstDefinitionArgs>? SunburstDefinition { get; set; }

        /// <summary>
        /// The definition for a Timeseries widget.
        /// </summary>
        [Input("timeseriesDefinition")]
        public Input<Inputs.PowerpackWidgetTimeseriesDefinitionArgs>? TimeseriesDefinition { get; set; }

        /// <summary>
        /// The definition for a Toplist widget.
        /// </summary>
        [Input("toplistDefinition")]
        public Input<Inputs.PowerpackWidgetToplistDefinitionArgs>? ToplistDefinition { get; set; }

        /// <summary>
        /// The definition for a Topology Map widget.
        /// </summary>
        [Input("topologyMapDefinition")]
        public Input<Inputs.PowerpackWidgetTopologyMapDefinitionArgs>? TopologyMapDefinition { get; set; }

        /// <summary>
        /// The definition for a Trace Service widget.
        /// </summary>
        [Input("traceServiceDefinition")]
        public Input<Inputs.PowerpackWidgetTraceServiceDefinitionArgs>? TraceServiceDefinition { get; set; }

        /// <summary>
        /// The definition for a Treemap widget.
        /// </summary>
        [Input("treemapDefinition")]
        public Input<Inputs.PowerpackWidgetTreemapDefinitionArgs>? TreemapDefinition { get; set; }

        /// <summary>
        /// The layout of the widget on a 'free' dashboard.
        /// </summary>
        [Input("widgetLayout")]
        public Input<Inputs.PowerpackWidgetWidgetLayoutArgs>? WidgetLayout { get; set; }

        public PowerpackWidgetArgs()
        {
        }
        public static new PowerpackWidgetArgs Empty => new PowerpackWidgetArgs();
    }
}
