// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetServiceLevelObjective
    {
        /// <summary>
        /// Use this data source to retrieve information about an existing SLO for use in other resources.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var test = Output.Create(Datadog.GetServiceLevelObjective.InvokeAsync(new Datadog.GetServiceLevelObjectiveArgs
        ///         {
        ///             NameQuery = "My test SLO",
        ///             TagsQuery = "foo:bar",
        ///         }));
        ///         var apiSlo = Output.Create(Datadog.GetServiceLevelObjective.InvokeAsync(new Datadog.GetServiceLevelObjectiveArgs
        ///         {
        ///             Id = data.Terraform_remote_state.Api.Outputs.Slo,
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetServiceLevelObjectiveResult> InvokeAsync(GetServiceLevelObjectiveArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServiceLevelObjectiveResult>("datadog:index/getServiceLevelObjective:getServiceLevelObjective", args ?? new GetServiceLevelObjectiveArgs(), options.WithVersion());
    }


    public sealed class GetServiceLevelObjectiveArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A SLO ID to limit the search.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Filter results based on SLO numerator and denominator.
        /// </summary>
        [Input("metricsQuery")]
        public string? MetricsQuery { get; set; }

        /// <summary>
        /// Filter results based on SLO names.
        /// </summary>
        [Input("nameQuery")]
        public string? NameQuery { get; set; }

        /// <summary>
        /// Filter results based on a single SLO tag.
        /// </summary>
        [Input("tagsQuery")]
        public string? TagsQuery { get; set; }

        public GetServiceLevelObjectiveArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetServiceLevelObjectiveResult
    {
        /// <summary>
        /// A SLO ID to limit the search.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Filter results based on SLO numerator and denominator.
        /// </summary>
        public readonly string? MetricsQuery;
        /// <summary>
        /// Name of the Datadog service level objective
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Filter results based on SLO names.
        /// </summary>
        public readonly string? NameQuery;
        /// <summary>
        /// Filter results based on a single SLO tag.
        /// </summary>
        public readonly string? TagsQuery;
        /// <summary>
        /// The type of the service level objective. The mapping from these types to the types found in the Datadog Web UI can be found in the Datadog API [documentation page](https://docs.datadoghq.com/api/v1/service-level-objectives/#create-a-slo-object). Available values are: `metric` and `monitor`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetServiceLevelObjectiveResult(
            string? id,

            string? metricsQuery,

            string name,

            string? nameQuery,

            string? tagsQuery,

            string type)
        {
            Id = id;
            MetricsQuery = metricsQuery;
            Name = name;
            NameQuery = nameQuery;
            TagsQuery = tagsQuery;
            Type = type;
        }
    }
}