// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Get the current order of your log indexes.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const test = datadog.getLogsIndexesOrder({});
 * ```
 */
export function getLogsIndexesOrder(opts?: pulumi.InvokeOptions): Promise<GetLogsIndexesOrderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("datadog:index/getLogsIndexesOrder:getLogsIndexesOrder", {
    }, opts);
}

/**
 * A collection of values returned by getLogsIndexesOrder.
 */
export interface GetLogsIndexesOrderResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of strings identifying by their name(s) the index(es) of your organization. Logs are tested against the query filter of each index one by one, following the order of the array. Logs are eventually stored in the first matching index.
     */
    readonly indexNames: string[];
}
/**
 * Get the current order of your log indexes.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const test = datadog.getLogsIndexesOrder({});
 * ```
 */
export function getLogsIndexesOrderOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLogsIndexesOrderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("datadog:index/getLogsIndexesOrder:getLogsIndexesOrder", {
    }, opts);
}
