// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for interacting with Datadog Microsoft Teams Integration tenant-based handles.
 */
export class IntegrationTeamsTenantBasedHandle extends pulumi.CustomResource {
    /**
     * Get an existing IntegrationTeamsTenantBasedHandle resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IntegrationTeamsTenantBasedHandleState, opts?: pulumi.CustomResourceOptions): IntegrationTeamsTenantBasedHandle {
        return new IntegrationTeamsTenantBasedHandle(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:ms/integrationTeamsTenantBasedHandle:IntegrationTeamsTenantBasedHandle';

    /**
     * Returns true if the given object is an instance of IntegrationTeamsTenantBasedHandle.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IntegrationTeamsTenantBasedHandle {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IntegrationTeamsTenantBasedHandle.__pulumiType;
    }

    /**
     * Your channel name.
     */
    public readonly channelName!: pulumi.Output<string>;
    /**
     * Your tenant-based handle name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Your team name.
     */
    public readonly teamName!: pulumi.Output<string>;
    /**
     * Your tenant name.
     */
    public readonly tenantName!: pulumi.Output<string>;

    /**
     * Create a IntegrationTeamsTenantBasedHandle resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IntegrationTeamsTenantBasedHandleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IntegrationTeamsTenantBasedHandleArgs | IntegrationTeamsTenantBasedHandleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IntegrationTeamsTenantBasedHandleState | undefined;
            resourceInputs["channelName"] = state ? state.channelName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["teamName"] = state ? state.teamName : undefined;
            resourceInputs["tenantName"] = state ? state.tenantName : undefined;
        } else {
            const args = argsOrState as IntegrationTeamsTenantBasedHandleArgs | undefined;
            if ((!args || args.channelName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'channelName'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.teamName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'teamName'");
            }
            if ((!args || args.tenantName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tenantName'");
            }
            resourceInputs["channelName"] = args ? args.channelName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["teamName"] = args ? args.teamName : undefined;
            resourceInputs["tenantName"] = args ? args.tenantName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IntegrationTeamsTenantBasedHandle.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IntegrationTeamsTenantBasedHandle resources.
 */
export interface IntegrationTeamsTenantBasedHandleState {
    /**
     * Your channel name.
     */
    channelName?: pulumi.Input<string>;
    /**
     * Your tenant-based handle name.
     */
    name?: pulumi.Input<string>;
    /**
     * Your team name.
     */
    teamName?: pulumi.Input<string>;
    /**
     * Your tenant name.
     */
    tenantName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IntegrationTeamsTenantBasedHandle resource.
 */
export interface IntegrationTeamsTenantBasedHandleArgs {
    /**
     * Your channel name.
     */
    channelName: pulumi.Input<string>;
    /**
     * Your tenant-based handle name.
     */
    name: pulumi.Input<string>;
    /**
     * Your team name.
     */
    teamName: pulumi.Input<string>;
    /**
     * Your tenant name.
     */
    tenantName: pulumi.Input<string>;
}
