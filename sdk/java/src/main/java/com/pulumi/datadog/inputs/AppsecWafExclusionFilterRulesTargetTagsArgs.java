// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppsecWafExclusionFilterRulesTargetTagsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppsecWafExclusionFilterRulesTargetTagsArgs Empty = new AppsecWafExclusionFilterRulesTargetTagsArgs();

    /**
     * The category of the targeted WAF rules.
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return The category of the targeted WAF rules.
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * The type of the targeted WAF rules.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the targeted WAF rules.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AppsecWafExclusionFilterRulesTargetTagsArgs() {}

    private AppsecWafExclusionFilterRulesTargetTagsArgs(AppsecWafExclusionFilterRulesTargetTagsArgs $) {
        this.category = $.category;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppsecWafExclusionFilterRulesTargetTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppsecWafExclusionFilterRulesTargetTagsArgs $;

        public Builder() {
            $ = new AppsecWafExclusionFilterRulesTargetTagsArgs();
        }

        public Builder(AppsecWafExclusionFilterRulesTargetTagsArgs defaults) {
            $ = new AppsecWafExclusionFilterRulesTargetTagsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category The category of the targeted WAF rules.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The category of the targeted WAF rules.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param type The type of the targeted WAF rules.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the targeted WAF rules.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AppsecWafExclusionFilterRulesTargetTagsArgs build() {
            return $;
        }
    }

}
