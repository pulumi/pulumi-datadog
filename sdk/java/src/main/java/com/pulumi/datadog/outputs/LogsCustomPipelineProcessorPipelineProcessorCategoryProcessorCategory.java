// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilter;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategory {
    private LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilter filter;
    private String name;

    private LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategory() {}
    public LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilter filter() {
        return this.filter;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilter filter;
        private String name;
        public Builder() {}
        public Builder(LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder filter(LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilter filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategory build() {
            final var o = new LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategory();
            o.filter = filter;
            o.name = name;
            return o;
        }
    }
}