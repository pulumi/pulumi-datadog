// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetManageStatusDefinition {
    /**
     * @return Whether to colorize text or background. Valid values are `background`, `text`.
     * 
     */
    private @Nullable String colorPreference;
    /**
     * @return The display setting to use. Valid values are `counts`, `countsAndList`, `list`.
     * 
     */
    private @Nullable String displayFormat;
    /**
     * @return A Boolean indicating whether to hide empty categories.
     * 
     */
    private @Nullable Boolean hideZeroCounts;
    /**
     * @return The query to use in the widget.
     * 
     */
    private String query;
    /**
     * @return A Boolean indicating whether to show when monitors/groups last triggered.
     * 
     */
    private @Nullable Boolean showLastTriggered;
    /**
     * @return Whether to show the priorities column.
     * 
     */
    private @Nullable Boolean showPriority;
    /**
     * @return The method to sort the monitors. Valid values are `name`, `group`, `status`, `tags`, `triggered`, `group,asc`, `group,desc`, `name,asc`, `name,desc`, `status,asc`, `status,desc`, `tags,asc`, `tags,desc`, `triggered,asc`, `triggered,desc`, `priority,asc`, `priority,desc`.
     * 
     */
    private @Nullable String sort;
    /**
     * @return The summary type to use. Valid values are `monitors`, `groups`, `combined`.
     * 
     */
    private @Nullable String summaryType;
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

    private PowerpackWidgetManageStatusDefinition() {}
    /**
     * @return Whether to colorize text or background. Valid values are `background`, `text`.
     * 
     */
    public Optional<String> colorPreference() {
        return Optional.ofNullable(this.colorPreference);
    }
    /**
     * @return The display setting to use. Valid values are `counts`, `countsAndList`, `list`.
     * 
     */
    public Optional<String> displayFormat() {
        return Optional.ofNullable(this.displayFormat);
    }
    /**
     * @return A Boolean indicating whether to hide empty categories.
     * 
     */
    public Optional<Boolean> hideZeroCounts() {
        return Optional.ofNullable(this.hideZeroCounts);
    }
    /**
     * @return The query to use in the widget.
     * 
     */
    public String query() {
        return this.query;
    }
    /**
     * @return A Boolean indicating whether to show when monitors/groups last triggered.
     * 
     */
    public Optional<Boolean> showLastTriggered() {
        return Optional.ofNullable(this.showLastTriggered);
    }
    /**
     * @return Whether to show the priorities column.
     * 
     */
    public Optional<Boolean> showPriority() {
        return Optional.ofNullable(this.showPriority);
    }
    /**
     * @return The method to sort the monitors. Valid values are `name`, `group`, `status`, `tags`, `triggered`, `group,asc`, `group,desc`, `name,asc`, `name,desc`, `status,asc`, `status,desc`, `tags,asc`, `tags,desc`, `triggered,asc`, `triggered,desc`, `priority,asc`, `priority,desc`.
     * 
     */
    public Optional<String> sort() {
        return Optional.ofNullable(this.sort);
    }
    /**
     * @return The summary type to use. Valid values are `monitors`, `groups`, `combined`.
     * 
     */
    public Optional<String> summaryType() {
        return Optional.ofNullable(this.summaryType);
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

    public static Builder builder(PowerpackWidgetManageStatusDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String colorPreference;
        private @Nullable String displayFormat;
        private @Nullable Boolean hideZeroCounts;
        private String query;
        private @Nullable Boolean showLastTriggered;
        private @Nullable Boolean showPriority;
        private @Nullable String sort;
        private @Nullable String summaryType;
        private @Nullable String title;
        private @Nullable String titleAlign;
        private @Nullable String titleSize;
        public Builder() {}
        public Builder(PowerpackWidgetManageStatusDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colorPreference = defaults.colorPreference;
    	      this.displayFormat = defaults.displayFormat;
    	      this.hideZeroCounts = defaults.hideZeroCounts;
    	      this.query = defaults.query;
    	      this.showLastTriggered = defaults.showLastTriggered;
    	      this.showPriority = defaults.showPriority;
    	      this.sort = defaults.sort;
    	      this.summaryType = defaults.summaryType;
    	      this.title = defaults.title;
    	      this.titleAlign = defaults.titleAlign;
    	      this.titleSize = defaults.titleSize;
        }

        @CustomType.Setter
        public Builder colorPreference(@Nullable String colorPreference) {

            this.colorPreference = colorPreference;
            return this;
        }
        @CustomType.Setter
        public Builder displayFormat(@Nullable String displayFormat) {

            this.displayFormat = displayFormat;
            return this;
        }
        @CustomType.Setter
        public Builder hideZeroCounts(@Nullable Boolean hideZeroCounts) {

            this.hideZeroCounts = hideZeroCounts;
            return this;
        }
        @CustomType.Setter
        public Builder query(String query) {
            if (query == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetManageStatusDefinition", "query");
            }
            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder showLastTriggered(@Nullable Boolean showLastTriggered) {

            this.showLastTriggered = showLastTriggered;
            return this;
        }
        @CustomType.Setter
        public Builder showPriority(@Nullable Boolean showPriority) {

            this.showPriority = showPriority;
            return this;
        }
        @CustomType.Setter
        public Builder sort(@Nullable String sort) {

            this.sort = sort;
            return this;
        }
        @CustomType.Setter
        public Builder summaryType(@Nullable String summaryType) {

            this.summaryType = summaryType;
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
        public PowerpackWidgetManageStatusDefinition build() {
            final var _resultValue = new PowerpackWidgetManageStatusDefinition();
            _resultValue.colorPreference = colorPreference;
            _resultValue.displayFormat = displayFormat;
            _resultValue.hideZeroCounts = hideZeroCounts;
            _resultValue.query = query;
            _resultValue.showLastTriggered = showLastTriggered;
            _resultValue.showPriority = showPriority;
            _resultValue.sort = sort;
            _resultValue.summaryType = summaryType;
            _resultValue.title = title;
            _resultValue.titleAlign = titleAlign;
            _resultValue.titleSize = titleSize;
            return _resultValue;
        }
    }
}
