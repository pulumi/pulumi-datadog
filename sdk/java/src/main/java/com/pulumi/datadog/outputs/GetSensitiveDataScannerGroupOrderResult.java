// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSensitiveDataScannerGroupOrderResult {
    /**
     * @return The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
     * 
     */
    private List<String> groupIds;
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;

    private GetSensitiveDataScannerGroupOrderResult() {}
    /**
     * @return The list of Sensitive Data Scanner group IDs, in order. Logs are tested against the query filter of each index one by one following the order of the list.
     * 
     */
    public List<String> groupIds() {
        return this.groupIds;
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

    public static Builder builder(GetSensitiveDataScannerGroupOrderResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> groupIds;
        private String id;
        public Builder() {}
        public Builder(GetSensitiveDataScannerGroupOrderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder groupIds(List<String> groupIds) {
            if (groupIds == null) {
              throw new MissingRequiredPropertyException("GetSensitiveDataScannerGroupOrderResult", "groupIds");
            }
            this.groupIds = groupIds;
            return this;
        }
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSensitiveDataScannerGroupOrderResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetSensitiveDataScannerGroupOrderResult build() {
            final var _resultValue = new GetSensitiveDataScannerGroupOrderResult();
            _resultValue.groupIds = groupIds;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}