// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Datadog Security Monitoring Notification Rule API resource for creating and managing Datadog security notification rules.
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import datadog:index/securityNotificationRule:SecurityNotificationRule signal_rule yq9-t9l-bso
 * ```
 */
export class SecurityNotificationRule extends pulumi.CustomResource {
    /**
     * Get an existing SecurityNotificationRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityNotificationRuleState, opts?: pulumi.CustomResourceOptions): SecurityNotificationRule {
        return new SecurityNotificationRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/securityNotificationRule:SecurityNotificationRule';

    /**
     * Returns true if the given object is an instance of SecurityNotificationRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecurityNotificationRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecurityNotificationRule.__pulumiType;
    }

    /**
     * Indicates when this rule was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<number>;
    /**
     * The handle of the rule creator.
     */
    public /*out*/ readonly createdByHandle!: pulumi.Output<string>;
    /**
     * The name of the rule creator.
     */
    public /*out*/ readonly createdByName!: pulumi.Output<string>;
    /**
     * Indicates whether the rule is enabled. Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Indicates when this rule was last modified.
     */
    public /*out*/ readonly modifiedAt!: pulumi.Output<number>;
    /**
     * The handle of the rule last modifier.
     */
    public /*out*/ readonly modifiedByHandle!: pulumi.Output<string>;
    /**
     * The name of the rule last modifier.
     */
    public /*out*/ readonly modifiedByName!: pulumi.Output<string>;
    /**
     * The name of the rule (must be unique).
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Defines selectors to filter security issues that generate notifications.
     */
    public readonly selectors!: pulumi.Output<outputs.SecurityNotificationRuleSelectors | undefined>;
    /**
     * The list of handle targets for the notifications. A target must be prefixed with an @. It can be an email address (@bob@email.com), or any installed integration. For example, a Slack recipient (@slack-ops), or a Teams recipient (@teams-ops).
     */
    public readonly targets!: pulumi.Output<string[]>;
    /**
     * Specifies the time period, in seconds, used to aggregate the notification. Defaults to `0`.
     */
    public readonly timeAggregation!: pulumi.Output<number>;
    /**
     * The rule version (incremented at each update).
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a SecurityNotificationRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecurityNotificationRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecurityNotificationRuleArgs | SecurityNotificationRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecurityNotificationRuleState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["createdByHandle"] = state ? state.createdByHandle : undefined;
            resourceInputs["createdByName"] = state ? state.createdByName : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["modifiedAt"] = state ? state.modifiedAt : undefined;
            resourceInputs["modifiedByHandle"] = state ? state.modifiedByHandle : undefined;
            resourceInputs["modifiedByName"] = state ? state.modifiedByName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["selectors"] = state ? state.selectors : undefined;
            resourceInputs["targets"] = state ? state.targets : undefined;
            resourceInputs["timeAggregation"] = state ? state.timeAggregation : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as SecurityNotificationRuleArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.targets === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targets'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["selectors"] = args ? args.selectors : undefined;
            resourceInputs["targets"] = args ? args.targets : undefined;
            resourceInputs["timeAggregation"] = args ? args.timeAggregation : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["createdByHandle"] = undefined /*out*/;
            resourceInputs["createdByName"] = undefined /*out*/;
            resourceInputs["modifiedAt"] = undefined /*out*/;
            resourceInputs["modifiedByHandle"] = undefined /*out*/;
            resourceInputs["modifiedByName"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecurityNotificationRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecurityNotificationRule resources.
 */
export interface SecurityNotificationRuleState {
    /**
     * Indicates when this rule was created.
     */
    createdAt?: pulumi.Input<number>;
    /**
     * The handle of the rule creator.
     */
    createdByHandle?: pulumi.Input<string>;
    /**
     * The name of the rule creator.
     */
    createdByName?: pulumi.Input<string>;
    /**
     * Indicates whether the rule is enabled. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Indicates when this rule was last modified.
     */
    modifiedAt?: pulumi.Input<number>;
    /**
     * The handle of the rule last modifier.
     */
    modifiedByHandle?: pulumi.Input<string>;
    /**
     * The name of the rule last modifier.
     */
    modifiedByName?: pulumi.Input<string>;
    /**
     * The name of the rule (must be unique).
     */
    name?: pulumi.Input<string>;
    /**
     * Defines selectors to filter security issues that generate notifications.
     */
    selectors?: pulumi.Input<inputs.SecurityNotificationRuleSelectors>;
    /**
     * The list of handle targets for the notifications. A target must be prefixed with an @. It can be an email address (@bob@email.com), or any installed integration. For example, a Slack recipient (@slack-ops), or a Teams recipient (@teams-ops).
     */
    targets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the time period, in seconds, used to aggregate the notification. Defaults to `0`.
     */
    timeAggregation?: pulumi.Input<number>;
    /**
     * The rule version (incremented at each update).
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SecurityNotificationRule resource.
 */
export interface SecurityNotificationRuleArgs {
    /**
     * Indicates whether the rule is enabled. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The name of the rule (must be unique).
     */
    name: pulumi.Input<string>;
    /**
     * Defines selectors to filter security issues that generate notifications.
     */
    selectors?: pulumi.Input<inputs.SecurityNotificationRuleSelectors>;
    /**
     * The list of handle targets for the notifications. A target must be prefixed with an @. It can be an email address (@bob@email.com), or any installed integration. For example, a Slack recipient (@slack-ops), or a Teams recipient (@teams-ops).
     */
    targets: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the time period, in seconds, used to aggregate the notification. Defaults to `0`.
     */
    timeAggregation?: pulumi.Input<number>;
}
