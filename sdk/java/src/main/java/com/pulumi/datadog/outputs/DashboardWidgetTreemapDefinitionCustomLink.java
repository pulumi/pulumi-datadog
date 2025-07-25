// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetTreemapDefinitionCustomLink {
    /**
     * @return The flag for toggling context menu link visibility.
     * 
     */
    private @Nullable Boolean isHidden;
    /**
     * @return The label for the custom link URL.
     * 
     */
    private @Nullable String label;
    /**
     * @return The URL of the custom link.
     * 
     */
    private @Nullable String link;
    /**
     * @return The label ID that refers to a context menu link item. When `override_label` is provided, the client request omits the label field.
     * 
     */
    private @Nullable String overrideLabel;

    private DashboardWidgetTreemapDefinitionCustomLink() {}
    /**
     * @return The flag for toggling context menu link visibility.
     * 
     */
    public Optional<Boolean> isHidden() {
        return Optional.ofNullable(this.isHidden);
    }
    /**
     * @return The label for the custom link URL.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return The URL of the custom link.
     * 
     */
    public Optional<String> link() {
        return Optional.ofNullable(this.link);
    }
    /**
     * @return The label ID that refers to a context menu link item. When `override_label` is provided, the client request omits the label field.
     * 
     */
    public Optional<String> overrideLabel() {
        return Optional.ofNullable(this.overrideLabel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetTreemapDefinitionCustomLink defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isHidden;
        private @Nullable String label;
        private @Nullable String link;
        private @Nullable String overrideLabel;
        public Builder() {}
        public Builder(DashboardWidgetTreemapDefinitionCustomLink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isHidden = defaults.isHidden;
    	      this.label = defaults.label;
    	      this.link = defaults.link;
    	      this.overrideLabel = defaults.overrideLabel;
        }

        @CustomType.Setter
        public Builder isHidden(@Nullable Boolean isHidden) {

            this.isHidden = isHidden;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {

            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder link(@Nullable String link) {

            this.link = link;
            return this;
        }
        @CustomType.Setter
        public Builder overrideLabel(@Nullable String overrideLabel) {

            this.overrideLabel = overrideLabel;
            return this;
        }
        public DashboardWidgetTreemapDefinitionCustomLink build() {
            final var _resultValue = new DashboardWidgetTreemapDefinitionCustomLink();
            _resultValue.isHidden = isHidden;
            _resultValue.label = label;
            _resultValue.link = link;
            _resultValue.overrideLabel = overrideLabel;
            return _resultValue;
        }
    }
}
