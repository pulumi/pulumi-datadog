// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetDistributionDefinitionRequestSecurityQueryComputeQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetDistributionDefinitionRequestSecurityQueryGroupByArgs;
import com.pulumi.datadog.inputs.DashboardWidgetDistributionDefinitionRequestSecurityQueryMultiComputeArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs Empty = new DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs();

    /**
     * `compute_query` or `multi_compute` is required. The map keys are listed below.
     * 
     */
    @Import(name="computeQuery")
    private @Nullable Output<DashboardWidgetDistributionDefinitionRequestSecurityQueryComputeQueryArgs> computeQuery;

    /**
     * @return `compute_query` or `multi_compute` is required. The map keys are listed below.
     * 
     */
    public Optional<Output<DashboardWidgetDistributionDefinitionRequestSecurityQueryComputeQueryArgs>> computeQuery() {
        return Optional.ofNullable(this.computeQuery);
    }

    /**
     * Multiple `group_by` blocks are allowed using the structure below.
     * 
     */
    @Import(name="groupBies")
    private @Nullable Output<List<DashboardWidgetDistributionDefinitionRequestSecurityQueryGroupByArgs>> groupBies;

    /**
     * @return Multiple `group_by` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<DashboardWidgetDistributionDefinitionRequestSecurityQueryGroupByArgs>>> groupBies() {
        return Optional.ofNullable(this.groupBies);
    }

    /**
     * The name of the index to query.
     * 
     */
    @Import(name="index", required=true)
    private Output<String> index;

    /**
     * @return The name of the index to query.
     * 
     */
    public Output<String> index() {
        return this.index;
    }

    /**
     * `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
     * 
     */
    @Import(name="multiComputes")
    private @Nullable Output<List<DashboardWidgetDistributionDefinitionRequestSecurityQueryMultiComputeArgs>> multiComputes;

    /**
     * @return `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<DashboardWidgetDistributionDefinitionRequestSecurityQueryMultiComputeArgs>>> multiComputes() {
        return Optional.ofNullable(this.multiComputes);
    }

    /**
     * The search query to use.
     * 
     */
    @Import(name="searchQuery")
    private @Nullable Output<String> searchQuery;

    /**
     * @return The search query to use.
     * 
     */
    public Optional<Output<String>> searchQuery() {
        return Optional.ofNullable(this.searchQuery);
    }

    private DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs() {}

    private DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs(DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs $) {
        this.computeQuery = $.computeQuery;
        this.groupBies = $.groupBies;
        this.index = $.index;
        this.multiComputes = $.multiComputes;
        this.searchQuery = $.searchQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs();
        }

        public Builder(DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs defaults) {
            $ = new DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeQuery `compute_query` or `multi_compute` is required. The map keys are listed below.
         * 
         * @return builder
         * 
         */
        public Builder computeQuery(@Nullable Output<DashboardWidgetDistributionDefinitionRequestSecurityQueryComputeQueryArgs> computeQuery) {
            $.computeQuery = computeQuery;
            return this;
        }

        /**
         * @param computeQuery `compute_query` or `multi_compute` is required. The map keys are listed below.
         * 
         * @return builder
         * 
         */
        public Builder computeQuery(DashboardWidgetDistributionDefinitionRequestSecurityQueryComputeQueryArgs computeQuery) {
            return computeQuery(Output.of(computeQuery));
        }

        /**
         * @param groupBies Multiple `group_by` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(@Nullable Output<List<DashboardWidgetDistributionDefinitionRequestSecurityQueryGroupByArgs>> groupBies) {
            $.groupBies = groupBies;
            return this;
        }

        /**
         * @param groupBies Multiple `group_by` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(List<DashboardWidgetDistributionDefinitionRequestSecurityQueryGroupByArgs> groupBies) {
            return groupBies(Output.of(groupBies));
        }

        /**
         * @param groupBies Multiple `group_by` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(DashboardWidgetDistributionDefinitionRequestSecurityQueryGroupByArgs... groupBies) {
            return groupBies(List.of(groupBies));
        }

        /**
         * @param index The name of the index to query.
         * 
         * @return builder
         * 
         */
        public Builder index(Output<String> index) {
            $.index = index;
            return this;
        }

        /**
         * @param index The name of the index to query.
         * 
         * @return builder
         * 
         */
        public Builder index(String index) {
            return index(Output.of(index));
        }

        /**
         * @param multiComputes `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder multiComputes(@Nullable Output<List<DashboardWidgetDistributionDefinitionRequestSecurityQueryMultiComputeArgs>> multiComputes) {
            $.multiComputes = multiComputes;
            return this;
        }

        /**
         * @param multiComputes `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder multiComputes(List<DashboardWidgetDistributionDefinitionRequestSecurityQueryMultiComputeArgs> multiComputes) {
            return multiComputes(Output.of(multiComputes));
        }

        /**
         * @param multiComputes `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder multiComputes(DashboardWidgetDistributionDefinitionRequestSecurityQueryMultiComputeArgs... multiComputes) {
            return multiComputes(List.of(multiComputes));
        }

        /**
         * @param searchQuery The search query to use.
         * 
         * @return builder
         * 
         */
        public Builder searchQuery(@Nullable Output<String> searchQuery) {
            $.searchQuery = searchQuery;
            return this;
        }

        /**
         * @param searchQuery The search query to use.
         * 
         * @return builder
         * 
         */
        public Builder searchQuery(String searchQuery) {
            return searchQuery(Output.of(searchQuery));
        }

        public DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs build() {
            if ($.index == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetDistributionDefinitionRequestSecurityQueryArgs", "index");
            }
            return $;
        }
    }

}
