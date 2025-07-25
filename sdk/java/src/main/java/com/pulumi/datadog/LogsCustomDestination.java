// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.LogsCustomDestinationArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.LogsCustomDestinationState;
import com.pulumi.datadog.outputs.LogsCustomDestinationElasticsearchDestination;
import com.pulumi.datadog.outputs.LogsCustomDestinationHttpDestination;
import com.pulumi.datadog.outputs.LogsCustomDestinationMicrosoftSentinelDestination;
import com.pulumi.datadog.outputs.LogsCustomDestinationSplunkDestination;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog Logs Custom Destination API resource, which is used to create and manage Datadog log forwarding.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.datadog.LogsCustomDestination;
 * import com.pulumi.datadog.LogsCustomDestinationArgs;
 * import com.pulumi.datadog.inputs.LogsCustomDestinationHttpDestinationArgs;
 * import com.pulumi.datadog.inputs.LogsCustomDestinationHttpDestinationBasicAuthArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var sampleDestination = new LogsCustomDestination("sampleDestination", LogsCustomDestinationArgs.builder()
 *             .name("sample destination")
 *             .query("service:my-service")
 *             .enabled(true)
 *             .httpDestination(LogsCustomDestinationHttpDestinationArgs.builder()
 *                 .endpoint("https://example.org")
 *                 .basicAuth(LogsCustomDestinationHttpDestinationBasicAuthArgs.builder()
 *                     .username("my-username")
 *                     .password("my-password")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * The `pulumi import` command can be used, for example:
 * 
 * Custom destinations can be imported using the destination ID. Caution: auth credentials can not be imported.
 * 
 * ```sh
 * $ pulumi import datadog:index/logsCustomDestination:LogsCustomDestination sample_destination &#34;destination-id&#34;
 * ```
 * 
 */
@ResourceType(type="datadog:index/logsCustomDestination:LogsCustomDestination")
public class LogsCustomDestination extends com.pulumi.resources.CustomResource {
    /**
     * The Elasticsearch destination.
     * 
     */
    @Export(name="elasticsearchDestination", refs={LogsCustomDestinationElasticsearchDestination.class}, tree="[0]")
    private Output</* @Nullable */ LogsCustomDestinationElasticsearchDestination> elasticsearchDestination;

    /**
     * @return The Elasticsearch destination.
     * 
     */
    public Output<Optional<LogsCustomDestinationElasticsearchDestination>> elasticsearchDestination() {
        return Codegen.optional(this.elasticsearchDestination);
    }
    /**
     * Whether logs matching this custom destination should be forwarded or not.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Whether logs matching this custom destination should be forwarded or not.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Whether tags from the forwarded logs should be forwarded or not.
     * 
     */
    @Export(name="forwardTags", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> forwardTags;

    /**
     * @return Whether tags from the forwarded logs should be forwarded or not.
     * 
     */
    public Output<Boolean> forwardTags() {
        return this.forwardTags;
    }
    /**
     * How the `forward_tags_restriction_list` parameter should be interpreted.
     * 			If `ALLOW_LIST`, then only tags whose keys on the forwarded logs match the ones on the restriction list
     * 			are forwarded.
     * 			`BLOCK_LIST` works the opposite way. It does not forward the tags matching the ones on the list. Valid values are `ALLOW_LIST`, `BLOCK_LIST`.
     * 
     */
    @Export(name="forwardTagsRestrictionListType", refs={String.class}, tree="[0]")
    private Output<String> forwardTagsRestrictionListType;

    /**
     * @return How the `forward_tags_restriction_list` parameter should be interpreted.
     * 			If `ALLOW_LIST`, then only tags whose keys on the forwarded logs match the ones on the restriction list
     * 			are forwarded.
     * 			`BLOCK_LIST` works the opposite way. It does not forward the tags matching the ones on the list. Valid values are `ALLOW_LIST`, `BLOCK_LIST`.
     * 
     */
    public Output<String> forwardTagsRestrictionListType() {
        return this.forwardTagsRestrictionListType;
    }
    /**
     * List of [tag keys](https://docs.datadoghq.com/getting_started/tagging/#define-tags) to be filtered.
     * 			An empty list represents no restriction is in place and either all or no tags will be
     * 			forwarded depending on `forward_tags_restriction_list_type` parameter.
     * 
     */
    @Export(name="forwardTagsRestrictionLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> forwardTagsRestrictionLists;

    /**
     * @return List of [tag keys](https://docs.datadoghq.com/getting_started/tagging/#define-tags) to be filtered.
     * 			An empty list represents no restriction is in place and either all or no tags will be
     * 			forwarded depending on `forward_tags_restriction_list_type` parameter.
     * 
     */
    public Output<List<String>> forwardTagsRestrictionLists() {
        return this.forwardTagsRestrictionLists;
    }
    /**
     * The HTTP destination.
     * 
     */
    @Export(name="httpDestination", refs={LogsCustomDestinationHttpDestination.class}, tree="[0]")
    private Output</* @Nullable */ LogsCustomDestinationHttpDestination> httpDestination;

    /**
     * @return The HTTP destination.
     * 
     */
    public Output<Optional<LogsCustomDestinationHttpDestination>> httpDestination() {
        return Codegen.optional(this.httpDestination);
    }
    /**
     * The Microsoft Sentinel destination.
     * 
     */
    @Export(name="microsoftSentinelDestination", refs={LogsCustomDestinationMicrosoftSentinelDestination.class}, tree="[0]")
    private Output</* @Nullable */ LogsCustomDestinationMicrosoftSentinelDestination> microsoftSentinelDestination;

    /**
     * @return The Microsoft Sentinel destination.
     * 
     */
    public Output<Optional<LogsCustomDestinationMicrosoftSentinelDestination>> microsoftSentinelDestination() {
        return Codegen.optional(this.microsoftSentinelDestination);
    }
    /**
     * The custom destination name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The custom destination name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The custom destination query filter. Logs matching this query are forwarded to the destination.
     * 
     */
    @Export(name="query", refs={String.class}, tree="[0]")
    private Output<String> query;

    /**
     * @return The custom destination query filter. Logs matching this query are forwarded to the destination.
     * 
     */
    public Output<String> query() {
        return this.query;
    }
    /**
     * The Splunk HTTP Event Collector (HEC) destination.
     * 
     */
    @Export(name="splunkDestination", refs={LogsCustomDestinationSplunkDestination.class}, tree="[0]")
    private Output</* @Nullable */ LogsCustomDestinationSplunkDestination> splunkDestination;

    /**
     * @return The Splunk HTTP Event Collector (HEC) destination.
     * 
     */
    public Output<Optional<LogsCustomDestinationSplunkDestination>> splunkDestination() {
        return Codegen.optional(this.splunkDestination);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogsCustomDestination(java.lang.String name) {
        this(name, LogsCustomDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogsCustomDestination(java.lang.String name, LogsCustomDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogsCustomDestination(java.lang.String name, LogsCustomDestinationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/logsCustomDestination:LogsCustomDestination", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LogsCustomDestination(java.lang.String name, Output<java.lang.String> id, @Nullable LogsCustomDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/logsCustomDestination:LogsCustomDestination", name, state, makeResourceOptions(options, id), false);
    }

    private static LogsCustomDestinationArgs makeArgs(LogsCustomDestinationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LogsCustomDestinationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static LogsCustomDestination get(java.lang.String name, Output<java.lang.String> id, @Nullable LogsCustomDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogsCustomDestination(name, id, state, options);
    }
}
