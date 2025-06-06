// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class AppsecWafExclusionFilterScope
    {
        /// <summary>
        /// Deploy on this environment.
        /// </summary>
        public readonly string? Env;
        /// <summary>
        /// Deploy on this service.
        /// </summary>
        public readonly string? Service;

        [OutputConstructor]
        private AppsecWafExclusionFilterScope(
            string? env,

            string? service)
        {
            Env = env;
            Service = service;
        }
    }
}
