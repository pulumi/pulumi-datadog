// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Datadog Security Monitoring Suppression API resource. It can be used to create and manage Datadog security monitoring suppression rules.
 */
export class SecurityMonitoringSuppression extends pulumi.CustomResource {
    /**
     * Get an existing SecurityMonitoringSuppression resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityMonitoringSuppressionState, opts?: pulumi.CustomResourceOptions): SecurityMonitoringSuppression {
        return new SecurityMonitoringSuppression(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/securityMonitoringSuppression:SecurityMonitoringSuppression';

    /**
     * Returns true if the given object is an instance of SecurityMonitoringSuppression.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecurityMonitoringSuppression {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecurityMonitoringSuppression.__pulumiType;
    }

    /**
     * A description for the suppression rule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether the suppression rule is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * A RFC3339 timestamp giving an expiration date for the suppression rule. After this date, it won't suppress signals anymore.
     */
    public readonly expirationDate!: pulumi.Output<string | undefined>;
    /**
     * The name of the suppression rule.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The rule query of the suppression rule, with the same syntax as the search bar for detection rules.
     */
    public readonly ruleQuery!: pulumi.Output<string>;
    /**
     * The suppression query of the suppression rule. If a signal matches this query, it is suppressed and is not triggered. Same syntax as the queries to search signals in the signal explorer.
     */
    public readonly suppressionQuery!: pulumi.Output<string>;

    /**
     * Create a SecurityMonitoringSuppression resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecurityMonitoringSuppressionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecurityMonitoringSuppressionArgs | SecurityMonitoringSuppressionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecurityMonitoringSuppressionState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["expirationDate"] = state ? state.expirationDate : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ruleQuery"] = state ? state.ruleQuery : undefined;
            resourceInputs["suppressionQuery"] = state ? state.suppressionQuery : undefined;
        } else {
            const args = argsOrState as SecurityMonitoringSuppressionArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.ruleQuery === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ruleQuery'");
            }
            if ((!args || args.suppressionQuery === undefined) && !opts.urn) {
                throw new Error("Missing required property 'suppressionQuery'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["expirationDate"] = args ? args.expirationDate : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ruleQuery"] = args ? args.ruleQuery : undefined;
            resourceInputs["suppressionQuery"] = args ? args.suppressionQuery : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecurityMonitoringSuppression.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecurityMonitoringSuppression resources.
 */
export interface SecurityMonitoringSuppressionState {
    /**
     * A description for the suppression rule.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the suppression rule is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * A RFC3339 timestamp giving an expiration date for the suppression rule. After this date, it won't suppress signals anymore.
     */
    expirationDate?: pulumi.Input<string>;
    /**
     * The name of the suppression rule.
     */
    name?: pulumi.Input<string>;
    /**
     * The rule query of the suppression rule, with the same syntax as the search bar for detection rules.
     */
    ruleQuery?: pulumi.Input<string>;
    /**
     * The suppression query of the suppression rule. If a signal matches this query, it is suppressed and is not triggered. Same syntax as the queries to search signals in the signal explorer.
     */
    suppressionQuery?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecurityMonitoringSuppression resource.
 */
export interface SecurityMonitoringSuppressionArgs {
    /**
     * A description for the suppression rule.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the suppression rule is enabled.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * A RFC3339 timestamp giving an expiration date for the suppression rule. After this date, it won't suppress signals anymore.
     */
    expirationDate?: pulumi.Input<string>;
    /**
     * The name of the suppression rule.
     */
    name: pulumi.Input<string>;
    /**
     * The rule query of the suppression rule, with the same syntax as the search bar for detection rules.
     */
    ruleQuery: pulumi.Input<string>;
    /**
     * The suppression query of the suppression rule. If a signal matches this query, it is suppressed and is not triggered. Same syntax as the queries to search signals in the signal explorer.
     */
    suppressionQuery: pulumi.Input<string>;
}