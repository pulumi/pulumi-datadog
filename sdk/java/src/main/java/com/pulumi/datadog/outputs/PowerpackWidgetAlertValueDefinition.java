// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetAlertValueDefinition {
    /**
     * @return The ID of the monitor used by the widget.
     * 
     */
    private String alertId;
    /**
     * @return The precision to use when displaying the value. Use `*` for maximum precision.
     * 
     */
    private @Nullable Integer precision;
    /**
     * @return The alignment of the text in the widget. Valid values are `center`, `left`, `right`.
     * 
     */
    private @Nullable String textAlign;
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
     * @return The unit for the value displayed in the widget.
     * 
     */
    private @Nullable String unit;

    private PowerpackWidgetAlertValueDefinition() {}
    /**
     * @return The ID of the monitor used by the widget.
     * 
     */
    public String alertId() {
        return this.alertId;
    }
    /**
     * @return The precision to use when displaying the value. Use `*` for maximum precision.
     * 
     */
    public Optional<Integer> precision() {
        return Optional.ofNullable(this.precision);
    }
    /**
     * @return The alignment of the text in the widget. Valid values are `center`, `left`, `right`.
     * 
     */
    public Optional<String> textAlign() {
        return Optional.ofNullable(this.textAlign);
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
     * @return The unit for the value displayed in the widget.
     * 
     */
    public Optional<String> unit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetAlertValueDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alertId;
        private @Nullable Integer precision;
        private @Nullable String textAlign;
        private @Nullable String title;
        private @Nullable String titleAlign;
        private @Nullable String titleSize;
        private @Nullable String unit;
        public Builder() {}
        public Builder(PowerpackWidgetAlertValueDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertId = defaults.alertId;
    	      this.precision = defaults.precision;
    	      this.textAlign = defaults.textAlign;
    	      this.title = defaults.title;
    	      this.titleAlign = defaults.titleAlign;
    	      this.titleSize = defaults.titleSize;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder alertId(String alertId) {
            if (alertId == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetAlertValueDefinition", "alertId");
            }
            this.alertId = alertId;
            return this;
        }
        @CustomType.Setter
        public Builder precision(@Nullable Integer precision) {

            this.precision = precision;
            return this;
        }
        @CustomType.Setter
        public Builder textAlign(@Nullable String textAlign) {

            this.textAlign = textAlign;
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
        public Builder unit(@Nullable String unit) {

            this.unit = unit;
            return this;
        }
        public PowerpackWidgetAlertValueDefinition build() {
            final var _resultValue = new PowerpackWidgetAlertValueDefinition();
            _resultValue.alertId = alertId;
            _resultValue.precision = precision;
            _resultValue.textAlign = textAlign;
            _resultValue.title = title;
            _resultValue.titleAlign = titleAlign;
            _resultValue.titleSize = titleSize;
            _resultValue.unit = unit;
            return _resultValue;
        }
    }
}