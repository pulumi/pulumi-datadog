// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetQueryTableDefinitionRequestQueryApmDependencyStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetQueryTableDefinitionRequestQueryApmResourceStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetQueryTableDefinitionRequestQueryEventQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetQueryTableDefinitionRequestQueryMetricQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetQueryTableDefinitionRequestQueryProcessQueryArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetQueryTableDefinitionRequestQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetQueryTableDefinitionRequestQueryArgs Empty = new DashboardWidgetQueryTableDefinitionRequestQueryArgs();

    @Import(name="apmDependencyStatsQuery")
    private @Nullable Output<DashboardWidgetQueryTableDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery;

    public Optional<Output<DashboardWidgetQueryTableDefinitionRequestQueryApmDependencyStatsQueryArgs>> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }

    @Import(name="apmResourceStatsQuery")
    private @Nullable Output<DashboardWidgetQueryTableDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery;

    public Optional<Output<DashboardWidgetQueryTableDefinitionRequestQueryApmResourceStatsQueryArgs>> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }

    @Import(name="eventQuery")
    private @Nullable Output<DashboardWidgetQueryTableDefinitionRequestQueryEventQueryArgs> eventQuery;

    public Optional<Output<DashboardWidgetQueryTableDefinitionRequestQueryEventQueryArgs>> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }

    @Import(name="metricQuery")
    private @Nullable Output<DashboardWidgetQueryTableDefinitionRequestQueryMetricQueryArgs> metricQuery;

    public Optional<Output<DashboardWidgetQueryTableDefinitionRequestQueryMetricQueryArgs>> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }

    @Import(name="processQuery")
    private @Nullable Output<DashboardWidgetQueryTableDefinitionRequestQueryProcessQueryArgs> processQuery;

    public Optional<Output<DashboardWidgetQueryTableDefinitionRequestQueryProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    private DashboardWidgetQueryTableDefinitionRequestQueryArgs() {}

    private DashboardWidgetQueryTableDefinitionRequestQueryArgs(DashboardWidgetQueryTableDefinitionRequestQueryArgs $) {
        this.apmDependencyStatsQuery = $.apmDependencyStatsQuery;
        this.apmResourceStatsQuery = $.apmResourceStatsQuery;
        this.eventQuery = $.eventQuery;
        this.metricQuery = $.metricQuery;
        this.processQuery = $.processQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetQueryTableDefinitionRequestQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetQueryTableDefinitionRequestQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetQueryTableDefinitionRequestQueryArgs();
        }

        public Builder(DashboardWidgetQueryTableDefinitionRequestQueryArgs defaults) {
            $ = new DashboardWidgetQueryTableDefinitionRequestQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder apmDependencyStatsQuery(@Nullable Output<DashboardWidgetQueryTableDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery) {
            $.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }

        public Builder apmDependencyStatsQuery(DashboardWidgetQueryTableDefinitionRequestQueryApmDependencyStatsQueryArgs apmDependencyStatsQuery) {
            return apmDependencyStatsQuery(Output.of(apmDependencyStatsQuery));
        }

        public Builder apmResourceStatsQuery(@Nullable Output<DashboardWidgetQueryTableDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery) {
            $.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }

        public Builder apmResourceStatsQuery(DashboardWidgetQueryTableDefinitionRequestQueryApmResourceStatsQueryArgs apmResourceStatsQuery) {
            return apmResourceStatsQuery(Output.of(apmResourceStatsQuery));
        }

        public Builder eventQuery(@Nullable Output<DashboardWidgetQueryTableDefinitionRequestQueryEventQueryArgs> eventQuery) {
            $.eventQuery = eventQuery;
            return this;
        }

        public Builder eventQuery(DashboardWidgetQueryTableDefinitionRequestQueryEventQueryArgs eventQuery) {
            return eventQuery(Output.of(eventQuery));
        }

        public Builder metricQuery(@Nullable Output<DashboardWidgetQueryTableDefinitionRequestQueryMetricQueryArgs> metricQuery) {
            $.metricQuery = metricQuery;
            return this;
        }

        public Builder metricQuery(DashboardWidgetQueryTableDefinitionRequestQueryMetricQueryArgs metricQuery) {
            return metricQuery(Output.of(metricQuery));
        }

        public Builder processQuery(@Nullable Output<DashboardWidgetQueryTableDefinitionRequestQueryProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        public Builder processQuery(DashboardWidgetQueryTableDefinitionRequestQueryProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        public DashboardWidgetQueryTableDefinitionRequestQueryArgs build() {
            return $;
        }
    }

}