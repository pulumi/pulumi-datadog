// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupBySortQueryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupByArgs Empty = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupByArgs();

    /**
     * The facet name.
     * 
     */
    @Import(name="facet")
    private @Nullable Output<String> facet;

    /**
     * @return The facet name.
     * 
     */
    public Optional<Output<String>> facet() {
        return Optional.ofNullable(this.facet);
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
     * A list of exactly one element describing the sort query to use.
     * 
     */
    @Import(name="sortQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupBySortQueryArgs> sortQuery;

    /**
     * @return A list of exactly one element describing the sort query to use.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupBySortQueryArgs>> sortQuery() {
        return Optional.ofNullable(this.sortQuery);
    }

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupByArgs() {}

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupByArgs(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupByArgs $) {
        this.facet = $.facet;
        this.limit = $.limit;
        this.sortQuery = $.sortQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupByArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupByArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupByArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupByArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param facet The facet name.
         * 
         * @return builder
         * 
         */
        public Builder facet(@Nullable Output<String> facet) {
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
         * @param sortQuery A list of exactly one element describing the sort query to use.
         * 
         * @return builder
         * 
         */
        public Builder sortQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupBySortQueryArgs> sortQuery) {
            $.sortQuery = sortQuery;
            return this;
        }

        /**
         * @param sortQuery A list of exactly one element describing the sort query to use.
         * 
         * @return builder
         * 
         */
        public Builder sortQuery(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupBySortQueryArgs sortQuery) {
            return sortQuery(Output.of(sortQuery));
        }

        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQueryGroupByArgs build() {
            return $;
        }
    }

}