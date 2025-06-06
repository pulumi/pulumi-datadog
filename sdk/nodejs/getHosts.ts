// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about your live hosts in Datadog.
 */
export function getHosts(args?: GetHostsArgs, opts?: pulumi.InvokeOptions): Promise<GetHostsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("datadog:index/getHosts:getHosts", {
        "filter": args.filter,
        "from": args.from,
        "includeMutedHostsData": args.includeMutedHostsData,
        "sortDir": args.sortDir,
        "sortField": args.sortField,
    }, opts);
}

/**
 * A collection of arguments for invoking getHosts.
 */
export interface GetHostsArgs {
    /**
     * String to filter search results.
     */
    filter?: string;
    /**
     * Number of seconds since UNIX epoch from which you want to search your hosts.
     */
    from?: number;
    /**
     * Include information on the muted status of hosts and when the mute expires.
     */
    includeMutedHostsData?: boolean;
    /**
     * Direction of sort.
     */
    sortDir?: string;
    /**
     * Sort hosts by this field.
     */
    sortField?: string;
}

/**
 * A collection of values returned by getHosts.
 */
export interface GetHostsResult {
    /**
     * String to filter search results.
     */
    readonly filter?: string;
    /**
     * Number of seconds since UNIX epoch from which you want to search your hosts.
     */
    readonly from?: number;
    /**
     * List of hosts (1000 Max).
     */
    readonly hostLists: outputs.GetHostsHostList[];
    /**
     * The ID of this resource.
     */
    readonly id: string;
    /**
     * Include information on the muted status of hosts and when the mute expires.
     */
    readonly includeMutedHostsData?: boolean;
    /**
     * Direction of sort.
     */
    readonly sortDir?: string;
    /**
     * Sort hosts by this field.
     */
    readonly sortField?: string;
    /**
     * Number of host matching the query.
     */
    readonly totalMatching: number;
    /**
     * Number of host returned.
     */
    readonly totalReturned: number;
}
/**
 * Use this data source to retrieve information about your live hosts in Datadog.
 */
export function getHostsOutput(args?: GetHostsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetHostsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("datadog:index/getHosts:getHosts", {
        "filter": args.filter,
        "from": args.from,
        "includeMutedHostsData": args.includeMutedHostsData,
        "sortDir": args.sortDir,
        "sortField": args.sortField,
    }, opts);
}

/**
 * A collection of arguments for invoking getHosts.
 */
export interface GetHostsOutputArgs {
    /**
     * String to filter search results.
     */
    filter?: pulumi.Input<string>;
    /**
     * Number of seconds since UNIX epoch from which you want to search your hosts.
     */
    from?: pulumi.Input<number>;
    /**
     * Include information on the muted status of hosts and when the mute expires.
     */
    includeMutedHostsData?: pulumi.Input<boolean>;
    /**
     * Direction of sort.
     */
    sortDir?: pulumi.Input<string>;
    /**
     * Sort hosts by this field.
     */
    sortField?: pulumi.Input<string>;
}
