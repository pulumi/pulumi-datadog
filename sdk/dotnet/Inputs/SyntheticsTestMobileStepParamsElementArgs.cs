// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SyntheticsTestMobileStepParamsElementArgs : global::Pulumi.ResourceArgs
    {
        [Input("context")]
        public Input<string>? Context { get; set; }

        /// <summary>
        /// Valid values are `native`, `web`.
        /// </summary>
        [Input("contextType")]
        public Input<string>? ContextType { get; set; }

        [Input("elementDescription")]
        public Input<string>? ElementDescription { get; set; }

        [Input("multiLocator")]
        private InputMap<string>? _multiLocator;
        public InputMap<string> MultiLocator
        {
            get => _multiLocator ?? (_multiLocator = new InputMap<string>());
            set => _multiLocator = value;
        }

        [Input("relativePosition")]
        public Input<Inputs.SyntheticsTestMobileStepParamsElementRelativePositionArgs>? RelativePosition { get; set; }

        [Input("textContent")]
        public Input<string>? TextContent { get; set; }

        [Input("userLocator")]
        public Input<Inputs.SyntheticsTestMobileStepParamsElementUserLocatorArgs>? UserLocator { get; set; }

        [Input("viewName")]
        public Input<string>? ViewName { get; set; }

        public SyntheticsTestMobileStepParamsElementArgs()
        {
        }
        public static new SyntheticsTestMobileStepParamsElementArgs Empty => new SyntheticsTestMobileStepParamsElementArgs();
    }
}
