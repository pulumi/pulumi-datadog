// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetDistributionDefinitionRequestArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs Empty = new DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs();

    @Import(name="legendSize")
    private @Nullable Output<String> legendSize;

    public Optional<Output<String>> legendSize() {
        return Optional.ofNullable(this.legendSize);
    }

    @Import(name="liveSpan")
    private @Nullable Output<String> liveSpan;

    public Optional<Output<String>> liveSpan() {
        return Optional.ofNullable(this.liveSpan);
    }

    @Import(name="requests")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetDistributionDefinitionRequestArgs>> requests;

    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetDistributionDefinitionRequestArgs>>> requests() {
        return Optional.ofNullable(this.requests);
    }

    @Import(name="showLegend")
    private @Nullable Output<Boolean> showLegend;

    public Optional<Output<Boolean>> showLegend() {
        return Optional.ofNullable(this.showLegend);
    }

    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    @Import(name="titleAlign")
    private @Nullable Output<String> titleAlign;

    public Optional<Output<String>> titleAlign() {
        return Optional.ofNullable(this.titleAlign);
    }

    @Import(name="titleSize")
    private @Nullable Output<String> titleSize;

    public Optional<Output<String>> titleSize() {
        return Optional.ofNullable(this.titleSize);
    }

    private DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs() {}

    private DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs(DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs $) {
        this.legendSize = $.legendSize;
        this.liveSpan = $.liveSpan;
        this.requests = $.requests;
        this.showLegend = $.showLegend;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder legendSize(@Nullable Output<String> legendSize) {
            $.legendSize = legendSize;
            return this;
        }

        public Builder legendSize(String legendSize) {
            return legendSize(Output.of(legendSize));
        }

        public Builder liveSpan(@Nullable Output<String> liveSpan) {
            $.liveSpan = liveSpan;
            return this;
        }

        public Builder liveSpan(String liveSpan) {
            return liveSpan(Output.of(liveSpan));
        }

        public Builder requests(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetDistributionDefinitionRequestArgs>> requests) {
            $.requests = requests;
            return this;
        }

        public Builder requests(List<DashboardWidgetGroupDefinitionWidgetDistributionDefinitionRequestArgs> requests) {
            return requests(Output.of(requests));
        }

        public Builder requests(DashboardWidgetGroupDefinitionWidgetDistributionDefinitionRequestArgs... requests) {
            return requests(List.of(requests));
        }

        public Builder showLegend(@Nullable Output<Boolean> showLegend) {
            $.showLegend = showLegend;
            return this;
        }

        public Builder showLegend(Boolean showLegend) {
            return showLegend(Output.of(showLegend));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public Builder titleAlign(@Nullable Output<String> titleAlign) {
            $.titleAlign = titleAlign;
            return this;
        }

        public Builder titleAlign(String titleAlign) {
            return titleAlign(Output.of(titleAlign));
        }

        public Builder titleSize(@Nullable Output<String> titleSize) {
            $.titleSize = titleSize;
            return this;
        }

        public Builder titleSize(String titleSize) {
            return titleSize(Output.of(titleSize));
        }

        public DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs build() {
            return $;
        }
    }

}