// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRoleUsersRoleUser {
    private String roleId;
    private String userId;

    private GetRoleUsersRoleUser() {}
    public String roleId() {
        return this.roleId;
    }
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleUsersRoleUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String roleId;
        private String userId;
        public Builder() {}
        public Builder(GetRoleUsersRoleUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleId = defaults.roleId;
    	      this.userId = defaults.userId;
        }

        @CustomType.Setter
        public Builder roleId(String roleId) {
            if (roleId == null) {
              throw new MissingRequiredPropertyException("GetRoleUsersRoleUser", "roleId");
            }
            this.roleId = roleId;
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            if (userId == null) {
              throw new MissingRequiredPropertyException("GetRoleUsersRoleUser", "userId");
            }
            this.userId = userId;
            return this;
        }
        public GetRoleUsersRoleUser build() {
            final var _resultValue = new GetRoleUsersRoleUser();
            _resultValue.roleId = roleId;
            _resultValue.userId = userId;
            return _resultValue;
        }
    }
}