// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import datadog:index/appBuilderApp:AppBuilderApp my_app 11111111-2222-3333-4444-555555555555
 * ```
 */
export class AppBuilderApp extends pulumi.CustomResource {
    /**
     * Get an existing AppBuilderApp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppBuilderAppState, opts?: pulumi.CustomResourceOptions): AppBuilderApp {
        return new AppBuilderApp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/appBuilderApp:AppBuilderApp';

    /**
     * Returns true if the given object is an instance of AppBuilderApp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppBuilderApp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppBuilderApp.__pulumiType;
    }

    /**
     * If specified, this will override the Action Connection IDs for the specified Action Query Names in the App JSON. Otherwise, a map of the App's Action Query Names to Action Connection IDs will be returned in output.
     */
    public readonly actionQueryNamesToConnectionIds!: pulumi.Output<{[key: string]: string}>;
    /**
     * The JSON representation of the App. String length must be at least 1.
     */
    public readonly appJson!: pulumi.Output<string>;
    /**
     * If specified, this will override the human-readable description of the App in the App JSON. String length must be at least 1.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * If specified, this will override the name of the App in the App JSON. String length must be at least 1.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Set the app to published or unpublished. Published apps are available to other users. To ensure the app is accessible to the correct users, you also need to set a [Restriction Policy](https://docs.datadoghq.com/api/latest/restriction-policies/) on the app if a policy does not yet exist. Defaults to `false`.
     */
    public readonly published!: pulumi.Output<boolean>;
    /**
     * The name of the root component of the app. This must be a grid component that contains all other components. If specified, this will override the root instance name of the App in the App JSON. String length must be at least 1.
     */
    public readonly rootInstanceName!: pulumi.Output<string>;

    /**
     * Create a AppBuilderApp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppBuilderAppArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppBuilderAppArgs | AppBuilderAppState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppBuilderAppState | undefined;
            resourceInputs["actionQueryNamesToConnectionIds"] = state ? state.actionQueryNamesToConnectionIds : undefined;
            resourceInputs["appJson"] = state ? state.appJson : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["published"] = state ? state.published : undefined;
            resourceInputs["rootInstanceName"] = state ? state.rootInstanceName : undefined;
        } else {
            const args = argsOrState as AppBuilderAppArgs | undefined;
            if ((!args || args.appJson === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appJson'");
            }
            resourceInputs["actionQueryNamesToConnectionIds"] = args ? args.actionQueryNamesToConnectionIds : undefined;
            resourceInputs["appJson"] = args ? args.appJson : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["published"] = args ? args.published : undefined;
            resourceInputs["rootInstanceName"] = args ? args.rootInstanceName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppBuilderApp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppBuilderApp resources.
 */
export interface AppBuilderAppState {
    /**
     * If specified, this will override the Action Connection IDs for the specified Action Query Names in the App JSON. Otherwise, a map of the App's Action Query Names to Action Connection IDs will be returned in output.
     */
    actionQueryNamesToConnectionIds?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The JSON representation of the App. String length must be at least 1.
     */
    appJson?: pulumi.Input<string>;
    /**
     * If specified, this will override the human-readable description of the App in the App JSON. String length must be at least 1.
     */
    description?: pulumi.Input<string>;
    /**
     * If specified, this will override the name of the App in the App JSON. String length must be at least 1.
     */
    name?: pulumi.Input<string>;
    /**
     * Set the app to published or unpublished. Published apps are available to other users. To ensure the app is accessible to the correct users, you also need to set a [Restriction Policy](https://docs.datadoghq.com/api/latest/restriction-policies/) on the app if a policy does not yet exist. Defaults to `false`.
     */
    published?: pulumi.Input<boolean>;
    /**
     * The name of the root component of the app. This must be a grid component that contains all other components. If specified, this will override the root instance name of the App in the App JSON. String length must be at least 1.
     */
    rootInstanceName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppBuilderApp resource.
 */
export interface AppBuilderAppArgs {
    /**
     * If specified, this will override the Action Connection IDs for the specified Action Query Names in the App JSON. Otherwise, a map of the App's Action Query Names to Action Connection IDs will be returned in output.
     */
    actionQueryNamesToConnectionIds?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The JSON representation of the App. String length must be at least 1.
     */
    appJson: pulumi.Input<string>;
    /**
     * If specified, this will override the human-readable description of the App in the App JSON. String length must be at least 1.
     */
    description?: pulumi.Input<string>;
    /**
     * If specified, this will override the name of the App in the App JSON. String length must be at least 1.
     */
    name?: pulumi.Input<string>;
    /**
     * Set the app to published or unpublished. Published apps are available to other users. To ensure the app is accessible to the correct users, you also need to set a [Restriction Policy](https://docs.datadoghq.com/api/latest/restriction-policies/) on the app if a policy does not yet exist. Defaults to `false`.
     */
    published?: pulumi.Input<boolean>;
    /**
     * The name of the root component of the app. This must be a grid component that contains all other components. If specified, this will override the root instance name of the App in the App JSON. String length must be at least 1.
     */
    rootInstanceName?: pulumi.Input<string>;
}
