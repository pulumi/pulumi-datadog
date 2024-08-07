// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetHeatmapDefinitionCustomLink;
import com.pulumi.datadog.outputs.PowerpackWidgetHeatmapDefinitionEvent;
import com.pulumi.datadog.outputs.PowerpackWidgetHeatmapDefinitionRequest;
import com.pulumi.datadog.outputs.PowerpackWidgetHeatmapDefinitionYaxis;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetHeatmapDefinition {
    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<PowerpackWidgetHeatmapDefinitionCustomLink> customLinks;
    /**
     * @return The definition of the event to overlay on the graph. Multiple `event` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<PowerpackWidgetHeatmapDefinitionEvent> events;
    /**
     * @return The size of the legend displayed in the widget.
     * 
     */
    private @Nullable String legendSize;
    /**
     * @return The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    private @Nullable String liveSpan;
    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    private @Nullable List<PowerpackWidgetHeatmapDefinitionRequest> requests;
    /**
     * @return Whether or not to show the legend on this widget.
     * 
     */
    private @Nullable Boolean showLegend;
    /**
     * @return The title of the widget.
     * 
     */
    private @Nullable String title;
    /**
     * @return The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
     * 
     */
    private @Nullable String titleAlign;
    /**
     * @return The size of the widget&#39;s title (defaults to 16).
     * 
     */
    private @Nullable String titleSize;
    /**
     * @return A nested block describing the Y-Axis Controls. The structure of this block is described below.
     * 
     */
    private @Nullable PowerpackWidgetHeatmapDefinitionYaxis yaxis;

    private PowerpackWidgetHeatmapDefinition() {}
    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    public List<PowerpackWidgetHeatmapDefinitionCustomLink> customLinks() {
        return this.customLinks == null ? List.of() : this.customLinks;
    }
    /**
     * @return The definition of the event to overlay on the graph. Multiple `event` blocks are allowed using the structure below.
     * 
     */
    public List<PowerpackWidgetHeatmapDefinitionEvent> events() {
        return this.events == null ? List.of() : this.events;
    }
    /**
     * @return The size of the legend displayed in the widget.
     * 
     */
    public Optional<String> legendSize() {
        return Optional.ofNullable(this.legendSize);
    }
    /**
     * @return The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    public Optional<String> liveSpan() {
        return Optional.ofNullable(this.liveSpan);
    }
    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    public List<PowerpackWidgetHeatmapDefinitionRequest> requests() {
        return this.requests == null ? List.of() : this.requests;
    }
    /**
     * @return Whether or not to show the legend on this widget.
     * 
     */
    public Optional<Boolean> showLegend() {
        return Optional.ofNullable(this.showLegend);
    }
    /**
     * @return The title of the widget.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    /**
     * @return The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
     * 
     */
    public Optional<String> titleAlign() {
        return Optional.ofNullable(this.titleAlign);
    }
    /**
     * @return The size of the widget&#39;s title (defaults to 16).
     * 
     */
    public Optional<String> titleSize() {
        return Optional.ofNullable(this.titleSize);
    }
    /**
     * @return A nested block describing the Y-Axis Controls. The structure of this block is described below.
     * 
     */
    public Optional<PowerpackWidgetHeatmapDefinitionYaxis> yaxis() {
        return Optional.ofNullable(this.yaxis);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetHeatmapDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<PowerpackWidgetHeatmapDefinitionCustomLink> customLinks;
        private @Nullable List<PowerpackWidgetHeatmapDefinitionEvent> events;
        private @Nullable String legendSize;
        private @Nullable String liveSpan;
        private @Nullable List<PowerpackWidgetHeatmapDefinitionRequest> requests;
        private @Nullable Boolean showLegend;
        private @Nullable String title;
        private @Nullable String titleAlign;
        private @Nullable String titleSize;
        private @Nullable PowerpackWidgetHeatmapDefinitionYaxis yaxis;
        public Builder() {}
        public Builder(PowerpackWidgetHeatmapDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customLinks = defaults.customLinks;
    	      this.events = defaults.events;
    	      this.legendSize = defaults.legendSize;
    	      this.liveSpan = defaults.liveSpan;
    	      this.requests = defaults.requests;
    	      this.showLegend = defaults.showLegend;
    	      this.title = defaults.title;
    	      this.titleAlign = defaults.titleAlign;
    	      this.titleSize = defaults.titleSize;
    	      this.yaxis = defaults.yaxis;
        }

        @CustomType.Setter
        public Builder customLinks(@Nullable List<PowerpackWidgetHeatmapDefinitionCustomLink> customLinks) {

            this.customLinks = customLinks;
            return this;
        }
        public Builder customLinks(PowerpackWidgetHeatmapDefinitionCustomLink... customLinks) {
            return customLinks(List.of(customLinks));
        }
        @CustomType.Setter
        public Builder events(@Nullable List<PowerpackWidgetHeatmapDefinitionEvent> events) {

            this.events = events;
            return this;
        }
        public Builder events(PowerpackWidgetHeatmapDefinitionEvent... events) {
            return events(List.of(events));
        }
        @CustomType.Setter
        public Builder legendSize(@Nullable String legendSize) {

            this.legendSize = legendSize;
            return this;
        }
        @CustomType.Setter
        public Builder liveSpan(@Nullable String liveSpan) {

            this.liveSpan = liveSpan;
            return this;
        }
        @CustomType.Setter
        public Builder requests(@Nullable List<PowerpackWidgetHeatmapDefinitionRequest> requests) {

            this.requests = requests;
            return this;
        }
        public Builder requests(PowerpackWidgetHeatmapDefinitionRequest... requests) {
            return requests(List.of(requests));
        }
        @CustomType.Setter
        public Builder showLegend(@Nullable Boolean showLegend) {

            this.showLegend = showLegend;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {

            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder titleAlign(@Nullable String titleAlign) {

            this.titleAlign = titleAlign;
            return this;
        }
        @CustomType.Setter
        public Builder titleSize(@Nullable String titleSize) {

            this.titleSize = titleSize;
            return this;
        }
        @CustomType.Setter
        public Builder yaxis(@Nullable PowerpackWidgetHeatmapDefinitionYaxis yaxis) {

            this.yaxis = yaxis;
            return this;
        }
        public PowerpackWidgetHeatmapDefinition build() {
            final var _resultValue = new PowerpackWidgetHeatmapDefinition();
            _resultValue.customLinks = customLinks;
            _resultValue.events = events;
            _resultValue.legendSize = legendSize;
            _resultValue.liveSpan = liveSpan;
            _resultValue.requests = requests;
            _resultValue.showLegend = showLegend;
            _resultValue.title = title;
            _resultValue.titleAlign = titleAlign;
            _resultValue.titleSize = titleSize;
            _resultValue.yaxis = yaxis;
            return _resultValue;
        }
    }
}
