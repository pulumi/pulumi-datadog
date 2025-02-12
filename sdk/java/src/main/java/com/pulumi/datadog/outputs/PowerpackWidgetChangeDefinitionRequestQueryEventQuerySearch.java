// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PowerpackWidgetChangeDefinitionRequestQueryEventQuerySearch {
    /**
     * @return The events search string.
     * 
     */
    private String query;

    private PowerpackWidgetChangeDefinitionRequestQueryEventQuerySearch() {}
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

    public static Builder builder(PowerpackWidgetChangeDefinitionRequestQueryEventQuerySearch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String query;
        public Builder() {}
        public Builder(PowerpackWidgetChangeDefinitionRequestQueryEventQuerySearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder query(String query) {
            if (query == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetChangeDefinitionRequestQueryEventQuerySearch", "query");
            }
            this.query = query;
            return this;
        }
        public PowerpackWidgetChangeDefinitionRequestQueryEventQuerySearch build() {
            final var _resultValue = new PowerpackWidgetChangeDefinitionRequestQueryEventQuerySearch();
            _resultValue.query = query;
            return _resultValue;
        }
    }
}
