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
public final class PowerpackWidgetTimeseriesDefinitionRequestApmQueryGroupBySortQuery {
    /**
     * @return The aggregation method.
     * 
     */
    private String aggregation;
    /**
     * @return The facet name.
     * 
     */
    private @Nullable String facet;
    /**
     * @return Widget sorting methods. Valid values are `asc`, `desc`.
     * 
     */
    private String order;

    private PowerpackWidgetTimeseriesDefinitionRequestApmQueryGroupBySortQuery() {}
    /**
     * @return The aggregation method.
     * 
     */
    public String aggregation() {
        return this.aggregation;
    }
    /**
     * @return The facet name.
     * 
     */
    public Optional<String> facet() {
        return Optional.ofNullable(this.facet);
    }
    /**
     * @return Widget sorting methods. Valid values are `asc`, `desc`.
     * 
     */
    public String order() {
        return this.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetTimeseriesDefinitionRequestApmQueryGroupBySortQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String aggregation;
        private @Nullable String facet;
        private String order;
        public Builder() {}
        public Builder(PowerpackWidgetTimeseriesDefinitionRequestApmQueryGroupBySortQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.facet = defaults.facet;
    	      this.order = defaults.order;
        }

        @CustomType.Setter
        public Builder aggregation(String aggregation) {
            if (aggregation == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetTimeseriesDefinitionRequestApmQueryGroupBySortQuery", "aggregation");
            }
            this.aggregation = aggregation;
            return this;
        }
        @CustomType.Setter
        public Builder facet(@Nullable String facet) {

            this.facet = facet;
            return this;
        }
        @CustomType.Setter
        public Builder order(String order) {
            if (order == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetTimeseriesDefinitionRequestApmQueryGroupBySortQuery", "order");
            }
            this.order = order;
            return this;
        }
        public PowerpackWidgetTimeseriesDefinitionRequestApmQueryGroupBySortQuery build() {
            final var _resultValue = new PowerpackWidgetTimeseriesDefinitionRequestApmQueryGroupBySortQuery();
            _resultValue.aggregation = aggregation;
            _resultValue.facet = facet;
            _resultValue.order = order;
            return _resultValue;
        }
    }
}
