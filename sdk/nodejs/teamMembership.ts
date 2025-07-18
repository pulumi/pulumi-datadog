// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Datadog TeamMembership resource. This can be used to create and manage Datadog team_membership.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const foo = new datadog.Team("foo", {
 *     description: "Example team",
 *     handle: "example-team-updated",
 *     name: "Example Team-updated",
 * });
 * const fooUser = new datadog.User("foo", {email: "new@example.com"});
 * // Create new team_membership resource
 * const fooTeamMembership = new datadog.TeamMembership("foo", {
 *     teamId: foo.id,
 *     userId: fooUser.id,
 *     role: "admin",
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * This resource is imported using team_id and user_id seperated by `:`.
 *
 * ```sh
 * $ pulumi import datadog:index/teamMembership:TeamMembership foo "${team_id}:${user_id}"
 * ```
 */
export class TeamMembership extends pulumi.CustomResource {
    /**
     * Get an existing TeamMembership resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamMembershipState, opts?: pulumi.CustomResourceOptions): TeamMembership {
        return new TeamMembership(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/teamMembership:TeamMembership';

    /**
     * Returns true if the given object is an instance of TeamMembership.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TeamMembership {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TeamMembership.__pulumiType;
    }

    /**
     * The user's role within the team. Valid values are `admin`.
     */
    public readonly role!: pulumi.Output<string | undefined>;
    /**
     * ID of the team the team membership is associated with.
     */
    public readonly teamId!: pulumi.Output<string>;
    /**
     * The ID of the user.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a TeamMembership resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TeamMembershipArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamMembershipArgs | TeamMembershipState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamMembershipState | undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["teamId"] = state ? state.teamId : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as TeamMembershipArgs | undefined;
            if ((!args || args.teamId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'teamId'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["teamId"] = args ? args.teamId : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TeamMembership.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TeamMembership resources.
 */
export interface TeamMembershipState {
    /**
     * The user's role within the team. Valid values are `admin`.
     */
    role?: pulumi.Input<string>;
    /**
     * ID of the team the team membership is associated with.
     */
    teamId?: pulumi.Input<string>;
    /**
     * The ID of the user.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TeamMembership resource.
 */
export interface TeamMembershipArgs {
    /**
     * The user's role within the team. Valid values are `admin`.
     */
    role?: pulumi.Input<string>;
    /**
     * ID of the team the team membership is associated with.
     */
    teamId: pulumi.Input<string>;
    /**
     * The ID of the user.
     */
    userId: pulumi.Input<string>;
}
