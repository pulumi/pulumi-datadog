// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTeamMembershipsTeamMembership {
    private String id;
    private String role;
    private String teamId;
    private String userId;

    private GetTeamMembershipsTeamMembership() {}
    public String id() {
        return this.id;
    }
    public String role() {
        return this.role;
    }
    public String teamId() {
        return this.teamId;
    }
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTeamMembershipsTeamMembership defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String role;
        private String teamId;
        private String userId;
        public Builder() {}
        public Builder(GetTeamMembershipsTeamMembership defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.role = defaults.role;
    	      this.teamId = defaults.teamId;
    	      this.userId = defaults.userId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTeamMembershipsTeamMembership", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            if (role == null) {
              throw new MissingRequiredPropertyException("GetTeamMembershipsTeamMembership", "role");
            }
            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder teamId(String teamId) {
            if (teamId == null) {
              throw new MissingRequiredPropertyException("GetTeamMembershipsTeamMembership", "teamId");
            }
            this.teamId = teamId;
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            if (userId == null) {
              throw new MissingRequiredPropertyException("GetTeamMembershipsTeamMembership", "userId");
            }
            this.userId = userId;
            return this;
        }
        public GetTeamMembershipsTeamMembership build() {
            final var _resultValue = new GetTeamMembershipsTeamMembership();
            _resultValue.id = id;
            _resultValue.role = role;
            _resultValue.teamId = teamId;
            _resultValue.userId = userId;
            return _resultValue;
        }
    }
}
