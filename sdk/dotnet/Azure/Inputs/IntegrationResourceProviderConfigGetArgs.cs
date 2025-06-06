// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Azure.Inputs
{

    public sealed class IntegrationResourceProviderConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("metricsEnabled", required: true)]
        public Input<bool> MetricsEnabled { get; set; } = null!;

        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        public IntegrationResourceProviderConfigGetArgs()
        {
        }
        public static new IntegrationResourceProviderConfigGetArgs Empty => new IntegrationResourceProviderConfigGetArgs();
    }
}
