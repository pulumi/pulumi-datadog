// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Datadog Logs Index API resource. This can be used to manage the order of Datadog logs indexes.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const sampleIndexOrder = new datadog.LogsIndexOrder("sample_index_order", {
 *     name: "sample_index_order",
 *     indexes: [sampleIndex.id],
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * The Datadog Terraform Provider does not support the creation and deletion of index orders. There must be at most one `datadog_logs_index_order` resource
 *
 * `<name>` can be whatever you specify in your code. Datadog does not store the name on the server.
 *
 * ```sh
 * $ pulumi import datadog:index/logsIndexOrder:LogsIndexOrder name> <name>
 * ```
 */
export class LogsIndexOrder extends pulumi.CustomResource {
    /**
     * Get an existing LogsIndexOrder resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogsIndexOrderState, opts?: pulumi.CustomResourceOptions): LogsIndexOrder {
        return new LogsIndexOrder(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/logsIndexOrder:LogsIndexOrder';

    /**
     * Returns true if the given object is an instance of LogsIndexOrder.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogsIndexOrder {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogsIndexOrder.__pulumiType;
    }

    /**
     * The index resource list. Logs are tested against the query filter of each index one by one following the order of the list.
     */
    public readonly indexes!: pulumi.Output<string[]>;
    /**
     * The unique name of the index order resource.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a LogsIndexOrder resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogsIndexOrderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogsIndexOrderArgs | LogsIndexOrderState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogsIndexOrderState | undefined;
            resourceInputs["indexes"] = state ? state.indexes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as LogsIndexOrderArgs | undefined;
            if ((!args || args.indexes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'indexes'");
            }
            resourceInputs["indexes"] = args ? args.indexes : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LogsIndexOrder.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogsIndexOrder resources.
 */
export interface LogsIndexOrderState {
    /**
     * The index resource list. Logs are tested against the query filter of each index one by one following the order of the list.
     */
    indexes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique name of the index order resource.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LogsIndexOrder resource.
 */
export interface LogsIndexOrderArgs {
    /**
     * The index resource list. Logs are tested against the query filter of each index one by one following the order of the list.
     */
    indexes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique name of the index order resource.
     */
    name?: pulumi.Input<string>;
}
