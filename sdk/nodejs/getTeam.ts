// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about an existing Datadog team.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const foo = datadog.getTeam({
 *     teamId: "e6723c40-edb1-11ed-b816-da7ad0900002",
 * });
 * ```
 */
export function getTeam(args?: GetTeamArgs, opts?: pulumi.InvokeOptions): Promise<GetTeamResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("datadog:index/getTeam:getTeam", {
        "filterKeyword": args.filterKeyword,
        "teamId": args.teamId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTeam.
 */
export interface GetTeamArgs {
    /**
     * Search query. Can be team name, team handle, or email of team member.
     */
    filterKeyword?: string;
    /**
     * The team's identifier.
     */
    teamId?: string;
}

/**
 * A collection of values returned by getTeam.
 */
export interface GetTeamResult {
    /**
     * Free-form markdown description/content for the team's homepage.
     */
    readonly description: string;
    /**
     * Search query. Can be team name, team handle, or email of team member.
     */
    readonly filterKeyword?: string;
    /**
     * The team's handle.
     */
    readonly handle: string;
    /**
     * The ID of this resource.
     */
    readonly id: string;
    /**
     * The number of links belonging to the team.
     */
    readonly linkCount: number;
    /**
     * The name of the team.
     */
    readonly name: string;
    /**
     * A brief summary of the team, derived from the `description`.
     */
    readonly summary: string;
    /**
     * The team's identifier.
     */
    readonly teamId: string;
    /**
     * The number of users belonging to the team.
     */
    readonly userCount: number;
}
/**
 * Use this data source to retrieve information about an existing Datadog team.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const foo = datadog.getTeam({
 *     teamId: "e6723c40-edb1-11ed-b816-da7ad0900002",
 * });
 * ```
 */
export function getTeamOutput(args?: GetTeamOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTeamResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("datadog:index/getTeam:getTeam", {
        "filterKeyword": args.filterKeyword,
        "teamId": args.teamId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTeam.
 */
export interface GetTeamOutputArgs {
    /**
     * Search query. Can be team name, team handle, or email of team member.
     */
    filterKeyword?: pulumi.Input<string>;
    /**
     * The team's identifier.
     */
    teamId?: pulumi.Input<string>;
}
