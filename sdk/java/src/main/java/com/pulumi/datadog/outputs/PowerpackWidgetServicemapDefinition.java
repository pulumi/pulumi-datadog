// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetServicemapDefinitionCustomLink;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetServicemapDefinition {
    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<PowerpackWidgetServicemapDefinitionCustomLink> customLinks;
    /**
     * @return Your environment and primary tag (or `*` if enabled for your account).
     * 
     */
    private List<String> filters;
    /**
     * @return The ID of the service to map.
     * 
     */
    private String service;
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

    private PowerpackWidgetServicemapDefinition() {}
    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    public List<PowerpackWidgetServicemapDefinitionCustomLink> customLinks() {
        return this.customLinks == null ? List.of() : this.customLinks;
    }
    /**
     * @return Your environment and primary tag (or `*` if enabled for your account).
     * 
     */
    public List<String> filters() {
        return this.filters;
    }
    /**
     * @return The ID of the service to map.
     * 
     */
    public String service() {
        return this.service;
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

    public static Builder builder(PowerpackWidgetServicemapDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<PowerpackWidgetServicemapDefinitionCustomLink> customLinks;
        private List<String> filters;
        private String service;
        private @Nullable String title;
        private @Nullable String titleAlign;
        private @Nullable String titleSize;
        public Builder() {}
        public Builder(PowerpackWidgetServicemapDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customLinks = defaults.customLinks;
    	      this.filters = defaults.filters;
    	      this.service = defaults.service;
    	      this.title = defaults.title;
    	      this.titleAlign = defaults.titleAlign;
    	      this.titleSize = defaults.titleSize;
        }

        @CustomType.Setter
        public Builder customLinks(@Nullable List<PowerpackWidgetServicemapDefinitionCustomLink> customLinks) {

            this.customLinks = customLinks;
            return this;
        }
        public Builder customLinks(PowerpackWidgetServicemapDefinitionCustomLink... customLinks) {
            return customLinks(List.of(customLinks));
        }
        @CustomType.Setter
        public Builder filters(List<String> filters) {
            if (filters == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetServicemapDefinition", "filters");
            }
            this.filters = filters;
            return this;
        }
        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder service(String service) {
            if (service == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetServicemapDefinition", "service");
            }
            this.service = service;
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
        public PowerpackWidgetServicemapDefinition build() {
            final var _resultValue = new PowerpackWidgetServicemapDefinition();
            _resultValue.customLinks = customLinks;
            _resultValue.filters = filters;
            _resultValue.service = service;
            _resultValue.title = title;
            _resultValue.titleAlign = titleAlign;
            _resultValue.titleSize = titleSize;
            return _resultValue;
        }
    }
}