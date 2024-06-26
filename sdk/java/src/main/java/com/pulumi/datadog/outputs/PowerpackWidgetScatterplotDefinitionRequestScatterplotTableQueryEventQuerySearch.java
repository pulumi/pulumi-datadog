// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PowerpackWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuerySearch {
    /**
     * @return The events search string.
     * 
     */
    private String query;

    private PowerpackWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuerySearch() {}
    /**
     * @return The events search string.
     * 
     */
    public String query() {
        return this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuerySearch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String query;
        public Builder() {}
        public Builder(PowerpackWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuerySearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder query(String query) {
            if (query == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuerySearch", "query");
            }
            this.query = query;
            return this;
        }
        public PowerpackWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuerySearch build() {
            final var _resultValue = new PowerpackWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuerySearch();
            _resultValue.query = query;
            return _resultValue;
        }
    }
}
