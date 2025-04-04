// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class TeamPermissionSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamPermissionSettingArgs Empty = new TeamPermissionSettingArgs();

    /**
     * The identifier for the action. Valid values are `manage_membership`, `edit`.
     * 
     */
    @Import(name="action", required=true)
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
    @Import(name="teamId", required=true)
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
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The action value. Valid values are dependent on the action. `manage_membership` action allows `admins`, `members`, `organization`, `user_access_manage` values. `edit` action allows `admins`, `members`, `teams_manage` values.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private TeamPermissionSettingArgs() {}

    private TeamPermissionSettingArgs(TeamPermissionSettingArgs $) {
        this.action = $.action;
        this.teamId = $.teamId;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamPermissionSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamPermissionSettingArgs $;

        public Builder() {
            $ = new TeamPermissionSettingArgs();
        }

        public Builder(TeamPermissionSettingArgs defaults) {
            $ = new TeamPermissionSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The identifier for the action. Valid values are `manage_membership`, `edit`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The identifier for the action. Valid values are `manage_membership`, `edit`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param teamId ID of the team the team permission setting is associated with.
         * 
         * @return builder
         * 
         */
        public Builder teamId(Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId ID of the team the team permission setting is associated with.
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        /**
         * @param value The action value. Valid values are dependent on the action. `manage_membership` action allows `admins`, `members`, `organization`, `user_access_manage` values. `edit` action allows `admins`, `members`, `teams_manage` values.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The action value. Valid values are dependent on the action. `manage_membership` action allows `admins`, `members`, `organization`, `user_access_manage` values. `edit` action allows `admins`, `members`, `teams_manage` values.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TeamPermissionSettingArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("TeamPermissionSettingArgs", "action");
            }
            if ($.teamId == null) {
                throw new MissingRequiredPropertyException("TeamPermissionSettingArgs", "teamId");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("TeamPermissionSettingArgs", "value");
            }
            return $;
        }
    }

}
