// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LogsCustomDestinationMicrosoftSentinelDestination {
    /**
     * @return Client ID from the Datadog Azure Integration.
     * 
     */
    private String clientId;
    /**
     * @return Azure Data Collection Endpoint.
     * 
     */
    private String dataCollectionEndpoint;
    /**
     * @return Azure Data Collection Rule ID.
     * 
     */
    private String dataCollectionRuleId;
    /**
     * @return Azure stream name.
     * 
     */
    private String streamName;
    /**
     * @return Tenant ID from the Datadog Azure Integration.
     * 
     */
    private String tenantId;

    private LogsCustomDestinationMicrosoftSentinelDestination() {}
    /**
     * @return Client ID from the Datadog Azure Integration.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return Azure Data Collection Endpoint.
     * 
     */
    public String dataCollectionEndpoint() {
        return this.dataCollectionEndpoint;
    }
    /**
     * @return Azure Data Collection Rule ID.
     * 
     */
    public String dataCollectionRuleId() {
        return this.dataCollectionRuleId;
    }
    /**
     * @return Azure stream name.
     * 
     */
    public String streamName() {
        return this.streamName;
    }
    /**
     * @return Tenant ID from the Datadog Azure Integration.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsCustomDestinationMicrosoftSentinelDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        private String dataCollectionEndpoint;
        private String dataCollectionRuleId;
        private String streamName;
        private String tenantId;
        public Builder() {}
        public Builder(LogsCustomDestinationMicrosoftSentinelDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.dataCollectionEndpoint = defaults.dataCollectionEndpoint;
    	      this.dataCollectionRuleId = defaults.dataCollectionRuleId;
    	      this.streamName = defaults.streamName;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("LogsCustomDestinationMicrosoftSentinelDestination", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder dataCollectionEndpoint(String dataCollectionEndpoint) {
            if (dataCollectionEndpoint == null) {
              throw new MissingRequiredPropertyException("LogsCustomDestinationMicrosoftSentinelDestination", "dataCollectionEndpoint");
            }
            this.dataCollectionEndpoint = dataCollectionEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder dataCollectionRuleId(String dataCollectionRuleId) {
            if (dataCollectionRuleId == null) {
              throw new MissingRequiredPropertyException("LogsCustomDestinationMicrosoftSentinelDestination", "dataCollectionRuleId");
            }
            this.dataCollectionRuleId = dataCollectionRuleId;
            return this;
        }
        @CustomType.Setter
        public Builder streamName(String streamName) {
            if (streamName == null) {
              throw new MissingRequiredPropertyException("LogsCustomDestinationMicrosoftSentinelDestination", "streamName");
            }
            this.streamName = streamName;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            if (tenantId == null) {
              throw new MissingRequiredPropertyException("LogsCustomDestinationMicrosoftSentinelDestination", "tenantId");
            }
            this.tenantId = tenantId;
            return this;
        }
        public LogsCustomDestinationMicrosoftSentinelDestination build() {
            final var _resultValue = new LogsCustomDestinationMicrosoftSentinelDestination();
            _resultValue.clientId = clientId;
            _resultValue.dataCollectionEndpoint = dataCollectionEndpoint;
            _resultValue.dataCollectionRuleId = dataCollectionRuleId;
            _resultValue.streamName = streamName;
            _resultValue.tenantId = tenantId;
            return _resultValue;
        }
    }
}
