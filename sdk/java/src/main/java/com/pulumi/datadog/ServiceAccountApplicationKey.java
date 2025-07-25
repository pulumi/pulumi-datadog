// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.ServiceAccountApplicationKeyArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.ServiceAccountApplicationKeyState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog `service_account_application_key` resource. This can be used to create and manage Datadog service account application keys.
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
 * import com.pulumi.datadog.ServiceAccountApplicationKey;
 * import com.pulumi.datadog.ServiceAccountApplicationKeyArgs;
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
 *         // Create new service_account_application_key resource
 *         var foo = new ServiceAccountApplicationKey("foo", ServiceAccountApplicationKeyArgs.builder()
 *             .serviceAccountId("00000000-0000-1234-0000-000000000000")
 *             .name("Application key for managing dashboards")
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
 * Importing a service account&#39;s application key cannot import the value of the key.
 * 
 * ```sh
 * $ pulumi import datadog:index/serviceAccountApplicationKey:ServiceAccountApplicationKey this &#34;&lt;service_account_id&gt;:&lt;application_key_id&gt;&#34;
 * ```
 * 
 */
@ResourceType(type="datadog:index/serviceAccountApplicationKey:ServiceAccountApplicationKey")
public class ServiceAccountApplicationKey extends com.pulumi.resources.CustomResource {
    /**
     * Creation date of the application key.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Creation date of the application key.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The value of the service account application key. This value cannot be imported.
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return The value of the service account application key. This value cannot be imported.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * The last four characters of the application key.
     * 
     */
    @Export(name="last4", refs={String.class}, tree="[0]")
    private Output<String> last4;

    /**
     * @return The last four characters of the application key.
     * 
     */
    public Output<String> last4() {
        return this.last4;
    }
    /**
     * Name of the application key.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the application key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Authorization scopes for the Application Key. Application Keys configured with no scopes have full access.
     * 
     */
    @Export(name="scopes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> scopes;

    /**
     * @return Authorization scopes for the Application Key. Application Keys configured with no scopes have full access.
     * 
     */
    public Output<Optional<List<String>>> scopes() {
        return Codegen.optional(this.scopes);
    }
    /**
     * ID of the service account that owns this key.
     * 
     */
    @Export(name="serviceAccountId", refs={String.class}, tree="[0]")
    private Output<String> serviceAccountId;

    /**
     * @return ID of the service account that owns this key.
     * 
     */
    public Output<String> serviceAccountId() {
        return this.serviceAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceAccountApplicationKey(java.lang.String name) {
        this(name, ServiceAccountApplicationKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceAccountApplicationKey(java.lang.String name, ServiceAccountApplicationKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceAccountApplicationKey(java.lang.String name, ServiceAccountApplicationKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/serviceAccountApplicationKey:ServiceAccountApplicationKey", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ServiceAccountApplicationKey(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceAccountApplicationKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/serviceAccountApplicationKey:ServiceAccountApplicationKey", name, state, makeResourceOptions(options, id), false);
    }

    private static ServiceAccountApplicationKeyArgs makeArgs(ServiceAccountApplicationKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServiceAccountApplicationKeyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "key"
            ))
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
    public static ServiceAccountApplicationKey get(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceAccountApplicationKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAccountApplicationKey(name, id, state, options);
    }
}
