// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ServiceAccountApplicationKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAccountApplicationKeyArgs Empty = new ServiceAccountApplicationKeyArgs();

    /**
     * Name of the application key.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the application key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * ID of the service account that owns this key.
     * 
     */
    @Import(name="serviceAccountId", required=true)
    private Output<String> serviceAccountId;

    /**
     * @return ID of the service account that owns this key.
     * 
     */
    public Output<String> serviceAccountId() {
        return this.serviceAccountId;
    }

    private ServiceAccountApplicationKeyArgs() {}

    private ServiceAccountApplicationKeyArgs(ServiceAccountApplicationKeyArgs $) {
        this.name = $.name;
        this.serviceAccountId = $.serviceAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAccountApplicationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAccountApplicationKeyArgs $;

        public Builder() {
            $ = new ServiceAccountApplicationKeyArgs();
        }

        public Builder(ServiceAccountApplicationKeyArgs defaults) {
            $ = new ServiceAccountApplicationKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the application key.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the application key.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param serviceAccountId ID of the service account that owns this key.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountId(Output<String> serviceAccountId) {
            $.serviceAccountId = serviceAccountId;
            return this;
        }

        /**
         * @param serviceAccountId ID of the service account that owns this key.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountId(String serviceAccountId) {
            return serviceAccountId(Output.of(serviceAccountId));
        }

        public ServiceAccountApplicationKeyArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceAccountApplicationKeyArgs", "name");
            }
            if ($.serviceAccountId == null) {
                throw new MissingRequiredPropertyException("ServiceAccountApplicationKeyArgs", "serviceAccountId");
            }
            return $;
        }
    }

}