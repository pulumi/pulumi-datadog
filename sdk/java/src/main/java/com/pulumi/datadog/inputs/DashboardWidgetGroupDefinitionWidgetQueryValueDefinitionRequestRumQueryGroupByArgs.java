// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupBySortQueryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupByArgs Empty = new DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupByArgs();

    @Import(name="facet")
    private @Nullable Output<String> facet;

    public Optional<Output<String>> facet() {
        return Optional.ofNullable(this.facet);
    }

    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    @Import(name="sortQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupBySortQueryArgs> sortQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupBySortQueryArgs>> sortQuery() {
        return Optional.ofNullable(this.sortQuery);
    }

    private DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupByArgs() {}

    private DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupByArgs(DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupByArgs $) {
        this.facet = $.facet;
        this.limit = $.limit;
        this.sortQuery = $.sortQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupByArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupByArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupByArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupByArgs(Objects.requireNonNull(defaults));
        }

        public Builder facet(@Nullable Output<String> facet) {
            $.facet = facet;
            return this;
        }

        public Builder facet(String facet) {
            return facet(Output.of(facet));
        }

        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        public Builder sortQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupBySortQueryArgs> sortQuery) {
            $.sortQuery = sortQuery;
            return this;
        }

        public Builder sortQuery(DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupBySortQueryArgs sortQuery) {
            return sortQuery(Output.of(sortQuery));
        }

        public DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestRumQueryGroupByArgs build() {
            return $;
        }
    }

}