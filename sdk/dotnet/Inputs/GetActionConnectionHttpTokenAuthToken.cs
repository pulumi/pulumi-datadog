// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class GetActionConnectionHttpTokenAuthTokenArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Token name
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Token type
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        [Input("value", required: true)]
        private string? _value;

        /// <summary>
        /// Token value
        /// </summary>
        public string? Value
        {
            get => _value;
            set => _value = value;
        }

        public GetActionConnectionHttpTokenAuthTokenArgs()
        {
        }
        public static new GetActionConnectionHttpTokenAuthTokenArgs Empty => new GetActionConnectionHttpTokenAuthTokenArgs();
    }
}
