// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmQueryComputeQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmQueryComputeQueryArgs Empty = new DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmQueryComputeQueryArgs();

    @Import(name="aggregation", required=true)
    private Output<String> aggregation;

    public Output<String> aggregation() {
        return this.aggregation;
    }

    @Import(name="facet")
    private @Nullable Output<String> facet;

    public Optional<Output<String>> facet() {
        return Optional.ofNullable(this.facet);
    }

    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    private DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmQueryComputeQueryArgs() {}

    private DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmQueryComputeQueryArgs(DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmQueryComputeQueryArgs $) {
        this.aggregation = $.aggregation;
        this.facet = $.facet;
        this.interval = $.interval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmQueryComputeQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmQueryComputeQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmQueryComputeQueryArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmQueryComputeQueryArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmQueryComputeQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder aggregation(Output<String> aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        public Builder aggregation(String aggregation) {
            return aggregation(Output.of(aggregation));
        }

        public Builder facet(@Nullable Output<String> facet) {
            $.facet = facet;
            return this;
        }

        public Builder facet(String facet) {
            return facet(Output.of(facet));
        }

        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        public DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestApmQueryComputeQueryArgs build() {
            $.aggregation = Objects.requireNonNull($.aggregation, "expected parameter 'aggregation' to be non-null");
            return $;
        }
    }

}