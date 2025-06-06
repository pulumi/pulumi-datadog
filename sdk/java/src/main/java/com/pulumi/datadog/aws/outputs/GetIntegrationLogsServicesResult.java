// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.aws.outputs.GetIntegrationLogsServicesAwsLogsService;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIntegrationLogsServicesResult {
    /**
     * @return List of AWS log ready services.
     * 
     */
    private List<GetIntegrationLogsServicesAwsLogsService> awsLogsServices;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetIntegrationLogsServicesResult() {}
    /**
     * @return List of AWS log ready services.
     * 
     */
    public List<GetIntegrationLogsServicesAwsLogsService> awsLogsServices() {
        return this.awsLogsServices;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationLogsServicesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetIntegrationLogsServicesAwsLogsService> awsLogsServices;
        private String id;
        public Builder() {}
        public Builder(GetIntegrationLogsServicesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsLogsServices = defaults.awsLogsServices;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder awsLogsServices(List<GetIntegrationLogsServicesAwsLogsService> awsLogsServices) {
            if (awsLogsServices == null) {
              throw new MissingRequiredPropertyException("GetIntegrationLogsServicesResult", "awsLogsServices");
            }
            this.awsLogsServices = awsLogsServices;
            return this;
        }
        public Builder awsLogsServices(GetIntegrationLogsServicesAwsLogsService... awsLogsServices) {
            return awsLogsServices(List.of(awsLogsServices));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIntegrationLogsServicesResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetIntegrationLogsServicesResult build() {
            final var _resultValue = new GetIntegrationLogsServicesResult();
            _resultValue.awsLogsServices = awsLogsServices;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
