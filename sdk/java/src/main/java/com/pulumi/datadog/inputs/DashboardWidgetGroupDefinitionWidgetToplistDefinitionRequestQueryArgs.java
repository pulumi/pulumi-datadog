// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryMetricQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryProcessQueryArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryArgs Empty = new DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryArgs();

    @Import(name="apmDependencyStatsQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs>> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }

    @Import(name="apmResourceStatsQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs>> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }

    @Import(name="eventQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryArgs> eventQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryArgs>> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }

    @Import(name="metricQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryMetricQueryArgs> metricQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryMetricQueryArgs>> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }

    @Import(name="processQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryProcessQueryArgs> processQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    private DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryArgs() {}

    private DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryArgs(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryArgs $) {
        this.apmDependencyStatsQuery = $.apmDependencyStatsQuery;
        this.apmResourceStatsQuery = $.apmResourceStatsQuery;
        this.eventQuery = $.eventQuery;
        this.metricQuery = $.metricQuery;
        this.processQuery = $.processQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder apmDependencyStatsQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery) {
            $.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }

        public Builder apmDependencyStatsQuery(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs apmDependencyStatsQuery) {
            return apmDependencyStatsQuery(Output.of(apmDependencyStatsQuery));
        }

        public Builder apmResourceStatsQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery) {
            $.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }

        public Builder apmResourceStatsQuery(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs apmResourceStatsQuery) {
            return apmResourceStatsQuery(Output.of(apmResourceStatsQuery));
        }

        public Builder eventQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryArgs> eventQuery) {
            $.eventQuery = eventQuery;
            return this;
        }

        public Builder eventQuery(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryArgs eventQuery) {
            return eventQuery(Output.of(eventQuery));
        }

        public Builder metricQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryMetricQueryArgs> metricQuery) {
            $.metricQuery = metricQuery;
            return this;
        }

        public Builder metricQuery(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryMetricQueryArgs metricQuery) {
            return metricQuery(Output.of(metricQuery));
        }

        public Builder processQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        public Builder processQuery(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        public DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryArgs build() {
            return $;
        }
    }

}