// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountAuthConfigAwsAuthConfigRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountAuthConfigAwsAuthConfigRoleArgs Empty = new IntegrationAccountAuthConfigAwsAuthConfigRoleArgs();

    /**
     * AWS IAM External ID for associated role
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return AWS IAM External ID for associated role
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * AWS IAM Role name
     * 
     */
    @Import(name="roleName")
    private @Nullable Output<String> roleName;

    /**
     * @return AWS IAM Role name
     * 
     */
    public Optional<Output<String>> roleName() {
        return Optional.ofNullable(this.roleName);
    }

    private IntegrationAccountAuthConfigAwsAuthConfigRoleArgs() {}

    private IntegrationAccountAuthConfigAwsAuthConfigRoleArgs(IntegrationAccountAuthConfigAwsAuthConfigRoleArgs $) {
        this.externalId = $.externalId;
        this.roleName = $.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountAuthConfigAwsAuthConfigRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountAuthConfigAwsAuthConfigRoleArgs $;

        public Builder() {
            $ = new IntegrationAccountAuthConfigAwsAuthConfigRoleArgs();
        }

        public Builder(IntegrationAccountAuthConfigAwsAuthConfigRoleArgs defaults) {
            $ = new IntegrationAccountAuthConfigAwsAuthConfigRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalId AWS IAM External ID for associated role
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId AWS IAM External ID for associated role
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param roleName AWS IAM Role name
         * 
         * @return builder
         * 
         */
        public Builder roleName(@Nullable Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName AWS IAM Role name
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        public IntegrationAccountAuthConfigAwsAuthConfigRoleArgs build() {
            return $;
        }
    }

}