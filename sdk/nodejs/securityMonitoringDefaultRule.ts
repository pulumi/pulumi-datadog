// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Datadog Security Monitoring Rule API resource for default rules. It can only be imported, you can't create a default rule.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const adefaultrule = new datadog.SecurityMonitoringDefaultRule("adefaultrule", {
 *     enabled: true,
 *     cases: [{
 *         status: "high",
 *         notifications: ["@me"],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Default rules need to be imported using their ID before applying.
 *
 * resource "datadog_security_monitoring_default_rule" "adefaultrule" {
 *
 * }
 *
 * ```sh
 * $ pulumi import datadog:index/securityMonitoringDefaultRule:SecurityMonitoringDefaultRule adefaultrule m0o-hto-lkb
 * ```
 */
export class SecurityMonitoringDefaultRule extends pulumi.CustomResource {
    /**
     * Get an existing SecurityMonitoringDefaultRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityMonitoringDefaultRuleState, opts?: pulumi.CustomResourceOptions): SecurityMonitoringDefaultRule {
        return new SecurityMonitoringDefaultRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/securityMonitoringDefaultRule:SecurityMonitoringDefaultRule';

    /**
     * Returns true if the given object is an instance of SecurityMonitoringDefaultRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecurityMonitoringDefaultRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecurityMonitoringDefaultRule.__pulumiType;
    }

    /**
     * Cases of the rule, this is used to update notifications.
     */
    public readonly cases!: pulumi.Output<outputs.SecurityMonitoringDefaultRuleCase[] | undefined>;
    /**
     * Custom tags for generated signals.
     */
    public readonly customTags!: pulumi.Output<string[] | undefined>;
    /**
     * Enable the rule. Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Additional queries to filter matched events before they are processed.
     */
    public readonly filters!: pulumi.Output<outputs.SecurityMonitoringDefaultRuleFilter[] | undefined>;
    /**
     * Options on default rules. Note that only a subset of fields can be updated on default rule options.
     */
    public readonly options!: pulumi.Output<outputs.SecurityMonitoringDefaultRuleOptions | undefined>;
    /**
     * The rule type.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a SecurityMonitoringDefaultRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SecurityMonitoringDefaultRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecurityMonitoringDefaultRuleArgs | SecurityMonitoringDefaultRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecurityMonitoringDefaultRuleState | undefined;
            resourceInputs["cases"] = state ? state.cases : undefined;
            resourceInputs["customTags"] = state ? state.customTags : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["filters"] = state ? state.filters : undefined;
            resourceInputs["options"] = state ? state.options : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as SecurityMonitoringDefaultRuleArgs | undefined;
            resourceInputs["cases"] = args ? args.cases : undefined;
            resourceInputs["customTags"] = args ? args.customTags : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["filters"] = args ? args.filters : undefined;
            resourceInputs["options"] = args ? args.options : undefined;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecurityMonitoringDefaultRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecurityMonitoringDefaultRule resources.
 */
export interface SecurityMonitoringDefaultRuleState {
    /**
     * Cases of the rule, this is used to update notifications.
     */
    cases?: pulumi.Input<pulumi.Input<inputs.SecurityMonitoringDefaultRuleCase>[]>;
    /**
     * Custom tags for generated signals.
     */
    customTags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Enable the rule. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Additional queries to filter matched events before they are processed.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.SecurityMonitoringDefaultRuleFilter>[]>;
    /**
     * Options on default rules. Note that only a subset of fields can be updated on default rule options.
     */
    options?: pulumi.Input<inputs.SecurityMonitoringDefaultRuleOptions>;
    /**
     * The rule type.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecurityMonitoringDefaultRule resource.
 */
export interface SecurityMonitoringDefaultRuleArgs {
    /**
     * Cases of the rule, this is used to update notifications.
     */
    cases?: pulumi.Input<pulumi.Input<inputs.SecurityMonitoringDefaultRuleCase>[]>;
    /**
     * Custom tags for generated signals.
     */
    customTags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Enable the rule. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Additional queries to filter matched events before they are processed.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.SecurityMonitoringDefaultRuleFilter>[]>;
    /**
     * Options on default rules. Note that only a subset of fields can be updated on default rule options.
     */
    options?: pulumi.Input<inputs.SecurityMonitoringDefaultRuleOptions>;
}
