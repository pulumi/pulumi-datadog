// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackLayout {
    /**
     * @return The height of the widget.
     * 
     */
    private @Nullable Integer height;
    /**
     * @return The width of the widget.
     * 
     */
    private @Nullable Integer width;
    /**
     * @return The position of the widget on the x (horizontal) axis. Should be greater than or equal to 0.
     * 
     */
    private @Nullable Integer x;
    /**
     * @return The position of the widget on the y (vertical) axis. Should be greater than or equal to 0.
     * 
     */
    private @Nullable Integer y;

    private PowerpackLayout() {}
    /**
     * @return The height of the widget.
     * 
     */
    public Optional<Integer> height() {
        return Optional.ofNullable(this.height);
    }
    /**
     * @return The width of the widget.
     * 
     */
    public Optional<Integer> width() {
        return Optional.ofNullable(this.width);
    }
    /**
     * @return The position of the widget on the x (horizontal) axis. Should be greater than or equal to 0.
     * 
     */
    public Optional<Integer> x() {
        return Optional.ofNullable(this.x);
    }
    /**
     * @return The position of the widget on the y (vertical) axis. Should be greater than or equal to 0.
     * 
     */
    public Optional<Integer> y() {
        return Optional.ofNullable(this.y);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackLayout defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer height;
        private @Nullable Integer width;
        private @Nullable Integer x;
        private @Nullable Integer y;
        public Builder() {}
        public Builder(PowerpackLayout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.width = defaults.width;
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        @CustomType.Setter
        public Builder height(@Nullable Integer height) {

            this.height = height;
            return this;
        }
        @CustomType.Setter
        public Builder width(@Nullable Integer width) {

            this.width = width;
            return this;
        }
        @CustomType.Setter
        public Builder x(@Nullable Integer x) {

            this.x = x;
            return this;
        }
        @CustomType.Setter
        public Builder y(@Nullable Integer y) {

            this.y = y;
            return this;
        }
        public PowerpackLayout build() {
            final var _resultValue = new PowerpackLayout();
            _resultValue.height = height;
            _resultValue.width = width;
            _resultValue.x = x;
            _resultValue.y = y;
            return _resultValue;
        }
    }
}