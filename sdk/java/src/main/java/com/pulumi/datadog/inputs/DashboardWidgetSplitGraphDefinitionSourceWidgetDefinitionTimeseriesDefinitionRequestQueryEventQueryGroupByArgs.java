// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupBySortArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs Empty = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs();

    /**
     * The facet name.
     * 
     */
    @Import(name="facet", required=true)
    private Output<String> facet;

    /**
     * @return The facet name.
     * 
     */
    public Output<String> facet() {
        return this.facet;
    }

    /**
     * The maximum number of items in the group.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return The maximum number of items in the group.
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * The options for sorting group by results.
     * 
     */
    @Import(name="sort")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupBySortArgs> sort;

    /**
     * @return The options for sorting group by results.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupBySortArgs>> sort() {
        return Optional.ofNullable(this.sort);
    }

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs() {}

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs $) {
        this.facet = $.facet;
        this.limit = $.limit;
        this.sort = $.sort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs $;

        public Builder() {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs();
        }

        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs defaults) {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param facet The facet name.
         * 
         * @return builder
         * 
         */
        public Builder facet(Output<String> facet) {
            $.facet = facet;
            return this;
        }

        /**
         * @param facet The facet name.
         * 
         * @return builder
         * 
         */
        public Builder facet(String facet) {
            return facet(Output.of(facet));
        }

        /**
         * @param limit The maximum number of items in the group.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit The maximum number of items in the group.
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param sort The options for sorting group by results.
         * 
         * @return builder
         * 
         */
        public Builder sort(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupBySortArgs> sort) {
            $.sort = sort;
            return this;
        }

        /**
         * @param sort The options for sorting group by results.
         * 
         * @return builder
         * 
         */
        public Builder sort(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupBySortArgs sort) {
            return sort(Output.of(sort));
        }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs build() {
            if ($.facet == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs", "facet");
            }
            return $;
        }
    }

}