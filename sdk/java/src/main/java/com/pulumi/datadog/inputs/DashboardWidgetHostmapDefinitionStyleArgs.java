// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetHostmapDefinitionStyleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetHostmapDefinitionStyleArgs Empty = new DashboardWidgetHostmapDefinitionStyleArgs();

    /**
     * The max value to use to color the map.
     * 
     */
    @Import(name="fillMax")
    private @Nullable Output<String> fillMax;

    /**
     * @return The max value to use to color the map.
     * 
     */
    public Optional<Output<String>> fillMax() {
        return Optional.ofNullable(this.fillMax);
    }

    /**
     * The min value to use to color the map.
     * 
     */
    @Import(name="fillMin")
    private @Nullable Output<String> fillMin;

    /**
     * @return The min value to use to color the map.
     * 
     */
    public Optional<Output<String>> fillMin() {
        return Optional.ofNullable(this.fillMin);
    }

    /**
     * A color palette to apply to the widget. The available options are available at: https://docs.datadoghq.com/dashboards/widgets/timeseries/#appearance.
     * 
     */
    @Import(name="palette")
    private @Nullable Output<String> palette;

    /**
     * @return A color palette to apply to the widget. The available options are available at: https://docs.datadoghq.com/dashboards/widgets/timeseries/#appearance.
     * 
     */
    public Optional<Output<String>> palette() {
        return Optional.ofNullable(this.palette);
    }

    /**
     * A Boolean indicating whether to flip the palette tones.
     * 
     */
    @Import(name="paletteFlip")
    private @Nullable Output<Boolean> paletteFlip;

    /**
     * @return A Boolean indicating whether to flip the palette tones.
     * 
     */
    public Optional<Output<Boolean>> paletteFlip() {
        return Optional.ofNullable(this.paletteFlip);
    }

    private DashboardWidgetHostmapDefinitionStyleArgs() {}

    private DashboardWidgetHostmapDefinitionStyleArgs(DashboardWidgetHostmapDefinitionStyleArgs $) {
        this.fillMax = $.fillMax;
        this.fillMin = $.fillMin;
        this.palette = $.palette;
        this.paletteFlip = $.paletteFlip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetHostmapDefinitionStyleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetHostmapDefinitionStyleArgs $;

        public Builder() {
            $ = new DashboardWidgetHostmapDefinitionStyleArgs();
        }

        public Builder(DashboardWidgetHostmapDefinitionStyleArgs defaults) {
            $ = new DashboardWidgetHostmapDefinitionStyleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fillMax The max value to use to color the map.
         * 
         * @return builder
         * 
         */
        public Builder fillMax(@Nullable Output<String> fillMax) {
            $.fillMax = fillMax;
            return this;
        }

        /**
         * @param fillMax The max value to use to color the map.
         * 
         * @return builder
         * 
         */
        public Builder fillMax(String fillMax) {
            return fillMax(Output.of(fillMax));
        }

        /**
         * @param fillMin The min value to use to color the map.
         * 
         * @return builder
         * 
         */
        public Builder fillMin(@Nullable Output<String> fillMin) {
            $.fillMin = fillMin;
            return this;
        }

        /**
         * @param fillMin The min value to use to color the map.
         * 
         * @return builder
         * 
         */
        public Builder fillMin(String fillMin) {
            return fillMin(Output.of(fillMin));
        }

        /**
         * @param palette A color palette to apply to the widget. The available options are available at: https://docs.datadoghq.com/dashboards/widgets/timeseries/#appearance.
         * 
         * @return builder
         * 
         */
        public Builder palette(@Nullable Output<String> palette) {
            $.palette = palette;
            return this;
        }

        /**
         * @param palette A color palette to apply to the widget. The available options are available at: https://docs.datadoghq.com/dashboards/widgets/timeseries/#appearance.
         * 
         * @return builder
         * 
         */
        public Builder palette(String palette) {
            return palette(Output.of(palette));
        }

        /**
         * @param paletteFlip A Boolean indicating whether to flip the palette tones.
         * 
         * @return builder
         * 
         */
        public Builder paletteFlip(@Nullable Output<Boolean> paletteFlip) {
            $.paletteFlip = paletteFlip;
            return this;
        }

        /**
         * @param paletteFlip A Boolean indicating whether to flip the palette tones.
         * 
         * @return builder
         * 
         */
        public Builder paletteFlip(Boolean paletteFlip) {
            return paletteFlip(Output.of(paletteFlip));
        }

        public DashboardWidgetHostmapDefinitionStyleArgs build() {
            return $;
        }
    }

}