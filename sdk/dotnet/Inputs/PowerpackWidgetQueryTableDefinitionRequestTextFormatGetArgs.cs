// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetQueryTableDefinitionRequestTextFormatGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("textFormats")]
        private InputList<Inputs.PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormatGetArgs>? _textFormats;

        /// <summary>
        /// The text format to apply to the items in a table widget column.
        /// </summary>
        public InputList<Inputs.PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormatGetArgs> TextFormats
        {
            get => _textFormats ?? (_textFormats = new InputList<Inputs.PowerpackWidgetQueryTableDefinitionRequestTextFormatTextFormatGetArgs>());
            set => _textFormats = value;
        }

        public PowerpackWidgetQueryTableDefinitionRequestTextFormatGetArgs()
        {
        }
        public static new PowerpackWidgetQueryTableDefinitionRequestTextFormatGetArgs Empty => new PowerpackWidgetQueryTableDefinitionRequestTextFormatGetArgs();
    }
}
