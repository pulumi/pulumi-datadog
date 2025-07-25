// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Datadog Observability Pipeline resource. Observability Pipelines allows you to collect and process logs within your own infrastructure, and then route them to downstream integrations. This resource is in **Preview**. Reach out to Datadog support to enable it for your account.
 *
 * Datadog recommends using the `-parallelism=1` option to apply this resource.
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import datadog:index/observabilityPipeline:ObservabilityPipeline example_pipeline 8beabbc4-1f4d-11f0-942b-da7ad0900001
 * ```
 */
export class ObservabilityPipeline extends pulumi.CustomResource {
    /**
     * Get an existing ObservabilityPipeline resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ObservabilityPipelineState, opts?: pulumi.CustomResourceOptions): ObservabilityPipeline {
        return new ObservabilityPipeline(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/observabilityPipeline:ObservabilityPipeline';

    /**
     * Returns true if the given object is an instance of ObservabilityPipeline.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ObservabilityPipeline {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ObservabilityPipeline.__pulumiType;
    }

    /**
     * Configuration for the pipeline.
     */
    public readonly config!: pulumi.Output<outputs.ObservabilityPipelineConfig | undefined>;
    /**
     * The pipeline name.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a ObservabilityPipeline resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ObservabilityPipelineArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ObservabilityPipelineArgs | ObservabilityPipelineState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ObservabilityPipelineState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as ObservabilityPipelineArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ObservabilityPipeline.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ObservabilityPipeline resources.
 */
export interface ObservabilityPipelineState {
    /**
     * Configuration for the pipeline.
     */
    config?: pulumi.Input<inputs.ObservabilityPipelineConfig>;
    /**
     * The pipeline name.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ObservabilityPipeline resource.
 */
export interface ObservabilityPipelineArgs {
    /**
     * Configuration for the pipeline.
     */
    config?: pulumi.Input<inputs.ObservabilityPipelineConfig>;
    /**
     * The pipeline name.
     */
    name: pulumi.Input<string>;
}
