// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.ServiceLevelObjectiveArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.ServiceLevelObjectiveState;
import com.pulumi.datadog.outputs.ServiceLevelObjectiveQuery;
import com.pulumi.datadog.outputs.ServiceLevelObjectiveThreshold;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog service level objective resource. This can be used to create and manage Datadog service level objectives.
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
 *         var foo = new ServiceLevelObjective(&#34;foo&#34;, ServiceLevelObjectiveArgs.builder()        
 *             .description(&#34;My custom metric SLO&#34;)
 *             .name(&#34;Example Metric SLO&#34;)
 *             .query(ServiceLevelObjectiveQueryArgs.builder()
 *                 .denominator(&#34;sum:my.custom.count.metric{*}.as_count()&#34;)
 *                 .numerator(&#34;sum:my.custom.count.metric{type:good_events}.as_count()&#34;)
 *                 .build())
 *             .tags(            
 *                 &#34;foo:bar&#34;,
 *                 &#34;baz&#34;)
 *             .thresholds(            
 *                 ServiceLevelObjectiveThresholdArgs.builder()
 *                     .target(99.9)
 *                     .targetDisplay(&#34;99.900&#34;)
 *                     .timeframe(&#34;7d&#34;)
 *                     .warning(99.99)
 *                     .warningDisplay(&#34;99.990&#34;)
 *                     .build(),
 *                 ServiceLevelObjectiveThresholdArgs.builder()
 *                     .target(99.9)
 *                     .targetDisplay(&#34;99.900&#34;)
 *                     .timeframe(&#34;30d&#34;)
 *                     .warning(99.99)
 *                     .warningDisplay(&#34;99.990&#34;)
 *                     .build())
 *             .type(&#34;metric&#34;)
 *             .build());
 * 
 *         var bar = new ServiceLevelObjective(&#34;bar&#34;, ServiceLevelObjectiveArgs.builder()        
 *             .description(&#34;My custom monitor SLO&#34;)
 *             .monitorIds(            
 *                 1,
 *                 2,
 *                 3)
 *             .name(&#34;Example Monitor SLO&#34;)
 *             .tags(            
 *                 &#34;foo:bar&#34;,
 *                 &#34;baz&#34;)
 *             .thresholds(            
 *                 ServiceLevelObjectiveThresholdArgs.builder()
 *                     .target(99.9)
 *                     .timeframe(&#34;7d&#34;)
 *                     .warning(99.99)
 *                     .build(),
 *                 ServiceLevelObjectiveThresholdArgs.builder()
 *                     .target(99.9)
 *                     .timeframe(&#34;30d&#34;)
 *                     .warning(99.99)
 *                     .build())
 *             .type(&#34;monitor&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # Service Level Objectives can be imported using their string ID, e.g.
 * 
 * ```sh
 *  $ pulumi import datadog:index/serviceLevelObjective:ServiceLevelObjective baz 12345678901234567890123456789012
 * ```
 * 
 */
@ResourceType(type="datadog:index/serviceLevelObjective:ServiceLevelObjective")
public class ServiceLevelObjective extends com.pulumi.resources.CustomResource {
    /**
     * A description of this service level objective.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of this service level objective.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A boolean indicating whether this monitor can be deleted even if it’s referenced by other resources (e.g. dashboards).
     * 
     */
    @Export(name="forceDelete", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDelete;

    /**
     * @return A boolean indicating whether this monitor can be deleted even if it’s referenced by other resources (e.g. dashboards).
     * 
     */
    public Output<Optional<Boolean>> forceDelete() {
        return Codegen.optional(this.forceDelete);
    }
    /**
     * A static set of groups to filter monitor-based SLOs
     * 
     */
    @Export(name="groups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> groups;

    /**
     * @return A static set of groups to filter monitor-based SLOs
     * 
     */
    public Output<Optional<List<String>>> groups() {
        return Codegen.optional(this.groups);
    }
    /**
     * A static set of monitor IDs to use as part of the SLO
     * 
     */
    @Export(name="monitorIds", type=List.class, parameters={Integer.class})
    private Output</* @Nullable */ List<Integer>> monitorIds;

    /**
     * @return A static set of monitor IDs to use as part of the SLO
     * 
     */
    public Output<Optional<List<Integer>>> monitorIds() {
        return Codegen.optional(this.monitorIds);
    }
    /**
     * Name of Datadog service level objective
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of Datadog service level objective
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The metric query of good / total events
     * 
     */
    @Export(name="query", type=ServiceLevelObjectiveQuery.class, parameters={})
    private Output</* @Nullable */ ServiceLevelObjectiveQuery> query;

    /**
     * @return The metric query of good / total events
     * 
     */
    public Output<Optional<ServiceLevelObjectiveQuery>> query() {
        return Codegen.optional(this.query);
    }
    /**
     * A list of tags to associate with your service level objective. This can help you categorize and filter service level
     * objectives in the service level objectives page of the UI. Note: it&#39;s not currently possible to filter by these tags
     * when querying via the API
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tags to associate with your service level objective. This can help you categorize and filter service level
     * objectives in the service level objectives page of the UI. Note: it&#39;s not currently possible to filter by these tags
     * when querying via the API
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A list of thresholds and targets that define the service level objectives from the provided SLIs.
     * 
     */
    @Export(name="thresholds", type=List.class, parameters={ServiceLevelObjectiveThreshold.class})
    private Output<List<ServiceLevelObjectiveThreshold>> thresholds;

    /**
     * @return A list of thresholds and targets that define the service level objectives from the provided SLIs.
     * 
     */
    public Output<List<ServiceLevelObjectiveThreshold>> thresholds() {
        return this.thresholds;
    }
    /**
     * The type of the service level objective. The mapping from these types to the types found in the Datadog Web UI can be
     * found in the Datadog API [documentation
     * page](https://docs.datadoghq.com/api/v1/service-level-objectives/#create-a-slo-object).
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the service level objective. The mapping from these types to the types found in the Datadog Web UI can be
     * found in the Datadog API [documentation
     * page](https://docs.datadoghq.com/api/v1/service-level-objectives/#create-a-slo-object).
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Whether or not to validate the SLO.
     * 
     */
    @Export(name="validate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> validate;

    /**
     * @return Whether or not to validate the SLO.
     * 
     */
    public Output<Optional<Boolean>> validate() {
        return Codegen.optional(this.validate);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceLevelObjective(String name) {
        this(name, ServiceLevelObjectiveArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceLevelObjective(String name, ServiceLevelObjectiveArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceLevelObjective(String name, ServiceLevelObjectiveArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/serviceLevelObjective:ServiceLevelObjective", name, args == null ? ServiceLevelObjectiveArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceLevelObjective(String name, Output<String> id, @Nullable ServiceLevelObjectiveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/serviceLevelObjective:ServiceLevelObjective", name, state, makeResourceOptions(options, id));
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
    public static ServiceLevelObjective get(String name, Output<String> id, @Nullable ServiceLevelObjectiveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceLevelObjective(name, id, state, options);
    }
}