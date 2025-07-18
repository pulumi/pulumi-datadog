// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuth;
import com.pulumi.datadog.outputs.ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObservabilityPipelineConfigDestinationsGoogleCloudStorage {
    /**
     * @return Access control list setting for objects written to the bucket.
     * 
     */
    private String acl;
    /**
     * @return GCP credentials used to authenticate with Google Cloud Storage.
     * 
     */
    private @Nullable ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuth auth;
    /**
     * @return Name of the GCS bucket.
     * 
     */
    private String bucket;
    /**
     * @return Unique identifier for the destination component.
     * 
     */
    private String id;
    /**
     * @return A list of component IDs whose output is used as the `input` for this component.
     * 
     */
    private List<String> inputs;
    /**
     * @return Optional prefix for object keys within the GCS bucket.
     * 
     */
    private @Nullable String keyPrefix;
    /**
     * @return Custom metadata key-value pairs added to each object.
     * 
     */
    private @Nullable List<ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata> metadatas;
    /**
     * @return Storage class used for objects stored in GCS.
     * 
     */
    private String storageClass;

    private ObservabilityPipelineConfigDestinationsGoogleCloudStorage() {}
    /**
     * @return Access control list setting for objects written to the bucket.
     * 
     */
    public String acl() {
        return this.acl;
    }
    /**
     * @return GCP credentials used to authenticate with Google Cloud Storage.
     * 
     */
    public Optional<ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuth> auth() {
        return Optional.ofNullable(this.auth);
    }
    /**
     * @return Name of the GCS bucket.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return Unique identifier for the destination component.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of component IDs whose output is used as the `input` for this component.
     * 
     */
    public List<String> inputs() {
        return this.inputs;
    }
    /**
     * @return Optional prefix for object keys within the GCS bucket.
     * 
     */
    public Optional<String> keyPrefix() {
        return Optional.ofNullable(this.keyPrefix);
    }
    /**
     * @return Custom metadata key-value pairs added to each object.
     * 
     */
    public List<ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata> metadatas() {
        return this.metadatas == null ? List.of() : this.metadatas;
    }
    /**
     * @return Storage class used for objects stored in GCS.
     * 
     */
    public String storageClass() {
        return this.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObservabilityPipelineConfigDestinationsGoogleCloudStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acl;
        private @Nullable ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuth auth;
        private String bucket;
        private String id;
        private List<String> inputs;
        private @Nullable String keyPrefix;
        private @Nullable List<ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata> metadatas;
        private String storageClass;
        public Builder() {}
        public Builder(ObservabilityPipelineConfigDestinationsGoogleCloudStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acl = defaults.acl;
    	      this.auth = defaults.auth;
    	      this.bucket = defaults.bucket;
    	      this.id = defaults.id;
    	      this.inputs = defaults.inputs;
    	      this.keyPrefix = defaults.keyPrefix;
    	      this.metadatas = defaults.metadatas;
    	      this.storageClass = defaults.storageClass;
        }

        @CustomType.Setter
        public Builder acl(String acl) {
            if (acl == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigDestinationsGoogleCloudStorage", "acl");
            }
            this.acl = acl;
            return this;
        }
        @CustomType.Setter
        public Builder auth(@Nullable ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuth auth) {

            this.auth = auth;
            return this;
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            if (bucket == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigDestinationsGoogleCloudStorage", "bucket");
            }
            this.bucket = bucket;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigDestinationsGoogleCloudStorage", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder inputs(List<String> inputs) {
            if (inputs == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigDestinationsGoogleCloudStorage", "inputs");
            }
            this.inputs = inputs;
            return this;
        }
        public Builder inputs(String... inputs) {
            return inputs(List.of(inputs));
        }
        @CustomType.Setter
        public Builder keyPrefix(@Nullable String keyPrefix) {

            this.keyPrefix = keyPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder metadatas(@Nullable List<ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata> metadatas) {

            this.metadatas = metadatas;
            return this;
        }
        public Builder metadatas(ObservabilityPipelineConfigDestinationsGoogleCloudStorageMetadata... metadatas) {
            return metadatas(List.of(metadatas));
        }
        @CustomType.Setter
        public Builder storageClass(String storageClass) {
            if (storageClass == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigDestinationsGoogleCloudStorage", "storageClass");
            }
            this.storageClass = storageClass;
            return this;
        }
        public ObservabilityPipelineConfigDestinationsGoogleCloudStorage build() {
            final var _resultValue = new ObservabilityPipelineConfigDestinationsGoogleCloudStorage();
            _resultValue.acl = acl;
            _resultValue.auth = auth;
            _resultValue.bucket = bucket;
            _resultValue.id = id;
            _resultValue.inputs = inputs;
            _resultValue.keyPrefix = keyPrefix;
            _resultValue.metadatas = metadatas;
            _resultValue.storageClass = storageClass;
            return _resultValue;
        }
    }
}
