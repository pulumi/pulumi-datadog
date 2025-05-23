// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGeomapDefinitionRequestFormulaLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGeomapDefinitionRequestFormulaLimitArgs Empty = new DashboardWidgetGeomapDefinitionRequestFormulaLimitArgs();

    /**
     * The number of results to return.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return The number of results to return.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * The direction of the sort. Valid values are `asc`, `desc`. Defaults to `&#34;desc&#34;`.
     * 
     */
    @Import(name="order")
    private @Nullable Output<String> order;

    /**
     * @return The direction of the sort. Valid values are `asc`, `desc`. Defaults to `&#34;desc&#34;`.
     * 
     */
    public Optional<Output<String>> order() {
        return Optional.ofNullable(this.order);
    }

    private DashboardWidgetGeomapDefinitionRequestFormulaLimitArgs() {}

    private DashboardWidgetGeomapDefinitionRequestFormulaLimitArgs(DashboardWidgetGeomapDefinitionRequestFormulaLimitArgs $) {
        this.count = $.count;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGeomapDefinitionRequestFormulaLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGeomapDefinitionRequestFormulaLimitArgs $;

        public Builder() {
            $ = new DashboardWidgetGeomapDefinitionRequestFormulaLimitArgs();
        }

        public Builder(DashboardWidgetGeomapDefinitionRequestFormulaLimitArgs defaults) {
            $ = new DashboardWidgetGeomapDefinitionRequestFormulaLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count The number of results to return.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of results to return.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param order The direction of the sort. Valid values are `asc`, `desc`. Defaults to `&#34;desc&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<String> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order The direction of the sort. Valid values are `asc`, `desc`. Defaults to `&#34;desc&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder order(String order) {
            return order(Output.of(order));
        }

        public DashboardWidgetGeomapDefinitionRequestFormulaLimitArgs build() {
            return $;
        }
    }

}
