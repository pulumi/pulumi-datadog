// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PowerpackWidgetSunburstDefinitionLegendTable {
    /**
     * @return The type of legend (table or none). Valid values are `table`, `none`.
     * 
     */
    private String type;

    private PowerpackWidgetSunburstDefinitionLegendTable() {}
    /**
     * @return The type of legend (table or none). Valid values are `table`, `none`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetSunburstDefinitionLegendTable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        public Builder() {}
        public Builder(PowerpackWidgetSunburstDefinitionLegendTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetSunburstDefinitionLegendTable", "type");
            }
            this.type = type;
            return this;
        }
        public PowerpackWidgetSunburstDefinitionLegendTable build() {
            final var _resultValue = new PowerpackWidgetSunburstDefinitionLegendTable();
            _resultValue.type = type;
            return _resultValue;
        }
    }
}