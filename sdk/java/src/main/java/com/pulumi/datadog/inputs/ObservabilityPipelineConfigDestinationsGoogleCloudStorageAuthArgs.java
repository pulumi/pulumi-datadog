// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs Empty = new ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs();

    /**
     * Path to the GCP service account key file.
     * 
     */
    @Import(name="credentialsFile", required=true)
    private Output<String> credentialsFile;

    /**
     * @return Path to the GCP service account key file.
     * 
     */
    public Output<String> credentialsFile() {
        return this.credentialsFile;
    }

    private ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs() {}

    private ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs(ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs $) {
        this.credentialsFile = $.credentialsFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs $;

        public Builder() {
            $ = new ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs();
        }

        public Builder(ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs defaults) {
            $ = new ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentialsFile Path to the GCP service account key file.
         * 
         * @return builder
         * 
         */
        public Builder credentialsFile(Output<String> credentialsFile) {
            $.credentialsFile = credentialsFile;
            return this;
        }

        /**
         * @param credentialsFile Path to the GCP service account key file.
         * 
         * @return builder
         * 
         */
        public Builder credentialsFile(String credentialsFile) {
            return credentialsFile(Output.of(credentialsFile));
        }

        public ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs build() {
            if ($.credentialsFile == null) {
                throw new MissingRequiredPropertyException("ObservabilityPipelineConfigDestinationsGoogleCloudStorageAuthArgs", "credentialsFile");
            }
            return $;
        }
    }

}
