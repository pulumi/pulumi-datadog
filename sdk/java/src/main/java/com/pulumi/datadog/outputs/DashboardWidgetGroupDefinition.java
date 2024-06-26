// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidget;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinition {
    /**
     * @return The background color of the group title, options: `vivid_blue`, `vivid_purple`, `vivid_pink`, `vivid_orange`, `vivid_yellow`, `vivid_green`, `blue`, `purple`, `pink`, `orange`, `yellow`, `green`, `gray` or `white`
     * 
     */
    private @Nullable String backgroundColor;
    /**
     * @return The image URL to display as a banner for the group.
     * 
     */
    private @Nullable String bannerImg;
    /**
     * @return The layout type of the group. Valid values are `ordered`.
     * 
     */
    private String layoutType;
    /**
     * @return Whether to show the title or not. Defaults to `true`.
     * 
     */
    private @Nullable Boolean showTitle;
    /**
     * @return The title of the group.
     * 
     */
    private @Nullable String title;
    /**
     * @return The list of widgets in this group.
     * 
     */
    private @Nullable List<DashboardWidgetGroupDefinitionWidget> widgets;

    private DashboardWidgetGroupDefinition() {}
    /**
     * @return The background color of the group title, options: `vivid_blue`, `vivid_purple`, `vivid_pink`, `vivid_orange`, `vivid_yellow`, `vivid_green`, `blue`, `purple`, `pink`, `orange`, `yellow`, `green`, `gray` or `white`
     * 
     */
    public Optional<String> backgroundColor() {
        return Optional.ofNullable(this.backgroundColor);
    }
    /**
     * @return The image URL to display as a banner for the group.
     * 
     */
    public Optional<String> bannerImg() {
        return Optional.ofNullable(this.bannerImg);
    }
    /**
     * @return The layout type of the group. Valid values are `ordered`.
     * 
     */
    public String layoutType() {
        return this.layoutType;
    }
    /**
     * @return Whether to show the title or not. Defaults to `true`.
     * 
     */
    public Optional<Boolean> showTitle() {
        return Optional.ofNullable(this.showTitle);
    }
    /**
     * @return The title of the group.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    /**
     * @return The list of widgets in this group.
     * 
     */
    public List<DashboardWidgetGroupDefinitionWidget> widgets() {
        return this.widgets == null ? List.of() : this.widgets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String backgroundColor;
        private @Nullable String bannerImg;
        private String layoutType;
        private @Nullable Boolean showTitle;
        private @Nullable String title;
        private @Nullable List<DashboardWidgetGroupDefinitionWidget> widgets;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backgroundColor = defaults.backgroundColor;
    	      this.bannerImg = defaults.bannerImg;
    	      this.layoutType = defaults.layoutType;
    	      this.showTitle = defaults.showTitle;
    	      this.title = defaults.title;
    	      this.widgets = defaults.widgets;
        }

        @CustomType.Setter
        public Builder backgroundColor(@Nullable String backgroundColor) {

            this.backgroundColor = backgroundColor;
            return this;
        }
        @CustomType.Setter
        public Builder bannerImg(@Nullable String bannerImg) {

            this.bannerImg = bannerImg;
            return this;
        }
        @CustomType.Setter
        public Builder layoutType(String layoutType) {
            if (layoutType == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinition", "layoutType");
            }
            this.layoutType = layoutType;
            return this;
        }
        @CustomType.Setter
        public Builder showTitle(@Nullable Boolean showTitle) {

            this.showTitle = showTitle;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {

            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder widgets(@Nullable List<DashboardWidgetGroupDefinitionWidget> widgets) {

            this.widgets = widgets;
            return this;
        }
        public Builder widgets(DashboardWidgetGroupDefinitionWidget... widgets) {
            return widgets(List.of(widgets));
        }
        public DashboardWidgetGroupDefinition build() {
            final var _resultValue = new DashboardWidgetGroupDefinition();
            _resultValue.backgroundColor = backgroundColor;
            _resultValue.bannerImg = bannerImg;
            _resultValue.layoutType = layoutType;
            _resultValue.showTitle = showTitle;
            _resultValue.title = title;
            _resultValue.widgets = widgets;
            return _resultValue;
        }
    }
}
