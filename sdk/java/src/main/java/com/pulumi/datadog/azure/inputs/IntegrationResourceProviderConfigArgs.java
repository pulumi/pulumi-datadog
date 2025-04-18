// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class IntegrationResourceProviderConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationResourceProviderConfigArgs Empty = new IntegrationResourceProviderConfigArgs();

    @Import(name="metricsEnabled", required=true)
    private Output<Boolean> metricsEnabled;

    public Output<Boolean> metricsEnabled() {
        return this.metricsEnabled;
    }

    @Import(name="namespace", required=true)
    private Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    private IntegrationResourceProviderConfigArgs() {}

    private IntegrationResourceProviderConfigArgs(IntegrationResourceProviderConfigArgs $) {
        this.metricsEnabled = $.metricsEnabled;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationResourceProviderConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationResourceProviderConfigArgs $;

        public Builder() {
            $ = new IntegrationResourceProviderConfigArgs();
        }

        public Builder(IntegrationResourceProviderConfigArgs defaults) {
            $ = new IntegrationResourceProviderConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder metricsEnabled(Output<Boolean> metricsEnabled) {
            $.metricsEnabled = metricsEnabled;
            return this;
        }

        public Builder metricsEnabled(Boolean metricsEnabled) {
            return metricsEnabled(Output.of(metricsEnabled));
        }

        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public IntegrationResourceProviderConfigArgs build() {
            if ($.metricsEnabled == null) {
                throw new MissingRequiredPropertyException("IntegrationResourceProviderConfigArgs", "metricsEnabled");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("IntegrationResourceProviderConfigArgs", "namespace");
            }
            return $;
        }
    }

}
