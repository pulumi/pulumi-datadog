// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about an existing Datadog service account.
 */
export function getServiceAccount(args?: GetServiceAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("datadog:index/getServiceAccount:getServiceAccount", {
        "exactMatch": args.exactMatch,
        "filter": args.filter,
        "filterStatus": args.filterStatus,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceAccount.
 */
export interface GetServiceAccountArgs {
    /**
     * When true, `filter` string is exact matched against the user's `email`, followed by `name` attribute.
     */
    exactMatch?: boolean;
    /**
     * Filter all users and service accounts by name, email, or role.
     */
    filter?: string;
    /**
     * Filter on status attribute. Comma separated list, with possible values `Active`, `Pending`, and `Disabled`.
     */
    filterStatus?: string;
    /**
     * The service account's ID.
     */
    id?: string;
}

/**
 * A collection of values returned by getServiceAccount.
 */
export interface GetServiceAccountResult {
    /**
     * Whether the user is disabled.
     */
    readonly disabled: boolean;
    /**
     * Email of the user.
     */
    readonly email: string;
    /**
     * When true, `filter` string is exact matched against the user's `email`, followed by `name` attribute.
     */
    readonly exactMatch?: boolean;
    /**
     * Filter all users and service accounts by name, email, or role.
     */
    readonly filter?: string;
    /**
     * Filter on status attribute. Comma separated list, with possible values `Active`, `Pending`, and `Disabled`.
     */
    readonly filterStatus?: string;
    /**
     * Handle of the user.
     */
    readonly handle: string;
    /**
     * URL of the user's icon.
     */
    readonly icon: string;
    /**
     * The service account's ID.
     */
    readonly id: string;
    /**
     * Name of the user.
     */
    readonly name: string;
    /**
     * Roles assigned to this service account.
     */
    readonly roles: string[];
    /**
     * Status of the user.
     */
    readonly status: string;
    /**
     * Title of the user.
     */
    readonly title: string;
    /**
     * Whether the user is verified.
     */
    readonly verified: boolean;
}
/**
 * Use this data source to retrieve information about an existing Datadog service account.
 */
export function getServiceAccountOutput(args?: GetServiceAccountOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetServiceAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("datadog:index/getServiceAccount:getServiceAccount", {
        "exactMatch": args.exactMatch,
        "filter": args.filter,
        "filterStatus": args.filterStatus,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceAccount.
 */
export interface GetServiceAccountOutputArgs {
    /**
     * When true, `filter` string is exact matched against the user's `email`, followed by `name` attribute.
     */
    exactMatch?: pulumi.Input<boolean>;
    /**
     * Filter all users and service accounts by name, email, or role.
     */
    filter?: pulumi.Input<string>;
    /**
     * Filter on status attribute. Comma separated list, with possible values `Active`, `Pending`, and `Disabled`.
     */
    filterStatus?: pulumi.Input<string>;
    /**
     * The service account's ID.
     */
    id?: pulumi.Input<string>;
}