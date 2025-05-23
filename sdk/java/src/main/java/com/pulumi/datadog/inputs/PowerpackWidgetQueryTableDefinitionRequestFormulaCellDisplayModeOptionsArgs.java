// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs Empty = new PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs();

    /**
     * The type of trend line to display. Valid values are `area`, `line`, `bars`.
     * 
     */
    @Import(name="trendType")
    private @Nullable Output<String> trendType;

    /**
     * @return The type of trend line to display. Valid values are `area`, `line`, `bars`.
     * 
     */
    public Optional<Output<String>> trendType() {
        return Optional.ofNullable(this.trendType);
    }

    /**
     * The scale of the y-axis. Valid values are `shared`, `independent`.
     * 
     */
    @Import(name="yScale")
    private @Nullable Output<String> yScale;

    /**
     * @return The scale of the y-axis. Valid values are `shared`, `independent`.
     * 
     */
    public Optional<Output<String>> yScale() {
        return Optional.ofNullable(this.yScale);
    }

    private PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs() {}

    private PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs(PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs $) {
        this.trendType = $.trendType;
        this.yScale = $.yScale;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs $;

        public Builder() {
            $ = new PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs();
        }

        public Builder(PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs defaults) {
            $ = new PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param trendType The type of trend line to display. Valid values are `area`, `line`, `bars`.
         * 
         * @return builder
         * 
         */
        public Builder trendType(@Nullable Output<String> trendType) {
            $.trendType = trendType;
            return this;
        }

        /**
         * @param trendType The type of trend line to display. Valid values are `area`, `line`, `bars`.
         * 
         * @return builder
         * 
         */
        public Builder trendType(String trendType) {
            return trendType(Output.of(trendType));
        }

        /**
         * @param yScale The scale of the y-axis. Valid values are `shared`, `independent`.
         * 
         * @return builder
         * 
         */
        public Builder yScale(@Nullable Output<String> yScale) {
            $.yScale = yScale;
            return this;
        }

        /**
         * @param yScale The scale of the y-axis. Valid values are `shared`, `independent`.
         * 
         * @return builder
         * 
         */
        public Builder yScale(String yScale) {
            return yScale(Output.of(yScale));
        }

        public PowerpackWidgetQueryTableDefinitionRequestFormulaCellDisplayModeOptionsArgs build() {
            return $;
        }
    }

}
