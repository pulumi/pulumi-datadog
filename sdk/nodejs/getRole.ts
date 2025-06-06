// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about an existing role for use in other resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const test = datadog.getRole({
 *     filter: "Datadog Standard Role",
 * });
 * ```
 */
export function getRole(args: GetRoleArgs, opts?: pulumi.InvokeOptions): Promise<GetRoleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("datadog:index/getRole:getRole", {
        "filter": args.filter,
    }, opts);
}

/**
 * A collection of arguments for invoking getRole.
 */
export interface GetRoleArgs {
    /**
     * A string on which to filter the roles.
     */
    filter: string;
}

/**
 * A collection of values returned by getRole.
 */
export interface GetRoleResult {
    /**
     * A string on which to filter the roles.
     */
    readonly filter: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the role.
     */
    readonly name: string;
    /**
     * Number of users assigned to this role.
     */
    readonly userCount: number;
}
/**
 * Use this data source to retrieve information about an existing role for use in other resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const test = datadog.getRole({
 *     filter: "Datadog Standard Role",
 * });
 * ```
 */
export function getRoleOutput(args: GetRoleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRoleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("datadog:index/getRole:getRole", {
        "filter": args.filter,
    }, opts);
}

/**
 * A collection of arguments for invoking getRole.
 */
export interface GetRoleOutputArgs {
    /**
     * A string on which to filter the roles.
     */
    filter: pulumi.Input<string>;
}
