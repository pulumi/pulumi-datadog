// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.fastly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.fastly.IntegrationServiceArgs;
import com.pulumi.datadog.fastly.inputs.IntegrationServiceState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog IntegrationFastlyService resource. This can be used to create and manage Datadog integration_fastly_service.
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
 * import com.pulumi.datadog.fastly.IntegrationAccount;
 * import com.pulumi.datadog.fastly.IntegrationAccountArgs;
 * import com.pulumi.datadog.fastly.IntegrationService;
 * import com.pulumi.datadog.fastly.IntegrationServiceArgs;
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
 *         var foo = new IntegrationAccount("foo", IntegrationAccountArgs.builder()
 *             .apiKey("ABCDEFG123")
 *             .name("test-name")
 *             .build());
 * 
 *         // Create new integration_fastly_service resource
 *         var fooIntegrationService = new IntegrationService("fooIntegrationService", IntegrationServiceArgs.builder()
 *             .accountId(foo.id())
 *             .tags(            
 *                 "mytag",
 *                 "mytag2:myvalue")
 *             .serviceId("my-service-id")
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
 * $ pulumi import datadog:fastly/integrationService:IntegrationService new_list &#34;account-id:service-id&#34;
 * ```
 * 
 */
@ResourceType(type="datadog:fastly/integrationService:IntegrationService")
public class IntegrationService extends com.pulumi.resources.CustomResource {
    /**
     * Fastly Account id.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return Fastly Account id.
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * The ID of the Fastly service.
     * 
     */
    @Export(name="serviceId", refs={String.class}, tree="[0]")
    private Output<String> serviceId;

    /**
     * @return The ID of the Fastly service.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }
    /**
     * A list of tags for the Fastly service.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tags for the Fastly service.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationService(java.lang.String name) {
        this(name, IntegrationServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationService(java.lang.String name, IntegrationServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationService(java.lang.String name, IntegrationServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:fastly/integrationService:IntegrationService", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IntegrationService(java.lang.String name, Output<java.lang.String> id, @Nullable IntegrationServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:fastly/integrationService:IntegrationService", name, state, makeResourceOptions(options, id), false);
    }

    private static IntegrationServiceArgs makeArgs(IntegrationServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IntegrationServiceArgs.Empty : args;
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
    public static IntegrationService get(java.lang.String name, Output<java.lang.String> id, @Nullable IntegrationServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationService(name, id, state, options);
    }
}
