// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIntegrationLogsServicesAwsLogsService {
    /**
     * @return The id of the AWS log service.
     * 
     */
    private String id;
    /**
     * @return The name of the AWS log service.
     * 
     */
    private String label;

    private GetIntegrationLogsServicesAwsLogsService() {}
    /**
     * @return The id of the AWS log service.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the AWS log service.
     * 
     */
    public String label() {
        return this.label;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationLogsServicesAwsLogsService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String label;
        public Builder() {}
        public Builder(GetIntegrationLogsServicesAwsLogsService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.label = defaults.label;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIntegrationLogsServicesAwsLogsService", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            if (label == null) {
              throw new MissingRequiredPropertyException("GetIntegrationLogsServicesAwsLogsService", "label");
            }
            this.label = label;
            return this;
        }
        public GetIntegrationLogsServicesAwsLogsService build() {
            final var _resultValue = new GetIntegrationLogsServicesAwsLogsService();
            _resultValue.id = id;
            _resultValue.label = label;
            return _resultValue;
        }
    }
}
