// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about existing Agent rules.
 */
export function getCsmThreatsAgentRules(args?: GetCsmThreatsAgentRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetCsmThreatsAgentRulesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("datadog:index/getCsmThreatsAgentRules:getCsmThreatsAgentRules", {
        "policyId": args.policyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCsmThreatsAgentRules.
 */
export interface GetCsmThreatsAgentRulesArgs {
    /**
     * Listing only the rules in the policy with this field as the ID
     */
    policyId?: string;
}

/**
 * A collection of values returned by getCsmThreatsAgentRules.
 */
export interface GetCsmThreatsAgentRulesResult {
    /**
     * List of Agent rules
     */
    readonly agentRules: outputs.GetCsmThreatsAgentRulesAgentRule[];
    /**
     * List of IDs for the Agent rules.
     */
    readonly agentRulesIds: string[];
    /**
     * The ID of the data source
     */
    readonly id: string;
    /**
     * Listing only the rules in the policy with this field as the ID
     */
    readonly policyId?: string;
}
/**
 * Use this data source to retrieve information about existing Agent rules.
 */
export function getCsmThreatsAgentRulesOutput(args?: GetCsmThreatsAgentRulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCsmThreatsAgentRulesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("datadog:index/getCsmThreatsAgentRules:getCsmThreatsAgentRules", {
        "policyId": args.policyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCsmThreatsAgentRules.
 */
export interface GetCsmThreatsAgentRulesOutputArgs {
    /**
     * Listing only the rules in the policy with this field as the ID
     */
    policyId?: pulumi.Input<string>;
}
