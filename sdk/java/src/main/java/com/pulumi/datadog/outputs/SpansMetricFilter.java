// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpansMetricFilter {
    /**
     * @return The search query - following the span search syntax. Defaults to `&#34;*&#34;`.
     * 
     */
    private @Nullable String query;

    private SpansMetricFilter() {}
    /**
     * @return The search query - following the span search syntax. Defaults to `&#34;*&#34;`.
     * 
     */
    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpansMetricFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String query;
        public Builder() {}
        public Builder(SpansMetricFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder query(@Nullable String query) {

            this.query = query;
            return this;
        }
        public SpansMetricFilter build() {
            final var _resultValue = new SpansMetricFilter();
            _resultValue.query = query;
            return _resultValue;
        }
    }
}