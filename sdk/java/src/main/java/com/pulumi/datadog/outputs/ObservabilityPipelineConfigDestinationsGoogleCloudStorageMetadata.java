// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata {
    /**
     * @return The metadata key.
     * 
     */
    private String name;
    /**
     * @return The metadata value.
     * 
     */
    private String value;

    private ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata() {}
    /**
     * @return The metadata key.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The metadata value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata", "value");
            }
            this.value = value;
            return this;
        }
        public ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata build() {
            final var _resultValue = new ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
