// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.config.inputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DefaultTags {
    /**
     * @return [Experimental - Monitors only] Resource tags to be applied by default across all resources.
     * 
     */
    private @Nullable Map<String,String> tags;

    private DefaultTags() {}
    /**
     * @return [Experimental - Monitors only] Resource tags to be applied by default across all resources.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultTags defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> tags;
        public Builder() {}
        public Builder(DefaultTags defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {

            this.tags = tags;
            return this;
        }
        public DefaultTags build() {
            final var _resultValue = new DefaultTags();
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}