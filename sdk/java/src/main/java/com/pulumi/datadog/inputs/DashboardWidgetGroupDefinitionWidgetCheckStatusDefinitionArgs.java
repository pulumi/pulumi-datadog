// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs Empty = new DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs();

    @Import(name="check", required=true)
    private Output<String> check;

    public Output<String> check() {
        return this.check;
    }

    @Import(name="group")
    private @Nullable Output<String> group;

    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    @Import(name="groupBies")
    private @Nullable Output<List<String>> groupBies;

    public Optional<Output<List<String>>> groupBies() {
        return Optional.ofNullable(this.groupBies);
    }

    @Import(name="grouping", required=true)
    private Output<String> grouping;

    public Output<String> grouping() {
        return this.grouping;
    }

    @Import(name="liveSpan")
    private @Nullable Output<String> liveSpan;

    public Optional<Output<String>> liveSpan() {
        return Optional.ofNullable(this.liveSpan);
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
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

    private DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs() {}

    private DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs(DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs $) {
        this.check = $.check;
        this.group = $.group;
        this.groupBies = $.groupBies;
        this.grouping = $.grouping;
        this.liveSpan = $.liveSpan;
        this.tags = $.tags;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder check(Output<String> check) {
            $.check = check;
            return this;
        }

        public Builder check(String check) {
            return check(Output.of(check));
        }

        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        public Builder group(String group) {
            return group(Output.of(group));
        }

        public Builder groupBies(@Nullable Output<List<String>> groupBies) {
            $.groupBies = groupBies;
            return this;
        }

        public Builder groupBies(List<String> groupBies) {
            return groupBies(Output.of(groupBies));
        }

        public Builder groupBies(String... groupBies) {
            return groupBies(List.of(groupBies));
        }

        public Builder grouping(Output<String> grouping) {
            $.grouping = grouping;
            return this;
        }

        public Builder grouping(String grouping) {
            return grouping(Output.of(grouping));
        }

        public Builder liveSpan(@Nullable Output<String> liveSpan) {
            $.liveSpan = liveSpan;
            return this;
        }

        public Builder liveSpan(String liveSpan) {
            return liveSpan(Output.of(liveSpan));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
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

        public DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs build() {
            $.check = Objects.requireNonNull($.check, "expected parameter 'check' to be non-null");
            $.grouping = Objects.requireNonNull($.grouping, "expected parameter 'grouping' to be non-null");
            return $;
        }
    }

}