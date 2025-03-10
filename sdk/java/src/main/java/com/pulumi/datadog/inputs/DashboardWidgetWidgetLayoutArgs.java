// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetWidgetLayoutArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetWidgetLayoutArgs Empty = new DashboardWidgetWidgetLayoutArgs();

    /**
     * The height of the widget.
     * 
     */
    @Import(name="height", required=true)
    private Output<Integer> height;

    /**
     * @return The height of the widget.
     * 
     */
    public Output<Integer> height() {
        return this.height;
    }

    /**
     * Whether the widget should be the first one on the second column in high density or not. Only one widget in the dashboard should have this property set to `true`.
     * 
     */
    @Import(name="isColumnBreak")
    private @Nullable Output<Boolean> isColumnBreak;

    /**
     * @return Whether the widget should be the first one on the second column in high density or not. Only one widget in the dashboard should have this property set to `true`.
     * 
     */
    public Optional<Output<Boolean>> isColumnBreak() {
        return Optional.ofNullable(this.isColumnBreak);
    }

    /**
     * The width of the widget.
     * 
     */
    @Import(name="width", required=true)
    private Output<Integer> width;

    /**
     * @return The width of the widget.
     * 
     */
    public Output<Integer> width() {
        return this.width;
    }

    /**
     * The position of the widget on the x (horizontal) axis. Must be greater than or equal to 0.
     * 
     */
    @Import(name="x", required=true)
    private Output<Integer> x;

    /**
     * @return The position of the widget on the x (horizontal) axis. Must be greater than or equal to 0.
     * 
     */
    public Output<Integer> x() {
        return this.x;
    }

    /**
     * The position of the widget on the y (vertical) axis. Must be greater than or equal to 0.
     * 
     */
    @Import(name="y", required=true)
    private Output<Integer> y;

    /**
     * @return The position of the widget on the y (vertical) axis. Must be greater than or equal to 0.
     * 
     */
    public Output<Integer> y() {
        return this.y;
    }

    private DashboardWidgetWidgetLayoutArgs() {}

    private DashboardWidgetWidgetLayoutArgs(DashboardWidgetWidgetLayoutArgs $) {
        this.height = $.height;
        this.isColumnBreak = $.isColumnBreak;
        this.width = $.width;
        this.x = $.x;
        this.y = $.y;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetWidgetLayoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetWidgetLayoutArgs $;

        public Builder() {
            $ = new DashboardWidgetWidgetLayoutArgs();
        }

        public Builder(DashboardWidgetWidgetLayoutArgs defaults) {
            $ = new DashboardWidgetWidgetLayoutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param height The height of the widget.
         * 
         * @return builder
         * 
         */
        public Builder height(Output<Integer> height) {
            $.height = height;
            return this;
        }

        /**
         * @param height The height of the widget.
         * 
         * @return builder
         * 
         */
        public Builder height(Integer height) {
            return height(Output.of(height));
        }

        /**
         * @param isColumnBreak Whether the widget should be the first one on the second column in high density or not. Only one widget in the dashboard should have this property set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder isColumnBreak(@Nullable Output<Boolean> isColumnBreak) {
            $.isColumnBreak = isColumnBreak;
            return this;
        }

        /**
         * @param isColumnBreak Whether the widget should be the first one on the second column in high density or not. Only one widget in the dashboard should have this property set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder isColumnBreak(Boolean isColumnBreak) {
            return isColumnBreak(Output.of(isColumnBreak));
        }

        /**
         * @param width The width of the widget.
         * 
         * @return builder
         * 
         */
        public Builder width(Output<Integer> width) {
            $.width = width;
            return this;
        }

        /**
         * @param width The width of the widget.
         * 
         * @return builder
         * 
         */
        public Builder width(Integer width) {
            return width(Output.of(width));
        }

        /**
         * @param x The position of the widget on the x (horizontal) axis. Must be greater than or equal to 0.
         * 
         * @return builder
         * 
         */
        public Builder x(Output<Integer> x) {
            $.x = x;
            return this;
        }

        /**
         * @param x The position of the widget on the x (horizontal) axis. Must be greater than or equal to 0.
         * 
         * @return builder
         * 
         */
        public Builder x(Integer x) {
            return x(Output.of(x));
        }

        /**
         * @param y The position of the widget on the y (vertical) axis. Must be greater than or equal to 0.
         * 
         * @return builder
         * 
         */
        public Builder y(Output<Integer> y) {
            $.y = y;
            return this;
        }

        /**
         * @param y The position of the widget on the y (vertical) axis. Must be greater than or equal to 0.
         * 
         * @return builder
         * 
         */
        public Builder y(Integer y) {
            return y(Output.of(y));
        }

        public DashboardWidgetWidgetLayoutArgs build() {
            if ($.height == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetWidgetLayoutArgs", "height");
            }
            if ($.width == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetWidgetLayoutArgs", "width");
            }
            if ($.x == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetWidgetLayoutArgs", "x");
            }
            if ($.y == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetWidgetLayoutArgs", "y");
            }
            return $;
        }
    }

}
