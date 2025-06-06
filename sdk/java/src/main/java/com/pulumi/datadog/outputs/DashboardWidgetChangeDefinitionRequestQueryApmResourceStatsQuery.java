// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetChangeDefinitionRequestQueryApmResourceStatsQuery {
    /**
     * @return The source organization UUID for cross organization queries. Feature in Private Beta.
     * 
     */
    private @Nullable String crossOrgUuids;
    /**
     * @return The data source for APM Resource Stats queries. Valid values are `apm_resource_stats`.
     * 
     */
    private String dataSource;
    /**
     * @return APM environment.
     * 
     */
    private String env;
    /**
     * @return Array of fields to group results by.
     * 
     */
    private @Nullable List<String> groupBies;
    /**
     * @return The name of query for use in formulas.
     * 
     */
    private String name;
    /**
     * @return Name of operation on service.
     * 
     */
    private @Nullable String operationName;
    /**
     * @return The name of the second primary tag used within APM; required when `primary_tag_value` is specified. See https://docs.datadoghq.com/tracing/guide/setting*primary*tags*to*scope/#add-a-second-primary-tag-in-datadog.
     * 
     */
    private @Nullable String primaryTagName;
    /**
     * @return Filter APM data by the second primary tag. `primary_tag_name` must also be specified.
     * 
     */
    private @Nullable String primaryTagValue;
    /**
     * @return APM resource.
     * 
     */
    private @Nullable String resourceName;
    /**
     * @return APM service.
     * 
     */
    private String service;
    /**
     * @return APM statistic. Valid values are `errors`, `error_rate`, `hits`, `latency_avg`, `latency_distribution`, `latency_max`, `latency_p50`, `latency_p75`, `latency_p90`, `latency_p95`, `latency_p99`.
     * 
     */
    private String stat;

    private DashboardWidgetChangeDefinitionRequestQueryApmResourceStatsQuery() {}
    /**
     * @return The source organization UUID for cross organization queries. Feature in Private Beta.
     * 
     */
    public Optional<String> crossOrgUuids() {
        return Optional.ofNullable(this.crossOrgUuids);
    }
    /**
     * @return The data source for APM Resource Stats queries. Valid values are `apm_resource_stats`.
     * 
     */
    public String dataSource() {
        return this.dataSource;
    }
    /**
     * @return APM environment.
     * 
     */
    public String env() {
        return this.env;
    }
    /**
     * @return Array of fields to group results by.
     * 
     */
    public List<String> groupBies() {
        return this.groupBies == null ? List.of() : this.groupBies;
    }
    /**
     * @return The name of query for use in formulas.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name of operation on service.
     * 
     */
    public Optional<String> operationName() {
        return Optional.ofNullable(this.operationName);
    }
    /**
     * @return The name of the second primary tag used within APM; required when `primary_tag_value` is specified. See https://docs.datadoghq.com/tracing/guide/setting*primary*tags*to*scope/#add-a-second-primary-tag-in-datadog.
     * 
     */
    public Optional<String> primaryTagName() {
        return Optional.ofNullable(this.primaryTagName);
    }
    /**
     * @return Filter APM data by the second primary tag. `primary_tag_name` must also be specified.
     * 
     */
    public Optional<String> primaryTagValue() {
        return Optional.ofNullable(this.primaryTagValue);
    }
    /**
     * @return APM resource.
     * 
     */
    public Optional<String> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }
    /**
     * @return APM service.
     * 
     */
    public String service() {
        return this.service;
    }
    /**
     * @return APM statistic. Valid values are `errors`, `error_rate`, `hits`, `latency_avg`, `latency_distribution`, `latency_max`, `latency_p50`, `latency_p75`, `latency_p90`, `latency_p95`, `latency_p99`.
     * 
     */
    public String stat() {
        return this.stat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetChangeDefinitionRequestQueryApmResourceStatsQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String crossOrgUuids;
        private String dataSource;
        private String env;
        private @Nullable List<String> groupBies;
        private String name;
        private @Nullable String operationName;
        private @Nullable String primaryTagName;
        private @Nullable String primaryTagValue;
        private @Nullable String resourceName;
        private String service;
        private String stat;
        public Builder() {}
        public Builder(DashboardWidgetChangeDefinitionRequestQueryApmResourceStatsQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossOrgUuids = defaults.crossOrgUuids;
    	      this.dataSource = defaults.dataSource;
    	      this.env = defaults.env;
    	      this.groupBies = defaults.groupBies;
    	      this.name = defaults.name;
    	      this.operationName = defaults.operationName;
    	      this.primaryTagName = defaults.primaryTagName;
    	      this.primaryTagValue = defaults.primaryTagValue;
    	      this.resourceName = defaults.resourceName;
    	      this.service = defaults.service;
    	      this.stat = defaults.stat;
        }

        @CustomType.Setter
        public Builder crossOrgUuids(@Nullable String crossOrgUuids) {

            this.crossOrgUuids = crossOrgUuids;
            return this;
        }
        @CustomType.Setter
        public Builder dataSource(String dataSource) {
            if (dataSource == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetChangeDefinitionRequestQueryApmResourceStatsQuery", "dataSource");
            }
            this.dataSource = dataSource;
            return this;
        }
        @CustomType.Setter
        public Builder env(String env) {
            if (env == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetChangeDefinitionRequestQueryApmResourceStatsQuery", "env");
            }
            this.env = env;
            return this;
        }
        @CustomType.Setter
        public Builder groupBies(@Nullable List<String> groupBies) {

            this.groupBies = groupBies;
            return this;
        }
        public Builder groupBies(String... groupBies) {
            return groupBies(List.of(groupBies));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetChangeDefinitionRequestQueryApmResourceStatsQuery", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder operationName(@Nullable String operationName) {

            this.operationName = operationName;
            return this;
        }
        @CustomType.Setter
        public Builder primaryTagName(@Nullable String primaryTagName) {

            this.primaryTagName = primaryTagName;
            return this;
        }
        @CustomType.Setter
        public Builder primaryTagValue(@Nullable String primaryTagValue) {

            this.primaryTagValue = primaryTagValue;
            return this;
        }
        @CustomType.Setter
        public Builder resourceName(@Nullable String resourceName) {

            this.resourceName = resourceName;
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            if (service == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetChangeDefinitionRequestQueryApmResourceStatsQuery", "service");
            }
            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder stat(String stat) {
            if (stat == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetChangeDefinitionRequestQueryApmResourceStatsQuery", "stat");
            }
            this.stat = stat;
            return this;
        }
        public DashboardWidgetChangeDefinitionRequestQueryApmResourceStatsQuery build() {
            final var _resultValue = new DashboardWidgetChangeDefinitionRequestQueryApmResourceStatsQuery();
            _resultValue.crossOrgUuids = crossOrgUuids;
            _resultValue.dataSource = dataSource;
            _resultValue.env = env;
            _resultValue.groupBies = groupBies;
            _resultValue.name = name;
            _resultValue.operationName = operationName;
            _resultValue.primaryTagName = primaryTagName;
            _resultValue.primaryTagValue = primaryTagValue;
            _resultValue.resourceName = resourceName;
            _resultValue.service = service;
            _resultValue.stat = stat;
            return _resultValue;
        }
    }
}
