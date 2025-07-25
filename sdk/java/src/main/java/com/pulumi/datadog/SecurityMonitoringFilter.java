// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.SecurityMonitoringFilterArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.SecurityMonitoringFilterState;
import com.pulumi.datadog.outputs.SecurityMonitoringFilterExclusionFilter;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog Security Monitoring Rule API resource for security filters.
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
 * import com.pulumi.datadog.SecurityMonitoringFilter;
 * import com.pulumi.datadog.SecurityMonitoringFilterArgs;
 * import com.pulumi.datadog.inputs.SecurityMonitoringFilterExclusionFilterArgs;
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
 *         var myFilter = new SecurityMonitoringFilter("myFilter", SecurityMonitoringFilterArgs.builder()
 *             .name("My filter")
 *             .query("The filter is filtering.")
 *             .isEnabled(true)
 *             .exclusionFilters(            
 *                 SecurityMonitoringFilterExclusionFilterArgs.builder()
 *                     .name("first")
 *                     .query("exclude some logs")
 *                     .build(),
 *                 SecurityMonitoringFilterExclusionFilterArgs.builder()
 *                     .name("second")
 *                     .query("exclude some other logs")
 *                     .build())
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
 * Security monitoring filters can be imported using ID, e.g.
 * 
 * ```sh
 * $ pulumi import datadog:index/securityMonitoringFilter:SecurityMonitoringFilter my_filter m0o-hto-lkb
 * ```
 * 
 */
@ResourceType(type="datadog:index/securityMonitoringFilter:SecurityMonitoringFilter")
public class SecurityMonitoringFilter extends com.pulumi.resources.CustomResource {
    /**
     * Exclusion filters to exclude some logs from the security filter.
     * 
     */
    @Export(name="exclusionFilters", refs={List.class,SecurityMonitoringFilterExclusionFilter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SecurityMonitoringFilterExclusionFilter>> exclusionFilters;

    /**
     * @return Exclusion filters to exclude some logs from the security filter.
     * 
     */
    public Output<Optional<List<SecurityMonitoringFilterExclusionFilter>>> exclusionFilters() {
        return Codegen.optional(this.exclusionFilters);
    }
    /**
     * The filtered data type. Valid values are `logs`. Defaults to `&#34;logs&#34;`.
     * 
     */
    @Export(name="filteredDataType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> filteredDataType;

    /**
     * @return The filtered data type. Valid values are `logs`. Defaults to `&#34;logs&#34;`.
     * 
     */
    public Output<Optional<String>> filteredDataType() {
        return Codegen.optional(this.filteredDataType);
    }
    /**
     * Whether the security filter is enabled.
     * 
     */
    @Export(name="isEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isEnabled;

    /**
     * @return Whether the security filter is enabled.
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }
    /**
     * The name of the security filter.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the security filter.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The query of the security filter.
     * 
     */
    @Export(name="query", refs={String.class}, tree="[0]")
    private Output<String> query;

    /**
     * @return The query of the security filter.
     * 
     */
    public Output<String> query() {
        return this.query;
    }
    /**
     * The version of the security filter.
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return The version of the security filter.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityMonitoringFilter(java.lang.String name) {
        this(name, SecurityMonitoringFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityMonitoringFilter(java.lang.String name, SecurityMonitoringFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityMonitoringFilter(java.lang.String name, SecurityMonitoringFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/securityMonitoringFilter:SecurityMonitoringFilter", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SecurityMonitoringFilter(java.lang.String name, Output<java.lang.String> id, @Nullable SecurityMonitoringFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/securityMonitoringFilter:SecurityMonitoringFilter", name, state, makeResourceOptions(options, id), false);
    }

    private static SecurityMonitoringFilterArgs makeArgs(SecurityMonitoringFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SecurityMonitoringFilterArgs.Empty : args;
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
    public static SecurityMonitoringFilter get(java.lang.String name, Output<java.lang.String> id, @Nullable SecurityMonitoringFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecurityMonitoringFilter(name, id, state, options);
    }
}
