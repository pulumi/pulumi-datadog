// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.LogsIndexExclusionFilterFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogsIndexExclusionFilter {
    private @Nullable List<LogsIndexExclusionFilterFilter> filters;
    /**
     * @return A boolean stating if the exclusion is active or not.
     * 
     */
    private @Nullable Boolean isEnabled;
    /**
     * @return The name of the exclusion filter.
     * 
     */
    private @Nullable String name;

    private LogsIndexExclusionFilter() {}
    public List<LogsIndexExclusionFilterFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return A boolean stating if the exclusion is active or not.
     * 
     */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * @return The name of the exclusion filter.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsIndexExclusionFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<LogsIndexExclusionFilterFilter> filters;
        private @Nullable Boolean isEnabled;
        private @Nullable String name;
        public Builder() {}
        public Builder(LogsIndexExclusionFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<LogsIndexExclusionFilterFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(LogsIndexExclusionFilterFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder isEnabled(@Nullable Boolean isEnabled) {

            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public LogsIndexExclusionFilter build() {
            final var _resultValue = new LogsIndexExclusionFilter();
            _resultValue.filters = filters;
            _resultValue.isEnabled = isEnabled;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}