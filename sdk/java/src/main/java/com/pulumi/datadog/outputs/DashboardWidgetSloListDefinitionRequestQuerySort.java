// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardWidgetSloListDefinitionRequestQuerySort {
    private String column;
    private String order;

    private DashboardWidgetSloListDefinitionRequestQuerySort() {}
    public String column() {
        return this.column;
    }
    public String order() {
        return this.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSloListDefinitionRequestQuerySort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String column;
        private String order;
        public Builder() {}
        public Builder(DashboardWidgetSloListDefinitionRequestQuerySort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.order = defaults.order;
        }

        @CustomType.Setter
        public Builder column(String column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }
        @CustomType.Setter
        public Builder order(String order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public DashboardWidgetSloListDefinitionRequestQuerySort build() {
            final var o = new DashboardWidgetSloListDefinitionRequestQuerySort();
            o.column = column;
            o.order = order;
            return o;
        }
    }
}