// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs Empty = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs();

    /**
     * How the marker lines are displayed, options are one of {`error`, `warning`, `info`, `ok`} combined with one of {`dashed`, `solid`, `bold`}. Example: `error dashed`.
     * 
     */
    @Import(name="displayType")
    private @Nullable Output<String> displayType;

    /**
     * @return How the marker lines are displayed, options are one of {`error`, `warning`, `info`, `ok`} combined with one of {`dashed`, `solid`, `bold`}. Example: `error dashed`.
     * 
     */
    public Optional<Output<String>> displayType() {
        return Optional.ofNullable(this.displayType);
    }

    /**
     * The label for the custom link URL.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The label for the custom link URL.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The value that should be assumed by the template variable in this preset. Cannot be used in conjunction with `values`. **Deprecated.** Use `values` instead.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value that should be assumed by the template variable in this preset. Cannot be used in conjunction with `values`. **Deprecated.** Use `values` instead.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs() {}

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs $) {
        this.displayType = $.displayType;
        this.label = $.label;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayType How the marker lines are displayed, options are one of {`error`, `warning`, `info`, `ok`} combined with one of {`dashed`, `solid`, `bold`}. Example: `error dashed`.
         * 
         * @return builder
         * 
         */
        public Builder displayType(@Nullable Output<String> displayType) {
            $.displayType = displayType;
            return this;
        }

        /**
         * @param displayType How the marker lines are displayed, options are one of {`error`, `warning`, `info`, `ok`} combined with one of {`dashed`, `solid`, `bold`}. Example: `error dashed`.
         * 
         * @return builder
         * 
         */
        public Builder displayType(String displayType) {
            return displayType(Output.of(displayType));
        }

        /**
         * @param label The label for the custom link URL.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label for the custom link URL.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param value The value that should be assumed by the template variable in this preset. Cannot be used in conjunction with `values`. **Deprecated.** Use `values` instead.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value that should be assumed by the template variable in this preset. Cannot be used in conjunction with `values`. **Deprecated.** Use `values` instead.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionMarkerArgs", "value");
            }
            return $;
        }
    }

}