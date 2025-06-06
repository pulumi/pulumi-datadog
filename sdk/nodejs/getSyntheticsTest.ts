// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve a Datadog Synthetic Test.
 */
export function getSyntheticsTest(args: GetSyntheticsTestArgs, opts?: pulumi.InvokeOptions): Promise<GetSyntheticsTestResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("datadog:index/getSyntheticsTest:getSyntheticsTest", {
        "testId": args.testId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSyntheticsTest.
 */
export interface GetSyntheticsTestArgs {
    /**
     * The synthetic test id or URL to search for
     */
    testId: string;
}

/**
 * A collection of values returned by getSyntheticsTest.
 */
export interface GetSyntheticsTestResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the synthetic test.
     */
    readonly name: string;
    /**
     * A list of tags assigned to the synthetic test.
     */
    readonly tags: string[];
    /**
     * The synthetic test id or URL to search for
     */
    readonly testId: string;
    /**
     * The start URL of the synthetic test.
     */
    readonly url: string;
}
/**
 * Use this data source to retrieve a Datadog Synthetic Test.
 */
export function getSyntheticsTestOutput(args: GetSyntheticsTestOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSyntheticsTestResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("datadog:index/getSyntheticsTest:getSyntheticsTest", {
        "testId": args.testId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSyntheticsTest.
 */
export interface GetSyntheticsTestOutputArgs {
    /**
     * The synthetic test id or URL to search for
     */
    testId: pulumi.Input<string>;
}
