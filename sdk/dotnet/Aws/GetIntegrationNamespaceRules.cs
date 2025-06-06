// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Aws
{
    public static class GetIntegrationNamespaceRules
    {
        /// <summary>
        /// Provides a Datadog AWS Integration Namespace Rules data source. This can be used to retrieve all available namespace rules for a Datadog-AWS integration.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var rules = Datadog.Aws.GetIntegrationNamespaceRules.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetIntegrationNamespaceRulesResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIntegrationNamespaceRulesResult>("datadog:aws/getIntegrationNamespaceRules:getIntegrationNamespaceRules", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Provides a Datadog AWS Integration Namespace Rules data source. This can be used to retrieve all available namespace rules for a Datadog-AWS integration.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var rules = Datadog.Aws.GetIntegrationNamespaceRules.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIntegrationNamespaceRulesResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIntegrationNamespaceRulesResult>("datadog:aws/getIntegrationNamespaceRules:getIntegrationNamespaceRules", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Provides a Datadog AWS Integration Namespace Rules data source. This can be used to retrieve all available namespace rules for a Datadog-AWS integration.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var rules = Datadog.Aws.GetIntegrationNamespaceRules.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIntegrationNamespaceRulesResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetIntegrationNamespaceRulesResult>("datadog:aws/getIntegrationNamespaceRules:getIntegrationNamespaceRules", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetIntegrationNamespaceRulesResult
    {
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The list of available namespace rules for a Datadog-AWS integration.
        /// </summary>
        public readonly ImmutableArray<string> NamespaceRules;

        [OutputConstructor]
        private GetIntegrationNamespaceRulesResult(
            string id,

            ImmutableArray<string> namespaceRules)
        {
            Id = id;
            NamespaceRules = namespaceRules;
        }
    }
}
