// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetHostmapDefinitionRequestFillArgs;
import com.pulumi.datadog.inputs.DashboardWidgetHostmapDefinitionRequestSizeArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetHostmapDefinitionRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetHostmapDefinitionRequestArgs Empty = new DashboardWidgetHostmapDefinitionRequestArgs();

    @Import(name="fills")
    private @Nullable Output<List<DashboardWidgetHostmapDefinitionRequestFillArgs>> fills;

    public Optional<Output<List<DashboardWidgetHostmapDefinitionRequestFillArgs>>> fills() {
        return Optional.ofNullable(this.fills);
    }

    @Import(name="sizes")
    private @Nullable Output<List<DashboardWidgetHostmapDefinitionRequestSizeArgs>> sizes;

    public Optional<Output<List<DashboardWidgetHostmapDefinitionRequestSizeArgs>>> sizes() {
        return Optional.ofNullable(this.sizes);
    }

    private DashboardWidgetHostmapDefinitionRequestArgs() {}

    private DashboardWidgetHostmapDefinitionRequestArgs(DashboardWidgetHostmapDefinitionRequestArgs $) {
        this.fills = $.fills;
        this.sizes = $.sizes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetHostmapDefinitionRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetHostmapDefinitionRequestArgs $;

        public Builder() {
            $ = new DashboardWidgetHostmapDefinitionRequestArgs();
        }

        public Builder(DashboardWidgetHostmapDefinitionRequestArgs defaults) {
            $ = new DashboardWidgetHostmapDefinitionRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder fills(@Nullable Output<List<DashboardWidgetHostmapDefinitionRequestFillArgs>> fills) {
            $.fills = fills;
            return this;
        }

        public Builder fills(List<DashboardWidgetHostmapDefinitionRequestFillArgs> fills) {
            return fills(Output.of(fills));
        }

        public Builder fills(DashboardWidgetHostmapDefinitionRequestFillArgs... fills) {
            return fills(List.of(fills));
        }

        public Builder sizes(@Nullable Output<List<DashboardWidgetHostmapDefinitionRequestSizeArgs>> sizes) {
            $.sizes = sizes;
            return this;
        }

        public Builder sizes(List<DashboardWidgetHostmapDefinitionRequestSizeArgs> sizes) {
            return sizes(Output.of(sizes));
        }

        public Builder sizes(DashboardWidgetHostmapDefinitionRequestSizeArgs... sizes) {
            return sizes(List.of(sizes));
        }

        public DashboardWidgetHostmapDefinitionRequestArgs build() {
            return $;
        }
    }

}