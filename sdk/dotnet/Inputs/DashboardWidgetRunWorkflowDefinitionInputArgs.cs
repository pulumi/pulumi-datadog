// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetRunWorkflowDefinitionInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the workflow input.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Dashboard template variable. Can be suffixed with `.value` or `.key`.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public DashboardWidgetRunWorkflowDefinitionInputArgs()
        {
        }
        public static new DashboardWidgetRunWorkflowDefinitionInputArgs Empty => new DashboardWidgetRunWorkflowDefinitionInputArgs();
    }
}
