// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatMatch;
import com.pulumi.datadog.outputs.DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatReplace;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormat {
    /**
     * @return The custom color palette to apply to the background.
     * 
     */
    private @Nullable String customBgColor;
    /**
     * @return The custom color palette to apply to the foreground text.
     * 
     */
    private @Nullable String customFgColor;
    /**
     * @return Match rule for the table widget text format.
     * 
     */
    private DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatMatch match;
    /**
     * @return The color palette to apply. Valid values are `white_on_red`, `white_on_yellow`, `white_on_green`, `black_on_light_red`, `black_on_light_yellow`, `black_on_light_green`, `red_on_white`, `yellow_on_white`, `green_on_white`, `custom_bg`, `custom_text`.
     * 
     */
    private @Nullable String palette;
    /**
     * @return Match rule for the table widget text format.
     * 
     */
    private @Nullable DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatReplace replace;

    private DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormat() {}
    /**
     * @return The custom color palette to apply to the background.
     * 
     */
    public Optional<String> customBgColor() {
        return Optional.ofNullable(this.customBgColor);
    }
    /**
     * @return The custom color palette to apply to the foreground text.
     * 
     */
    public Optional<String> customFgColor() {
        return Optional.ofNullable(this.customFgColor);
    }
    /**
     * @return Match rule for the table widget text format.
     * 
     */
    public DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatMatch match() {
        return this.match;
    }
    /**
     * @return The color palette to apply. Valid values are `white_on_red`, `white_on_yellow`, `white_on_green`, `black_on_light_red`, `black_on_light_yellow`, `black_on_light_green`, `red_on_white`, `yellow_on_white`, `green_on_white`, `custom_bg`, `custom_text`.
     * 
     */
    public Optional<String> palette() {
        return Optional.ofNullable(this.palette);
    }
    /**
     * @return Match rule for the table widget text format.
     * 
     */
    public Optional<DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatReplace> replace() {
        return Optional.ofNullable(this.replace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customBgColor;
        private @Nullable String customFgColor;
        private DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatMatch match;
        private @Nullable String palette;
        private @Nullable DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatReplace replace;
        public Builder() {}
        public Builder(DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customBgColor = defaults.customBgColor;
    	      this.customFgColor = defaults.customFgColor;
    	      this.match = defaults.match;
    	      this.palette = defaults.palette;
    	      this.replace = defaults.replace;
        }

        @CustomType.Setter
        public Builder customBgColor(@Nullable String customBgColor) {

            this.customBgColor = customBgColor;
            return this;
        }
        @CustomType.Setter
        public Builder customFgColor(@Nullable String customFgColor) {

            this.customFgColor = customFgColor;
            return this;
        }
        @CustomType.Setter
        public Builder match(DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatMatch match) {
            if (match == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormat", "match");
            }
            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder palette(@Nullable String palette) {

            this.palette = palette;
            return this;
        }
        @CustomType.Setter
        public Builder replace(@Nullable DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatReplace replace) {

            this.replace = replace;
            return this;
        }
        public DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormat build() {
            final var _resultValue = new DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormat();
            _resultValue.customBgColor = customBgColor;
            _resultValue.customFgColor = customFgColor;
            _resultValue.match = match;
            _resultValue.palette = palette;
            _resultValue.replace = replace;
            return _resultValue;
        }
    }
}