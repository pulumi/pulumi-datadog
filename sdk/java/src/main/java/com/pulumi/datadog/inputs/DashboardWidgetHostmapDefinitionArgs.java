// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetHostmapDefinitionCustomLinkArgs;
import com.pulumi.datadog.inputs.DashboardWidgetHostmapDefinitionRequestArgs;
import com.pulumi.datadog.inputs.DashboardWidgetHostmapDefinitionStyleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetHostmapDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetHostmapDefinitionArgs Empty = new DashboardWidgetHostmapDefinitionArgs();

    /**
     * A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    @Import(name="customLinks")
    private @Nullable Output<List<DashboardWidgetHostmapDefinitionCustomLinkArgs>> customLinks;

    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<DashboardWidgetHostmapDefinitionCustomLinkArgs>>> customLinks() {
        return Optional.ofNullable(this.customLinks);
    }

    /**
     * The list of tags to group nodes by.
     * 
     */
    @Import(name="groups")
    private @Nullable Output<List<String>> groups;

    /**
     * @return The list of tags to group nodes by.
     * 
     */
    public Optional<Output<List<String>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * A Boolean indicating whether to show ungrouped nodes.
     * 
     */
    @Import(name="noGroupHosts")
    private @Nullable Output<Boolean> noGroupHosts;

    /**
     * @return A Boolean indicating whether to show ungrouped nodes.
     * 
     */
    public Optional<Output<Boolean>> noGroupHosts() {
        return Optional.ofNullable(this.noGroupHosts);
    }

    /**
     * A Boolean indicating whether to show nodes with no metrics.
     * 
     */
    @Import(name="noMetricHosts")
    private @Nullable Output<Boolean> noMetricHosts;

    /**
     * @return A Boolean indicating whether to show nodes with no metrics.
     * 
     */
    public Optional<Output<Boolean>> noMetricHosts() {
        return Optional.ofNullable(this.noMetricHosts);
    }

    /**
     * The type of node used. Valid values are `host`, `container`.
     * 
     */
    @Import(name="nodeType")
    private @Nullable Output<String> nodeType;

    /**
     * @return The type of node used. Valid values are `host`, `container`.
     * 
     */
    public Optional<Output<String>> nodeType() {
        return Optional.ofNullable(this.nodeType);
    }

    /**
     * A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below.
     * 
     */
    @Import(name="request")
    private @Nullable Output<DashboardWidgetHostmapDefinitionRequestArgs> request;

    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<DashboardWidgetHostmapDefinitionRequestArgs>> request() {
        return Optional.ofNullable(this.request);
    }

    /**
     * The list of tags to filter nodes by.
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<List<String>> scopes;

    /**
     * @return The list of tags to filter nodes by.
     * 
     */
    public Optional<Output<List<String>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * The style of the widget graph. One nested block is allowed using the structure below.
     * 
     */
    @Import(name="style")
    private @Nullable Output<DashboardWidgetHostmapDefinitionStyleArgs> style;

    /**
     * @return The style of the widget graph. One nested block is allowed using the structure below.
     * 
     */
    public Optional<Output<DashboardWidgetHostmapDefinitionStyleArgs>> style() {
        return Optional.ofNullable(this.style);
    }

    /**
     * The title of the widget.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The title of the widget.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
     * 
     */
    @Import(name="titleAlign")
    private @Nullable Output<String> titleAlign;

    /**
     * @return The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
     * 
     */
    public Optional<Output<String>> titleAlign() {
        return Optional.ofNullable(this.titleAlign);
    }

    /**
     * The size of the widget&#39;s title (defaults to 16).
     * 
     */
    @Import(name="titleSize")
    private @Nullable Output<String> titleSize;

    /**
     * @return The size of the widget&#39;s title (defaults to 16).
     * 
     */
    public Optional<Output<String>> titleSize() {
        return Optional.ofNullable(this.titleSize);
    }

    private DashboardWidgetHostmapDefinitionArgs() {}

    private DashboardWidgetHostmapDefinitionArgs(DashboardWidgetHostmapDefinitionArgs $) {
        this.customLinks = $.customLinks;
        this.groups = $.groups;
        this.noGroupHosts = $.noGroupHosts;
        this.noMetricHosts = $.noMetricHosts;
        this.nodeType = $.nodeType;
        this.request = $.request;
        this.scopes = $.scopes;
        this.style = $.style;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetHostmapDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetHostmapDefinitionArgs $;

        public Builder() {
            $ = new DashboardWidgetHostmapDefinitionArgs();
        }

        public Builder(DashboardWidgetHostmapDefinitionArgs defaults) {
            $ = new DashboardWidgetHostmapDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(@Nullable Output<List<DashboardWidgetHostmapDefinitionCustomLinkArgs>> customLinks) {
            $.customLinks = customLinks;
            return this;
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(List<DashboardWidgetHostmapDefinitionCustomLinkArgs> customLinks) {
            return customLinks(Output.of(customLinks));
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(DashboardWidgetHostmapDefinitionCustomLinkArgs... customLinks) {
            return customLinks(List.of(customLinks));
        }

        /**
         * @param groups The list of tags to group nodes by.
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups The list of tags to group nodes by.
         * 
         * @return builder
         * 
         */
        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groups The list of tags to group nodes by.
         * 
         * @return builder
         * 
         */
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param noGroupHosts A Boolean indicating whether to show ungrouped nodes.
         * 
         * @return builder
         * 
         */
        public Builder noGroupHosts(@Nullable Output<Boolean> noGroupHosts) {
            $.noGroupHosts = noGroupHosts;
            return this;
        }

        /**
         * @param noGroupHosts A Boolean indicating whether to show ungrouped nodes.
         * 
         * @return builder
         * 
         */
        public Builder noGroupHosts(Boolean noGroupHosts) {
            return noGroupHosts(Output.of(noGroupHosts));
        }

        /**
         * @param noMetricHosts A Boolean indicating whether to show nodes with no metrics.
         * 
         * @return builder
         * 
         */
        public Builder noMetricHosts(@Nullable Output<Boolean> noMetricHosts) {
            $.noMetricHosts = noMetricHosts;
            return this;
        }

        /**
         * @param noMetricHosts A Boolean indicating whether to show nodes with no metrics.
         * 
         * @return builder
         * 
         */
        public Builder noMetricHosts(Boolean noMetricHosts) {
            return noMetricHosts(Output.of(noMetricHosts));
        }

        /**
         * @param nodeType The type of node used. Valid values are `host`, `container`.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(@Nullable Output<String> nodeType) {
            $.nodeType = nodeType;
            return this;
        }

        /**
         * @param nodeType The type of node used. Valid values are `host`, `container`.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(String nodeType) {
            return nodeType(Output.of(nodeType));
        }

        /**
         * @param request A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder request(@Nullable Output<DashboardWidgetHostmapDefinitionRequestArgs> request) {
            $.request = request;
            return this;
        }

        /**
         * @param request A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder request(DashboardWidgetHostmapDefinitionRequestArgs request) {
            return request(Output.of(request));
        }

        /**
         * @param scopes The list of tags to filter nodes by.
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes The list of tags to filter nodes by.
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes The list of tags to filter nodes by.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        /**
         * @param style The style of the widget graph. One nested block is allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder style(@Nullable Output<DashboardWidgetHostmapDefinitionStyleArgs> style) {
            $.style = style;
            return this;
        }

        /**
         * @param style The style of the widget graph. One nested block is allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder style(DashboardWidgetHostmapDefinitionStyleArgs style) {
            return style(Output.of(style));
        }

        /**
         * @param title The title of the widget.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title of the widget.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param titleAlign The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
         * 
         * @return builder
         * 
         */
        public Builder titleAlign(@Nullable Output<String> titleAlign) {
            $.titleAlign = titleAlign;
            return this;
        }

        /**
         * @param titleAlign The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
         * 
         * @return builder
         * 
         */
        public Builder titleAlign(String titleAlign) {
            return titleAlign(Output.of(titleAlign));
        }

        /**
         * @param titleSize The size of the widget&#39;s title (defaults to 16).
         * 
         * @return builder
         * 
         */
        public Builder titleSize(@Nullable Output<String> titleSize) {
            $.titleSize = titleSize;
            return this;
        }

        /**
         * @param titleSize The size of the widget&#39;s title (defaults to 16).
         * 
         * @return builder
         * 
         */
        public Builder titleSize(String titleSize) {
            return titleSize(Output.of(titleSize));
        }

        public DashboardWidgetHostmapDefinitionArgs build() {
            return $;
        }
    }

}