// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetHostmapDefinitionRequestSizeApmQueryComputeQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetHostmapDefinitionRequestSizeApmQueryGroupByArgs;
import com.pulumi.datadog.inputs.DashboardWidgetHostmapDefinitionRequestSizeApmQueryMultiComputeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetHostmapDefinitionRequestSizeApmQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetHostmapDefinitionRequestSizeApmQueryArgs Empty = new DashboardWidgetHostmapDefinitionRequestSizeApmQueryArgs();

    @Import(name="computeQuery")
    private @Nullable Output<DashboardWidgetHostmapDefinitionRequestSizeApmQueryComputeQueryArgs> computeQuery;

    public Optional<Output<DashboardWidgetHostmapDefinitionRequestSizeApmQueryComputeQueryArgs>> computeQuery() {
        return Optional.ofNullable(this.computeQuery);
    }

    @Import(name="groupBies")
    private @Nullable Output<List<DashboardWidgetHostmapDefinitionRequestSizeApmQueryGroupByArgs>> groupBies;

    public Optional<Output<List<DashboardWidgetHostmapDefinitionRequestSizeApmQueryGroupByArgs>>> groupBies() {
        return Optional.ofNullable(this.groupBies);
    }

    @Import(name="index", required=true)
    private Output<String> index;

    public Output<String> index() {
        return this.index;
    }

    @Import(name="multiComputes")
    private @Nullable Output<List<DashboardWidgetHostmapDefinitionRequestSizeApmQueryMultiComputeArgs>> multiComputes;

    public Optional<Output<List<DashboardWidgetHostmapDefinitionRequestSizeApmQueryMultiComputeArgs>>> multiComputes() {
        return Optional.ofNullable(this.multiComputes);
    }

    @Import(name="searchQuery")
    private @Nullable Output<String> searchQuery;

    public Optional<Output<String>> searchQuery() {
        return Optional.ofNullable(this.searchQuery);
    }

    private DashboardWidgetHostmapDefinitionRequestSizeApmQueryArgs() {}

    private DashboardWidgetHostmapDefinitionRequestSizeApmQueryArgs(DashboardWidgetHostmapDefinitionRequestSizeApmQueryArgs $) {
        this.computeQuery = $.computeQuery;
        this.groupBies = $.groupBies;
        this.index = $.index;
        this.multiComputes = $.multiComputes;
        this.searchQuery = $.searchQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetHostmapDefinitionRequestSizeApmQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetHostmapDefinitionRequestSizeApmQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetHostmapDefinitionRequestSizeApmQueryArgs();
        }

        public Builder(DashboardWidgetHostmapDefinitionRequestSizeApmQueryArgs defaults) {
            $ = new DashboardWidgetHostmapDefinitionRequestSizeApmQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder computeQuery(@Nullable Output<DashboardWidgetHostmapDefinitionRequestSizeApmQueryComputeQueryArgs> computeQuery) {
            $.computeQuery = computeQuery;
            return this;
        }

        public Builder computeQuery(DashboardWidgetHostmapDefinitionRequestSizeApmQueryComputeQueryArgs computeQuery) {
            return computeQuery(Output.of(computeQuery));
        }

        public Builder groupBies(@Nullable Output<List<DashboardWidgetHostmapDefinitionRequestSizeApmQueryGroupByArgs>> groupBies) {
            $.groupBies = groupBies;
            return this;
        }

        public Builder groupBies(List<DashboardWidgetHostmapDefinitionRequestSizeApmQueryGroupByArgs> groupBies) {
            return groupBies(Output.of(groupBies));
        }

        public Builder groupBies(DashboardWidgetHostmapDefinitionRequestSizeApmQueryGroupByArgs... groupBies) {
            return groupBies(List.of(groupBies));
        }

        public Builder index(Output<String> index) {
            $.index = index;
            return this;
        }

        public Builder index(String index) {
            return index(Output.of(index));
        }

        public Builder multiComputes(@Nullable Output<List<DashboardWidgetHostmapDefinitionRequestSizeApmQueryMultiComputeArgs>> multiComputes) {
            $.multiComputes = multiComputes;
            return this;
        }

        public Builder multiComputes(List<DashboardWidgetHostmapDefinitionRequestSizeApmQueryMultiComputeArgs> multiComputes) {
            return multiComputes(Output.of(multiComputes));
        }

        public Builder multiComputes(DashboardWidgetHostmapDefinitionRequestSizeApmQueryMultiComputeArgs... multiComputes) {
            return multiComputes(List.of(multiComputes));
        }

        public Builder searchQuery(@Nullable Output<String> searchQuery) {
            $.searchQuery = searchQuery;
            return this;
        }

        public Builder searchQuery(String searchQuery) {
            return searchQuery(Output.of(searchQuery));
        }

        public DashboardWidgetHostmapDefinitionRequestSizeApmQueryArgs build() {
            $.index = Objects.requireNonNull($.index, "expected parameter 'index' to be non-null");
            return $;
        }
    }

}