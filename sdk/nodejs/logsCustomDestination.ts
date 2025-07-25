// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Datadog Logs Custom Destination API resource, which is used to create and manage Datadog log forwarding.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const sampleDestination = new datadog.LogsCustomDestination("sample_destination", {
 *     name: "sample destination",
 *     query: "service:my-service",
 *     enabled: true,
 *     httpDestination: {
 *         endpoint: "https://example.org",
 *         basicAuth: {
 *             username: "my-username",
 *             password: "my-password",
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * Custom destinations can be imported using the destination ID. Caution: auth credentials can not be imported.
 *
 * ```sh
 * $ pulumi import datadog:index/logsCustomDestination:LogsCustomDestination sample_destination "destination-id"
 * ```
 */
export class LogsCustomDestination extends pulumi.CustomResource {
    /**
     * Get an existing LogsCustomDestination resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogsCustomDestinationState, opts?: pulumi.CustomResourceOptions): LogsCustomDestination {
        return new LogsCustomDestination(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/logsCustomDestination:LogsCustomDestination';

    /**
     * Returns true if the given object is an instance of LogsCustomDestination.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogsCustomDestination {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogsCustomDestination.__pulumiType;
    }

    /**
     * The Elasticsearch destination.
     */
    public readonly elasticsearchDestination!: pulumi.Output<outputs.LogsCustomDestinationElasticsearchDestination | undefined>;
    /**
     * Whether logs matching this custom destination should be forwarded or not.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Whether tags from the forwarded logs should be forwarded or not.
     */
    public readonly forwardTags!: pulumi.Output<boolean>;
    /**
     * How the `forwardTagsRestrictionList` parameter should be interpreted.
     * 			If `ALLOW_LIST`, then only tags whose keys on the forwarded logs match the ones on the restriction list
     * 			are forwarded.
     * 			`BLOCK_LIST` works the opposite way. It does not forward the tags matching the ones on the list. Valid values are `ALLOW_LIST`, `BLOCK_LIST`.
     */
    public readonly forwardTagsRestrictionListType!: pulumi.Output<string>;
    /**
     * List of [tag keys](https://docs.datadoghq.com/getting_started/tagging/#define-tags) to be filtered.
     * 			An empty list represents no restriction is in place and either all or no tags will be
     * 			forwarded depending on `forwardTagsRestrictionListType` parameter.
     */
    public readonly forwardTagsRestrictionLists!: pulumi.Output<string[]>;
    /**
     * The HTTP destination.
     */
    public readonly httpDestination!: pulumi.Output<outputs.LogsCustomDestinationHttpDestination | undefined>;
    /**
     * The Microsoft Sentinel destination.
     */
    public readonly microsoftSentinelDestination!: pulumi.Output<outputs.LogsCustomDestinationMicrosoftSentinelDestination | undefined>;
    /**
     * The custom destination name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The custom destination query filter. Logs matching this query are forwarded to the destination.
     */
    public readonly query!: pulumi.Output<string>;
    /**
     * The Splunk HTTP Event Collector (HEC) destination.
     */
    public readonly splunkDestination!: pulumi.Output<outputs.LogsCustomDestinationSplunkDestination | undefined>;

    /**
     * Create a LogsCustomDestination resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogsCustomDestinationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogsCustomDestinationArgs | LogsCustomDestinationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogsCustomDestinationState | undefined;
            resourceInputs["elasticsearchDestination"] = state ? state.elasticsearchDestination : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["forwardTags"] = state ? state.forwardTags : undefined;
            resourceInputs["forwardTagsRestrictionListType"] = state ? state.forwardTagsRestrictionListType : undefined;
            resourceInputs["forwardTagsRestrictionLists"] = state ? state.forwardTagsRestrictionLists : undefined;
            resourceInputs["httpDestination"] = state ? state.httpDestination : undefined;
            resourceInputs["microsoftSentinelDestination"] = state ? state.microsoftSentinelDestination : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["query"] = state ? state.query : undefined;
            resourceInputs["splunkDestination"] = state ? state.splunkDestination : undefined;
        } else {
            const args = argsOrState as LogsCustomDestinationArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["elasticsearchDestination"] = args ? args.elasticsearchDestination : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["forwardTags"] = args ? args.forwardTags : undefined;
            resourceInputs["forwardTagsRestrictionListType"] = args ? args.forwardTagsRestrictionListType : undefined;
            resourceInputs["forwardTagsRestrictionLists"] = args ? args.forwardTagsRestrictionLists : undefined;
            resourceInputs["httpDestination"] = args ? args.httpDestination : undefined;
            resourceInputs["microsoftSentinelDestination"] = args ? args.microsoftSentinelDestination : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["query"] = args ? args.query : undefined;
            resourceInputs["splunkDestination"] = args ? args.splunkDestination : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LogsCustomDestination.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogsCustomDestination resources.
 */
export interface LogsCustomDestinationState {
    /**
     * The Elasticsearch destination.
     */
    elasticsearchDestination?: pulumi.Input<inputs.LogsCustomDestinationElasticsearchDestination>;
    /**
     * Whether logs matching this custom destination should be forwarded or not.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Whether tags from the forwarded logs should be forwarded or not.
     */
    forwardTags?: pulumi.Input<boolean>;
    /**
     * How the `forwardTagsRestrictionList` parameter should be interpreted.
     * 			If `ALLOW_LIST`, then only tags whose keys on the forwarded logs match the ones on the restriction list
     * 			are forwarded.
     * 			`BLOCK_LIST` works the opposite way. It does not forward the tags matching the ones on the list. Valid values are `ALLOW_LIST`, `BLOCK_LIST`.
     */
    forwardTagsRestrictionListType?: pulumi.Input<string>;
    /**
     * List of [tag keys](https://docs.datadoghq.com/getting_started/tagging/#define-tags) to be filtered.
     * 			An empty list represents no restriction is in place and either all or no tags will be
     * 			forwarded depending on `forwardTagsRestrictionListType` parameter.
     */
    forwardTagsRestrictionLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The HTTP destination.
     */
    httpDestination?: pulumi.Input<inputs.LogsCustomDestinationHttpDestination>;
    /**
     * The Microsoft Sentinel destination.
     */
    microsoftSentinelDestination?: pulumi.Input<inputs.LogsCustomDestinationMicrosoftSentinelDestination>;
    /**
     * The custom destination name.
     */
    name?: pulumi.Input<string>;
    /**
     * The custom destination query filter. Logs matching this query are forwarded to the destination.
     */
    query?: pulumi.Input<string>;
    /**
     * The Splunk HTTP Event Collector (HEC) destination.
     */
    splunkDestination?: pulumi.Input<inputs.LogsCustomDestinationSplunkDestination>;
}

/**
 * The set of arguments for constructing a LogsCustomDestination resource.
 */
export interface LogsCustomDestinationArgs {
    /**
     * The Elasticsearch destination.
     */
    elasticsearchDestination?: pulumi.Input<inputs.LogsCustomDestinationElasticsearchDestination>;
    /**
     * Whether logs matching this custom destination should be forwarded or not.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Whether tags from the forwarded logs should be forwarded or not.
     */
    forwardTags?: pulumi.Input<boolean>;
    /**
     * How the `forwardTagsRestrictionList` parameter should be interpreted.
     * 			If `ALLOW_LIST`, then only tags whose keys on the forwarded logs match the ones on the restriction list
     * 			are forwarded.
     * 			`BLOCK_LIST` works the opposite way. It does not forward the tags matching the ones on the list. Valid values are `ALLOW_LIST`, `BLOCK_LIST`.
     */
    forwardTagsRestrictionListType?: pulumi.Input<string>;
    /**
     * List of [tag keys](https://docs.datadoghq.com/getting_started/tagging/#define-tags) to be filtered.
     * 			An empty list represents no restriction is in place and either all or no tags will be
     * 			forwarded depending on `forwardTagsRestrictionListType` parameter.
     */
    forwardTagsRestrictionLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The HTTP destination.
     */
    httpDestination?: pulumi.Input<inputs.LogsCustomDestinationHttpDestination>;
    /**
     * The Microsoft Sentinel destination.
     */
    microsoftSentinelDestination?: pulumi.Input<inputs.LogsCustomDestinationMicrosoftSentinelDestination>;
    /**
     * The custom destination name.
     */
    name: pulumi.Input<string>;
    /**
     * The custom destination query filter. Logs matching this query are forwarded to the destination.
     */
    query?: pulumi.Input<string>;
    /**
     * The Splunk HTTP Event Collector (HEC) destination.
     */
    splunkDestination?: pulumi.Input<inputs.LogsCustomDestinationSplunkDestination>;
}
