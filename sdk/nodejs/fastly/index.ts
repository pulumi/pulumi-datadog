// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { IntegrationAccountArgs, IntegrationAccountState } from "./integrationAccount";
export type IntegrationAccount = import("./integrationAccount").IntegrationAccount;
export const IntegrationAccount: typeof import("./integrationAccount").IntegrationAccount = null as any;
utilities.lazyLoad(exports, ["IntegrationAccount"], () => require("./integrationAccount"));

export { IntegrationServiceArgs, IntegrationServiceState } from "./integrationService";
export type IntegrationService = import("./integrationService").IntegrationService;
export const IntegrationService: typeof import("./integrationService").IntegrationService = null as any;
utilities.lazyLoad(exports, ["IntegrationService"], () => require("./integrationService"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "datadog:fastly/integrationAccount:IntegrationAccount":
                return new IntegrationAccount(name, <any>undefined, { urn })
            case "datadog:fastly/integrationService:IntegrationService":
                return new IntegrationService(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("datadog", "fastly/integrationAccount", _module)
pulumi.runtime.registerResourceModule("datadog", "fastly/integrationService", _module)