// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIntegrationAvailableNamespacesResult {
    /**
     * @return List of available AWS namespaces.
     * 
     */
    private List<String> awsNamespaces;
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;

    private GetIntegrationAvailableNamespacesResult() {}
    /**
     * @return List of available AWS namespaces.
     * 
     */
    public List<String> awsNamespaces() {
        return this.awsNamespaces;
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationAvailableNamespacesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> awsNamespaces;
        private String id;
        public Builder() {}
        public Builder(GetIntegrationAvailableNamespacesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsNamespaces = defaults.awsNamespaces;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder awsNamespaces(List<String> awsNamespaces) {
            if (awsNamespaces == null) {
              throw new MissingRequiredPropertyException("GetIntegrationAvailableNamespacesResult", "awsNamespaces");
            }
            this.awsNamespaces = awsNamespaces;
            return this;
        }
        public Builder awsNamespaces(String... awsNamespaces) {
            return awsNamespaces(List.of(awsNamespaces));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIntegrationAvailableNamespacesResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetIntegrationAvailableNamespacesResult build() {
            final var _resultValue = new GetIntegrationAvailableNamespacesResult();
            _resultValue.awsNamespaces = awsNamespaces;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
