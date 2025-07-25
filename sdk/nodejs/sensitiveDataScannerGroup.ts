// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Sensitive Data Scanner group resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * // Create new sensitive_data_scanner_group resource
 * const mygroup = new datadog.SensitiveDataScannerGroup("mygroup", {
 *     name: "My new scanning group",
 *     description: "A relevant description",
 *     filter: {
 *         query: "service:my-service",
 *     },
 *     isEnabled: true,
 *     productLists: [
 *         "apm",
 *         "logs",
 *     ],
 *     samplings: [
 *         {
 *             product: "apm",
 *             rate: 100,
 *         },
 *         {
 *             product: "logs",
 *             rate: 10,
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import datadog:index/sensitiveDataScannerGroup:SensitiveDataScannerGroup new_list "<group_id>"
 * ```
 */
export class SensitiveDataScannerGroup extends pulumi.CustomResource {
    /**
     * Get an existing SensitiveDataScannerGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SensitiveDataScannerGroupState, opts?: pulumi.CustomResourceOptions): SensitiveDataScannerGroup {
        return new SensitiveDataScannerGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/sensitiveDataScannerGroup:SensitiveDataScannerGroup';

    /**
     * Returns true if the given object is an instance of SensitiveDataScannerGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SensitiveDataScannerGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SensitiveDataScannerGroup.__pulumiType;
    }

    /**
     * Description of the Datadog scanning group.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Filter object the scanning group applies.
     */
    public readonly filter!: pulumi.Output<outputs.SensitiveDataScannerGroupFilter>;
    /**
     * Whether or not the scanning group is enabled. If the group doesn't contain any rule or if all the rules in it are disabled, the group is force-disabled by our backend
     */
    public readonly isEnabled!: pulumi.Output<boolean>;
    /**
     * Name of the Datadog scanning group.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * List of products the scanning group applies. Valid values are `logs`, `rum`, `events`, `apm`.
     */
    public readonly productLists!: pulumi.Output<string[]>;
    /**
     * List of sampling configurations per product type for the scanning group.
     */
    public readonly samplings!: pulumi.Output<outputs.SensitiveDataScannerGroupSampling[] | undefined>;

    /**
     * Create a SensitiveDataScannerGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SensitiveDataScannerGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SensitiveDataScannerGroupArgs | SensitiveDataScannerGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SensitiveDataScannerGroupState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["filter"] = state ? state.filter : undefined;
            resourceInputs["isEnabled"] = state ? state.isEnabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["productLists"] = state ? state.productLists : undefined;
            resourceInputs["samplings"] = state ? state.samplings : undefined;
        } else {
            const args = argsOrState as SensitiveDataScannerGroupArgs | undefined;
            if ((!args || args.filter === undefined) && !opts.urn) {
                throw new Error("Missing required property 'filter'");
            }
            if ((!args || args.isEnabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'isEnabled'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.productLists === undefined) && !opts.urn) {
                throw new Error("Missing required property 'productLists'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["filter"] = args ? args.filter : undefined;
            resourceInputs["isEnabled"] = args ? args.isEnabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["productLists"] = args ? args.productLists : undefined;
            resourceInputs["samplings"] = args ? args.samplings : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SensitiveDataScannerGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SensitiveDataScannerGroup resources.
 */
export interface SensitiveDataScannerGroupState {
    /**
     * Description of the Datadog scanning group.
     */
    description?: pulumi.Input<string>;
    /**
     * Filter object the scanning group applies.
     */
    filter?: pulumi.Input<inputs.SensitiveDataScannerGroupFilter>;
    /**
     * Whether or not the scanning group is enabled. If the group doesn't contain any rule or if all the rules in it are disabled, the group is force-disabled by our backend
     */
    isEnabled?: pulumi.Input<boolean>;
    /**
     * Name of the Datadog scanning group.
     */
    name?: pulumi.Input<string>;
    /**
     * List of products the scanning group applies. Valid values are `logs`, `rum`, `events`, `apm`.
     */
    productLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of sampling configurations per product type for the scanning group.
     */
    samplings?: pulumi.Input<pulumi.Input<inputs.SensitiveDataScannerGroupSampling>[]>;
}

/**
 * The set of arguments for constructing a SensitiveDataScannerGroup resource.
 */
export interface SensitiveDataScannerGroupArgs {
    /**
     * Description of the Datadog scanning group.
     */
    description?: pulumi.Input<string>;
    /**
     * Filter object the scanning group applies.
     */
    filter: pulumi.Input<inputs.SensitiveDataScannerGroupFilter>;
    /**
     * Whether or not the scanning group is enabled. If the group doesn't contain any rule or if all the rules in it are disabled, the group is force-disabled by our backend
     */
    isEnabled: pulumi.Input<boolean>;
    /**
     * Name of the Datadog scanning group.
     */
    name: pulumi.Input<string>;
    /**
     * List of products the scanning group applies. Valid values are `logs`, `rum`, `events`, `apm`.
     */
    productLists: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of sampling configurations per product type for the scanning group.
     */
    samplings?: pulumi.Input<pulumi.Input<inputs.SensitiveDataScannerGroupSampling>[]>;
}
