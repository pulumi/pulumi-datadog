// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RestrictionPolicyBinding {
    /**
     * @return An array of principals. A principal is a subject or group of subjects. Each principal is formatted as `type:id`. Supported types: `role`, `team`, `user`, and `org`. Org ID can be obtained using a `GET /api/v2/current_user` API request. Find it in the `data.relationships.org.data.id` field.
     * 
     */
    private List<String> principals;
    /**
     * @return The role/level of access. See this page for more details https://docs.datadoghq.com/api/latest/restriction-policies/#supported-relations-for-resources
     * 
     */
    private String relation;

    private RestrictionPolicyBinding() {}
    /**
     * @return An array of principals. A principal is a subject or group of subjects. Each principal is formatted as `type:id`. Supported types: `role`, `team`, `user`, and `org`. Org ID can be obtained using a `GET /api/v2/current_user` API request. Find it in the `data.relationships.org.data.id` field.
     * 
     */
    public List<String> principals() {
        return this.principals;
    }
    /**
     * @return The role/level of access. See this page for more details https://docs.datadoghq.com/api/latest/restriction-policies/#supported-relations-for-resources
     * 
     */
    public String relation() {
        return this.relation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestrictionPolicyBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> principals;
        private String relation;
        public Builder() {}
        public Builder(RestrictionPolicyBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principals = defaults.principals;
    	      this.relation = defaults.relation;
        }

        @CustomType.Setter
        public Builder principals(List<String> principals) {
            if (principals == null) {
              throw new MissingRequiredPropertyException("RestrictionPolicyBinding", "principals");
            }
            this.principals = principals;
            return this;
        }
        public Builder principals(String... principals) {
            return principals(List.of(principals));
        }
        @CustomType.Setter
        public Builder relation(String relation) {
            if (relation == null) {
              throw new MissingRequiredPropertyException("RestrictionPolicyBinding", "relation");
            }
            this.relation = relation;
            return this;
        }
        public RestrictionPolicyBinding build() {
            final var _resultValue = new RestrictionPolicyBinding();
            _resultValue.principals = principals;
            _resultValue.relation = relation;
            return _resultValue;
        }
    }
}
