// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetServicemapDefinitionCustomLinkArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs Empty = new DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs();

    @Import(name="customLinks")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetServicemapDefinitionCustomLinkArgs>> customLinks;

    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetServicemapDefinitionCustomLinkArgs>>> customLinks() {
        return Optional.ofNullable(this.customLinks);
    }

    @Import(name="filters", required=true)
    private Output<List<String>> filters;

    public Output<List<String>> filters() {
        return this.filters;
    }

    @Import(name="service", required=true)
    private Output<String> service;

    public Output<String> service() {
        return this.service;
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

    private DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs() {}

    private DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs(DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs $) {
        this.customLinks = $.customLinks;
        this.filters = $.filters;
        this.service = $.service;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder customLinks(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetServicemapDefinitionCustomLinkArgs>> customLinks) {
            $.customLinks = customLinks;
            return this;
        }

        public Builder customLinks(List<DashboardWidgetGroupDefinitionWidgetServicemapDefinitionCustomLinkArgs> customLinks) {
            return customLinks(Output.of(customLinks));
        }

        public Builder customLinks(DashboardWidgetGroupDefinitionWidgetServicemapDefinitionCustomLinkArgs... customLinks) {
            return customLinks(List.of(customLinks));
        }

        public Builder filters(Output<List<String>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<String> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }

        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        public Builder service(String service) {
            return service(Output.of(service));
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

        public DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs build() {
            $.filters = Objects.requireNonNull($.filters, "expected parameter 'filters' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}