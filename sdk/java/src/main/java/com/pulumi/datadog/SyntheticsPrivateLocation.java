// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.SyntheticsPrivateLocationArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.SyntheticsPrivateLocationState;
import com.pulumi.datadog.outputs.SyntheticsPrivateLocationMetadata;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog synthetics private location resource. This can be used to create and manage Datadog synthetics private locations.
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
 *         var privateLocation = new SyntheticsPrivateLocation(&#34;privateLocation&#34;, SyntheticsPrivateLocationArgs.builder()        
 *             .description(&#34;Description of the private location&#34;)
 *             .name(&#34;First private location&#34;)
 *             .tags(            
 *                 &#34;foo:bar&#34;,
 *                 &#34;env:test&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # Synthetics private locations can be imported using their string ID, e.g.
 * 
 * ```sh
 *  $ pulumi import datadog:index/syntheticsPrivateLocation:SyntheticsPrivateLocation bar pl:private-location-name-abcdef123456
 * ```
 * 
 */
@ResourceType(type="datadog:index/syntheticsPrivateLocation:SyntheticsPrivateLocation")
public class SyntheticsPrivateLocation extends com.pulumi.resources.CustomResource {
    /**
     * Configuration skeleton for the private location. See installation instructions of the private location on how to use
     * this configuration.
     * 
     */
    @Export(name="config", type=String.class, parameters={})
    private Output<String> config;

    /**
     * @return Configuration skeleton for the private location. See installation instructions of the private location on how to use
     * this configuration.
     * 
     */
    public Output<String> config() {
        return this.config;
    }
    /**
     * Description of the private location.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the private location.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The private location metadata
     * 
     */
    @Export(name="metadata", type=SyntheticsPrivateLocationMetadata.class, parameters={})
    private Output</* @Nullable */ SyntheticsPrivateLocationMetadata> metadata;

    /**
     * @return The private location metadata
     * 
     */
    public Output<Optional<SyntheticsPrivateLocationMetadata>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Synthetics private location name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Synthetics private location name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of tags to associate with your synthetics private location.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tags to associate with your synthetics private location.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SyntheticsPrivateLocation(String name) {
        this(name, SyntheticsPrivateLocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SyntheticsPrivateLocation(String name, SyntheticsPrivateLocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SyntheticsPrivateLocation(String name, SyntheticsPrivateLocationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/syntheticsPrivateLocation:SyntheticsPrivateLocation", name, args == null ? SyntheticsPrivateLocationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SyntheticsPrivateLocation(String name, Output<String> id, @Nullable SyntheticsPrivateLocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/syntheticsPrivateLocation:SyntheticsPrivateLocation", name, state, makeResourceOptions(options, id));
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
    public static SyntheticsPrivateLocation get(String name, Output<String> id, @Nullable SyntheticsPrivateLocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SyntheticsPrivateLocation(name, id, state, options);
    }
}