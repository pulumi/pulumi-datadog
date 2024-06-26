// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.ServiceLevelObjectiveSliSpecificationTimeSliceArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;


public final class ServiceLevelObjectiveSliSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLevelObjectiveSliSpecificationArgs Empty = new ServiceLevelObjectiveSliSpecificationArgs();

    /**
     * The time slice condition, composed of 3 parts: 1. The timeseries query, 2. The comparator, and 3. The threshold. Optionally, a fourth part, the query interval, can be provided.
     * 
     */
    @Import(name="timeSlice", required=true)
    private Output<ServiceLevelObjectiveSliSpecificationTimeSliceArgs> timeSlice;

    /**
     * @return The time slice condition, composed of 3 parts: 1. The timeseries query, 2. The comparator, and 3. The threshold. Optionally, a fourth part, the query interval, can be provided.
     * 
     */
    public Output<ServiceLevelObjectiveSliSpecificationTimeSliceArgs> timeSlice() {
        return this.timeSlice;
    }

    private ServiceLevelObjectiveSliSpecificationArgs() {}

    private ServiceLevelObjectiveSliSpecificationArgs(ServiceLevelObjectiveSliSpecificationArgs $) {
        this.timeSlice = $.timeSlice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLevelObjectiveSliSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLevelObjectiveSliSpecificationArgs $;

        public Builder() {
            $ = new ServiceLevelObjectiveSliSpecificationArgs();
        }

        public Builder(ServiceLevelObjectiveSliSpecificationArgs defaults) {
            $ = new ServiceLevelObjectiveSliSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param timeSlice The time slice condition, composed of 3 parts: 1. The timeseries query, 2. The comparator, and 3. The threshold. Optionally, a fourth part, the query interval, can be provided.
         * 
         * @return builder
         * 
         */
        public Builder timeSlice(Output<ServiceLevelObjectiveSliSpecificationTimeSliceArgs> timeSlice) {
            $.timeSlice = timeSlice;
            return this;
        }

        /**
         * @param timeSlice The time slice condition, composed of 3 parts: 1. The timeseries query, 2. The comparator, and 3. The threshold. Optionally, a fourth part, the query interval, can be provided.
         * 
         * @return builder
         * 
         */
        public Builder timeSlice(ServiceLevelObjectiveSliSpecificationTimeSliceArgs timeSlice) {
            return timeSlice(Output.of(timeSlice));
        }

        public ServiceLevelObjectiveSliSpecificationArgs build() {
            if ($.timeSlice == null) {
                throw new MissingRequiredPropertyException("ServiceLevelObjectiveSliSpecificationArgs", "timeSlice");
            }
            return $;
        }
    }

}
