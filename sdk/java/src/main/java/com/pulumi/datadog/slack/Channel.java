// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.slack;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.slack.ChannelArgs;
import com.pulumi.datadog.slack.inputs.ChannelState;
import com.pulumi.datadog.slack.outputs.ChannelDisplay;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for interacting with the Datadog Slack channel API
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testChannel = new Channel(&#34;testChannel&#34;, ChannelArgs.builder()        
 *             .accountName(&#34;foo&#34;)
 *             .channelName(&#34;#test_channel&#34;)
 *             .display(ChannelDisplayArgs.builder()
 *                 .message(true)
 *                 .notified(false)
 *                 .snapshot(false)
 *                 .tags(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # Slack channel integrations can be imported using their account_name and channel_name separated with a colon (`:`).
 * 
 * ```sh
 *  $ pulumi import datadog:slack/channel:Channel test_channel &#34;foo:#test_channel&#34;
 * ```
 * 
 */
@ResourceType(type="datadog:slack/channel:Channel")
public class Channel extends com.pulumi.resources.CustomResource {
    /**
     * Slack account name.
     * 
     */
    @Export(name="accountName", type=String.class, parameters={})
    private Output<String> accountName;

    /**
     * @return Slack account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * Slack channel name.
     * 
     */
    @Export(name="channelName", type=String.class, parameters={})
    private Output<String> channelName;

    /**
     * @return Slack channel name.
     * 
     */
    public Output<String> channelName() {
        return this.channelName;
    }
    /**
     * Configuration options for what is shown in an alert event message.
     * 
     */
    @Export(name="display", type=ChannelDisplay.class, parameters={})
    private Output<ChannelDisplay> display;

    /**
     * @return Configuration options for what is shown in an alert event message.
     * 
     */
    public Output<ChannelDisplay> display() {
        return this.display;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Channel(String name) {
        this(name, ChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Channel(String name, ChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Channel(String name, ChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:slack/channel:Channel", name, args == null ? ChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Channel(String name, Output<String> id, @Nullable ChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:slack/channel:Channel", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Channel get(String name, Output<String> id, @Nullable ChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Channel(name, id, state, options);
    }
}