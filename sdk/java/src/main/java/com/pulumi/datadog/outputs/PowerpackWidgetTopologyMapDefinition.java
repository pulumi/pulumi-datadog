// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetTopologyMapDefinitionCustomLink;
import com.pulumi.datadog.outputs.PowerpackWidgetTopologyMapDefinitionRequest;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetTopologyMapDefinition {
    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<PowerpackWidgetTopologyMapDefinitionCustomLink> customLinks;
    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (`query` and `request_type` are required within the request).
     * 
     */
    private @Nullable List<PowerpackWidgetTopologyMapDefinitionRequest> requests;
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

    private PowerpackWidgetTopologyMapDefinition() {}
    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    public List<PowerpackWidgetTopologyMapDefinitionCustomLink> customLinks() {
        return this.customLinks == null ? List.of() : this.customLinks;
    }
    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (`query` and `request_type` are required within the request).
     * 
     */
    public List<PowerpackWidgetTopologyMapDefinitionRequest> requests() {
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

    public static Builder builder(PowerpackWidgetTopologyMapDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<PowerpackWidgetTopologyMapDefinitionCustomLink> customLinks;
        private @Nullable List<PowerpackWidgetTopologyMapDefinitionRequest> requests;
        private @Nullable String title;
        private @Nullable String titleAlign;
        private @Nullable String titleSize;
        public Builder() {}
        public Builder(PowerpackWidgetTopologyMapDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customLinks = defaults.customLinks;
    	      this.requests = defaults.requests;
    	      this.title = defaults.title;
    	      this.titleAlign = defaults.titleAlign;
    	      this.titleSize = defaults.titleSize;
        }

        @CustomType.Setter
        public Builder customLinks(@Nullable List<PowerpackWidgetTopologyMapDefinitionCustomLink> customLinks) {

            this.customLinks = customLinks;
            return this;
        }
        public Builder customLinks(PowerpackWidgetTopologyMapDefinitionCustomLink... customLinks) {
            return customLinks(List.of(customLinks));
        }
        @CustomType.Setter
        public Builder requests(@Nullable List<PowerpackWidgetTopologyMapDefinitionRequest> requests) {

            this.requests = requests;
            return this;
        }
        public Builder requests(PowerpackWidgetTopologyMapDefinitionRequest... requests) {
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
        public PowerpackWidgetTopologyMapDefinition build() {
            final var _resultValue = new PowerpackWidgetTopologyMapDefinition();
            _resultValue.customLinks = customLinks;
            _resultValue.requests = requests;
            _resultValue.title = title;
            _resultValue.titleAlign = titleAlign;
            _resultValue.titleSize = titleSize;
            return _resultValue;
        }
    }
}