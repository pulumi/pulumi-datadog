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
public final class PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery {
    /**
     * @return Additional filters applied to the SLO query.
     * 
     */
    private @Nullable String additionalQueryFilters;
    /**
     * @return The data source for APM Dependency Stats queries. Valid values are `apm_dependency_stats`.
     * 
     */
    private String dataSource;
    /**
     * @return Group mode to query measures. Valid values are `overall`, `components`. Defaults to `&#34;overall&#34;`.
     * 
     */
    private @Nullable String groupMode;
    /**
     * @return SLO measures queries. Valid values are `good_events`, `bad_events`, `slo_status`, `error_budget_remaining`, `burn_rate`, `error_budget_burndown`.
     * 
     */
    private String measure;
    /**
     * @return The name of the powerpack template variable.
     * 
     */
    private @Nullable String name;
    /**
     * @return ID of an SLO to query.
     * 
     */
    private String sloId;
    /**
     * @return type of the SLO to query. Valid values are `metric`. Defaults to `&#34;metric&#34;`.
     * 
     */
    private @Nullable String sloQueryType;

    private PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery() {}
    /**
     * @return Additional filters applied to the SLO query.
     * 
     */
    public Optional<String> additionalQueryFilters() {
        return Optional.ofNullable(this.additionalQueryFilters);
    }
    /**
     * @return The data source for APM Dependency Stats queries. Valid values are `apm_dependency_stats`.
     * 
     */
    public String dataSource() {
        return this.dataSource;
    }
    /**
     * @return Group mode to query measures. Valid values are `overall`, `components`. Defaults to `&#34;overall&#34;`.
     * 
     */
    public Optional<String> groupMode() {
        return Optional.ofNullable(this.groupMode);
    }
    /**
     * @return SLO measures queries. Valid values are `good_events`, `bad_events`, `slo_status`, `error_budget_remaining`, `burn_rate`, `error_budget_burndown`.
     * 
     */
    public String measure() {
        return this.measure;
    }
    /**
     * @return The name of the powerpack template variable.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return ID of an SLO to query.
     * 
     */
    public String sloId() {
        return this.sloId;
    }
    /**
     * @return type of the SLO to query. Valid values are `metric`. Defaults to `&#34;metric&#34;`.
     * 
     */
    public Optional<String> sloQueryType() {
        return Optional.ofNullable(this.sloQueryType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String additionalQueryFilters;
        private String dataSource;
        private @Nullable String groupMode;
        private String measure;
        private @Nullable String name;
        private String sloId;
        private @Nullable String sloQueryType;
        public Builder() {}
        public Builder(PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalQueryFilters = defaults.additionalQueryFilters;
    	      this.dataSource = defaults.dataSource;
    	      this.groupMode = defaults.groupMode;
    	      this.measure = defaults.measure;
    	      this.name = defaults.name;
    	      this.sloId = defaults.sloId;
    	      this.sloQueryType = defaults.sloQueryType;
        }

        @CustomType.Setter
        public Builder additionalQueryFilters(@Nullable String additionalQueryFilters) {

            this.additionalQueryFilters = additionalQueryFilters;
            return this;
        }
        @CustomType.Setter
        public Builder dataSource(String dataSource) {
            if (dataSource == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery", "dataSource");
            }
            this.dataSource = dataSource;
            return this;
        }
        @CustomType.Setter
        public Builder groupMode(@Nullable String groupMode) {

            this.groupMode = groupMode;
            return this;
        }
        @CustomType.Setter
        public Builder measure(String measure) {
            if (measure == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery", "measure");
            }
            this.measure = measure;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder sloId(String sloId) {
            if (sloId == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery", "sloId");
            }
            this.sloId = sloId;
            return this;
        }
        @CustomType.Setter
        public Builder sloQueryType(@Nullable String sloQueryType) {

            this.sloQueryType = sloQueryType;
            return this;
        }
        public PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery build() {
            final var _resultValue = new PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery();
            _resultValue.additionalQueryFilters = additionalQueryFilters;
            _resultValue.dataSource = dataSource;
            _resultValue.groupMode = groupMode;
            _resultValue.measure = measure;
            _resultValue.name = name;
            _resultValue.sloId = sloId;
            _resultValue.sloQueryType = sloQueryType;
            return _resultValue;
        }
    }
}