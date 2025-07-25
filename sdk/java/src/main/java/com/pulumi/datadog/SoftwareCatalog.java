// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.SoftwareCatalogArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.SoftwareCatalogState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Datadog Software Catalog Entity resource. This can be used to create and manage entities in Datadog Software Catalog using the YAML/JSON definition.
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
 * import com.pulumi.datadog.SoftwareCatalog;
 * import com.pulumi.datadog.SoftwareCatalogArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         // v3 service entity 
 *         var serviceV3 = new SoftwareCatalog("serviceV3", SoftwareCatalogArgs.builder()
 *             .entity("""
 * apiVersion: v3
 * kind: service
 * metadata:
 *   name: shopping-cart
 *   displayName: Shopping Cart
 *   inheritFrom: service:otherService
 *   tags:
 *     - tag:value
 *   links:
 *     - name: shopping-cart runbook
 *       type: runbook
 *       url: https://runbook/shopping-cart
 *     - name: shopping-cart architecture
 *       provider: gdoc
 *       url: https://google.drive/shopping-cart-architecture
 *       type: doc
 *     - name: shopping-cart Wiki
 *       provider: wiki
 *       url: https://wiki/shopping-cart
 *       type: doc
 *     - name: shopping-cart source code
 *       provider: github
 *       url: http://github/shopping-cart
 *       type: repo
 *   contacts:
 *     - name: Support Email
 *       type: email
 *       contact: team}{@literal @}{@code shopping.com
 *     - name: Support Slack
 *       type: slack
 *       contact: https://www.slack.com/archives/shopping-cart
 *   owner: myteam
 *   additionalOwners:
 *     - name: opsTeam
 *       type: operator
 * integrations:
 *   pagerduty:
 *     serviceURL: https://www.pagerduty.com/service-directory/Pshopping-cart
 *   opsgenie:
 *     serviceURL: https://www.opsgenie.com/service/shopping-cart
 *     region: US
 * extensions:
 *   datadoghq.com/shopping-cart:
 *     customField: customValue
 * spec:
 *   lifecycle: production
 *   tier: "1"
 *   type: web
 *   languages:
 *     - go
 *     - python
 *   dependsOn:
 *     - service:serviceA
 *     - service:serviceB
 * datadog:
 *   performanceData:
 *     tags:
 *       - 'service:shopping-cart'
 *       - 'hostname:shopping-cart'
 *   events:
 *     - name: "deployment events"
 *       query: "app:myapp AND type:github"
 *     - name: "event type B"
 *       query: "app:myapp AND type:github"
 *   logs:
 *     - name: "critical logs"
 *       query: "app:myapp AND type:github"
 *     - name: "ops logs"
 *       query: "app:myapp AND type:github"
 *   pipelines:
 *     fingerprints:
 *       - fp1
 *       - fp2
 *   codeLocations:
 *     - repositoryURL: http://github/shopping-cart.git
 *       paths:
 *         - baz/*.c
 *         - bat/**}&#47;{@code *
 *         - ../plop/*.java
 *     - repositoryURL: http://github/shopping-cart-2.git
 *       paths:
 *         - baz/*.c
 *         - bat/**}&#47;{@code *
 *         - ../plop/*.java
 *             """)
 *             .build());
 * 
 *         // v3 datastore entity 
 *         var datastoreV3 = new SoftwareCatalog("datastoreV3", SoftwareCatalogArgs.builder()
 *             .entity("""
 * apiVersion: v3
 * kind: datastore
 * metadata:
 *   name: shopping-cart-db
 *   tags:
 *     - tag:value
 *   links:
 *     - name: shopping-cart-db runbook
 *       type: runbook
 *       url: https://runbook/shopping-cart
 *   contacts:
 *     - name: Support Email
 *       type: email
 *       contact: team}{@literal @}{@code shopping.com
 *     - name: Support Slack
 *       type: slack
 *       contact: https://www.slack.com/archives/shopping-cart
 *   owner: myteam
 *   additionalOwners:
 *     - name: opsTeam
 *       type: operator
 * integrations:
 *   pagerduty:
 *     serviceURL: https://www.pagerduty.com/service-directory/Pshopping-cart
 *   opsgenie:
 *     serviceURL: https://www.opsgenie.com/service/shopping-cart
 *     region: US
 * extensions:
 *   datadoghq.com/shopping-cart-db:
 *     customField: customValue
 * spec:
 *   lifecycle: production
 *   tier: "1"
 *   type: "postgres"
 * datadog:
 *   performanceData:
 *     tags: ['tag:random']
 *             """)
 *             .build());
 * 
 *         // v3 queue entity 
 *         var queueV3 = new SoftwareCatalog("queueV3", SoftwareCatalogArgs.builder()
 *             .entity("""
 * apiVersion: v3
 * kind: queue
 * metadata:
 *   name: order-queue
 *   tags:
 *     - tag:value
 *   links:
 *     - name: order-queue runbook
 *       type: runbook
 *       url: https://runbook/order-queue
 *   contacts:
 *     - name: Support Email
 *       type: email
 *       contact: team}{@literal @}{@code shopping.com
 *     - name: Support Slack
 *       type: slack
 *       contact: https://www.slack.com/archives/shopping-cart
 *   owner: myteam
 *   additionalOwners:
 *     - name: opsTeam
 *       type: operator
 * integrations:
 *   pagerduty:
 *     serviceURL: https://www.pagerduty.com/service-directory/Pshopping-cart
 *   opsgenie:
 *     serviceURL: https://www.opsgenie.com/service/shopping-cart
 *     region: US
 * extensions:
 *   datadoghq.com/order-queue:
 *     customField: customValue
 * spec:
 *   lifecycle: production
 *   tier: "1"
 *   type: kafka
 * datadog:
 *   performanceData:
 *     tags: ['tag:random']
 *             """)
 *             .build());
 * 
 *         // v3 system entity 
 *         var systemV3 = new SoftwareCatalog("systemV3", SoftwareCatalogArgs.builder()
 *             .entity("""
 * apiVersion: v3
 * kind: system
 * metadata:
 *   name: shopping-system
 *   displayName: Shopping System
 *   tags:
 *     - tag:value
 *   links:
 *     - name: shopping-system runbook
 *       type: runbook
 *       url: https://runbook/shopping-system
 *   contacts:
 *     - name: Support Email
 *       type: email
 *       contact: team}{@literal @}{@code shopping.com
 *     - name: Support Slack
 *       type: slack
 *       contact: https://www.slack.com/archives/shopping-cart
 *   owner: myteam
 *   additionalOwners:
 *     - name: opsTeam
 *       type: operator
 * integrations:
 *   pagerduty:
 *     serviceURL: https://www.pagerduty.com/service-directory/Pshopping-cart
 *   opsgenie:
 *     serviceURL: https://www.opsgenie.com/service/shopping-cart
 *     region: US
 * spec:
 *   components:
 *     - service:shopping-cart
 *     - queue:order-queue
 *     - database:shopping-cart-db
 * extensions:
 *   datadoghq.com/shopping-system:
 *     customField: customValue
 * datadog:
 *   events:
 *     - name: "deployment events"
 *       query: "app:myapp AND type:github"
 *     - name: "event type B"
 *       query: "app:myapp AND type:github"
 *   logs:
 *     - name: "critical logs"
 *       query: "app:myapp AND type:github"
 *     - name: "ops logs"
 *       query: "app:myapp AND type:github"
 *             """)
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * The `pulumi import` command can be used, for example:
 * 
 * ```sh
 * $ pulumi import datadog:index/softwareCatalog:SoftwareCatalog this &lt;name&gt;
 * ```
 * 
 */
@ResourceType(type="datadog:index/softwareCatalog:SoftwareCatalog")
public class SoftwareCatalog extends com.pulumi.resources.CustomResource {
    /**
     * The catalog entity definition. Entity must be a valid entity YAML/JSON structure.
     * 
     */
    @Export(name="entity", refs={String.class}, tree="[0]")
    private Output<String> entity;

    /**
     * @return The catalog entity definition. Entity must be a valid entity YAML/JSON structure.
     * 
     */
    public Output<String> entity() {
        return this.entity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SoftwareCatalog(java.lang.String name) {
        this(name, SoftwareCatalogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SoftwareCatalog(java.lang.String name, SoftwareCatalogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SoftwareCatalog(java.lang.String name, SoftwareCatalogArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/softwareCatalog:SoftwareCatalog", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SoftwareCatalog(java.lang.String name, Output<java.lang.String> id, @Nullable SoftwareCatalogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/softwareCatalog:SoftwareCatalog", name, state, makeResourceOptions(options, id), false);
    }

    private static SoftwareCatalogArgs makeArgs(SoftwareCatalogArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SoftwareCatalogArgs.Empty : args;
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
    public static SoftwareCatalog get(java.lang.String name, Output<java.lang.String> id, @Nullable SoftwareCatalogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SoftwareCatalog(name, id, state, options);
    }
}
