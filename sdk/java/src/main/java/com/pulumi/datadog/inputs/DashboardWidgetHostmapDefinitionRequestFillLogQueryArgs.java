// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetHostmapDefinitionRequestFillLogQueryGroupByArgs;
import com.pulumi.datadog.inputs.DashboardWidgetHostmapDefinitionRequestFillLogQueryMultiComputeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetHostmapDefinitionRequestFillLogQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetHostmapDefinitionRequestFillLogQueryArgs Empty = new DashboardWidgetHostmapDefinitionRequestFillLogQueryArgs();

    @Import(name="computeQuery")
    private @Nullable Output<DashboardWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs> computeQuery;

    public Optional<Output<DashboardWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs>> computeQuery() {
        return Optional.ofNullable(this.computeQuery);
    }

    @Import(name="groupBies")
    private @Nullable Output<List<DashboardWidgetHostmapDefinitionRequestFillLogQueryGroupByArgs>> groupBies;

    public Optional<Output<List<DashboardWidgetHostmapDefinitionRequestFillLogQueryGroupByArgs>>> groupBies() {
        return Optional.ofNullable(this.groupBies);
    }

    @Import(name="index", required=true)
    private Output<String> index;

    public Output<String> index() {
        return this.index;
    }

    @Import(name="multiComputes")
    private @Nullable Output<List<DashboardWidgetHostmapDefinitionRequestFillLogQueryMultiComputeArgs>> multiComputes;

    public Optional<Output<List<DashboardWidgetHostmapDefinitionRequestFillLogQueryMultiComputeArgs>>> multiComputes() {
        return Optional.ofNullable(this.multiComputes);
    }

    @Import(name="searchQuery")
    private @Nullable Output<String> searchQuery;

    public Optional<Output<String>> searchQuery() {
        return Optional.ofNullable(this.searchQuery);
    }

    private DashboardWidgetHostmapDefinitionRequestFillLogQueryArgs() {}

    private DashboardWidgetHostmapDefinitionRequestFillLogQueryArgs(DashboardWidgetHostmapDefinitionRequestFillLogQueryArgs $) {
        this.computeQuery = $.computeQuery;
        this.groupBies = $.groupBies;
        this.index = $.index;
        this.multiComputes = $.multiComputes;
        this.searchQuery = $.searchQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetHostmapDefinitionRequestFillLogQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetHostmapDefinitionRequestFillLogQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetHostmapDefinitionRequestFillLogQueryArgs();
        }

        public Builder(DashboardWidgetHostmapDefinitionRequestFillLogQueryArgs defaults) {
            $ = new DashboardWidgetHostmapDefinitionRequestFillLogQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder computeQuery(@Nullable Output<DashboardWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs> computeQuery) {
            $.computeQuery = computeQuery;
            return this;
        }

        public Builder computeQuery(DashboardWidgetHostmapDefinitionRequestFillLogQueryComputeQueryArgs computeQuery) {
            return computeQuery(Output.of(computeQuery));
        }

        public Builder groupBies(@Nullable Output<List<DashboardWidgetHostmapDefinitionRequestFillLogQueryGroupByArgs>> groupBies) {
            $.groupBies = groupBies;
            return this;
        }

        public Builder groupBies(List<DashboardWidgetHostmapDefinitionRequestFillLogQueryGroupByArgs> groupBies) {
            return groupBies(Output.of(groupBies));
        }

        public Builder groupBies(DashboardWidgetHostmapDefinitionRequestFillLogQueryGroupByArgs... groupBies) {
            return groupBies(List.of(groupBies));
        }

        public Builder index(Output<String> index) {
            $.index = index;
            return this;
        }

        public Builder index(String index) {
            return index(Output.of(index));
        }

        public Builder multiComputes(@Nullable Output<List<DashboardWidgetHostmapDefinitionRequestFillLogQueryMultiComputeArgs>> multiComputes) {
            $.multiComputes = multiComputes;
            return this;
        }

        public Builder multiComputes(List<DashboardWidgetHostmapDefinitionRequestFillLogQueryMultiComputeArgs> multiComputes) {
            return multiComputes(Output.of(multiComputes));
        }

        public Builder multiComputes(DashboardWidgetHostmapDefinitionRequestFillLogQueryMultiComputeArgs... multiComputes) {
            return multiComputes(List.of(multiComputes));
        }

        public Builder searchQuery(@Nullable Output<String> searchQuery) {
            $.searchQuery = searchQuery;
            return this;
        }

        public Builder searchQuery(String searchQuery) {
            return searchQuery(Output.of(searchQuery));
        }

        public DashboardWidgetHostmapDefinitionRequestFillLogQueryArgs build() {
            $.index = Objects.requireNonNull($.index, "expected parameter 'index' to be non-null");
            return $;
        }
    }

}