// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetSunburstDefinitionRequestFormulaLimit {
    /**
     * @return The number of results to return.
     * 
     */
    private @Nullable Integer count;
    /**
     * @return The direction of the sort. Valid values are `asc`, `desc`. Defaults to `&#34;desc&#34;`.
     * 
     */
    private @Nullable String order;

    private DashboardWidgetSunburstDefinitionRequestFormulaLimit() {}
    /**
     * @return The number of results to return.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return The direction of the sort. Valid values are `asc`, `desc`. Defaults to `&#34;desc&#34;`.
     * 
     */
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSunburstDefinitionRequestFormulaLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String order;
        public Builder() {}
        public Builder(DashboardWidgetSunburstDefinitionRequestFormulaLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.order = defaults.order;
        }

        @CustomType.Setter
        public Builder count(@Nullable Integer count) {

            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder order(@Nullable String order) {

            this.order = order;
            return this;
        }
        public DashboardWidgetSunburstDefinitionRequestFormulaLimit build() {
            final var _resultValue = new DashboardWidgetSunburstDefinitionRequestFormulaLimit();
            _resultValue.count = count;
            _resultValue.order = order;
            return _resultValue;
        }
    }
}
