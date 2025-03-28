// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppsecWafCustomRuleScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppsecWafCustomRuleScopeArgs Empty = new AppsecWafCustomRuleScopeArgs();

    /**
     * The environment scope for the WAF custom rule.
     * 
     */
    @Import(name="env")
    private @Nullable Output<String> env;

    /**
     * @return The environment scope for the WAF custom rule.
     * 
     */
    public Optional<Output<String>> env() {
        return Optional.ofNullable(this.env);
    }

    /**
     * The service scope for the WAF custom rule.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The service scope for the WAF custom rule.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private AppsecWafCustomRuleScopeArgs() {}

    private AppsecWafCustomRuleScopeArgs(AppsecWafCustomRuleScopeArgs $) {
        this.env = $.env;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppsecWafCustomRuleScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppsecWafCustomRuleScopeArgs $;

        public Builder() {
            $ = new AppsecWafCustomRuleScopeArgs();
        }

        public Builder(AppsecWafCustomRuleScopeArgs defaults) {
            $ = new AppsecWafCustomRuleScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param env The environment scope for the WAF custom rule.
         * 
         * @return builder
         * 
         */
        public Builder env(@Nullable Output<String> env) {
            $.env = env;
            return this;
        }

        /**
         * @param env The environment scope for the WAF custom rule.
         * 
         * @return builder
         * 
         */
        public Builder env(String env) {
            return env(Output.of(env));
        }

        /**
         * @param service The service scope for the WAF custom rule.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The service scope for the WAF custom rule.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public AppsecWafCustomRuleScopeArgs build() {
            return $;
        }
    }

}
