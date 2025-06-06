// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about existing teams for use in other resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const example = datadog.getTeams({
 *     filterKeyword: "team-member@company.com",
 *     filterMe: true,
 * });
 * ```
 */
export function getTeams(args?: GetTeamsArgs, opts?: pulumi.InvokeOptions): Promise<GetTeamsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("datadog:index/getTeams:getTeams", {
        "filterKeyword": args.filterKeyword,
        "filterMe": args.filterMe,
        "teams": args.teams,
    }, opts);
}

/**
 * A collection of arguments for invoking getTeams.
 */
export interface GetTeamsArgs {
    /**
     * Search query. Can be team name, team handle, or email of team member.
     */
    filterKeyword?: string;
    /**
     * When true, only returns teams the current user belongs to.
     */
    filterMe?: boolean;
    /**
     * List of teams
     */
    teams?: inputs.GetTeamsTeam[];
}

/**
 * A collection of values returned by getTeams.
 */
export interface GetTeamsResult {
    /**
     * Search query. Can be team name, team handle, or email of team member.
     */
    readonly filterKeyword?: string;
    /**
     * When true, only returns teams the current user belongs to.
     */
    readonly filterMe?: boolean;
    /**
     * The ID of this resource.
     */
    readonly id: string;
    /**
     * List of teams
     */
    readonly teams?: outputs.GetTeamsTeam[];
}
/**
 * Use this data source to retrieve information about existing teams for use in other resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const example = datadog.getTeams({
 *     filterKeyword: "team-member@company.com",
 *     filterMe: true,
 * });
 * ```
 */
export function getTeamsOutput(args?: GetTeamsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTeamsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("datadog:index/getTeams:getTeams", {
        "filterKeyword": args.filterKeyword,
        "filterMe": args.filterMe,
        "teams": args.teams,
    }, opts);
}

/**
 * A collection of arguments for invoking getTeams.
 */
export interface GetTeamsOutputArgs {
    /**
     * Search query. Can be team name, team handle, or email of team member.
     */
    filterKeyword?: pulumi.Input<string>;
    /**
     * When true, only returns teams the current user belongs to.
     */
    filterMe?: pulumi.Input<boolean>;
    /**
     * List of teams
     */
    teams?: pulumi.Input<pulumi.Input<inputs.GetTeamsTeamArgs>[]>;
}
