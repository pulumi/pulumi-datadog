// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.aws.IntegrationExternalIdArgs;
import com.pulumi.datadog.aws.inputs.IntegrationExternalIdState;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.datadog.aws.IntegrationExternalId;
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
 *         // Create new integration_aws_external_id resource
 *         var foo = new IntegrationExternalId("foo");
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
 * Amazon Web Services external IDs can be imported using the ID value.
 * 
 * ```sh
 * $ pulumi import datadog:aws/integrationExternalId:IntegrationExternalId foo ${id}
 * ```
 * 
 */
@ResourceType(type="datadog:aws/integrationExternalId:IntegrationExternalId")
public class IntegrationExternalId extends com.pulumi.resources.CustomResource {
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationExternalId(java.lang.String name) {
        this(name, IntegrationExternalIdArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationExternalId(java.lang.String name, @Nullable IntegrationExternalIdArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationExternalId(java.lang.String name, @Nullable IntegrationExternalIdArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:aws/integrationExternalId:IntegrationExternalId", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IntegrationExternalId(java.lang.String name, Output<java.lang.String> id, @Nullable IntegrationExternalIdState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:aws/integrationExternalId:IntegrationExternalId", name, state, makeResourceOptions(options, id), false);
    }

    private static IntegrationExternalIdArgs makeArgs(@Nullable IntegrationExternalIdArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IntegrationExternalIdArgs.Empty : args;
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
    public static IntegrationExternalId get(java.lang.String name, Output<java.lang.String> id, @Nullable IntegrationExternalIdState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationExternalId(name, id, state, options);
    }
}
