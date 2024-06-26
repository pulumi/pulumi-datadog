// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetTreemapDefinitionRequestFormula;
import com.pulumi.datadog.outputs.DashboardWidgetTreemapDefinitionRequestQuery;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetTreemapDefinitionRequest {
    private @Nullable List<DashboardWidgetTreemapDefinitionRequestFormula> formulas;
    private @Nullable List<DashboardWidgetTreemapDefinitionRequestQuery> queries;

    private DashboardWidgetTreemapDefinitionRequest() {}
    public List<DashboardWidgetTreemapDefinitionRequestFormula> formulas() {
        return this.formulas == null ? List.of() : this.formulas;
    }
    public List<DashboardWidgetTreemapDefinitionRequestQuery> queries() {
        return this.queries == null ? List.of() : this.queries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetTreemapDefinitionRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DashboardWidgetTreemapDefinitionRequestFormula> formulas;
        private @Nullable List<DashboardWidgetTreemapDefinitionRequestQuery> queries;
        public Builder() {}
        public Builder(DashboardWidgetTreemapDefinitionRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.formulas = defaults.formulas;
    	      this.queries = defaults.queries;
        }

        @CustomType.Setter
        public Builder formulas(@Nullable List<DashboardWidgetTreemapDefinitionRequestFormula> formulas) {

            this.formulas = formulas;
            return this;
        }
        public Builder formulas(DashboardWidgetTreemapDefinitionRequestFormula... formulas) {
            return formulas(List.of(formulas));
        }
        @CustomType.Setter
        public Builder queries(@Nullable List<DashboardWidgetTreemapDefinitionRequestQuery> queries) {

            this.queries = queries;
            return this;
        }
        public Builder queries(DashboardWidgetTreemapDefinitionRequestQuery... queries) {
            return queries(List.of(queries));
        }
        public DashboardWidgetTreemapDefinitionRequest build() {
            final var _resultValue = new DashboardWidgetTreemapDefinitionRequest();
            _resultValue.formulas = formulas;
            _resultValue.queries = queries;
            return _resultValue;
        }
    }
}
