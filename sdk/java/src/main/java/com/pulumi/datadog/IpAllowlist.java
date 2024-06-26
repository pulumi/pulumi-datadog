// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.IpAllowlistArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.IpAllowlistState;
import com.pulumi.datadog.outputs.IpAllowlistEntry;
import java.lang.Boolean;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides the Datadog IP allowlist resource. This can be used to manage the Datadog IP allowlist
 * 
 */
@ResourceType(type="datadog:index/ipAllowlist:IpAllowlist")
public class IpAllowlist extends com.pulumi.resources.CustomResource {
    /**
     * Whether the IP Allowlist is enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Whether the IP Allowlist is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Set of objects containing an IP address or range of IP addresses in the allowlist and an accompanying note.
     * 
     */
    @Export(name="entries", refs={List.class,IpAllowlistEntry.class}, tree="[0,1]")
    private Output</* @Nullable */ List<IpAllowlistEntry>> entries;

    /**
     * @return Set of objects containing an IP address or range of IP addresses in the allowlist and an accompanying note.
     * 
     */
    public Output<Optional<List<IpAllowlistEntry>>> entries() {
        return Codegen.optional(this.entries);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IpAllowlist(String name) {
        this(name, IpAllowlistArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpAllowlist(String name, IpAllowlistArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpAllowlist(String name, IpAllowlistArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/ipAllowlist:IpAllowlist", name, args == null ? IpAllowlistArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IpAllowlist(String name, Output<String> id, @Nullable IpAllowlistState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/ipAllowlist:IpAllowlist", name, state, makeResourceOptions(options, id));
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
    public static IpAllowlist get(String name, Output<String> id, @Nullable IpAllowlistState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IpAllowlist(name, id, state, options);
    }
}
