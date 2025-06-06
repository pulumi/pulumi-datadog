// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class GetTeamsTeamArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Free-form markdown description/content for the team's homepage.
        /// </summary>
        [Input("description", required: true)]
        public string Description { get; set; } = null!;

        /// <summary>
        /// The team's handle.
        /// </summary>
        [Input("handle", required: true)]
        public string Handle { get; set; } = null!;

        /// <summary>
        /// The team's identifier.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// The number of links belonging to the team.
        /// </summary>
        [Input("linkCount", required: true)]
        public int LinkCount { get; set; }

        /// <summary>
        /// The name of the team.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// A brief summary of the team, derived from the `description`.
        /// </summary>
        [Input("summary", required: true)]
        public string Summary { get; set; } = null!;

        /// <summary>
        /// The number of users belonging to the team.
        /// </summary>
        [Input("userCount", required: true)]
        public int UserCount { get; set; }

        public GetTeamsTeamArgs()
        {
        }
        public static new GetTeamsTeamArgs Empty => new GetTeamsTeamArgs();
    }
}
