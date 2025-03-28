// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.GetTeamsTeam;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTeamsResult {
    /**
     * @return Search query. Can be team name, team handle, or email of team member.
     * 
     */
    private @Nullable String filterKeyword;
    /**
     * @return When true, only returns teams the current user belongs to.
     * 
     */
    private @Nullable Boolean filterMe;
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;
    /**
     * @return List of teams
     * 
     */
    private @Nullable List<GetTeamsTeam> teams;

    private GetTeamsResult() {}
    /**
     * @return Search query. Can be team name, team handle, or email of team member.
     * 
     */
    public Optional<String> filterKeyword() {
        return Optional.ofNullable(this.filterKeyword);
    }
    /**
     * @return When true, only returns teams the current user belongs to.
     * 
     */
    public Optional<Boolean> filterMe() {
        return Optional.ofNullable(this.filterMe);
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of teams
     * 
     */
    public List<GetTeamsTeam> teams() {
        return this.teams == null ? List.of() : this.teams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTeamsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String filterKeyword;
        private @Nullable Boolean filterMe;
        private String id;
        private @Nullable List<GetTeamsTeam> teams;
        public Builder() {}
        public Builder(GetTeamsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterKeyword = defaults.filterKeyword;
    	      this.filterMe = defaults.filterMe;
    	      this.id = defaults.id;
    	      this.teams = defaults.teams;
        }

        @CustomType.Setter
        public Builder filterKeyword(@Nullable String filterKeyword) {

            this.filterKeyword = filterKeyword;
            return this;
        }
        @CustomType.Setter
        public Builder filterMe(@Nullable Boolean filterMe) {

            this.filterMe = filterMe;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTeamsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder teams(@Nullable List<GetTeamsTeam> teams) {

            this.teams = teams;
            return this;
        }
        public Builder teams(GetTeamsTeam... teams) {
            return teams(List.of(teams));
        }
        public GetTeamsResult build() {
            final var _resultValue = new GetTeamsResult();
            _resultValue.filterKeyword = filterKeyword;
            _resultValue.filterMe = filterMe;
            _resultValue.id = id;
            _resultValue.teams = teams;
            return _resultValue;
        }
    }
}
