// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for interacting with Datadog Microsoft Teams integration Microsoft Workflows webhook handles.
 */
export class IntegrationTeamsWorkflowsWebhookHandle extends pulumi.CustomResource {
    /**
     * Get an existing IntegrationTeamsWorkflowsWebhookHandle resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IntegrationTeamsWorkflowsWebhookHandleState, opts?: pulumi.CustomResourceOptions): IntegrationTeamsWorkflowsWebhookHandle {
        return new IntegrationTeamsWorkflowsWebhookHandle(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:ms/integrationTeamsWorkflowsWebhookHandle:IntegrationTeamsWorkflowsWebhookHandle';

    /**
     * Returns true if the given object is an instance of IntegrationTeamsWorkflowsWebhookHandle.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IntegrationTeamsWorkflowsWebhookHandle {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IntegrationTeamsWorkflowsWebhookHandle.__pulumiType;
    }

    /**
     * Your Microsoft Workflows webhook handle name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Your Microsoft Workflows webhook URL.
     */
    public readonly url!: pulumi.Output<string>;

    /**
     * Create a IntegrationTeamsWorkflowsWebhookHandle resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IntegrationTeamsWorkflowsWebhookHandleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IntegrationTeamsWorkflowsWebhookHandleArgs | IntegrationTeamsWorkflowsWebhookHandleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IntegrationTeamsWorkflowsWebhookHandleState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as IntegrationTeamsWorkflowsWebhookHandleArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["url"] = args?.url ? pulumi.secret(args.url) : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["url"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(IntegrationTeamsWorkflowsWebhookHandle.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IntegrationTeamsWorkflowsWebhookHandle resources.
 */
export interface IntegrationTeamsWorkflowsWebhookHandleState {
    /**
     * Your Microsoft Workflows webhook handle name.
     */
    name?: pulumi.Input<string>;
    /**
     * Your Microsoft Workflows webhook URL.
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IntegrationTeamsWorkflowsWebhookHandle resource.
 */
export interface IntegrationTeamsWorkflowsWebhookHandleArgs {
    /**
     * Your Microsoft Workflows webhook handle name.
     */
    name: pulumi.Input<string>;
    /**
     * Your Microsoft Workflows webhook URL.
     */
    url: pulumi.Input<string>;
}
