// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.TeamPermissionSettingArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.TeamPermissionSettingState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Datadog TeamPermissionSetting resource. This can be used to manage Datadog team_permission_setting.
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
 * import com.pulumi.datadog.Team;
 * import com.pulumi.datadog.TeamArgs;
 * import com.pulumi.datadog.TeamPermissionSetting;
 * import com.pulumi.datadog.TeamPermissionSettingArgs;
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
 *         var foo = new Team("foo", TeamArgs.builder()
 *             .description("Example team")
 *             .handle("example-team-updated")
 *             .name("Example Team-updated")
 *             .build());
 * 
 *         var fooTeamPermissionSetting = new TeamPermissionSetting("fooTeamPermissionSetting", TeamPermissionSettingArgs.builder()
 *             .teamId(foo.id())
 *             .action("manage_membership")
 *             .value("organization")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="datadog:index/teamPermissionSetting:TeamPermissionSetting")
public class TeamPermissionSetting extends com.pulumi.resources.CustomResource {
    /**
     * The identifier for the action. Valid values are `manage_membership`, `edit`.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return The identifier for the action. Valid values are `manage_membership`, `edit`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * ID of the team the team permission setting is associated with.
     * 
     */
    @Export(name="teamId", refs={String.class}, tree="[0]")
    private Output<String> teamId;

    /**
     * @return ID of the team the team permission setting is associated with.
     * 
     */
    public Output<String> teamId() {
        return this.teamId;
    }
    /**
     * The action value. Valid values are dependent on the action. `manage_membership` action allows `admins`, `members`, `organization`, `user_access_manage` values. `edit` action allows `admins`, `members`, `teams_manage` values.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return The action value. Valid values are dependent on the action. `manage_membership` action allows `admins`, `members`, `organization`, `user_access_manage` values. `edit` action allows `admins`, `members`, `teams_manage` values.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TeamPermissionSetting(java.lang.String name) {
        this(name, TeamPermissionSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TeamPermissionSetting(java.lang.String name, TeamPermissionSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TeamPermissionSetting(java.lang.String name, TeamPermissionSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/teamPermissionSetting:TeamPermissionSetting", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TeamPermissionSetting(java.lang.String name, Output<java.lang.String> id, @Nullable TeamPermissionSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/teamPermissionSetting:TeamPermissionSetting", name, state, makeResourceOptions(options, id), false);
    }

    private static TeamPermissionSettingArgs makeArgs(TeamPermissionSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TeamPermissionSettingArgs.Empty : args;
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
    public static TeamPermissionSetting get(java.lang.String name, Output<java.lang.String> id, @Nullable TeamPermissionSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TeamPermissionSetting(name, id, state, options);
    }
}
