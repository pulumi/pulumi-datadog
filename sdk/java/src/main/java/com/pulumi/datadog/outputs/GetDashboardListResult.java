// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDashboardListResult {
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;
    /**
     * @return A dashboard list name to limit the search.
     * 
     */
    private String name;

    private GetDashboardListResult() {}
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A dashboard list name to limit the search.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDashboardListResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetDashboardListResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDashboardListResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDashboardListResult", "name");
            }
            this.name = name;
            return this;
        }
        public GetDashboardListResult build() {
            final var _resultValue = new GetDashboardListResult();
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}