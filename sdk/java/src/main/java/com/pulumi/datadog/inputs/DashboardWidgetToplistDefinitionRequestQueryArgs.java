// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionRequestQueryEventQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionRequestQueryMetricQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionRequestQueryProcessQueryArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetToplistDefinitionRequestQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetToplistDefinitionRequestQueryArgs Empty = new DashboardWidgetToplistDefinitionRequestQueryArgs();

    @Import(name="apmDependencyStatsQuery")
    private @Nullable Output<DashboardWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery;

    public Optional<Output<DashboardWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs>> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }

    @Import(name="apmResourceStatsQuery")
    private @Nullable Output<DashboardWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery;

    public Optional<Output<DashboardWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs>> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }

    @Import(name="eventQuery")
    private @Nullable Output<DashboardWidgetToplistDefinitionRequestQueryEventQueryArgs> eventQuery;

    public Optional<Output<DashboardWidgetToplistDefinitionRequestQueryEventQueryArgs>> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }

    @Import(name="metricQuery")
    private @Nullable Output<DashboardWidgetToplistDefinitionRequestQueryMetricQueryArgs> metricQuery;

    public Optional<Output<DashboardWidgetToplistDefinitionRequestQueryMetricQueryArgs>> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }

    @Import(name="processQuery")
    private @Nullable Output<DashboardWidgetToplistDefinitionRequestQueryProcessQueryArgs> processQuery;

    public Optional<Output<DashboardWidgetToplistDefinitionRequestQueryProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    private DashboardWidgetToplistDefinitionRequestQueryArgs() {}

    private DashboardWidgetToplistDefinitionRequestQueryArgs(DashboardWidgetToplistDefinitionRequestQueryArgs $) {
        this.apmDependencyStatsQuery = $.apmDependencyStatsQuery;
        this.apmResourceStatsQuery = $.apmResourceStatsQuery;
        this.eventQuery = $.eventQuery;
        this.metricQuery = $.metricQuery;
        this.processQuery = $.processQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetToplistDefinitionRequestQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetToplistDefinitionRequestQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetToplistDefinitionRequestQueryArgs();
        }

        public Builder(DashboardWidgetToplistDefinitionRequestQueryArgs defaults) {
            $ = new DashboardWidgetToplistDefinitionRequestQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder apmDependencyStatsQuery(@Nullable Output<DashboardWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery) {
            $.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }

        public Builder apmDependencyStatsQuery(DashboardWidgetToplistDefinitionRequestQueryApmDependencyStatsQueryArgs apmDependencyStatsQuery) {
            return apmDependencyStatsQuery(Output.of(apmDependencyStatsQuery));
        }

        public Builder apmResourceStatsQuery(@Nullable Output<DashboardWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery) {
            $.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }

        public Builder apmResourceStatsQuery(DashboardWidgetToplistDefinitionRequestQueryApmResourceStatsQueryArgs apmResourceStatsQuery) {
            return apmResourceStatsQuery(Output.of(apmResourceStatsQuery));
        }

        public Builder eventQuery(@Nullable Output<DashboardWidgetToplistDefinitionRequestQueryEventQueryArgs> eventQuery) {
            $.eventQuery = eventQuery;
            return this;
        }

        public Builder eventQuery(DashboardWidgetToplistDefinitionRequestQueryEventQueryArgs eventQuery) {
            return eventQuery(Output.of(eventQuery));
        }

        public Builder metricQuery(@Nullable Output<DashboardWidgetToplistDefinitionRequestQueryMetricQueryArgs> metricQuery) {
            $.metricQuery = metricQuery;
            return this;
        }

        public Builder metricQuery(DashboardWidgetToplistDefinitionRequestQueryMetricQueryArgs metricQuery) {
            return metricQuery(Output.of(metricQuery));
        }

        public Builder processQuery(@Nullable Output<DashboardWidgetToplistDefinitionRequestQueryProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        public Builder processQuery(DashboardWidgetToplistDefinitionRequestQueryProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        public DashboardWidgetToplistDefinitionRequestQueryArgs build() {
            return $;
        }
    }

}