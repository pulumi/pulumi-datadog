// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryCompute;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryGroupBy;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryValueDefinitionRequestQueryEventQuerySearch;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetQueryValueDefinitionRequestQueryEventQuery {
    /**
     * @return The compute options.
     * 
     */
    private List<PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryCompute> computes;
    /**
     * @return The source organization UUID for cross organization queries. Feature in Private Beta.
     * 
     */
    private @Nullable String crossOrgUuids;
    /**
     * @return The data source for event platform-based queries. Valid values are `logs`, `spans`, `network`, `rum`, `security_signals`, `profiles`, `audit`, `events`, `ci_tests`, `ci_pipelines`, `incident_analytics`.
     * 
     */
    private String dataSource;
    /**
     * @return Group by options.
     * 
     */
    private @Nullable List<PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryGroupBy> groupBies;
    /**
     * @return An array of index names to query in the stream.
     * 
     */
    private @Nullable List<String> indexes;
    /**
     * @return The name of query for use in formulas.
     * 
     */
    private String name;
    /**
     * @return The search options.
     * 
     */
    private @Nullable PowerpackWidgetQueryValueDefinitionRequestQueryEventQuerySearch search;
    /**
     * @return Storage location (private beta).
     * 
     */
    private @Nullable String storage;

    private PowerpackWidgetQueryValueDefinitionRequestQueryEventQuery() {}
    /**
     * @return The compute options.
     * 
     */
    public List<PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryCompute> computes() {
        return this.computes;
    }
    /**
     * @return The source organization UUID for cross organization queries. Feature in Private Beta.
     * 
     */
    public Optional<String> crossOrgUuids() {
        return Optional.ofNullable(this.crossOrgUuids);
    }
    /**
     * @return The data source for event platform-based queries. Valid values are `logs`, `spans`, `network`, `rum`, `security_signals`, `profiles`, `audit`, `events`, `ci_tests`, `ci_pipelines`, `incident_analytics`.
     * 
     */
    public String dataSource() {
        return this.dataSource;
    }
    /**
     * @return Group by options.
     * 
     */
    public List<PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryGroupBy> groupBies() {
        return this.groupBies == null ? List.of() : this.groupBies;
    }
    /**
     * @return An array of index names to query in the stream.
     * 
     */
    public List<String> indexes() {
        return this.indexes == null ? List.of() : this.indexes;
    }
    /**
     * @return The name of query for use in formulas.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The search options.
     * 
     */
    public Optional<PowerpackWidgetQueryValueDefinitionRequestQueryEventQuerySearch> search() {
        return Optional.ofNullable(this.search);
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

    public static Builder builder(PowerpackWidgetQueryValueDefinitionRequestQueryEventQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryCompute> computes;
        private @Nullable String crossOrgUuids;
        private String dataSource;
        private @Nullable List<PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryGroupBy> groupBies;
        private @Nullable List<String> indexes;
        private String name;
        private @Nullable PowerpackWidgetQueryValueDefinitionRequestQueryEventQuerySearch search;
        private @Nullable String storage;
        public Builder() {}
        public Builder(PowerpackWidgetQueryValueDefinitionRequestQueryEventQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computes = defaults.computes;
    	      this.crossOrgUuids = defaults.crossOrgUuids;
    	      this.dataSource = defaults.dataSource;
    	      this.groupBies = defaults.groupBies;
    	      this.indexes = defaults.indexes;
    	      this.name = defaults.name;
    	      this.search = defaults.search;
    	      this.storage = defaults.storage;
        }

        @CustomType.Setter
        public Builder computes(List<PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryCompute> computes) {
            if (computes == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetQueryValueDefinitionRequestQueryEventQuery", "computes");
            }
            this.computes = computes;
            return this;
        }
        public Builder computes(PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryCompute... computes) {
            return computes(List.of(computes));
        }
        @CustomType.Setter
        public Builder crossOrgUuids(@Nullable String crossOrgUuids) {

            this.crossOrgUuids = crossOrgUuids;
            return this;
        }
        @CustomType.Setter
        public Builder dataSource(String dataSource) {
            if (dataSource == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetQueryValueDefinitionRequestQueryEventQuery", "dataSource");
            }
            this.dataSource = dataSource;
            return this;
        }
        @CustomType.Setter
        public Builder groupBies(@Nullable List<PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryGroupBy> groupBies) {

            this.groupBies = groupBies;
            return this;
        }
        public Builder groupBies(PowerpackWidgetQueryValueDefinitionRequestQueryEventQueryGroupBy... groupBies) {
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
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetQueryValueDefinitionRequestQueryEventQuery", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder search(@Nullable PowerpackWidgetQueryValueDefinitionRequestQueryEventQuerySearch search) {

            this.search = search;
            return this;
        }
        @CustomType.Setter
        public Builder storage(@Nullable String storage) {

            this.storage = storage;
            return this;
        }
        public PowerpackWidgetQueryValueDefinitionRequestQueryEventQuery build() {
            final var _resultValue = new PowerpackWidgetQueryValueDefinitionRequestQueryEventQuery();
            _resultValue.computes = computes;
            _resultValue.crossOrgUuids = crossOrgUuids;
            _resultValue.dataSource = dataSource;
            _resultValue.groupBies = groupBies;
            _resultValue.indexes = indexes;
            _resultValue.name = name;
            _resultValue.search = search;
            _resultValue.storage = storage;
            return _resultValue;
        }
    }
}