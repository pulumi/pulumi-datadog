// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetToplistDefinitionStyleDisplayArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetToplistDefinitionStyleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetToplistDefinitionStyleArgs Empty = new PowerpackWidgetToplistDefinitionStyleArgs();

    /**
     * The display mode for the widget.
     * 
     */
    @Import(name="displays")
    private @Nullable Output<List<PowerpackWidgetToplistDefinitionStyleDisplayArgs>> displays;

    /**
     * @return The display mode for the widget.
     * 
     */
    public Optional<Output<List<PowerpackWidgetToplistDefinitionStyleDisplayArgs>>> displays() {
        return Optional.ofNullable(this.displays);
    }

    /**
     * The color palette for the widget.
     * 
     */
    @Import(name="palette")
    private @Nullable Output<String> palette;

    /**
     * @return The color palette for the widget.
     * 
     */
    public Optional<Output<String>> palette() {
        return Optional.ofNullable(this.palette);
    }

    private PowerpackWidgetToplistDefinitionStyleArgs() {}

    private PowerpackWidgetToplistDefinitionStyleArgs(PowerpackWidgetToplistDefinitionStyleArgs $) {
        this.displays = $.displays;
        this.palette = $.palette;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetToplistDefinitionStyleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetToplistDefinitionStyleArgs $;

        public Builder() {
            $ = new PowerpackWidgetToplistDefinitionStyleArgs();
        }

        public Builder(PowerpackWidgetToplistDefinitionStyleArgs defaults) {
            $ = new PowerpackWidgetToplistDefinitionStyleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displays The display mode for the widget.
         * 
         * @return builder
         * 
         */
        public Builder displays(@Nullable Output<List<PowerpackWidgetToplistDefinitionStyleDisplayArgs>> displays) {
            $.displays = displays;
            return this;
        }

        /**
         * @param displays The display mode for the widget.
         * 
         * @return builder
         * 
         */
        public Builder displays(List<PowerpackWidgetToplistDefinitionStyleDisplayArgs> displays) {
            return displays(Output.of(displays));
        }

        /**
         * @param displays The display mode for the widget.
         * 
         * @return builder
         * 
         */
        public Builder displays(PowerpackWidgetToplistDefinitionStyleDisplayArgs... displays) {
            return displays(List.of(displays));
        }

        /**
         * @param palette The color palette for the widget.
         * 
         * @return builder
         * 
         */
        public Builder palette(@Nullable Output<String> palette) {
            $.palette = palette;
            return this;
        }

        /**
         * @param palette The color palette for the widget.
         * 
         * @return builder
         * 
         */
        public Builder palette(String palette) {
            return palette(Output.of(palette));
        }

        public PowerpackWidgetToplistDefinitionStyleArgs build() {
            return $;
        }
    }

}