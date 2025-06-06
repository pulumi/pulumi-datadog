// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetTimeseriesDefinitionRequestMetadataArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The expression alias.
        /// </summary>
        [Input("aliasName")]
        public Input<string>? AliasName { get; set; }

        /// <summary>
        /// The expression name.
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        public PowerpackWidgetTimeseriesDefinitionRequestMetadataArgs()
        {
        }
        public static new PowerpackWidgetTimeseriesDefinitionRequestMetadataArgs Empty => new PowerpackWidgetTimeseriesDefinitionRequestMetadataArgs();
    }
}
