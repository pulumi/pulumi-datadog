// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs Empty = new LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs();

    /**
     * Filter criteria of the category.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return Filter criteria of the category.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    private LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs() {}

    private LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs(LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs $) {
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs $;

        public Builder() {
            $ = new LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs();
        }

        public Builder(LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs defaults) {
            $ = new LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param query Filter criteria of the category.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Filter criteria of the category.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        public LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs build() {
            if ($.query == null) {
                throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorCategoryFilterArgs", "query");
            }
            return $;
        }
    }

}