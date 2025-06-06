// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetPowerpackDefinitionTemplateVariablesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("controlledByPowerpacks")]
        private InputList<Inputs.DashboardWidgetPowerpackDefinitionTemplateVariablesControlledByPowerpackGetArgs>? _controlledByPowerpacks;

        /// <summary>
        /// Template variables controlled at the powerpack level.
        /// </summary>
        public InputList<Inputs.DashboardWidgetPowerpackDefinitionTemplateVariablesControlledByPowerpackGetArgs> ControlledByPowerpacks
        {
            get => _controlledByPowerpacks ?? (_controlledByPowerpacks = new InputList<Inputs.DashboardWidgetPowerpackDefinitionTemplateVariablesControlledByPowerpackGetArgs>());
            set => _controlledByPowerpacks = value;
        }

        [Input("controlledExternallies")]
        private InputList<Inputs.DashboardWidgetPowerpackDefinitionTemplateVariablesControlledExternallyGetArgs>? _controlledExternallies;

        /// <summary>
        /// Template variables controlled by the external resource, such as the dashboard this powerpack is on.
        /// </summary>
        public InputList<Inputs.DashboardWidgetPowerpackDefinitionTemplateVariablesControlledExternallyGetArgs> ControlledExternallies
        {
            get => _controlledExternallies ?? (_controlledExternallies = new InputList<Inputs.DashboardWidgetPowerpackDefinitionTemplateVariablesControlledExternallyGetArgs>());
            set => _controlledExternallies = value;
        }

        public DashboardWidgetPowerpackDefinitionTemplateVariablesGetArgs()
        {
        }
        public static new DashboardWidgetPowerpackDefinitionTemplateVariablesGetArgs Empty => new DashboardWidgetPowerpackDefinitionTemplateVariablesGetArgs();
    }
}
