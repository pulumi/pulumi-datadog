// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetListStreamDefinitionRequestArgs : Pulumi.ResourceArgs
    {
        [Input("columns", required: true)]
        private InputList<Inputs.DashboardWidgetListStreamDefinitionRequestColumnArgs>? _columns;
        public InputList<Inputs.DashboardWidgetListStreamDefinitionRequestColumnArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.DashboardWidgetListStreamDefinitionRequestColumnArgs>());
            set => _columns = value;
        }

        [Input("query", required: true)]
        public Input<Inputs.DashboardWidgetListStreamDefinitionRequestQueryArgs> Query { get; set; } = null!;

        [Input("responseFormat", required: true)]
        public Input<string> ResponseFormat { get; set; } = null!;

        public DashboardWidgetListStreamDefinitionRequestArgs()
        {
        }
    }
}