// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTable;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestX;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestY;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetScatterplotDefinitionRequest {
    private @Nullable List<DashboardWidgetScatterplotDefinitionRequestScatterplotTable> scatterplotTables;
    private @Nullable List<DashboardWidgetScatterplotDefinitionRequestX> xes;
    private @Nullable List<DashboardWidgetScatterplotDefinitionRequestY> ys;

    private DashboardWidgetScatterplotDefinitionRequest() {}
    public List<DashboardWidgetScatterplotDefinitionRequestScatterplotTable> scatterplotTables() {
        return this.scatterplotTables == null ? List.of() : this.scatterplotTables;
    }
    public List<DashboardWidgetScatterplotDefinitionRequestX> xes() {
        return this.xes == null ? List.of() : this.xes;
    }
    public List<DashboardWidgetScatterplotDefinitionRequestY> ys() {
        return this.ys == null ? List.of() : this.ys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetScatterplotDefinitionRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DashboardWidgetScatterplotDefinitionRequestScatterplotTable> scatterplotTables;
        private @Nullable List<DashboardWidgetScatterplotDefinitionRequestX> xes;
        private @Nullable List<DashboardWidgetScatterplotDefinitionRequestY> ys;
        public Builder() {}
        public Builder(DashboardWidgetScatterplotDefinitionRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scatterplotTables = defaults.scatterplotTables;
    	      this.xes = defaults.xes;
    	      this.ys = defaults.ys;
        }

        @CustomType.Setter
        public Builder scatterplotTables(@Nullable List<DashboardWidgetScatterplotDefinitionRequestScatterplotTable> scatterplotTables) {
            this.scatterplotTables = scatterplotTables;
            return this;
        }
        public Builder scatterplotTables(DashboardWidgetScatterplotDefinitionRequestScatterplotTable... scatterplotTables) {
            return scatterplotTables(List.of(scatterplotTables));
        }
        @CustomType.Setter
        public Builder xes(@Nullable List<DashboardWidgetScatterplotDefinitionRequestX> xes) {
            this.xes = xes;
            return this;
        }
        public Builder xes(DashboardWidgetScatterplotDefinitionRequestX... xes) {
            return xes(List.of(xes));
        }
        @CustomType.Setter
        public Builder ys(@Nullable List<DashboardWidgetScatterplotDefinitionRequestY> ys) {
            this.ys = ys;
            return this;
        }
        public Builder ys(DashboardWidgetScatterplotDefinitionRequestY... ys) {
            return ys(List.of(ys));
        }
        public DashboardWidgetScatterplotDefinitionRequest build() {
            final var o = new DashboardWidgetScatterplotDefinitionRequest();
            o.scatterplotTables = scatterplotTables;
            o.xes = xes;
            o.ys = ys;
            return o;
        }
    }
}