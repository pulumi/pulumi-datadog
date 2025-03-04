// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetListStreamDefinitionRequestQueryGroupBy;
import com.pulumi.datadog.outputs.PowerpackWidgetListStreamDefinitionRequestQuerySort;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetListStreamDefinitionRequestQuery {
    /**
     * @return Specifies the field for logs pattern clustering. Can only be used with `logs_pattern_stream`.
     * 
     */
    private @Nullable String clusteringPatternFieldPath;
    /**
     * @return Source from which to query items to display in the stream. Valid values are `logs_stream`, `audit_stream`, `ci_pipeline_stream`, `ci_test_stream`, `rum_issue_stream`, `apm_issue_stream`, `trace_stream`, `logs_issue_stream`, `logs_pattern_stream`, `logs_transaction_stream`, `event_stream`, `rum_stream`, `llm_observability_stream`.
     * 
     */
    private String dataSource;
    /**
     * @return Size of events displayed in widget. Required if `data_source` is `event_stream`. Valid values are `s`, `l`.
     * 
     */
    private @Nullable String eventSize;
    /**
     * @return Group by configuration for the List Stream widget. Group by can only be used with `logs_pattern_stream` (up to 4 items) or `logs_transaction_stream` (one group by item is required) list stream source.
     * 
     */
    private @Nullable List<PowerpackWidgetListStreamDefinitionRequestQueryGroupBy> groupBies;
    /**
     * @return List of indexes.
     * 
     */
    private @Nullable List<String> indexes;
    /**
     * @return Widget query.
     * 
     */
    private @Nullable String queryString;
    /**
     * @return The facet and order to sort the data, for example: `{&#34;column&#34;: &#34;time&#34;, &#34;order&#34;: &#34;desc&#34;}`.
     * 
     */
    private @Nullable PowerpackWidgetListStreamDefinitionRequestQuerySort sort;
    /**
     * @return Storage location (private beta).
     * 
     */
    private @Nullable String storage;

    private PowerpackWidgetListStreamDefinitionRequestQuery() {}
    /**
     * @return Specifies the field for logs pattern clustering. Can only be used with `logs_pattern_stream`.
     * 
     */
    public Optional<String> clusteringPatternFieldPath() {
        return Optional.ofNullable(this.clusteringPatternFieldPath);
    }
    /**
     * @return Source from which to query items to display in the stream. Valid values are `logs_stream`, `audit_stream`, `ci_pipeline_stream`, `ci_test_stream`, `rum_issue_stream`, `apm_issue_stream`, `trace_stream`, `logs_issue_stream`, `logs_pattern_stream`, `logs_transaction_stream`, `event_stream`, `rum_stream`, `llm_observability_stream`.
     * 
     */
    public String dataSource() {
        return this.dataSource;
    }
    /**
     * @return Size of events displayed in widget. Required if `data_source` is `event_stream`. Valid values are `s`, `l`.
     * 
     */
    public Optional<String> eventSize() {
        return Optional.ofNullable(this.eventSize);
    }
    /**
     * @return Group by configuration for the List Stream widget. Group by can only be used with `logs_pattern_stream` (up to 4 items) or `logs_transaction_stream` (one group by item is required) list stream source.
     * 
     */
    public List<PowerpackWidgetListStreamDefinitionRequestQueryGroupBy> groupBies() {
        return this.groupBies == null ? List.of() : this.groupBies;
    }
    /**
     * @return List of indexes.
     * 
     */
    public List<String> indexes() {
        return this.indexes == null ? List.of() : this.indexes;
    }
    /**
     * @return Widget query.
     * 
     */
    public Optional<String> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return The facet and order to sort the data, for example: `{&#34;column&#34;: &#34;time&#34;, &#34;order&#34;: &#34;desc&#34;}`.
     * 
     */
    public Optional<PowerpackWidgetListStreamDefinitionRequestQuerySort> sort() {
        return Optional.ofNullable(this.sort);
    }
    /**
     * @return Storage location (private beta).
     * 
     */
    public Optional<String> storage() {
        return Optional.ofNullable(this.storage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetListStreamDefinitionRequestQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clusteringPatternFieldPath;
        private String dataSource;
        private @Nullable String eventSize;
        private @Nullable List<PowerpackWidgetListStreamDefinitionRequestQueryGroupBy> groupBies;
        private @Nullable List<String> indexes;
        private @Nullable String queryString;
        private @Nullable PowerpackWidgetListStreamDefinitionRequestQuerySort sort;
        private @Nullable String storage;
        public Builder() {}
        public Builder(PowerpackWidgetListStreamDefinitionRequestQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusteringPatternFieldPath = defaults.clusteringPatternFieldPath;
    	      this.dataSource = defaults.dataSource;
    	      this.eventSize = defaults.eventSize;
    	      this.groupBies = defaults.groupBies;
    	      this.indexes = defaults.indexes;
    	      this.queryString = defaults.queryString;
    	      this.sort = defaults.sort;
    	      this.storage = defaults.storage;
        }

        @CustomType.Setter
        public Builder clusteringPatternFieldPath(@Nullable String clusteringPatternFieldPath) {

            this.clusteringPatternFieldPath = clusteringPatternFieldPath;
            return this;
        }
        @CustomType.Setter
        public Builder dataSource(String dataSource) {
            if (dataSource == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetListStreamDefinitionRequestQuery", "dataSource");
            }
            this.dataSource = dataSource;
            return this;
        }
        @CustomType.Setter
        public Builder eventSize(@Nullable String eventSize) {

            this.eventSize = eventSize;
            return this;
        }
        @CustomType.Setter
        public Builder groupBies(@Nullable List<PowerpackWidgetListStreamDefinitionRequestQueryGroupBy> groupBies) {

            this.groupBies = groupBies;
            return this;
        }
        public Builder groupBies(PowerpackWidgetListStreamDefinitionRequestQueryGroupBy... groupBies) {
            return groupBies(List.of(groupBies));
        }
        @CustomType.Setter
        public Builder indexes(@Nullable List<String> indexes) {

            this.indexes = indexes;
            return this;
        }
        public Builder indexes(String... indexes) {
            return indexes(List.of(indexes));
        }
        @CustomType.Setter
        public Builder queryString(@Nullable String queryString) {

            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder sort(@Nullable PowerpackWidgetListStreamDefinitionRequestQuerySort sort) {

            this.sort = sort;
            return this;
        }
        @CustomType.Setter
        public Builder storage(@Nullable String storage) {

            this.storage = storage;
            return this;
        }
        public PowerpackWidgetListStreamDefinitionRequestQuery build() {
            final var _resultValue = new PowerpackWidgetListStreamDefinitionRequestQuery();
            _resultValue.clusteringPatternFieldPath = clusteringPatternFieldPath;
            _resultValue.dataSource = dataSource;
            _resultValue.eventSize = eventSize;
            _resultValue.groupBies = groupBies;
            _resultValue.indexes = indexes;
            _resultValue.queryString = queryString;
            _resultValue.sort = sort;
            _resultValue.storage = storage;
            return _resultValue;
        }
    }
}
