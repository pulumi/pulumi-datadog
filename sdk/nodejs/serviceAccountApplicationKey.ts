// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Datadog `serviceAccountApplicationKey` resource. This can be used to create and manage Datadog service account application keys.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * // Create new service_account_application_key resource
 * const foo = new datadog.ServiceAccountApplicationKey("foo", {
 *     name: "Application key for managing dashboards",
 *     serviceAccountId: "00000000-0000-1234-0000-000000000000",
 * });
 * ```
 *
 * ## Import
 *
 * Importing a service account's application key cannot import the value of the key.
 *
 * ```sh
 *  $ pulumi import datadog:index/serviceAccountApplicationKey:ServiceAccountApplicationKey this "<service_account_id>:<application_key_id>"
 * ```
 */
export class ServiceAccountApplicationKey extends pulumi.CustomResource {
    /**
     * Get an existing ServiceAccountApplicationKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceAccountApplicationKeyState, opts?: pulumi.CustomResourceOptions): ServiceAccountApplicationKey {
        return new ServiceAccountApplicationKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/serviceAccountApplicationKey:ServiceAccountApplicationKey';

    /**
     * Returns true if the given object is an instance of ServiceAccountApplicationKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceAccountApplicationKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceAccountApplicationKey.__pulumiType;
    }

    /**
     * Creation date of the application key.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The value of the service account application key. This value cannot be imported.
     */
    public /*out*/ readonly key!: pulumi.Output<string>;
    /**
     * The last four characters of the application key.
     */
    public /*out*/ readonly last4!: pulumi.Output<string>;
    /**
     * Name of the application key.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * ID of the service account that owns this key.
     */
    public readonly serviceAccountId!: pulumi.Output<string>;

    /**
     * Create a ServiceAccountApplicationKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceAccountApplicationKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceAccountApplicationKeyArgs | ServiceAccountApplicationKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceAccountApplicationKeyState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["last4"] = state ? state.last4 : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["serviceAccountId"] = state ? state.serviceAccountId : undefined;
        } else {
            const args = argsOrState as ServiceAccountApplicationKeyArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.serviceAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceAccountId'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["serviceAccountId"] = args ? args.serviceAccountId : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["key"] = undefined /*out*/;
            resourceInputs["last4"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["key"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ServiceAccountApplicationKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceAccountApplicationKey resources.
 */
export interface ServiceAccountApplicationKeyState {
    /**
     * Creation date of the application key.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The value of the service account application key. This value cannot be imported.
     */
    key?: pulumi.Input<string>;
    /**
     * The last four characters of the application key.
     */
    last4?: pulumi.Input<string>;
    /**
     * Name of the application key.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the service account that owns this key.
     */
    serviceAccountId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceAccountApplicationKey resource.
 */
export interface ServiceAccountApplicationKeyArgs {
    /**
     * Name of the application key.
     */
    name: pulumi.Input<string>;
    /**
     * ID of the service account that owns this key.
     */
    serviceAccountId: pulumi.Input<string>;
}