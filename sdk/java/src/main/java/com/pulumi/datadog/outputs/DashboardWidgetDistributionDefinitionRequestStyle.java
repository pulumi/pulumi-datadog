// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetDistributionDefinitionRequestStyle {
    private @Nullable String palette;

    private DashboardWidgetDistributionDefinitionRequestStyle() {}
    public Optional<String> palette() {
        return Optional.ofNullable(this.palette);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetDistributionDefinitionRequestStyle defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String palette;
        public Builder() {}
        public Builder(DashboardWidgetDistributionDefinitionRequestStyle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.palette = defaults.palette;
        }

        @CustomType.Setter
        public Builder palette(@Nullable String palette) {
            this.palette = palette;
            return this;
        }
        public DashboardWidgetDistributionDefinitionRequestStyle build() {
            final var o = new DashboardWidgetDistributionDefinitionRequestStyle();
            o.palette = palette;
            return o;
        }
    }
}