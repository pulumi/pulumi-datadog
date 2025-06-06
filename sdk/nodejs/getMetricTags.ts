// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve tags associated with a metric to use in other resources.
 */
export function getMetricTags(args: GetMetricTagsArgs, opts?: pulumi.InvokeOptions): Promise<GetMetricTagsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("datadog:index/getMetricTags:getMetricTags", {
        "metric": args.metric,
    }, opts);
}

/**
 * A collection of arguments for invoking getMetricTags.
 */
export interface GetMetricTagsArgs {
    /**
     * The metric for which to fetch tags.
     */
    metric: string;
}

/**
 * A collection of values returned by getMetricTags.
 */
export interface GetMetricTagsResult {
    /**
     * The ID of this resource.
     */
    readonly id: string;
    /**
     * The metric for which to fetch tags.
     */
    readonly metric: string;
    /**
     * The tags associated with the metric.
     */
    readonly tags: string[];
}
/**
 * Use this data source to retrieve tags associated with a metric to use in other resources.
 */
export function getMetricTagsOutput(args: GetMetricTagsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMetricTagsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("datadog:index/getMetricTags:getMetricTags", {
        "metric": args.metric,
    }, opts);
}

/**
 * A collection of arguments for invoking getMetricTags.
 */
export interface GetMetricTagsOutputArgs {
    /**
     * The metric for which to fetch tags.
     */
    metric: pulumi.Input<string>;
}
