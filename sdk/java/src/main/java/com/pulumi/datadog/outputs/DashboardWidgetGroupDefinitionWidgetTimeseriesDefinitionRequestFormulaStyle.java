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
public final class DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaStyle {
    private @Nullable String palette;
    private @Nullable Integer paletteIndex;

    private DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaStyle() {}
    public Optional<String> palette() {
        return Optional.ofNullable(this.palette);
    }
    public Optional<Integer> paletteIndex() {
        return Optional.ofNullable(this.paletteIndex);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaStyle defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String palette;
        private @Nullable Integer paletteIndex;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaStyle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.palette = defaults.palette;
    	      this.paletteIndex = defaults.paletteIndex;
        }

        @CustomType.Setter
        public Builder palette(@Nullable String palette) {
            this.palette = palette;
            return this;
        }
        @CustomType.Setter
        public Builder paletteIndex(@Nullable Integer paletteIndex) {
            this.paletteIndex = paletteIndex;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaStyle build() {
            final var o = new DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaStyle();
            o.palette = palette;
            o.paletteIndex = paletteIndex;
            return o;
        }
    }
}