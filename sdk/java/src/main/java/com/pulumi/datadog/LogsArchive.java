// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.LogsArchiveArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.LogsArchiveState;
import com.pulumi.datadog.outputs.LogsArchiveAzureArchive;
import com.pulumi.datadog.outputs.LogsArchiveGcsArchive;
import com.pulumi.datadog.outputs.LogsArchiveS3Archive;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog Logs Archive API resource, which is used to create and manage Datadog logs archives.
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
 *         var myS3Archive = new LogsArchive(&#34;myS3Archive&#34;, LogsArchiveArgs.builder()        
 *             .name(&#34;my s3 archive&#34;)
 *             .query(&#34;service:myservice&#34;)
 *             .s3Archive(LogsArchiveS3ArchiveArgs.builder()
 *                 .accountId(&#34;001234567888&#34;)
 *                 .bucket(&#34;my-bucket&#34;)
 *                 .path(&#34;/path/foo&#34;)
 *                 .roleName(&#34;my-role-name&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import datadog:index/logsArchive:LogsArchive my_s3_archive 1Aabc2_dfQPLnXy3HlfK4hi
 * ```
 * 
 */
@ResourceType(type="datadog:index/logsArchive:LogsArchive")
public class LogsArchive extends com.pulumi.resources.CustomResource {
    /**
     * Definition of an azure archive.
     * 
     */
    @Export(name="azureArchive", type=LogsArchiveAzureArchive.class, parameters={})
    private Output</* @Nullable */ LogsArchiveAzureArchive> azureArchive;

    /**
     * @return Definition of an azure archive.
     * 
     */
    public Output<Optional<LogsArchiveAzureArchive>> azureArchive() {
        return Codegen.optional(this.azureArchive);
    }
    /**
     * Definition of a GCS archive.
     * 
     */
    @Export(name="gcsArchive", type=LogsArchiveGcsArchive.class, parameters={})
    private Output</* @Nullable */ LogsArchiveGcsArchive> gcsArchive;

    /**
     * @return Definition of a GCS archive.
     * 
     */
    public Output<Optional<LogsArchiveGcsArchive>> gcsArchive() {
        return Codegen.optional(this.gcsArchive);
    }
    /**
     * To store the tags in the archive, set the value `true`. If it is set to `false`, the tags will be dropped when the logs
     * are sent to the archive.
     * 
     */
    @Export(name="includeTags", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> includeTags;

    /**
     * @return To store the tags in the archive, set the value `true`. If it is set to `false`, the tags will be dropped when the logs
     * are sent to the archive.
     * 
     */
    public Output<Optional<Boolean>> includeTags() {
        return Codegen.optional(this.includeTags);
    }
    /**
     * Your archive name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Your archive name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The archive query/filter. Logs matching this query are included in the archive.
     * 
     */
    @Export(name="query", type=String.class, parameters={})
    private Output<String> query;

    /**
     * @return The archive query/filter. Logs matching this query are included in the archive.
     * 
     */
    public Output<String> query() {
        return this.query;
    }
    /**
     * To limit the rehydration scan size for the archive, set a value in GB.
     * 
     */
    @Export(name="rehydrationMaxScanSizeInGb", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> rehydrationMaxScanSizeInGb;

    /**
     * @return To limit the rehydration scan size for the archive, set a value in GB.
     * 
     */
    public Output<Optional<Integer>> rehydrationMaxScanSizeInGb() {
        return Codegen.optional(this.rehydrationMaxScanSizeInGb);
    }
    /**
     * An array of tags to add to rehydrated logs from an archive.
     * 
     */
    @Export(name="rehydrationTags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> rehydrationTags;

    /**
     * @return An array of tags to add to rehydrated logs from an archive.
     * 
     */
    public Output<Optional<List<String>>> rehydrationTags() {
        return Codegen.optional(this.rehydrationTags);
    }
    /**
     * Definition of an s3 archive.
     * 
     */
    @Export(name="s3Archive", type=LogsArchiveS3Archive.class, parameters={})
    private Output</* @Nullable */ LogsArchiveS3Archive> s3Archive;

    /**
     * @return Definition of an s3 archive.
     * 
     */
    public Output<Optional<LogsArchiveS3Archive>> s3Archive() {
        return Codegen.optional(this.s3Archive);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogsArchive(String name) {
        this(name, LogsArchiveArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogsArchive(String name, LogsArchiveArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogsArchive(String name, LogsArchiveArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/logsArchive:LogsArchive", name, args == null ? LogsArchiveArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogsArchive(String name, Output<String> id, @Nullable LogsArchiveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/logsArchive:LogsArchive", name, state, makeResourceOptions(options, id));
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
    public static LogsArchive get(String name, Output<String> id, @Nullable LogsArchiveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogsArchive(name, id, state, options);
    }
}