// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Datadog Application Key resource. This can be used to create and manage Datadog Application Keys. Import functionality for this resource is deprecated and will be removed in a future release with prior notice. Securely store your application keys using a secret management system or use this resource to create and manage new application keys.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * // Create a new Datadog Application Key
 * const foo = new datadog.ApplicationKey("foo", {name: "foo-application"});
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import datadog:index/applicationKey:ApplicationKey foo 11111111-2222-3333-4444-555555555555
 * ```
 */
export class ApplicationKey extends pulumi.CustomResource {
    /**
     * Get an existing ApplicationKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationKeyState, opts?: pulumi.CustomResourceOptions): ApplicationKey {
        return new ApplicationKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/applicationKey:ApplicationKey';

    /**
     * Returns true if the given object is an instance of ApplicationKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplicationKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplicationKey.__pulumiType;
    }

    /**
     * The value of the Application Key.
     */
    public /*out*/ readonly key!: pulumi.Output<string>;
    /**
     * Name for Application Key.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Authorization scopes for the Application Key. Application Keys configured with no scopes have full access.
     */
    public readonly scopes!: pulumi.Output<string[] | undefined>;

    /**
     * Create a ApplicationKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplicationKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplicationKeyArgs | ApplicationKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplicationKeyState | undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["scopes"] = state ? state.scopes : undefined;
        } else {
            const args = argsOrState as ApplicationKeyArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["scopes"] = args ? args.scopes : undefined;
            resourceInputs["key"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["key"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ApplicationKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplicationKey resources.
 */
export interface ApplicationKeyState {
    /**
     * The value of the Application Key.
     */
    key?: pulumi.Input<string>;
    /**
     * Name for Application Key.
     */
    name?: pulumi.Input<string>;
    /**
     * Authorization scopes for the Application Key. Application Keys configured with no scopes have full access.
     */
    scopes?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a ApplicationKey resource.
 */
export interface ApplicationKeyArgs {
    /**
     * Name for Application Key.
     */
    name: pulumi.Input<string>;
    /**
     * Authorization scopes for the Application Key. Application Keys configured with no scopes have full access.
     */
    scopes?: pulumi.Input<pulumi.Input<string>[]>;
}
