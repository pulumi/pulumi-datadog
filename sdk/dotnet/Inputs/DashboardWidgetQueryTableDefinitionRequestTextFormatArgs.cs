// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetQueryTableDefinitionRequestTextFormatArgs : global::Pulumi.ResourceArgs
    {
        [Input("textFormats")]
        private InputList<Inputs.DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatArgs>? _textFormats;

        /// <summary>
        /// The text format to apply to the items in a table widget column.
        /// </summary>
        public InputList<Inputs.DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatArgs> TextFormats
        {
            get => _textFormats ?? (_textFormats = new InputList<Inputs.DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatArgs>());
            set => _textFormats = value;
        }

        public DashboardWidgetQueryTableDefinitionRequestTextFormatArgs()
        {
        }
        public static new DashboardWidgetQueryTableDefinitionRequestTextFormatArgs Empty => new DashboardWidgetQueryTableDefinitionRequestTextFormatArgs();
    }
}