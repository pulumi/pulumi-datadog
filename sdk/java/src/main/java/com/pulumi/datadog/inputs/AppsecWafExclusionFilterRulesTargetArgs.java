// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.AppsecWafExclusionFilterRulesTargetTagsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppsecWafExclusionFilterRulesTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppsecWafExclusionFilterRulesTargetArgs Empty = new AppsecWafExclusionFilterRulesTargetArgs();

    /**
     * Target a single WAF rule based on its identifier.
     * 
     */
    @Import(name="ruleId")
    private @Nullable Output<String> ruleId;

    /**
     * @return Target a single WAF rule based on its identifier.
     * 
     */
    public Optional<Output<String>> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    @Import(name="tags")
    private @Nullable Output<AppsecWafExclusionFilterRulesTargetTagsArgs> tags;

    public Optional<Output<AppsecWafExclusionFilterRulesTargetTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AppsecWafExclusionFilterRulesTargetArgs() {}

    private AppsecWafExclusionFilterRulesTargetArgs(AppsecWafExclusionFilterRulesTargetArgs $) {
        this.ruleId = $.ruleId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppsecWafExclusionFilterRulesTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppsecWafExclusionFilterRulesTargetArgs $;

        public Builder() {
            $ = new AppsecWafExclusionFilterRulesTargetArgs();
        }

        public Builder(AppsecWafExclusionFilterRulesTargetArgs defaults) {
            $ = new AppsecWafExclusionFilterRulesTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ruleId Target a single WAF rule based on its identifier.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(@Nullable Output<String> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param ruleId Target a single WAF rule based on its identifier.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(String ruleId) {
            return ruleId(Output.of(ruleId));
        }

        public Builder tags(@Nullable Output<AppsecWafExclusionFilterRulesTargetTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(AppsecWafExclusionFilterRulesTargetTagsArgs tags) {
            return tags(Output.of(tags));
        }

        public AppsecWafExclusionFilterRulesTargetArgs build() {
            return $;
        }
    }

}
