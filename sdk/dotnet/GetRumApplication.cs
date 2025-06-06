// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetRumApplication
    {
        /// <summary>
        /// Use this data source to retrieve a Datadog RUM Application.
        /// </summary>
        public static Task<GetRumApplicationResult> InvokeAsync(GetRumApplicationArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRumApplicationResult>("datadog:index/getRumApplication:getRumApplication", args ?? new GetRumApplicationArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve a Datadog RUM Application.
        /// </summary>
        public static Output<GetRumApplicationResult> Invoke(GetRumApplicationInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRumApplicationResult>("datadog:index/getRumApplication:getRumApplication", args ?? new GetRumApplicationInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve a Datadog RUM Application.
        /// </summary>
        public static Output<GetRumApplicationResult> Invoke(GetRumApplicationInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRumApplicationResult>("datadog:index/getRumApplication:getRumApplication", args ?? new GetRumApplicationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRumApplicationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the RUM application. Cannot be used with name and type filters.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The name used to search for a RUM application.
        /// </summary>
        [Input("nameFilter")]
        public string? NameFilter { get; set; }

        /// <summary>
        /// The type used to search for a RUM application.
        /// </summary>
        [Input("typeFilter")]
        public string? TypeFilter { get; set; }

        public GetRumApplicationArgs()
        {
        }
        public static new GetRumApplicationArgs Empty => new GetRumApplicationArgs();
    }

    public sealed class GetRumApplicationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the RUM application. Cannot be used with name and type filters.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name used to search for a RUM application.
        /// </summary>
        [Input("nameFilter")]
        public Input<string>? NameFilter { get; set; }

        /// <summary>
        /// The type used to search for a RUM application.
        /// </summary>
        [Input("typeFilter")]
        public Input<string>? TypeFilter { get; set; }

        public GetRumApplicationInvokeArgs()
        {
        }
        public static new GetRumApplicationInvokeArgs Empty => new GetRumApplicationInvokeArgs();
    }


    [OutputType]
    public sealed class GetRumApplicationResult
    {
        /// <summary>
        /// The client token.
        /// </summary>
        public readonly string ClientToken;
        /// <summary>
        /// ID of the RUM application. Cannot be used with name and type filters.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the RUM application.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The name used to search for a RUM application.
        /// </summary>
        public readonly string? NameFilter;
        /// <summary>
        /// Type of the RUM application. Supported values are `browser`, `ios`, `android`, `react-native`, `flutter`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The type used to search for a RUM application.
        /// </summary>
        public readonly string? TypeFilter;

        [OutputConstructor]
        private GetRumApplicationResult(
            string clientToken,

            string id,

            string name,

            string? nameFilter,

            string type,

            string? typeFilter)
        {
            ClientToken = clientToken;
            Id = id;
            Name = name;
            NameFilter = nameFilter;
            Type = type;
            TypeFilter = typeFilter;
        }
    }
}
