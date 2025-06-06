// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetListStreamDefinitionRequestColumnGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Widget column field.
        /// </summary>
        [Input("field", required: true)]
        public Input<string> Field { get; set; } = null!;

        /// <summary>
        /// Widget column width. Valid values are `auto`, `compact`, `full`.
        /// </summary>
        [Input("width", required: true)]
        public Input<string> Width { get; set; } = null!;

        public PowerpackWidgetListStreamDefinitionRequestColumnGetArgs()
        {
        }
        public static new PowerpackWidgetListStreamDefinitionRequestColumnGetArgs Empty => new PowerpackWidgetListStreamDefinitionRequestColumnGetArgs();
    }
}
