// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetFreeTextDefinition {
    /**
     * @return The color of the text in the widget.
     * 
     */
    private @Nullable String color;
    /**
     * @return The size of the text in the widget.
     * 
     */
    private @Nullable String fontSize;
    /**
     * @return The text to display in the widget.
     * 
     */
    private String text;
    /**
     * @return The alignment of the text in the widget. Valid values are `center`, `left`, `right`.
     * 
     */
    private @Nullable String textAlign;

    private PowerpackWidgetFreeTextDefinition() {}
    /**
     * @return The color of the text in the widget.
     * 
     */
    public Optional<String> color() {
        return Optional.ofNullable(this.color);
    }
    /**
     * @return The size of the text in the widget.
     * 
     */
    public Optional<String> fontSize() {
        return Optional.ofNullable(this.fontSize);
    }
    /**
     * @return The text to display in the widget.
     * 
     */
    public String text() {
        return this.text;
    }
    /**
     * @return The alignment of the text in the widget. Valid values are `center`, `left`, `right`.
     * 
     */
    public Optional<String> textAlign() {
        return Optional.ofNullable(this.textAlign);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetFreeTextDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String color;
        private @Nullable String fontSize;
        private String text;
        private @Nullable String textAlign;
        public Builder() {}
        public Builder(PowerpackWidgetFreeTextDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.fontSize = defaults.fontSize;
    	      this.text = defaults.text;
    	      this.textAlign = defaults.textAlign;
        }

        @CustomType.Setter
        public Builder color(@Nullable String color) {

            this.color = color;
            return this;
        }
        @CustomType.Setter
        public Builder fontSize(@Nullable String fontSize) {

            this.fontSize = fontSize;
            return this;
        }
        @CustomType.Setter
        public Builder text(String text) {
            if (text == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetFreeTextDefinition", "text");
            }
            this.text = text;
            return this;
        }
        @CustomType.Setter
        public Builder textAlign(@Nullable String textAlign) {

            this.textAlign = textAlign;
            return this;
        }
        public PowerpackWidgetFreeTextDefinition build() {
            final var _resultValue = new PowerpackWidgetFreeTextDefinition();
            _resultValue.color = color;
            _resultValue.fontSize = fontSize;
            _resultValue.text = text;
            _resultValue.textAlign = textAlign;
            return _resultValue;
        }
    }
}
