// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import datadog:aws/integrationAccount:IntegrationAccount example "<datadog-aws-account-config-id>"
 * ```
 *
 *  AWS Account Config ID can be retrieved by using the [List all AWS integrations](https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations) endpoint and querying by AWS Account ID.
 */
export class IntegrationAccount extends pulumi.CustomResource {
    /**
     * Get an existing IntegrationAccount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IntegrationAccountState, opts?: pulumi.CustomResourceOptions): IntegrationAccount {
        return new IntegrationAccount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:aws/integrationAccount:IntegrationAccount';

    /**
     * Returns true if the given object is an instance of IntegrationAccount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IntegrationAccount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IntegrationAccount.__pulumiType;
    }

    /**
     * Tags to apply to all metrics in the account. Defaults to `[]`.
     */
    public readonly accountTags!: pulumi.Output<string[]>;
    /**
     * Configure how Datadog authenticates to your AWS account. Either `awsAuthConfigKeys` or `awsAuthConfigRole` block is required within.
     */
    public readonly authConfig!: pulumi.Output<outputs.aws.IntegrationAccountAuthConfig | undefined>;
    /**
     * Your AWS Account ID without dashes.
     */
    public readonly awsAccountId!: pulumi.Output<string>;
    /**
     * AWS Account partition.
     */
    public readonly awsPartition!: pulumi.Output<string>;
    /**
     * AWS regions to collect data from. Defaults to `includeAll` if block is empty.
     */
    public readonly awsRegions!: pulumi.Output<outputs.aws.IntegrationAccountAwsRegions | undefined>;
    /**
     * Configure log autosubscription for your Datadog Forwarder Lambda functions. The `lambdaFowarder` block is required within, but may be empty to use defaults.
     */
    public readonly logsConfig!: pulumi.Output<outputs.aws.IntegrationAccountLogsConfig | undefined>;
    /**
     * Configure metrics collection from AWS CloudWatch. The `namespaceFilters` block is required within, but may be empty to use defaults.
     */
    public readonly metricsConfig!: pulumi.Output<outputs.aws.IntegrationAccountMetricsConfig | undefined>;
    /**
     * AWS resources collection config. May be empty to use defaults.
     */
    public readonly resourcesConfig!: pulumi.Output<outputs.aws.IntegrationAccountResourcesConfig | undefined>;
    /**
     * AWS traces collection config. The `xrayServices` block is required within, but may be empty to use defaults.
     */
    public readonly tracesConfig!: pulumi.Output<outputs.aws.IntegrationAccountTracesConfig | undefined>;

    /**
     * Create a IntegrationAccount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IntegrationAccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IntegrationAccountArgs | IntegrationAccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IntegrationAccountState | undefined;
            resourceInputs["accountTags"] = state ? state.accountTags : undefined;
            resourceInputs["authConfig"] = state ? state.authConfig : undefined;
            resourceInputs["awsAccountId"] = state ? state.awsAccountId : undefined;
            resourceInputs["awsPartition"] = state ? state.awsPartition : undefined;
            resourceInputs["awsRegions"] = state ? state.awsRegions : undefined;
            resourceInputs["logsConfig"] = state ? state.logsConfig : undefined;
            resourceInputs["metricsConfig"] = state ? state.metricsConfig : undefined;
            resourceInputs["resourcesConfig"] = state ? state.resourcesConfig : undefined;
            resourceInputs["tracesConfig"] = state ? state.tracesConfig : undefined;
        } else {
            const args = argsOrState as IntegrationAccountArgs | undefined;
            if ((!args || args.awsAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'awsAccountId'");
            }
            if ((!args || args.awsPartition === undefined) && !opts.urn) {
                throw new Error("Missing required property 'awsPartition'");
            }
            resourceInputs["accountTags"] = args ? args.accountTags : undefined;
            resourceInputs["authConfig"] = args ? args.authConfig : undefined;
            resourceInputs["awsAccountId"] = args ? args.awsAccountId : undefined;
            resourceInputs["awsPartition"] = args ? args.awsPartition : undefined;
            resourceInputs["awsRegions"] = args ? args.awsRegions : undefined;
            resourceInputs["logsConfig"] = args ? args.logsConfig : undefined;
            resourceInputs["metricsConfig"] = args ? args.metricsConfig : undefined;
            resourceInputs["resourcesConfig"] = args ? args.resourcesConfig : undefined;
            resourceInputs["tracesConfig"] = args ? args.tracesConfig : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IntegrationAccount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IntegrationAccount resources.
 */
export interface IntegrationAccountState {
    /**
     * Tags to apply to all metrics in the account. Defaults to `[]`.
     */
    accountTags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configure how Datadog authenticates to your AWS account. Either `awsAuthConfigKeys` or `awsAuthConfigRole` block is required within.
     */
    authConfig?: pulumi.Input<inputs.aws.IntegrationAccountAuthConfig>;
    /**
     * Your AWS Account ID without dashes.
     */
    awsAccountId?: pulumi.Input<string>;
    /**
     * AWS Account partition.
     */
    awsPartition?: pulumi.Input<string>;
    /**
     * AWS regions to collect data from. Defaults to `includeAll` if block is empty.
     */
    awsRegions?: pulumi.Input<inputs.aws.IntegrationAccountAwsRegions>;
    /**
     * Configure log autosubscription for your Datadog Forwarder Lambda functions. The `lambdaFowarder` block is required within, but may be empty to use defaults.
     */
    logsConfig?: pulumi.Input<inputs.aws.IntegrationAccountLogsConfig>;
    /**
     * Configure metrics collection from AWS CloudWatch. The `namespaceFilters` block is required within, but may be empty to use defaults.
     */
    metricsConfig?: pulumi.Input<inputs.aws.IntegrationAccountMetricsConfig>;
    /**
     * AWS resources collection config. May be empty to use defaults.
     */
    resourcesConfig?: pulumi.Input<inputs.aws.IntegrationAccountResourcesConfig>;
    /**
     * AWS traces collection config. The `xrayServices` block is required within, but may be empty to use defaults.
     */
    tracesConfig?: pulumi.Input<inputs.aws.IntegrationAccountTracesConfig>;
}

/**
 * The set of arguments for constructing a IntegrationAccount resource.
 */
export interface IntegrationAccountArgs {
    /**
     * Tags to apply to all metrics in the account. Defaults to `[]`.
     */
    accountTags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configure how Datadog authenticates to your AWS account. Either `awsAuthConfigKeys` or `awsAuthConfigRole` block is required within.
     */
    authConfig?: pulumi.Input<inputs.aws.IntegrationAccountAuthConfig>;
    /**
     * Your AWS Account ID without dashes.
     */
    awsAccountId: pulumi.Input<string>;
    /**
     * AWS Account partition.
     */
    awsPartition: pulumi.Input<string>;
    /**
     * AWS regions to collect data from. Defaults to `includeAll` if block is empty.
     */
    awsRegions?: pulumi.Input<inputs.aws.IntegrationAccountAwsRegions>;
    /**
     * Configure log autosubscription for your Datadog Forwarder Lambda functions. The `lambdaFowarder` block is required within, but may be empty to use defaults.
     */
    logsConfig?: pulumi.Input<inputs.aws.IntegrationAccountLogsConfig>;
    /**
     * Configure metrics collection from AWS CloudWatch. The `namespaceFilters` block is required within, but may be empty to use defaults.
     */
    metricsConfig?: pulumi.Input<inputs.aws.IntegrationAccountMetricsConfig>;
    /**
     * AWS resources collection config. May be empty to use defaults.
     */
    resourcesConfig?: pulumi.Input<inputs.aws.IntegrationAccountResourcesConfig>;
    /**
     * AWS traces collection config. The `xrayServices` block is required within, but may be empty to use defaults.
     */
    tracesConfig?: pulumi.Input<inputs.aws.IntegrationAccountTracesConfig>;
}
