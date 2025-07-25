// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The object describing the configuration of the retention filter to create/update.
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * Import existing APM retention filter
 *
 * ```sh
 * $ pulumi import datadog:index/apmRetentionFilter:ApmRetentionFilter foo <filter_id>
 * ```
 */
export class ApmRetentionFilter extends pulumi.CustomResource {
    /**
     * Get an existing ApmRetentionFilter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApmRetentionFilterState, opts?: pulumi.CustomResourceOptions): ApmRetentionFilter {
        return new ApmRetentionFilter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/apmRetentionFilter:ApmRetentionFilter';

    /**
     * Returns true if the given object is an instance of ApmRetentionFilter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApmRetentionFilter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApmRetentionFilter.__pulumiType;
    }

    /**
     * the status of the retention filter.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The spans filter. Spans matching this filter will be indexed and stored.
     */
    public readonly filter!: pulumi.Output<outputs.ApmRetentionFilterFilter | undefined>;
    /**
     * The type of the retention filter, currently only spans-processing-sampling is available. Valid values are `spans-sampling-processor`.
     */
    public readonly filterType!: pulumi.Output<string>;
    /**
     * The name of the retention filter.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Sample rate to apply to spans going through this retention filter as a string; a value of 1.0 keeps all spans matching the query. Value must be between 0.00 and 1.00.
     */
    public readonly rate!: pulumi.Output<string>;
    /**
     * Sample rate to apply to traces with spans going through this retention filter as a string; a value of 1.0 keeps all traces matching the query. Value must be between 0.00 and 1.00.
     */
    public readonly traceRate!: pulumi.Output<string | undefined>;

    /**
     * Create a ApmRetentionFilter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApmRetentionFilterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApmRetentionFilterArgs | ApmRetentionFilterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApmRetentionFilterState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["filter"] = state ? state.filter : undefined;
            resourceInputs["filterType"] = state ? state.filterType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["rate"] = state ? state.rate : undefined;
            resourceInputs["traceRate"] = state ? state.traceRate : undefined;
        } else {
            const args = argsOrState as ApmRetentionFilterArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.filterType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'filterType'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.rate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rate'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["filter"] = args ? args.filter : undefined;
            resourceInputs["filterType"] = args ? args.filterType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["rate"] = args ? args.rate : undefined;
            resourceInputs["traceRate"] = args ? args.traceRate : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApmRetentionFilter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApmRetentionFilter resources.
 */
export interface ApmRetentionFilterState {
    /**
     * the status of the retention filter.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The spans filter. Spans matching this filter will be indexed and stored.
     */
    filter?: pulumi.Input<inputs.ApmRetentionFilterFilter>;
    /**
     * The type of the retention filter, currently only spans-processing-sampling is available. Valid values are `spans-sampling-processor`.
     */
    filterType?: pulumi.Input<string>;
    /**
     * The name of the retention filter.
     */
    name?: pulumi.Input<string>;
    /**
     * Sample rate to apply to spans going through this retention filter as a string; a value of 1.0 keeps all spans matching the query. Value must be between 0.00 and 1.00.
     */
    rate?: pulumi.Input<string>;
    /**
     * Sample rate to apply to traces with spans going through this retention filter as a string; a value of 1.0 keeps all traces matching the query. Value must be between 0.00 and 1.00.
     */
    traceRate?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApmRetentionFilter resource.
 */
export interface ApmRetentionFilterArgs {
    /**
     * the status of the retention filter.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * The spans filter. Spans matching this filter will be indexed and stored.
     */
    filter?: pulumi.Input<inputs.ApmRetentionFilterFilter>;
    /**
     * The type of the retention filter, currently only spans-processing-sampling is available. Valid values are `spans-sampling-processor`.
     */
    filterType: pulumi.Input<string>;
    /**
     * The name of the retention filter.
     */
    name: pulumi.Input<string>;
    /**
     * Sample rate to apply to spans going through this retention filter as a string; a value of 1.0 keeps all spans matching the query. Value must be between 0.00 and 1.00.
     */
    rate: pulumi.Input<string>;
    /**
     * Sample rate to apply to traces with spans going through this retention filter as a string; a value of 1.0 keeps all traces matching the query. Value must be between 0.00 and 1.00.
     */
    traceRate?: pulumi.Input<string>;
}
