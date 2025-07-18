// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.MonitorJsonArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.MonitorJsonState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Datadog monitor JSON resource. This can be used to create and manage Datadog monitors using the JSON definition.
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
 * import com.pulumi.datadog.MonitorJson;
 * import com.pulumi.datadog.MonitorJsonArgs;
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
 *         var monitorJson = new MonitorJson("monitorJson", MonitorJsonArgs.builder()
 *             .monitor("""
 * {
 *     "name": "Example monitor - service check",
 *     "type": "service check",
 *     "query": "\"ntp.in_sync\".by(\"*\").last(2).count_by_status()",
 *     "message": "Change the message triggers if any host's clock goes out of sync with the time given by NTP. The offset threshold is configured in the Agent's 'ntp.yaml' file.\n\nSee [Troubleshooting NTP Offset issues](https://docs.datadoghq.com/agent/troubleshooting/ntp for more details on cause and resolution.",
 *     "tags": [],
 *     "multi": true,
 * 	"restricted_roles": null,
 *     "options": {
 *         "include_tags": true,
 *         "new_host_delay": 150,
 *         "notify_audit": false,
 *         "notify_no_data": false,
 *         "thresholds": {
 *             "warning": 1,
 *             "ok": 1,
 *             "critical": 1
 *         }
 *     },
 *     "priority": null,
 *     "classification": "custom"
 * }
 *             """)
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
 * ```sh
 * $ pulumi import datadog:index/monitorJson:MonitorJson monitor_json 123456
 * ```
 * 
 */
@ResourceType(type="datadog:index/monitorJson:MonitorJson")
public class MonitorJson extends com.pulumi.resources.CustomResource {
    /**
     * The JSON formatted definition of the monitor.
     * 
     */
    @Export(name="monitor", refs={String.class}, tree="[0]")
    private Output<String> monitor;

    /**
     * @return The JSON formatted definition of the monitor.
     * 
     */
    public Output<String> monitor() {
        return this.monitor;
    }
    /**
     * The URL of the monitor.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The URL of the monitor.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MonitorJson(java.lang.String name) {
        this(name, MonitorJsonArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MonitorJson(java.lang.String name, MonitorJsonArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MonitorJson(java.lang.String name, MonitorJsonArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/monitorJson:MonitorJson", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MonitorJson(java.lang.String name, Output<java.lang.String> id, @Nullable MonitorJsonState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/monitorJson:MonitorJson", name, state, makeResourceOptions(options, id), false);
    }

    private static MonitorJsonArgs makeArgs(MonitorJsonArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MonitorJsonArgs.Empty : args;
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
    public static MonitorJson get(java.lang.String name, Output<java.lang.String> id, @Nullable MonitorJsonState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MonitorJson(name, id, state, options);
    }
}
