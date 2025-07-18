// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about an existing Datadog cost budget.
 */
export function getCostBudget(args: GetCostBudgetArgs, opts?: pulumi.InvokeOptions): Promise<GetCostBudgetResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("datadog:index/getCostBudget:getCostBudget", {
        "entries": args.entries,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getCostBudget.
 */
export interface GetCostBudgetArgs {
    /**
     * The entries of the budget.
     */
    entries?: inputs.GetCostBudgetEntry[];
    /**
     * The ID of the budget.
     */
    id: string;
}

/**
 * A collection of values returned by getCostBudget.
 */
export interface GetCostBudgetResult {
    /**
     * The month when the budget ends (YYYYMM).
     */
    readonly endMonth: number;
    /**
     * The entries of the budget.
     */
    readonly entries?: outputs.GetCostBudgetEntry[];
    /**
     * The ID of the budget.
     */
    readonly id: string;
    /**
     * The cost query used to track against the budget.
     */
    readonly metricsQuery: string;
    /**
     * The name of the budget.
     */
    readonly name: string;
    /**
     * The month when the budget starts (YYYYMM).
     */
    readonly startMonth: number;
    /**
     * The sum of all budget entries' amounts.
     */
    readonly totalAmount: number;
}
/**
 * Use this data source to retrieve information about an existing Datadog cost budget.
 */
export function getCostBudgetOutput(args: GetCostBudgetOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCostBudgetResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("datadog:index/getCostBudget:getCostBudget", {
        "entries": args.entries,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getCostBudget.
 */
export interface GetCostBudgetOutputArgs {
    /**
     * The entries of the budget.
     */
    entries?: pulumi.Input<pulumi.Input<inputs.GetCostBudgetEntryArgs>[]>;
    /**
     * The ID of the budget.
     */
    id: pulumi.Input<string>;
}
