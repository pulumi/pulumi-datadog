// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetEventStreamDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetEventStreamDefinitionArgs Empty = new PowerpackWidgetEventStreamDefinitionArgs();

    /**
     * The size to use to display an event. Valid values are `s`, `l`.
     * 
     */
    @Import(name="eventSize")
    private @Nullable Output<String> eventSize;

    /**
     * @return The size to use to display an event. Valid values are `s`, `l`.
     * 
     */
    public Optional<Output<String>> eventSize() {
        return Optional.ofNullable(this.eventSize);
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
     * The query to use in the widget.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return The query to use in the widget.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    /**
     * The execution method for multi-value filters, options: `and` or `or`.
     * 
     */
    @Import(name="tagsExecution")
    private @Nullable Output<String> tagsExecution;

    /**
     * @return The execution method for multi-value filters, options: `and` or `or`.
     * 
     */
    public Optional<Output<String>> tagsExecution() {
        return Optional.ofNullable(this.tagsExecution);
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

    private PowerpackWidgetEventStreamDefinitionArgs() {}

    private PowerpackWidgetEventStreamDefinitionArgs(PowerpackWidgetEventStreamDefinitionArgs $) {
        this.eventSize = $.eventSize;
        this.liveSpan = $.liveSpan;
        this.query = $.query;
        this.tagsExecution = $.tagsExecution;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetEventStreamDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetEventStreamDefinitionArgs $;

        public Builder() {
            $ = new PowerpackWidgetEventStreamDefinitionArgs();
        }

        public Builder(PowerpackWidgetEventStreamDefinitionArgs defaults) {
            $ = new PowerpackWidgetEventStreamDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventSize The size to use to display an event. Valid values are `s`, `l`.
         * 
         * @return builder
         * 
         */
        public Builder eventSize(@Nullable Output<String> eventSize) {
            $.eventSize = eventSize;
            return this;
        }

        /**
         * @param eventSize The size to use to display an event. Valid values are `s`, `l`.
         * 
         * @return builder
         * 
         */
        public Builder eventSize(String eventSize) {
            return eventSize(Output.of(eventSize));
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
         * @param query The query to use in the widget.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The query to use in the widget.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param tagsExecution The execution method for multi-value filters, options: `and` or `or`.
         * 
         * @return builder
         * 
         */
        public Builder tagsExecution(@Nullable Output<String> tagsExecution) {
            $.tagsExecution = tagsExecution;
            return this;
        }

        /**
         * @param tagsExecution The execution method for multi-value filters, options: `and` or `or`.
         * 
         * @return builder
         * 
         */
        public Builder tagsExecution(String tagsExecution) {
            return tagsExecution(Output.of(tagsExecution));
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

        public PowerpackWidgetEventStreamDefinitionArgs build() {
            if ($.query == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetEventStreamDefinitionArgs", "query");
            }
            return $;
        }
    }

}