// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetToplistDefinitionRequestQueryCloudCostQuery {
    /**
     * @return The aggregation methods available for cloud cost queries. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
     * 
     */
    private @Nullable String aggregator;
    /**
     * @return The source organization UUID for cross organization queries. Feature in Private Beta.
     * 
     */
    private @Nullable String crossOrgUuids;
    /**
     * @return The data source for cloud cost queries. Valid values are `cloud_cost`.
     * 
     */
    private String dataSource;
    /**
     * @return The name of the query for use in formulas.
     * 
     */
    private String name;
    /**
     * @return The cloud cost query definition.
     * 
     */
    private String query;

    private DashboardWidgetToplistDefinitionRequestQueryCloudCostQuery() {}
    /**
     * @return The aggregation methods available for cloud cost queries. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
     * 
     */
    public Optional<String> aggregator() {
        return Optional.ofNullable(this.aggregator);
    }
    /**
     * @return The source organization UUID for cross organization queries. Feature in Private Beta.
     * 
     */
    public Optional<String> crossOrgUuids() {
        return Optional.ofNullable(this.crossOrgUuids);
    }
    /**
     * @return The data source for cloud cost queries. Valid values are `cloud_cost`.
     * 
     */
    public String dataSource() {
        return this.dataSource;
    }
    /**
     * @return The name of the query for use in formulas.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The cloud cost query definition.
     * 
     */
    public String query() {
        return this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetToplistDefinitionRequestQueryCloudCostQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aggregator;
        private @Nullable String crossOrgUuids;
        private String dataSource;
        private String name;
        private String query;
        public Builder() {}
        public Builder(DashboardWidgetToplistDefinitionRequestQueryCloudCostQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregator = defaults.aggregator;
    	      this.crossOrgUuids = defaults.crossOrgUuids;
    	      this.dataSource = defaults.dataSource;
    	      this.name = defaults.name;
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder aggregator(@Nullable String aggregator) {

            this.aggregator = aggregator;
            return this;
        }
        @CustomType.Setter
        public Builder crossOrgUuids(@Nullable String crossOrgUuids) {

            this.crossOrgUuids = crossOrgUuids;
            return this;
        }
        @CustomType.Setter
        public Builder dataSource(String dataSource) {
            if (dataSource == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetToplistDefinitionRequestQueryCloudCostQuery", "dataSource");
            }
            this.dataSource = dataSource;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetToplistDefinitionRequestQueryCloudCostQuery", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder query(String query) {
            if (query == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetToplistDefinitionRequestQueryCloudCostQuery", "query");
            }
            this.query = query;
            return this;
        }
        public DashboardWidgetToplistDefinitionRequestQueryCloudCostQuery build() {
            final var _resultValue = new DashboardWidgetToplistDefinitionRequestQueryCloudCostQuery();
            _resultValue.aggregator = aggregator;
            _resultValue.crossOrgUuids = crossOrgUuids;
            _resultValue.dataSource = dataSource;
            _resultValue.name = name;
            _resultValue.query = query;
            return _resultValue;
        }
    }
}