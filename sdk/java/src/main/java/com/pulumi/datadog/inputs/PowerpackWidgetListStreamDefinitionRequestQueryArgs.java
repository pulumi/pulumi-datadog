// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetListStreamDefinitionRequestQuerySortArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetListStreamDefinitionRequestQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetListStreamDefinitionRequestQueryArgs Empty = new PowerpackWidgetListStreamDefinitionRequestQueryArgs();

    /**
     * Source from which to query items to display in the stream. Valid values are `logs_stream`, `audit_stream`, `ci_pipeline_stream`, `ci_test_stream`, `rum_issue_stream`, `apm_issue_stream`, `trace_stream`, `logs_issue_stream`, `logs_pattern_stream`, `logs_transaction_stream`, `event_stream`, `rum_stream`, `llm_observability_stream`.
     * 
     */
    @Import(name="dataSource", required=true)
    private Output<String> dataSource;

    /**
     * @return Source from which to query items to display in the stream. Valid values are `logs_stream`, `audit_stream`, `ci_pipeline_stream`, `ci_test_stream`, `rum_issue_stream`, `apm_issue_stream`, `trace_stream`, `logs_issue_stream`, `logs_pattern_stream`, `logs_transaction_stream`, `event_stream`, `rum_stream`, `llm_observability_stream`.
     * 
     */
    public Output<String> dataSource() {
        return this.dataSource;
    }

    /**
     * Size of events displayed in widget. Required if `data_source` is `event_stream`. Valid values are `s`, `l`.
     * 
     */
    @Import(name="eventSize")
    private @Nullable Output<String> eventSize;

    /**
     * @return Size of events displayed in widget. Required if `data_source` is `event_stream`. Valid values are `s`, `l`.
     * 
     */
    public Optional<Output<String>> eventSize() {
        return Optional.ofNullable(this.eventSize);
    }

    /**
     * List of indexes.
     * 
     */
    @Import(name="indexes")
    private @Nullable Output<List<String>> indexes;

    /**
     * @return List of indexes.
     * 
     */
    public Optional<Output<List<String>>> indexes() {
        return Optional.ofNullable(this.indexes);
    }

    /**
     * Widget query.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<String> queryString;

    /**
     * @return Widget query.
     * 
     */
    public Optional<Output<String>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * The facet and order to sort the data, for example: `{&#34;column&#34;: &#34;time&#34;, &#34;order&#34;: &#34;desc&#34;}`.
     * 
     */
    @Import(name="sort")
    private @Nullable Output<PowerpackWidgetListStreamDefinitionRequestQuerySortArgs> sort;

    /**
     * @return The facet and order to sort the data, for example: `{&#34;column&#34;: &#34;time&#34;, &#34;order&#34;: &#34;desc&#34;}`.
     * 
     */
    public Optional<Output<PowerpackWidgetListStreamDefinitionRequestQuerySortArgs>> sort() {
        return Optional.ofNullable(this.sort);
    }

    /**
     * Storage location (private beta).
     * 
     */
    @Import(name="storage")
    private @Nullable Output<String> storage;

    /**
     * @return Storage location (private beta).
     * 
     */
    public Optional<Output<String>> storage() {
        return Optional.ofNullable(this.storage);
    }

    private PowerpackWidgetListStreamDefinitionRequestQueryArgs() {}

    private PowerpackWidgetListStreamDefinitionRequestQueryArgs(PowerpackWidgetListStreamDefinitionRequestQueryArgs $) {
        this.dataSource = $.dataSource;
        this.eventSize = $.eventSize;
        this.indexes = $.indexes;
        this.queryString = $.queryString;
        this.sort = $.sort;
        this.storage = $.storage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetListStreamDefinitionRequestQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetListStreamDefinitionRequestQueryArgs $;

        public Builder() {
            $ = new PowerpackWidgetListStreamDefinitionRequestQueryArgs();
        }

        public Builder(PowerpackWidgetListStreamDefinitionRequestQueryArgs defaults) {
            $ = new PowerpackWidgetListStreamDefinitionRequestQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataSource Source from which to query items to display in the stream. Valid values are `logs_stream`, `audit_stream`, `ci_pipeline_stream`, `ci_test_stream`, `rum_issue_stream`, `apm_issue_stream`, `trace_stream`, `logs_issue_stream`, `logs_pattern_stream`, `logs_transaction_stream`, `event_stream`, `rum_stream`, `llm_observability_stream`.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(Output<String> dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        /**
         * @param dataSource Source from which to query items to display in the stream. Valid values are `logs_stream`, `audit_stream`, `ci_pipeline_stream`, `ci_test_stream`, `rum_issue_stream`, `apm_issue_stream`, `trace_stream`, `logs_issue_stream`, `logs_pattern_stream`, `logs_transaction_stream`, `event_stream`, `rum_stream`, `llm_observability_stream`.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(String dataSource) {
            return dataSource(Output.of(dataSource));
        }

        /**
         * @param eventSize Size of events displayed in widget. Required if `data_source` is `event_stream`. Valid values are `s`, `l`.
         * 
         * @return builder
         * 
         */
        public Builder eventSize(@Nullable Output<String> eventSize) {
            $.eventSize = eventSize;
            return this;
        }

        /**
         * @param eventSize Size of events displayed in widget. Required if `data_source` is `event_stream`. Valid values are `s`, `l`.
         * 
         * @return builder
         * 
         */
        public Builder eventSize(String eventSize) {
            return eventSize(Output.of(eventSize));
        }

        /**
         * @param indexes List of indexes.
         * 
         * @return builder
         * 
         */
        public Builder indexes(@Nullable Output<List<String>> indexes) {
            $.indexes = indexes;
            return this;
        }

        /**
         * @param indexes List of indexes.
         * 
         * @return builder
         * 
         */
        public Builder indexes(List<String> indexes) {
            return indexes(Output.of(indexes));
        }

        /**
         * @param indexes List of indexes.
         * 
         * @return builder
         * 
         */
        public Builder indexes(String... indexes) {
            return indexes(List.of(indexes));
        }

        /**
         * @param queryString Widget query.
         * 
         * @return builder
         * 
         */
        public Builder queryString(@Nullable Output<String> queryString) {
            $.queryString = queryString;
            return this;
        }

        /**
         * @param queryString Widget query.
         * 
         * @return builder
         * 
         */
        public Builder queryString(String queryString) {
            return queryString(Output.of(queryString));
        }

        /**
         * @param sort The facet and order to sort the data, for example: `{&#34;column&#34;: &#34;time&#34;, &#34;order&#34;: &#34;desc&#34;}`.
         * 
         * @return builder
         * 
         */
        public Builder sort(@Nullable Output<PowerpackWidgetListStreamDefinitionRequestQuerySortArgs> sort) {
            $.sort = sort;
            return this;
        }

        /**
         * @param sort The facet and order to sort the data, for example: `{&#34;column&#34;: &#34;time&#34;, &#34;order&#34;: &#34;desc&#34;}`.
         * 
         * @return builder
         * 
         */
        public Builder sort(PowerpackWidgetListStreamDefinitionRequestQuerySortArgs sort) {
            return sort(Output.of(sort));
        }

        /**
         * @param storage Storage location (private beta).
         * 
         * @return builder
         * 
         */
        public Builder storage(@Nullable Output<String> storage) {
            $.storage = storage;
            return this;
        }

        /**
         * @param storage Storage location (private beta).
         * 
         * @return builder
         * 
         */
        public Builder storage(String storage) {
            return storage(Output.of(storage));
        }

        public PowerpackWidgetListStreamDefinitionRequestQueryArgs build() {
            if ($.dataSource == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetListStreamDefinitionRequestQueryArgs", "dataSource");
            }
            return $;
        }
    }

}