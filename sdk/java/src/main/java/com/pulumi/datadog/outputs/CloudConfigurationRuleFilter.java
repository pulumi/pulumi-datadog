// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudConfigurationRuleFilter {
    /**
     * @return The type of filtering action. Valid values are `require`, `suppress`.
     * 
     */
    private String action;
    /**
     * @return Query for selecting logs to apply the filtering action.
     * 
     */
    private String query;

    private CloudConfigurationRuleFilter() {}
    /**
     * @return The type of filtering action. Valid values are `require`, `suppress`.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Query for selecting logs to apply the filtering action.
     * 
     */
    public String query() {
        return this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudConfigurationRuleFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private String query;
        public Builder() {}
        public Builder(CloudConfigurationRuleFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("CloudConfigurationRuleFilter", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder query(String query) {
            if (query == null) {
              throw new MissingRequiredPropertyException("CloudConfigurationRuleFilter", "query");
            }
            this.query = query;
            return this;
        }
        public CloudConfigurationRuleFilter build() {
            final var _resultValue = new CloudConfigurationRuleFilter();
            _resultValue.action = action;
            _resultValue.query = query;
            return _resultValue;
        }
    }
}