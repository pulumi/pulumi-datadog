// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetQueryTableDefinitionRequestTextFormatArgs : global::Pulumi.ResourceArgs
    {
        [Input("textFormats")]
        private InputList<Inputs.PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormatArgs>? _textFormats;

        /// <summary>
        /// The text format to apply to the items in a table widget column.
        /// </summary>
        public InputList<Inputs.PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormatArgs> TextFormats
        {
            get => _textFormats ?? (_textFormats = new InputList<Inputs.PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormatArgs>());
            set => _textFormats = value;
        }

        public PowerpackWidgetQueryTableDefinitionRequestTextFormatArgs()
        {
        }
        public static new PowerpackWidgetQueryTableDefinitionRequestTextFormatArgs Empty => new PowerpackWidgetQueryTableDefinitionRequestTextFormatArgs();
    }
}