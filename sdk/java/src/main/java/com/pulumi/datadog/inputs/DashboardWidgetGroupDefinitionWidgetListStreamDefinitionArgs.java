// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs Empty = new DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs();

    @Import(name="requests", required=true)
    private Output<List<DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestArgs>> requests;

    public Output<List<DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestArgs>> requests() {
        return this.requests;
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

    private DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs() {}

    private DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs(DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs $) {
        this.requests = $.requests;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder requests(Output<List<DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestArgs>> requests) {
            $.requests = requests;
            return this;
        }

        public Builder requests(List<DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestArgs> requests) {
            return requests(Output.of(requests));
        }

        public Builder requests(DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestArgs... requests) {
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

        public DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs build() {
            $.requests = Objects.requireNonNull($.requests, "expected parameter 'requests' to be non-null");
            return $;
        }
    }

}