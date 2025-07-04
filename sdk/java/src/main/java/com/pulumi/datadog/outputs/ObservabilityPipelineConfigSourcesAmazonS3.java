// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.ObservabilityPipelineConfigSourcesAmazonS3Auth;
import com.pulumi.datadog.outputs.ObservabilityPipelineConfigSourcesAmazonS3Tls;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObservabilityPipelineConfigSourcesAmazonS3 {
    /**
     * @return AWS authentication credentials used for accessing AWS services such as S3. If omitted, the system’s default credentials are used (for example, the IAM role and environment variables).
     * 
     */
    private @Nullable ObservabilityPipelineConfigSourcesAmazonS3Auth auth;
    /**
     * @return The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
     * 
     */
    private String id;
    /**
     * @return AWS region where the S3 bucket resides.
     * 
     */
    private String region;
    /**
     * @return Configuration for enabling TLS encryption between the pipeline component and external services.
     * 
     */
    private @Nullable ObservabilityPipelineConfigSourcesAmazonS3Tls tls;

    private ObservabilityPipelineConfigSourcesAmazonS3() {}
    /**
     * @return AWS authentication credentials used for accessing AWS services such as S3. If omitted, the system’s default credentials are used (for example, the IAM role and environment variables).
     * 
     */
    public Optional<ObservabilityPipelineConfigSourcesAmazonS3Auth> auth() {
        return Optional.ofNullable(this.auth);
    }
    /**
     * @return The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return AWS region where the S3 bucket resides.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Configuration for enabling TLS encryption between the pipeline component and external services.
     * 
     */
    public Optional<ObservabilityPipelineConfigSourcesAmazonS3Tls> tls() {
        return Optional.ofNullable(this.tls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObservabilityPipelineConfigSourcesAmazonS3 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ObservabilityPipelineConfigSourcesAmazonS3Auth auth;
        private String id;
        private String region;
        private @Nullable ObservabilityPipelineConfigSourcesAmazonS3Tls tls;
        public Builder() {}
        public Builder(ObservabilityPipelineConfigSourcesAmazonS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.id = defaults.id;
    	      this.region = defaults.region;
    	      this.tls = defaults.tls;
        }

        @CustomType.Setter
        public Builder auth(@Nullable ObservabilityPipelineConfigSourcesAmazonS3Auth auth) {

            this.auth = auth;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigSourcesAmazonS3", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigSourcesAmazonS3", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder tls(@Nullable ObservabilityPipelineConfigSourcesAmazonS3Tls tls) {

            this.tls = tls;
            return this;
        }
        public ObservabilityPipelineConfigSourcesAmazonS3 build() {
            final var _resultValue = new ObservabilityPipelineConfigSourcesAmazonS3();
            _resultValue.auth = auth;
            _resultValue.id = id;
            _resultValue.region = region;
            _resultValue.tls = tls;
            return _resultValue;
        }
    }
}
