// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmStatsQueryGetArgs : Pulumi.ResourceArgs
    {
        [Input("columns")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmStatsQueryColumnGetArgs>? _columns;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmStatsQueryColumnGetArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmStatsQueryColumnGetArgs>());
            set => _columns = value;
        }

        [Input("env", required: true)]
        public Input<string> Env { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("primaryTag", required: true)]
        public Input<string> PrimaryTag { get; set; } = null!;

        [Input("resource")]
        public Input<string>? Resource { get; set; }

        [Input("rowType", required: true)]
        public Input<string> RowType { get; set; } = null!;

        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmStatsQueryGetArgs()
        {
        }
    }
}