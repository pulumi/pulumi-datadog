// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetPermissionsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Map<String,String> permissions;

    private GetPermissionsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Map<String,String> permissions() {
        return this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Map<String,String> permissions;
        public Builder() {}
        public Builder(GetPermissionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.permissions = defaults.permissions;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder permissions(Map<String,String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public GetPermissionsResult build() {
            final var o = new GetPermissionsResult();
            o.id = id;
            o.permissions = permissions;
            return o;
        }
    }
}