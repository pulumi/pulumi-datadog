// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * !>This resource is deprecated - use the `datadog.aws.IntegrationAccount` resource instead.
 *
 * Provides a Datadog AWS tag filter resource. This can be used to create and manage Datadog AWS tag filters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * // Create a new Datadog - Amazon Web Services integration tag filter
 * const foo = new datadog.aws.IntegrationTagFilter("foo", {
 *     accountId: "123456789010",
 *     namespace: "sqs",
 *     tagFilterStr: "key:value",
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * Amazon Web Services log filter resource can be imported using their account ID and namespace separated with a colon (:).
 *
 * ```sh
 * $ pulumi import datadog:aws/integrationTagFilter:IntegrationTagFilter foo ${account_id}:${namespace}
 * ```
 */
export class IntegrationTagFilter extends pulumi.CustomResource {
    /**
     * Get an existing IntegrationTagFilter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IntegrationTagFilterState, opts?: pulumi.CustomResourceOptions): IntegrationTagFilter {
        return new IntegrationTagFilter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:aws/integrationTagFilter:IntegrationTagFilter';

    /**
     * Returns true if the given object is an instance of IntegrationTagFilter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IntegrationTagFilter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IntegrationTagFilter.__pulumiType;
    }

    /**
     * Your AWS Account ID without dashes.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The namespace associated with the tag filter entry. Valid values are `elb`, `applicationElb`, `sqs`, `rds`, `custom`, `networkElb`, `lambda`, `stepFunctions`.
     */
    public readonly namespace!: pulumi.Output<string>;
    /**
     * The tag filter string.
     */
    public readonly tagFilterStr!: pulumi.Output<string>;

    /**
     * Create a IntegrationTagFilter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IntegrationTagFilterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IntegrationTagFilterArgs | IntegrationTagFilterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IntegrationTagFilterState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["tagFilterStr"] = state ? state.tagFilterStr : undefined;
        } else {
            const args = argsOrState as IntegrationTagFilterArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.namespace === undefined) && !opts.urn) {
                throw new Error("Missing required property 'namespace'");
            }
            if ((!args || args.tagFilterStr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tagFilterStr'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["tagFilterStr"] = args ? args.tagFilterStr : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IntegrationTagFilter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IntegrationTagFilter resources.
 */
export interface IntegrationTagFilterState {
    /**
     * Your AWS Account ID without dashes.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The namespace associated with the tag filter entry. Valid values are `elb`, `applicationElb`, `sqs`, `rds`, `custom`, `networkElb`, `lambda`, `stepFunctions`.
     */
    namespace?: pulumi.Input<string>;
    /**
     * The tag filter string.
     */
    tagFilterStr?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IntegrationTagFilter resource.
 */
export interface IntegrationTagFilterArgs {
    /**
     * Your AWS Account ID without dashes.
     */
    accountId: pulumi.Input<string>;
    /**
     * The namespace associated with the tag filter entry. Valid values are `elb`, `applicationElb`, `sqs`, `rds`, `custom`, `networkElb`, `lambda`, `stepFunctions`.
     */
    namespace: pulumi.Input<string>;
    /**
     * The tag filter string.
     */
    tagFilterStr: pulumi.Input<string>;
}
