// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryComputeArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs Empty = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs();

    /**
     * The compute options.
     * 
     */
    @Import(name="computes", required=true)
    private Output<List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryComputeArgs>> computes;

    /**
     * @return The compute options.
     * 
     */
    public Output<List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryComputeArgs>> computes() {
        return this.computes;
    }

    /**
     * The data source for APM Dependency Stats queries. Valid values are `apm_dependency_stats`.
     * 
     */
    @Import(name="dataSource", required=true)
    private Output<String> dataSource;

    /**
     * @return The data source for APM Dependency Stats queries. Valid values are `apm_dependency_stats`.
     * 
     */
    public Output<String> dataSource() {
        return this.dataSource;
    }

    /**
     * Multiple `group_by` blocks are allowed using the structure below.
     * 
     */
    @Import(name="groupBies")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs>> groupBies;

    /**
     * @return Multiple `group_by` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs>>> groupBies() {
        return Optional.ofNullable(this.groupBies);
    }

    /**
     * An array of index names to query in the stream.
     * 
     */
    @Import(name="indexes")
    private @Nullable Output<List<String>> indexes;

    /**
     * @return An array of index names to query in the stream.
     * 
     */
    public Optional<Output<List<String>>> indexes() {
        return Optional.ofNullable(this.indexes);
    }

    /**
     * The name of the variable.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the variable.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The search options.
     * 
     */
    @Import(name="search")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs> search;

    /**
     * @return The search options.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs>> search() {
        return Optional.ofNullable(this.search);
    }

    /**
     * Storage location (private beta).
     * 
     */
    @Import(name="storage")
    private @Nullable Output<String> storage;

    /**
     * @return Storage location (private beta).
     * 
     */
    public Optional<Output<String>> storage() {
        return Optional.ofNullable(this.storage);
    }

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs() {}

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs $) {
        this.computes = $.computes;
        this.dataSource = $.dataSource;
        this.groupBies = $.groupBies;
        this.indexes = $.indexes;
        this.name = $.name;
        this.search = $.search;
        this.storage = $.storage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computes The compute options.
         * 
         * @return builder
         * 
         */
        public Builder computes(Output<List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryComputeArgs>> computes) {
            $.computes = computes;
            return this;
        }

        /**
         * @param computes The compute options.
         * 
         * @return builder
         * 
         */
        public Builder computes(List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryComputeArgs> computes) {
            return computes(Output.of(computes));
        }

        /**
         * @param computes The compute options.
         * 
         * @return builder
         * 
         */
        public Builder computes(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryComputeArgs... computes) {
            return computes(List.of(computes));
        }

        /**
         * @param dataSource The data source for APM Dependency Stats queries. Valid values are `apm_dependency_stats`.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(Output<String> dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        /**
         * @param dataSource The data source for APM Dependency Stats queries. Valid values are `apm_dependency_stats`.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(String dataSource) {
            return dataSource(Output.of(dataSource));
        }

        /**
         * @param groupBies Multiple `group_by` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs>> groupBies) {
            $.groupBies = groupBies;
            return this;
        }

        /**
         * @param groupBies Multiple `group_by` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs> groupBies) {
            return groupBies(Output.of(groupBies));
        }

        /**
         * @param groupBies Multiple `group_by` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryGroupByArgs... groupBies) {
            return groupBies(List.of(groupBies));
        }

        /**
         * @param indexes An array of index names to query in the stream.
         * 
         * @return builder
         * 
         */
        public Builder indexes(@Nullable Output<List<String>> indexes) {
            $.indexes = indexes;
            return this;
        }

        /**
         * @param indexes An array of index names to query in the stream.
         * 
         * @return builder
         * 
         */
        public Builder indexes(List<String> indexes) {
            return indexes(Output.of(indexes));
        }

        /**
         * @param indexes An array of index names to query in the stream.
         * 
         * @return builder
         * 
         */
        public Builder indexes(String... indexes) {
            return indexes(List.of(indexes));
        }

        /**
         * @param name The name of the variable.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the variable.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param search The search options.
         * 
         * @return builder
         * 
         */
        public Builder search(@Nullable Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs> search) {
            $.search = search;
            return this;
        }

        /**
         * @param search The search options.
         * 
         * @return builder
         * 
         */
        public Builder search(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs search) {
            return search(Output.of(search));
        }

        /**
         * @param storage Storage location (private beta).
         * 
         * @return builder
         * 
         */
        public Builder storage(@Nullable Output<String> storage) {
            $.storage = storage;
            return this;
        }

        /**
         * @param storage Storage location (private beta).
         * 
         * @return builder
         * 
         */
        public Builder storage(String storage) {
            return storage(Output.of(storage));
        }

        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs build() {
            if ($.computes == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs", "computes");
            }
            if ($.dataSource == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs", "dataSource");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQueryArgs", "name");
            }
            return $;
        }
    }

}