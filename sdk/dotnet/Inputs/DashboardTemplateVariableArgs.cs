// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardTemplateVariableArgs : global::Pulumi.ResourceArgs
    {
        [Input("availableValues")]
        private InputList<string>? _availableValues;

        /// <summary>
        /// The list of values that the template variable drop-down is be limited to
        /// </summary>
        public InputList<string> AvailableValues
        {
            get => _availableValues ?? (_availableValues = new InputList<string>());
            set => _availableValues = value;
        }

        /// <summary>
        /// The default value for the template variable on dashboard load. Cannot be used in conjunction with `defaults`. **Deprecated.** Use `defaults` instead.
        /// </summary>
        [Input("default")]
        public Input<string>? Default { get; set; }

        [Input("defaults")]
        private InputList<string>? _defaults;

        /// <summary>
        /// One or many default values for template variables on load. If more than one default is specified, they will be unioned together with `OR`. Cannot be used in conjunction with `default`.
        /// </summary>
        public InputList<string> Defaults
        {
            get => _defaults ?? (_defaults = new InputList<string>());
            set => _defaults = value;
        }

        /// <summary>
        /// The name of the variable.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The tag prefix associated with the variable. Only tags with this prefix appear in the variable dropdown.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        public DashboardTemplateVariableArgs()
        {
        }
        public static new DashboardTemplateVariableArgs Empty => new DashboardTemplateVariableArgs();
    }
}
