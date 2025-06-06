// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ChannelArgs, ChannelState } from "./channel";
export type Channel = import("./channel").Channel;
export const Channel: typeof import("./channel").Channel = null as any;
utilities.lazyLoad(exports, ["Channel"], () => require("./channel"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "datadog:slack/channel:Channel":
                return new Channel(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("datadog", "slack/channel", _module)
