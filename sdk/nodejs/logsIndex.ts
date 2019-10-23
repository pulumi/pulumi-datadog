// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-datadog/blob/master/website/docs/r/logs_index.html.markdown.
 */
export class LogsIndex extends pulumi.CustomResource {
    /**
     * Get an existing LogsIndex resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogsIndexState, opts?: pulumi.CustomResourceOptions): LogsIndex {
        return new LogsIndex(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/logsIndex:LogsIndex';

    /**
     * Returns true if the given object is an instance of LogsIndex.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogsIndex {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogsIndex.__pulumiType;
    }

    /**
     * List of exclusion filters.
     */
    public readonly exclusionFilters!: pulumi.Output<outputs.LogsIndexExclusionFilter[] | undefined>;
    public readonly filters!: pulumi.Output<outputs.LogsIndexFilter[]>;
    /**
     * The name of the exclusion filter.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a LogsIndex resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogsIndexArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogsIndexArgs | LogsIndexState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as LogsIndexState | undefined;
            inputs["exclusionFilters"] = state ? state.exclusionFilters : undefined;
            inputs["filters"] = state ? state.filters : undefined;
            inputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as LogsIndexArgs | undefined;
            if (!args || args.filters === undefined) {
                throw new Error("Missing required property 'filters'");
            }
            if (!args || args.name === undefined) {
                throw new Error("Missing required property 'name'");
            }
            inputs["exclusionFilters"] = args ? args.exclusionFilters : undefined;
            inputs["filters"] = args ? args.filters : undefined;
            inputs["name"] = args ? args.name : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(LogsIndex.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogsIndex resources.
 */
export interface LogsIndexState {
    /**
     * List of exclusion filters.
     */
    readonly exclusionFilters?: pulumi.Input<pulumi.Input<inputs.LogsIndexExclusionFilter>[]>;
    readonly filters?: pulumi.Input<pulumi.Input<inputs.LogsIndexFilter>[]>;
    /**
     * The name of the exclusion filter.
     */
    readonly name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LogsIndex resource.
 */
export interface LogsIndexArgs {
    /**
     * List of exclusion filters.
     */
    readonly exclusionFilters?: pulumi.Input<pulumi.Input<inputs.LogsIndexExclusionFilter>[]>;
    readonly filters: pulumi.Input<pulumi.Input<inputs.LogsIndexFilter>[]>;
    /**
     * The name of the exclusion filter.
     */
    readonly name: pulumi.Input<string>;
}