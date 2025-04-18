// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionCustomLinkArgs;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionRequestArgs;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionStyleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetToplistDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetToplistDefinitionArgs Empty = new DashboardWidgetToplistDefinitionArgs();

    /**
     * A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    @Import(name="customLinks")
    private @Nullable Output<List<DashboardWidgetToplistDefinitionCustomLinkArgs>> customLinks;

    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<DashboardWidgetToplistDefinitionCustomLinkArgs>>> customLinks() {
        return Optional.ofNullable(this.customLinks);
    }

    /**
     * The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    @Import(name="liveSpan")
    private @Nullable Output<String> liveSpan;

    /**
     * @return The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    public Optional<Output<String>> liveSpan() {
        return Optional.ofNullable(this.liveSpan);
    }

    /**
     * A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the `request` block).
     * 
     */
    @Import(name="requests")
    private @Nullable Output<List<DashboardWidgetToplistDefinitionRequestArgs>> requests;

    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the `request` block).
     * 
     */
    public Optional<Output<List<DashboardWidgetToplistDefinitionRequestArgs>>> requests() {
        return Optional.ofNullable(this.requests);
    }

    /**
     * The style of the widget
     * 
     */
    @Import(name="styles")
    private @Nullable Output<List<DashboardWidgetToplistDefinitionStyleArgs>> styles;

    /**
     * @return The style of the widget
     * 
     */
    public Optional<Output<List<DashboardWidgetToplistDefinitionStyleArgs>>> styles() {
        return Optional.ofNullable(this.styles);
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

    private DashboardWidgetToplistDefinitionArgs() {}

    private DashboardWidgetToplistDefinitionArgs(DashboardWidgetToplistDefinitionArgs $) {
        this.customLinks = $.customLinks;
        this.liveSpan = $.liveSpan;
        this.requests = $.requests;
        this.styles = $.styles;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetToplistDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetToplistDefinitionArgs $;

        public Builder() {
            $ = new DashboardWidgetToplistDefinitionArgs();
        }

        public Builder(DashboardWidgetToplistDefinitionArgs defaults) {
            $ = new DashboardWidgetToplistDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(@Nullable Output<List<DashboardWidgetToplistDefinitionCustomLinkArgs>> customLinks) {
            $.customLinks = customLinks;
            return this;
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(List<DashboardWidgetToplistDefinitionCustomLinkArgs> customLinks) {
            return customLinks(Output.of(customLinks));
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(DashboardWidgetToplistDefinitionCustomLinkArgs... customLinks) {
            return customLinks(List.of(customLinks));
        }

        /**
         * @param liveSpan The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
         * 
         * @return builder
         * 
         */
        public Builder liveSpan(@Nullable Output<String> liveSpan) {
            $.liveSpan = liveSpan;
            return this;
        }

        /**
         * @param liveSpan The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
         * 
         * @return builder
         * 
         */
        public Builder liveSpan(String liveSpan) {
            return liveSpan(Output.of(liveSpan));
        }

        /**
         * @param requests A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the `request` block).
         * 
         * @return builder
         * 
         */
        public Builder requests(@Nullable Output<List<DashboardWidgetToplistDefinitionRequestArgs>> requests) {
            $.requests = requests;
            return this;
        }

        /**
         * @param requests A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the `request` block).
         * 
         * @return builder
         * 
         */
        public Builder requests(List<DashboardWidgetToplistDefinitionRequestArgs> requests) {
            return requests(Output.of(requests));
        }

        /**
         * @param requests A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the `request` block).
         * 
         * @return builder
         * 
         */
        public Builder requests(DashboardWidgetToplistDefinitionRequestArgs... requests) {
            return requests(List.of(requests));
        }

        /**
         * @param styles The style of the widget
         * 
         * @return builder
         * 
         */
        public Builder styles(@Nullable Output<List<DashboardWidgetToplistDefinitionStyleArgs>> styles) {
            $.styles = styles;
            return this;
        }

        /**
         * @param styles The style of the widget
         * 
         * @return builder
         * 
         */
        public Builder styles(List<DashboardWidgetToplistDefinitionStyleArgs> styles) {
            return styles(Output.of(styles));
        }

        /**
         * @param styles The style of the widget
         * 
         * @return builder
         * 
         */
        public Builder styles(DashboardWidgetToplistDefinitionStyleArgs... styles) {
            return styles(List.of(styles));
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

        public DashboardWidgetToplistDefinitionArgs build() {
            return $;
        }
    }

}
