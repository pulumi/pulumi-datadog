// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about an existing application key.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const foo = pulumi.output(datadog.getApplicationKey({
 *     name: "foo-application",
 * }));
 * ```
 */
export function getApplicationKey(args?: GetApplicationKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetApplicationKeyResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("datadog:index/getApplicationKey:getApplicationKey", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplicationKey.
 */
export interface GetApplicationKeyArgs {
    /**
     * Id for Application Key.
     */
    id?: string;
    /**
     * Name for Application Key.
     */
    name?: string;
}

/**
 * A collection of values returned by getApplicationKey.
 */
export interface GetApplicationKeyResult {
    /**
     * Id for Application Key.
     */
    readonly id?: string;
    /**
     * The value of the Application Key.
     */
    readonly key: string;
    /**
     * Name for Application Key.
     */
    readonly name?: string;
}