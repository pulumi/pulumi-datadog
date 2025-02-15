// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetTreemapDefinitionRequestFormulaArgs;
import com.pulumi.datadog.inputs.DashboardWidgetTreemapDefinitionRequestQueryArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetTreemapDefinitionRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetTreemapDefinitionRequestArgs Empty = new DashboardWidgetTreemapDefinitionRequestArgs();

    @Import(name="formulas")
    private @Nullable Output<List<DashboardWidgetTreemapDefinitionRequestFormulaArgs>> formulas;

    public Optional<Output<List<DashboardWidgetTreemapDefinitionRequestFormulaArgs>>> formulas() {
        return Optional.ofNullable(this.formulas);
    }

    @Import(name="queries")
    private @Nullable Output<List<DashboardWidgetTreemapDefinitionRequestQueryArgs>> queries;

    public Optional<Output<List<DashboardWidgetTreemapDefinitionRequestQueryArgs>>> queries() {
        return Optional.ofNullable(this.queries);
    }

    private DashboardWidgetTreemapDefinitionRequestArgs() {}

    private DashboardWidgetTreemapDefinitionRequestArgs(DashboardWidgetTreemapDefinitionRequestArgs $) {
        this.formulas = $.formulas;
        this.queries = $.queries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetTreemapDefinitionRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetTreemapDefinitionRequestArgs $;

        public Builder() {
            $ = new DashboardWidgetTreemapDefinitionRequestArgs();
        }

        public Builder(DashboardWidgetTreemapDefinitionRequestArgs defaults) {
            $ = new DashboardWidgetTreemapDefinitionRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder formulas(@Nullable Output<List<DashboardWidgetTreemapDefinitionRequestFormulaArgs>> formulas) {
            $.formulas = formulas;
            return this;
        }

        public Builder formulas(List<DashboardWidgetTreemapDefinitionRequestFormulaArgs> formulas) {
            return formulas(Output.of(formulas));
        }

        public Builder formulas(DashboardWidgetTreemapDefinitionRequestFormulaArgs... formulas) {
            return formulas(List.of(formulas));
        }

        public Builder queries(@Nullable Output<List<DashboardWidgetTreemapDefinitionRequestQueryArgs>> queries) {
            $.queries = queries;
            return this;
        }

        public Builder queries(List<DashboardWidgetTreemapDefinitionRequestQueryArgs> queries) {
            return queries(Output.of(queries));
        }

        public Builder queries(DashboardWidgetTreemapDefinitionRequestQueryArgs... queries) {
            return queries(List.of(queries));
        }

        public DashboardWidgetTreemapDefinitionRequestArgs build() {
            return $;
        }
    }

}
