// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetSunburstDefinitionCustomLinkArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSunburstDefinitionLegendInlineArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSunburstDefinitionLegendTableArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSunburstDefinitionRequestArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetSunburstDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetSunburstDefinitionArgs Empty = new DashboardWidgetSunburstDefinitionArgs();

    @Import(name="customLinks")
    private @Nullable Output<List<DashboardWidgetSunburstDefinitionCustomLinkArgs>> customLinks;

    public Optional<Output<List<DashboardWidgetSunburstDefinitionCustomLinkArgs>>> customLinks() {
        return Optional.ofNullable(this.customLinks);
    }

    @Import(name="hideTotal")
    private @Nullable Output<Boolean> hideTotal;

    public Optional<Output<Boolean>> hideTotal() {
        return Optional.ofNullable(this.hideTotal);
    }

    @Import(name="legendInline")
    private @Nullable Output<DashboardWidgetSunburstDefinitionLegendInlineArgs> legendInline;

    public Optional<Output<DashboardWidgetSunburstDefinitionLegendInlineArgs>> legendInline() {
        return Optional.ofNullable(this.legendInline);
    }

    @Import(name="legendTable")
    private @Nullable Output<DashboardWidgetSunburstDefinitionLegendTableArgs> legendTable;

    public Optional<Output<DashboardWidgetSunburstDefinitionLegendTableArgs>> legendTable() {
        return Optional.ofNullable(this.legendTable);
    }

    @Import(name="liveSpan")
    private @Nullable Output<String> liveSpan;

    public Optional<Output<String>> liveSpan() {
        return Optional.ofNullable(this.liveSpan);
    }

    @Import(name="requests")
    private @Nullable Output<List<DashboardWidgetSunburstDefinitionRequestArgs>> requests;

    public Optional<Output<List<DashboardWidgetSunburstDefinitionRequestArgs>>> requests() {
        return Optional.ofNullable(this.requests);
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

    private DashboardWidgetSunburstDefinitionArgs() {}

    private DashboardWidgetSunburstDefinitionArgs(DashboardWidgetSunburstDefinitionArgs $) {
        this.customLinks = $.customLinks;
        this.hideTotal = $.hideTotal;
        this.legendInline = $.legendInline;
        this.legendTable = $.legendTable;
        this.liveSpan = $.liveSpan;
        this.requests = $.requests;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetSunburstDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetSunburstDefinitionArgs $;

        public Builder() {
            $ = new DashboardWidgetSunburstDefinitionArgs();
        }

        public Builder(DashboardWidgetSunburstDefinitionArgs defaults) {
            $ = new DashboardWidgetSunburstDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder customLinks(@Nullable Output<List<DashboardWidgetSunburstDefinitionCustomLinkArgs>> customLinks) {
            $.customLinks = customLinks;
            return this;
        }

        public Builder customLinks(List<DashboardWidgetSunburstDefinitionCustomLinkArgs> customLinks) {
            return customLinks(Output.of(customLinks));
        }

        public Builder customLinks(DashboardWidgetSunburstDefinitionCustomLinkArgs... customLinks) {
            return customLinks(List.of(customLinks));
        }

        public Builder hideTotal(@Nullable Output<Boolean> hideTotal) {
            $.hideTotal = hideTotal;
            return this;
        }

        public Builder hideTotal(Boolean hideTotal) {
            return hideTotal(Output.of(hideTotal));
        }

        public Builder legendInline(@Nullable Output<DashboardWidgetSunburstDefinitionLegendInlineArgs> legendInline) {
            $.legendInline = legendInline;
            return this;
        }

        public Builder legendInline(DashboardWidgetSunburstDefinitionLegendInlineArgs legendInline) {
            return legendInline(Output.of(legendInline));
        }

        public Builder legendTable(@Nullable Output<DashboardWidgetSunburstDefinitionLegendTableArgs> legendTable) {
            $.legendTable = legendTable;
            return this;
        }

        public Builder legendTable(DashboardWidgetSunburstDefinitionLegendTableArgs legendTable) {
            return legendTable(Output.of(legendTable));
        }

        public Builder liveSpan(@Nullable Output<String> liveSpan) {
            $.liveSpan = liveSpan;
            return this;
        }

        public Builder liveSpan(String liveSpan) {
            return liveSpan(Output.of(liveSpan));
        }

        public Builder requests(@Nullable Output<List<DashboardWidgetSunburstDefinitionRequestArgs>> requests) {
            $.requests = requests;
            return this;
        }

        public Builder requests(List<DashboardWidgetSunburstDefinitionRequestArgs> requests) {
            return requests(Output.of(requests));
        }

        public Builder requests(DashboardWidgetSunburstDefinitionRequestArgs... requests) {
            return requests(List.of(requests));
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

        public DashboardWidgetSunburstDefinitionArgs build() {
            return $;
        }
    }

}