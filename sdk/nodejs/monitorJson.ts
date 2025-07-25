// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Datadog monitor JSON resource. This can be used to create and manage Datadog monitors using the JSON definition.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const monitorJson = new datadog.MonitorJson("monitor_json", {monitor: `{
 *     "name": "Example monitor - service check",
 *     "type": "service check",
 *     "query": "\\"ntp.in_sync\\".by(\\"*\\").last(2).count_by_status()",
 *     "message": "Change the message triggers if any host's clock goes out of sync with the time given by NTP. The offset threshold is configured in the Agent's 'ntp.yaml' file.\\n\\nSee [Troubleshooting NTP Offset issues](https://docs.datadoghq.com/agent/troubleshooting/ntp for more details on cause and resolution.",
 *     "tags": [],
 *     "multi": true,
 * \x09"restricted_roles": null,
 *     "options": {
 *         "include_tags": true,
 *         "new_host_delay": 150,
 *         "notify_audit": false,
 *         "notify_no_data": false,
 *         "thresholds": {
 *             "warning": 1,
 *             "ok": 1,
 *             "critical": 1
 *         }
 *     },
 *     "priority": null,
 *     "classification": "custom"
 * }
 * `});
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import datadog:index/monitorJson:MonitorJson monitor_json 123456
 * ```
 */
export class MonitorJson extends pulumi.CustomResource {
    /**
     * Get an existing MonitorJson resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MonitorJsonState, opts?: pulumi.CustomResourceOptions): MonitorJson {
        return new MonitorJson(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/monitorJson:MonitorJson';

    /**
     * Returns true if the given object is an instance of MonitorJson.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MonitorJson {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MonitorJson.__pulumiType;
    }

    /**
     * The JSON formatted definition of the monitor.
     */
    public readonly monitor!: pulumi.Output<string>;
    /**
     * The URL of the monitor.
     */
    public readonly url!: pulumi.Output<string>;

    /**
     * Create a MonitorJson resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MonitorJsonArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MonitorJsonArgs | MonitorJsonState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MonitorJsonState | undefined;
            resourceInputs["monitor"] = state ? state.monitor : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as MonitorJsonArgs | undefined;
            if ((!args || args.monitor === undefined) && !opts.urn) {
                throw new Error("Missing required property 'monitor'");
            }
            resourceInputs["monitor"] = args ? args.monitor : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MonitorJson.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MonitorJson resources.
 */
export interface MonitorJsonState {
    /**
     * The JSON formatted definition of the monitor.
     */
    monitor?: pulumi.Input<string>;
    /**
     * The URL of the monitor.
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MonitorJson resource.
 */
export interface MonitorJsonArgs {
    /**
     * The JSON formatted definition of the monitor.
     */
    monitor: pulumi.Input<string>;
    /**
     * The URL of the monitor.
     */
    url?: pulumi.Input<string>;
}
