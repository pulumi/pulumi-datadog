// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.LogsCustomDestinationElasticsearchDestinationBasicAuthArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogsCustomDestinationElasticsearchDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogsCustomDestinationElasticsearchDestinationArgs Empty = new LogsCustomDestinationElasticsearchDestinationArgs();

    /**
     * Basic access authentication.
     * 
     */
    @Import(name="basicAuth", required=true)
    private Output<LogsCustomDestinationElasticsearchDestinationBasicAuthArgs> basicAuth;

    /**
     * @return Basic access authentication.
     * 
     */
    public Output<LogsCustomDestinationElasticsearchDestinationBasicAuthArgs> basicAuth() {
        return this.basicAuth;
    }

    /**
     * The destination for which logs will be forwarded to. Must have HTTPS scheme. Forwarding back to Datadog is not allowed.
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    /**
     * @return The destination for which logs will be forwarded to. Must have HTTPS scheme. Forwarding back to Datadog is not allowed.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }

    /**
     * Name of the Elasticsearch index (must follow [Elasticsearch&#39;s criteria](https://www.elastic.co/guide/en/elasticsearch/reference/8.11/indices-create-index.html#indices-create-api-path-params)).
     * 
     */
    @Import(name="indexName", required=true)
    private Output<String> indexName;

    /**
     * @return Name of the Elasticsearch index (must follow [Elasticsearch&#39;s criteria](https://www.elastic.co/guide/en/elasticsearch/reference/8.11/indices-create-index.html#indices-create-api-path-params)).
     * 
     */
    public Output<String> indexName() {
        return this.indexName;
    }

    /**
     * Date pattern with US locale and UTC timezone to be appended to the index name after adding &#39;-&#39;
     * 						(that is, &#39;${index_name}-${indexPattern}&#39;).
     * 						You can customize the index rotation naming pattern by choosing one of these options:
     * 						- Hourly: &#39;yyyy-MM-dd-HH&#39; (as an example, it would render: &#39;2022-10-19-09&#39;)
     * 						- Daily: &#39;yyyy-MM-dd&#39; (as an example, it would render: &#39;2022-10-19&#39;)
     * 						- Weekly: &#39;yyyy-&#39;W&#39;ww&#39; (as an example, it would render: &#39;2022-W42&#39;)
     * 						- Monthly: &#39;yyyy-MM&#39; (as an example, it would render: &#39;2022-10&#39;)
     * 						If this field is missing or is blank, it means that the index name will always be the same
     * 						(that is, no rotation).
     * 
     */
    @Import(name="indexRotation")
    private @Nullable Output<String> indexRotation;

    /**
     * @return Date pattern with US locale and UTC timezone to be appended to the index name after adding &#39;-&#39;
     * 						(that is, &#39;${index_name}-${indexPattern}&#39;).
     * 						You can customize the index rotation naming pattern by choosing one of these options:
     * 						- Hourly: &#39;yyyy-MM-dd-HH&#39; (as an example, it would render: &#39;2022-10-19-09&#39;)
     * 						- Daily: &#39;yyyy-MM-dd&#39; (as an example, it would render: &#39;2022-10-19&#39;)
     * 						- Weekly: &#39;yyyy-&#39;W&#39;ww&#39; (as an example, it would render: &#39;2022-W42&#39;)
     * 						- Monthly: &#39;yyyy-MM&#39; (as an example, it would render: &#39;2022-10&#39;)
     * 						If this field is missing or is blank, it means that the index name will always be the same
     * 						(that is, no rotation).
     * 
     */
    public Optional<Output<String>> indexRotation() {
        return Optional.ofNullable(this.indexRotation);
    }

    private LogsCustomDestinationElasticsearchDestinationArgs() {}

    private LogsCustomDestinationElasticsearchDestinationArgs(LogsCustomDestinationElasticsearchDestinationArgs $) {
        this.basicAuth = $.basicAuth;
        this.endpoint = $.endpoint;
        this.indexName = $.indexName;
        this.indexRotation = $.indexRotation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsCustomDestinationElasticsearchDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsCustomDestinationElasticsearchDestinationArgs $;

        public Builder() {
            $ = new LogsCustomDestinationElasticsearchDestinationArgs();
        }

        public Builder(LogsCustomDestinationElasticsearchDestinationArgs defaults) {
            $ = new LogsCustomDestinationElasticsearchDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basicAuth Basic access authentication.
         * 
         * @return builder
         * 
         */
        public Builder basicAuth(Output<LogsCustomDestinationElasticsearchDestinationBasicAuthArgs> basicAuth) {
            $.basicAuth = basicAuth;
            return this;
        }

        /**
         * @param basicAuth Basic access authentication.
         * 
         * @return builder
         * 
         */
        public Builder basicAuth(LogsCustomDestinationElasticsearchDestinationBasicAuthArgs basicAuth) {
            return basicAuth(Output.of(basicAuth));
        }

        /**
         * @param endpoint The destination for which logs will be forwarded to. Must have HTTPS scheme. Forwarding back to Datadog is not allowed.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The destination for which logs will be forwarded to. Must have HTTPS scheme. Forwarding back to Datadog is not allowed.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param indexName Name of the Elasticsearch index (must follow [Elasticsearch&#39;s criteria](https://www.elastic.co/guide/en/elasticsearch/reference/8.11/indices-create-index.html#indices-create-api-path-params)).
         * 
         * @return builder
         * 
         */
        public Builder indexName(Output<String> indexName) {
            $.indexName = indexName;
            return this;
        }

        /**
         * @param indexName Name of the Elasticsearch index (must follow [Elasticsearch&#39;s criteria](https://www.elastic.co/guide/en/elasticsearch/reference/8.11/indices-create-index.html#indices-create-api-path-params)).
         * 
         * @return builder
         * 
         */
        public Builder indexName(String indexName) {
            return indexName(Output.of(indexName));
        }

        /**
         * @param indexRotation Date pattern with US locale and UTC timezone to be appended to the index name after adding &#39;-&#39;
         * 						(that is, &#39;${index_name}-${indexPattern}&#39;).
         * 						You can customize the index rotation naming pattern by choosing one of these options:
         * 						- Hourly: &#39;yyyy-MM-dd-HH&#39; (as an example, it would render: &#39;2022-10-19-09&#39;)
         * 						- Daily: &#39;yyyy-MM-dd&#39; (as an example, it would render: &#39;2022-10-19&#39;)
         * 						- Weekly: &#39;yyyy-&#39;W&#39;ww&#39; (as an example, it would render: &#39;2022-W42&#39;)
         * 						- Monthly: &#39;yyyy-MM&#39; (as an example, it would render: &#39;2022-10&#39;)
         * 						If this field is missing or is blank, it means that the index name will always be the same
         * 						(that is, no rotation).
         * 
         * @return builder
         * 
         */
        public Builder indexRotation(@Nullable Output<String> indexRotation) {
            $.indexRotation = indexRotation;
            return this;
        }

        /**
         * @param indexRotation Date pattern with US locale and UTC timezone to be appended to the index name after adding &#39;-&#39;
         * 						(that is, &#39;${index_name}-${indexPattern}&#39;).
         * 						You can customize the index rotation naming pattern by choosing one of these options:
         * 						- Hourly: &#39;yyyy-MM-dd-HH&#39; (as an example, it would render: &#39;2022-10-19-09&#39;)
         * 						- Daily: &#39;yyyy-MM-dd&#39; (as an example, it would render: &#39;2022-10-19&#39;)
         * 						- Weekly: &#39;yyyy-&#39;W&#39;ww&#39; (as an example, it would render: &#39;2022-W42&#39;)
         * 						- Monthly: &#39;yyyy-MM&#39; (as an example, it would render: &#39;2022-10&#39;)
         * 						If this field is missing or is blank, it means that the index name will always be the same
         * 						(that is, no rotation).
         * 
         * @return builder
         * 
         */
        public Builder indexRotation(String indexRotation) {
            return indexRotation(Output.of(indexRotation));
        }

        public LogsCustomDestinationElasticsearchDestinationArgs build() {
            if ($.basicAuth == null) {
                throw new MissingRequiredPropertyException("LogsCustomDestinationElasticsearchDestinationArgs", "basicAuth");
            }
            if ($.endpoint == null) {
                throw new MissingRequiredPropertyException("LogsCustomDestinationElasticsearchDestinationArgs", "endpoint");
            }
            if ($.indexName == null) {
                throw new MissingRequiredPropertyException("LogsCustomDestinationElasticsearchDestinationArgs", "indexName");
            }
            return $;
        }
    }

}