// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.ServiceLevelObjectiveSliSpecificationTimeSliceQueryFormula;
import com.pulumi.datadog.outputs.ServiceLevelObjectiveSliSpecificationTimeSliceQueryQuery;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceLevelObjectiveSliSpecificationTimeSliceQuery {
    /**
     * @return A list that contains exactly one formula, as only a single formula may be used to define a timeseries query for a time-slice SLO.
     * 
     */
    private ServiceLevelObjectiveSliSpecificationTimeSliceQueryFormula formula;
    /**
     * @return A list of data-source-specific queries that are in the formula.
     * 
     */
    private List<ServiceLevelObjectiveSliSpecificationTimeSliceQueryQuery> queries;

    private ServiceLevelObjectiveSliSpecificationTimeSliceQuery() {}
    /**
     * @return A list that contains exactly one formula, as only a single formula may be used to define a timeseries query for a time-slice SLO.
     * 
     */
    public ServiceLevelObjectiveSliSpecificationTimeSliceQueryFormula formula() {
        return this.formula;
    }
    /**
     * @return A list of data-source-specific queries that are in the formula.
     * 
     */
    public List<ServiceLevelObjectiveSliSpecificationTimeSliceQueryQuery> queries() {
        return this.queries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLevelObjectiveSliSpecificationTimeSliceQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ServiceLevelObjectiveSliSpecificationTimeSliceQueryFormula formula;
        private List<ServiceLevelObjectiveSliSpecificationTimeSliceQueryQuery> queries;
        public Builder() {}
        public Builder(ServiceLevelObjectiveSliSpecificationTimeSliceQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.formula = defaults.formula;
    	      this.queries = defaults.queries;
        }

        @CustomType.Setter
        public Builder formula(ServiceLevelObjectiveSliSpecificationTimeSliceQueryFormula formula) {
            if (formula == null) {
              throw new MissingRequiredPropertyException("ServiceLevelObjectiveSliSpecificationTimeSliceQuery", "formula");
            }
            this.formula = formula;
            return this;
        }
        @CustomType.Setter
        public Builder queries(List<ServiceLevelObjectiveSliSpecificationTimeSliceQueryQuery> queries) {
            if (queries == null) {
              throw new MissingRequiredPropertyException("ServiceLevelObjectiveSliSpecificationTimeSliceQuery", "queries");
            }
            this.queries = queries;
            return this;
        }
        public Builder queries(ServiceLevelObjectiveSliSpecificationTimeSliceQueryQuery... queries) {
            return queries(List.of(queries));
        }
        public ServiceLevelObjectiveSliSpecificationTimeSliceQuery build() {
            final var _resultValue = new ServiceLevelObjectiveSliSpecificationTimeSliceQuery();
            _resultValue.formula = formula;
            _resultValue.queries = queries;
            return _resultValue;
        }
    }
}