// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.MonitorVariablesCloudCostQuery;
import com.pulumi.datadog.outputs.MonitorVariablesEventQuery;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class MonitorVariables {
    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    private @Nullable List<MonitorVariablesCloudCostQuery> cloudCostQueries;
    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    private @Nullable List<MonitorVariablesEventQuery> eventQueries;

    private MonitorVariables() {}
    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    public List<MonitorVariablesCloudCostQuery> cloudCostQueries() {
        return this.cloudCostQueries == null ? List.of() : this.cloudCostQueries;
    }
    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    public List<MonitorVariablesEventQuery> eventQueries() {
        return this.eventQueries == null ? List.of() : this.eventQueries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorVariables defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<MonitorVariablesCloudCostQuery> cloudCostQueries;
        private @Nullable List<MonitorVariablesEventQuery> eventQueries;
        public Builder() {}
        public Builder(MonitorVariables defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudCostQueries = defaults.cloudCostQueries;
    	      this.eventQueries = defaults.eventQueries;
        }

        @CustomType.Setter
        public Builder cloudCostQueries(@Nullable List<MonitorVariablesCloudCostQuery> cloudCostQueries) {

            this.cloudCostQueries = cloudCostQueries;
            return this;
        }
        public Builder cloudCostQueries(MonitorVariablesCloudCostQuery... cloudCostQueries) {
            return cloudCostQueries(List.of(cloudCostQueries));
        }
        @CustomType.Setter
        public Builder eventQueries(@Nullable List<MonitorVariablesEventQuery> eventQueries) {

            this.eventQueries = eventQueries;
            return this;
        }
        public Builder eventQueries(MonitorVariablesEventQuery... eventQueries) {
            return eventQueries(List.of(eventQueries));
        }
        public MonitorVariables build() {
            final var _resultValue = new MonitorVariables();
            _resultValue.cloudCostQueries = cloudCostQueries;
            _resultValue.eventQueries = eventQueries;
            return _resultValue;
        }
    }
}
