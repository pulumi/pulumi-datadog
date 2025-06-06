// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetTreemapDefinitionArgs : global::Pulumi.ResourceArgs
    {
        [Input("requests")]
        private InputList<Inputs.PowerpackWidgetTreemapDefinitionRequestArgs>? _requests;

        /// <summary>
        /// Nested block describing the request to use when displaying the widget.
        /// </summary>
        public InputList<Inputs.PowerpackWidgetTreemapDefinitionRequestArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.PowerpackWidgetTreemapDefinitionRequestArgs>());
            set => _requests = value;
        }

        /// <summary>
        /// The title of the widget.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        public PowerpackWidgetTreemapDefinitionArgs()
        {
        }
        public static new PowerpackWidgetTreemapDefinitionArgs Empty => new PowerpackWidgetTreemapDefinitionArgs();
    }
}
