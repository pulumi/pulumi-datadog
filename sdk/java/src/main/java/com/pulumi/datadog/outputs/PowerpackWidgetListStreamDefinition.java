// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetListStreamDefinitionRequest;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetListStreamDefinition {
    /**
     * @return Nested block describing the requests to use when displaying the widget. Multiple `request` blocks are allowed with the structure below.
     * 
     */
    private List<PowerpackWidgetListStreamDefinitionRequest> requests;
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
     * @return The size of the widget&#39;s title. Default is 16.
     * 
     */
    private @Nullable String titleSize;

    private PowerpackWidgetListStreamDefinition() {}
    /**
     * @return Nested block describing the requests to use when displaying the widget. Multiple `request` blocks are allowed with the structure below.
     * 
     */
    public List<PowerpackWidgetListStreamDefinitionRequest> requests() {
        return this.requests;
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
     * @return The size of the widget&#39;s title. Default is 16.
     * 
     */
    public Optional<String> titleSize() {
        return Optional.ofNullable(this.titleSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetListStreamDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<PowerpackWidgetListStreamDefinitionRequest> requests;
        private @Nullable String title;
        private @Nullable String titleAlign;
        private @Nullable String titleSize;
        public Builder() {}
        public Builder(PowerpackWidgetListStreamDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requests = defaults.requests;
    	      this.title = defaults.title;
    	      this.titleAlign = defaults.titleAlign;
    	      this.titleSize = defaults.titleSize;
        }

        @CustomType.Setter
        public Builder requests(List<PowerpackWidgetListStreamDefinitionRequest> requests) {
            if (requests == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetListStreamDefinition", "requests");
            }
            this.requests = requests;
            return this;
        }
        public Builder requests(PowerpackWidgetListStreamDefinitionRequest... requests) {
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
        public PowerpackWidgetListStreamDefinition build() {
            final var _resultValue = new PowerpackWidgetListStreamDefinition();
            _resultValue.requests = requests;
            _resultValue.title = title;
            _resultValue.titleAlign = titleAlign;
            _resultValue.titleSize = titleSize;
            return _resultValue;
        }
    }
}