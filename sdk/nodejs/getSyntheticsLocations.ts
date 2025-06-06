// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve Datadog's Synthetics Locations (to be used in Synthetics tests).
 */
export function getSyntheticsLocations(opts?: pulumi.InvokeOptions): Promise<GetSyntheticsLocationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("datadog:index/getSyntheticsLocations:getSyntheticsLocations", {
    }, opts);
}

/**
 * A collection of values returned by getSyntheticsLocations.
 */
export interface GetSyntheticsLocationsResult {
    /**
     * The ID of this resource.
     */
    readonly id: string;
    /**
     * A map of available Synthetics location IDs to names for Synthetics tests.
     */
    readonly locations: {[key: string]: string};
}
/**
 * Use this data source to retrieve Datadog's Synthetics Locations (to be used in Synthetics tests).
 */
export function getSyntheticsLocationsOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSyntheticsLocationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("datadog:index/getSyntheticsLocations:getSyntheticsLocations", {
    }, opts);
}
