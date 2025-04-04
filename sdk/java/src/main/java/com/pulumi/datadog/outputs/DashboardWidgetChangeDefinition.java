// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetChangeDefinitionCustomLink;
import com.pulumi.datadog.outputs.DashboardWidgetChangeDefinitionRequest;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetChangeDefinition {
    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<DashboardWidgetChangeDefinitionCustomLink> customLinks;
    /**
     * @return The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    private @Nullable String liveSpan;
    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    private @Nullable List<DashboardWidgetChangeDefinitionRequest> requests;
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

    private DashboardWidgetChangeDefinition() {}
    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    public List<DashboardWidgetChangeDefinitionCustomLink> customLinks() {
        return this.customLinks == null ? List.of() : this.customLinks;
    }
    /**
     * @return The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    public Optional<String> liveSpan() {
        return Optional.ofNullable(this.liveSpan);
    }
    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    public List<DashboardWidgetChangeDefinitionRequest> requests() {
        return this.requests == null ? List.of() : this.requests;
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetChangeDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DashboardWidgetChangeDefinitionCustomLink> customLinks;
        private @Nullable String liveSpan;
        private @Nullable List<DashboardWidgetChangeDefinitionRequest> requests;
        private @Nullable String title;
        private @Nullable String titleAlign;
        private @Nullable String titleSize;
        public Builder() {}
        public Builder(DashboardWidgetChangeDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customLinks = defaults.customLinks;
    	      this.liveSpan = defaults.liveSpan;
    	      this.requests = defaults.requests;
    	      this.title = defaults.title;
    	      this.titleAlign = defaults.titleAlign;
    	      this.titleSize = defaults.titleSize;
        }

        @CustomType.Setter
        public Builder customLinks(@Nullable List<DashboardWidgetChangeDefinitionCustomLink> customLinks) {

            this.customLinks = customLinks;
            return this;
        }
        public Builder customLinks(DashboardWidgetChangeDefinitionCustomLink... customLinks) {
            return customLinks(List.of(customLinks));
        }
        @CustomType.Setter
        public Builder liveSpan(@Nullable String liveSpan) {

            this.liveSpan = liveSpan;
            return this;
        }
        @CustomType.Setter
        public Builder requests(@Nullable List<DashboardWidgetChangeDefinitionRequest> requests) {

            this.requests = requests;
            return this;
        }
        public Builder requests(DashboardWidgetChangeDefinitionRequest... requests) {
            return requests(List.of(requests));
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
        public DashboardWidgetChangeDefinition build() {
            final var _resultValue = new DashboardWidgetChangeDefinition();
            _resultValue.customLinks = customLinks;
            _resultValue.liveSpan = liveSpan;
            _resultValue.requests = requests;
            _resultValue.title = title;
            _resultValue.titleAlign = titleAlign;
            _resultValue.titleSize = titleSize;
            return _resultValue;
        }
    }
}
